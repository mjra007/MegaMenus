package de.dosmike.sponge.megamenus.compat.webApi;

import valandur.webapi.cache.player.CachedPlayer;
import valandur.webapi.servlet.base.Permission;
import valandur.webapi.shadow.io.swagger.annotations.Api;
import valandur.webapi.shadow.io.swagger.annotations.ApiOperation;
import valandur.webapi.shadow.io.swagger.models.Response;
import valandur.webapi.shadow.javax.ws.rs.GET;
import valandur.webapi.shadow.javax.ws.rs.POST;
import valandur.webapi.shadow.javax.ws.rs.PUT;
import valandur.webapi.shadow.javax.ws.rs.DELETE;
import valandur.webapi.shadow.javax.ws.rs.Path;
import valandur.webapi.shadow.javax.ws.rs.Produces;
import valandur.webapi.shadow.javax.ws.rs.PathParam;

import java.util.Collection;
import java.util.Collections;
import java.util.UUID;

@Path("megamenus")
@Api(value = "Create interactive menus for your players",
    tags = {"Menu", "Inventory", "UI", "MegaMenus"})
@Produces()
public class MenuServlet {

    //region menu
    @GET
    @Path("/menu")
    @Permission({"megamenus","menu","list"})
    @ApiOperation(value = "List menus", notes = "Returns a list of all menus")
    public Collection<Menu> listMenus() {
        return Collections.EMPTY_SET;
    }

    @POST
    @Path("/menu")
    @Permission({"megamenus","menu","create"})
    @ApiOperation(value = "Create menu", notes = "Creates a new menu")
    public Response createMenu() {
        return null;
    }

    @GET
    @Path("/menu/{mid}")
    @Permission({"megamenus","menu","get"})
    @ApiOperation(value = "Get menu", notes = "Read a menu with all elements")
    public Menu getMenu(@PathParam("mid") UUID mid)  {
        return null;
    }

    @PUT
    @Path("/menu/{mid}")
    @Permission({"megamenus","menu","update"})
    @ApiOperation(value = "Update menu", notes = "Update a menu title")
    public Menu setMenu(@PathParam("mid") UUID mid, Menu newMenu)  {
        return null;
    }

    @DELETE
    @Path("/menu/{mid}")
    @Permission({"megamenus","menu","delete"})
    @ApiOperation(value = "Delete menu", notes = "Deletes a menu")
    public Menu deleteMenu(@PathParam("mid") UUID mid)  {
        return null;
    }
    //endregion

    //region element
    @POST
    @Path("/menu/{mid}")
    @Permission({"megamenus","menu","edit"})
    @ApiOperation(value = "Add element", notes = "Adds an element to the menu")
    public Response addElement() {
        return null;
    }

    @GET
    @Path("/menu/{mid}/{page}/{x}/{y}")
    @Permission({"megamenus","menu","edit"})
    @ApiOperation(value = "Get menu", notes = "Read a menu with all elements")
    public Element getElement(@PathParam("mid") UUID mid, @PathParam("page") int page, @PathParam("x") int x, @PathParam("y") int y)  {
        return null;
    }

    @PUT
    @Path("/menu/{mid}/{page}/{x}/{y}")
    @Permission({"megamenus","menu","edit"})
    @ApiOperation(value = "Update menu", notes = "Update a menu element")
    public Element setElement(@PathParam("mid") UUID mid, @PathParam("page") int page, @PathParam("x") int x, @PathParam("y") int y, Element newMenu)  {
        return null;
    }

    @DELETE
    @Path("/menu/{mid}/{page}/{x}/{y}")
    @Permission({"megamenus","menu","edit"})
    @ApiOperation(value = "Delete menu", notes = "Deletes a menu element")
    public Element deleteElement(@PathParam("mid") UUID mid, @PathParam("page") int page, @PathParam("x") int x, @PathParam("y") int y)  {
        return null;
    }
    //endregion

    //region renderer
    @GET
    @Path("/renderer")
    @Permission({"megamenus","renderer","list"})
    @ApiOperation(value = "List renderer", notes = "Returns a list of all renderer")
    public Collection<Renderer> listRenderer() {
        return Collections.EMPTY_SET;
    }

    @POST
    @Path("/renderer/{mid}")
    @Permission({"megamenus","renderer","create"})
    @ApiOperation(value = "Create menu", notes = "Creates a new menu")
    public Response createRenderer(@PathParam("mid") UUID menuID, int pageHeight, boolean bound) {
        /** a bound renderer will copy the menu, this the menuID will not apply to the bound renderer
         * making dynamic changes not possible. Does this concern? */
        return null;
    }

    @GET
    @Path("/renderer/{mid}")
    @Permission({"megamenus","renderer","get"})
    @ApiOperation(value = "Get all renderer for the menu", notes = "Returns all renderer currently present for this menu")
    public Collection<Renderer> getRenderer(@PathParam("mid") UUID mid)  {
        return null;
    }
    @GET
    @Path("/renderer/{viewer}")
    @Permission({"megamenus","renderer","get"})
    @ApiOperation(value = "Get the renderer for viewer", notes = "Returns the renderer the viewer is currently subject to")
    public Renderer gerRenderer(@PathParam("viewer") CachedPlayer viewer)  {
        return null;
    }

    @PUT
    @Path("/renderer/{rid}/{viewer}")
    @Permission({"megamenus","renderer","open"})
    @ApiOperation(value = "Open renderer", notes = "Opens the renderer to viewer, effectively opening the menu")
    public Renderer openRenderer(@PathParam("mid") UUID mid)  {
        return null;
    }

    @DELETE
    @Path("/renderer/{rid}/{viewer}")
    @Permission({"megamenus","renderer","close"})
    @ApiOperation(value = "Close renderer", notes = "Close the renderer for this viewer")
    public Renderer closeRenderer(@PathParam("mid") UUID mid)  {
        return null;
    }

    @DELETE
    @Path("/renderer/{mid}")
    @Permission({"megamenus","renderer","close"})
    @ApiOperation(value = "Delete menu", notes = "Closes this renderer for all currently active viewers")
    public Renderer deleteRenderer(@PathParam("mid") UUID mid)  {
        return null;
    }
    //endregion
}
package controller.site.admin.api;

import controller.BaseRoutes;
import dao.Factory;

import java.util.logging.Level;
import java.util.logging.Logger;

import static spark.Spark.post;

/**
 * Created by Lantiets on 12.05.2017.
 */
public class TrueCystApi extends BaseRoutes {
    private static Logger log = Logger.getLogger(TrueCystApi.class.getName());

    private final String ROOT = "/admin/api/";

    @Override
    public void routes() {
//        post(ROOT+"groups.post", (request, response) -> {
//            String pacient = request.queryParams("pacient");
//            try {
////                Groups addGroups = new Groups(pacient);
//                response.redirect(ROOT.substring(0,7) + "groups?type=edit");
//                return Factory.getInstance().getGenericRepositoryInterface().addObject(addGroups);
//            } catch (Exception e) {
//                log.log(Level.SEVERE, "Exception: ", e);
//                return e;
//            }
//        });
//
//        post(ROOT+"groups.delete", (request, response) -> {
//            String a = request.queryParams("groups_name");
//            try {
//                response.redirect(ROOT.substring(0,7) + "groups?type=edit");
////                Groups groups = Groups.class.cast(Factory.getInstance().getGenericRepositoryInterface(Groups.class).getObject("groupsName", a));
////                return Factory.getInstance().getGenericRepositoryInterface().removeObject(groups);
//            }catch (Exception e){
//                log.log(Level.SEVERE, "Exception: ", e);
//                return e;
//            }
//        });
    }
}
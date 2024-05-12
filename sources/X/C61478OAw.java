package X;

import android.content.Context;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.OAw, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61478OAw extends AbstractC61480OAy {
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        Context context;
        InterfaceC61479OAx interfaceC61479OAx = (InterfaceC61479OAx) xBaseParamModel;
        o.LJIIIZ(type, "type");
        List<String> descriptionList = interfaceC61479OAx.getDescriptionList();
        List<Object> images = interfaceC61479OAx.getImages();
        Number index = interfaceC61479OAx.getIndex();
        interfaceC61479OAx.getLoop();
        interfaceC61479OAx.getNeedDownload();
        interfaceC61479OAx.getOpenType();
        interfaceC61479OAx.getStyle();
        Iterator<String> it = descriptionList.iterator();
        while (it.hasNext()) {
            it.next();
        }
        Iterator<Object> it2 = images.iterator();
        while (it2.hasNext()) {
            it2.next();
        }
        InterfaceC38263Ezz interfaceC38263Ezz = this.LJLIL;
        if (interfaceC38263Ezz != null) {
            context = interfaceC38263Ezz.getContext();
        } else {
            context = null;
        }
        InterfaceC61481OAz interfaceC61481OAz = (InterfaceC61481OAz) ED5.LIZJ(InterfaceC61481OAz.class, null);
        SmartRoute buildRoute = SmartRouter.buildRoute(context, "aweme://poi/gallery");
        buildRoute.withParamStringList("poi_gallery_images", (ArrayList) images);
        buildRoute.withParam("poi_gallery_index", index);
        buildRoute.open();
        interfaceC61481OAz.setCode(1);
        c37356ElM.onSuccess(interfaceC61481OAz, "");
    }
}

package X;

import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.ss.android.ugc.feed.platform.cell.BaseCellPlaceHolderComponent;
import com.ss.android.ugc.feed.platform.container.core.BaseContainer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* renamed from: X.8K0, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8K0 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(BaseContainer baseContainer) {
        int i;
        AssemSupervisor LIZJ = C212428Vi.LIZJ(baseContainer);
        JSONObject LIZJ2 = C65232Piu.LIZJ(WM7.SCENE_SERVICE, baseContainer.rp0().eventType);
        LIZJ2.put("type", baseContainer.c4().name());
        LIZJ2.put("status", 1);
        if (LIZJ != null) {
            i = ((ArrayList) LIZJ.LIZIZ()).size();
        } else {
            i = 0;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("count", i);
        C09900aA.LJI("interact_component_load", LIZJ2, jSONObject, null);
    }

    public static void LIZIZ(BaseContainer baseContainer) {
        List<ReusedUIAssem<? extends C3C8>> list = C8LZ.LIZIZ;
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (!(next instanceof BaseCellPlaceHolderComponent)) {
                arrayList.add(next);
            }
        }
        int size = arrayList.size();
        JSONObject LIZJ = C65232Piu.LIZJ(WM7.SCENE_SERVICE, baseContainer.rp0().eventType);
        LIZJ.put("type", baseContainer.c4().name());
        LIZJ.put("status", 0);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("count", size);
        C09900aA.LJI("interact_component_load", LIZJ, jSONObject, null);
    }
}

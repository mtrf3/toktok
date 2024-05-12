package X;

import android.content.Context;
import com.ss.android.ugc.tiktok.location.serviceimpl.LocationServiceImpl;
import com.ss.android.ugc.tiktok.location_api.service.Config;
import com.ss.android.ugc.tiktok.location_api.service.PopupSceneV2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Xd6, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85256Xd6 {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ() {
        List<PopupSceneV2> list;
        C85296Xdk.LIZ.getClass();
        Config LIZ2 = C85296Xdk.LIZ("poi");
        ArrayList arrayList = new ArrayList();
        if (LIZ2 != null && (list = LIZ2.popupSceneV2) != null) {
            Iterator<PopupSceneV2> it = list.iterator();
            while (it.hasNext()) {
                String str = it.next().scene;
                if (str != null) {
                    arrayList.add(str);
                }
            }
        }
        return !arrayList.isEmpty();
    }

    public static boolean LIZIZ(Context context) {
        o.LJIIIZ(context, "context");
        return LocationServiceImpl.LJIJJ().LJIILLIIL(0, context);
    }
}

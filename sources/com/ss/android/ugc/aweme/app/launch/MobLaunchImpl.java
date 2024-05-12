package com.ss.android.ugc.aweme.app.launch;

import X.C141335gf;
import X.C16880lQ;
import X.C188727au;
import X.C38814FLe;
import X.C3C5;
import X.FMX;
import X.FWS;
import X.FWU;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.launcher.service.mob.IMobLaunchApi;
import com.ss.android.ugc.aweme.legoImp.task.AssemInitTask;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class MobLaunchImpl implements IMobLaunchApi {
    @Override // com.ss.android.ugc.aweme.launcher.service.mob.IMobLaunchApi
    public final void LIZ(boolean z) {
        FWU.LIZ = z;
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.mob.IMobLaunchApi
    public final void LIZJ(String str) {
        C38814FLe c38814FLe;
        if (str == null) {
            return;
        }
        try {
            CopyOnWriteArraySet<C38814FLe> copyOnWriteArraySet = AssemInitTask.LJLILLLLZI;
            Iterator<C38814FLe> it = copyOnWriteArraySet.iterator();
            while (true) {
                c38814FLe = null;
                if (!it.hasNext()) {
                    break;
                }
                C38814FLe next = it.next();
                next.getClass();
                if (o.LJ(null, str)) {
                    c38814FLe = next;
                    break;
                }
            }
            C3C5.m7constructorimpl(Boolean.valueOf(copyOnWriteArraySet.remove(c38814FLe)));
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.mob.IMobLaunchApi
    public final void LIZIZ(Uri uri, String str, boolean z) {
        String str2;
        if (uri != null) {
            str2 = UriProtector.getQueryParameter(uri, "gd_label");
        } else {
            str2 = null;
        }
        FWS.LIZ().LIZIZ = false;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("land_position", str);
            MobClick obtain = MobClick.obtain();
            obtain.setEventName("launch_app");
            obtain.setLabelName(str2);
            obtain.setJsonObject(jSONObject);
            FMX.onEvent(obtain);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        if (FWU.LIZ) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_to", str);
            c188727au.LJIIIZ("url", String.valueOf(uri));
            FMX.LJIIL("open_url", c188727au.LIZ);
            FWU.LIZ = false;
        }
    }
}

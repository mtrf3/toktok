package X;

import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import com.bytedance.router.SmartRoute;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpPreviewInfo;
import com.ss.android.ugc.aweme.ecommerce.slark.impl.TrackNodeStore;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Rmp, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC70571Rmp {
    public Object LIZ;
    public Object LIZIZ;

    public abstract java.util.Map LIZIZ();

    public java.util.Map LIZ() {
        return new LinkedHashMap();
    }

    public /* synthetic */ AbstractC70571Rmp() {
    }

    public final void LIZJ(View fromView) {
        String str;
        String str2;
        o.LJIIIZ(fromView, "fromView");
        if (this.LIZIZ != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(((PdpPreviewInfo) this.LIZIZ).id);
            LIZ.append('_');
            LIZ.append(SystemClock.elapsedRealtime());
            str = X1D.LIZIZ(LIZ);
        } else {
            str = null;
        }
        java.util.Map LIZ2 = LIZ();
        java.util.Map LIZIZ = LIZIZ();
        if (LIZIZ != null) {
            LIZ2.put("trackParams", LIZIZ);
        }
        if (str != null) {
            Context context = fromView.getContext();
            o.LJIIIIZZ(context, "fromView.context");
            InterfaceC32666Cru LIZ3 = C72264SXs.LIZ(context);
            Object obj = this.LIZIZ;
            if (obj != null) {
                str2 = C27739Aud.LJI(obj);
            } else {
                str2 = null;
            }
            LIZ3.LJIIIIZZ(str2, str);
            LIZ2.put("pdp_cache_key", str);
        }
        Context context2 = fromView.getContext();
        o.LJIIIIZZ(context2, "fromView.context");
        SmartRoute LIZIZ2 = C26867AgZ.LIZIZ(context2, (String) this.LIZ, LIZ2, false);
        if (fromView.getParent() == null) {
            C78983UzD.LJIILL("slark, view.parent is null");
        }
        LIZIZ2.withParam("lib_track_rtn_id", TrackNodeStore.LJ(fromView, null).LJLIL);
        LIZIZ2.open();
    }

    public /* synthetic */ AbstractC70571Rmp(String str, PdpPreviewInfo pdpPreviewInfo) {
        this.LIZ = str;
        this.LIZIZ = pdpPreviewInfo;
    }
}

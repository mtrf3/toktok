package X;

import android.app.Activity;
import android.view.WindowManager;
import com.ss.android.ugc.aweme.ecommerce.base.osp.starter.OrderSubmitRequestParam;
import java.util.HashMap;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* renamed from: X.AwD, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27837AwD {
    public final Activity LIZ;
    public final String LIZIZ;
    public OrderSubmitRequestParam LIZJ;
    public HashMap<String, Object> LIZLLL;
    public String LJ;
    public String LJFF;
    public String LJI;
    public int LJII;
    public final C62822Ol8 LJIIIIZZ;
    public final C62822Ol8 LJIIIZ;

    public final void LIZ() {
        WindowManager windowManager;
        Activity activity = this.LIZ;
        if ((activity == null || !activity.isDestroyed()) && (windowManager = (WindowManager) this.LJIIIIZZ.getValue()) != null) {
            C223338pd LIZIZ = LIZIZ();
            C51639KOl.LIZIZ(new Object[]{LIZIZ});
            windowManager.removeView(LIZIZ);
        }
    }

    public final C223338pd LIZIZ() {
        return (C223338pd) this.LJIIIZ.getValue();
    }

    public C27837AwD(Activity activity, String nodeId) {
        o.LJIIIZ(nodeId, "nodeId");
        this.LIZ = activity;
        this.LIZIZ = nodeId;
        this.LIZLLL = new HashMap<>();
        this.LJ = "-1";
        this.LJI = "";
        this.LJIIIIZZ = C221108m2.LIZIZ(new AqS154S0100000_4(this, 1149));
        this.LJIIIZ = C221108m2.LIZIZ(new AqS154S0100000_4(this, 1148));
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0296  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(android.content.Intent r40, java.lang.String r41, java.lang.Boolean r42) {
        /*
            Method dump skipped, instructions count: 702
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27837AwD.LIZJ(android.content.Intent, java.lang.String, java.lang.Boolean):void");
    }
}

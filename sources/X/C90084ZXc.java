package X;

import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.text.TextUtils;
import android.util.ArrayMap;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.ZXc, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public class C90084ZXc extends MediaRouter2.TransferCallback {
    public final /* synthetic */ C90597Zh3 LIZ;

    @Override // android.media.MediaRouter2.TransferCallback
    public final void onTransferFailure(MediaRoute2Info mediaRoute2Info) {
    }

    public C90084ZXc(C90597Zh3 c90597Zh3) {
        this.LIZ = c90597Zh3;
    }

    @Override // android.media.MediaRouter2.TransferCallback
    public final void onStop(MediaRouter2.RoutingController routingController) {
        ZY4 LIZJ;
        Object remove = ((ArrayMap) this.LIZ.LJLLI).remove(routingController);
        if (remove != null) {
            C90603Zh9 c90603Zh9 = (C90603Zh9) this.LIZ.LJLL;
            C90605ZhB c90605ZhB = c90603Zh9.LIZ;
            if (remove == c90605ZhB.LJIIZILJ && c90603Zh9.LIZ.LJFF() != (LIZJ = c90605ZhB.LIZJ())) {
                c90603Zh9.LIZ.LJIIIZ(LIZJ, 2);
            }
        }
    }

    @Override // android.media.MediaRouter2.TransferCallback
    public final void onTransfer(MediaRouter2.RoutingController routingController, MediaRouter2.RoutingController routingController2) {
        ((ArrayMap) this.LIZ.LJLLI).remove(routingController);
        if (routingController2 == this.LIZ.LJLJLLL.getSystemController()) {
            C90603Zh9 c90603Zh9 = (C90603Zh9) this.LIZ.LJLL;
            ZY4 LIZJ = c90603Zh9.LIZ.LIZJ();
            if (c90603Zh9.LIZ.LJFF() != LIZJ) {
                c90603Zh9.LIZ.LJIIIZ(LIZJ, 3);
                return;
            }
            return;
        }
        List<MediaRoute2Info> selectedRoutes = routingController2.getSelectedRoutes();
        if (selectedRoutes.isEmpty()) {
            return;
        }
        String id = ((MediaRoute2Info) ListProtector.get(selectedRoutes, 0)).getId();
        ((ArrayMap) this.LIZ.LJLLI).put(routingController2, new C90865ZlN(this.LIZ, routingController2, id));
        C90603Zh9 c90603Zh92 = (C90603Zh9) this.LIZ.LJLL;
        Iterator<ZY4> it = c90603Zh92.LIZ.LJ.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ZY4 next = it.next();
            if (next.LIZJ() == c90603Zh92.LIZ.LIZJ && TextUtils.equals(id, next.LIZIZ)) {
                c90603Zh92.LIZ.LJIIIZ(next, 3);
                break;
            }
        }
        this.LIZ.LJIJI(routingController2);
    }
}

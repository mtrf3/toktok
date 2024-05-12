package X;

import androidx.fragment.app.Fragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notification.vm.BaseNotificationVM;
import com.ss.android.ugc.aweme.notification.vm.NotificationVM;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.MPi, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56758MPi implements InterfaceC56881MUb {
    public final /* synthetic */ C56759MPj LIZ;

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
    
        if (r0 != null) goto L11;
     */
    @Override // X.InterfaceC56881MUb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ() {
        /*
            r4 = this;
            X.MPj r0 = r4.LIZ
            X.5H3 r0 = r0.LJLJI
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.notification.vm.NotificationVM r0 = (com.ss.android.ugc.aweme.notification.vm.NotificationVM) r0
            X.MPh r3 = r0.hv0()
            boolean r0 = r3 instanceof X.MP2
            r2 = 0
            if (r0 == 0) goto L47
            X.MP2 r3 = (X.MP2) r3
            if (r3 == 0) goto L29
            X.Ol8 r0 = r3.LJIIIZ
            java.lang.Object r0 = r0.getValue()
            androidx.lifecycle.LiveData r0 = (androidx.lifecycle.LiveData) r0
            if (r0 == 0) goto L29
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 != 0) goto L2b
        L29:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
        L2b:
            boolean r1 = r0.booleanValue()
            if (r3 == 0) goto L35
            r0 = 1
            r3.LJIILIIL(r0)
        L35:
            X.MPj r0 = r4.LIZ
            X.5H3 r0 = r0.LJLJI
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.notification.vm.BaseNotificationVM r0 = (com.ss.android.ugc.aweme.notification.vm.BaseNotificationVM) r0
            java.lang.String r0 = r0.iN()
            X.C56760MPk.LJIILIIL(r0, r2, r1)
            return
        L47:
            r3 = r2
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56758MPi.LIZ():void");
    }

    @Override // X.InterfaceC56881MUb
    public final MSP LIZIZ() {
        MSP msp = this.LIZ.LJLILLLLZI;
        if (msp != null) {
            return msp;
        }
        o.LJIJI("turnOnQAListener");
        throw null;
    }

    @Override // X.InterfaceC56881MUb
    public final InterfaceC56771MPv LIZJ() {
        return (BaseNotificationVM) this.LIZ.LJLJI.getValue();
    }

    @Override // X.InterfaceC56881MUb
    public final List<MusNotice> getData() {
        return this.LIZ.getData();
    }

    @Override // X.InterfaceC56881MUb
    public final Fragment getFragment() {
        return this.LIZ.LJLIL;
    }

    public C56758MPi(C56759MPj c56759MPj) {
        this.LIZ = c56759MPj;
    }

    @Override // X.InterfaceC56881MUb
    public final void LIZLLL(int i) {
        Integer num;
        C56757MPh hv0 = ((NotificationVM) this.LIZ.LJLJI.getValue()).hv0();
        List<MusNotice> value = hv0.LJI().getValue();
        if (value == null || value.isEmpty() || i < 0 || i >= value.size()) {
            StringBuilder LJ = C7MY.LJ("deleteData but position invalid:", i, ", ");
            if (value != null) {
                num = Integer.valueOf(value.size());
            } else {
                num = null;
            }
            LJ.append(num);
            C221018lt.LIZIZ("NotificationModel", X1D.LIZIZ(LJ));
            return;
        }
        hv0.LIZIZ((MusNotice) ListProtector.get(value, i));
    }
}

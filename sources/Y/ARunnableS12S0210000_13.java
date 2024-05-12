package Y;

import X.C31012CFc;
import X.C76762UAs;
import X.InterfaceC30237Btp;
import X.InterfaceC76622U5i;
import X.U4R;
import X.U66;
import X.U7T;
import X.UC0;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import com.bytedance.android.livesdk.comp.api.linkcore.model.P2PGroupChangeMessage;
import com.bytedance.android.livesdk.model.message.linkcore.LinkLayerMessage;
import com.ss.ugc.live.sdk.message.data.IMessage;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class ARunnableS12S0210000_13 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        ((Runnable) this.l0).run();
        if (((InterfaceC30237Btp) this.l1).getVisibility() == 0) {
            if (this.z2) {
                ObjectAnimator.ofFloat(((InterfaceC30237Btp) this.l1).LJFF(), (Property<View, Float>) View.ALPHA, 0.0f, 1.0f).setDuration(200L).start();
                return;
            }
            View LJFF = ((InterfaceC30237Btp) this.l1).LJFF();
            if (LJFF == null) {
                return;
            }
            LJFF.setAlpha(1.0f);
        }
    }

    public final void LIZ$1() {
        U4R.LIZLLL("Linker", "P2PGroupChangeMessage callback for business.");
        CopyOnWriteArrayList<InterfaceC76622U5i> copyOnWriteArrayList = ((U7T) this.l0).LJII;
        IMessage iMessage = (IMessage) this.l1;
        boolean z = this.z2;
        Iterator<InterfaceC76622U5i> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            LinkLayerMessage linkLayerMessage = (LinkLayerMessage) iMessage;
            it.next().LLILLJJLI(new P2PGroupChangeMessage(linkLayerMessage, linkLayerMessage.bizContent), z);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$2() {
        /*
            r5 = this;
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            boolean r0 = r5.z2
            if (r0 != 0) goto L8f
            com.bytedance.android.live.liveinteract.multiguestv3.service.IMultiGuestV3InternalServiceV2 r0 = X.C8E.LJ()
            X.TlP r0 = X.C78886Uxe.LJJJIL(r0)
            r1 = 0
            if (r0 == 0) goto L20
            X.U8H r0 = (X.U8H) r0
            X.U8e r0 = r0.LJJIII()
            if (r0 == 0) goto L20
            java.lang.String r1 = r0.getLayoutBusinessType()
        L20:
            X.Tbv r0 = X.EnumC74991Tbv.FLOAT
            java.lang.String r0 = r0.getBusinessType()
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 != 0) goto L38
            X.Tbv r0 = X.EnumC74991Tbv.FLOAT_FIX
            java.lang.String r0 = r0.getBusinessType()
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L78
        L38:
            com.bytedance.android.live.liveinteract.multiguestv3.service.IMultiGuestV3InternalServiceV2 r0 = X.C8E.LJ()
            X.TlP r0 = X.C78886Uxe.LJJJIL(r0)
            if (r0 == 0) goto L78
            X.U8H r0 = (X.U8H) r0
            X.U8e r0 = r0.LJJIII()
            if (r0 == 0) goto L78
            java.util.List r0 = r0.getAllLayoutWindows()
            if (r0 == 0) goto L78
            java.util.Iterator r3 = r0.iterator()
        L54:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L78
            java.lang.Object r1 = r3.next()
            X.Tex r1 = (X.InterfaceC75179Tex) r1
            boolean r0 = r1.LJLJI()
            if (r0 != 0) goto L54
            android.widget.FrameLayout r0 = r1.LJJIJIL()
            int r0 = r0.getChildCount()
            if (r0 == 0) goto L54
            android.graphics.Rect r0 = r1.LLLILZLLLI()
            r2.add(r0)
            goto L54
        L78:
            java.lang.Object r0 = r5.l0
            java.lang.Float r0 = (java.lang.Float) r0
            if (r0 == 0) goto L83
            float r4 = r0.floatValue()
            goto L90
        L83:
            java.lang.Object r0 = r5.l1
            com.bytedance.android.live.liveinteract.multiguestv3.main.mask.WindowMaskAssem r0 = (com.bytedance.android.live.liveinteract.multiguestv3.main.mask.WindowMaskAssem) r0
            X.TUd r3 = r0.O3()
            boolean r0 = r3.LJLJJL
            if (r0 != 0) goto Lc0
        L8f:
            r4 = 0
        L90:
            com.bytedance.ies.sdk.datachannel.DataChannelGlobal r3 = com.bytedance.ies.sdk.datachannel.DataChannelGlobal.LJLJJI
            if (r3 == 0) goto L9e
            java.lang.Class<com.bytedance.android.live.linkmic.LivePublicScreenClipChannel> r1 = com.bytedance.android.live.linkmic.LivePublicScreenClipChannel.class
            X.0hf r0 = new X.0hf
            r0.<init>(r2, r4)
            r3.tv0(r1, r0)
        L9e:
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "sendclipevent => "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " , size = "
            r1.append(r0)
            int r0 = r2.size()
            r1.append(r0)
            java.lang.String r1 = X.X1D.LIZIZ(r1)
            java.lang.String r0 = "maskhollow"
            X.C0NB.LIZIZ(r0, r1)
            return
        Lc0:
            com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting r1 = com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting.INSTANCE
            boolean r0 = r3.LJLIL
            boolean r0 = r1.isV0(r0)
            if (r0 == 0) goto Lcb
            goto L8f
        Lcb:
            X.Tl5 r0 = X.C75559Tl5.LIZIZ
            java.util.HashMap r1 = r0.LIZJ()
            java.lang.String r0 = "ZOOM_SERVICE"
            java.lang.Object r1 = r1.get(r0)
            boolean r0 = r1 instanceof com.bytedance.android.live.liveinteract.multiguestv3.main.zoom.ZoomService
            if (r0 == 0) goto Le7
            com.bytedance.android.live.liveinteract.multiguestv3.main.zoom.ZoomService r1 = (com.bytedance.android.live.liveinteract.multiguestv3.main.zoom.ZoomService) r1
            if (r1 == 0) goto Le7
            boolean r1 = r1.LIZJ()
            r0 = 1
            if (r1 != r0) goto Le7
            goto L8f
        Le7:
            X.TWk r1 = X.C59994Ngc.LIZJ()
            X.TWk r0 = X.EnumC74778TWk.FLOATING
            if (r1 == r0) goto Lf1
            goto L8f
        Lf1:
            float r4 = r3.LJI()
            goto L90
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS12S0210000_13.LIZ$2():void");
    }

    public static final void run$0(ARunnableS12S0210000_13 aRunnableS12S0210000_13) {
        boolean LIZ;
        try {
            aRunnableS12S0210000_13.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS12S0210000_13 aRunnableS12S0210000_13) {
        boolean LIZ;
        try {
            aRunnableS12S0210000_13.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS12S0210000_13 aRunnableS12S0210000_13) {
        boolean LIZ;
        try {
            aRunnableS12S0210000_13.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS12S0210000_13 aRunnableS12S0210000_13) {
        boolean LIZ;
        try {
            JSONObject LJIJI = UC0.LJIJI((U66) aRunnableS12S0210000_13.l0);
            long LIZIZ = C31012CFc.LIZIZ();
            long currentTimeMillis = System.currentTimeMillis();
            C76762UAs c76762UAs = (C76762UAs) aRunnableS12S0210000_13.l1;
            c76762UAs.LIZLLL.LIZIZ(new ARunnableS0S0310200_13(c76762UAs, (U66) aRunnableS12S0210000_13.l0, LIZIZ, currentTimeMillis, LJIJI, aRunnableS12S0210000_13.z2, 0));
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS12S0210000_13 aRunnableS12S0210000_13) {
        boolean LIZ;
        try {
            JSONObject LJIJI = UC0.LJIJI((U66) aRunnableS12S0210000_13.l0);
            long LIZIZ = C31012CFc.LIZIZ();
            long currentTimeMillis = System.currentTimeMillis();
            C76762UAs c76762UAs = (C76762UAs) aRunnableS12S0210000_13.l1;
            c76762UAs.LIZLLL.LIZIZ(new ARunnableS0S0310200_13(c76762UAs, (U66) aRunnableS12S0210000_13.l0, LIZIZ, currentTimeMillis, LJIJI, aRunnableS12S0210000_13.z2, 2));
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS12S0210000_13(Object obj, Object obj2, boolean z, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.z2 = z;
    }
}

package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C28851Bh;
import X.C28861Bi;
import X.C76800UCe;
import X.C81539VzL;
import X.C83477WpV;
import X.C83489Wph;
import X.C83738Wti;
import X.C83976WxY;
import X.InterfaceC65784Pro;
import X.InterfaceC83737Wth;
import X.InterfaceC83970WxS;
import X.VJO;
import X.W1H;
import X.W1I;
import X.X1D;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.asve.recorder.camera.VECameraController;
import com.ss.android.ugc.aweme.relation.feed.v4.RecSwipeGalleryLayoutManager;
import java.util.Iterator;

/* loaded from: classes15.dex */
public class AqS112S0101000_14 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case 9:
                return invoke$9(this);
            case 10:
                return invoke$10(this);
            default:
                return null;
        }
    }

    public final void invoke$0() {
        C83477WpV c83477WpV = (C83477WpV) this.l0;
        c83477WpV.LJLJI = (C83489Wph) ListProtector.get(c83477WpV.LJLJJI, this.i1);
        C83477WpV c83477WpV2 = (C83477WpV) this.l0;
        c83477WpV2.notifyItemChanged(c83477WpV2.LJLIL);
        ((C83477WpV) this.l0).notifyItemChanged(this.i1);
        ((C83477WpV) this.l0).LJLIL = this.i1;
    }

    public static final Object invoke$0(AqS112S0101000_14 aqS112S0101000_14) {
        ((W1H) aqS112S0101000_14.l0).LLJJI(aqS112S0101000_14.i1);
        ((W1H) aqS112S0101000_14.l0).LJLILLLLZI.LIZ();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS112S0101000_14 aqS112S0101000_14) {
        int i = aqS112S0101000_14.i1;
        if (i < -88) {
            ((W1H) aqS112S0101000_14.l0).LLJILJIL(-1);
        } else if (i > 88) {
            ((W1H) aqS112S0101000_14.l0).LLJILJIL(1);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$10(AqS112S0101000_14 aqS112S0101000_14) {
        C83976WxY c83976WxY = (C83976WxY) aqS112S0101000_14.l0;
        VECameraController vECameraController = c83976WxY.LIZJ;
        vECameraController.LJLLILLLL = false;
        vECameraController.LJLLJ = -1;
        C83738Wti.LIZ = -1;
        vECameraController.LLI = 0.0f;
        vECameraController.LLIFFJFJJ = 0.0f;
        InterfaceC83970WxS interfaceC83970WxS = vECameraController.LJLJLJ;
        if (interfaceC83970WxS != null) {
            interfaceC83970WxS.LJIILJJIL(c83976WxY.LIZ, c83976WxY.LIZIZ);
        }
        Iterator<InterfaceC83737Wth> it = ((C83976WxY) aqS112S0101000_14.l0).LIZJ.LJLJJL.iterator();
        while (it.hasNext()) {
            InterfaceC83737Wth next = it.next();
            int i = aqS112S0101000_14.i1;
            C83976WxY c83976WxY2 = (C83976WxY) aqS112S0101000_14.l0;
            next.LIZ(i, c83976WxY2.LIZ, c83976WxY2.LIZIZ);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS112S0101000_14 aqS112S0101000_14) {
        int i = aqS112S0101000_14.i1;
        C81539VzL c81539VzL = (C81539VzL) aqS112S0101000_14.l0;
        int i2 = c81539VzL.LJLJJL;
        if (i != i2) {
            c81539VzL.notifyItemChanged(i2, Boolean.FALSE);
            ((C81539VzL) aqS112S0101000_14.l0).notifyItemChanged(aqS112S0101000_14.i1, Boolean.TRUE);
            ((C81539VzL) aqS112S0101000_14.l0).LJLJJL = aqS112S0101000_14.i1;
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS112S0101000_14 aqS112S0101000_14) {
        ((W1I) aqS112S0101000_14.l0).LLJJI(aqS112S0101000_14.i1);
        ((W1I) aqS112S0101000_14.l0).LJLJI.LIZ();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS112S0101000_14 aqS112S0101000_14) {
        int i = aqS112S0101000_14.i1;
        if (i < -88) {
            ((W1I) aqS112S0101000_14.l0).LLJILJIL(-1);
        } else if (i > 88) {
            ((W1I) aqS112S0101000_14.l0).LLJILJIL(1);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(AqS112S0101000_14 aqS112S0101000_14) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Skip non-head task ");
        LIZ.append((VJO) aqS112S0101000_14.l0);
        LIZ.append(", last execution one is ");
        LIZ.append(aqS112S0101000_14.i1);
        return X1D.LIZIZ(LIZ);
    }

    public static final Object invoke$6(AqS112S0101000_14 aqS112S0101000_14) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Find head task ");
        LIZ.append((VJO) aqS112S0101000_14.l0);
        LIZ.append(" next to ");
        LIZ.append(aqS112S0101000_14.i1);
        return X1D.LIZIZ(LIZ);
    }

    public static final Object invoke$7(AqS112S0101000_14 aqS112S0101000_14) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Skip non-head task ");
        LIZ.append((VJO) aqS112S0101000_14.l0);
        LIZ.append(", last execution one is ");
        LIZ.append(aqS112S0101000_14.i1);
        return X1D.LIZIZ(LIZ);
    }

    public static final /* bridge */ /* synthetic */ Object invoke$8(AqS112S0101000_14 aqS112S0101000_14) {
        aqS112S0101000_14.invoke$0();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$9(AqS112S0101000_14 aqS112S0101000_14) {
        Object obj;
        if (aqS112S0101000_14.i1 == 0) {
            RecSwipeGalleryLayoutManager recSwipeGalleryLayoutManager = (RecSwipeGalleryLayoutManager) aqS112S0101000_14.l0;
            recSwipeGalleryLayoutManager.LLFII = new C28851Bh(recSwipeGalleryLayoutManager);
            obj = ((RecSwipeGalleryLayoutManager) aqS112S0101000_14.l0).LLFII;
            if (obj == null) {
                o.LJIJI("horizontalHelper");
                throw null;
            }
        } else {
            RecSwipeGalleryLayoutManager recSwipeGalleryLayoutManager2 = (RecSwipeGalleryLayoutManager) aqS112S0101000_14.l0;
            recSwipeGalleryLayoutManager2.LLFZ = new C28861Bi(recSwipeGalleryLayoutManager2);
            obj = ((RecSwipeGalleryLayoutManager) aqS112S0101000_14.l0).LLFZ;
            if (obj == null) {
                o.LJIJI("verticalHelper");
                throw null;
            }
        }
        return obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS112S0101000_14(RecSwipeGalleryLayoutManager recSwipeGalleryLayoutManager, int i) {
        super(0);
        this.$t = i;
        this.i1 = 0;
        this.l0 = recSwipeGalleryLayoutManager;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AqS112S0101000_14(int r3, X.W1H r4, int r5) {
        /*
            r2 = this;
            r2.$t = r5
            switch(r5) {
                case 0: goto Lf;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.i1 = r3
            r1.l0 = r4
            r0 = 0
        Lb:
            r1.<init>(r0)
            return
        Lf:
            r1 = r2
            r1.l0 = r4
            r1.i1 = r3
            r0 = 0
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS112S0101000_14.<init>(int, X.W1H, int):void");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AqS112S0101000_14(int r3, X.W1I r4, int r5) {
        /*
            r2 = this;
            r2.$t = r5
            switch(r5) {
                case 3: goto Lf;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.i1 = r3
            r1.l0 = r4
            r0 = 0
        Lb:
            r1.<init>(r0)
            return
        Lf:
            r1 = r2
            r1.l0 = r4
            r1.i1 = r3
            r0 = 0
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS112S0101000_14.<init>(int, X.W1I, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS112S0101000_14(int i, C81539VzL c81539VzL, int i2) {
        super(0);
        this.$t = i2;
        this.i1 = i;
        this.l0 = c81539VzL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS112S0101000_14(VJO vjo, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = vjo;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS112S0101000_14(C83477WpV c83477WpV, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c83477WpV;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS112S0101000_14(C83976WxY c83976WxY, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c83976WxY;
        this.i1 = i;
    }
}

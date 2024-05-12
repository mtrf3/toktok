package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C45621qg;
import X.C76800UCe;
import X.C78897Uxp;
import X.C80217Ve1;
import X.C82055WIh;
import X.C82064WIq;
import X.C82622Wbi;
import X.C83310Wmo;
import X.HXB;
import X.InterfaceC45968I2i;
import X.InterfaceC45971I2l;
import X.InterfaceC65784Pro;
import X.InterfaceC82086WJm;
import X.InterfaceC83314Wms;
import X.VWR;
import X.VWV;
import X.WI6;
import X.WIB;
import X.WID;
import X.WLT;
import X.WMH;
import X.WRQ;
import Y.AObjectS119S0200000_14;
import Y.AObjectS42S0400000_14;
import Y.AObjectS71S0300000_14;
import android.view.MotionEvent;
import com.bytedance.als.LiveEvent;
import com.bytedance.scene.navigation.NavigationScene;
import com.ss.android.ugc.aweme.ecommerce.anchor.baseview.ECommerceAnchorAppbarLayout$Behavior;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.vision.widget.PhotoSearchAppbarLayout$Behavior;

/* loaded from: classes15.dex */
public class AqS74S0400000_14 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS74S0400000_14 aqS74S0400000_14) {
        InterfaceC65784Pro<Boolean> interfaceC65784Pro = ((VWR) ((C80217Ve1) aqS74S0400000_14.l0)).LJZI;
        boolean z = true;
        if (interfaceC65784Pro == null || !interfaceC65784Pro.invoke().booleanValue()) {
            ECommerceAnchorAppbarLayout$Behavior eCommerceAnchorAppbarLayout$Behavior = (ECommerceAnchorAppbarLayout$Behavior) aqS74S0400000_14.l1;
            z = ECommerceAnchorAppbarLayout$Behavior.LIZ((MotionEvent) aqS74S0400000_14.l3, (C45621qg) aqS74S0400000_14.l2, (C80217Ve1) aqS74S0400000_14.l0, eCommerceAnchorAppbarLayout$Behavior);
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$1(AqS74S0400000_14 aqS74S0400000_14) {
        InterfaceC65784Pro<Boolean> interfaceC65784Pro = ((VWV) ((C80217Ve1) aqS74S0400000_14.l0)).LJZI;
        boolean z = true;
        if (interfaceC65784Pro == null || !interfaceC65784Pro.invoke().booleanValue()) {
            PhotoSearchAppbarLayout$Behavior photoSearchAppbarLayout$Behavior = (PhotoSearchAppbarLayout$Behavior) aqS74S0400000_14.l1;
            z = PhotoSearchAppbarLayout$Behavior.LIZ((MotionEvent) aqS74S0400000_14.l3, (C45621qg) aqS74S0400000_14.l2, (C80217Ve1) aqS74S0400000_14.l0, photoSearchAppbarLayout$Behavior);
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$2(AqS74S0400000_14 aqS74S0400000_14) {
        InterfaceC83314Wms interfaceC83314Wms;
        Object obj = aqS74S0400000_14.l1;
        if (obj != null && (interfaceC83314Wms = (InterfaceC83314Wms) aqS74S0400000_14.l2) != null) {
            ((C83310Wmo) aqS74S0400000_14.l0).LJ().put(obj, interfaceC83314Wms);
        }
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) aqS74S0400000_14.l3;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
            return interfaceC65784Pro;
        }
        return null;
    }

    public static final Object invoke$3(AqS74S0400000_14 aqS74S0400000_14) {
        LiveEvent<C76800UCe> Bk;
        C82055WIh c82055WIh = (C82055WIh) aqS74S0400000_14.l0;
        WMH wmh = (WMH) aqS74S0400000_14.l1;
        C82622Wbi c82622Wbi = (C82622Wbi) aqS74S0400000_14.l2;
        WI6 wi6 = (WI6) aqS74S0400000_14.l3;
        c82055WIh.getClass();
        NavigationScene LJJJJ = C78897Uxp.LJJJJ(wmh);
        c82055WIh.LJI = new SafeHandler(LJJJJ);
        InterfaceC82086WJm interfaceC82086WJm = c82055WIh.LIZIZ;
        if (interfaceC82086WJm != null) {
            interfaceC82086WJm.kp().LIZLLL(LJJJJ, new AObjectS119S0200000_14(c82622Wbi, wi6, 8));
            ((WIB) c82622Wbi.LJ(WIB.class, null)).N1().LIZLLL(LJJJJ, new AObjectS119S0200000_14(c82622Wbi, wi6, 9));
            WIB wib = (WIB) c82622Wbi.LJ(WIB.class, null);
            wib.N1().LIZLLL(LJJJJ, new AObjectS42S0400000_14(wib, c82055WIh, c82622Wbi, wi6, 1));
            InterfaceC82086WJm interfaceC82086WJm2 = c82055WIh.LIZIZ;
            if (interfaceC82086WJm2 != null) {
                interfaceC82086WJm2.ln0().LIZLLL(LJJJJ, new AObjectS119S0200000_14(c82622Wbi, wi6, 10));
                ((InterfaceC45968I2i) c82622Wbi.LJ(InterfaceC45968I2i.class, null)).D6().LIZLLL(LJJJJ, new AObjectS119S0200000_14(c82622Wbi, wi6, 11));
                ((InterfaceC45971I2l) c82622Wbi.LJ(InterfaceC45971I2l.class, null)).getBottomTabIndexChangeEvent().LIZIZ(LJJJJ, new AObjectS71S0300000_14(c82622Wbi, c82055WIh, wi6, 9));
                InterfaceC82086WJm interfaceC82086WJm3 = c82055WIh.LIZIZ;
                if (interfaceC82086WJm3 != null) {
                    interfaceC82086WJm3.Hv().LIZLLL(LJJJJ, new AObjectS119S0200000_14(c82622Wbi, wi6, 12));
                    InterfaceC82086WJm interfaceC82086WJm4 = c82055WIh.LIZIZ;
                    if (interfaceC82086WJm4 != null) {
                        interfaceC82086WJm4.VO().LIZLLL(LJJJJ, new AObjectS119S0200000_14(c82622Wbi, wi6, 13));
                        ((WLT) c82622Wbi.LJ(InterfaceC82086WJm.class, null)).oX().LIZLLL(LJJJJ, new AObjectS42S0400000_14(c82055WIh, wi6, c82622Wbi, wmh, 0));
                        HXB hxb = (HXB) c82622Wbi.LJ(HXB.class, null);
                        hxb.getMusicAdded().LIZLLL(LJJJJ, new AObjectS71S0300000_14(c82622Wbi, c82055WIh, wi6, 5));
                        hxb.getMusicCleared().LIZLLL(LJJJJ, new AObjectS71S0300000_14(c82622Wbi, c82055WIh, wi6, 6));
                        ((WRQ) c82622Wbi.LJ(WRQ.class, null)).Wp0().LIZLLL(LJJJJ, new AObjectS71S0300000_14(c82622Wbi, c82055WIh, wi6, 7));
                        WRQ wrq = (WRQ) c82622Wbi.LJIIIIZZ(null, WRQ.class);
                        if (wrq != null && (Bk = wrq.Bk()) != null) {
                            Bk.LIZLLL(LJJJJ, new AObjectS71S0300000_14(c82622Wbi, c82055WIh, wi6, 8));
                        }
                        return C76800UCe.LIZ;
                    }
                    o.LJIJI("cameraApiComponent");
                    throw null;
                }
                o.LJIJI("cameraApiComponent");
                throw null;
            }
            o.LJIJI("cameraApiComponent");
            throw null;
        }
        o.LJIJI("cameraApiComponent");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x03b2, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L91;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c4  */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Throwable, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$4(kotlin.jvm.internal.AqS74S0400000_14 r19) {
        /*
            Method dump skipped, instructions count: 1117
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS74S0400000_14.invoke$4(kotlin.jvm.internal.AqS74S0400000_14):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS74S0400000_14(C82622Wbi c82622Wbi, WMH wmh, C82055WIh c82055WIh, WI6 wi6, int i) {
        super(0);
        this.$t = i;
        this.l0 = c82055WIh;
        this.l1 = wmh;
        this.l2 = c82622Wbi;
        this.l3 = wi6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS74S0400000_14(C82622Wbi c82622Wbi, WMH wmh, C82064WIq c82064WIq, WID wid, int i) {
        super(0);
        this.$t = i;
        this.l0 = c82064WIq;
        this.l1 = wmh;
        this.l2 = c82622Wbi;
        this.l3 = wid;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS74S0400000_14(C83310Wmo c83310Wmo, Object obj, InterfaceC83314Wms interfaceC83314Wms, InterfaceC65784Pro interfaceC65784Pro, int i) {
        super(0);
        this.$t = i;
        this.l0 = c83310Wmo;
        this.l1 = obj;
        this.l2 = interfaceC83314Wms;
        this.l3 = interfaceC65784Pro;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS74S0400000_14(MotionEvent motionEvent, C45621qg c45621qg, C80217Ve1 c80217Ve1, ECommerceAnchorAppbarLayout$Behavior eCommerceAnchorAppbarLayout$Behavior, int i) {
        super(0);
        this.$t = i;
        this.l0 = c80217Ve1;
        this.l1 = eCommerceAnchorAppbarLayout$Behavior;
        this.l2 = c45621qg;
        this.l3 = motionEvent;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS74S0400000_14(MotionEvent motionEvent, C45621qg c45621qg, C80217Ve1 c80217Ve1, PhotoSearchAppbarLayout$Behavior photoSearchAppbarLayout$Behavior, int i) {
        super(0);
        this.$t = i;
        this.l0 = c80217Ve1;
        this.l1 = photoSearchAppbarLayout$Behavior;
        this.l2 = c45621qg;
        this.l3 = motionEvent;
    }
}

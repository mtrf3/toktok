package X;

import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS145S0200000_14;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public class WW0 {
    public final LifecycleOwner LIZ;
    public final WW1 LIZIZ;
    public final C34380DeS LIZJ;
    public final InterfaceC88472Yns<InterfaceC46243ICx<?>, C76800UCe> LIZLLL;
    public TEZ LJ;
    public InterfaceC65784Pro<? extends Effect> LJFF;
    public C65792i7 LJI;
    public String LJII;
    public InterfaceC74306TEg LJIIIIZZ;
    public InterfaceC88471Ynr<? super Effect, ? super String, Integer> LJIIIZ;
    public List<String> LJIIJ;
    public boolean LJIIJJI;
    public final List<C77379UYl> LJIIL;
    public final List<C77376UYi> LJIILIIL;
    public final List<C77376UYi> LJIILJJIL;
    public final List<C77377UYj> LJIILL;
    public final List<AbstractC77369UYb> LJIILLIIL;
    public AbstractC77369UYb LJIIZILJ;
    public final List<Effect> LJIJ;
    public final List<Effect> LJIJI;
    public C77376UYi LJIJJ;
    public long LJIJJLI;
    public String LJIL;
    public boolean LJJ;
    public boolean LJJI;
    public boolean LJJIFFI;
    public final C62822Ol8 LJJII;
    public final C62822Ol8 LJJIII;

    public final boolean LIZ() {
        if (this.LJJI || !this.LIZJ.LJII.invoke().booleanValue()) {
            return true;
        }
        return !this.LJIIL.isEmpty();
    }

    public final boolean LIZIZ() {
        if (this.LJJIFFI || !this.LIZJ.LJIJJ.invoke().booleanValue()) {
            return true;
        }
        return !this.LJIILL.isEmpty();
    }

    public final void LIZJ() {
        TEZ tez;
        InterfaceC74393THp LJJJJLL;
        TJV LIZ;
        TEZ tez2;
        InterfaceC74393THp LJJJJLL2;
        TJV LIZ2;
        List<C77379UYl> list;
        List<C77376UYi> list2 = this.LJIILIIL;
        if (list2 == null || ((ArrayList) list2).isEmpty()) {
            LJ(new AqS180S0100000_14((WWJ) this, 239));
        }
        if (((this.LIZJ.LJII.invoke().booleanValue() && ((list = this.LJIIL) == null || ((ArrayList) list).isEmpty())) || !this.LIZJ.LJII.invoke().booleanValue()) && (tez2 = this.LJ) != null && (LJJJJLL2 = tez2.LJJJJLL()) != null && (LIZ2 = LJJJJLL2.LIZ()) != null) {
            C74310TEk.LIZ(LIZ2, "sticker_category:favorite", true, 12);
        }
        if (!this.LIZJ.LJIJJ.invoke().booleanValue()) {
            List<C77377UYj> list3 = this.LJIILL;
            if ((list3 == null || ((ArrayList) list3).isEmpty()) && (tez = this.LJ) != null && (LJJJJLL = tez.LJJJJLL()) != null && (LIZ = LJJJJLL.LIZ()) != null) {
                C74310TEk.LIZ(LIZ, "sticker_category:recent_used", true, 12);
            }
        }
    }

    public final int LIZLLL() {
        return ((Number) this.LJJIII.getValue()).intValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0030, code lost:
    
        if (r3 == null) goto L75;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0135  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.OSZ<com.ss.android.ugc.effectmanager.effect.model.Effect, X.AbstractC77369UYb> LJFF() {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WW0.LJFF():X.OSZ");
    }

    public final void LJ(InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns) {
        InterfaceC74306TEg interfaceC74306TEg = this.LJIIIIZZ;
        if (interfaceC74306TEg != null) {
            interfaceC74306TEg.LIZ(new AqS145S0200000_14((InterfaceC88472Yns) interfaceC88472Yns, (InterfaceC88472Yns<? super String, C76800UCe>) this, (WW0) 15));
            if (C76800UCe.LIZ != null) {
                return;
            }
        }
        interfaceC88472Yns.invoke(this.LJII);
    }

    public final boolean LJI(Effect effect) {
        Iterator<C77379UYl> it = this.LJIIL.iterator();
        while (it.hasNext()) {
            if (o.LJ(it.next().LIZ, effect)) {
                return true;
            }
        }
        return false;
    }

    public final boolean LJII(Effect effect) {
        Iterator<C77377UYj> it = this.LJIILL.iterator();
        while (it.hasNext()) {
            if (o.LJ(it.next().LIZ, effect)) {
                return true;
            }
        }
        return false;
    }

    public final void LJIIIIZZ(Effect effect) {
        InterfaceC74393THp LJJJJLL;
        InterfaceC73389SrB LJ;
        TEZ tez = this.LJ;
        if (tez != null && (LJJJJLL = tez.LJJJJLL()) != null && (LJ = LJJJJLL.LJ()) != null && LJ.LIZ(effect)) {
            ((ArrayList) this.LJIJI).add(effect);
            return;
        }
        TEZ tez2 = this.LJ;
        if (tez2 == null) {
            return;
        }
        tez2.LIZJ(effect, false, false, true, new WW5());
    }

    public WW0(C82410WVy lifeCycleOwner, WW1 slideSlipBottomStickerScene, C34380DeS uiConfig, AqS180S0100000_14 aqS180S0100000_14) {
        o.LJIIIZ(lifeCycleOwner, "lifeCycleOwner");
        o.LJIIIZ(slideSlipBottomStickerScene, "slideSlipBottomStickerScene");
        o.LJIIIZ(uiConfig, "uiConfig");
        this.LIZ = lifeCycleOwner;
        this.LIZIZ = slideSlipBottomStickerScene;
        this.LIZJ = uiConfig;
        this.LIZLLL = aqS180S0100000_14;
        this.LJFF = WWX.LJLIL;
        this.LJII = "hot";
        this.LJIIIZ = C71212qr.LJLIL;
        this.LJIIJ = new ArrayList();
        this.LJIIL = new ArrayList();
        this.LJIILIIL = new ArrayList();
        this.LJIILJJIL = new ArrayList();
        this.LJIILL = new ArrayList();
        this.LJIILLIIL = new ArrayList();
        this.LJIJ = new ArrayList();
        this.LJIJI = new ArrayList();
        this.LJIL = "";
        this.LJJII = C221108m2.LIZIZ(C77370UYc.LJLIL);
        this.LJJIII = C221108m2.LIZIZ(new AqS164S0100000_14(this, 227));
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x013d, code lost:
    
        if (r1 != null) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIIZ(X.WW0 r25, boolean r26, boolean r27, java.lang.String r28, int r29) {
        /*
            Method dump skipped, instructions count: 538
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WW0.LJIIIZ(X.WW0, boolean, boolean, java.lang.String, int):void");
    }
}

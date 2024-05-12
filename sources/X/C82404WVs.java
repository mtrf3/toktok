package X;

import Y.AObjectS89S0100000_14;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import com.bytedance.als.LiveEvent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.WVs, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82404WVs extends AbstractC29891Fh<WTZ> implements WTZ, InterfaceC135635Tz {
    public static final C82407WVv LJLJLLL;
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLL;
    public final int LJLIL;
    public final WMH LJLILLLLZI;
    public final C82622Wbi LJLJI;
    public final C5H3 LJLJJI;
    public boolean LJLJJL;
    public final InterfaceC115514g7 LJLJJLL;
    public final InterfaceC115514g7 LJLJL;
    public final InterfaceC115514g7 LJLJLJ;

    static {
        TBT tbt = new TBT(C82404WVs.class, "recordApiComponent", "getRecordApiComponent()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0);
        C65352Pkq.LIZ.getClass();
        LJLL = new InterfaceC74236TBo[]{tbt, new TBT(C82404WVs.class, "stickerComponent", "getStickerComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0), new TBT(C82404WVs.class, "slideComponent", "getSlideComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/slideslip/SlideSlipBottomStickerApiComponent;", 0)};
        LJLJLLL = new C82407WVv();
    }

    public C82404WVs LJJLI() {
        return this;
    }

    private final I3X LJJLIIIIJ() {
        return (I3X) this.LJLJJLL.LIZ(this, LJLL[0]);
    }

    private final InterfaceC82129WLd LJJLIIIJILLIZJL() {
        return (InterfaceC82129WLd) this.LJLJLJ.LIZ(this, LJLL[2]);
    }

    private final I0N LJJLIIIJJI() {
        return (I0N) this.LJLJL.LIZ(this, LJLL[1]);
    }

    private final void LJJLIIIJLLLLLLLZ() {
        I0N LJJLIIIJJI;
        IDH LLLF;
        View findViewById;
        ViewGroup viewGroup;
        if (this.LJLJJL || (LJJLIIIJJI = LJJLIIIJJI()) == null || (LLLF = LJJLIIIJJI.LLLF()) == null) {
            return;
        }
        this.LJLJJL = true;
        LLLF.prepare();
        C82405WVt LJJLIIIJJIZ = LJJLIIIJJIZ();
        LJJLIIIJJIZ.getClass();
        LJJLIIIJJIZ.LJLILLLLZI = LLLF;
        ViewGroup Uh = LLLF.Uh();
        ViewGroup viewGroup2 = null;
        if (Uh != null) {
            viewGroup2 = (ViewGroup) Uh.findViewById(R.id.kgg);
        }
        if (viewGroup2 != null && (findViewById = viewGroup2.findViewById(R.id.kgf)) != null) {
            viewGroup2.removeAllViews();
            LinearLayout linearLayout = LJJLIIIJJIZ.LJLIL;
            if (linearLayout != null) {
                linearLayout.addView(findViewById, new ViewGroup.LayoutParams(-1, -2));
            }
            View findViewById2 = findViewById.findViewById(R.id.fmc);
            LJJLIIIJJIZ.LJLJI = findViewById2;
            if (findViewById2 != null) {
                findViewById2.setVisibility(8);
            }
        }
        View cb = LLLF.cb();
        if (cb == null) {
            return;
        }
        ViewParent parent = cb.getParent();
        if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
            viewGroup.removeAllViews();
        }
        LinearLayout linearLayout2 = LJJLIIIJJIZ.LJLIL;
        if (linearLayout2 == null) {
            return;
        }
        linearLayout2.addView(cb, new ViewGroup.LayoutParams(-2, -2));
    }

    public final C82405WVt LJJLIIIJJIZ() {
        return (C82405WVt) this.LJLJJI.getValue();
    }

    private final void LJJLIIJ() {
        C0IB<Boolean> isRecording;
        I3X LJJLIIIIJ = LJJLIIIIJ();
        if (LJJLIIIIJ != null && (isRecording = LJJLIIIIJ.isRecording()) != null) {
            isRecording.LIZIZ(this, new AObjectS89S0100000_14(this, 358));
        }
    }

    private final void LJJLJ() {
        LiveEvent<Boolean> bL;
        InterfaceC82129WLd LJJLIIIJILLIZJL = LJJLIIIJILLIZJL();
        if (LJJLIIIJILLIZJL != null && (bL = LJJLIIIJILLIZJL.bL()) != null) {
            bL.LIZLLL(this, new AObjectS89S0100000_14(this, 359));
        }
    }

    private final void LJJLJLI() {
        LiveEvent<T4S> CY;
        I0N LJJLIIIJJI = LJJLIIIJJI();
        if (LJJLIIIJJI != null && (CY = LJJLIIIJJI.CY()) != null) {
            CY.LIZLLL(this, new AObjectS89S0100000_14(this, 360));
        }
    }

    private final void LJJLL() {
        LiveEvent<C76800UCe> Mu0;
        I0N LJJLIIIJJI = LJJLIIIJJI();
        if (LJJLIIIJJI != null && (Mu0 = LJJLIIIJJI.Mu0()) != null) {
            Mu0.LIZLLL(this, new AObjectS89S0100000_14(this, 361));
        }
    }

    private final void LJJZZI() {
        LiveEvent<Boolean> sF;
        I0N LJJLIIIJJI = LJJLIIIJJI();
        if (LJJLIIIJJI != null && (sF = LJJLIIIJJI.sF()) != null) {
            sF.LIZLLL(this, new AObjectS89S0100000_14(this, 362));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x007b, code lost:
    
        if (X.C00F.LIZ(31744, 0, "studio_met_reuse", true) == 2) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJZZIII() {
        /*
            r7 = this;
            X.I3X r1 = r7.LJJLIIIIJ()
            r0 = 0
            if (r1 == 0) goto L13
            X.0IB r1 = r1.isRecording()
            if (r1 == 0) goto L13
            java.lang.Object r0 = r1.LIZ()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
        L13:
            r4 = 0
            if (r0 != 0) goto La6
            r6 = 0
        L17:
            X.WLd r0 = r7.LJJLIIIJILLIZJL()
            if (r0 == 0) goto L2b
            com.bytedance.als.LiveEvent r0 = r0.bL()
            if (r0 == 0) goto L2b
            java.lang.Object r0 = r0.LIZJ()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 != 0) goto L2d
        L2b:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
        L2d:
            boolean r5 = r0.booleanValue()
            X.I0N r0 = r7.LJJLIIIJJI()
            if (r0 == 0) goto L45
            com.bytedance.als.LiveEvent r0 = r0.sF()
            if (r0 == 0) goto L45
            java.lang.Object r0 = r0.LIZJ()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 != 0) goto L47
        L45:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
        L47:
            boolean r3 = r0.booleanValue()
            X.I0N r0 = r7.LJJLIIIJJI()
            if (r0 == 0) goto La4
            com.bytedance.als.LiveEvent r0 = r0.CY()
            if (r0 == 0) goto La4
            java.lang.Object r0 = r0.LIZJ()
            X.T4S r0 = (X.T4S) r0
            if (r0 == 0) goto La4
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = r0.LIZ()
            r2 = 1
            if (r0 == 0) goto La4
            boolean r0 = com.ss.android.ugc.gamora.recorder.sticker.templateeffect.DiyPropParser.LJIIIIZZ(r0)
            if (r0 != r2) goto La4
            boolean r0 = X.C53560L0i.LIZ()
            if (r0 == 0) goto La4
            r1 = 31744(0x7c00, float:4.4483E-41)
            java.lang.String r0 = "studio_met_reuse"
            int r1 = X.C00F.LIZ(r1, r4, r0, r2)
            r0 = 2
            if (r1 != r0) goto La4
        L7d:
            if (r6 != 0) goto L95
            if (r2 != 0) goto L85
            if (r3 != 0) goto L85
            if (r5 == 0) goto L95
        L85:
            r7.LJJLIIIJLLLLLLLZ()
            X.WVt r0 = r7.LJJLIIIJJIZ()
            android.widget.LinearLayout r0 = r0.LJLIL
            if (r0 != 0) goto L91
        L90:
            return
        L91:
            r0.setVisibility(r4)
            goto L90
        L95:
            X.WVt r0 = r7.LJJLIIIJJIZ()
            android.widget.LinearLayout r1 = r0.LJLIL
            if (r1 != 0) goto L9e
            goto L90
        L9e:
            r0 = 8
            r1.setVisibility(r0)
            goto L90
        La4:
            r2 = 0
            goto L7d
        La6:
            boolean r6 = r0.booleanValue()
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C82404WVs.LJJZZIII():void");
    }

    @Override // X.AbstractC29891Fh
    public void onCreate() {
        super.onCreate();
        this.LJLILLLLZI.add(this.LJLIL, LJJLIIIJJIZ(), "RecordStickerBarScene");
        LJJLIIJ();
        LJJLJLI();
        LJJLJ();
        LJJZZI();
        LJJLL();
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ WTZ getApiComponent() {
        LJJLI();
        return this;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLJI;
    }

    public C82404WVs(int i, WMH parentScene, C82622Wbi diContainer) {
        o.LJIIIZ(parentScene, "parentScene");
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = i;
        this.LJLILLLLZI = parentScene;
        this.LJLJI = diContainer;
        this.LJLJJI = C221108m2.LIZIZ(C82406WVu.LJLIL);
        this.LJLJJLL = UCI.LJII(getDiContainer(), I3X.class, null);
        this.LJLJL = UCI.LJII(getDiContainer(), I0N.class, null);
        this.LJLJLJ = UCI.LJII(getDiContainer(), InterfaceC82129WLd.class, null);
    }
}

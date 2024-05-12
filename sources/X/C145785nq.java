package X;

import android.app.Activity;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5nq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C145785nq extends WJB {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLZ;
    public final LifecycleOwner LJLJI;
    public final C82622Wbi LJLJJI;
    public final C148195rj LJLJJL;
    public final C82632Wbs LJLJJLL;
    public final C82632Wbs LJLJL;
    public final C82632Wbs LJLJLJ;
    public final C82631Wbr LJLJLLL;
    public final C82631Wbr LJLL;
    public final C82631Wbr LJLLI;
    public final C82632Wbs LJLLILLLL;
    public final C82632Wbs LJLLJ;
    public final C62822Ol8 LJLLL;
    public final C62822Ol8 LJLLLL;
    public final C60Y LJLLLLLL;

    static {
        TBT tbt = new TBT(C145785nq.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLZ = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C145785nq.class, "activity", "getActivity()Landroid/app/Activity;", 0, c65351Pkp), C61845OOz.LIZJ(C145785nq.class, "editEffectApi", "getEditEffectApi()Lcom/ss/android/ugc/aweme/shortvideo/edit/effect/EditEffectApi;", 0, c65351Pkp), C61845OOz.LIZJ(C145785nq.class, "editAudioRecordApi", "getEditAudioRecordApi()Lcom/ss/android/ugc/aweme/shortvideo/edit/audiorecord/EditAudioRecordApi;", 0, c65351Pkp), C61845OOz.LIZJ(C145785nq.class, "editAudioEffectApi", "getEditAudioEffectApi()Lcom/ss/android/ugc/aweme/shortvideo/edit/audioeffect/EditAudioEffectApi;", 0, c65351Pkp), C61845OOz.LIZJ(C145785nq.class, "editorProApi", "getEditorProApi()Lcom/ss/android/ugc/gamora/editorpro/EditorProApi;", 0, c65351Pkp), C61845OOz.LIZJ(C145785nq.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0, c65351Pkp), C61845OOz.LIZJ(C145785nq.class, "editPrePublishApi", "getEditPrePublishApi()Lcom/ss/android/ugc/gamora/editor/preload/EditPrePublishApi;", 0, c65351Pkp), C61845OOz.LIZJ(C145785nq.class, "musicReplaceApiComponent", "getMusicReplaceApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/edit/audioedit/musicreplace/MusicReplaceApiComponent;", 0, c65351Pkp)};
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00d1, code lost:
    
        if (r3 == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d3, code lost:
    
        r16 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d5, code lost:
    
        if (r2 == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00d7, code lost:
    
        r6 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00e0, code lost:
    
        if (X.C44384HbQ.LJIILJJIL(LJIIJJI()) == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00e2, code lost:
    
        LJIIJJI().getEditorProModel().setFromPhotoCanvas(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00ed, code lost:
    
        if (r2 != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00ef, code lost:
    
        X.C5QW.LJIILIIL(LJIIJJI(), r6, false, false, false, false, 60);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00fb, code lost:
    
        if (r6 == false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00fd, code lost:
    
        r8 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0102, code lost:
    
        if (r18 == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0104, code lost:
    
        if (r2 != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0106, code lost:
    
        r3 = X.C86V.LJFF(com.zhiliaoapp.musically.R.string.bgx);
        kotlin.jvm.internal.o.LJIIIIZZ(r3, "getString(R.string.adjustclips_edit2)");
        r8.add(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0115, code lost:
    
        if (r14 == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0117, code lost:
    
        r3 = X.C86V.LJFF(com.zhiliaoapp.musically.R.string.fpp);
        kotlin.jvm.internal.o.LJIIIIZZ(r3, "getString(R.string.edito…_gate_popup_placeholder1)");
        r8.add(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0126, code lost:
    
        if (r16 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0128, code lost:
    
        if (r2 != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x012a, code lost:
    
        r3 = X.C86V.LJFF(com.zhiliaoapp.musically.R.string.bzk);
        kotlin.jvm.internal.o.LJIIIIZZ(r3, "getString(R.string.av_voice_conversion)");
        r8.add(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0139, code lost:
    
        r6 = X.ORZ.LLD(r8, ",", null, null, null, 62);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0148, code lost:
    
        if (X.C145805ns.LIZ() != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0152, code lost:
    
        if (X.C132385Hm.LJII(LJIIJJI()) == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x018e, code lost:
    
        r5 = com.zhiliaoapp.musically.R.string.bgz;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0158, code lost:
    
        r4 = new X.C62905OmT(LJIIIZ());
        r4.LIZJ = X.C86V.LJ().getString(r5, r6);
        r4.LJIIJJI(com.zhiliaoapp.musically.R.string.dsg, new X.DialogInterfaceOnClickListenerC145795nr(r14, r19, r16, r2, r18), false);
        r4.LJIIIIZZ(com.zhiliaoapp.musically.R.string.cg_, X.DialogInterfaceOnClickListenerC145825nu.LJLIL, false);
        new X.C62906OmU(r4).LIZLLL();
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0154, code lost:
    
        r5 = X.C1533360b.LIZJ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01b3, code lost:
    
        LJIILIIL(false, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0192, code lost:
    
        if (r14 != false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0194, code lost:
    
        if (r18 != false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0196, code lost:
    
        if (r16 == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x019b, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0198, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01a4, code lost:
    
        if (X.C1293155r.LIZ() != false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01a8, code lost:
    
        r16 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x019e, code lost:
    
        if (r3 != false) goto L73;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x019e  */
    @Override // X.WJB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF() {
        /*
            Method dump skipped, instructions count: 561
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C145785nq.LJFF():void");
    }

    public final Activity LJIIIZ() {
        return (Activity) this.LJLJL.LIZ(this, LJLZ[1]);
    }

    public final InterfaceC143655kP LJIIJ() {
        return (InterfaceC143655kP) this.LJLLILLLL.LIZ(this, LJLZ[6]);
    }

    public final VideoPublishEditModel LJIIJJI() {
        return (VideoPublishEditModel) this.LJLJJLL.LIZ(this, LJLZ[0]);
    }

    public final C63C LJIIL() {
        return (C63C) this.LJLLL.getValue();
    }

    @Override // X.WJB
    public final boolean LJIIIIZZ() {
        if (C44384HbQ.LLILII(LJIIJJI())) {
            C145885o0 c145885o0 = C145885o0.LIZ;
            VideoPublishEditModel LJIIJJI = LJIIJJI();
            c145885o0.getClass();
            if (!C145885o0.LIZIZ(LJIIJJI)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.WJB
    public final WI1 LIZJ() {
        return this.LJLLLLLL;
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLJJI;
    }

    @Override // X.WJB
    public final void LJII(InterfaceC65784Pro interfaceC65784Pro, boolean z) {
        View view = this.LJLILLLLZI;
        if (view != null) {
            C148725sa.LIZIZ(LJIIIZ(), view, z, interfaceC65784Pro);
        }
    }

    public final void LJIILIIL(boolean z, boolean z2) {
        C122034qd LJI;
        C5QW.LIZ = System.currentTimeMillis();
        C5QW.LJJJIL();
        InterfaceC153045zY value = LJIIJ().Kh().getValue();
        if ((value instanceof C133765Mu) && (LJI = ((C133765Mu) value).LJI()) != null) {
            C63D c63d = LJIIL().LLJI;
            if (c63d != null) {
                c63d.uO();
            }
            SurfaceView value2 = LJIIJ().D50().getValue();
            o.LJII(value2, "null cannot be cast to non-null type android.view.SurfaceView");
            ViewGroup.LayoutParams layoutParams = value2.getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            LJIIL().LLL().LJLL();
            LJIIJJI().textLayoutWidth = LJIIL().LLLFF().getFirst().floatValue();
            LJIIJJI().textLayoutHeight = LJIIL().LLLFF().getSecond().floatValue();
            C147295qH c147295qH = (C147295qH) this.LJLLLL.getValue();
            if (c147295qH != null) {
                C132045Ge c132045Ge = new C132045Ge();
                c132045Ge.setInlineCaptionCaches(c147295qH.LLJJJJ.LIZ());
                c132045Ge.setEnterFrom("enter_from_edit_root_adjust_clips");
                C132385Hm.LJIIJJI(c147295qH, LJI, LJIIJJI(), layoutParams2, c147295qH.LLJJIII().LLL().RW(), c132045Ge, (InterfaceC136115Vv) this.LJLLI.LIZ(this, LJLZ[5]));
            }
            if (!z2) {
                C5QW.LJJIIJ(LJIIJJI(), z, false, false, false, false, 60);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [X.60Y] */
    public C145785nq(LifecycleOwner lifecycleOwner, C82622Wbi diContainer, C148195rj config) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(config, "config");
        this.LJLJI = lifecycleOwner;
        this.LJLJJI = diContainer;
        this.LJLJJL = config;
        this.LJLJJLL = UCI.LJI(diContainer, VideoPublishEditModel.class, null);
        this.LJLJL = UCI.LJI(diContainer, Activity.class, null);
        this.LJLJLJ = UCI.LJI(diContainer, InterfaceC145485nM.class, null);
        this.LJLJLLL = UCI.LJII(diContainer, InterfaceC146665pG.class, null);
        this.LJLL = UCI.LJII(diContainer, InterfaceC145875nz.class, null);
        this.LJLLI = UCI.LJII(diContainer, InterfaceC136115Vv.class, null);
        this.LJLLILLLL = UCI.LJI(diContainer, InterfaceC143655kP.class, null);
        this.LJLLJ = UCI.LJI(diContainer, InterfaceC145815nt.class, null);
        UCI.LJII(diContainer, InterfaceC149715uB.class, null);
        this.LJLLL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 674));
        this.LJLLLL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 673));
        final C6MP c6mp = C6MP.CUT_OPTIMIZED;
        final VideoPublishEditModel LJIIJJI = LJIIJJI();
        this.LJLLLLLL = new WI1(c6mp, LJIIJJI) { // from class: X.60Y
            public final C6MP LJIIIZ;
            public final VideoPublishEditModel LJIIJ;
            public WI0 LJIIJJI;

            @Override // X.WI1
            public final int LJ() {
                return C1534460m.LIZ();
            }

            @Override // X.WI1
            public final int LJII() {
                if (C145805ns.LIZ() || C132385Hm.LJII(this.LJIIJ)) {
                    if (C1534360l.LIZ()) {
                        return R.string.dzk;
                    }
                    return C1533360b.LIZIZ();
                }
                return R.string.fjf;
            }

            @Override // X.WI1
            public final WI0 LIZJ() {
                return this.LJIIJJI;
            }

            @Override // X.WI1
            public final C6MP LJIIIIZZ() {
                return this.LJIIIZ;
            }

            @Override // X.WI1
            public final void LIZ(WI0 wi0) {
                this.LJIIJJI = wi0;
            }

            {
                int i;
                o.LJIIIZ(c6mp, "toolbarType");
                o.LJIIIZ(LJIIJJI, "model");
                this.LJIIIZ = c6mp;
                this.LJIIJ = LJIIJJI;
                if (C1533760f.LIZ(LJIIJJI)) {
                    C151975xp.LIZ(LJIIJJI);
                    i = -20;
                } else if (C151975xp.LIZ(LJIIJJI)) {
                    i = 50;
                } else {
                    i = 40;
                }
                this.LJIIJJI = new WI0(null, i, false, 5);
            }
        };
    }
}

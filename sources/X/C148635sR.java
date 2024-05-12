package X;

import Y.ARunnableS38S0100000_2;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEEditorListener;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.creative.model.DMMediaModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.5sR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C148635sR extends WJB {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLL;
    public final LifecycleOwner LJLJI;
    public final C82622Wbi LJLJJI;
    public final C82632Wbs LJLJJL;
    public final C82632Wbs LJLJJLL;
    public final C82632Wbs LJLJL;
    public final C82632Wbs LJLJLJ;
    public final C148655sT LJLJLLL;

    static {
        TBT tbt = new TBT(C148635sR.class, "editEffectApi", "getEditEffectApi()Lcom/ss/android/ugc/aweme/shortvideo/edit/effect/EditEffectApi;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLL = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C148635sR.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0, c65351Pkp), C61845OOz.LIZJ(C148635sR.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0, c65351Pkp), C61845OOz.LIZJ(C148635sR.class, "editToolbarApi", "getEditToolbarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/EditToolbarApi;", 0, c65351Pkp)};
    }

    @Override // X.WJB
    public final void LIZLLL() {
        InterfaceC153045zY value;
        C122034qd LJJI;
        NLEEditor nLEEditor;
        if (C148665sU.LIZ && (value = LJIIIZ().Kh().getValue()) != null && (LJJI = C17N.LJJI(value)) != null && (nLEEditor = LJJI.LJIIJ) != null) {
            nLEEditor.addConsumer(new NLEEditorListener() { // from class: X.5sS
                /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
                
                    if (r1.Jg0() == true) goto L10;
                 */
                @Override // com.bytedance.ies.nle.editor_jni.NLEEditorListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void onChanged() {
                    /*
                        r3 = this;
                        boolean r0 = X.C148665sU.LIZ
                        if (r0 == 0) goto L21
                        X.5sR r0 = X.C148635sR.this
                        r0.getClass()
                        X.5sT r2 = r0.LJLJLLL
                        X.5kP r1 = r0.LJIIIZ()
                        boolean r0 = r1 instanceof X.InterfaceC142545ic
                        if (r0 == 0) goto L22
                        X.5ic r1 = (X.InterfaceC142545ic) r1
                        if (r1 == 0) goto L22
                        boolean r1 = r1.Jg0()
                        r0 = 1
                        if (r1 != r0) goto L22
                    L1f:
                        r2.LJFF = r0
                    L21:
                        return
                    L22:
                        r0 = 0
                        goto L1f
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C148645sS.onChanged():void");
                }
            });
        }
    }

    public final InterfaceC143655kP LJIIIZ() {
        return (InterfaceC143655kP) this.LJLJJLL.LIZ(this, LJLL[1]);
    }

    public final VideoPublishEditModel LJIIJ() {
        return (VideoPublishEditModel) this.LJLJL.LIZ(this, LJLL[2]);
    }

    @Override // X.WJB
    public final void LJFF() {
        InterfaceC153045zY value;
        C60903NvH.LJIIJJI().LJJI().sceneReport("click_effect_entrance");
        if (C148705sY.LIZ() && LJIIJ().videoFps(true) < 30 && (value = LJIIIZ().Kh().getValue()) != null) {
            value.LLJJ();
        }
        if (C44384HbQ.LJJIJIIJIL(LJIIJ()) || C44384HbQ.LLIIIILZ(LJIIJ())) {
            C132385Hm.LJIIIIZZ = true;
            ((InterfaceC153275zv) this.LJLJLJ.LIZ(this, LJLL[3])).A7(15);
            H8F.LJJI(LJIIJ(), false, true);
        } else {
            ((InterfaceC145485nM) this.LJLJJL.LIZ(this, LJLL[0])).show();
            LJIIIZ().U2(false, false, false);
            LJIIIZ().Ov(false);
            C1536161d.LIZ("effect");
            H8F.LJJI(LJIIJ(), false, false);
        }
    }

    @Override // X.WJB
    public final boolean LJIIIIZZ() {
        DMMediaModel dMMediaModel;
        if (!C151965xo.LIZJ(LJIIJ())) {
            return false;
        }
        if (LJIIJ().isEnterFromDM() && (dMMediaModel = LJIIJ().creativeModel.dmMediaModel) != null && dMMediaModel.type == 2) {
            return false;
        }
        return true;
    }

    @Override // X.WJB
    public final /* bridge */ /* synthetic */ WI1 LIZJ() {
        return this.LJLJLLL;
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLJJI;
    }

    @Override // X.WJB
    public final void LJI(C1537261o registerEvent) {
        o.LJIIIZ(registerEvent, "registerEvent");
        o.LJIIIIZZ(LJIIJ().getEffectList(), "model.effectList");
        if ((!r1.isEmpty()) && !((Keva) C148685sW.LIZ.getValue()).getBoolean("edit_effect_tooltip", false) && C148675sV.LIZ) {
            Context context = registerEvent.LJLJI.getContext();
            o.LJIIIIZZ(context, "registerEvent.imageView.context");
            C139825eE c139825eE = new C139825eE(context);
            c139825eE.LIZIZ(registerEvent.LJLJI);
            c139825eE.LJI(WHL.START);
            C82682Wcg c82682Wcg = c139825eE.LIZ;
            c82682Wcg.LJII = 3000L;
            c82682Wcg.LJIJJLI = true;
            c139825eE.LJIIJJI(R.string.fgy);
            registerEvent.LJLJI.postDelayed(new ARunnableS38S0100000_2(c139825eE.LIZJ(), 132), 100L);
        }
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [X.5sT] */
    public C148635sR(LifecycleOwner lifecycleOwner, C82622Wbi diContainer, C148195rj config) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(config, "config");
        this.LJLJI = lifecycleOwner;
        this.LJLJJI = diContainer;
        this.LJLJJL = UCI.LJI(diContainer, InterfaceC145485nM.class, null);
        this.LJLJJLL = UCI.LJI(diContainer, InterfaceC143655kP.class, null);
        this.LJLJL = UCI.LJI(diContainer, VideoPublishEditModel.class, null);
        this.LJLJLJ = UCI.LJI(diContainer, InterfaceC153275zv.class, null);
        this.LJLJLLL = new WI1() { // from class: X.5sT
            public int LJIIIZ;
            public final int LJIIJ;
            public final C6MP LJIIJJI;

            @Override // X.WI1
            public final int LJII() {
                return R.string.fr1;
            }

            @Override // X.WI1
            public final WI0 LIZJ() {
                return new WI0(null, 20, false, 5);
            }

            {
                int i;
                int i2;
                if (C149015t3.LIZ()) {
                    i = R.drawable.azu;
                } else {
                    i = R.drawable.b6u;
                }
                this.LJIIIZ = i;
                if (this.LJIIIIZZ) {
                    i2 = R.raw.icon_effect_rectangle_fill;
                } else {
                    i2 = R.raw.icon_effect_rectangle_alt_fill;
                }
                this.LJIIJ = i2;
                this.LJIIJJI = C6MP.EFFECT;
            }

            @Override // X.WI1
            public final int LJ() {
                return this.LJIIJ;
            }

            @Override // X.WI1
            public final int LJI() {
                return this.LJIIIZ;
            }

            @Override // X.WI1
            public final C6MP LJIIIIZZ() {
                return this.LJIIJJI;
            }
        };
    }
}

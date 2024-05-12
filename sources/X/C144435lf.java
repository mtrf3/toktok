package X;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.KeyEvent;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.creative.model.video2sticker.Video2StickerModel;
import com.ss.android.vesdk.VESize;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS27S0001000_2;
import kotlin.jvm.internal.AqS7S0010000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5lf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C144435lf extends AbstractC48231ut<InterfaceC144545lq, C144855mL, C144515ln, C144625ly> implements InterfaceC144545lq, InterfaceC135635Tz {
    public static final C144535lp LLFF;
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLFFF;
    public final C82622Wbi LJLL;
    public final InterfaceC115514g7 LJLLI;
    public final InterfaceC115514g7 LJLLILLLL;
    public final InterfaceC115514g7 LJLLJ;
    public final C5H3 LJLLL;
    public final InterfaceC115514g7 LJLLLL;
    public final InterfaceC115514g7 LJLLLLLL;
    public final InterfaceC115514g7 LJLZ;
    public long LJZ;
    public final InterfaceC70422pa LJZI;
    public OSZ<Float, Float> LJZL;
    public final InterfaceC65784Pro<C144515ln> LL;
    public final InterfaceC65784Pro<C144625ly> LLD;
    public final C5HC LLF;

    /* JADX WARN: Type inference failed for: r0v13, types: [X.5lp] */
    static {
        TBT tbt = new TBT(C144435lf.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/video2sticker/preview/Video2StickerEditPreviewComponent;", 0);
        C65352Pkq.LIZ.getClass();
        LLFFF = new InterfaceC74236TBo[]{tbt, new TBT(C144435lf.class, "avListenableActivityRegistry", "getAvListenableActivityRegistry()Lcom/ss/android/ugc/tools/view/activity/AVListenableActivityRegistry;", 0), new TBT(C144435lf.class, "video2StickerModel", "getVideo2StickerModel()Lcom/ss/android/ugc/aweme/creative/model/video2sticker/Video2StickerModel;", 0), new TBT(C144435lf.class, "previewMaskApi", "getPreviewMaskApi()Lcom/ss/android/ugc/aweme/shortvideo/video2sticker/mask/Video2StickerPreviewMaskApi;", 0), new TBT(C144435lf.class, "videoControllerApi", "getVideoControllerApi()Lcom/ss/android/ugc/aweme/shortvideo/video2sticker/videocontroll/Video2StickerControllerApi;", 0), new TBT(C144435lf.class, "textComponent", "getTextComponent()Lcom/ss/android/ugc/aweme/shortvideo/video2sticker/text/Video2StickerTextComponent;", 0)};
        LLFF = new Object() { // from class: X.5lp
        };
    }

    private final InterfaceC45540Hu4 LJZI() {
        return (InterfaceC45540Hu4) this.LJLLILLLL.LIZ(this, LLFFF[1]);
    }

    private final NLEEditor LLIFFJFJJ() {
        return (NLEEditor) this.LJLLL.getValue();
    }

    private final InterfaceC144495ll LLIIIL() {
        return (InterfaceC144495ll) this.LJLLLL.LIZ(this, LLFFF[3]);
    }

    private final C157546Gg LLIIZ() {
        return (C157546Gg) this.LJLZ.LIZ(this, LLFFF[5]);
    }

    private final InterfaceC144005ky LLILZIL() {
        return (InterfaceC144005ky) this.LJLLLLLL.LIZ(this, LLFFF[4]);
    }

    public final C143965ku LLF() {
        return (C143965ku) this.LJLLI.LIZ(this, LLFFF[0]);
    }

    public final VESize LLFFF() {
        return new VESize((int) LLILL().editVideoInfo.initializeVideoWidth, (int) LLILL().editVideoInfo.initializeVideoHeight);
    }

    public final Video2StickerModel LLILL() {
        return (Video2StickerModel) this.LJLLJ.LIZ(this, LLFFF[2]);
    }

    public final RectF LLILZLL() {
        VESize LLFFF2 = LLFFF();
        return C144025l0.LJFF(LLIFFJFJJ(), LLFFF2.width, LLFFF2.height);
    }

    public final float LLIZ() {
        return LLIFFJFJJ().LJ().getMainTrack().LJIILIIL(0).getScale();
    }

    public final OSZ<Float, Float> LLJ() {
        NLETrackSlot LJIILIIL = LLIFFJFJJ().LJ().getMainTrack().LJIILIIL(0);
        return new OSZ<>(Float.valueOf(LJIILIIL.getTransformX()), Float.valueOf(LJIILIIL.getTransformY()));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLJJ() {
        /*
            r5 = this;
            com.ss.android.ugc.aweme.creative.model.video2sticker.Video2StickerModel r0 = r5.LLILL()
            com.ss.android.ugc.aweme.creative.model.video2sticker.OriginVideoInfo r0 = r0.originVideoInfo
            java.lang.String r4 = r0.awemeId
            com.ss.android.ugc.aweme.creative.model.video2sticker.Video2StickerModel r0 = r5.LLILL()
            com.ss.android.ugc.aweme.creative.model.video2sticker.OriginVideoInfo r0 = r0.originVideoInfo
            java.lang.String r2 = r0.userId
            java.lang.Object r0 = r5.LJJLJ()
            X.5ln r0 = (X.C144515ln) r0
            int r1 = r0.LJFF
            r0 = 1
            r3 = 3
            if (r1 == r0) goto L24
            r0 = 2
            if (r1 == r0) goto L7a
            if (r1 == r3) goto L77
            r0 = 4
            if (r1 == r0) goto L74
        L24:
            java.lang.String r1 = "1:1"
        L26:
            java.lang.String r0 = "cancel"
            X.C6GK.LIZ(r4, r2, r1, r0)
            com.bytedance.ies.nle.editor_jni.NLEEditor r0 = r5.LLIFFJFJJ()
            com.bytedance.ies.nle.editor_jni.NLEModel r0 = r0.LJ()
            com.bytedance.ies.nle.editor_jni.NLETrack r1 = r0.getMainTrack()
            r0 = 0
            com.bytedance.ies.nle.editor_jni.NLETrackSlot r2 = r1.LJIILIIL(r0)
            java.lang.Object r0 = r5.LJJLJ()
            X.5ln r0 = (X.C144515ln) r0
            float r0 = r0.LIZIZ
            r2.setScale(r0)
            X.OSZ<java.lang.Float, java.lang.Float> r1 = r5.LJZL
            if (r1 == 0) goto L65
            java.lang.Object r0 = r1.getFirst()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            r2.setTransformX(r0)
            java.lang.Object r0 = r1.getSecond()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            r2.setTransformY(r0)
        L65:
            X.2pa r2 = r5.LJZI
            X.5li r1 = new X.5li
            r0 = 0
            r1.<init>(r5, r0)
            X.XKX.LIZLLL(r2, r0, r0, r1, r3)
            r5.hide()
            return
        L74:
            java.lang.String r1 = "4:3"
            goto L26
        L77:
            java.lang.String r1 = "9:16"
            goto L26
        L7a:
            java.lang.String r1 = "3:4"
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C144435lf.LLJJ():void");
    }

    public final void LLJJI() {
        String str;
        LLIFFJFJJ().LIZIZ();
        Rect rect = LJJLJ().LIZLLL;
        if (rect != null) {
            LLIIIL().vD(rect);
        }
        String str2 = LLILL().originVideoInfo.awemeId;
        String str3 = LLILL().originVideoInfo.userId;
        int i = LJJLJ().LJFF;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        str = "4:3";
                    }
                } else {
                    str = "9:16";
                }
            } else {
                str = "3:4";
            }
            C6GK.LIZ(str2, str3, str, "save");
            hide();
        }
        str = "1:1";
        C6GK.LIZ(str2, str3, str, "save");
        hide();
    }

    @Override // X.AbstractC48231ut, X.InterfaceC145485nM
    public void hide() {
        super.hide();
        LLF().U2(true, false, false);
        LJZI().unRegisterActivityOnKeyDownListener(this.LLF);
        LLIIZ().show();
    }

    @Override // X.AbstractC48231ut, X.InterfaceC145485nM
    public void show() {
        LLF().U2(false, false, false);
        if (!LLILL().videoTimeTrimData.isSingleFrame) {
            LLILZIL().LK(new C6HV(1, true));
        }
        LJZI().registerActivityOnKeyDownListener(this.LLF);
        LLIIZ().hide();
        VESize LLFFF2 = LLFFF();
        LLIIIL().vD(C144025l0.LIZ(C144025l0.LIZJ(LLILL().videoCropData.cropRatioMode), LLFFF2.width / LLFFF2.height, C144035l1.LIZIZ, C144035l1.LIZ));
        super.show();
    }

    public final void xl0() {
        LLIIIL().xl0();
    }

    @Override // X.AbstractC41331jl
    public InterfaceC65784Pro<C144515ln> LJJLIIIJJI() {
        return this.LL;
    }

    @Override // X.AbstractC41331jl
    public InterfaceC65784Pro<C144625ly> LJJLIIIJJIZ() {
        return this.LLD;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLL;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJLZ(X.InterfaceC67352kd<? super X.C76800UCe> r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof X.C144475lj
            if (r0 == 0) goto L7b
            r7 = r13
            X.5lj r7 = (X.C144475lj) r7
            int r2 = r7.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7b
            int r2 = r2 - r1
            r7.LJLJJI = r2
        L12:
            java.lang.Object r1 = r7.LJLILLLLZI
            X.NAu r6 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r7.LJLJJI
            r5 = 1
            if (r0 == 0) goto L2c
            if (r0 != r5) goto L81
            X.5lf r0 = r7.LJLIL
            X.C141335gf.LIZJ(r1)
        L22:
            com.bytedance.ies.nle.editor_jni.NLEEditor r0 = r0.LLIFFJFJJ()
            r0.LIZIZ()
        L29:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L2c:
            X.C141335gf.LIZJ(r1)
            long r1 = r12.LJZ
            r10 = 0
            int r0 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r0 != 0) goto L47
            long r0 = java.lang.System.currentTimeMillis()
            r12.LJZ = r0
            com.bytedance.ies.nle.editor_jni.NLEEditor r0 = r12.LLIFFJFJJ()
            r0.LIZIZ()
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L47:
            long r3 = java.lang.System.currentTimeMillis()
            long r0 = r12.LJZ
            long r8 = r3 - r0
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r0 >= 0) goto L56
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L56:
            r1 = 16
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 < 0) goto L66
            r12.LJZ = r3
            com.bytedance.ies.nle.editor_jni.NLEEditor r0 = r12.LLIFFJFJJ()
            r0.LIZIZ()
            goto L29
        L66:
            r0 = 16
            long r0 = (long) r0
            long r3 = r3 + r0
            long r3 = r3 - r8
            r12.LJZ = r3
            long r0 = r0 - r8
            r7.LJLIL = r12
            r7.LJLJJI = r5
            java.lang.Object r0 = X.C1JD.LIZJ(r0, r7)
            if (r0 != r6) goto L79
            return r6
        L79:
            r0 = r12
            goto L22
        L7b:
            X.5lj r7 = new X.5lj
            r7.<init>(r12, r13)
            goto L12
        L81:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C144435lf.LJLZ(X.2kd):java.lang.Object");
    }

    public final float LLIILZL(float f) {
        return C144025l0.LIZIZ(f, (int) LLILL().editVideoInfo.initializeVideoWidth, (int) LLILL().editVideoInfo.initializeVideoHeight);
    }

    public final void LLJI(boolean z) {
        if (z) {
            LLIIIL().PP();
            this.LJZL = LLJ();
        }
    }

    public final void LLJILJIL(boolean z) {
        if (LLILL().videoTimeTrimData.isSingleFrame) {
            return;
        }
        if (z) {
            LLILZIL().LK(new C6HV(1, false));
        } else {
            LLILZIL().LK(new C6HV(2, false));
        }
    }

    public final void LLJJIJI(float f) {
        NLETrack mainTrack;
        NLEModel LJ = LLIFFJFJJ().LJ();
        if (LJ != null && (mainTrack = LJ.getMainTrack()) != null) {
            NLETrackSlot LJIILIIL = mainTrack.LJIILIIL(0);
            LJIILIIL.setScale(LJIILIIL.getScale() * f);
        }
        XKX.LIZLLL(this.LJZI, null, null, new C144455lh(this, null), 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C144435lf(WMH parentScene, C82622Wbi diContainer) {
        super(parentScene);
        o.LJIIIZ(parentScene, "parentScene");
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLL = diContainer;
        this.LJLLI = UCI.LJI(getDiContainer(), C143965ku.class, null);
        this.LJLLILLLL = UCI.LJI(getDiContainer(), InterfaceC45540Hu4.class, null);
        this.LJLLJ = UCI.LJI(getDiContainer(), Video2StickerModel.class, null);
        this.LJLLL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 293));
        this.LJLLLL = UCI.LJI(getDiContainer(), InterfaceC144495ll.class, null);
        this.LJLLLLLL = UCI.LJI(getDiContainer(), InterfaceC144005ky.class, null);
        this.LJLZ = UCI.LJI(getDiContainer(), C157546Gg.class, null);
        this.LJZI = C48841JEv.LIZIZ();
        this.LL = C144505lm.LJLIL;
        this.LLD = new AqS152S0100000_2(this, 294);
        this.LLF = new C5HC() { // from class: X.5lk
            @Override // X.C5HC
            public final boolean onKeyDown(int i, KeyEvent keyEvent) {
                C144435lf.this.LLJJ();
                return true;
            }
        };
    }

    public final void LLJJIJIL(boolean z, float f) {
        LLIIIL().wc0(z, f);
    }

    public final void LLJJJIL(int i, boolean z) {
        LJJZZI(new AqS27S0001000_2(i, 15));
        LJJZZI(new AqS7S0010000_2(z, 25));
    }

    public final void nl(boolean z, float f) {
        LLIIIL().nl(z, f);
    }

    public final void LLJJIII(float f, float f2, boolean z) {
        NLETrack mainTrack;
        NLEModel LJ = LLIFFJFJJ().LJ();
        if (LJ != null && (mainTrack = LJ.getMainTrack()) != null) {
            NLETrackSlot LJIILIIL = mainTrack.LJIILIIL(0);
            if (z) {
                LJIILIIL.setTransformX((f / C144035l1.LIZIZ) + LJIILIIL.getTransformX());
                LJIILIIL.setTransformY((f2 / C144035l1.LIZ) + LJIILIIL.getTransformY());
            } else {
                LJIILIIL.setTransformX(LJIILIIL.getTransformX() + f);
                LJIILIIL.setTransformY(LJIILIIL.getTransformY() + f2);
            }
        }
        XKX.LIZLLL(this.LJZI, null, null, new C144445lg(this, null), 3);
    }
}

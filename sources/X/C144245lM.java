package X;

import android.view.KeyEvent;
import com.ss.android.ugc.aweme.creative.model.video2sticker.Video2StickerModel;
import com.ss.android.ugc.aweme.creative.model.video2sticker.VideoTimeTrimData;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import djb.IDaS67S0100000_2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* renamed from: X.5lM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C144245lM extends AbstractC48231ut<InterfaceC143995kx, C144415ld, C144315lT, C144365lY> implements InterfaceC143995kx, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLFF;
    public final C82622Wbi LJLL;
    public final InterfaceC115514g7 LJLLI;
    public final InterfaceC115514g7 LJLLILLLL;
    public final InterfaceC70422pa LJLLJ;
    public final InterfaceC115514g7 LJLLL;
    public final InterfaceC115514g7 LJLLLL;
    public final InterfaceC115514g7 LJLLLLLL;
    public final InterfaceC115514g7 LJLZ;
    public final C5H3 LJZ;
    public C144265lO LJZI;
    public final long LJZL;
    public final InterfaceC65784Pro<C144315lT> LL;
    public final InterfaceC65784Pro<C144365lY> LLD;
    public final CoroutineExceptionHandler LLF;

    static {
        TBT tbt = new TBT(C144245lM.class, "avListenableActivityRegistry", "getAvListenableActivityRegistry()Lcom/ss/android/ugc/tools/view/activity/AVListenableActivityRegistry;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LLFF = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C144245lM.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0, c65351Pkp), C61845OOz.LIZJ(C144245lM.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/video2sticker/preview/Video2StickerEditPreviewApi;", 0, c65351Pkp), C61845OOz.LIZJ(C144245lM.class, "video2StickerTextApi", "getVideo2StickerTextApi()Lcom/ss/android/ugc/aweme/shortvideo/video2sticker/text/Video2StickerTextApi;", 0, c65351Pkp), C61845OOz.LIZJ(C144245lM.class, "video2StickerModel", "getVideo2StickerModel()Lcom/ss/android/ugc/aweme/creative/model/video2sticker/Video2StickerModel;", 0, c65351Pkp), C61845OOz.LIZJ(C144245lM.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0, c65351Pkp)};
    }

    public final boolean LLIZ() {
        return true;
    }

    private final InterfaceC45540Hu4 LJZI() {
        return (InterfaceC45540Hu4) this.LJLLI.LIZ(this, LLFF[0]);
    }

    public final InterfaceC144015kz LLF() {
        return (InterfaceC144015kz) this.LJLLL.LIZ(this, LLFF[2]);
    }

    public final DialogC25756A8y LLFFF() {
        return (DialogC25756A8y) this.LJZ.getValue();
    }

    public final VideoPublishEditModel LLIFFJFJJ() {
        return (VideoPublishEditModel) this.LJLZ.LIZ(this, LLFF[5]);
    }

    public final Video2StickerModel LLIIIL() {
        return (Video2StickerModel) this.LJLLLLLL.LIZ(this, LLFF[4]);
    }

    public final InterfaceC136385Ww LLIILZL() {
        return (InterfaceC136385Ww) this.LJLLLL.LIZ(this, LLFF[3]);
    }

    public final ActivityC45651qj getActivity() {
        return (ActivityC45651qj) this.LJLLILLLL.LIZ(this, LLFF[1]);
    }

    @Override // X.AbstractC48231ut, X.InterfaceC145485nM
    public void hide() {
        LJJZZI(C144295lR.LJLIL);
    }

    private final void LLJ() {
        if (LLIIIL().videoTimeTrimData.isSingleFrame) {
            VideoTimeTrimData videoTimeTrimData = LLIIIL().videoTimeTrimData;
            if (LLF().Kh().getValue() != null) {
                videoTimeTrimData.startTime = r0.LJZL();
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
    }

    public final void LJLZ() {
        if (LLIZ()) {
            getActivity().finish();
        }
    }

    public final void LLILL() {
        LLJ();
        XKX.LIZLLL(this.LJLLJ, null, null, new C144235lL(this, null), 3);
    }

    @Override // X.AbstractC48231ut, X.AbstractC29891Fh
    public void onCreate() {
        super.onCreate();
        LJZI().registerActivityOnKeyDownListener(new C5HC() { // from class: X.5lV
            @Override // X.C5HC
            public final boolean onKeyDown(int i, KeyEvent keyEvent) {
                return !C144245lM.this.LLIZ();
            }
        });
    }

    @Override // X.AbstractC29891Fh
    public void onDestroy() {
        super.onDestroy();
        C48841JEv.LIZJ(this.LJLLJ, null);
    }

    @Override // X.AbstractC48231ut, X.InterfaceC145485nM
    public void show() {
        super.show();
        LJJZZI(C144305lS.LJLIL);
    }

    @Override // X.AbstractC41331jl
    public InterfaceC65784Pro<C144315lT> LJJLIIIJJI() {
        return this.LL;
    }

    @Override // X.AbstractC41331jl
    public InterfaceC65784Pro<C144365lY> LJJLIIIJJIZ() {
        return this.LLD;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLL;
    }

    public final void LLIIZ(C144285lQ c144285lQ) {
        List<TextStickerModel> W50 = LLIILZL().W50();
        ArrayList arrayList = new ArrayList(C32I.LJJL(W50, 10));
        Iterator<TextStickerModel> it = W50.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getTextStr());
        }
        IMService.createIIMServicebyMonsterPlugin(false).getImStickerStoreService().LJFF(getActivity(), c144285lQ.LJLJI, LLIIIL().originVideoInfo.awemeId, c144285lQ.LJLJJI, LLIIIL().originVideoInfo.secUserId, c144285lQ.LJLIL, c144285lQ.LJLILLLLZI, System.currentTimeMillis() - this.LJZL, new ArrayList(arrayList), C1A7.LJJI(LLIIIL()));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LLILZIL(X.InterfaceC67352kd<? super java.lang.Boolean> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C144275lP
            if (r0 == 0) goto L47
            r5 = r7
            X.5lP r5 = (X.C144275lP) r5
            int r2 = r5.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L47
            int r2 = r2 - r1
            r5.LJLJI = r2
        L12:
            java.lang.Object r1 = r5.LJLIL
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLJI
            r3 = 1
            if (r0 == 0) goto L23
            if (r0 != r3) goto L4d
            X.C141335gf.LIZJ(r1)
        L20:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        L23:
            X.C141335gf.LIZJ(r1)
            X.1qj r1 = r6.getActivity()
            java.lang.String r0 = "context"
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)
            boolean r0 = X.C48203Ivv.LJ(r1)
            if (r0 != 0) goto L55
        L36:
            X.UtN r2 = X.C36636EZk.LIZ
            X.5lJ r1 = new X.5lJ
            r0 = 0
            r1.<init>(r6, r0)
            r5.LJLJI = r3
            java.lang.Object r0 = X.XKX.LJI(r2, r1, r5)
            if (r0 != r4) goto L20
            return r4
        L47:
            X.5lP r5 = new X.5lP
            r5.<init>(r6, r7)
            goto L12
        L4d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L55:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C144245lM.LLILZIL(X.2kd):java.lang.Object");
    }

    public final Object LLILZLL(InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        Object LJI = XKX.LJI(this.LLF, new C144225lK(this, null), interfaceC67352kd);
        if (LJI == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return LJI;
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C144245lM(WMH parentScene, C82622Wbi diContainer) {
        super(parentScene);
        o.LJIIIZ(parentScene, "parentScene");
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLL = diContainer;
        this.LJLLI = UCI.LJI(getDiContainer(), InterfaceC45540Hu4.class, null);
        this.LJLLILLLL = UCI.LJI(getDiContainer(), ActivityC45651qj.class, null);
        this.LJLLJ = C48841JEv.LIZIZ();
        this.LJLLL = UCI.LJI(getDiContainer(), InterfaceC144015kz.class, null);
        this.LJLLLL = UCI.LJI(getDiContainer(), InterfaceC136385Ww.class, null);
        this.LJLLLLLL = UCI.LJI(getDiContainer(), Video2StickerModel.class, null);
        this.LJLZ = UCI.LJI(getDiContainer(), VideoPublishEditModel.class, null);
        this.LJZ = C221108m2.LIZIZ(new AqS152S0100000_2(this, 307));
        this.LJZL = System.currentTimeMillis();
        this.LL = C144325lU.LJLIL;
        this.LLD = new AqS152S0100000_2(this, 308);
        this.LLF = new IDaS67S0100000_2(CoroutineExceptionHandler.LJJJJIZL, this, 1);
    }
}

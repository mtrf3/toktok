package X;

import Y.AObjectS84S0100000_2;
import Y.AObserverS70S0100000_2;
import com.bytedance.vcloud.vctrace.BuildConfig;
import com.ss.android.ugc.aweme.base.SafeHandler;
import com.ss.android.ugc.aweme.creative.model.video2sticker.Video2StickerModel;
import com.ss.android.vesdk.VEEditor;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS5S0100001_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6GJ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6GJ extends AbstractC48231ut<InterfaceC143985kw, C82861WfZ, C6GQ, C6GX> implements InterfaceC143985kw, InterfaceC135635Tz {
    public static final C6GV LLD;
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLF;
    public final C82622Wbi LJLL;
    public final InterfaceC115514g7 LJLLI;
    public final InterfaceC115514g7 LJLLILLLL;
    public final InterfaceC115514g7 LJLLJ;
    public final InterfaceC115514g7 LJLLL;
    public final InterfaceC115514g7 LJLLLL;
    public final InterfaceC70422pa LJLLLLLL;
    public final InterfaceC65784Pro<C6GQ> LJLZ;
    public final SafeHandler LJZ;
    public Runnable LJZI;
    public final InterfaceC65784Pro<C6GX> LJZL;
    public final C29901Fi<Boolean> LL;

    /* JADX WARN: Type inference failed for: r0v11, types: [X.6GV] */
    static {
        TBT tbt = new TBT(C6GJ.class, "cropApi", "getCropApi()Lcom/ss/android/ugc/aweme/shortvideo/video2sticker/crop/VideoCropApi;", 0);
        C65352Pkq.LIZ.getClass();
        LLF = new InterfaceC74236TBo[]{tbt, new TBT(C6GJ.class, "editPreviewAPi", "getEditPreviewAPi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0), new TBT(C6GJ.class, "textStickerApi", "getTextStickerApi()Lcom/ss/android/ugc/aweme/shortvideo/video2sticker/text/Video2StickerTextApi;", 0), new TBT(C6GJ.class, "video2StickerModel", "getVideo2StickerModel()Lcom/ss/android/ugc/aweme/creative/model/video2sticker/Video2StickerModel;", 0), new TBT(C6GJ.class, "videoControllerApi", "getVideoControllerApi()Lcom/ss/android/ugc/aweme/shortvideo/video2sticker/videocontroll/Video2StickerControllerApi;", 0)};
        LLD = new Object() { // from class: X.6GV
        };
    }

    private final InterfaceC144545lq LJLZ() {
        return (InterfaceC144545lq) this.LJLLI.LIZ(this, LLF[0]);
    }

    private final InterfaceC136385Ww LLFFF() {
        return (InterfaceC136385Ww) this.LJLLJ.LIZ(this, LLF[2]);
    }

    private final InterfaceC144005ky LLIIIL() {
        return (InterfaceC144005ky) this.LJLLLL.LIZ(this, LLF[4]);
    }

    public final InterfaceC143655kP LJZI() {
        return (InterfaceC143655kP) this.LJLLILLLL.LIZ(this, LLF[1]);
    }

    public final Video2StickerModel LLIFFJFJJ() {
        return (Video2StickerModel) this.LJLLL.LIZ(this, LLF[3]);
    }

    @Override // X.AbstractC48231ut, X.InterfaceC145485nM
    public void hide() {
        LJJZZI(C6GN.LJLIL);
    }

    @Override // X.InterfaceC143985kw
    public void kG() {
        Runnable runnable = this.LJZI;
        if (runnable != null) {
            this.LJZ.removeCallbacks(runnable);
        }
    }

    @Override // X.InterfaceC143985kw
    public void zh() {
        Runnable runnable = this.LJZI;
        if (runnable != null) {
            this.LJZ.post(runnable);
        }
    }

    public final String LLF() {
        return LLIFFJFJJ().originVideoInfo.filePath;
    }

    public final void LLILL() {
        LJZI().U2(false, false, false);
        LJLZ().show();
        String str = LLIFFJFJJ().originVideoInfo.awemeId;
        String str2 = LLIFFJFJJ().originVideoInfo.userId;
        C188727au LIZ = C78928UyK.LIZ(str, "groupId", str2, "authorId");
        LIZ.LJIIIZ("enter_from", "create_video_sticker");
        LIZ.LJIIIZ("enter_method", "click_button");
        LIZ.LJIIIZ("group_id", str);
        LIZ.LJIIIZ("author_id", str2);
        FMX.LJIIL("crop_video_sticker_entrance", LIZ.LIZ);
    }

    public final void LLILZIL() {
        if (!LLFFF().Ag0()) {
            return;
        }
        LJZI().U2(false, false, false);
        C6GK.LIZLLL("click_button", LLIFFJFJJ().originVideoInfo.awemeId, LLIFFJFJJ().originVideoInfo.userId);
    }

    @Override // X.AbstractC48231ut, X.AbstractC29891Fh
    public void onCreate() {
        super.onCreate();
        LJZI().Kh().observe(this, new AObserverS70S0100000_2(this, 64));
        ac().LIZLLL(this, new AObjectS84S0100000_2(this, 83));
    }

    @Override // X.AbstractC29891Fh
    public void onDestroy() {
        super.onDestroy();
        C48841JEv.LIZJ(this.LJLLLLLL, null);
        kG();
    }

    @Override // X.AbstractC48231ut, X.InterfaceC145485nM
    public void show() {
        super.show();
        LJJZZI(C6GO.LJLIL);
    }

    @Override // X.AbstractC41331jl
    public InterfaceC65784Pro<C6GQ> LJJLIIIJJI() {
        return this.LJLZ;
    }

    @Override // X.AbstractC41331jl
    public InterfaceC65784Pro<C6GX> LJJLIIIJJIZ() {
        return this.LJZL;
    }

    @Override // X.InterfaceC143985kw
    public C29901Fi<Boolean> ac() {
        return this.LL;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLL;
    }

    private final void LLJ(float f) {
        if (f <= 0.105f) {
            if (ac().LIZJ() == null || o.LJ(ac().LIZJ(), Boolean.FALSE)) {
                ac().LJII(Boolean.TRUE);
                return;
            }
            return;
        }
        if (ac().LIZJ() == null || !o.LJ(ac().LIZJ(), Boolean.TRUE)) {
            return;
        }
        ac().LJII(Boolean.FALSE);
    }

    public final void LLIILZL(InterfaceC153045zY interfaceC153045zY) {
        interfaceC153045zY.LLLFZ((int) LLIFFJFJJ().videoTimeTrimData.startTime, (int) LLIFFJFJJ().videoTimeTrimData.endTime);
        interfaceC153045zY.LLIIJLIL(new InterfaceC133905Ni() { // from class: X.6GM
            @Override // X.InterfaceC133905Ni
            public final void LIZ(int i, int i2, float f, String str) {
                if (i == 4101 && !C6GJ.this.LLIFFJFJJ().videoTimeTrimData.isSingleFrame) {
                    C6GJ.this.LLJJ(new C6HV(1, false));
                }
            }
        });
    }

    public final void LLIIZ(long j) {
        LLIFFJFJJ().videoTimeTrimData.isSingleFrame = true;
        LLJJ(new C6HV(2, false));
        LLJJ(new C6HV(j, VEEditor.SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek, null));
    }

    public final void LLILZLL(long j) {
        LLIFFJFJJ().videoTimeTrimData.endTime = j;
    }

    public final void LLIZ(float f) {
        LJJZZI(new AqS5S0100001_2(f, this, 3));
        LLJ(f);
    }

    public final void LLJI(long j) {
        LLIFFJFJJ().videoTimeTrimData.startTime = j;
    }

    public final void LLJJ(C6HV c6hv) {
        LLIIIL().LK(c6hv);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6GJ(WMH parentScene, C82622Wbi diContainer) {
        super(parentScene);
        o.LJIIIZ(parentScene, "parentScene");
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLL = diContainer;
        this.LJLLI = UCI.LJI(getDiContainer(), InterfaceC144545lq.class, null);
        this.LJLLILLLL = UCI.LJI(getDiContainer(), InterfaceC143655kP.class, null);
        this.LJLLJ = UCI.LJI(getDiContainer(), InterfaceC136385Ww.class, null);
        this.LJLLL = UCI.LJI(getDiContainer(), Video2StickerModel.class, null);
        this.LJLLLL = UCI.LJI(getDiContainer(), InterfaceC144005ky.class, null);
        this.LJLLLLLL = C48841JEv.LIZIZ();
        this.LJLZ = C6GP.LJLIL;
        this.LJZ = new SafeHandler(this);
        this.LJZL = new AqS152S0100000_2(this, BuildConfig.VERSION_CODE);
        this.LL = new C29901Fi<>();
    }
}

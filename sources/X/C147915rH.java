package X;

import Y.AObserverS70S0100000_2;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.5rH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C147915rH extends WJB {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLLI;
    public final LifecycleOwner LJLJI;
    public final C82622Wbi LJLJJI;
    public final C82632Wbs LJLJJL;
    public final C82632Wbs LJLJJLL;
    public final C82632Wbs LJLJL;
    public final C82632Wbs LJLJLJ;
    public final C82632Wbs LJLJLLL;
    public final C148125rc LJLL;

    static {
        TBT tbt = new TBT(C147915rH.class, "editCutMusicApi", "getEditCutMusicApi()Lcom/ss/android/ugc/gamora/editor/cutmusic/EditCutMusicApi;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLLI = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C147915rH.class, "editStickerApi", "getEditStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/core/EditStickerApi;", 0, c65351Pkp), C61845OOz.LIZJ(C147915rH.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0, c65351Pkp), C61845OOz.LIZJ(C147915rH.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0, c65351Pkp), C61845OOz.LIZJ(C147915rH.class, "editToolbarApi", "getEditToolbarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/EditToolbarApi;", 0, c65351Pkp)};
    }

    @Override // X.WJB
    public final void LIZLLL() {
        ((InterfaceC143655kP) this.LJLJL.LIZ(this, LJLLI[2])).Kh().observe(this.LJLJI, new AObserverS70S0100000_2(this, 216));
    }

    @Override // X.WJB
    public final void LJFF() {
        C82632Wbs c82632Wbs = this.LJLJJLL;
        InterfaceC74236TBo<?>[] interfaceC74236TBoArr = LJLLI;
        ((InterfaceC140385f8) c82632Wbs.LIZ(this, interfaceC74236TBoArr[1])).A10().setValue(Boolean.FALSE);
        if (C44384HbQ.LJJIIZ(LJIIIZ())) {
            ((InterfaceC145455nJ) this.LJLJJL.LIZ(this, interfaceC74236TBoArr[0])).hZ(false);
            ((InterfaceC145455nJ) this.LJLJJL.LIZ(this, interfaceC74236TBoArr[0])).C3(true);
            ((InterfaceC145455nJ) this.LJLJJL.LIZ(this, interfaceC74236TBoArr[0])).show();
        }
        ((InterfaceC153275zv) this.LJLJLLL.LIZ(this, interfaceC74236TBoArr[4])).r3();
        C146915pf.LIZIZ(LJIIIZ(), "entrance_icon");
    }

    public final VideoPublishEditModel LJIIIZ() {
        return (VideoPublishEditModel) this.LJLJLJ.LIZ(this, LJLLI[3]);
    }

    @Override // X.WJB
    public final boolean LJIIIIZZ() {
        if (!LJIIIZ().isDuet() && !C44384HbQ.LJZL(LJIIIZ()) && !C44384HbQ.LJJIFFI() && !LJIIIZ().isEnterFromDM() && !C79004UzY.LJJIJL(LJIIIZ().canvasVideoData)) {
            return true;
        }
        return false;
    }

    @Override // X.WJB
    public final WI1 LIZJ() {
        return this.LJLL;
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLJJI;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [X.WI1, X.5rc] */
    public C147915rH(LifecycleOwner lifecycleOwner, C82622Wbi diContainer, C148195rj config) {
        boolean z;
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(config, "config");
        this.LJLJI = lifecycleOwner;
        this.LJLJJI = diContainer;
        this.LJLJJL = UCI.LJI(diContainer, InterfaceC145455nJ.class, null);
        this.LJLJJLL = UCI.LJI(diContainer, InterfaceC147865rC.class, null);
        this.LJLJL = UCI.LJI(diContainer, InterfaceC143655kP.class, null);
        this.LJLJLJ = UCI.LJI(diContainer, VideoPublishEditModel.class, null);
        C82632Wbs LJI = UCI.LJI(diContainer, InterfaceC153275zv.class, null);
        this.LJLJLLL = LJI;
        if (!LJIIIZ().isDuet() && LJIIIZ().getMMusicPath() != null && !LJIIIZ().isStickPointMode && !LJIIIZ().isMvThemeVideoType()) {
            z = true;
        } else {
            z = false;
        }
        final VideoPublishEditModel LJIIIZ = LJIIIZ();
        ?? r2 = new WI1(LJIIIZ) { // from class: X.5rc
            public final int LJIIIZ;
            public final C6MP LJIIJ;

            @Override // X.WI1
            public final int LJI() {
                return R.drawable.b6r;
            }

            @Override // X.WI1
            public final int LJII() {
                return R.string.ed3;
            }

            @Override // X.WI1
            public final WI0 LIZJ() {
                return new WI0(null, this.LJIIIZ, false, 5);
            }

            @Override // X.WI1
            public final C6MP LJIIIIZZ() {
                return this.LJIIJ;
            }

            {
                int i;
                o.LJIIIZ(LJIIIZ, "model");
                if (C151975xp.LIZ(LJIIIZ)) {
                    i = 170;
                } else {
                    i = LiveTryModeCountDownThresholdSetting.DEFAULT;
                }
                this.LJIIIZ = i;
                this.LJIIJ = C6MP.CUT_MUSIC;
            }
        };
        if (LJIIIZ().isStickPointMode) {
            r2.LJIIJ(EnumC147935rJ.DISABLE_CLICK);
        }
        ((InterfaceC153275zv) LJI.LIZ(this, LJLLI[4])).Jf(8, z);
        this.LJLL = r2;
    }
}

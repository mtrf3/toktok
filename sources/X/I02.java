package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.bytedance.jedi.arch.BaseJediViewModel;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.scene.ktx.SceneExtensionsKt;
import com.bytedance.scene.navigation.NavigationScene;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaState;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ClosingChooseMediaPageState;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import com.ss.android.ugc.gamora.recorder.localmedia.LocalMediaArgument;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.AqS50S0110000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class I02 extends AbstractC29891Fh<I0C> implements I0C, InterfaceC135635Tz {
    public static final I0B LJZ;
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJZI;
    public static final float LJZL;
    public final WMH LJLIL;
    public final C82622Wbi LJLILLLLZI;
    public final C5H3 LJLJI;
    public MvChoosePhotoScene LJLJJI;
    public float LJLJJL;
    public float LJLJJLL;
    public boolean LJLJL;
    public final InterfaceC115514g7 LJLJLJ;
    public final InterfaceC115514g7 LJLJLLL;
    public boolean LJLL;
    public boolean LJLLI;
    public boolean LJLLILLLL;
    public final InterfaceC115514g7 LJLLJ;
    public final float LJLLL;
    public final InterfaceC115514g7 LJLLLL;
    public final InterfaceC115514g7 LJLLLLLL;
    public boolean LJLZ;

    static {
        TBT tbt = new TBT(I02.class, "gestureApiComponent", "getGestureApiComponent()Lcom/bytedance/creativex/recorder/gesture/api/GestureApiComponent;", 0);
        C65352Pkq.LIZ.getClass();
        LJZI = new InterfaceC74236TBo[]{tbt, new TBT(I02.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0), new TBT(I02.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0), new TBT(I02.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0), new TBT(I02.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0)};
        LJZ = new I0B();
        LJZL = C7MY.LIZIZ(88);
    }

    public final boolean LJJLI() {
        return true;
    }

    public I0C LJJLIIIIJ() {
        return this;
    }

    public final ChooseMediaViewModel LJJLIIIJILLIZJL() {
        return (ChooseMediaViewModel) this.LJLJI.getValue();
    }

    public final void LJJLJLI() {
        ClosingChooseMediaPageState closingChooseMediaPageState;
        ChooseMediaState Hv0;
        if (!C79057V0z.LJIIZILJ(C78897Uxp.LJJJJ(this.LJLIL), MvChoosePhotoScene.class)) {
            ChooseMediaViewModel LJJLIIIJILLIZJL = LJJLIIIJILLIZJL();
            if (LJJLIIIJILLIZJL != null && (Hv0 = LJJLIIIJILLIZJL.Hv0(this)) != null) {
                closingChooseMediaPageState = Hv0.getClosingChooseMediaPageState();
            } else {
                closingChooseMediaPageState = null;
            }
            if (!o.LJ(closingChooseMediaPageState, ClosingChooseMediaPageState.Ready.INSTANCE)) {
                return;
            }
            HRM hrm = HRM.LIZ;
            ShortVideoContext shortVideoContext = getShortVideoContext();
            hrm.getClass();
            LocalMediaArgument LIZ = HRM.LIZ(shortVideoContext);
            Bundle LIZIZ = HRM.LIZIZ(LIZ, getShortVideoContext());
            LIZIZ.putBoolean("is_slide_scene", true);
            LIZIZ.putBoolean("from_upload_btn_click", true);
            LIZIZ.putLong("click_album_icon_time", System.currentTimeMillis());
            int i = LIZ.requestCode;
            if (i > 0) {
                LIZIZ.putInt("key_start_activity_request_code", i);
            }
            MvChoosePhotoScene mvChoosePhotoScene = new MvChoosePhotoScene();
            mvChoosePhotoScene.mArguments = LIZIZ;
            this.LJLJJI = mvChoosePhotoScene;
            C78897Uxp.LJJJJ(this.LJLIL).LJLJL = null;
            NavigationScene LJJJJ = C78897Uxp.LJJJJ(this.LJLIL);
            MvChoosePhotoScene mvChoosePhotoScene2 = this.LJLJJI;
            if (mvChoosePhotoScene2 != null) {
                LJJJJ.LLJJJJ(mvChoosePhotoScene2, null);
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
    }

    public final InterfaceC82086WJm getCameraApiComponent() {
        return (InterfaceC82086WJm) this.LJLLLL.LIZ(this, LJZI[3]);
    }

    public final InterfaceC82353WTt getGestureApiComponent() {
        return (InterfaceC82353WTt) this.LJLJLJ.LIZ(this, LJZI[0]);
    }

    public final I3X getRecordControlApi() {
        return (I3X) this.LJLJLLL.LIZ(this, LJZI[1]);
    }

    public final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LJLLJ.LIZ(this, LJZI[2]);
    }

    public final I0N getStickerApiComponent() {
        return (I0N) this.LJLLLLLL.LIZ(this, LJZI[4]);
    }

    private final void LJJLIIIJJI() {
        InterfaceC82353WTt gestureApiComponent = getGestureApiComponent();
        if (gestureApiComponent != null) {
            gestureApiComponent.ID(new I04(this), 0, 200);
        }
    }

    private final void LJJLIIIJJIZ() {
        InterfaceC82353WTt gestureApiComponent = getGestureApiComponent();
        if (gestureApiComponent != null) {
            gestureApiComponent.KO(new I05(this));
        }
        InterfaceC82353WTt gestureApiComponent2 = getGestureApiComponent();
        if (gestureApiComponent2 != null) {
            gestureApiComponent2.ID(new I03(this), 14, 200);
        }
    }

    @Override // X.AbstractC29891Fh
    public void onCreate() {
        super.onCreate();
        if (C00F.LIZ(31744, 0, "studio_slide_out_quick_upload_new", true) == 1) {
            AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false).getStoryService();
            if (C43119Gw7.LIZ()) {
                LJJLIIIJJIZ();
                return;
            }
        }
        LJJLIIIJJI();
    }

    @Override // X.I0C
    public boolean Z70() {
        return this.LJLL;
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ I0C getApiComponent() {
        LJJLIIIIJ();
        return this;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLILLLLZI;
    }

    public final void LJJLJ(float f) {
        View view;
        Context context;
        MvChoosePhotoScene mvChoosePhotoScene;
        View view2;
        MvChoosePhotoScene mvChoosePhotoScene2 = this.LJLJJI;
        if (mvChoosePhotoScene2 == null || (view = mvChoosePhotoScene2.mView) == null || (context = view.getContext()) == null || (mvChoosePhotoScene = this.LJLJJI) == null || (view2 = mvChoosePhotoScene.mView) == null) {
            return;
        }
        view2.setTranslationY(Math.max(0.0f, f - C63081OpJ.LJJJJLI(context)));
    }

    @Override // X.I0C
    public void Wq0(boolean z) {
        this.LJLLILLLL = z;
    }

    public I02(WMH parentScene, C82622Wbi diContainer) {
        o.LJIIIZ(parentScene, "parentScene");
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = parentScene;
        this.LJLILLLLZI = diContainer;
        this.LJLJI = C221108m2.LIZIZ(new AqS157S0100000_7(this, 389));
        this.LJLJLJ = UCI.LJII(getDiContainer(), InterfaceC82353WTt.class, null);
        this.LJLJLLL = UCI.LJI(getDiContainer(), I3X.class, null);
        this.LJLLILLLL = true;
        this.LJLLJ = UCI.LJI(getDiContainer(), ShortVideoContext.class, null);
        this.LJLLL = C81184Vtc.LIZLLL(C78688UuS.LJIJJ(this));
        this.LJLLLL = UCI.LJI(getDiContainer(), InterfaceC82086WJm.class, null);
        this.LJLLLLLL = UCI.LJI(getDiContainer(), I0N.class, null);
        this.LJLZ = true;
    }

    private final void LJJLL(boolean z, boolean z2) {
        if (!z2) {
            HRM.LIZJ(HRM.LIZ, this.LJLIL, getShortVideoContext(), z, System.currentTimeMillis(), false, false, null, 112);
        } else {
            LJJLJLI();
        }
    }

    public final void LJJLIIIJLLLLLLLZ(boolean z, boolean z2) {
        C165626ek LIZIZ;
        I3Q.LIZ(I3P.UPLOAD);
        if (V3N.LJJI(getStickerApiComponent().LLLLL().LLJJIJIIJIL())) {
            if (getStickerApiComponent().Q30()) {
                getStickerApiComponent().cp();
            } else {
                getCameraApiComponent().e8().LLZ();
            }
        } else {
            I8E i8e = (I8E) getDiContainer().LJIIIIZZ(null, I8E.class);
            if (i8e != null) {
                i8e.Ps0(null);
            }
        }
        LJJLL(z, z2);
        getCameraApiComponent().tn0(I0A.LIZ);
        if (getShortVideoContext().cameraComponentModel.curBackgroundVideo != null) {
            getStickerApiComponent().Sc0().LJI();
        }
        if (z && !C1DG.LJIIIIZZ() && this.LJLZ) {
            this.LJLZ = false;
            LIZIZ = C163726bg.LIZIZ(SceneExtensionsKt.LIZLLL(r0), this.LJLIL);
            JediViewModel LIZ = LIZIZ.LIZ(ChooseMediaViewModel.class);
            o.LJIIIIZZ(LIZ, "of(parentScene).get(Choo…diaViewModel::class.java)");
            BaseJediViewModel baseJediViewModel = (BaseJediViewModel) LIZ;
            baseJediViewModel.Iv0(this, new TBT() { // from class: X.Hzz
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((ChooseMediaState) obj).getOpeningChooseMediaPageState();
                }
            }, new C73165SnZ(), new AqS173S0100000_7(this, 200));
            baseJediViewModel.Iv0(this, new TBT() { // from class: X.I00
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((ChooseMediaState) obj).getClosingChooseMediaPageState();
                }
            }, new C73165SnZ(), new AqS50S0110000_7(this, z2, 1));
            baseJediViewModel.Iv0(this, new TBT() { // from class: X.I01
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((ChooseMediaState) obj).getAlbumToEditPageState();
                }
            }, new C73165SnZ(), new AqS173S0100000_7(this, 201));
        }
    }

    public static /* synthetic */ void LJJLIIJ(I02 i02, boolean z, boolean z2, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = false;
            }
            if ((i & 2) != 0) {
                z2 = false;
            }
            i02.LJJLIIIJLLLLLLLZ(z, z2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: pauseShootPageAndToUploadActivity");
    }

    public static /* synthetic */ void LJJZZI(I02 i02, boolean z, boolean z2, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = false;
            }
            if ((i & 2) != 0) {
                z2 = false;
            }
            i02.LJJLL(z, z2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toUploadActivity");
    }
}

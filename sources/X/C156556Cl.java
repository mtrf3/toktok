package X;

import Y.AObjectS84S0100000_2;
import Y.AObserverS70S0100000_2;
import Y.ARunnableS5S0201000_2;
import Y.AgS120S0100000_2;
import Y.AgS72S0300000_2;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.router.OnActivityResultCallback;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.poi.PoiData;
import com.ss.android.ugc.aweme.poi.PoiMobParam;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.util.ToolSafeHandler;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.PoiStickerStruct;
import com.ss.android.ugc.tiktok.location.serviceimpl.LocationServiceImpl;
import java.io.Serializable;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6Cl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C156556Cl extends WM7 implements InterfaceC143795kd, InterfaceC1547265k, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJZI;
    public final C82622Wbi LJLIL;
    public InterfaceC152085y0 LJLILLLLZI;
    public final C82631Wbr LJLJI;
    public final C82632Wbs LJLJJI;
    public final C82632Wbs LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public final C82632Wbs LJLJL;
    public final C82632Wbs LJLJLJ;
    public final C82632Wbs LJLJLLL;
    public final C82632Wbs LJLL;
    public ARunnableS5S0201000_2 LJLLI;
    public ToolSafeHandler LJLLILLLL;
    public InterfaceC1549866k<View> LJLLJ;
    public FrameLayout LJLLL;
    public InterfaceC137115Zr LJLLLL;
    public final C1548866a LJLLLLLL;
    public final C62822Ol8 LJLZ;
    public final C62822Ol8 LJZ;

    @Override // X.InterfaceC73141SnB
    public final LifecycleOwner getLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC73150SnK
    public final InterfaceC73141SnB getLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC73149SnJ
    public final AML getReceiver() {
        return this;
    }

    @Override // X.InterfaceC73150SnK
    public final InterfaceC73149SnJ<AML> getReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC73150SnK
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    static {
        TBT tbt = new TBT(C156556Cl.class, "editStickerPanelApi", "getEditStickerPanelApi()Lcom/ss/android/ugc/gamora/editor/sticker/panel/EditStickerPanelApi;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJZI = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C156556Cl.class, "editTextAdapterApi", "getEditTextAdapterApi()Lcom/ss/android/ugc/aweme/sticker/text/EditTextAdapterApi;", 0, c65351Pkp), C61845OOz.LIZJ(C156556Cl.class, "editInfoStickerApi", "getEditInfoStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/info/EditInfoStickerApi;", 0, c65351Pkp), C61845OOz.LIZJ(C156556Cl.class, "editQaStickerApi", "getEditQaStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/qa/EditPageQaStickerApi;", 0, c65351Pkp), C61845OOz.LIZJ(C156556Cl.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0, c65351Pkp), C61845OOz.LIZJ(C156556Cl.class, "publishEditModel", "getPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0, c65351Pkp), C61845OOz.LIZJ(C156556Cl.class, "stickerChallengeManager", "getStickerChallengeManager()Lcom/ss/android/ugc/aweme/infoSticker/StickerChallengeManager;", 0, c65351Pkp), C61845OOz.LIZJ(C156556Cl.class, "editStickerApi", "getEditStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/core/EditStickerApi;", 0, c65351Pkp)};
    }

    public final InterfaceC147865rC LLJILJILJ() {
        return (InterfaceC147865rC) this.LJLL.LIZ(this, LJZI[7]);
    }

    public final VideoPublishEditModel LLJJ() {
        return (VideoPublishEditModel) this.LJLJLJ.LIZ(this, LJZI[5]);
    }

    public final C156526Ci LLJJI() {
        return (C156526Ci) this.LJLZ.getValue();
    }

    public final InterfaceC143655kP getEditPreviewApi() {
        return (InterfaceC143655kP) this.LJLJL.LIZ(this, LJZI[4]);
    }

    @Override // X.WM7
    public final void onDestroyView() {
        super.onDestroyView();
        InterfaceC152085y0 interfaceC152085y0 = this.LJLILLLLZI;
        if (interfaceC152085y0 != null) {
            interfaceC152085y0.LIZ((C6V4) this.LJZ.getValue());
        } else {
            o.LJIJI("gestureService");
            throw null;
        }
    }

    @Override // X.WM7
    public final void onPause() {
        super.onPause();
        ToolSafeHandler toolSafeHandler = this.LJLLILLLL;
        if (toolSafeHandler != null) {
            ARunnableS5S0201000_2 aRunnableS5S0201000_2 = this.LJLLI;
            if (aRunnableS5S0201000_2 != null) {
                toolSafeHandler.removeCallbacks(aRunnableS5S0201000_2);
                return;
            } else {
                o.LJIJI("nonInfoStickerPlayingRefreshTask");
                throw null;
            }
        }
        o.LJIJI("safeHandler");
        throw null;
    }

    @Override // X.WM7
    public final void onResume() {
        super.onResume();
        ToolSafeHandler toolSafeHandler = this.LJLLILLLL;
        if (toolSafeHandler != null) {
            ARunnableS5S0201000_2 aRunnableS5S0201000_2 = this.LJLLI;
            if (aRunnableS5S0201000_2 != null) {
                toolSafeHandler.postDelayed(aRunnableS5S0201000_2, 200L);
                return;
            } else {
                o.LJIJI("nonInfoStickerPlayingRefreshTask");
                throw null;
            }
        }
        o.LJIJI("safeHandler");
        throw null;
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    public C156556Cl(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = diContainer;
        this.LJLJI = UCI.LJII(diContainer, InterfaceC164126cK.class, null);
        this.LJLJJI = UCI.LJI(diContainer, InterfaceC139655dx.class, null);
        this.LJLJJL = UCI.LJI(diContainer, InterfaceC147905rG.class, null);
        UCI.LJI(diContainer, C63K.class, null);
        C221108m2.LIZIZ(new AqS152S0100000_2(this, 490));
        this.LJLJJLL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 489));
        this.LJLJL = UCI.LJI(diContainer, InterfaceC143655kP.class, null);
        this.LJLJLJ = UCI.LJI(diContainer, VideoPublishEditModel.class, null);
        this.LJLJLLL = UCI.LJI(diContainer, C137965bE.class, null);
        this.LJLL = UCI.LJI(diContainer, InterfaceC147865rC.class, null);
        this.LJLLLLLL = new C1548866a(LLJJ());
        this.LJLZ = C221108m2.LIZIZ(new AqS152S0100000_2(this, 491));
        this.LJZ = C221108m2.LIZIZ(new AqS152S0100000_2(this, 488));
    }

    public final void LLJILJIL(InteractStickerStruct interactStickerStruct) {
        LLJJI().LJJIJIIJI(getEditPreviewApi().Kh().getValue(), getEditPreviewApi());
        LLJJI().LJJIZ(interactStickerStruct, true, false);
    }

    @Override // X.WM7
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        getEditPreviewApi().Kh().observe(this, new AObserverS70S0100000_2(this, 119));
        LLJILJILJ().Z60().LIZIZ(this, new AObjectS84S0100000_2(this, 202));
        LLJILJILJ().N4().observe(this, new AObserverS70S0100000_2(this, LiveTryModeCountDownThresholdSetting.DEFAULT));
        ((C63L) this.LJLJJLL.getValue()).LJIIL(LLJILJILJ().N4());
        C156526Ci LLJJI = LLJJI();
        InterfaceC156676Cx interfaceC156676Cx = new InterfaceC156676Cx() { // from class: X.6Cn
            @Override // X.InterfaceC156676Cx
            public final void LIZ() {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                C156556Cl c156556Cl = C156556Cl.this;
                String creationId = c156556Cl.LLJJ().getCreationId();
                o.LJIIIIZZ(creationId, "publishEditModel.creationId");
                linkedHashMap.put("creation_id", creationId);
                String str = c156556Cl.LLJJ().mShootWay;
                o.LJIIIIZZ(str, "publishEditModel.mShootWay");
                linkedHashMap.put("shoot_way", str);
                FMX.LJIIL("prop_change_style", linkedHashMap);
            }

            @Override // X.InterfaceC156676Cx
            public final void LIZIZ() {
                SmartRoute buildRoute = SmartRouter.buildRoute(C156556Cl.this.mActivity, "//poi/search");
                buildRoute.withParam("poi_mob_param", new PoiMobParam(C156556Cl.this.LLJJ().getCreationId(), H8F.LJII(C156556Cl.this.LLJJ()), C156556Cl.this.LLJJ().mShootWay, "click_change_location", "video_edit_page", null, null, 96, null));
                buildRoute.withParam("page_scene", EnumC85244Xcu.LOCATION_STICKER);
                final C156556Cl c156556Cl = C156556Cl.this;
                buildRoute.open(10003, new OnActivityResultCallback() { // from class: X.6Co
                    @Override // com.bytedance.router.OnActivityResultCallback
                    public final void onActivityResult(int i, int i2, Intent intent) {
                        PoiData poiData;
                        if (i == 10003 && i2 == -1) {
                            Serializable serializableExtra = intent.getSerializableExtra("poi_data");
                            if (!(serializableExtra instanceof PoiData) || (poiData = (PoiData) serializableExtra) == null) {
                                return;
                            }
                            C156556Cl c156556Cl2 = C156556Cl.this;
                            InterfaceC164126cK interfaceC164126cK = (InterfaceC164126cK) c156556Cl2.LJLJI.LIZ(c156556Cl2, C156556Cl.LJZI[0]);
                            if (interfaceC164126cK != null) {
                                C164116cJ.LIZ(interfaceC164126cK, false, 0L, 6);
                            }
                            InteractStickerStruct interactStickerStruct = new InteractStickerStruct();
                            String poiId = poiData.getPoiId();
                            if (poiId == null) {
                                poiId = "";
                            }
                            interactStickerStruct.setPoiStickerStruct(new PoiStickerStruct(poiId));
                            interactStickerStruct.getPoiStickerStruct().setPoiData(poiData);
                            C156556Cl.this.LLJILJIL(interactStickerStruct);
                        }
                    }
                });
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("enter_from", "video_edit_page");
                linkedHashMap.put("enter_method", "click_change_location");
                linkedHashMap.putAll(LocationServiceImpl.LJIJJ().getLocationCommonParamsIfHave());
                FMX.LJIIL("enter_poi_search", linkedHashMap);
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                C156556Cl c156556Cl2 = C156556Cl.this;
                String creationId = c156556Cl2.LLJJ().getCreationId();
                o.LJIIIIZZ(creationId, "publishEditModel.creationId");
                linkedHashMap2.put("creation_id", creationId);
                String str = c156556Cl2.LLJJ().mShootWay;
                o.LJIIIIZZ(str, "publishEditModel.mShootWay");
                linkedHashMap2.put("shoot_way", str);
                FMX.LJIIL("prop_change_location", linkedHashMap2);
            }
        };
        LLJJI.getClass();
        LLJJI.LLIIII = interfaceC156676Cx;
        C156426By c156426By = LLJJI.LJLL;
        if (c156426By != null) {
            ((C156626Cs) c156426By).setEditLocationListener$tools_camera_edit_release(interfaceC156676Cx);
        }
        LLJJI().LJLLILLLL = new C6BO() { // from class: X.6Ck
            @Override // X.C6BO
            public final void LIZ() {
            }

            @Override // X.C6BO
            public final void LIZLLL() {
            }

            @Override // X.C6BO
            public final /* synthetic */ void LJI() {
            }

            @Override // X.C6BO
            public final void LJII() {
            }

            @Override // X.C6BO
            public final void LIZIZ() {
                C156556Cl c156556Cl = C156556Cl.this;
                ((C137965bE) c156556Cl.LJLJLLL.LIZ(c156556Cl, C156556Cl.LJZI[6])).LIZJ(C156556Cl.this.LLJJI().LLIFFJFJJ);
            }

            @Override // X.C6BO
            public final void LIZJ() {
                C156556Cl.this.LJLLLLLL.LIZJ(22);
            }

            @Override // X.C6BO
            public final void LJIIIZ() {
                LIZJ();
            }

            @Override // X.C6BO
            public final void LJ(boolean z) {
                C156556Cl c156556Cl = C156556Cl.this;
                C82632Wbs c82632Wbs = c156556Cl.LJLJJL;
                InterfaceC74236TBo<?>[] interfaceC74236TBoArr = C156556Cl.LJZI;
                ((InterfaceC147905rG) c82632Wbs.LIZ(c156556Cl, interfaceC74236TBoArr[2])).LIZLLL();
                C156556Cl c156556Cl2 = C156556Cl.this;
                ((InterfaceC139655dx) c156556Cl2.LJLJJI.LIZ(c156556Cl2, interfaceC74236TBoArr[1])).LIZLLL();
                if (z && !((C63L) C156556Cl.this.LJLJJLL.getValue()).LJIIIIZZ()) {
                    C156556Cl.this.getEditPreviewApi().U2(true, true, true);
                } else {
                    C156556Cl.this.getEditPreviewApi().U2(false, true, false);
                }
            }

            @Override // X.C6BO
            public final void LJFF(boolean z) {
                if (z) {
                    C156556Cl.this.LLJILJILJ().R10(9);
                    WM7 wm7 = C156556Cl.this.mParentScene;
                    o.LJII(wm7, "null cannot be cast to non-null type com.bytedance.scene.group.GroupScene");
                    C63K c63k = (C63K) C44384HbQ.LJJJI((WMH) wm7).LJ(C63K.class);
                    if (c63k != null) {
                        c63k.LIZLLL();
                    }
                    C145995oB LJFF = H8F.LJFF(C156556Cl.this.LLJJ(), true, false, 4);
                    LJFF.LIZ(1, "is_poi_sticker");
                    FMX.LJIIL("prop_more_click", LJFF.LIZ);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.C6BO
            public final void LJIIIIZZ(View view) {
                InterfaceC1549166d<?> interfaceC1549166d;
                o.LJIIIZ(view, "view");
                ((C63L) C156556Cl.this.LJLJJLL.getValue()).LJIILIIL(true);
                if ((view instanceof InterfaceC1549166d) && (interfaceC1549166d = (InterfaceC1549166d) view) != null) {
                    C156556Cl c156556Cl = C156556Cl.this;
                    ((InterfaceC147905rG) c156556Cl.LJLJJL.LIZ(c156556Cl, C156556Cl.LJZI[2])).K2(interfaceC1549166d);
                }
                InterfaceC1549866k<View> interfaceC1549866k = C156556Cl.this.LJLLJ;
                if (interfaceC1549866k != null) {
                    interfaceC1549866k.accept(view);
                }
                C156556Cl.this.LJLLLLLL.LJFF(22);
            }
        };
        this.LJLLILLLL = new ToolSafeHandler(C86793Y4n.LJIJ(this));
        this.LJLLI = new ARunnableS5S0201000_2(this, 0);
    }

    @Override // X.InterfaceC73150SnK
    public final <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns) {
        return (R) C73297Sph.LJIIZILJ(vm1, interfaceC88472Yns);
    }

    @Override // X.InterfaceC1547265k
    public final C10K<C76800UCe> LJJIJIL(InterfaceC153045zY editor, InterfaceC137115Zr compileCallback, InterfaceC88471Ynr<? super String, ? super EnumC43649HBd, String> interfaceC88471Ynr) {
        String draftDir;
        o.LJIIIZ(editor, "editor");
        o.LJIIIZ(compileCallback, "compileCallback");
        if (LLJJI().LJIILLIIL()) {
            if (interfaceC88471Ynr == null || (draftDir = interfaceC88471Ynr.invoke("location_sticker", EnumC43649HBd.LOCATION_STICKER)) == null) {
                draftDir = C5YW.LIZIZ().LJJLI(LLJJ(), "");
            }
            int LIZLLL = compileCallback.LJLLL().LIZLLL();
            int LJI = compileCallback.LJLLL().LJI();
            int i = editor.LLILZ().width;
            int i2 = editor.LLILZ().height;
            C156526Ci LLJJI = LLJJI();
            LLJJI.getClass();
            o.LJIIIZ(draftDir, "draftDir");
            C10K LJIILL = LLJJI.LJI(LIZLLL, LJI, i, i2, draftDir).LJIILL(new AgS120S0100000_2(LLJJI, 38));
            o.LJIIIIZZ(LJIILL, "internal fun compileLoca…else null\n        }\n    }");
            C10K<C76800UCe> LJIILLIIL = LJIILL.LJIILLIIL(new AgS72S0300000_2(editor, this, compileCallback, 4), C10K.LJIIIIZZ);
            o.LJIIIIZZ(LJIILLIIL, "override fun getInteract…ult(Unit)\n        }\n    }");
            return LJIILLIIL;
        }
        C10K<C76800UCe> LJIIIZ = C10K.LJIIIZ(C76800UCe.LIZ);
        o.LJIIIIZZ(LJIIIZ, "{\n            Task.forResult(Unit)\n        }");
        return LJIIIZ;
    }

    @Override // X.WM7
    public final View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        o.LJIIIZ(container, "container");
        FrameLayout frameLayout = (FrameLayout) container;
        LLJJI().getClass();
        InterfaceC153045zY value = getEditPreviewApi().Kh().getValue();
        if (value != null) {
            LLJJI().LJLLLLLL = value.LLILZ();
            LLJJI().LJIJ(this.mActivity, frameLayout);
            InterfaceC152085y0 interfaceC152085y0 = this.LJLILLLLZI;
            if (interfaceC152085y0 != null) {
                interfaceC152085y0.LIZIZ((C6V4) this.LJZ.getValue());
            } else {
                o.LJIJI("gestureService");
                throw null;
            }
        }
        this.LJLLL = frameLayout;
        return new View(requireSceneContext());
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at> InterfaceC92693kP subscribe(JediViewModel<S> jediViewModel, C73165SnZ<S> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super S, C76800UCe> interfaceC88471Ynr) {
        return C73297Sph.LJIIIZ(this, jediViewModel, c73165SnZ, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC143795kd
    public final <S extends InterfaceC61312at, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super InterfaceC143795kd, ? super A, C76800UCe> interfaceC88471Ynr) {
        C73297Sph.LIZJ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C73297Sph.LJ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC143795kd
    public final <S extends InterfaceC61312at, A> void subscribeEvent(JediViewModel<S> jediViewModel, TBW<S, ? extends C45927I0t<? extends A>> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super InterfaceC143795kd, ? super A, C76800UCe> interfaceC88471Ynr) {
        C73297Sph.LJIIJ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, C73165SnZ<TMG> c73165SnZ, InterfaceC88473Ynt<? super AML, ? super A, ? super B, C76800UCe> interfaceC88473Ynt) {
        return C73297Sph.LJFF(this, jediViewModel, tbw, tbw2, c73165SnZ, interfaceC88473Ynt);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, T> InterfaceC92693kP asyncSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends AbstractC26082ALm<? extends T>> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super Throwable, C76800UCe> interfaceC88471Ynr, InterfaceC88472Yns<? super AML, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super AML, ? super T, C76800UCe> interfaceC88471Ynr2) {
        return C73297Sph.LIZ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr, interfaceC88472Yns, interfaceC88471Ynr2);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B, C> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, C73165SnZ<C157166Eu> c73165SnZ, InterfaceC88474Ynu<? super AML, ? super A, ? super B, ? super C, C76800UCe> interfaceC88474Ynu) {
        return C73297Sph.LJI(this, jediViewModel, tbw, tbw2, tbw3, c73165SnZ, interfaceC88474Ynu);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B, C, D> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, C73165SnZ<W1T> c73165SnZ, InterfaceC88475Ynv<? super AML, ? super A, ? super B, ? super C, ? super D, C76800UCe> interfaceC88475Ynv) {
        return C73297Sph.LJII(this, jediViewModel, tbw, tbw2, tbw3, tbw4, c73165SnZ, interfaceC88475Ynv);
    }
}

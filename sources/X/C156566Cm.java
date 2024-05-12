package X;

import android.content.Intent;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.OnActivityResultCallback;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.poi.PoiData;
import com.ss.android.ugc.aweme.poi.PoiMobParam;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.PoiStickerStruct;
import com.ss.android.ugc.tiktok.location.serviceimpl.LocationServiceImpl;
import com.ss.android.vesdk.VESize;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.6Cm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C156566Cm extends AbstractC29891Fh<C63L> implements C63L, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJLLL;
    public final C82622Wbi LJLIL;
    public final WMH LJLILLLLZI;
    public final int LJLJI;
    public final InterfaceC115514g7 LJLJJI;
    public final InterfaceC115514g7 LJLJJL;
    public C156556Cl LJLJJLL;
    public MutableLiveData<Boolean> LJLJL;
    public final C5H3 LJLJLJ;

    static {
        TBT tbt = new TBT(C156566Cm.class, "infoStickerApi", "getInfoStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/info/EditInfoStickerApi;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLJLLL = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C156566Cm.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0, c65351Pkp)};
    }

    public C63L LJJLI() {
        return this;
    }

    private final VideoPublishEditModel LJJLIIIIJ() {
        return (VideoPublishEditModel) this.LJLJJL.LIZ(this, LJLJLLL[1]);
    }

    @Override // X.C63L
    public InterfaceC147435qV LIZ() {
        C156556Cl c156556Cl = this.LJLJJLL;
        if (c156556Cl != null) {
            return c156556Cl.LLJJI();
        }
        return null;
    }

    @Override // X.C63L
    public void LIZLLL() {
        C156556Cl c156556Cl = this.LJLJJLL;
        if (c156556Cl != null) {
            c156556Cl.LLJJI().LJIIZILJ();
        }
    }

    @Override // X.C63L
    public boolean LJIIIIZZ() {
        Boolean value;
        MutableLiveData<Boolean> mutableLiveData = this.LJLJL;
        if (mutableLiveData == null || (value = mutableLiveData.getValue()) == null) {
            return false;
        }
        return value.booleanValue();
    }

    @Override // X.C63L
    public boolean LJIILL() {
        C156556Cl c156556Cl = this.LJLJJLL;
        if (c156556Cl == null || !c156556Cl.LLJJI().LJIL()) {
            return false;
        }
        return true;
    }

    @Override // X.C63L
    public boolean LJIJJLI() {
        C156556Cl c156556Cl = this.LJLJJLL;
        if (c156556Cl != null) {
            return c156556Cl.LLJJI().LJIILLIIL();
        }
        return false;
    }

    @Override // X.C63L
    public void LJJIII() {
        C156556Cl c156556Cl = this.LJLJJLL;
        if (c156556Cl != null) {
            c156556Cl.LLJJI().LJJII();
        }
    }

    @Override // X.C63L
    public void LJJJJ() {
        C156556Cl c156556Cl = this.LJLJJLL;
        if (c156556Cl != null) {
            c156556Cl.LLJJI().LJJIJIL();
        }
    }

    public final InterfaceC147905rG LJJLIIIJILLIZJL() {
        return (InterfaceC147905rG) this.LJLJJI.LIZ(this, LJLJLLL[0]);
    }

    public final MutableLiveData<Float> LJJLIIIJJI() {
        return (MutableLiveData) this.LJLJLJ.getValue();
    }

    @Override // X.C63L
    public InteractStickerStruct getInteractStickerStruct() {
        C156556Cl c156556Cl = this.LJLJJLL;
        if (c156556Cl != null) {
            return c156556Cl.LLJJI().getInteractStickerStruct();
        }
        return null;
    }

    @Override // X.C63L
    public void show() {
        if (this.LJLJJLL != null) {
            return;
        }
        final C156556Cl c156556Cl = new C156556Cl(getDiContainer());
        c156556Cl.LJLILLLLZI = (InterfaceC152085y0) c156556Cl.LJLIL.LJ(InterfaceC152085y0.class, null);
        c156556Cl.LLJJI().LJLJJI = (AnonymousClass655) c156556Cl.LJLIL.LJ(AnonymousClass655.class, null);
        c156556Cl.LLJJI().LJLJI = H7R.LJJJJI(LJJLIIIIJ());
        c156556Cl.LJLLLL = (InterfaceC137115Zr) c156556Cl.LJLIL.LJ(InterfaceC137115Zr.class, null);
        if (this.LJLILLLLZI.isAdded(c156556Cl)) {
            return;
        }
        this.LJLJJLL = c156556Cl;
        this.LJLILLLLZI.add(this.LJLJI, c156556Cl, "EditLocationStickerScene");
        c156556Cl.LJLLJ = new InterfaceC1549866k(this) { // from class: X.6Cr
            public final /* synthetic */ C156566Cm LIZIZ;

            {
                this.LIZIZ = this;
            }

            @Override // X.InterfaceC1549866k
            public final void accept(Object obj) {
                KeyEvent.Callback view = (View) obj;
                C156556Cl c156556Cl2 = c156556Cl;
                o.LJIIIIZZ(view, "view");
                c156556Cl2.getClass();
                if (view instanceof C156636Ct) {
                    this.LIZIZ.LJJLIIIJILLIZJL().K2((InterfaceC1549166d) view);
                }
            }
        };
        c156556Cl.LLJJI().LLFII = new C6BQ() { // from class: X.6Cq
            @Override // X.C6BQ
            public final void LIZ(C156426By c156426By, C156426By newTopView) {
                if (C156566Cm.this.LJIIIIZZ()) {
                    C156556Cl c156556Cl2 = c156556Cl;
                    o.LJIIIIZZ(newTopView, "newTopView");
                    c156556Cl2.getClass();
                    if (newTopView instanceof C156626Cs) {
                        InterfaceC147905rG LJJLIIIJILLIZJL = C156566Cm.this.LJJLIIIJILLIZJL();
                        KeyEvent.Callback drawView = newTopView.getDrawView();
                        o.LJII(drawView, "null cannot be cast to non-null type com.ss.android.ugc.aweme.editSticker.interact.TimeEditable<*>");
                        LJJLIIIJILLIZJL.I9((InterfaceC1549166d) drawView);
                        C156566Cm.this.LJJLIIIJILLIZJL().k();
                    }
                }
            }
        };
    }

    @Override // X.C63L
    public void LJJ() {
        List<InteractStickerStruct> LJI = C164826dS.LJI(LJJLIIIIJ().getMainBusinessContext(), 13, EnumC164816dR.TRACK_PAGE_EDIT);
        if (LJI == null || LJI.isEmpty()) {
            return;
        }
        show();
        C156556Cl c156556Cl = this.LJLJJLL;
        if (c156556Cl == null) {
            return;
        }
        c156556Cl.LLJJI().LJJIJIIJI(c156556Cl.getEditPreviewApi().Kh().getValue(), c156556Cl.getEditPreviewApi());
        if (LJI == null || LJI.isEmpty()) {
            return;
        }
        c156556Cl.LLJJI().LJJIZ((InteractStickerStruct) ListProtector.get(LJI, 0), false, true);
        c156556Cl.LLJJI().LJJIFFI((InteractStickerStruct) ListProtector.get(LJI, 0));
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ C63L getApiComponent() {
        LJJLI();
        return this;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    @Override // X.C63L
    public void An0(InterfaceC137115Zr callback) {
        o.LJIIIZ(callback, "callback");
        C156556Cl c156556Cl = this.LJLJJLL;
        if (c156556Cl != null) {
            c156556Cl.LJLLLL = callback;
        }
    }

    @Override // X.C63L
    public void LJIIL(MutableLiveData<Boolean> liveData) {
        o.LJIIIZ(liveData, "liveData");
        this.LJLJL = liveData;
    }

    @Override // X.C63L
    public void LJIILIIL(boolean z) {
        MutableLiveData<Boolean> mutableLiveData = this.LJLJL;
        if (mutableLiveData != null && !o.LJ(mutableLiveData.getValue(), Boolean.valueOf(z))) {
            mutableLiveData.setValue(Boolean.valueOf(z));
        }
    }

    @Override // X.C63L
    public void LJIILLIIL(String stickerId) {
        o.LJIIIZ(stickerId, "stickerId");
        C156556Cl c156556Cl = this.LJLJJLL;
        if (c156556Cl != null) {
            c156556Cl.LLJJI().LLIFFJFJJ = stickerId;
        }
    }

    @Override // X.C63L
    public void LJIJJ(boolean z) {
        C156556Cl c156556Cl = this.LJLJJLL;
        if (c156556Cl != null) {
            C156526Ci LLJJI = c156556Cl.LLJJI();
            LLJJI.LLFF = z;
            if (z) {
                C156426By c156426By = LLJJI.LJLL;
                if ((c156426By instanceof C156626Cs) && c156426By != null) {
                    c156426By.LJIILL();
                }
            }
        }
    }

    @Override // X.C63L
    public void LJIL(float f) {
        C156556Cl c156556Cl = this.LJLJJLL;
        if (c156556Cl != null) {
            c156556Cl.LLJJI().LJJIIJ(f);
        }
    }

    @Override // X.C63L
    public void LJJI(boolean z) {
        C156556Cl c156556Cl = this.LJLJJLL;
        if (c156556Cl != null) {
            c156556Cl.LLJJI().LJLILLLLZI = z;
        }
    }

    @Override // X.C63L
    public void LJJII(VESize size) {
        o.LJIIIZ(size, "size");
        C156556Cl c156556Cl = this.LJLJJLL;
        if (c156556Cl != null) {
            c156556Cl.LLJJI().LJLLLLLL = size;
        }
    }

    @Override // X.C63L
    public void LJJJI(String stickerPath) {
        o.LJIIIZ(stickerPath, "stickerPath");
        C156556Cl c156556Cl = this.LJLJJLL;
        if (c156556Cl != null) {
            c156556Cl.LLJJI().LJJIJ(stickerPath);
        }
    }

    @Override // X.C63L
    public void LJLJL(AnonymousClass655 deleteComponent) {
        o.LJIIIZ(deleteComponent, "deleteComponent");
        C156556Cl c156556Cl = this.LJLJJLL;
        if (c156556Cl != null) {
            c156556Cl.LLJJI().LJLJJI = deleteComponent;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C63L
    public void Ta0(ActivityC45651qj activity) {
        o.LJIIIZ(activity, "activity");
        final C156556Cl c156556Cl = this.LJLJJLL;
        if (c156556Cl != null) {
            LinkedHashMap LIZIZ = JF1.LIZIZ("enter_from", "video_edit_page", "enter_method", "click_location_sticker");
            LIZIZ.putAll(LocationServiceImpl.LJIJJ().getLocationCommonParamsIfHave());
            FMX.LJIIL("enter_poi_search", LIZIZ);
            SmartRoute buildRoute = SmartRouter.buildRoute(activity, "//poi/search");
            buildRoute.withParam("poi_mob_param", new PoiMobParam(c156556Cl.LLJJ().getCreationId(), H8F.LJII(c156556Cl.LLJJ()), c156556Cl.LLJJ().mShootWay, "click_location_sticker", "video_edit_page", null, 0 == true ? 1 : 0, 96, 0 == true ? 1 : 0));
            buildRoute.withParam("page_scene", EnumC85244Xcu.LOCATION_STICKER);
            buildRoute.open(10003, new OnActivityResultCallback() { // from class: X.6Cp
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
        }
    }

    @Override // X.C63L
    public boolean bk(View view) {
        o.LJIIIZ(view, "view");
        if (this.LJLJJLL != null) {
            return view instanceof C156626Cs;
        }
        return false;
    }

    @Override // X.C63L
    public boolean hb(View view) {
        o.LJIIIZ(view, "view");
        if (this.LJLJJLL != null) {
            return view instanceof C156636Ct;
        }
        return false;
    }

    @Override // X.C63L
    public void pg0(C6BQ<C156426By, C156426By> onChangeIndexToTopListener) {
        o.LJIIIZ(onChangeIndexToTopListener, "onChangeIndexToTopListener");
        C156556Cl c156556Cl = this.LJLJJLL;
        if (c156556Cl != null) {
            c156556Cl.LLJJI().LLFII = onChangeIndexToTopListener;
        }
    }

    @Override // X.C63L
    public void rC(InterfaceC1549866k<View> listener) {
        o.LJIIIZ(listener, "listener");
        C156556Cl c156556Cl = this.LJLJJLL;
        if (c156556Cl != null) {
            c156556Cl.LJLLJ = listener;
        }
    }

    @Override // X.C63L
    public void w50(InterfaceC152085y0 gestureService) {
        o.LJIIIZ(gestureService, "gestureService");
        C156556Cl c156556Cl = this.LJLJJLL;
        if (c156556Cl != null) {
            c156556Cl.LJLILLLLZI = gestureService;
        }
    }

    public C156566Cm(C82622Wbi diContainer, WMH parentScene, int i) {
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(parentScene, "parentScene");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = parentScene;
        this.LJLJI = i;
        this.LJLJJI = UCI.LJI(getDiContainer(), InterfaceC147905rG.class, null);
        this.LJLJJL = UCI.LJI(getDiContainer(), VideoPublishEditModel.class, null);
        this.LJLJLJ = C221108m2.LIZIZ(C147815r7.LJLIL);
    }

    @Override // X.C63L
    public C10K<C76800UCe> LJJIJIL(InterfaceC153045zY editor, InterfaceC137115Zr compileCallback, InterfaceC88471Ynr<? super String, ? super EnumC43649HBd, String> interfaceC88471Ynr) {
        o.LJIIIZ(editor, "editor");
        o.LJIIIZ(compileCallback, "compileCallback");
        C156556Cl c156556Cl = this.LJLJJLL;
        if (c156556Cl != null) {
            return c156556Cl.LJJIJIL(editor, compileCallback, interfaceC88471Ynr);
        }
        C10K<C76800UCe> LJIIIZ = C10K.LJIIIZ(C76800UCe.LIZ);
        o.LJIIIIZZ(LJIIIZ, "forResult(Unit)");
        return LJIIIZ;
    }
}

package X;

import Y.AObjectS119S0200000_14;
import Y.AObjectS71S0300000_14;
import Y.AObjectS89S0100000_14;
import Y.ARunnableS25S0300000_14;
import Y.ARunnableS50S0100000_14;
import android.content.SharedPreferences;
import android.graphics.RectF;
import android.text.TextUtils;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.als.LiveEvent;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.scene.ktx.SceneExtensionsKt;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ui.TikTokCameraBaseGroupScene;
import com.ss.android.ugc.aweme.utils.UniqueLiveData;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.AqS67S1100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.WSv */
/* loaded from: classes15.dex */
public class C82329WSv extends AbstractC29891Fh<InterfaceC45979I2t> implements InterfaceC143795kd, InterfaceC45979I2t, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] $$delegatedProperties;
    public static final WTR Companion;
    public static final List<String> recordModelTags;
    public final C40871j1<WS0> _bottomTabIndexChangeEvent;
    public final C29901Fi<String> _sharedARTabIndexChangeEvent;
    public boolean albumTabIsDefaultSelected;
    public boolean albumTabIsSelected;
    public final InterfaceC45979I2t apiComponent;
    public final C0IB<WS0> bottomTabIndexChangeEvent;
    public final WSE bottomTabManager;
    public final C81521Vz3 bottomTabScene;
    public final List<WSH> bottoms;
    public final InterfaceC115514g7 cameraApiComponent$delegate;
    public final C40871j1<Integer> complexTabVisibility;
    public final C82622Wbi diContainer;
    public final C5H3 enableSwitchDurationAfterRecording$delegate;
    public boolean hasSelectDefaultTab;
    public boolean isCurrentForbidAudioTab;
    public final InterfaceC115514g7 nowsSwitchApiComponent$delegate;
    public final WMH parentScene;
    public final InterfaceC45999I3n planCUiApiComponent;
    public final InterfaceC115514g7 recordAdapterApi$delegate;
    public final InterfaceC115514g7 recordControlApi$delegate;
    public C45850Hz4 recordEnv;
    public final InterfaceC115514g7 recordPermissionApiComponent$delegate;
    public final InterfaceC115514g7 rootScene$delegate;
    public final C29901Fi<Integer> setBottomTabEndMargin;
    public final C29901Fi<Integer> setBottomTabStartMargin;
    public final LiveEvent<String> sharedARTabIndexChangeEvent;
    public final InterfaceC115514g7 shortVideoContext$delegate;
    public final C29901Fi<Boolean> showBottomTabEvent;
    public final C46611sH<Integer> showLiveTagState;
    public final InterfaceC115514g7 stickerApiComponent$delegate;
    public final C5H3 switchDurationConfigFactory$delegate;

    @Override // X.InterfaceC73141SnB
    public LifecycleOwner getLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC73150SnK
    public InterfaceC73141SnB getLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC73149SnJ
    /* renamed from: getReceiver */
    public AML getReceiver2() {
        return this;
    }

    @Override // X.InterfaceC73150SnK
    public InterfaceC73149SnJ<AML> getReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC73150SnK
    public boolean getUniqueOnlyGlobal() {
        return true;
    }

    @Override // X.InterfaceC45979I2t
    public void showComplexTab(int i, WS0 ws0) {
    }

    @Override // X.InterfaceC45979I2t
    public void switchToPreviousTab() {
    }

    static {
        TBT tbt = new TBT(C82329WSv.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/TikTokCameraApiComponent;", 0);
        C65352Pkq.LIZ.getClass();
        $$delegatedProperties = new InterfaceC74236TBo[]{tbt, new TBT(C82329WSv.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0), new TBT(C82329WSv.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0), new TBT(C82329WSv.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0), new TBT(C82329WSv.class, "nowsSwitchApiComponent", "getNowsSwitchApiComponent()Lcom/ss/android/ugc/aweme/nows/combination/NowsSwitcherApi;", 0), new TBT(C82329WSv.class, "recordPermissionApiComponent", "getRecordPermissionApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/ui/permissionmanager/RecordPermissionUIApiComponent;", 0), new TBT(C82329WSv.class, "rootScene", "getRootScene()Lcom/ss/android/ugc/aweme/shortvideo/ui/TikTokCameraBaseGroupScene;", 0), new TBT(C82329WSv.class, "recordAdapterApi", "getRecordAdapterApi()Lcom/ss/android/ugc/aweme/shortvideo/adapter/RecordAdapterApi;", 0)};
        Companion = new WTR();
        recordModelTags = C47261Igj.LJJIJIIJI(C60903NvH.LJ.getString(R.string.pw1), C60903NvH.LJ.getString(R.string.pvy), C60903NvH.LJ.getString(R.string.pvz));
    }

    private final WLB getRecordAdapterApi() {
        return (WLB) this.recordAdapterApi$delegate.LIZ(this, $$delegatedProperties[7]);
    }

    private final I3X getRecordControlApi() {
        return (I3X) this.recordControlApi$delegate.LIZ(this, $$delegatedProperties[1]);
    }

    private final C45962I2c getSwitchDurationConfigFactory() {
        return (C45962I2c) this.switchDurationConfigFactory$delegate.getValue();
    }

    @Override // X.InterfaceC45979I2t
    public int bottomTabSize() {
        return ((ArrayList) this.bottomTabManager.LIZLLL).size();
    }

    @Override // X.InterfaceC45979I2t
    public String defaultBottomTab() {
        List<WSI> list = this.bottomTabManager.LIZLLL;
        if (C79004UzY.LJJIFFI(list)) {
            return null;
        }
        Iterator<WSI> it = list.iterator();
        while (it.hasNext()) {
            WSF wsf = it.next().LIZ;
            if (wsf.LIZLLL) {
                return wsf.LIZIZ;
            }
        }
        return null;
    }

    @Override // X.InterfaceC45979I2t
    public String getAvailableRecordCombineTag() {
        WSI wsi;
        WSF wsf;
        Iterator<WSI> it = this.bottomTabManager.LIZLLL.iterator();
        while (true) {
            if (it.hasNext()) {
                wsi = it.next();
                if (recordModelTags.contains(wsi.LIZ.LIZIZ)) {
                    break;
                }
            } else {
                wsi = null;
                break;
            }
        }
        WSI wsi2 = wsi;
        if (wsi2 == null || (wsf = wsi2.LIZ) == null) {
            return null;
        }
        return wsf.LIZIZ;
    }

    @Override // X.InterfaceC45979I2t
    public RectF getBottomTabRectF() {
        ViewOnTouchListenerC81419VxP viewOnTouchListenerC81419VxP = this.bottomTabScene.LJLJJI;
        if (viewOnTouchListenerC81419VxP != null) {
            return C1JI.LJIIZILJ(viewOnTouchListenerC81419VxP);
        }
        o.LJIJI("tabHost");
        throw null;
    }

    public final WRQ getCameraApiComponent() {
        return (WRQ) this.cameraApiComponent$delegate.LIZ(this, $$delegatedProperties[0]);
    }

    @Override // X.InterfaceC45979I2t
    public WSF getCurrentBottomTabItem() {
        WSE wse = this.bottomTabManager;
        List<WSI> list = wse.LIZLLL;
        ViewOnTouchListenerC81419VxP viewOnTouchListenerC81419VxP = wse.LJII;
        if (viewOnTouchListenerC81419VxP != null) {
            WSI wsi = (WSI) ORZ.LJLLLLLL(viewOnTouchListenerC81419VxP.getCurrentIndex(), list);
            if (wsi == null) {
                return null;
            }
            return wsi.LIZ;
        }
        o.LJIJI("bottomTabHost");
        throw null;
    }

    @Override // X.InterfaceC45979I2t
    public WSF getCurrentBottomTabItemBeforeOnTabChanged() {
        WSF wsf = this.bottomTabManager.LJIIJJI;
        if (wsf == null) {
            return getCurrentBottomTabItem();
        }
        return wsf;
    }

    @Override // X.InterfaceC45979I2t
    public String getCurrentBottomTag() {
        return this.bottomTabManager.LIZLLL();
    }

    public final boolean getEnableSwitchDurationAfterRecording() {
        return ((Boolean) this.enableSwitchDurationAfterRecording$delegate.getValue()).booleanValue();
    }

    public final InterfaceC82325WSr getNowsSwitchApiComponent() {
        return (InterfaceC82325WSr) this.nowsSwitchApiComponent$delegate.LIZ(this, $$delegatedProperties[4]);
    }

    public final I8W getRecordPermissionApiComponent() {
        return (I8W) this.recordPermissionApiComponent$delegate.LIZ(this, $$delegatedProperties[5]);
    }

    public final TikTokCameraBaseGroupScene getRootScene() {
        return (TikTokCameraBaseGroupScene) this.rootScene$delegate.LIZ(this, $$delegatedProperties[6]);
    }

    public final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.shortVideoContext$delegate.LIZ(this, $$delegatedProperties[2]);
    }

    public final I0N getStickerApiComponent() {
        return (I0N) this.stickerApiComponent$delegate.LIZ(this, $$delegatedProperties[3]);
    }

    @Override // X.InterfaceC45979I2t
    public void hidePopupForLiveTab() {
        C81438Vxi c81438Vxi = this.bottomTabManager.LJI;
        if (c81438Vxi != null) {
            InterfaceC82683Wch interfaceC82683Wch = c81438Vxi.LIZLLL;
            if (interfaceC82683Wch != null) {
                interfaceC82683Wch.dismiss();
                return;
            }
            return;
        }
        o.LJIJI("tabConfig");
        throw null;
    }

    @Override // X.InterfaceC45979I2t
    public boolean isLiveJumpChangeSwitchOpen() {
        String str;
        boolean z = false;
        if (C38891fp.LJJI(this.bottomTabManager.LIZLLL)) {
            return false;
        }
        for (WSI wsi : this.bottomTabManager.LIZLLL) {
            WT3 wt3 = wsi.LIZIZ;
            if (wt3 != null) {
                str = wt3.getTag();
            } else {
                str = null;
            }
            if (o.LJ("RecordLiveScene", str)) {
                z = wsi.LIZIZ.LLJILJILJ();
            }
        }
        return z;
    }

    @Override // X.InterfaceC45979I2t
    public boolean isLiveReuseSwitchOpen() {
        String str;
        boolean z = false;
        if (C38891fp.LJJI(this.bottomTabManager.LIZLLL)) {
            return false;
        }
        for (WSI wsi : this.bottomTabManager.LIZLLL) {
            WT3 wt3 = wsi.LIZIZ;
            if (wt3 != null) {
                str = wt3.getTag();
            } else {
                str = null;
            }
            if (o.LJ("RecordLiveScene", str)) {
                z = wsi.LIZIZ.LLJJ();
            }
        }
        return z;
    }

    @Override // X.InterfaceC45979I2t
    public boolean isValid() {
        return !SceneExtensionsKt.LIZ(this.parentScene);
    }

    @Override // X.InterfaceC45979I2t
    public boolean isZTLiveSwitch() {
        String str;
        boolean z = false;
        if (C38891fp.LJJI(this.bottomTabManager.LIZLLL)) {
            return false;
        }
        for (WSI wsi : this.bottomTabManager.LIZLLL) {
            WT3 wt3 = wsi.LIZIZ;
            if (wt3 != null) {
                str = wt3.getTag();
            } else {
                str = null;
            }
            if (o.LJ("RecordLiveScene", str)) {
                z = wsi.LIZIZ.LLJJIII();
            }
        }
        return z;
    }

    @Override // X.InterfaceC45979I2t
    public void mvBackToRecordPage() {
        String str = this.bottomTabManager.LJIIJ;
        if (str == null) {
            str = C78688UuS.LJJJI(R.string.pvz);
        } else if (o.LJ(str, "record_mode_duet") || o.LJ(str, "DUET_MODE_CAMERA_RECORD") || o.LJ(str, C78688UuS.LJJJI(R.string.pwa))) {
            str = C78688UuS.LJJJI(R.string.pvz);
        }
        int LLJILJIL = this.bottomTabScene.LLJILJIL(str);
        if (LLJILJIL < 0) {
            LLJILJIL = this.bottomTabScene.LLJILJIL(C60903NvH.LJIIJJI().LJJIII().getDefaultShootTabTag(getShortVideoContext()));
        }
        this.bottomTabScene.LLJJIII(LLJILJIL, true, true);
    }

    @Override // X.InterfaceC45979I2t
    public void onRetake() {
        this.bottomTabManager.LIZJ(true);
        showBottomTab(true);
    }

    @Override // X.InterfaceC45979I2t
    public void onStartRecord() {
        this.bottomTabManager.LIZJ(false);
        showBottomTab(false);
        ShortVideoContext shortVideoContext = getShortVideoContext();
        int i = shortVideoContext.shootedShootMode;
        int i2 = shortVideoContext.shootMode;
        if (i != i2) {
            shortVideoContext.shootedShootMode = i2;
            SharedPreferences.Editor edit = F9J.LIZIZ(C60903NvH.LJ, 0, "publish").edit();
            edit.putInt("shooted_shoot_mode", i2);
            WX6.LIZ(edit);
        }
    }

    @Override // X.InterfaceC45979I2t
    public C45850Hz4 provideRecordEnv() {
        C45850Hz4 c45850Hz4 = this.recordEnv;
        if (c45850Hz4 != null) {
            return c45850Hz4;
        }
        o.LJIJI("recordEnv");
        throw null;
    }

    @Override // X.InterfaceC45979I2t
    public void showAllTabsAndExitDuetMode() {
        this.bottomTabManager.LJII("DUET_MODE_CAMERA_RECORD");
        int i = 0;
        for (WSI wsi : this.bottomTabManager.LIZLLL) {
            int i2 = i + 1;
            if (i >= 0) {
                this.bottomTabManager.LIZIZ(i, wsi);
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        setCurrentTab("record_mode_duet", true, 6);
    }

    @Override // X.InterfaceC45979I2t
    public void showOnlyVideosTab() {
        Iterator it = ((ArrayList) this.bottomTabManager.LIZLLL).iterator();
        while (it.hasNext()) {
            this.bottomTabManager.LJII(((WSI) it.next()).LIZ.LIZIZ);
        }
        this.bottomTabManager.LIZIZ(-1, new WSI(new WSF(C78688UuS.LJJJI(R.string.pvx)), null));
        setCurrentTab("DUET_MODE_CAMERA_RECORD", true, 5);
    }

    @Override // X.InterfaceC45979I2t
    public void tryShowPopupForLiveTab() {
        this.bottomTabManager.LJIIL();
    }

    private final void handleBackFromTextMode() {
        String string = C78688UuS.LJIJJ(this).getString(R.string.pw8);
        o.LJIIIIZZ(string, "activity.getString(R.str…mode_lightening_text_tag)");
        if (o.LJ(this.bottomTabManager.LIZLLL(), string)) {
            String defaultBottomTab = defaultBottomTab();
            if (defaultBottomTab != null) {
                C81521Vz3 c81521Vz3 = this.bottomTabScene;
                ViewOnTouchListenerC81419VxP viewOnTouchListenerC81419VxP = c81521Vz3.LJLJJI;
                if (viewOnTouchListenerC81419VxP != null) {
                    viewOnTouchListenerC81419VxP.LJII(c81521Vz3.LLJILJIL(defaultBottomTab), 7, true);
                    if (C76800UCe.LIZ != null) {
                        return;
                    }
                } else {
                    o.LJIJI("tabHost");
                    throw null;
                }
            }
            ViewOnTouchListenerC81419VxP viewOnTouchListenerC81419VxP2 = this.bottomTabScene.LJLJJI;
            if (viewOnTouchListenerC81419VxP2 != null) {
                viewOnTouchListenerC81419VxP2.LJII(viewOnTouchListenerC81419VxP2.getLastIndex(), 7, true);
            } else {
                o.LJIJI("tabHost");
                throw null;
            }
        }
    }

    @Override // X.InterfaceC45979I2t
    public boolean couldShowToolbar() {
        if (TextUtils.equals(getCurrentBottomTag(), "record_mode_duet") || TextUtils.equals(getCurrentBottomTag(), "record_mode_live") || TextUtils.equals(getCurrentBottomTag(), "record_mode_mv")) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC45979I2t
    public boolean isCurrentTabNeedCamera() {
        if (!o.LJ(getCurrentBottomTag(), "record_mode_mv") && !o.LJ(getCurrentBottomTag(), C78688UuS.LJIJJ(this).getString(R.string.pwi)) && !o.LJ(getCurrentBottomTag(), "RecordAlbum")) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC29891Fh
    public void onCreate() {
        super.onCreate();
        getRecordAdapterApi().oA(this);
        Object LIZ = this.parentScene.getScope().LIZ("record_env_context");
        o.LJI(LIZ);
        C45850Hz4 c45850Hz4 = (C45850Hz4) LIZ;
        this.recordEnv = c45850Hz4;
        this.bottomTabManager.LJFF(c45850Hz4, this.bottoms, this._bottomTabIndexChangeEvent, this._sharedARTabIndexChangeEvent);
        List<WSI> list = this.bottomTabManager.LIZLLL;
        if (onlyShowLiveTab(this.parentScene)) {
            return;
        }
        Iterator<WSI> it = list.iterator();
        while (it.hasNext()) {
            WT3 wt3 = it.next().LIZIZ;
            if (wt3 != null) {
                C79234V7u.LIZIZ(this.parentScene, R.id.iri, wt3, wt3.getTag());
            }
        }
        this.parentScene.add(R.id.iri, this.bottomTabScene, "RecordBottomTabScene");
        init(this.parentScene, list);
        SceneExtensionsKt.LIZIZ(this.bottomTabScene, new ARunnableS50S0100000_14(this, 112));
        getSharedARTabIndexChangeEvent().LIZLLL(this, new AObjectS89S0100000_14(this, 209));
        getBottomTabIndexChangeEvent().LIZIZ(this, new AObjectS89S0100000_14(this, 210));
        getRecordControlApi().Vh().LIZLLL(this, new AObjectS89S0100000_14(this, 211));
        getRecordControlApi().w90().LIZLLL(this, new AObjectS89S0100000_14(this, 212));
        this.setBottomTabStartMargin.LIZLLL(this, new AObjectS89S0100000_14(this, 213));
        this.setBottomTabEndMargin.LIZLLL(this, new AObjectS89S0100000_14(this, 214));
        getRecordControlApi().aL().LIZLLL(this, new AObjectS89S0100000_14(this, 204));
        getRecordControlApi().Qr0().LIZLLL(this, new AObjectS89S0100000_14(this, 205));
        getRecordControlApi().Gg0().LIZLLL(this, new AObjectS89S0100000_14(this, 206));
        getCameraApiComponent().md0().LIZLLL(this, new AObjectS89S0100000_14(this, 207));
        getCameraApiComponent().M70().LIZLLL(this, new AObjectS89S0100000_14(this, 208));
    }

    @Override // X.AbstractC29891Fh
    public void onDestroy() {
        super.onDestroy();
        getRecordAdapterApi().oA(null);
    }

    @Override // X.AbstractC29891Fh
    public void onStart() {
        super.onStart();
        setDefaultSelectedTab(this.parentScene, this.bottomTabManager.LIZLLL);
        handleBackFromTextMode();
    }

    @Override // X.InterfaceC45979I2t
    public void updateBottomTab() {
        if (C52912Kpg.LIZ() && !getCameraApiComponent().e8().LLZLLLL() && !getShortVideoContext().cameraComponentModel.isRetakeMode) {
            this.bottomTabManager.LJIIJ(C81440Vxk.LIZIZ(getShortVideoContext().LJ()));
            showBottomTab(true);
        }
    }

    @Override // X.InterfaceC45979I2t
    public boolean getAlbumTabIsDefaultSelected() {
        return this.albumTabIsDefaultSelected;
    }

    @Override // X.InterfaceC45979I2t
    public boolean getAlbumTabIsSelected() {
        return this.albumTabIsSelected;
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ InterfaceC45979I2t getApiComponent() {
        return this.apiComponent;
    }

    @Override // X.InterfaceC45979I2t
    public C0IB<WS0> getBottomTabIndexChangeEvent() {
        return this.bottomTabIndexChangeEvent;
    }

    @Override // X.InterfaceC45979I2t
    public C40871j1<Integer> getComplexTabVisibility() {
        return this.complexTabVisibility;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.diContainer;
    }

    @Override // X.InterfaceC73149SnJ
    public /* bridge */ /* synthetic */ AML getReceiver() {
        getReceiver2();
        return this;
    }

    @Override // X.InterfaceC45979I2t
    public LiveEvent<String> getSharedARTabIndexChangeEvent() {
        return this.sharedARTabIndexChangeEvent;
    }

    private final void mobDefaultBottomTabChange(String str) {
        if (C45982I2w.LIZIZ() && !getShortVideoContext().LJJJI() && !getShortVideoContext().LJJIIZ()) {
            return;
        }
        handleBottomTabIndexChangeEvent(new WS0("by_default", str, 0, false, false, false, null, LiveTryModeCountDownThresholdSetting.DEFAULT));
    }

    private final void observeLiveTabTag(WMH wmh) {
        getShortVideoContext();
        isZTLiveSwitch();
    }

    private final boolean onlyShowLiveTab(WMH wmh) {
        WSI wsi;
        List<WSI> list = this.bottomTabManager.LIZLLL;
        if (!getShortVideoContext().onlyShowLiveTab) {
            return false;
        }
        Iterator<WSI> it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                wsi = it.next();
                if (o.LJ(wsi.LIZ.LIZIZ, C78688UuS.LJJJI(R.string.pwa))) {
                    break;
                }
            } else {
                wsi = null;
                break;
            }
        }
        WSI wsi2 = wsi;
        if (wsi2 == null) {
            return false;
        }
        observeBottomTabVisibility(wmh, wsi2);
        WT3 wt3 = wsi2.LIZIZ;
        if (wt3 != null) {
            C79234V7u.LIZIZ(wmh, R.id.iri, this.bottomTabScene, "RecordBottomTabScene");
            wmh.add(R.id.iri, wt3, wt3.getTag());
        }
        changeToDefaultTab(wmh, wsi2, false);
        this.bottomTabManager.LJIIJJI();
        mobDefaultBottomTabChange(wsi2.LIZ.LIZIZ);
        return true;
    }

    @Override // X.InterfaceC45979I2t
    public void configSwitchDuration(C45964I2e event) {
        o.LJIIIZ(event, "event");
        getSwitchDurationConfigFactory().onEvent(event);
    }

    public <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at> S1 getState(VM1 vm1) {
        return (S1) C73297Sph.LIZIZ(this, vm1);
    }

    public final void handleBottomTabIndexChangeEvent(WS0 event) {
        o.LJIIIZ(event, "event");
        if (!event.LIZLLL) {
            return;
        }
        Iterator it = ((ArrayList) this.bottomTabManager.LIZLLL).iterator();
        String str = "";
        String str2 = "";
        while (it.hasNext()) {
            WSI wsi = (WSI) it.next();
            Object obj = event.LIZIZ;
            o.LJII(obj, "null cannot be cast to non-null type kotlin.CharSequence");
            if (TextUtils.equals((CharSequence) obj, wsi.LIZ.LIZIZ)) {
                str2 = wsi.LIZ.LIZJ;
            }
        }
        if (TextUtils.equals(str2, "")) {
            return;
        }
        if (TextUtils.equals(str2, "video_15") && C45982I2w.LIZIZ()) {
            str2 = "camera";
        }
        if (o.LJ(str2, "upload_tab") && (o.LJ(event.LIZ, "by_default") || o.LJ(C81440Vxk.LIZ(event.LIZ), "-1"))) {
            return;
        }
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("creation_id", getShortVideoContext().LJI());
        c145995oB.LJI("shoot_way", getShortVideoContext().shootWay);
        c145995oB.LIZ(getShortVideoContext().draftId, "draft_id");
        c145995oB.LJI("to_status", str2);
        c145995oB.LJI("from_status", C81440Vxk.LIZ(event.LIZ));
        c145995oB.LJI("shoot_tab_name", str2);
        if (TextUtils.equals(str2, "text")) {
            int i = event.LIZJ;
            if (i != 1) {
                if (i == 2 || i == 3) {
                    str = "slide";
                }
            } else {
                str = "click";
            }
            c145995oB.LJI("text_mode_enter_method", str);
        }
        if (C52912Kpg.LIZ() && getShortVideoContext().LJIIIIZZ() > 0) {
            c145995oB.LJI("enter_from", "video_recording_page");
        } else {
            c145995oB.LJI("enter_from", "video_shoot_page");
        }
        FMX.LJIIL("change_record_mode", c145995oB.LIZ);
    }

    public final void handleLeaveSharedARSession(String str) {
        C82398WVm.LJI(getStickerApiComponent(), null);
        C1FP.LIZLLL();
        getStickerApiComponent().Y60().LIZJ();
        getShortVideoContext().LJJIZ(false);
        this.planCUiApiComponent.kY(true, false);
        HZ2.LIZ(getRecordControlApi(), false, 3);
        this.planCUiApiComponent.pD();
    }

    @Override // X.InterfaceC45979I2t
    public void notifyBottomTabIndexChange(WS0 event) {
        o.LJIIIZ(event, "event");
        this._bottomTabIndexChangeEvent.LJI(event);
    }

    @Override // X.InterfaceC45979I2t
    public void notifySharedARTabIndexChange(String tag) {
        o.LJIIIZ(tag, "tag");
        this._sharedARTabIndexChangeEvent.LJII(tag);
    }

    @Override // X.InterfaceC45979I2t
    public void resetToCurTab(String curTag) {
        o.LJIIIZ(curTag, "curTag");
        int LLJILJIL = this.bottomTabScene.LLJILJIL(curTag);
        if (LLJILJIL >= 0) {
            this.bottomTabScene.LLJJIII(LLJILJIL, false, false);
        }
    }

    @Override // X.InterfaceC45979I2t
    public void setBottomTabEndMargin(int i) {
        this.setBottomTabEndMargin.LJII(Integer.valueOf(i));
    }

    @Override // X.InterfaceC45979I2t
    public void setBottomTabStartMargin(int i) {
        this.setBottomTabStartMargin.LJII(Integer.valueOf(i));
    }

    @Override // X.InterfaceC45979I2t
    public void setLiveTagState(int i) {
        this.showLiveTagState.LJI(Integer.valueOf(i));
    }

    @Override // X.InterfaceC45979I2t
    public void setTabSwitchEnabled(boolean z) {
        C81521Vz3 c81521Vz3 = this.bottomTabScene;
        ViewOnTouchListenerC81419VxP viewOnTouchListenerC81419VxP = c81521Vz3.LJLJJI;
        if (viewOnTouchListenerC81419VxP != null) {
            viewOnTouchListenerC81419VxP.setScrollEnabled(z);
            ViewOnTouchListenerC81419VxP viewOnTouchListenerC81419VxP2 = c81521Vz3.LJLJJI;
            if (viewOnTouchListenerC81419VxP2 != null) {
                viewOnTouchListenerC81419VxP2.setUISwitchEnabled(z);
                return;
            } else {
                o.LJIJI("tabHost");
                throw null;
            }
        }
        o.LJIJI("tabHost");
        throw null;
    }

    @Override // X.InterfaceC45979I2t
    public void showBottomTab(boolean z) {
        this.showBottomTabEvent.LJII(Boolean.valueOf(z));
    }

    public final void showExitSharedARSessionDialog(String str) {
        ARI ari = new ARI(C78688UuS.LJIJJ(this));
        ari.LJI(R.string.r7e, new AqS67S1100000_14(this, str, 1));
        ari.LJIIIIZZ(R.string.e79, WTK.LJLIL);
        C26227ARb LIZ = C3AW.LIZ(C78688UuS.LJIJJ(this));
        LIZ.LJ(R.string.r7g);
        LIZ.LIZ(R.string.r7f);
        LIZ.LJIIL = ari;
        LIZ.LJII = false;
        LIZ.LJI().LIZLLL();
    }

    @Override // X.InterfaceC45979I2t
    public void updateBottomDotRes(int i) {
        this.bottomTabScene.LLJJJ(i);
    }

    private final void init(WMH wmh, List<WSI> list) {
        WSI wsi;
        Iterator<WSI> it = list.iterator();
        while (it.hasNext()) {
            observeBottomTabVisibility(wmh, it.next());
        }
        this.showBottomTabEvent.LIZLLL(wmh, new AObjectS119S0200000_14(wmh, new C68322mC(), 2));
        Iterator<WSI> it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                wsi = it2.next();
                if (wsi.LIZ.LIZLLL) {
                    break;
                }
            } else {
                wsi = null;
                break;
            }
        }
        WSI wsi2 = wsi;
        if (wsi2 != null) {
            changeToDefaultTab$default(this, wmh, wsi2, false, 2, null);
        }
        observeLiveTabTag(wmh);
    }

    private final void observeBottomTabVisibility(WMH requireNavigationScene, WSI wsi) {
        UniqueLiveData uniqueLiveData = wsi.LIZJ;
        o.LJIIIZ(requireNavigationScene, "$this$requireNavigationScene");
        uniqueLiveData.observe(C78923UyF.LJIILLIIL(requireNavigationScene), new AObjectS71S0300000_14(requireNavigationScene, wsi, this, 2));
    }

    private final void setDefaultSelectedTab(WMH wmh, List<WSI> list) {
        WSI wsi;
        if (this.hasSelectDefaultTab) {
            return;
        }
        this.hasSelectDefaultTab = true;
        Iterator<WSI> it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                wsi = it.next();
                if (wsi.LIZ.LIZLLL) {
                    break;
                }
            } else {
                wsi = null;
                break;
            }
        }
        WSI wsi2 = wsi;
        if (wsi2 != null) {
            changeToDefaultTab(wmh, wsi2, false);
            this.bottomTabManager.LJIIJJI();
            mobDefaultBottomTabChange(wsi2.LIZ.LIZIZ);
        }
    }

    @Override // X.InterfaceC45979I2t
    public void setAlbumTabIsSelected(boolean z, boolean z2) {
        this.albumTabIsSelected = z;
        this.albumTabIsDefaultSelected = z2;
    }

    @Override // X.InterfaceC45979I2t
    public void setBottomSelectedTextColor(int i, int i2) {
        this.bottomTabScene.LLJJIJIIJIL(i, i2);
    }

    @Override // X.InterfaceC73150SnK
    public <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns) {
        return (R) C73297Sph.LJIIZILJ(vm1, interfaceC88472Yns);
    }

    public <M1 extends C73139Sn9<S1, PROP1>, PROP1 extends InterfaceC61312at, S1 extends InterfaceC61312at, R> R withSubstate(C73139Sn9<S1, PROP1> c73139Sn9, InterfaceC88472Yns<? super PROP1, ? extends R> interfaceC88472Yns) {
        return (R) C73297Sph.LJIL(c73139Sn9, interfaceC88472Yns);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C82329WSv(WMH parentScene, C82622Wbi diContainer, List<? extends WSH> bottoms) {
        o.LJIIIZ(parentScene, "parentScene");
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(bottoms, "bottoms");
        this.parentScene = parentScene;
        this.diContainer = diContainer;
        this.bottoms = bottoms;
        this.apiComponent = this;
        InterfaceC45999I3n interfaceC45999I3n = (InterfaceC45999I3n) getDiContainer().LJ(InterfaceC45999I3n.class, null);
        this.planCUiApiComponent = interfaceC45999I3n;
        this.cameraApiComponent$delegate = UCI.LJI(getDiContainer(), WRQ.class, null);
        this.recordControlApi$delegate = UCI.LJI(getDiContainer(), I3X.class, null);
        this.shortVideoContext$delegate = UCI.LJI(getDiContainer(), ShortVideoContext.class, null);
        this.stickerApiComponent$delegate = UCI.LJI(getDiContainer(), I0N.class, null);
        this.nowsSwitchApiComponent$delegate = UCI.LJII(getDiContainer(), InterfaceC82325WSr.class, null);
        this.recordPermissionApiComponent$delegate = UCI.LJII(getDiContainer(), I8W.class, null);
        this.rootScene$delegate = UCI.LJII(getDiContainer(), TikTokCameraBaseGroupScene.class, null);
        this.recordAdapterApi$delegate = UCI.LJI(getDiContainer(), WLB.class, null);
        C40871j1<WS0> c40871j1 = new C40871j1<>(new WS0(null, "RecordShoot15s", 0, false, false, false, null, 112));
        this._bottomTabIndexChangeEvent = c40871j1;
        C29901Fi<String> c29901Fi = new C29901Fi<>();
        this._sharedARTabIndexChangeEvent = c29901Fi;
        this.bottomTabIndexChangeEvent = c40871j1;
        this.sharedARTabIndexChangeEvent = c29901Fi;
        WSE wse = new WSE(getCameraApiComponent());
        this.bottomTabManager = wse;
        this.showBottomTabEvent = new C29901Fi<>();
        this.showLiveTagState = new C46611sH<>(null);
        this.setBottomTabStartMargin = new C29901Fi<>();
        this.setBottomTabEndMargin = new C29901Fi<>();
        this.bottomTabScene = new C81521Vz3(getShortVideoContext(), wse, interfaceC45999I3n.RH());
        this.enableSwitchDurationAfterRecording$delegate = C221108m2.LIZIZ(C82327WSt.LJLIL);
        this.switchDurationConfigFactory$delegate = C221108m2.LIZ(EnumC221088m0.NONE, new AqS164S0100000_14(this, 212));
    }

    private final void changeToDefaultTab(WMH wmh, WSI wsi, boolean z) {
        WM7 findSceneByTag = wmh.findSceneByTag("RecordBottomTabScene");
        o.LJI(findSceneByTag);
        C81521Vz3 c81521Vz3 = (C81521Vz3) findSceneByTag;
        int LLJILJIL = c81521Vz3.LLJILJIL(wsi.LIZ.LIZIZ);
        if (LLJILJIL >= 0) {
            c81521Vz3.LLJJIII(LLJILJIL, false, z);
        }
    }

    @Override // X.InterfaceC45979I2t
    public void addBottomTab(int i, WSH bottomTab, int i2) {
        o.LJIIIZ(bottomTab, "bottomTab");
        WMH wmh = this.parentScene;
        Iterator<WSI> it = this.bottomTabManager.LIZLLL.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            WSI next = it.next();
            String str = next.LIZ.LIZIZ;
            C45850Hz4 c45850Hz4 = this.recordEnv;
            if (c45850Hz4 != null) {
                if (o.LJ(str, bottomTab.createBottomTabItem(c45850Hz4).LIZIZ)) {
                    if (next != null) {
                        return;
                    }
                }
            } else {
                o.LJIJI("recordEnv");
                throw null;
            }
        }
        WSE wse = this.bottomTabManager;
        C45850Hz4 c45850Hz42 = this.recordEnv;
        if (c45850Hz42 != null) {
            WSI LIZ = wse.LIZ(c45850Hz42, i, bottomTab);
            observeBottomTabVisibility(wmh, LIZ);
            WT3 wt3 = LIZ.LIZIZ;
            if (wt3 != null) {
                C79234V7u.LIZIZ(wmh, R.id.irj, wt3, wt3.getTag());
            }
            if (LIZ.LIZ.LIZLLL) {
                SceneExtensionsKt.LIZJ(wmh, new ARunnableS25S0300000_14(LIZ, this, wmh, 12), 500L);
                return;
            }
            return;
        }
        o.LJIJI("recordEnv");
        throw null;
    }

    @Override // X.InterfaceC45979I2t
    public void setCurrentTab(String tag, boolean z, int i) {
        o.LJIIIZ(tag, "tag");
        this.bottomTabManager.LJIIIZ(tag, z, i);
    }

    @Override // X.InterfaceC73150SnK
    public <S extends InterfaceC61312at> InterfaceC92693kP subscribe(JediViewModel<S> jediViewModel, C73165SnZ<S> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super S, C76800UCe> interfaceC88471Ynr) {
        return C73297Sph.LJIIIZ(this, jediViewModel, c73165SnZ, interfaceC88471Ynr);
    }

    public <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, VM2 extends JediViewModel<S2>, S2 extends InterfaceC61312at, R> R withState(VM1 vm1, VM2 vm2, InterfaceC88471Ynr<? super S1, ? super S2, ? extends R> interfaceC88471Ynr) {
        return (R) C73297Sph.LJIILLIIL(vm1, vm2, interfaceC88471Ynr);
    }

    public <M1 extends C73139Sn9<S1, PROP1>, PROP1 extends InterfaceC61312at, S1 extends InterfaceC61312at, M2 extends C73139Sn9<S2, PROP2>, PROP2 extends InterfaceC61312at, S2 extends InterfaceC61312at, R> R withSubstate(C73139Sn9<S1, PROP1> c73139Sn9, C73139Sn9<S2, PROP2> c73139Sn92, InterfaceC88471Ynr<? super PROP1, ? super PROP2, ? extends R> interfaceC88471Ynr) {
        return (R) C73297Sph.LJIJJLI(c73139Sn9, c73139Sn92, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC143795kd
    public <S extends InterfaceC61312at, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super InterfaceC143795kd, ? super A, C76800UCe> interfaceC88471Ynr) {
        C73297Sph.LIZJ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC73150SnK
    public <S extends InterfaceC61312at, A> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C73297Sph.LJ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC143795kd
    public <S extends InterfaceC61312at, A> void subscribeEvent(JediViewModel<S> jediViewModel, TBW<S, ? extends C45927I0t<? extends A>> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super InterfaceC143795kd, ? super A, C76800UCe> interfaceC88471Ynr) {
        C73297Sph.LJIIJ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr);
    }

    public <S extends InterfaceC61312at, A> void subscribeMultiEvent(JediViewModel<S> jediViewModel, TBW<S, ? extends C2KE<? extends A>> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super InterfaceC143795kd, ? super A, C76800UCe> interfaceC88471Ynr) {
        C73297Sph.LJIIL(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr);
    }

    public <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, VM2 extends JediViewModel<S2>, S2 extends InterfaceC61312at, VM3 extends JediViewModel<S3>, S3 extends InterfaceC61312at, R> R withState(VM1 vm1, VM2 vm2, VM3 vm3, InterfaceC88473Ynt<? super S1, ? super S2, ? super S3, ? extends R> interfaceC88473Ynt) {
        return (R) C73297Sph.LJIILL(vm1, vm2, vm3, interfaceC88473Ynt);
    }

    public <M1 extends C73139Sn9<S1, PROP1>, PROP1 extends InterfaceC61312at, S1 extends InterfaceC61312at, M2 extends C73139Sn9<S2, PROP2>, PROP2 extends InterfaceC61312at, S2 extends InterfaceC61312at, M3 extends C73139Sn9<S3, PROP3>, PROP3 extends InterfaceC61312at, S3 extends InterfaceC61312at, R> R withSubstate(C73139Sn9<S1, PROP1> c73139Sn9, C73139Sn9<S2, PROP2> c73139Sn92, C73139Sn9<S3, PROP3> c73139Sn93, InterfaceC88473Ynt<? super PROP1, ? super PROP2, ? super PROP3, ? extends R> interfaceC88473Ynt) {
        return (R) C73297Sph.LJIJJ(c73139Sn9, c73139Sn92, c73139Sn93, interfaceC88473Ynt);
    }

    @Override // X.InterfaceC73150SnK
    public <S extends InterfaceC61312at, A, B> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, C73165SnZ<TMG> c73165SnZ, InterfaceC88473Ynt<? super AML, ? super A, ? super B, C76800UCe> interfaceC88473Ynt) {
        return C73297Sph.LJFF(this, jediViewModel, tbw, tbw2, c73165SnZ, interfaceC88473Ynt);
    }

    public <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, VM2 extends JediViewModel<S2>, S2 extends InterfaceC61312at, VM3 extends JediViewModel<S3>, S3 extends InterfaceC61312at, VM4 extends JediViewModel<S4>, S4 extends InterfaceC61312at, R> R withState(VM1 vm1, VM2 vm2, VM3 vm3, VM4 vm4, InterfaceC88474Ynu<? super S1, ? super S2, ? super S3, ? super S4, ? extends R> interfaceC88474Ynu) {
        return (R) C73297Sph.LJIILJJIL(vm1, vm2, vm3, vm4, interfaceC88474Ynu);
    }

    public <M1 extends C73139Sn9<S1, PROP1>, PROP1 extends InterfaceC61312at, S1 extends InterfaceC61312at, M2 extends C73139Sn9<S2, PROP2>, PROP2 extends InterfaceC61312at, S2 extends InterfaceC61312at, M3 extends C73139Sn9<S3, PROP3>, PROP3 extends InterfaceC61312at, S3 extends InterfaceC61312at, M4 extends C73139Sn9<S4, PROP4>, PROP4 extends InterfaceC61312at, S4 extends InterfaceC61312at, R> R withSubstate(C73139Sn9<S1, PROP1> c73139Sn9, C73139Sn9<S2, PROP2> c73139Sn92, C73139Sn9<S3, PROP3> c73139Sn93, C73139Sn9<S4, PROP4> c73139Sn94, InterfaceC88474Ynu<? super PROP1, ? super PROP2, ? super PROP3, ? super PROP4, ? extends R> interfaceC88474Ynu) {
        return (R) C73297Sph.LJIJI(c73139Sn9, c73139Sn92, c73139Sn93, c73139Sn94, interfaceC88474Ynu);
    }

    public static /* synthetic */ void changeToDefaultTab$default(C82329WSv c82329WSv, WMH wmh, WSI wsi, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = true;
            }
            c82329WSv.changeToDefaultTab(wmh, wsi, z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: changeToDefaultTab");
    }

    @Override // X.InterfaceC73150SnK
    public <S extends InterfaceC61312at, T> InterfaceC92693kP asyncSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends AbstractC26082ALm<? extends T>> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super Throwable, C76800UCe> interfaceC88471Ynr, InterfaceC88472Yns<? super AML, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super AML, ? super T, C76800UCe> interfaceC88471Ynr2) {
        return C73297Sph.LIZ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr, interfaceC88472Yns, interfaceC88471Ynr2);
    }

    @Override // X.InterfaceC73150SnK
    public <S extends InterfaceC61312at, A, B, C> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, C73165SnZ<C157166Eu> c73165SnZ, InterfaceC88474Ynu<? super AML, ? super A, ? super B, ? super C, C76800UCe> interfaceC88474Ynu) {
        return C73297Sph.LJI(this, jediViewModel, tbw, tbw2, tbw3, c73165SnZ, interfaceC88474Ynu);
    }

    public <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, VM2 extends JediViewModel<S2>, S2 extends InterfaceC61312at, VM3 extends JediViewModel<S3>, S3 extends InterfaceC61312at, VM4 extends JediViewModel<S4>, S4 extends InterfaceC61312at, VM5 extends JediViewModel<S5>, S5 extends InterfaceC61312at, R> R withState(VM1 vm1, VM2 vm2, VM3 vm3, VM4 vm4, VM5 vm5, InterfaceC88475Ynv<? super S1, ? super S2, ? super S3, ? super S4, ? super S5, ? extends R> interfaceC88475Ynv) {
        return (R) C73297Sph.LJIILIIL(vm1, vm2, vm3, vm4, vm5, interfaceC88475Ynv);
    }

    public <M1 extends C73139Sn9<S1, PROP1>, PROP1 extends InterfaceC61312at, S1 extends InterfaceC61312at, M2 extends C73139Sn9<S2, PROP2>, PROP2 extends InterfaceC61312at, S2 extends InterfaceC61312at, M3 extends C73139Sn9<S3, PROP3>, PROP3 extends InterfaceC61312at, S3 extends InterfaceC61312at, M4 extends C73139Sn9<S4, PROP4>, PROP4 extends InterfaceC61312at, S4 extends InterfaceC61312at, M5 extends C73139Sn9<S5, PROP5>, PROP5 extends InterfaceC61312at, S5 extends InterfaceC61312at, R> R withSubstate(C73139Sn9<S1, PROP1> c73139Sn9, C73139Sn9<S2, PROP2> c73139Sn92, C73139Sn9<S3, PROP3> c73139Sn93, C73139Sn9<S4, PROP4> c73139Sn94, C73139Sn9<S5, PROP5> c73139Sn95, InterfaceC88475Ynv<? super PROP1, ? super PROP2, ? super PROP3, ? super PROP4, ? super PROP5, ? extends R> interfaceC88475Ynv) {
        return (R) C73297Sph.LJIJ(c73139Sn9, c73139Sn92, c73139Sn93, c73139Sn94, c73139Sn95, interfaceC88475Ynv);
    }

    @Override // X.InterfaceC73150SnK
    public <S extends InterfaceC61312at, A, B, C, D> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, C73165SnZ<W1T> c73165SnZ, InterfaceC88475Ynv<? super AML, ? super A, ? super B, ? super C, ? super D, C76800UCe> interfaceC88475Ynv) {
        return C73297Sph.LJII(this, jediViewModel, tbw, tbw2, tbw3, tbw4, c73165SnZ, interfaceC88475Ynv);
    }

    public <S extends InterfaceC61312at, A, B, C, D, E> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, TBW<S, ? extends E> tbw5, C73165SnZ<TMF> c73165SnZ, InterfaceC88476Ynw<? super AML, ? super A, ? super B, ? super C, ? super D, ? super E, C76800UCe> interfaceC88476Ynw) {
        return C73297Sph.LJIIIIZZ(this, jediViewModel, tbw, tbw2, tbw3, tbw4, tbw5, c73165SnZ, interfaceC88476Ynw);
    }
}

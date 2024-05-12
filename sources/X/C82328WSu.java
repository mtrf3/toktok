package X;

import Y.AObjectS119S0200000_14;
import Y.AObjectS71S0300000_14;
import Y.AObjectS89S0100000_14;
import Y.ARunnableS20S0110000_14;
import Y.ARunnableS25S0300000_14;
import Y.ARunnableS50S0100000_14;
import android.content.SharedPreferences;
import android.graphics.RectF;
import android.text.TextUtils;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.als.LiveEvent;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.keva.Keva;
import com.bytedance.scene.ktx.SceneExtensionsKt;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.RecordPageOptionalConfig;
import com.ss.android.ugc.aweme.shortvideo.ui.TikTokCameraBaseGroupScene;
import com.ss.android.ugc.aweme.utils.UniqueLiveData;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.AqS67S1100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.WSu */
/* loaded from: classes15.dex */
public class C82328WSu extends AbstractC29891Fh<InterfaceC45979I2t> implements InterfaceC143795kd, InterfaceC45979I2t, InterfaceC135635Tz {
    public static final WTQ LLIILII;
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLIILZL;
    public final WMH LJLIL;
    public final C82622Wbi LJLILLLLZI;
    public final List<WSH> LJLJI;
    public final List<WSH> LJLJJI;
    public final InterfaceC45979I2t LJLJJL;
    public final InterfaceC45999I3n LJLJJLL;
    public final InterfaceC115514g7 LJLJL;
    public final InterfaceC115514g7 LJLJLJ;
    public final InterfaceC115514g7 LJLJLLL;
    public final InterfaceC115514g7 LJLL;
    public final InterfaceC115514g7 LJLLI;
    public final InterfaceC115514g7 LJLLILLLL;
    public final InterfaceC115514g7 LJLLJ;
    public final InterfaceC115514g7 LJLLL;
    public final InterfaceC115514g7 LJLLLL;
    public C45850Hz4 LJLLLLLL;
    public final C40871j1<WS0> LJLZ;
    public final C29901Fi<String> LJZ;
    public final C0IB<WS0> LJZI;
    public final LiveEvent<String> LJZL;
    public final C40871j1<Integer> LL;
    public final WSE LLD;
    public final WSE LLF;
    public final C29901Fi<Boolean> LLFF;
    public final C46611sH<Integer> LLFFF;
    public final C29901Fi<Integer> LLFII;
    public final C29901Fi<Integer> LLFZ;
    public final C81521Vz3 LLI;
    public final C81518Vz0 LLIFFJFJJ;
    public final Keva LLII;
    public final C5H3 LLIIII;
    public volatile boolean LLIIIILZ;
    public final C5H3 LLIIIJ;
    public boolean LLIIIL;
    public boolean LLIIIZ;
    public boolean LLIIJI;
    public boolean LLIIJLIL;
    public final C5H3 LLIIL;

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
    public void onStartRecord() {
        showBottomTab(false);
        LJJZZI(false);
        this.LLD.LIZJ(false);
        this.LLF.LIZJ(false);
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

    static {
        TBT tbt = new TBT(C82328WSu.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/TikTokCameraApiComponent;", 0);
        C65352Pkq.LIZ.getClass();
        LLIILZL = new InterfaceC74236TBo[]{tbt, new TBT(C82328WSu.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0), new TBT(C82328WSu.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0), new TBT(C82328WSu.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0), new TBT(C82328WSu.class, "recordPermissionApiComponent", "getRecordPermissionApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/ui/permissionmanager/RecordPermissionUIApiComponent;", 0), new TBT(C82328WSu.class, "nowsSwitchApiComponent", "getNowsSwitchApiComponent()Lcom/ss/android/ugc/aweme/nows/combination/NowsSwitcherApi;", 0), new TBT(C82328WSu.class, "gestureApiComponent", "getGestureApiComponent()Lcom/bytedance/creativex/recorder/gesture/api/GestureApiComponent;", 0), new TBT(C82328WSu.class, "rootScene", "getRootScene()Lcom/ss/android/ugc/aweme/shortvideo/ui/TikTokCameraBaseGroupScene;", 0), new TBT(C82328WSu.class, "recordAdapterApi", "getRecordAdapterApi()Lcom/ss/android/ugc/aweme/shortvideo/adapter/RecordAdapterApi;", 0)};
        LLIILII = new WTQ();
    }

    private final WXA LJJLIIIJLLLLLLLZ() {
        return new C82326WSs(this);
    }

    private final WTT LJJLIIJ() {
        return (WTT) this.LLIIIJ.getValue();
    }

    private final TuxTextView LJJLJ() {
        return (TuxTextView) this.LLIIII.getValue();
    }

    private final InterfaceC82325WSr getNowsSwitchApiComponent() {
        return (InterfaceC82325WSr) this.LJLLILLLL.LIZ(this, LLIILZL[5]);
    }

    private final WLB getRecordAdapterApi() {
        return (WLB) this.LJLLLL.LIZ(this, LLIILZL[8]);
    }

    private final I3X getRecordControlApi() {
        return (I3X) this.LJLJLJ.LIZ(this, LLIILZL[1]);
    }

    private final C45962I2c getSwitchDurationConfigFactory() {
        return (C45962I2c) this.LLIIL.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void handleBackFromTextMode() {
        /*
            r8 = this;
            X.WSE r0 = r8.LLD
            java.lang.String r0 = r0.LIZLLL()
            java.lang.String r7 = "RecordLighteningText"
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r7)
            if (r0 == 0) goto L37
            java.lang.String r6 = r8.defaultBottomTab()
            r5 = 7
            r4 = 1
            java.lang.String r3 = "tabHost"
            r2 = 0
            if (r6 == 0) goto L2a
            X.Vz3 r0 = r8.LLI
            X.VxP r1 = r0.LJLJJI
            if (r1 == 0) goto L4b
            int r0 = r0.LLJILJIL(r6)
            r1.LJII(r0, r5, r4)
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != 0) goto L37
        L2a:
            X.Vz3 r0 = r8.LLI
            X.VxP r1 = r0.LJLJJI
            if (r1 == 0) goto L47
            int r0 = r1.getLastIndex()
            r1.LJII(r0, r5, r4)
        L37:
            X.WSE r0 = r8.LLF
            java.lang.String r0 = r0.LIZLLL()
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r7)
            if (r0 == 0) goto L46
            r8.switchToPreviousTab()
        L46:
            return
        L47:
            kotlin.jvm.internal.o.LJIJI(r3)
            throw r2
        L4b:
            kotlin.jvm.internal.o.LJIJI(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C82328WSu.handleBackFromTextMode():void");
    }

    @Override // X.InterfaceC45979I2t
    public int bottomTabSize() {
        return ((ArrayList) this.LLD.LIZLLL).size();
    }

    @Override // X.InterfaceC45979I2t
    public String defaultBottomTab() {
        List<WSI> list = this.LLD.LIZLLL;
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
        Iterator<WSI> it = this.LLD.LIZLLL.iterator();
        while (true) {
            if (it.hasNext()) {
                wsi = it.next();
                C82329WSv.Companion.getClass();
                if (C82329WSv.recordModelTags.contains(wsi.LIZ.LIZIZ)) {
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
        ViewOnTouchListenerC81419VxP viewOnTouchListenerC81419VxP = this.LLI.LJLJJI;
        if (viewOnTouchListenerC81419VxP != null) {
            return C1JI.LJIIZILJ(viewOnTouchListenerC81419VxP);
        }
        o.LJIJI("tabHost");
        throw null;
    }

    public final WRQ getCameraApiComponent() {
        return (WRQ) this.LJLJL.LIZ(this, LLIILZL[0]);
    }

    @Override // X.InterfaceC45979I2t
    public WSF getCurrentBottomTabItem() {
        WSE wse = this.LLD;
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
        WSF wsf = this.LLD.LJIIJJI;
        if (wsf == null) {
            return getCurrentBottomTabItem();
        }
        return wsf;
    }

    @Override // X.InterfaceC45979I2t
    public String getCurrentBottomTag() {
        return this.LLD.LIZLLL();
    }

    public final InterfaceC82353WTt getGestureApiComponent() {
        return (InterfaceC82353WTt) this.LJLLJ.LIZ(this, LLIILZL[6]);
    }

    public final I8W getRecordPermissionApiComponent() {
        return (I8W) this.LJLLI.LIZ(this, LLIILZL[4]);
    }

    public final TikTokCameraBaseGroupScene getRootScene() {
        return (TikTokCameraBaseGroupScene) this.LJLLL.LIZ(this, LLIILZL[7]);
    }

    public final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LJLJLLL.LIZ(this, LLIILZL[2]);
    }

    public final I0N getStickerApiComponent() {
        return (I0N) this.LJLL.LIZ(this, LLIILZL[3]);
    }

    @Override // X.InterfaceC45979I2t
    public void hidePopupForLiveTab() {
        C81438Vxi c81438Vxi = this.LLD.LJI;
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
        if (C38891fp.LJJI(this.LLD.LIZLLL)) {
            return false;
        }
        for (WSI wsi : this.LLD.LIZLLL) {
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
        if (C38891fp.LJJI(this.LLD.LIZLLL)) {
            return false;
        }
        for (WSI wsi : this.LLD.LIZLLL) {
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
        return !SceneExtensionsKt.LIZ(this.LJLIL);
    }

    @Override // X.InterfaceC45979I2t
    public boolean isZTLiveSwitch() {
        String str;
        boolean z = false;
        if (C38891fp.LJJI(this.LLD.LIZLLL)) {
            return false;
        }
        for (WSI wsi : this.LLD.LIZLLL) {
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
        String str = this.LLD.LJIIJ;
        if (str == null) {
            if (!C44356Hay.LIZIZ(getShortVideoContext().shootMode, getShortVideoContext().shootWay)) {
                str = "RecordLightening";
            }
        } else {
            int hashCode = str.hashCode();
            str = hashCode == 553362094 ? "RecordShoot180s" : "RecordShoot180s";
        }
        int LLJILJIL = this.LLI.LLJILJIL(str);
        if (LLJILJIL < 0) {
            LLJILJIL = this.LLI.LLJILJIL("RecordShoot180s");
        }
        this.LLI.LLJJIII(LLJILJIL, true, true);
    }

    @Override // X.InterfaceC45979I2t
    public void onRetake() {
        this.LLD.LIZJ(true);
        this.LLF.LIZJ(true);
        showBottomTab(true);
        LJJZZI(true);
    }

    @Override // X.InterfaceC45979I2t
    public C45850Hz4 provideRecordEnv() {
        C45850Hz4 c45850Hz4 = this.LJLLLLLL;
        if (c45850Hz4 != null) {
            return c45850Hz4;
        }
        o.LJIJI("recordEnv");
        throw null;
    }

    @Override // X.InterfaceC45979I2t
    public void showAllTabsAndExitDuetMode() {
        this.LLD.LJII("DUET_MODE_CAMERA_RECORD");
        int i = 0;
        for (WSI wsi : this.LLD.LIZLLL) {
            int i2 = i + 1;
            if (i >= 0) {
                this.LLD.LIZIZ(i, wsi);
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
        Iterator it = ((ArrayList) this.LLD.LIZLLL).iterator();
        while (it.hasNext()) {
            this.LLD.LJII(((WSI) it.next()).LIZ.LIZIZ);
        }
        String string = C78688UuS.LJIJJ(this).getString(R.string.pvx);
        o.LJIIIIZZ(string, "context.getString(this)");
        this.LLD.LIZIZ(-1, new WSI(new WSF(string), null));
        setCurrentTab("DUET_MODE_CAMERA_RECORD", true, 5);
    }

    @Override // X.InterfaceC45979I2t
    public void switchToPreviousTab() {
        ViewOnTouchListenerC81419VxP viewOnTouchListenerC81419VxP = this.LLIFFJFJJ.LJLJLJ;
        if (viewOnTouchListenerC81419VxP != null) {
            viewOnTouchListenerC81419VxP.LJII(viewOnTouchListenerC81419VxP.getLastIndex(), 7, true);
        } else {
            o.LJIJI("tabHost");
            throw null;
        }
    }

    @Override // X.InterfaceC45979I2t
    public void tryShowPopupForLiveTab() {
        this.LLD.LJIIL();
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
        if (!o.LJ(getCurrentBottomTag(), "record_mode_mv") && !o.LJ(getCurrentBottomTag(), C78688UuS.LJIJJ(this).getString(R.string.pwi))) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC29891Fh
    public void onCreate() {
        super.onCreate();
        getRecordAdapterApi().oA(this);
        Object LIZ = this.LJLIL.getScope().LIZ("record_env_context");
        o.LJI(LIZ);
        C45850Hz4 c45850Hz4 = (C45850Hz4) LIZ;
        this.LJLLLLLL = c45850Hz4;
        this.LLD.LJFF(c45850Hz4, this.LJLJI, this.LJLZ, this.LJZ);
        WSE wse = this.LLF;
        C45850Hz4 c45850Hz42 = this.LJLLLLLL;
        if (c45850Hz42 != null) {
            wse.LJFF(c45850Hz42, this.LJLJJI, this.LJLZ, this.LJZ);
            List<WSI> list = this.LLD.LIZLLL;
            if (onlyShowLiveTab(this.LJLIL)) {
                return;
            }
            Iterator<WSI> it = list.iterator();
            while (it.hasNext()) {
                WT3 wt3 = it.next().LIZIZ;
                if (wt3 != null) {
                    C79234V7u.LIZIZ(this.LJLIL, R.id.iri, wt3, wt3.getTag());
                }
            }
            this.LJLIL.add(R.id.iri, this.LLI, "RecordBottomTabScene");
            init(this.LJLIL, list);
            List<WSI> list2 = this.LLF.LIZLLL;
            Iterator<WSI> it2 = list2.iterator();
            while (it2.hasNext()) {
                WT3 wt32 = it2.next().LIZIZ;
                if (wt32 != null) {
                    C79234V7u.LIZIZ(this.LJLIL, R.id.iri, wt32, wt32.getTag());
                }
            }
            this.LJLIL.add(R.id.iri, this.LLIFFJFJJ, "ComplexLighteningTabScene");
            LJJLL(this.LJLIL, list2);
            SceneExtensionsKt.LIZIZ(this.LLI, new ARunnableS50S0100000_14(this, 111));
            getSharedARTabIndexChangeEvent().LIZLLL(this, new AObjectS89S0100000_14(this, 199));
            getBottomTabIndexChangeEvent().LIZIZ(this, new AObjectS89S0100000_14(this, 200));
            getRecordControlApi().Vh().LIZLLL(this, new AObjectS89S0100000_14(this, 201));
            getRecordControlApi().w90().LIZLLL(this, new AObjectS89S0100000_14(this, 202));
            this.LLFII.LIZLLL(this, new AObjectS89S0100000_14(this, 203));
            this.LLFZ.LIZLLL(this, new AObjectS89S0100000_14(this, 192));
            getRecordControlApi().aL().LIZLLL(this, new AObjectS89S0100000_14(this, 193));
            getRecordControlApi().Qr0().LIZLLL(this, new AObjectS89S0100000_14(this, 194));
            getRecordControlApi().Gg0().LIZLLL(this, new AObjectS89S0100000_14(this, 195));
            getCameraApiComponent().md0().LIZLLL(this, new AObjectS89S0100000_14(this, 196));
            getCameraApiComponent().M70().LIZLLL(this, new AObjectS89S0100000_14(this, 197));
            AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false).getStoryService();
            if (C43119Gw7.LIZ()) {
                getGestureApiComponent().ID(LJJLIIIJLLLLLLLZ(), 4, 200);
            }
            if (C53558L0g.LIZ()) {
                this.LJLJJLL.g2().LIZLLL(this, new AObjectS89S0100000_14(this, 198));
                return;
            }
            return;
        }
        o.LJIJI("recordEnv");
        throw null;
    }

    @Override // X.AbstractC29891Fh
    public void onDestroy() {
        super.onDestroy();
        getRecordAdapterApi().oA(null);
    }

    @Override // X.AbstractC29891Fh
    public void onStart() {
        super.onStart();
        setDefaultSelectedTab(this.LJLIL, this.LLD.LIZLLL);
        handleBackFromTextMode();
    }

    @Override // X.InterfaceC45979I2t
    public void updateBottomTab() {
        if (C52912Kpg.LIZ() && !getCameraApiComponent().e8().LLZLLLL() && !getShortVideoContext().cameraComponentModel.isRetakeMode) {
            this.LLD.LJIIJ(C81440Vxk.LIZIZ(getShortVideoContext().LJ()));
            showBottomTab(true);
        }
    }

    @Override // X.InterfaceC45979I2t
    public boolean getAlbumTabIsDefaultSelected() {
        return this.LLIIJI;
    }

    @Override // X.InterfaceC45979I2t
    public boolean getAlbumTabIsSelected() {
        return this.LLIIIZ;
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ InterfaceC45979I2t getApiComponent() {
        return this.LJLJJL;
    }

    @Override // X.InterfaceC45979I2t
    public C0IB<WS0> getBottomTabIndexChangeEvent() {
        return this.LJZI;
    }

    @Override // X.InterfaceC45979I2t
    public C40871j1<Integer> getComplexTabVisibility() {
        return this.LL;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLILLLLZI;
    }

    @Override // X.InterfaceC73149SnJ
    public /* bridge */ /* synthetic */ AML getReceiver() {
        getReceiver2();
        return this;
    }

    @Override // X.InterfaceC45979I2t
    public LiveEvent<String> getSharedARTabIndexChangeEvent() {
        return this.LJZL;
    }

    private final void mobDefaultBottomTabChange(String str) {
        I3K i3k = (I3K) getDiContainer().LJIIIIZZ(null, I3K.class);
        if (i3k != null && i3k.Fb()) {
            return;
        }
        Integer LIZ = getComplexTabVisibility().LIZ();
        if (LIZ != null && LIZ.intValue() == 0) {
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
        List<WSI> list = this.LLD.LIZLLL;
        if (!getShortVideoContext().onlyShowLiveTab) {
            return false;
        }
        Iterator<WSI> it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                wsi = it.next();
                if (o.LJ(wsi.LIZ.LIZIZ, "record_mode_live")) {
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
            C79234V7u.LIZIZ(wmh, R.id.iri, this.LLI, "RecordBottomTabScene");
            wmh.add(R.id.iri, wt3, wt3.getTag());
        }
        changeToDefaultTab(wmh, wsi2, false);
        this.LLD.LJIIJJI();
        mobDefaultBottomTabChange(wsi2.LIZ.LIZIZ);
        return true;
    }

    public final void LJJLIIIJJI(ViewOnTouchListenerC81419VxP viewOnTouchListenerC81419VxP) {
        if (viewOnTouchListenerC81419VxP.getCurrentIndex() > 0) {
            viewOnTouchListenerC81419VxP.LJII(viewOnTouchListenerC81419VxP.getCurrentIndex() - 1, 3, true);
        }
    }

    public final void LJJLIIIJJIZ(boolean z) {
        AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false).getStoryService();
        if (C43119Gw7.LIZ()) {
            if (!z) {
                if (!this.LLIIIILZ) {
                    getGestureApiComponent().Ge0(LJJLIIJ());
                    this.LLIIIILZ = true;
                    return;
                }
                return;
            }
            if (!this.LLIIIILZ) {
                return;
            }
            getGestureApiComponent().hR(LJJLIIJ());
            this.LLIIIILZ = false;
        }
    }

    public final void LJJLJLI(ViewOnTouchListenerC81419VxP viewOnTouchListenerC81419VxP) {
        if (viewOnTouchListenerC81419VxP.getCurrentIndex() < viewOnTouchListenerC81419VxP.getTabCount() - 1) {
            viewOnTouchListenerC81419VxP.LJII(viewOnTouchListenerC81419VxP.getCurrentIndex() + 1, 3, true);
        }
    }

    public final void LJJZZI(boolean z) {
        if (o.LJ(getCurrentBottomTag(), "RecordLightening")) {
            if (C53558L0g.LIZ() && o.LJ(this.LJLJJLL.g2().LIZJ(), Boolean.TRUE)) {
                C81518Vz0 c81518Vz0 = this.LLIFFJFJJ;
                ViewOnTouchListenerC81419VxP viewOnTouchListenerC81419VxP = c81518Vz0.LJLJLJ;
                if (viewOnTouchListenerC81419VxP != null) {
                    viewOnTouchListenerC81419VxP.post(new ARunnableS20S0110000_14(c81518Vz0, false, 3));
                    return;
                } else {
                    o.LJIJI("tabHost");
                    throw null;
                }
            }
            C81518Vz0 c81518Vz02 = this.LLIFFJFJJ;
            ViewOnTouchListenerC81419VxP viewOnTouchListenerC81419VxP2 = c81518Vz02.LJLJLJ;
            if (viewOnTouchListenerC81419VxP2 != null) {
                viewOnTouchListenerC81419VxP2.post(new ARunnableS20S0110000_14(c81518Vz02, z, 3));
            } else {
                o.LJIJI("tabHost");
                throw null;
            }
        }
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
        String str;
        o.LJIIIZ(event, "event");
        if (!event.LIZLLL) {
            return;
        }
        Iterator it = ((ArrayList) this.LLD.LIZLLL).iterator();
        String str2 = "";
        String str3 = "";
        while (it.hasNext()) {
            WSI wsi = (WSI) it.next();
            Object obj = event.LIZIZ;
            o.LJII(obj, "null cannot be cast to non-null type kotlin.CharSequence");
            if (TextUtils.equals((CharSequence) obj, wsi.LIZ.LIZIZ)) {
                str3 = wsi.LIZ.LIZJ;
            }
        }
        Iterator it2 = ((ArrayList) this.LLF.LIZLLL).iterator();
        while (it2.hasNext()) {
            WSI wsi2 = (WSI) it2.next();
            Object obj2 = event.LIZIZ;
            o.LJII(obj2, "null cannot be cast to non-null type kotlin.CharSequence");
            if (TextUtils.equals((CharSequence) obj2, wsi2.LIZ.LIZIZ)) {
                str3 = wsi2.LIZ.LIZJ;
            }
        }
        if (TextUtils.equals(str3, "")) {
            return;
        }
        if (TextUtils.equals(str3, "video_15")) {
            str3 = "camera";
        }
        if (o.LJ(str3, "upload_tab") && (o.LJ(event.LIZ, "by_default") || o.LJ(C81440Vxk.LIZ(event.LIZ), "-1"))) {
            return;
        }
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("creation_id", getShortVideoContext().LJI());
        c145995oB.LJI("shoot_way", getShortVideoContext().shootWay);
        c145995oB.LIZ(getShortVideoContext().draftId, "draft_id");
        c145995oB.LJI("to_status", str3);
        c145995oB.LJI("from_status", C81440Vxk.LIZ(event.LIZ));
        c145995oB.LJI("shoot_page", "video_shoot_page");
        c145995oB.LJI("shoot_tab_name", str3);
        if (TextUtils.equals(str3, "text")) {
            int i = event.LIZJ;
            if (i != 1) {
                if (i == 2 || i == 3) {
                    str2 = "slide";
                }
            } else {
                str2 = "click";
            }
            c145995oB.LJI("text_mode_enter_method", str2);
        }
        if (C52912Kpg.LIZ() && getShortVideoContext().LJIIIIZZ() > 0) {
            c145995oB.LJI("enter_from", "video_recording_page");
        } else {
            c145995oB.LJI("enter_from", "video_shoot_page");
        }
        if (o.LJ(getShortVideoContext().shootWay, "ec_write_review")) {
            RecordPageOptionalConfig recordPageOptionalConfig = getShortVideoContext().creativeModel.initialModel.recordPageOptionalConfig;
            if (recordPageOptionalConfig != null) {
                str = recordPageOptionalConfig.previousPage;
            } else {
                str = null;
            }
            c145995oB.LIZLLL("previous_page", str);
        }
        FMX.LJIIL("change_record_mode", c145995oB.LIZ);
    }

    public final void handleLeaveSharedARSession(String str) {
        HXK Y60;
        I0N stickerApiComponent = getStickerApiComponent();
        if (stickerApiComponent != null) {
            C82398WVm.LJI(stickerApiComponent, null);
        }
        C1FP.LIZLLL();
        I0N stickerApiComponent2 = getStickerApiComponent();
        if (stickerApiComponent2 != null && (Y60 = stickerApiComponent2.Y60()) != null) {
            Y60.LIZJ();
        }
        getShortVideoContext().LJJIZ(false);
        this.LJLJJLL.kY(true, false);
        HZ2.LIZ(getRecordControlApi(), false, 3);
        this.LJLJJLL.pD();
    }

    @Override // X.InterfaceC45979I2t
    public void notifyBottomTabIndexChange(WS0 event) {
        o.LJIIIZ(event, "event");
        this.LJLZ.LJI(event);
    }

    @Override // X.InterfaceC45979I2t
    public void notifySharedARTabIndexChange(String tag) {
        o.LJIIIZ(tag, "tag");
        this.LJZ.LJII(tag);
    }

    @Override // X.InterfaceC45979I2t
    public void resetToCurTab(String curTag) {
        o.LJIIIZ(curTag, "curTag");
        int LLJILJIL = this.LLI.LLJILJIL(curTag);
        if (LLJILJIL >= 0) {
            this.LLI.LLJJIII(LLJILJIL, false, false);
        }
    }

    @Override // X.InterfaceC45979I2t
    public void setBottomTabEndMargin(int i) {
        this.LLFZ.LJII(Integer.valueOf(i));
    }

    @Override // X.InterfaceC45979I2t
    public void setBottomTabStartMargin(int i) {
        this.LLFII.LJII(Integer.valueOf(i));
    }

    @Override // X.InterfaceC45979I2t
    public void setLiveTagState(int i) {
        this.LLFFF.LJI(Integer.valueOf(i));
    }

    @Override // X.InterfaceC45979I2t
    public void setTabSwitchEnabled(boolean z) {
        C81521Vz3 c81521Vz3 = this.LLI;
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
        if (getShortVideoContext().LJJIJIIJIL()) {
            this.LLFF.LJII(Boolean.FALSE);
            return;
        }
        TuxTextView LJJLJ = LJJLJ();
        if (LJJLJ != null) {
            LJJLJ.setVisibility(8);
        }
        this.LLFF.LJII(Boolean.valueOf(z));
    }

    public final void showExitSharedARSessionDialog(String str) {
        ARI ari = new ARI(C78688UuS.LJIJJ(this));
        ari.LJI(R.string.r7e, new AqS67S1100000_14(this, str, 0));
        ari.LJIIIIZZ(R.string.e79, WTJ.LJLIL);
        C26227ARb LIZ = C3AW.LIZ(C78688UuS.LJIJJ(this));
        LIZ.LJ(R.string.r7g);
        LIZ.LIZ(R.string.r7f);
        LIZ.LJIIL = ari;
        LIZ.LJII = false;
        LIZ.LJI().LIZLLL();
    }

    @Override // X.InterfaceC45979I2t
    public void updateBottomDotRes(int i) {
        this.LLI.LLJJJ(i);
    }

    private final void LJJLL(WMH wmh, List<WSI> list) {
        Iterator<WSI> it = list.iterator();
        while (it.hasNext()) {
            observeBottomTabVisibility(wmh, it.next());
        }
    }

    private final void init(WMH wmh, List<WSI> list) {
        WSI wsi;
        Iterator<WSI> it = list.iterator();
        while (it.hasNext()) {
            observeBottomTabVisibility(wmh, it.next());
        }
        this.LLFF.LIZLLL(wmh, new AObjectS119S0200000_14(wmh, new C68322mC(), 1));
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
            LJJLIIIJILLIZJL(this, wmh, wsi2, false, 2, null);
        }
        observeLiveTabTag(wmh);
    }

    private final void observeBottomTabVisibility(WMH requireNavigationScene, WSI wsi) {
        UniqueLiveData uniqueLiveData = wsi.LIZJ;
        o.LJIIIZ(requireNavigationScene, "$this$requireNavigationScene");
        uniqueLiveData.observe(C78923UyF.LJIILLIIL(requireNavigationScene), new AObjectS71S0300000_14(requireNavigationScene, wsi, this, 1));
    }

    private final void setDefaultSelectedTab(WMH wmh, List<WSI> list) {
        WSI wsi;
        if (this.LLIIJLIL) {
            return;
        }
        this.LLIIJLIL = true;
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
            this.LLD.LJIIJJI();
            mobDefaultBottomTabChange(wsi2.LIZ.LIZIZ);
        }
    }

    @Override // X.InterfaceC45979I2t
    public void setAlbumTabIsSelected(boolean z, boolean z2) {
        this.LLIIIZ = z;
        this.LLIIJI = z2;
    }

    @Override // X.InterfaceC45979I2t
    public void setBottomSelectedTextColor(int i, int i2) {
        this.LLI.LLJJIJIIJIL(i, i2);
    }

    @Override // X.InterfaceC45979I2t
    public void showComplexTab(int i, WS0 ws0) {
        this.LLIFFJFJJ.LJLLI = ws0;
        this.LL.LJI(Integer.valueOf(i));
    }

    @Override // X.InterfaceC73150SnK
    public <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns) {
        return (R) C73297Sph.LJIIZILJ(vm1, interfaceC88472Yns);
    }

    public <M1 extends C73139Sn9<S1, PROP1>, PROP1 extends InterfaceC61312at, S1 extends InterfaceC61312at, R> R withSubstate(C73139Sn9<S1, PROP1> c73139Sn9, InterfaceC88472Yns<? super PROP1, ? extends R> interfaceC88472Yns) {
        return (R) C73297Sph.LJIL(c73139Sn9, interfaceC88472Yns);
    }

    private final void LJJLI(WMH wmh, WSI wsi, boolean z) {
        int LLJILJIL = this.LLIFFJFJJ.LLJILJIL(wsi.LIZ.LIZIZ);
        if (LLJILJIL >= 0) {
            ViewOnTouchListenerC81419VxP viewOnTouchListenerC81419VxP = this.LLIFFJFJJ.LJLJLJ;
            if (viewOnTouchListenerC81419VxP != null) {
                viewOnTouchListenerC81419VxP.LJIIIIZZ(LLJILJIL, z, true);
            } else {
                o.LJIJI("tabHost");
                throw null;
            }
        }
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
        WMH wmh = this.LJLIL;
        Iterator<WSI> it = this.LLD.LIZLLL.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            WSI next = it.next();
            String str = next.LIZ.LIZIZ;
            C45850Hz4 c45850Hz4 = this.LJLLLLLL;
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
        WSE wse = this.LLD;
        C45850Hz4 c45850Hz42 = this.LJLLLLLL;
        if (c45850Hz42 != null) {
            WSI LIZ = wse.LIZ(c45850Hz42, i, bottomTab);
            observeBottomTabVisibility(wmh, LIZ);
            WT3 wt3 = LIZ.LIZIZ;
            if (wt3 != null) {
                C79234V7u.LIZIZ(wmh, R.id.irj, wt3, wt3.getTag());
            }
            if (LIZ.LIZ.LIZLLL) {
                SceneExtensionsKt.LIZJ(wmh, new ARunnableS25S0300000_14(LIZ, this, wmh, 11), 500L);
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
        this.LLD.LJIIIZ(tag, z, i);
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

    /* JADX WARN: Multi-variable type inference failed */
    public C82328WSu(WMH parentScene, C82622Wbi diContainer, List<? extends WSH> bottoms, List<? extends WSH> tops) {
        o.LJIIIZ(parentScene, "parentScene");
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(bottoms, "bottoms");
        o.LJIIIZ(tops, "tops");
        this.LJLIL = parentScene;
        this.LJLILLLLZI = diContainer;
        this.LJLJI = bottoms;
        this.LJLJJI = tops;
        this.LJLJJL = this;
        InterfaceC45999I3n interfaceC45999I3n = (InterfaceC45999I3n) getDiContainer().LJ(InterfaceC45999I3n.class, null);
        this.LJLJJLL = interfaceC45999I3n;
        this.LJLJL = UCI.LJI(getDiContainer(), WRQ.class, null);
        this.LJLJLJ = UCI.LJI(getDiContainer(), I3X.class, null);
        this.LJLJLLL = UCI.LJI(getDiContainer(), ShortVideoContext.class, null);
        this.LJLL = UCI.LJII(getDiContainer(), I0N.class, null);
        this.LJLLI = UCI.LJII(getDiContainer(), I8W.class, null);
        this.LJLLILLLL = UCI.LJII(getDiContainer(), InterfaceC82325WSr.class, null);
        this.LJLLJ = UCI.LJI(getDiContainer(), InterfaceC82353WTt.class, null);
        this.LJLLL = UCI.LJI(getDiContainer(), TikTokCameraBaseGroupScene.class, null);
        this.LJLLLL = UCI.LJI(getDiContainer(), WLB.class, null);
        C40871j1<WS0> c40871j1 = new C40871j1<>(new WS0(null, "RecordShoot15s", 0, false, false, false, null, 112));
        this.LJLZ = c40871j1;
        C29901Fi<String> c29901Fi = new C29901Fi<>();
        this.LJZ = c29901Fi;
        this.LJZI = c40871j1;
        this.LJZL = c29901Fi;
        C40871j1<Integer> c40871j12 = new C40871j1<>(8);
        this.LL = c40871j12;
        WSE wse = new WSE(getCameraApiComponent());
        this.LLD = wse;
        WSE wse2 = new WSE(getCameraApiComponent(), I38.RECORD_LIGHTENING_QUICK.getTag(), true);
        this.LLF = wse2;
        C29901Fi<Boolean> c29901Fi2 = new C29901Fi<>();
        this.LLFF = c29901Fi2;
        this.LLFFF = new C46611sH<>(null);
        this.LLFII = new C29901Fi<>();
        this.LLFZ = new C29901Fi<>();
        this.LLI = new C81521Vz3(getShortVideoContext(), wse, interfaceC45999I3n.RH());
        this.LLIFFJFJJ = new C81518Vz0(getShortVideoContext(), wse2, c40871j12, interfaceC45999I3n.RH(), c29901Fi2);
        this.LLII = Keva.getRepo("repo_story_show_guide_hint");
        this.LLIIII = C221108m2.LIZIZ(new AqS164S0100000_14(this, 210));
        this.LLIIIJ = C221108m2.LIZIZ(WTI.LJLIL);
        this.LLIIL = C221108m2.LIZ(EnumC221088m0.NONE, new AqS164S0100000_14(this, 211));
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

    public static /* synthetic */ void LJJLIIIIJ(C82328WSu c82328WSu, WMH wmh, WSI wsi, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = true;
            }
            c82328WSu.LJJLI(wmh, wsi, z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: changeToDefaultComplexTab");
    }

    public static /* synthetic */ void LJJLIIIJILLIZJL(C82328WSu c82328WSu, WMH wmh, WSI wsi, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = true;
            }
            c82328WSu.changeToDefaultTab(wmh, wsi, z);
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

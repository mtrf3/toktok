package X;

import Y.ACallableS117S0100000_14;
import Y.AObjectS89S0100000_14;
import Y.AObserverS82S0100000_14;
import Y.AfS20S0210000_14;
import android.graphics.Bitmap;
import android.view.View;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.LiveEvent;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import defpackage.e1;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.WRy */
/* loaded from: classes15.dex */
public final class C82306WRy extends AbstractC29891Fh<InterfaceC82325WSr> implements InterfaceC135635Tz, InterfaceC82325WSr {
    public static final WS9 LLILIL;
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLILL;
    public static final C5H3<String> LLILLIZIL;
    public final WMH LJLIL;
    public final C82622Wbi LJLILLLLZI;
    public final int LJLJI;
    public final InterfaceC82325WSr LJLJJI;
    public final C29901Fi<WSA> LJLJJL;
    public final MutableLiveData<C76800UCe> LJLJJLL;
    public final LiveData<C76800UCe> LJLJL;
    public final C40871j1<Boolean> LJLJLJ;
    public final C40871j1<Boolean> LJLJLLL;
    public final C40871j1<Float> LJLL;
    public final C40871j1<C76800UCe> LJLLI;
    public final C40871j1<Boolean> LJLLILLLL;
    public final InterfaceC115514g7 LJLLJ;
    public final InterfaceC115514g7 LJLLL;
    public final C158986Lu LJLLLL;
    public final InterfaceC115514g7 LJLLLLLL;
    public final InterfaceC115514g7 LJLZ;
    public final InterfaceC115514g7 LJZ;
    public final InterfaceC115514g7 LJZI;
    public final InterfaceC115514g7 LJZL;
    public final InterfaceC115514g7 LL;
    public final InterfaceC115514g7 LLD;
    public final InterfaceC115514g7 LLF;
    public final C40871j1<C81644W2m> LLFF;
    public WSC LLFFF;
    public InterfaceC82352WTs LLFII;
    public InterfaceC45925I0r LLFZ;
    public Object LLI;
    public EnumC82528WaC LLIFFJFJJ;
    public Object LLII;
    public Object LLIIII;
    public Object LLIIIILZ;
    public Effect LLIIIJ;
    public boolean LLIIIL;
    public boolean LLIIIZ;
    public boolean LLIIJI;
    public AtomicBoolean LLIIJLIL;
    public final String[] LLIIL;
    public final InterfaceC29911Fj<WS0> LLIILII;
    public final WS6 LLIILZL;
    public final C73318Sq2 LLIIZ;
    public final WS3 LLIL;
    public boolean LLILII;

    static {
        TBT tbt = new TBT(C82306WRy.class, "recordModeStateStore", "getRecordModeStateStore()Lcom/ss/android/ugc/aweme/nows/combination/RecordModeStateStore;", 0);
        C65352Pkq.LIZ.getClass();
        LLILL = new InterfaceC74236TBo[]{tbt, new TBT(C82306WRy.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0), new TBT(C82306WRy.class, "bottomTabApi", "getBottomTabApi()Lcom/ss/android/ugc/gamora/recorder/bottom/BottomTabApiComponent;", 0), new TBT(C82306WRy.class, "planCUIApiComponent", "getPlanCUIApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/PlanCUIApiComponent;", 0), new TBT(C82306WRy.class, "recordPermissionApiComponent", "getRecordPermissionApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/ui/permissionmanager/RecordPermissionUIApiComponent;", 0), new TBT(C82306WRy.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/TikTokCameraApiComponent;", 0), new TBT(C82306WRy.class, "splitShootApiComponent", "getSplitShootApiComponent()Lcom/ss/android/ugc/gamora/recorder/splitshoot/SplitShootApiComponent;", 0), new TBT(C82306WRy.class, "filterApiComponent", "getFilterApiComponent()Lcom/bytedance/creativex/recorder/filter/api/FilterApiComponent;", 0), new TBT(C82306WRy.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0), new TBT(C82306WRy.class, "beautyApiComponent", "getBeautyApiComponent()Lcom/bytedance/creativex/recorder/beauty/api/BeautyApiComponent;", 0)};
        LLILIL = new WS9();
        LLILLIZIL = C221108m2.LIZIZ(WS7.LJLIL);
    }

    private final void LJJLIIIJILLIZJL() {
        if (!this.LLIIIL) {
            getFilterApiComponent().addFilterSource(new WPD("now", new WQE(0), new WS4(), new WS8()));
            this.LLIIIL = true;
        }
    }

    private final I37 LJJLIIIJJI() {
        return (I37) this.LLF.LIZ(this, LLILL[9]);
    }

    private final InterfaceC45979I2t LJJLIIIJJIZ() {
        return (InterfaceC45979I2t) this.LJLLLLLL.LIZ(this, LLILL[2]);
    }

    private final InterfaceC81640W2i LJJLIIIJLLLLLLLZ() {
        return (InterfaceC81640W2i) this.LJLLJ.LIZ(this, LLILL[0]);
    }

    private final WRP getFilterApiComponent() {
        return (WRP) this.LL.LIZ(this, LLILL[7]);
    }

    private final InterfaceC45999I3n getPlanCUIApiComponent() {
        return (InterfaceC45999I3n) this.LJLZ.LIZ(this, LLILL[3]);
    }

    private final I8W getRecordPermissionApiComponent() {
        return (I8W) this.LJZ.LIZ(this, LLILL[4]);
    }

    private final I3K getSplitShootApiComponent() {
        return (I3K) this.LJZL.LIZ(this, LLILL[6]);
    }

    public final void LJLJJLL() {
        if (!this.LJLIL.isAdded(this.LJLLLL)) {
            this.LJLIL.add(this.LJLJI, this.LJLLLL, "NowsSwitcherScene");
        } else {
            this.LJLIL.show(this.LJLLLL);
        }
    }

    @Override // X.InterfaceC82325WSr
    public void Sa0() {
        this.LLIL.LJLJI = System.currentTimeMillis();
        InterfaceC82352WTs interfaceC82352WTs = this.LLFII;
        if (interfaceC82352WTs != null) {
            interfaceC82352WTs.Gf(this.LLIL);
        }
    }

    public final WRQ getCameraApiComponent() {
        return (WRQ) this.LJZI.LIZ(this, LLILL[5]);
    }

    public final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LJLLL.LIZ(this, LLILL[1]);
    }

    public final I0N getStickerApiComponent() {
        return (I0N) this.LLD.LIZ(this, LLILL[8]);
    }

    @Override // X.InterfaceC82325WSr
    public boolean j40() {
        Object obj = this.LLII;
        LLILIL.getClass();
        return o.LJ(obj, LLILLIZIL.getValue());
    }

    @Override // X.InterfaceC82325WSr
    public C0IB<C81644W2m> zx() {
        C40871j1<C81644W2m> c40871j1 = this.LLFF;
        c40871j1.getClass();
        return c40871j1;
    }

    private final void LJJZZIII() {
        C0IB<Boolean> iz;
        C0IB<WS0> bottomTabIndexChangeEvent = LJJLIIIJJIZ().getBottomTabIndexChangeEvent();
        W1Z mapFuc = W1Z.LJLIL;
        o.LJIIIZ(bottomTabIndexChangeEvent, "<this>");
        o.LJIIIZ(mapFuc, "mapFuc");
        C29901Fi c29901Fi = new C29901Fi();
        bottomTabIndexChangeEvent.LIZJ(new ESQ(c29901Fi, mapFuc));
        c29901Fi.LIZLLL(this, this.LLIILII);
        I8W recordPermissionApiComponent = getRecordPermissionApiComponent();
        if (recordPermissionApiComponent != null && (iz = recordPermissionApiComponent.iz()) != null) {
            iz.LIZIZ(this, new AObjectS89S0100000_14(this, 101));
        }
        getStickerApiComponent().LLLLL().LJIIIIZZ().LIZ().observe(this, new AObserverS82S0100000_14(this, 19));
        getStickerApiComponent().xU().LIZLLL(this, new AObjectS89S0100000_14(this, 102));
    }

    @Override // X.AbstractC29891Fh
    public void onCreate() {
        super.onCreate();
        this.LLIIJI = o.LJ(C60903NvH.LJIIJJI().LJJIII().getDefaultShootTabTag(getShortVideoContext()), I38.RECORD_NOW.getTag());
        LJJZZIII();
    }

    @Override // X.AbstractC29891Fh
    public void onDestroy() {
        super.onDestroy();
        WYC.LIZ = null;
        WYC.LIZIZ = null;
        this.LLIIZ.LIZLLL();
    }

    @Override // X.InterfaceC82325WSr
    public /* bridge */ /* synthetic */ C0IB Eh0() {
        return this.LJLL;
    }

    @Override // X.InterfaceC82325WSr
    public /* bridge */ /* synthetic */ C0IB F40() {
        return this.LJLJLLL;
    }

    @Override // X.InterfaceC82325WSr
    public /* bridge */ /* synthetic */ C0IB GD() {
        return this.LJLJLJ;
    }

    @Override // X.InterfaceC82325WSr
    public /* bridge */ /* synthetic */ C0IB Jd() {
        return this.LJLLI;
    }

    @Override // X.InterfaceC82325WSr
    public boolean Nz() {
        return this.LLILII;
    }

    @Override // X.InterfaceC82325WSr
    public /* bridge */ /* synthetic */ LiveEvent Po() {
        return this.LJLJJL;
    }

    @Override // X.InterfaceC82325WSr
    public LiveData<C76800UCe> bX() {
        return this.LJLJL;
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ InterfaceC82325WSr getApiComponent() {
        return this.LJLJJI;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLILLLLZI;
    }

    @Override // X.InterfaceC82325WSr
    public Object oH() {
        return this.LLII;
    }

    @Override // X.InterfaceC82325WSr
    public /* bridge */ /* synthetic */ C0IB s70() {
        return this.LJLLILLLL;
    }

    private final EnumC45994I3i LJJLIIJ(WS0 ws0) {
        Object obj = ws0.LIZIZ;
        if (o.LJ(obj, I38.RECORD_NOW.getTag())) {
            return EnumC45994I3i.NOWS;
        }
        if (o.LJ(obj, I38.LIVE.getTag())) {
            return EnumC45994I3i.LIVE;
        }
        return EnumC45994I3i.NORMAL;
    }

    private final void LJJLJLI(boolean z) {
        if (this.LJLIL.isAdded(this.LJLLLL) && this.LJLIL.isShowing(this.LJLLLL)) {
            if (z) {
                C158986Lu c158986Lu = this.LJLLLL;
                View view = c158986Lu.mView;
                if (view != null) {
                    C6IA.LIZIZ(view, 200L, new AqS164S0100000_14(c158986Lu, 93));
                    return;
                }
                return;
            }
            this.LJLIL.hide(this.LJLLLL);
        }
    }

    private final void LJJZZI(WS0 ws0) {
        I8W recordPermissionApiComponent;
        C0IB<Boolean> iz;
        boolean z;
        InterfaceC45925I0r interfaceC45925I0r;
        Object obj = ws0.LIZIZ;
        I38 i38 = I38.RECORD_NOW;
        boolean LJ = o.LJ(obj, i38.getTag());
        if (LJ) {
            if (o.LJ(this.LLII, i38.getTag())) {
                return;
            }
        } else {
            if (!o.LJ(this.LLII, i38.getTag())) {
                return;
            }
            if (!LJ && o.LJ(ws0.LIZ, i38.getTag()) && (recordPermissionApiComponent = getRecordPermissionApiComponent()) != null && (iz = recordPermissionApiComponent.iz()) != null && o.LJ(iz.LIZ(), Boolean.TRUE)) {
                if (L2L.LIZ(getDiContainer())) {
                    this.LJLJLJ.LJI(Boolean.FALSE);
                }
                if (o.LJ(ws0.LIZIZ, I38.NEW_BOTTOM_STORY.getTag())) {
                    LJJLIIIIJ(this, false, false, ws0, false, 8, null);
                    InterfaceC82352WTs interfaceC82352WTs = this.LLFII;
                    if (interfaceC82352WTs != null) {
                        interfaceC82352WTs.LLLLZLLLI();
                        return;
                    }
                    return;
                }
                return;
            }
        }
        this.LLIL.LJLILLLLZI = System.currentTimeMillis();
        boolean LJ2 = o.LJ(ws0.LIZIZ, I38.LIVE.getTag());
        boolean LJJ = V16.LJJ(getShortVideoContext());
        if (ws0.LIZJ == 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.LLIIIZ && LJ && LJJ && z) {
            this.LLIIIZ = false;
            this.LLILII = true;
            LJLJJL(false, false);
            this.LJLJLJ.LJI(Boolean.TRUE);
            LJJLI(LJ, LJ2, ws0, true);
            getSplitShootApiComponent().setTabSwitchEnabled(true);
            return;
        }
        this.LLILII = false;
        if (!LJ) {
            if (ORY.LJJIJIIJIL(ws0.LIZIZ, this.LLIIL)) {
                this.LJLJLJ.LJI(Boolean.FALSE);
                InterfaceC81640W2i LJJLIIIJLLLLLLLZ = LJJLIIIJLLLLLLLZ();
                if (LJJLIIIJLLLLLLLZ == null) {
                    return;
                }
                LJJLIIIJLLLLLLLZ.LIZ(LJJLIIJ(ws0));
                return;
            }
        } else if (this.LLIIJI) {
            this.LJLJLJ.LJI(Boolean.TRUE);
            LJJLIIIIJ(this, LJ, LJ2, ws0, false, 8, null);
            return;
        }
        if (LJ2 && this.LLIIJI) {
            this.LJLJLJ.LJI(Boolean.FALSE);
            LJJLIIIIJ(this, false, true, ws0, false, 8, null);
            return;
        }
        AtomicBoolean atomicBoolean = this.LLIIJLIL;
        if (atomicBoolean != null) {
            atomicBoolean.set(true);
        }
        AtomicBoolean atomicBoolean2 = new AtomicBoolean(false);
        this.LLIIJLIL = atomicBoolean2;
        if (LJ && (interfaceC45925I0r = this.LLFZ) != null) {
            interfaceC45925I0r.ET(this.LLIILZL);
        }
        LJLJLJ(!LJ, atomicBoolean2, new WS1(LJ, this, LJ2, ws0));
    }

    private final void LJLIIL(boolean z) {
        C45850Hz4 provideRecordEnv = LJJLIIIJJIZ().provideRecordEnv();
        ShortVideoContext shortVideoContext = ((ShortVideoContextViewModel) C165706es.LJIIIIZZ(this.LJLIL, null, null, 6).get(ShortVideoContextViewModel.class)).LJLIL;
        if (z) {
            I37 i37 = provideRecordEnv.LIZ;
            if (i37 != null) {
                i37.U5();
            }
            getFilterApiComponent().useFilterSource("build_in", false);
            shortVideoContext.cameraComponentModel.recordMode = 0;
            return;
        }
        LJJLIIIJILLIZJL();
        getFilterApiComponent().useFilterSource("now", false);
    }

    private final void LJLLILLLL(WS0 ws0) {
        this.LLIIII = this.LLII;
        this.LLIIIILZ = this.LLI;
        this.LLI = ws0.LJI;
        this.LLII = ws0.LIZIZ;
        if (e1.LIZ(31744, "enable_set_client_photo_video_mode", true, false)) {
            LJLLL(ws0);
        }
    }

    private final void LJLLL(WS0 ws0) {
        Object obj = ws0.LIZIZ;
        if (o.LJ(obj, "RecordShoot15s") || o.LJ(obj, "RecordShoot60s") || o.LJ(obj, "RecordShoot180s") || o.LJ(obj, "RecordShoot600s") || o.LJ(obj, "RecordLighteningVideo")) {
            getCameraApiComponent().rX().LJ().LIZIZ.setClientState(7);
        } else {
            if (!o.LJ(obj, "RecordNow") && !o.LJ(obj, "RecordLighteningPhoto")) {
                return;
            }
            getCameraApiComponent().rX().LJ().LIZIZ.setClientState(6);
        }
    }

    @Override // X.InterfaceC82325WSr
    public void CV(WSC component) {
        o.LJIIIZ(component, "component");
        this.LLFFF = component;
    }

    @Override // X.InterfaceC82325WSr
    public void DU(boolean z) {
        this.LJLJJLL.setValue(C76800UCe.LIZ);
        this.LLIL.LJLIL = System.currentTimeMillis();
        LJJLJLI(true);
        getSplitShootApiComponent().setTabSwitchEnabled(true);
        i5(true);
        if (!ORY.LJJIJIIJIL(this.LLII, this.LLIIL) && !o.LJ(this.LLII, I38.LIVE.getTag())) {
            LJLJJL(true, true);
        }
        getStickerApiComponent().xb(z);
    }

    public final void LJJLJ(WS0 ws0) {
        Object obj;
        if (o.LJ(ws0.LIZIZ, this.LLI) && !ws0.LJFF) {
            getSplitShootApiComponent().setTabSwitchEnabled(true);
            return;
        }
        Object obj2 = this.LLII;
        LLILIL.getClass();
        C5H3<String> c5h3 = LLILLIZIL;
        if (!o.LJ(obj2, c5h3.getValue()) && !ORY.LJJIJIIJIL(c5h3.getValue(), new Object[]{ws0.LIZIZ, ws0.LIZ})) {
            if (ORY.LJJIJIIJIL(this.LLII, this.LLIIL) && !ORY.LJJIJIIJIL(ws0.LIZIZ, this.LLIIL)) {
                LJJLIIIIJ(this, false, o.LJ(ws0.LIZIZ, I38.LIVE.getTag()), ws0, false, 8, null);
            }
            LJLLILLLL(ws0);
            return;
        }
        if (o.LJ(this.LLII, c5h3.getValue())) {
            obj = c5h3.getValue();
        } else {
            obj = ws0.LIZ;
        }
        LJJZZI(new WS0(obj, ws0.LIZIZ, ws0.LIZJ, ws0.LIZLLL, ws0.LJ, ws0.LJFF, ws0.LJI));
        LJLLILLLL(ws0);
    }

    @Override // X.InterfaceC82325WSr
    public void bw(InterfaceC82352WTs component) {
        o.LJIIIZ(component, "component");
        this.LLFII = component;
    }

    @Override // X.InterfaceC82325WSr
    public void gM(EnumC82528WaC speed) {
        o.LJIIIZ(speed, "speed");
        this.LLIFFJFJJ = speed;
    }

    @Override // X.InterfaceC82325WSr
    public void i5(boolean z) {
        WSC wsc = this.LLFFF;
        if (wsc != null) {
            wsc.i5(z);
        }
    }

    @Override // X.InterfaceC82325WSr
    public boolean kT(WS0 ws0) {
        Object obj = this.LLII;
        I38 i38 = I38.RECORD_NOW;
        boolean LJ = o.LJ(obj, i38.getTag());
        if (ws0 == null) {
            return !LJ;
        }
        if (LJ || ORY.LJJIJIIJIL(i38.getTag(), new Object[]{ws0.LIZIZ, ws0.LIZ})) {
            return false;
        }
        return ws0.LJ;
    }

    @Override // X.InterfaceC82325WSr
    public void oB(boolean z) {
        LJLJJL(z, false);
    }

    @Override // X.InterfaceC82325WSr
    public void yb0(InterfaceC45925I0r component) {
        o.LJIIIZ(component, "component");
        this.LLFZ = component;
    }

    public final void LJLJJL(boolean z, boolean z2) {
        Boolean LIZJ = getStickerApiComponent().sF().LIZJ();
        Boolean bool = Boolean.TRUE;
        if (o.LJ(LIZJ, bool) && z) {
            return;
        }
        if (z2) {
            getPlanCUIApiComponent().Xl(z);
        } else {
            getPlanCUIApiComponent().Qt0(z);
        }
        this.LJLJJL.LJII(new WSA(z, z2));
        if (C44253HYj.LIZ(getShortVideoContext()) && !o.LJ(getPlanCUIApiComponent().g2().LIZJ(), bool)) {
            Object obj = this.LLI;
            if (obj == null || o.LJ(obj, I38.RECORD_SPLIT_3MIN.getTag())) {
                getSplitShootApiComponent().gd0(true);
            }
        }
    }

    public C82306WRy(WMH parentScene, C82622Wbi diContainer, int i) {
        o.LJIIIZ(parentScene, "parentScene");
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = parentScene;
        this.LJLILLLLZI = diContainer;
        this.LJLJI = i;
        this.LJLJJI = this;
        this.LJLJJL = new C29901Fi<>();
        MutableLiveData<C76800UCe> mutableLiveData = new MutableLiveData<>();
        this.LJLJJLL = mutableLiveData;
        this.LJLJL = mutableLiveData;
        this.LJLJLJ = new C40871j1<>(null);
        this.LJLJLLL = new C40871j1<>(Boolean.FALSE);
        this.LJLL = new C40871j1<>(null);
        this.LJLLI = new C40871j1<>(null);
        this.LJLLILLLL = new C40871j1<>(null);
        this.LJLLJ = UCI.LJII(getDiContainer(), InterfaceC81640W2i.class, null);
        this.LJLLL = UCI.LJI(getDiContainer(), ShortVideoContext.class, null);
        this.LJLLLL = new C158986Lu(getDiContainer());
        this.LJLLLLLL = UCI.LJI(getDiContainer(), InterfaceC45979I2t.class, null);
        this.LJLZ = UCI.LJI(getDiContainer(), InterfaceC45999I3n.class, null);
        this.LJZ = UCI.LJII(getDiContainer(), I8W.class, null);
        this.LJZI = UCI.LJI(getDiContainer(), WRQ.class, null);
        this.LJZL = UCI.LJI(getDiContainer(), I3K.class, null);
        this.LL = UCI.LJI(getDiContainer(), WRP.class, null);
        this.LLD = UCI.LJI(getDiContainer(), I0N.class, null);
        this.LLF = UCI.LJI(getDiContainer(), I37.class, null);
        this.LLFF = new C40871j1<>(new C81644W2m(null, null, null, 15));
        this.LLIFFJFJJ = EnumC82528WaC.NORMAL;
        this.LLIIIZ = true;
        this.LLIIL = new String[]{I38.RECORD_NOW.getTag(), I38.RECORD_LIGHTENING_TEXT.getTag(), "record_mode_duet", "DUET_MODE_CAMERA_RECORD", "record_mode_mv", "RecordAlbum"};
        this.LLIILII = new AObjectS89S0100000_14(this, 103);
        this.LLIILZL = new WS6();
        this.LLIIZ = new C73318Sq2();
        this.LLIL = new WS3();
    }

    private final void LJLJLJ(boolean z, AtomicBoolean atomicBoolean, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        int width;
        int height;
        if (z) {
            width = C44317HaL.LIZ;
            height = C44317HaL.LIZIZ;
        } else {
            width = getCameraApiComponent().sm0().getWidth() / 2;
            height = getCameraApiComponent().sm0().getHeight() / 2;
        }
        getCameraApiComponent().e8().G9(width, height, new WS2(atomicBoolean, this, z, interfaceC65784Pro));
    }

    public final void LJJLL(Bitmap bitmap, boolean z, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        C78999UzT.LJFF(AbstractC73672Svk.LJJIIJZLJL(new ACallableS117S0100000_14(bitmap, 1)).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS20S0210000_14(this, z, interfaceC65784Pro, 0), C80942Vpi.LJLIL), this.LLIIZ);
    }

    private final void LJJLI(boolean z, boolean z2, WS0 ws0, boolean z3) {
        I8W recordPermissionApiComponent;
        C0IB<Boolean> iz;
        if (!z && !this.LLIIJI) {
            return;
        }
        if (!z3 && ws0.LIZ != null) {
            if (!this.LLIIJI) {
                WYC.LIZIZ = getCameraApiComponent().rX().LJ().LIZIZ.mVideoEncodeSettings;
            } else {
                WYC.LIZ = getCameraApiComponent().rX().LJ().LIZIZ.mVideoEncodeSettings;
            }
        }
        int i = 0;
        if (z && (((recordPermissionApiComponent = getRecordPermissionApiComponent()) == null || (iz = recordPermissionApiComponent.iz()) == null || !o.LJ(iz.LIZ(), Boolean.TRUE)) && !o.LJ(ws0.LIZ, I38.RECORD_LIGHTENING_TEXT.getTag()))) {
            getSplitShootApiComponent().setTabSwitchEnabled(false);
        }
        this.LJLLILLLL.LJI(Boolean.valueOf(z));
        getStickerApiComponent().hv(z);
        LJJLIIIJJI().X2("record");
        EnumC45994I3i LJJLIIJ = LJJLIIJ(ws0);
        InterfaceC81640W2i LJJLIIIJLLLLLLLZ = LJJLIIIJLLLLLLLZ();
        if (LJJLIIIJLLLLLLLZ != null) {
            LJJLIIIJLLLLLLLZ.LIZ(LJJLIIJ);
        }
        EnumC82528WaC enumC82528WaC = this.LLIFFJFJJ;
        EnumC82528WaC enumC82528WaC2 = EnumC82528WaC.NORMAL;
        if (enumC82528WaC != enumC82528WaC2) {
            WRQ cameraApiComponent = getCameraApiComponent();
            if (!z) {
                enumC82528WaC2 = this.LLIFFJFJJ;
            }
            cameraApiComponent.y90(enumC82528WaC2);
        }
        LJLIIL(!z);
        WRQ cameraApiComponent2 = getCameraApiComponent();
        if (LJJLIIJ == EnumC45994I3i.NOWS) {
            i = 2;
        }
        cameraApiComponent2.OP(i);
        this.LLFF.LJI(new C81644W2m(LJJLIIJ, getCameraApiComponent().e8().getViewFunction().getView(), getCameraApiComponent().sm0(), 8));
        this.LJLJLLL.LJI(Boolean.valueOf(z2));
        this.LLIIJI = z;
    }

    public static /* synthetic */ void LJJLIIIIJ(C82306WRy c82306WRy, boolean z, boolean z2, WS0 ws0, boolean z3, int i, Object obj) {
        if ((i & 8) != 0) {
            z3 = false;
        }
        c82306WRy.LJJLI(z, z2, ws0, z3);
    }
}

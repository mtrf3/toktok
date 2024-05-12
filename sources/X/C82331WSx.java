package X;

import Y.AObjectS119S0200000_14;
import Y.AObjectS89S0100000_14;
import Y.ARunnableS25S0300000_14;
import android.text.TextUtils;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.scene.ktx.SceneExtensionsKt;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.WSx */
/* loaded from: classes15.dex */
public final class C82331WSx extends AbstractC29891Fh<InterfaceC45971I2l> implements InterfaceC143795kd, InterfaceC45971I2l, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJZ;
    public final WMH LJLIL;
    public final C82622Wbi LJLILLLLZI;
    public final List<WSH> LJLJI;
    public final InterfaceC45971I2l LJLJJI;
    public final InterfaceC45999I3n LJLJJL;
    public final InterfaceC115514g7 LJLJJLL;
    public final InterfaceC115514g7 LJLJL;
    public final InterfaceC115514g7 LJLJLJ;
    public C45850Hz4 LJLJLLL;
    public final C40871j1<WS0> LJLL;
    public final C29901Fi<String> LJLLI;
    public final C0IB<WS0> LJLLILLLL;
    public final WSE LJLLJ;
    public final C29901Fi<Boolean> LJLLL;
    public final C81519Vz1 LJLLLL;
    public boolean LJLLLLLL;
    public final C5H3 LJLZ;

    static {
        TBT tbt = new TBT(C82331WSx.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJZ = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C82331WSx.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0, c65351Pkp), C61845OOz.LIZJ(C82331WSx.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0, c65351Pkp)};
    }

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

    private final C45963I2d LJJLIIIIJ() {
        return (C45963I2d) this.LJLZ.getValue();
    }

    private final I3X getRecordControlApi() {
        return (I3X) this.LJLJL.LIZ(this, LJZ[1]);
    }

    @Override // X.InterfaceC45971I2l
    public int bottomTabSize() {
        return ((ArrayList) this.LJLLJ.LIZLLL).size();
    }

    @Override // X.InterfaceC45971I2l
    public String defaultBottomTab() {
        List<WSI> list = this.LJLLJ.LIZLLL;
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

    public final InterfaceC82086WJm getCameraApiComponent() {
        return (InterfaceC82086WJm) this.LJLJJLL.LIZ(this, LJZ[0]);
    }

    @Override // X.InterfaceC45971I2l
    public String getCurrentBottomTag() {
        return this.LJLLJ.LIZLLL();
    }

    public final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LJLJLJ.LIZ(this, LJZ[2]);
    }

    @Override // X.AbstractC29891Fh
    public void onCreate() {
        super.onCreate();
        getCameraApiComponent().Os(C83661WsT.LIZ, false);
        Object LIZ = this.LJLIL.getScope().LIZ("record_env_context");
        o.LJI(LIZ);
        C45850Hz4 c45850Hz4 = (C45850Hz4) LIZ;
        this.LJLJLLL = c45850Hz4;
        this.LJLLJ.LJFF(c45850Hz4, this.LJLJI, this.LJLL, this.LJLLI);
        ArrayList arrayList = (ArrayList) this.LJLLJ.LIZLLL;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            WT3 wt3 = ((WSI) it.next()).LIZIZ;
            if (wt3 != null) {
                C79234V7u.LIZIZ(this.LJLIL, R.id.iri, wt3, wt3.getTag());
            }
        }
        this.LJLIL.add(R.id.iri, this.LJLLLL, "FTCRecordBottomTabScene");
        init(this.LJLIL, arrayList);
        setDefaultSelectedTab(this.LJLIL, arrayList);
        getBottomTabIndexChangeEvent().LIZIZ(this, new AObjectS89S0100000_14(this, 24));
        getRecordControlApi().Vh().LIZLLL(this, new AObjectS89S0100000_14(this, 25));
        getRecordControlApi().w90().LIZLLL(this, new AObjectS89S0100000_14(this, 26));
        getRecordControlApi().Qr0().LIZLLL(this, new AObjectS89S0100000_14(this, 27));
        getRecordControlApi().Gg0().LIZLLL(this, new AObjectS89S0100000_14(this, 28));
        getCameraApiComponent().md0().LIZLLL(this, new AObjectS89S0100000_14(this, 29));
        getCameraApiComponent().M70().LIZLLL(this, new AObjectS89S0100000_14(this, 30));
        getCameraApiComponent().R40(new C73343SqR());
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ InterfaceC45971I2l getApiComponent() {
        return this.LJLJJI;
    }

    @Override // X.InterfaceC45971I2l
    public C0IB<WS0> getBottomTabIndexChangeEvent() {
        return this.LJLLILLLL;
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

    @Override // X.InterfaceC45971I2l
    public void configSwitchDuration(C45964I2e event) {
        o.LJIIIZ(event, "event");
        LJJLIIIIJ().onEvent(event);
    }

    public <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at> S1 getState(VM1 vm1) {
        return (S1) C73297Sph.LIZIZ(this, vm1);
    }

    public final void handleBottomTabIndexChangeEvent(WS0 event) {
        o.LJIIIZ(event, "event");
        Iterator it = ((ArrayList) this.LJLLJ.LIZLLL).iterator();
        String str = "";
        while (it.hasNext()) {
            WSI wsi = (WSI) it.next();
            Object obj = event.LIZIZ;
            o.LJII(obj, "null cannot be cast to non-null type kotlin.CharSequence");
            if (TextUtils.equals((CharSequence) obj, wsi.LIZ.LIZIZ)) {
                str = wsi.LIZ.LIZJ;
            }
        }
        if (TextUtils.equals(str, "")) {
            return;
        }
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("creation_id", getShortVideoContext().LJI());
        c145995oB.LJI("shoot_way", getShortVideoContext().shootWay);
        c145995oB.LIZ(getShortVideoContext().draftId, "draft_id");
        c145995oB.LJI("enter_from", "video_shoot_page");
        c145995oB.LJI("to_status", str);
        FMX.LJIIL("change_record_mode", c145995oB.LIZ);
    }

    @Override // X.InterfaceC45971I2l
    public void jK(String tag) {
        o.LJIIIZ(tag, "tag");
        this.LJLLJ.LJIIIZ(tag, true, 0);
    }

    @Override // X.InterfaceC45971I2l
    public void showBottomTab(boolean z) {
        this.LJLLL.LJII(Boolean.valueOf(z));
    }

    private final void init(WMH wmh, List<WSI> list) {
        WSI wsi;
        Iterator<WSI> it = list.iterator();
        while (it.hasNext()) {
            observeBottomTabVisibility(wmh, it.next());
        }
        this.LJLLL.LIZLLL(wmh, new AObjectS89S0100000_14(wmh, 23));
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
            LJJLI(this, wmh, wsi2, false, 2, null);
        }
    }

    private final void observeBottomTabVisibility(WMH wmh, WSI wsi) {
        wsi.LIZJ.observe(wmh, new AObjectS119S0200000_14(wmh, wsi, 0));
    }

    private final void setDefaultSelectedTab(WMH wmh, List<WSI> list) {
        WSI wsi;
        if (this.LJLLLLLL) {
            return;
        }
        this.LJLLLLLL = true;
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
            this.LJLLJ.LJIIJJI();
        }
    }

    @Override // X.InterfaceC73150SnK
    public <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns) {
        return (R) C73297Sph.LJIIZILJ(vm1, interfaceC88472Yns);
    }

    public <M1 extends C73139Sn9<S1, PROP1>, PROP1 extends InterfaceC61312at, S1 extends InterfaceC61312at, R> R withSubstate(C73139Sn9<S1, PROP1> c73139Sn9, InterfaceC88472Yns<? super PROP1, ? extends R> interfaceC88472Yns) {
        return (R) C73297Sph.LJIL(c73139Sn9, interfaceC88472Yns);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C82331WSx(WMH parentScene, C82622Wbi diContainer, List<? extends WSH> bottoms) {
        o.LJIIIZ(parentScene, "parentScene");
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(bottoms, "bottoms");
        this.LJLIL = parentScene;
        this.LJLILLLLZI = diContainer;
        this.LJLJI = bottoms;
        this.LJLJJI = this;
        InterfaceC45999I3n interfaceC45999I3n = (InterfaceC45999I3n) getDiContainer().LJ(InterfaceC45999I3n.class, null);
        this.LJLJJL = interfaceC45999I3n;
        this.LJLJJLL = UCI.LJI(getDiContainer(), InterfaceC82086WJm.class, null);
        this.LJLJL = UCI.LJI(getDiContainer(), I3X.class, null);
        this.LJLJLJ = UCI.LJI(getDiContainer(), ShortVideoContext.class, null);
        C40871j1<WS0> c40871j1 = new C40871j1<>(new WS0(null, "RecordShoot15s", 0, false, false, false, null, 112));
        this.LJLL = c40871j1;
        this.LJLLI = new C29901Fi<>();
        this.LJLLILLLL = c40871j1;
        WSE wse = new WSE(getCameraApiComponent());
        this.LJLLJ = wse;
        this.LJLLL = new C29901Fi<>();
        this.LJLLLL = new C81519Vz1(getShortVideoContext(), wse, interfaceC45999I3n.RH());
        this.LJLZ = C221108m2.LIZ(EnumC221088m0.NONE, new AqS164S0100000_14(this, 61));
    }

    private final void changeToDefaultTab(WMH wmh, WSI wsi, boolean z) {
        WM7 findSceneByTag = wmh.findSceneByTag("FTCRecordBottomTabScene");
        o.LJI(findSceneByTag);
        C81519Vz1 c81519Vz1 = (C81519Vz1) findSceneByTag;
        String tag = wsi.LIZ.LIZIZ;
        o.LJIIIZ(tag, "tag");
        ViewOnTouchListenerC81419VxP viewOnTouchListenerC81419VxP = c81519Vz1.LJLJJI;
        if (viewOnTouchListenerC81419VxP != null) {
            int tabCount = viewOnTouchListenerC81419VxP.getTabCount();
            for (int i = 0; i < tabCount; i++) {
                ViewOnTouchListenerC81419VxP viewOnTouchListenerC81419VxP2 = c81519Vz1.LJLJJI;
                if (viewOnTouchListenerC81419VxP2 != null) {
                    if (o.LJ(tag, viewOnTouchListenerC81419VxP2.LIZLLL(i))) {
                        if (i >= 0) {
                            ViewOnTouchListenerC81419VxP viewOnTouchListenerC81419VxP3 = c81519Vz1.LJLJJI;
                            if (viewOnTouchListenerC81419VxP3 != null) {
                                viewOnTouchListenerC81419VxP3.LJIIIIZZ(i, z, true);
                                return;
                            } else {
                                o.LJIJI("tabHost");
                                throw null;
                            }
                        }
                        return;
                    }
                } else {
                    o.LJIJI("tabHost");
                    throw null;
                }
            }
            return;
        }
        o.LJIJI("tabHost");
        throw null;
    }

    @Override // X.InterfaceC45971I2l
    public void addBottomTab(int i, WSH bottomTab, int i2) {
        o.LJIIIZ(bottomTab, "bottomTab");
        WMH wmh = this.LJLIL;
        Iterator<WSI> it = this.LJLLJ.LIZLLL.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            WSI next = it.next();
            String str = next.LIZ.LIZIZ;
            C45850Hz4 c45850Hz4 = this.LJLJLLL;
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
        WSE wse = this.LJLLJ;
        C45850Hz4 c45850Hz42 = this.LJLJLLL;
        if (c45850Hz42 != null) {
            WSI LIZ = wse.LIZ(c45850Hz42, i, bottomTab);
            observeBottomTabVisibility(wmh, LIZ);
            WT3 wt3 = LIZ.LIZIZ;
            if (wt3 != null) {
                C79234V7u.LIZIZ(wmh, R.id.irj, wt3, wt3.getTag());
            }
            if (LIZ.LIZ.LIZLLL) {
                SceneExtensionsKt.LIZJ(wmh, new ARunnableS25S0300000_14(LIZ, this, wmh, 10), 500L);
                return;
            }
            return;
        }
        o.LJIJI("recordEnv");
        throw null;
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

    public static /* synthetic */ void LJJLI(C82331WSx c82331WSx, WMH wmh, WSI wsi, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        c82331WSx.changeToDefaultTab(wmh, wsi, z);
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

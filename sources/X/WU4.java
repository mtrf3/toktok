package X;

import Y.AObjectS89S0100000_14;
import android.app.Activity;
import android.os.Bundle;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.Live;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.tools.live.RecordLiveViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WU4 extends WT3 implements InterfaceC143795kd {
    public final C82622Wbi LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public volatile boolean LJLJJI;
    public RecordLiveViewModel LJLJJL;
    public WU5 LJLJJLL;

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

    @Override // X.WT3
    public final String getTag() {
        return "RecordLiveScene";
    }

    @Override // X.InterfaceC73150SnK
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public final WU7 LLJJIJIIJIL() {
        WLZ filterModule;
        if (!this.LJLJJI) {
            boolean z = true;
            this.LJLJJI = true;
            Object value = this.LJLJI.getValue();
            o.LJIIIIZZ(value, "<get-_liveModule>(...)");
            WU7 wu7 = (WU7) value;
            Activity activity = this.mActivity;
            RecordLiveViewModel recordLiveViewModel = this.LJLJJL;
            if (recordLiveViewModel != null) {
                wu7.LJ(activity, recordLiveViewModel.LJLIL);
                RecordLiveViewModel recordLiveViewModel2 = this.LJLJJL;
                if (recordLiveViewModel2 != null) {
                    IRecordingOperationPanel iRecordingOperationPanel = recordLiveViewModel2.LJLIL;
                    if (iRecordingOperationPanel != null && (filterModule = iRecordingOperationPanel.filterModule()) != null) {
                        ((WUA) filterModule).LIZLLL = new WU6(this);
                    }
                    wu7.LJIIIZ(new View[0]);
                    wu7.LJIILIIL(new WU8(this, wu7));
                    wu7.LJII();
                    RecordLiveViewModel recordLiveViewModel3 = this.LJLJJL;
                    if (recordLiveViewModel3 != null) {
                        InterfaceC82086WJm gv0 = recordLiveViewModel3.gv0();
                        WUF wuf = C44172HVg.LJIILLIIL;
                        if (gv0.getCameraFacing() != 1) {
                            z = false;
                        }
                        wuf.getClass();
                        LiveOuterService.LJJJLL().LJJI().getClass();
                        C2U8.LIZ(new HY4(z));
                        wu7.LJII();
                    } else {
                        o.LJIJI("recordLiveViewModel");
                        throw null;
                    }
                } else {
                    o.LJIJI("recordLiveViewModel");
                    throw null;
                }
            } else {
                o.LJIJI("recordLiveViewModel");
                throw null;
            }
        }
        Object value2 = this.LJLJI.getValue();
        o.LJIIIIZZ(value2, "<get-_liveModule>(...)");
        return (WU7) value2;
    }

    @Override // X.WM7
    public final void onDestroyView() {
        WUF wuf = C44172HVg.LJIILLIIL;
        WU5 wu5 = this.LJLJJLL;
        if (wu5 != null) {
            ((C30597Bzd) wuf).LIZLLL(wu5);
            super.onDestroyView();
        } else {
            o.LJIJI("mLiveStartListener");
            throw null;
        }
    }

    @Override // X.WT3
    public final boolean LLJILJIL() {
        LLJJIJIIJIL().LJI();
        return false;
    }

    @Override // X.WT3
    public final boolean LLJILJILJ() {
        LLJJIJIIJIL().LIZLLL();
        return false;
    }

    @Override // X.WT3
    public final boolean LLJJ() {
        LLJJIJIIJIL().LJFF();
        return false;
    }

    @Override // X.WT3
    public final boolean LLJJI() {
        return !LLJJIJIIJIL().LJIIL(this.mActivity);
    }

    @Override // X.WT3
    public final boolean LLJJIII() {
        LLJJIJIIJIL().isZTLiveSwitch();
        return false;
    }

    @Override // X.WT3
    public final void hide() {
        WU7 LLJJIJIIJIL = LLJJIJIIJIL();
        View view = this.mView;
        o.LJII(view, "null cannot be cast to non-null type android.view.ViewGroup");
        LLJJIJIIJIL.LJIIJJI((ViewGroup) view);
        WUF wuf = C44172HVg.LJIILLIIL;
        WU5 wu5 = this.LJLJJLL;
        if (wu5 != null) {
            ((C30597Bzd) wuf).LIZLLL(wu5);
        } else {
            o.LJIJI("mLiveStartListener");
            throw null;
        }
    }

    @Override // X.WT3
    public final void show() {
        String str;
        String str2;
        String str3;
        String str4;
        Activity activity;
        View findViewById;
        I8W i8w;
        C0IB<Boolean> iz;
        if (C46125I8j.LIZIZ() && (i8w = (I8W) this.LJLILLLLZI.getValue()) != null && (iz = i8w.iz()) != null && o.LJ(iz.LIZ(), Boolean.TRUE)) {
            return;
        }
        LLJJIJIIJIL().LJI();
        Bundle bundle = new Bundle();
        RecordLiveViewModel recordLiveViewModel = this.LJLJJL;
        if (recordLiveViewModel != null) {
            ShortVideoContext shortVideoContext = recordLiveViewModel.LJLJJI;
            if (shortVideoContext != null) {
                str = shortVideoContext.shootWay;
            } else {
                str = null;
            }
            bundle.putString("shoot_way", str);
            RecordLiveViewModel recordLiveViewModel2 = this.LJLJJL;
            if (recordLiveViewModel2 != null) {
                ShortVideoContext shortVideoContext2 = recordLiveViewModel2.LJLJJI;
                if (shortVideoContext2 != null) {
                    str2 = shortVideoContext2.enterFrom;
                } else {
                    str2 = null;
                }
                bundle.putString("enter_from", str2);
                bundle.putString("video_id", C78983UzD.LJJIJL());
                RecordLiveViewModel recordLiveViewModel3 = this.LJLJJL;
                if (recordLiveViewModel3 != null) {
                    ShortVideoContext shortVideoContext3 = recordLiveViewModel3.LJLJJI;
                    if (shortVideoContext3 != null) {
                        str3 = shortVideoContext3.liveSourceParams;
                    } else {
                        str3 = null;
                    }
                    bundle.putString("sourceParams", str3);
                    bundle.putString("enter_from_type", String.valueOf(C45993I3h.LIZ));
                    RecordLiveViewModel recordLiveViewModel4 = this.LJLJJL;
                    if (recordLiveViewModel4 != null) {
                        ShortVideoContext shortVideoContext4 = recordLiveViewModel4.LJLJJI;
                        if (shortVideoContext4 != null) {
                            str4 = shortVideoContext4.enterMethod;
                        } else {
                            str4 = null;
                        }
                        bundle.putString("enter_method", str4);
                        o.LJIIIIZZ(C41658GWo.LIZLLL().LIZ, "inst().challenges");
                        if (!((ArrayList) r1).isEmpty()) {
                            String json = GsonProtectorUtils.toJson(C60903NvH.LJIIJJI().LIZ(), ListProtector.get(C41658GWo.LIZLLL().LIZ, 0));
                            o.LJIIIIZZ(json, "getAPI().getGson().toJson(avChallenge)");
                            bundle.putString("challenge", json);
                        }
                        ILiveOuterService LJJJLL = LiveOuterService.LJJJLL();
                        o.LJIIIIZZ(LJJJLL, "get().getService(ILiveOuterService::class.java)");
                        Object LIZJ = LJJJLL.LJJIZ().LJJJJIZL().LIZJ(Boolean.FALSE, "overdraw_optimization2");
                        o.LJIIIIZZ(LIZJ, "liveOuterService.liteLiv…aw_optimization2\", false)");
                        if (((Boolean) LIZJ).booleanValue() && LLJJI() && (activity = this.mActivity) != null && (findViewById = activity.findViewById(R.id.fmm)) != null) {
                            findViewById.setVisibility(4);
                        }
                        WU7 LLJJIJIIJIL = LLJJIJIIJIL();
                        View view = this.mView;
                        o.LJII(view, "null cannot be cast to non-null type android.view.ViewGroup");
                        LLJJIJIIJIL.LJIIIIZZ(bundle, (ViewGroup) view);
                        RecordLiveViewModel recordLiveViewModel5 = this.LJLJJL;
                        if (recordLiveViewModel5 != null) {
                            ShortVideoContext shortVideoContext5 = recordLiveViewModel5.LJLJJI;
                            if (shortVideoContext5 != null && shortVideoContext5.cameraComponentModel.mDurings.isEmpty()) {
                                WUF wuf = C44172HVg.LJIILLIIL;
                                final WU5 wu5 = this.LJLJJLL;
                                if (wu5 != null) {
                                    C30597Bzd c30597Bzd = (C30597Bzd) wuf;
                                    Object obj = ((HashMap) c30597Bzd.LIZIZ).get(wu5);
                                    if (obj == null) {
                                        obj = new InterfaceC29176Bci() { // from class: X.WUD
                                            @Override // X.InterfaceC29176Bci
                                            public final void onStartLive() {
                                                wu5.onStartLive();
                                            }
                                        };
                                        ((HashMap) c30597Bzd.LIZIZ).put(wu5, obj);
                                    }
                                    LiveOuterService.LJJJLL().startLiveManager().getClass();
                                    C29165BcX c29165BcX = (C29165BcX) Live.getService().startLiveManager();
                                    if (!((CopyOnWriteArrayList) c29165BcX.LJLIL).contains(obj)) {
                                        ((CopyOnWriteArrayList) c29165BcX.LJLIL).add(obj);
                                    }
                                } else {
                                    o.LJIJI("mLiveStartListener");
                                    throw null;
                                }
                            }
                            if (this.LJLJJL != null) {
                                LLJJIII();
                                return;
                            } else {
                                o.LJIJI("recordLiveViewModel");
                                throw null;
                            }
                        }
                        o.LJIJI("recordLiveViewModel");
                        throw null;
                    }
                    o.LJIJI("recordLiveViewModel");
                    throw null;
                }
                o.LJIJI("recordLiveViewModel");
                throw null;
            }
            o.LJIJI("recordLiveViewModel");
            throw null;
        }
        o.LJIJI("recordLiveViewModel");
        throw null;
    }

    @Override // X.WT3
    public final I0E LLJJIJI() {
        return I0E.RECORD_LIVE_SCENE;
    }

    public WU4(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS164S0100000_14(this, 517));
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RecordLiveScene init, current State=");
        LIZ.append(getLifecycle().getCurrentState());
        H78.LIZ(X1D.LIZIZ(LIZ));
        if (!o.LJ(C16880lQ.LLJJJJ(), Looper.myLooper())) {
            C78983UzD.LJIILL("RecordLiveScene init from non main thread");
        }
        this.LJLJI = C221108m2.LIZIZ(WU9.LJLIL);
    }

    @Override // X.WM7
    public final void onActivityCreated(Bundle bundle) {
        I8W i8w;
        C0IB<Boolean> iz;
        super.onActivityCreated(bundle);
        ((InterfaceC45999I3n) this.LJLIL.LJ(InterfaceC45999I3n.class, null)).qo0().LIZLLL(this, new AObjectS89S0100000_14(this, 475));
        ((InterfaceC170076lv) this.LJLIL.LJ(InterfaceC170076lv.class, null)).fj0().LIZLLL(this, new AObjectS89S0100000_14(this, 476));
        if (C46125I8j.LIZIZ() && (i8w = (I8W) this.LJLILLLLZI.getValue()) != null && (iz = i8w.iz()) != null) {
            iz.LIZIZ(this, new AObjectS89S0100000_14(this, 477));
        }
        this.LJLJJL = (RecordLiveViewModel) C165706es.LJIIIIZZ(this, null, null, 6).get(RecordLiveViewModel.class);
        this.LJLJJLL = new WU5(this);
    }

    @Override // X.InterfaceC73150SnK
    public final <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns) {
        return (R) C73297Sph.LJIIZILJ(vm1, interfaceC88472Yns);
    }

    @Override // X.WT3, X.WMH, X.WM7
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C6D8.LIZJ(layoutInflater, "inflater", viewGroup, "container", layoutInflater, R.layout.ds6, viewGroup, false, "null cannot be cast to non-null type android.view.ViewGroup");
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

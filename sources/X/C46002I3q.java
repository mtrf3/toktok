package X;

import Y.AObjectS86S0100000_7;
import Y.AObserverS75S0100000_7;
import Y.ARunnableS43S0100000_7;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.als.LiveEvent;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.superentrance.SuperEntranceEvent;
import com.ss.android.ugc.aweme.shortvideo.FirstPhotoViewModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.util.performance.OpenAlbumPanelPerformanceMonitor;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.I3q, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46002I3q extends WMH implements InterfaceC143795kd, InterfaceC135635Tz {
    public static final HYT LLI;
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLIFFJFJJ;
    public final C82622Wbi LJLIL;
    public final C0IB<Integer> LJLILLLLZI;
    public final C0IB<Integer> LJLJI;
    public final LiveEvent<C76800UCe> LJLJJI;
    public final C0IB<Boolean> LJLJJL;
    public final I0U LJLJJLL;
    public final InterfaceC65784Pro<C76800UCe> LJLJL;
    public final InterfaceC88472Yns<Boolean, C76800UCe> LJLJLJ;
    public final C29901Fi<C76800UCe> LJLJLLL;
    public final C29901Fi LJLL;
    public final C82632Wbs LJLLI;
    public final C82632Wbs LJLLILLLL;
    public final C82631Wbr LJLLJ;
    public final C82631Wbr LJLLL;
    public I43 LJLLLL;
    public ViewGroup LJLLLLLL;
    public final I2I LJLZ;
    public View LJZ;
    public View LJZI;
    public View LJZL;
    public boolean LL;
    public C46026I4o LLD;
    public final int LLF;
    public InterfaceC82683Wch LLFF;
    public InterfaceC82683Wch LLFFF;
    public int LLFII;
    public I42 LLFZ;

    static {
        TBT tbt = new TBT(C46002I3q.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0);
        C65352Pkq.LIZ.getClass();
        LLIFFJFJJ = new InterfaceC74236TBo[]{tbt, new TBT(C46002I3q.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0), new TBT(C46002I3q.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0), new TBT(C46002I3q.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0), new TBT(C46002I3q.class, "bottomTabApiComponent", "getBottomTabApiComponent()Lcom/ss/android/ugc/gamora/recorder/bottom/BottomTabApiComponent;", 0)};
        LLI = new HYT();
    }

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

    public final ShortVideoContext LLJILJIL() {
        return (ShortVideoContext) this.LJLLI.LIZ(this, LLIFFJFJJ[0]);
    }

    public final I0N LLJILJILJ() {
        return (I0N) this.LJLLJ.LIZ(this, LLIFFJFJJ[2]);
    }

    public final void LLJJ() {
        if (this.LL) {
            return;
        }
        if (C44260HYq.LIZ()) {
            C46026I4o c46026I4o = this.LLD;
            if (c46026I4o != null) {
                c46026I4o.LIZJ(C7MY.LIZIZ(40), O6R.LJJIIZ(C32151Nz.LJIIZILJ(40)));
                C46026I4o c46026I4o2 = this.LLD;
                if (c46026I4o2 != null) {
                    c46026I4o2.setDefaultIconWidth(O6R.LJJIIZ(C32151Nz.LJIIZILJ(40)));
                } else {
                    o.LJIJI("uploadButton");
                    throw null;
                }
            } else {
                o.LJIJI("uploadButton");
                throw null;
            }
        }
        if (C46029I4r.LIZ()) {
            C46026I4o c46026I4o3 = this.LLD;
            if (c46026I4o3 != null) {
                c46026I4o3.LIZLLL(C7MY.LIZIZ(40), C7MY.LIZIZ(40), O6R.LJJIIZ(C32151Nz.LJIIZILJ(1)));
                C46026I4o c46026I4o4 = this.LLD;
                if (c46026I4o4 != null) {
                    c46026I4o4.setDefaultIconWidth(O6R.LJJIIZ(C32151Nz.LJIIZILJ(40)));
                } else {
                    o.LJIJI("uploadButton");
                    throw null;
                }
            } else {
                o.LJIJI("uploadButton");
                throw null;
            }
        }
        this.LL = true;
        ((FirstPhotoViewModel) C165706es.LJIIIIZZ(this, null, null, 6).get(FirstPhotoViewModel.class)).LJLIL.observe(this, new AObserverS75S0100000_7(this, 45));
        C46026I4o c46026I4o5 = this.LLD;
        if (c46026I4o5 != null) {
            c46026I4o5.setOnClickListener(new ViewOnClickListenerC13880ga(new I47(this)));
        } else {
            o.LJIJI("uploadButton");
            throw null;
        }
    }

    public final void LLJJI() {
        I0N LLJILJILJ;
        InterfaceC46204IBk LLZL;
        InterfaceC46204IBk LLZL2;
        if (AVExternalServiceImpl.LIZ().configService().avsettingsConfig().isDuetAutoApplyEffectEnabled() && LLJILJIL().LJJJI()) {
            if (this.LLFZ == null) {
                this.LLFZ = new I42(this);
            }
            I0N LLJILJILJ2 = LLJILJILJ();
            if (LLJILJILJ2 != null && (LLZL2 = LLJILJILJ2.LLZL()) != null) {
                I42 i42 = this.LLFZ;
                o.LJII(i42, "null cannot be cast to non-null type com.ss.android.ugc.aweme.sticker.dispatcher.StickerSelectedListener");
                LLZL2.LIZIZ(i42);
                return;
            }
            return;
        }
        I42 i422 = this.LLFZ;
        if (i422 != null && (LLJILJILJ = LLJILJILJ()) != null && (LLZL = LLJILJILJ.LLZL()) != null) {
            LLZL.LIZ(i422);
        }
        this.LLFZ = null;
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    public final void LLJJIII(int i) {
        C46026I4o c46026I4o = this.LLD;
        if (c46026I4o != null) {
            c46026I4o.setVisibility(i);
        } else {
            o.LJIJI("uploadButton");
            throw null;
        }
    }

    @Override // X.WM7
    public final void onActivityCreated(Bundle bundle) {
        boolean z;
        boolean z2;
        C0IB<WS0> bottomTabIndexChangeEvent;
        LiveEvent<OSJ<Integer, Integer, Intent>> qo0;
        Integer LIZJ;
        super.onActivityCreated(bundle);
        View requireViewById = requireViewById(R.id.j5i);
        o.LJIIIIZZ(requireViewById, "requireViewById(R.id.rl_record_tool_bottom)");
        this.LJLLLL = (I43) requireViewById;
        View requireViewById2 = requireViewById(R.id.crm);
        o.LJIIIIZZ(requireViewById2, "requireViewById(R.id.effect_container)");
        this.LJLLLLLL = (ViewGroup) requireViewById2;
        View requireViewById3 = requireViewById(R.id.fbj);
        o.LJIIIIZZ(requireViewById3, "requireViewById(R.id.iv_tool)");
        this.LJZ = requireViewById3;
        View requireViewById4 = requireViewById(R.id.fbm);
        o.LJIIIIZZ(requireViewById4, "requireViewById(R.id.iv_tool_mark)");
        this.LJZI = requireViewById4;
        if (C44260HYq.LIZ() || C46029I4r.LIZ()) {
            View view = this.LJZ;
            if (view != null) {
                int LIZIZ = C7MY.LIZIZ(40);
                int LIZIZ2 = C7MY.LIZIZ(40);
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.height = LIZIZ;
                layoutParams.width = LIZIZ2;
                view.setLayoutParams(layoutParams);
                View view2 = this.LJZI;
                if (view2 != null) {
                    int LIZIZ3 = C7MY.LIZIZ(40);
                    int LIZIZ4 = C7MY.LIZIZ(40);
                    ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                    layoutParams2.height = LIZIZ3;
                    layoutParams2.width = LIZIZ4;
                    view2.setLayoutParams(layoutParams2);
                } else {
                    o.LJIJI("ivToolMark");
                    throw null;
                }
            } else {
                o.LJIJI("ivTool");
                throw null;
            }
        }
        View requireViewById5 = requireViewById(R.id.fbk);
        o.LJIIIIZZ(requireViewById5, "requireViewById(R.id.iv_tool_cross)");
        this.LJZL = requireViewById5;
        View requireViewById6 = requireViewById(R.id.moi);
        o.LJIIIIZZ(requireViewById6, "requireViewById<TuxTextView>(R.id.tv_tool_name)");
        TuxTextView tuxTextView = (TuxTextView) requireViewById6;
        if (AVExternalServiceImpl.LIZ().configService().avsettingsConfig().enableFrontFlash() && (LIZJ = C72972SkS.LIZJ(tuxTextView, "context", R.attr.d6)) != null) {
            tuxTextView.setShadowLayer(C32151Nz.LJIIZILJ(6), 0.0f, 0.0f, LIZJ.intValue());
        }
        View requireViewById7 = requireViewById(R.id.b06);
        o.LJIIIIZZ(requireViewById7, "requireViewById(R.id.btn_upload)");
        C46026I4o c46026I4o = (C46026I4o) requireViewById7;
        this.LLD = c46026I4o;
        c46026I4o.setText(R.string.thj);
        C46026I4o c46026I4o2 = this.LLD;
        if (c46026I4o2 != null) {
            c46026I4o2.post(new ARunnableS43S0100000_7(this, 80));
            if (L1D.LIZIZ() || L1D.LIZ()) {
                C46026I4o c46026I4o3 = this.LLD;
                if (c46026I4o3 != null) {
                    C82740Wdc.LIZJ(c46026I4o3);
                } else {
                    o.LJIJI("uploadButton");
                    throw null;
                }
            }
            boolean LJ = o.LJ(HQC.LIZ().getResourceType(), "effect");
            HQC.LIZ().getClass();
            if (C45429HsH.LIZ() && LJ && o.LJ(LLJILJIL().enterFrom, "super_entrance")) {
                z = true;
            } else {
                z = false;
            }
            I40 i40 = C46127I8l.LJLLJ;
            Activity activity = this.mActivity;
            o.LJII(activity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            View view3 = this.mView;
            o.LJIIIIZZ(view3, "view");
            I0N LLJILJILJ = LLJILJILJ();
            C82622Wbi c82622Wbi = this.LJLIL;
            AqS173S0100000_7 aqS173S0100000_7 = new AqS173S0100000_7(this, 190);
            AqS157S0100000_7 aqS157S0100000_7 = new AqS157S0100000_7(this, 370);
            i40.getClass();
            I40.LIZ((C29S) activity, this, view3, z, LLJILJILJ, c82622Wbi, aqS173S0100000_7, aqS157S0100000_7);
            HYT hyt = LLI;
            ShortVideoContext shortVideoContext = LLJILJIL();
            hyt.getClass();
            o.LJIIIZ(shortVideoContext, "shortVideoContext");
            if (shortVideoContext.LJJJI() || shortVideoContext.LJJIJIIJI() || shortVideoContext.LJJ()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                LLJJIII(4);
            } else {
                LLJJ();
            }
            this.LJLJJL.LIZIZ(this, new AObjectS86S0100000_7(this, 166));
            this.LJLILLLLZI.LIZIZ(this, new AObjectS86S0100000_7(this, 167));
            if (TextUtils.equals(LLJILJIL().shootWay, "upload_anchor") || (C46140I8y.LIZ(LLJILJIL().enterFrom) && !HVI.LIZ())) {
                G8G.LIZ.start(OpenAlbumPanelPerformanceMonitor.INSTANCE, "onClick");
                this.LJLJLJ.invoke(Boolean.FALSE);
                Activity requireActivity = requireActivity();
                o.LJIIIIZZ(requireActivity, "requireActivity()");
                HYT.LIZ(requireActivity, LLJILJIL(), this.LJLIL, null);
            }
            this.LJLJJLL.LIZ.LIZLLL(this, new AObjectS86S0100000_7(this, 168));
            this.LJLJJLL.LIZIZ.LIZLLL(this, new AObjectS86S0100000_7(this, 169));
            this.LJLJI.LIZIZ(this, new AObjectS86S0100000_7(this, 170));
            this.LJLJJI.LIZLLL(this, new AObjectS86S0100000_7(this, 171));
            LiveEvent<Effect> liveEvent = this.LJLJJLL.LIZJ;
            if (liveEvent != null) {
                liveEvent.LIZLLL(this, new AObjectS86S0100000_7(this, 172));
            }
            InterfaceC45999I3n interfaceC45999I3n = (InterfaceC45999I3n) this.LJLIL.LJIIIIZZ(null, InterfaceC45999I3n.class);
            if (interfaceC45999I3n != null && (qo0 = interfaceC45999I3n.qo0()) != null) {
                qo0.LIZLLL(this, new AObjectS86S0100000_7(this, 164));
            }
            InterfaceC45979I2t interfaceC45979I2t = (InterfaceC45979I2t) this.LJLLL.LIZ(this, LLIFFJFJJ[4]);
            if (interfaceC45979I2t != null && (bottomTabIndexChangeEvent = interfaceC45979I2t.getBottomTabIndexChangeEvent()) != null) {
                bottomTabIndexChangeEvent.LIZIZ(this, new AObjectS86S0100000_7(this, 165));
            }
            Bundle LIZ = C163796bn.LIZ(this);
            if (LIZ != null) {
                String string = LIZ.getString("extra_super_entrance_pop");
                if (!TextUtils.isEmpty(string)) {
                    if (this.LLFF == null) {
                        Context requireSceneContext = requireSceneContext();
                        o.LJIIIIZZ(requireSceneContext, "requireSceneContext()");
                        C139825eE c139825eE = new C139825eE(requireSceneContext);
                        o.LJI(string);
                        c139825eE.LIZJ = string;
                        c139825eE.LIZ.LJII = -1001L;
                        c139825eE.LJI(WHL.TOP);
                        View view4 = this.LJZ;
                        if (view4 != null) {
                            c139825eE.LIZIZ(view4);
                            this.LLFF = c139825eE.LIZJ();
                        } else {
                            o.LJIJI("ivTool");
                            throw null;
                        }
                    }
                    View view5 = this.LJZ;
                    if (view5 != null) {
                        view5.postDelayed(new ARunnableS43S0100000_7(this, 81), 1000L);
                        C2U8.LIZ(new SuperEntranceEvent(1, false));
                    } else {
                        o.LJIJI("ivTool");
                        throw null;
                    }
                }
            }
            C46026I4o c46026I4o4 = this.LLD;
            if (c46026I4o4 != null) {
                if (c46026I4o4.getVisibility() == 0 && !this.LJLZ.LIZ.getBoolean("upload_tip_show", false) && !o.LJ(LLJILJIL().shootWay, "duet") && !o.LJ(LLJILJIL().shootWay, "split") && !o.LJ(LLJILJIL().shootWay, "react")) {
                    AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false).getStoryService();
                    if (!C43119Gw7.LIZ() || C1DG.LJIIIIZZ()) {
                        if (this.LLFFF == null) {
                            C60903NvH.LJIIJJI().LJIL().LIZIZ(this.mActivity, new AqS157S0100000_7(this, 371));
                        }
                        C46026I4o c46026I4o5 = this.LLD;
                        if (c46026I4o5 != null) {
                            c46026I4o5.postDelayed(new ARunnableS43S0100000_7(this, 84), 100L);
                        } else {
                            o.LJIJI("uploadButton");
                            throw null;
                        }
                    }
                }
                LLJJI();
                return;
            }
            o.LJIJI("uploadButton");
            throw null;
        }
        o.LJIJI("uploadButton");
        throw null;
    }

    @Override // X.InterfaceC73150SnK
    public final <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns) {
        return (R) C73297Sph.LJIIZILJ(vm1, interfaceC88472Yns);
    }

    @Override // X.WMH, X.WM7
    public final ViewGroup onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle) {
        int i;
        o.LJIIIZ(inflater, "inflater");
        o.LJIIIZ(container, "container");
        if (L1D.LIZIZ() || L1D.LIZ()) {
            i = R.layout.ds3;
        } else {
            i = R.layout.ds2;
        }
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, i, container, false);
        o.LJII(LLLLIILL, "null cannot be cast to non-null type android.view.ViewGroup");
        return (ViewGroup) LLLLIILL;
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at> InterfaceC92693kP subscribe(JediViewModel<S> jediViewModel, C73165SnZ<S> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super S, C76800UCe> interfaceC88471Ynr) {
        return C73297Sph.LJIIIZ(this, jediViewModel, c73165SnZ, interfaceC88471Ynr);
    }

    @Override // X.WMH, X.WM7
    public final /* bridge */ /* synthetic */ View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return onCreateView(layoutInflater, viewGroup, bundle);
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

    public C46002I3q(C82622Wbi diContainer, C40871j1 effectContainerVisibility, C40871j1 uploadVisibility, C29901Fi needNoTouchListener, C0IB relayoutEvent, I0U i0u, I0J i0j, I0H i0h) {
        int i;
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(effectContainerVisibility, "effectContainerVisibility");
        o.LJIIIZ(uploadVisibility, "uploadVisibility");
        o.LJIIIZ(needNoTouchListener, "needNoTouchListener");
        o.LJIIIZ(relayoutEvent, "relayoutEvent");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = effectContainerVisibility;
        this.LJLJI = uploadVisibility;
        this.LJLJJI = needNoTouchListener;
        this.LJLJJL = relayoutEvent;
        this.LJLJJLL = i0u;
        this.LJLJL = i0j;
        this.LJLJLJ = i0h;
        C29901Fi<C76800UCe> c29901Fi = new C29901Fi<>();
        this.LJLJLLL = c29901Fi;
        this.LJLL = c29901Fi;
        this.LJLLI = UCI.LJI(diContainer, ShortVideoContext.class, null);
        this.LJLLILLLL = UCI.LJI(diContainer, InterfaceC82086WJm.class, null);
        this.LJLLJ = UCI.LJII(diContainer, I0N.class, null);
        UCI.LJI(diContainer, I3X.class, null);
        this.LJLLL = UCI.LJII(diContainer, InterfaceC45979I2t.class, null);
        this.LJLZ = new I2I();
        if (C44363Hb5.LIZ() && !C1DG.LJIIIIZZ()) {
            i = 25;
        } else {
            i = 40;
        }
        this.LLF = C7MY.LIZIZ(i);
    }
}

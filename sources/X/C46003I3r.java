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

/* renamed from: X.I3r, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46003I3r extends AbstractC56042Hw implements InterfaceC143795kd, InterfaceC135635Tz {
    public static final C44974Hkw LLIIIJ;
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLIIIL;
    public final C82622Wbi LJLJI;
    public final C0IB<Integer> LJLJJI;
    public final C0IB<Integer> LJLJJL;
    public final LiveEvent<C76800UCe> LJLJJLL;
    public final C0IB<Boolean> LJLJL;
    public final I0U LJLJLJ;
    public final InterfaceC65784Pro<C76800UCe> LJLJLLL;
    public final InterfaceC88472Yns<Boolean, C76800UCe> LJLL;
    public final C29901Fi<C76800UCe> LJLLI;
    public final C29901Fi LJLLILLLL;
    public final C29901Fi<C76800UCe> LJLLJ;
    public final C29901Fi LJLLL;
    public final C82632Wbs LJLLLL;
    public final C82632Wbs LJLLLLLL;
    public final C82631Wbr LJLZ;
    public final C82632Wbs LJZ;
    public final C82631Wbr LJZI;
    public I43 LJZL;
    public ViewGroup LL;
    public final I2I LLD;
    public View LLF;
    public View LLFF;
    public View LLFFF;
    public boolean LLFII;
    public C46026I4o LLFZ;
    public final int LLI;
    public InterfaceC82683Wch LLIFFJFJJ;
    public InterfaceC82683Wch LLII;
    public int LLIIII;
    public I41 LLIIIILZ;

    static {
        TBT tbt = new TBT(C46003I3r.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0);
        C65352Pkq.LIZ.getClass();
        LLIIIL = new InterfaceC74236TBo[]{tbt, new TBT(C46003I3r.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0), new TBT(C46003I3r.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0), new TBT(C46003I3r.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0), new TBT(C46003I3r.class, "bottomTabApiComponent", "getBottomTabApiComponent()Lcom/ss/android/ugc/gamora/recorder/bottom/BottomTabApiComponent;", 0)};
        LLIIIJ = new C44974Hkw();
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

    public final ShortVideoContext LLJJIJIIJIL() {
        return (ShortVideoContext) this.LJLLLL.LIZ(this, LLIIIL[0]);
    }

    public final I0N LLJJIJIL() {
        return (I0N) this.LJLZ.LIZ(this, LLIIIL[2]);
    }

    public final void LLJJJ() {
        if (this.LLFII) {
            return;
        }
        if (C44260HYq.LIZ()) {
            C46026I4o c46026I4o = this.LLFZ;
            if (c46026I4o != null) {
                c46026I4o.LIZJ(C7MY.LIZIZ(40), O6R.LJJIIZ(C32151Nz.LJIIZILJ(40)));
                C46026I4o c46026I4o2 = this.LLFZ;
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
            C46026I4o c46026I4o3 = this.LLFZ;
            if (c46026I4o3 != null) {
                c46026I4o3.LIZLLL(C7MY.LIZIZ(40), C7MY.LIZIZ(40), O6R.LJJIIZ(C32151Nz.LJIIZILJ(1)));
                C46026I4o c46026I4o4 = this.LLFZ;
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
        this.LLFII = true;
        ((FirstPhotoViewModel) C165706es.LJIIIIZZ(this, null, null, 6).get(FirstPhotoViewModel.class)).LJLIL.observe(this, new AObserverS75S0100000_7(this, 44));
        C46026I4o c46026I4o5 = this.LLFZ;
        if (c46026I4o5 != null) {
            c46026I4o5.setOnClickListener(new ViewOnClickListenerC13880ga(new I46(this)));
        } else {
            o.LJIJI("uploadButton");
            throw null;
        }
    }

    @Override // X.AbstractC56042Hw
    public final int LLJILJILJ() {
        if (L1D.LIZIZ() || L1D.LIZ()) {
            return R.layout.ds3;
        }
        return R.layout.ds2;
    }

    @Override // X.AbstractC56042Hw
    public final void LLJJ() {
        boolean z;
        boolean z2;
        Activity activity;
        C0IB<WS0> bottomTabIndexChangeEvent;
        LiveEvent<OSJ<Integer, Integer, Intent>> qo0;
        Integer LIZJ;
        View requireViewById = requireViewById(R.id.j5i);
        o.LJIIIIZZ(requireViewById, "requireViewById(R.id.rl_record_tool_bottom)");
        this.LJZL = (I43) requireViewById;
        View requireViewById2 = requireViewById(R.id.crm);
        o.LJIIIIZZ(requireViewById2, "requireViewById(R.id.effect_container)");
        this.LL = (ViewGroup) requireViewById2;
        View requireViewById3 = requireViewById(R.id.fbj);
        o.LJIIIIZZ(requireViewById3, "requireViewById(R.id.iv_tool)");
        this.LLF = requireViewById3;
        View requireViewById4 = requireViewById(R.id.fbm);
        o.LJIIIIZZ(requireViewById4, "requireViewById(R.id.iv_tool_mark)");
        this.LLFF = requireViewById4;
        if (C44260HYq.LIZ() || C46029I4r.LIZ()) {
            View view = this.LLF;
            if (view != null) {
                int LIZIZ = C7MY.LIZIZ(40);
                int LIZIZ2 = C7MY.LIZIZ(40);
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.height = LIZIZ;
                layoutParams.width = LIZIZ2;
                view.setLayoutParams(layoutParams);
                View view2 = this.LLFF;
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
        this.LLFFF = requireViewById5;
        View requireViewById6 = requireViewById(R.id.moi);
        o.LJIIIIZZ(requireViewById6, "requireViewById<TuxTextView>(R.id.tv_tool_name)");
        TuxTextView tuxTextView = (TuxTextView) requireViewById6;
        if (AVExternalServiceImpl.LIZ().configService().avsettingsConfig().enableFrontFlash() && (LIZJ = C72972SkS.LIZJ(tuxTextView, "context", R.attr.d6)) != null) {
            tuxTextView.setShadowLayer(C32151Nz.LJIIZILJ(6), 0.0f, 0.0f, LIZJ.intValue());
        }
        View requireViewById7 = requireViewById(R.id.b06);
        o.LJIIIIZZ(requireViewById7, "requireViewById(R.id.btn_upload)");
        C46026I4o c46026I4o = (C46026I4o) requireViewById7;
        this.LLFZ = c46026I4o;
        c46026I4o.setText(R.string.thj);
        C46026I4o c46026I4o2 = this.LLFZ;
        if (c46026I4o2 != null) {
            c46026I4o2.post(new ARunnableS43S0100000_7(this, 85));
            if (L1D.LIZIZ() || L1D.LIZ()) {
                C46026I4o c46026I4o3 = this.LLFZ;
                if (c46026I4o3 != null) {
                    C82740Wdc.LIZJ(c46026I4o3);
                } else {
                    o.LJIJI("uploadButton");
                    throw null;
                }
            }
            boolean LJ = o.LJ(HQC.LIZ().getResourceType(), "effect");
            HQC.LIZ().getClass();
            if (C45429HsH.LIZ() && LJ && o.LJ(LLJJIJIIJIL().enterFrom, "super_entrance")) {
                z = true;
            } else {
                z = false;
            }
            I40 i40 = C46127I8l.LJLLJ;
            Activity activity2 = this.mActivity;
            o.LJII(activity2, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            View view3 = this.mView;
            o.LJIIIIZZ(view3, "view");
            I0N LLJJIJIL = LLJJIJIL();
            C82622Wbi c82622Wbi = this.LJLJI;
            AqS173S0100000_7 aqS173S0100000_7 = new AqS173S0100000_7(this, 189);
            AqS157S0100000_7 aqS157S0100000_7 = new AqS157S0100000_7(this, 369);
            i40.getClass();
            I40.LIZ((C29S) activity2, this, view3, z, LLJJIJIL, c82622Wbi, aqS173S0100000_7, aqS157S0100000_7);
            C44974Hkw c44974Hkw = LLIIIJ;
            ShortVideoContext shortVideoContext = LLJJIJIIJIL();
            c44974Hkw.getClass();
            o.LJIIIZ(shortVideoContext, "shortVideoContext");
            if (shortVideoContext.LJJJI() || shortVideoContext.LJJIJIIJI() || shortVideoContext.LJJ()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                LLJJJJ(4);
            } else {
                LLJJJ();
            }
            this.LJLJL.LIZIZ(this, new AObjectS86S0100000_7(this, 176));
            this.LJLJJI.LIZIZ(this, new AObjectS86S0100000_7(this, 177));
            if (TextUtils.equals(LLJJIJIIJIL().shootWay, "upload_anchor") || (C46140I8y.LIZ(LLJJIJIIJIL().enterFrom) && !HVI.LIZ())) {
                G8G.LIZ.start(OpenAlbumPanelPerformanceMonitor.INSTANCE, "onClick");
                this.LJLL.invoke(Boolean.FALSE);
                HYT hyt = C46002I3q.LLI;
                Activity requireActivity = requireActivity();
                o.LJIIIIZZ(requireActivity, "requireActivity()");
                ShortVideoContext LLJJIJIIJIL = LLJJIJIIJIL();
                C82622Wbi c82622Wbi2 = this.LJLJI;
                hyt.getClass();
                HYT.LIZ(requireActivity, LLJJIJIIJIL, c82622Wbi2, null);
            }
            this.LJLJLJ.LIZ.LIZLLL(this, new AObjectS86S0100000_7(this, 178));
            this.LJLJLJ.LIZIZ.LIZLLL(this, new AObjectS86S0100000_7(this, 179));
            this.LJLJJL.LIZIZ(this, new AObjectS86S0100000_7(this, 180));
            C82632Wbs c82632Wbs = this.LJZ;
            InterfaceC74236TBo<?>[] interfaceC74236TBoArr = LLIIIL;
            ((I3X) c82632Wbs.LIZ(this, interfaceC74236TBoArr[3])).ck0().LIZLLL(this, new AObjectS86S0100000_7(this, 181));
            this.LJLJJLL.LIZLLL(this, new AObjectS86S0100000_7(this, 182));
            LiveEvent<Effect> liveEvent = this.LJLJLJ.LIZJ;
            if (liveEvent != null) {
                liveEvent.LIZLLL(this, new AObjectS86S0100000_7(this, 173));
            }
            InterfaceC45999I3n interfaceC45999I3n = (InterfaceC45999I3n) this.LJLJI.LJIIIIZZ(null, InterfaceC45999I3n.class);
            if (interfaceC45999I3n != null && (qo0 = interfaceC45999I3n.qo0()) != null) {
                qo0.LIZLLL(this, new AObjectS86S0100000_7(this, 174));
            }
            InterfaceC45979I2t interfaceC45979I2t = (InterfaceC45979I2t) this.LJZI.LIZ(this, interfaceC74236TBoArr[4]);
            if (interfaceC45979I2t != null && (bottomTabIndexChangeEvent = interfaceC45979I2t.getBottomTabIndexChangeEvent()) != null) {
                bottomTabIndexChangeEvent.LIZIZ(this, new AObjectS86S0100000_7(this, 175));
            }
            Bundle LIZ = C163796bn.LIZ(this);
            if (LIZ != null) {
                String string = LIZ.getString("extra_super_entrance_pop");
                if (C78685UuP.LJJJZ(string) && (activity = this.mActivity) != null) {
                    if (this.LLIFFJFJJ == null) {
                        C139825eE c139825eE = new C139825eE(activity);
                        c139825eE.LJIIL(string);
                        c139825eE.LIZ.LJII = -1001L;
                        c139825eE.LJI(WHL.TOP);
                        View view4 = this.LLF;
                        if (view4 != null) {
                            c139825eE.LIZIZ(view4);
                            this.LLIFFJFJJ = c139825eE.LIZJ();
                        } else {
                            o.LJIJI("ivTool");
                            throw null;
                        }
                    }
                    View view5 = this.LLF;
                    if (view5 != null) {
                        view5.postDelayed(new ARunnableS43S0100000_7(this, 79), 1000L);
                        C2U8.LIZ(new SuperEntranceEvent(1, false));
                    } else {
                        o.LJIJI("ivTool");
                        throw null;
                    }
                }
            }
            C46026I4o c46026I4o4 = this.LLFZ;
            if (c46026I4o4 != null) {
                if (c46026I4o4.getVisibility() == 0 && !this.LLD.LIZ.getBoolean("upload_tip_show", false) && !o.LJ(LLJJIJIIJIL().shootWay, "duet") && !o.LJ(LLJJIJIIJIL().shootWay, "split") && !o.LJ(LLJJIJIIJIL().shootWay, "react")) {
                    AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false).getStoryService();
                    if (!C43119Gw7.LIZ() || C1DG.LJIIIIZZ()) {
                        if (this.LLII == null) {
                            Activity requireActivity2 = requireActivity();
                            o.LJIIIIZZ(requireActivity2, "requireActivity()");
                            C139825eE c139825eE2 = new C139825eE(requireActivity2);
                            c139825eE2.LJIIJJI(R.string.e74);
                            c139825eE2.LIZ.LJII = -1001L;
                            c139825eE2.LJI(WHL.TOP);
                            C46026I4o c46026I4o5 = this.LLFZ;
                            if (c46026I4o5 != null) {
                                c139825eE2.LIZIZ(c46026I4o5);
                                c139825eE2.LIZ.LJII = 5000L;
                                this.LLII = c139825eE2.LIZJ();
                            } else {
                                o.LJIJI("uploadButton");
                                throw null;
                            }
                        }
                        C46026I4o c46026I4o6 = this.LLFZ;
                        if (c46026I4o6 != null) {
                            c46026I4o6.postDelayed(new ARunnableS43S0100000_7(this, 82), 100L);
                        } else {
                            o.LJIJI("uploadButton");
                            throw null;
                        }
                    }
                }
                LLJJJIL();
                return;
            }
            o.LJIJI("uploadButton");
            throw null;
        }
        o.LJIJI("uploadButton");
        throw null;
    }

    public final void LLJJJIL() {
        I0N LLJJIJIL;
        InterfaceC46204IBk LLZL;
        InterfaceC46204IBk LLZL2;
        if (AVExternalServiceImpl.LIZ().configService().avsettingsConfig().isDuetAutoApplyEffectEnabled() && LLJJIJIIJIL().LJJJI()) {
            if (this.LLIIIILZ == null) {
                this.LLIIIILZ = new I41(this);
            }
            I0N LLJJIJIL2 = LLJJIJIL();
            if (LLJJIJIL2 != null && (LLZL2 = LLJJIJIL2.LLZL()) != null) {
                I41 i41 = this.LLIIIILZ;
                o.LJII(i41, "null cannot be cast to non-null type com.ss.android.ugc.aweme.sticker.dispatcher.StickerSelectedListener");
                LLZL2.LIZIZ(i41);
                return;
            }
            return;
        }
        I41 i412 = this.LLIIIILZ;
        if (i412 != null && (LLJJIJIL = LLJJIJIL()) != null && (LLZL = LLJJIJIL.LLZL()) != null) {
            LLZL.LIZ(i412);
        }
        this.LLIIIILZ = null;
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLJI;
    }

    @Override // X.AbstractC56042Hw
    public final C0R5 LLJILJIL(LayoutInflater inflater) {
        o.LJIIIZ(inflater, "inflater");
        Context requireSceneContext = requireSceneContext();
        o.LJIIIIZZ(requireSceneContext, "requireSceneContext()");
        C30981Jm c30981Jm = new C30981Jm(requireSceneContext);
        if (this.LJLIL) {
            int LIZ = C00F.LIZ(31744, 0, "creative_tools_record_dock_bar_async_layout_inflater_scene_enabled", true);
            c30981Jm.LIZ.getClass();
            C81121Vsb.LJLJI.setPriority(LIZ);
        }
        return c30981Jm;
    }

    @Override // X.AbstractC56042Hw
    public final void LLJJIJI(View view) {
        this.LJLLJ.LJII(C76800UCe.LIZ);
    }

    public final void LLJJJJ(int i) {
        C46026I4o c46026I4o = this.LLFZ;
        if (c46026I4o != null) {
            c46026I4o.setVisibility(i);
        } else {
            o.LJIJI("uploadButton");
            throw null;
        }
    }

    @Override // X.InterfaceC73150SnK
    public final <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns) {
        return (R) C73297Sph.LJIIZILJ(vm1, interfaceC88472Yns);
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

    public C46003I3r(C82622Wbi diContainer, C40871j1 effectContainerVisibility, C40871j1 uploadVisibility, C29901Fi needNoTouchListener, C0IB relayoutEvent, I0U i0u, I0I i0i, I0G i0g) {
        int i;
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(effectContainerVisibility, "effectContainerVisibility");
        o.LJIIIZ(uploadVisibility, "uploadVisibility");
        o.LJIIIZ(needNoTouchListener, "needNoTouchListener");
        o.LJIIIZ(relayoutEvent, "relayoutEvent");
        this.LJLJI = diContainer;
        this.LJLJJI = effectContainerVisibility;
        this.LJLJJL = uploadVisibility;
        this.LJLJJLL = needNoTouchListener;
        this.LJLJL = relayoutEvent;
        this.LJLJLJ = i0u;
        this.LJLJLLL = i0i;
        this.LJLL = i0g;
        C29901Fi<C76800UCe> c29901Fi = new C29901Fi<>();
        this.LJLLI = c29901Fi;
        this.LJLLILLLL = c29901Fi;
        C29901Fi<C76800UCe> c29901Fi2 = new C29901Fi<>();
        this.LJLLJ = c29901Fi2;
        this.LJLLL = c29901Fi2;
        this.LJLLLL = UCI.LJI(diContainer, ShortVideoContext.class, null);
        this.LJLLLLLL = UCI.LJI(diContainer, InterfaceC82086WJm.class, null);
        this.LJLZ = UCI.LJII(diContainer, I0N.class, null);
        this.LJZ = UCI.LJI(diContainer, I3X.class, null);
        this.LJZI = UCI.LJII(diContainer, InterfaceC45979I2t.class, null);
        this.LLD = new I2I();
        if (C44363Hb5.LIZ() && !C1DG.LJIIIIZZ()) {
            i = 25;
        } else {
            i = 40;
        }
        this.LLI = C7MY.LIZIZ(i);
        this.LJLIL = C00F.LIZ(31744, 0, "creative_tools_record_dock_bar_async_layout_inflater_scene_enabled", true) != 0;
    }
}

package X;

import Y.AObjectS84S0100000_2;
import Y.ARunnableS38S0100000_2;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.scene.ktx.SceneExtensionsKt;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.component.music.MusicService;
import com.ss.android.ugc.aweme.music.service.IMusicService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.views.IDlS62S0100000_2;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.605, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass605 extends WM7 implements InterfaceC143795kd, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLLLLLL;
    public final C82622Wbi LJLIL;
    public final C149385te LJLILLLLZI;
    public AnonymousClass607 LJLJI;
    public boolean LJLJJI;
    public final C82632Wbs LJLJJL;
    public final C82632Wbs LJLJJLL;
    public final C82631Wbr LJLJL;
    public final C5H3 LJLJLJ;
    public final C5H3 LJLJLLL;
    public C60B LJLL;
    public final java.util.Map<Integer, View> LJLLI;
    public String LJLLILLLL;
    public String LJLLJ;
    public long LJLLL;
    public final IMusicService LJLLLL;

    static {
        TBT tbt = new TBT(AnonymousClass605.class, "mModel", "getMModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLLLLLL = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(AnonymousClass605.class, "editToolbarApi", "getEditToolbarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/EditToolbarApi;", 0, c65351Pkp), C61845OOz.LIZJ(AnonymousClass605.class, "titlebarApi", "getTitlebarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/TitlebarApi;", 0, c65351Pkp)};
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

    public final VideoPublishEditModel LLJILJIL() {
        return (VideoPublishEditModel) this.LJLJJL.LIZ(this, LJLLLLLL[0]);
    }

    @Override // X.WM7
    public final void onDestroyView() {
        super.onDestroyView();
        C60B c60b = this.LJLL;
        if (c60b != null) {
            c60b.LIZ();
        }
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    public final void LLJILJILJ(int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        View view = this.mView;
        if (view instanceof AnonymousClass607) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams2.topMargin = SFS.LJI(7.0d) + i;
                this.mView.setLayoutParams(marginLayoutParams2);
                return;
            }
            return;
        }
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if (!(layoutParams2 instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) == null) {
            return;
        }
        marginLayoutParams.topMargin = SFS.LJI(24.5d) + i;
        this.mView.setLayoutParams(marginLayoutParams);
    }

    @Override // X.WM7
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        Integer num = C151105wQ.LJI;
        if (num != null) {
            LLJILJILJ(num.intValue());
        }
        C82631Wbr c82631Wbr = this.LJLJL;
        InterfaceC74236TBo<?>[] interfaceC74236TBoArr = LJLLLLLL;
        InterfaceC153185zm interfaceC153185zm = (InterfaceC153185zm) c82631Wbr.LIZ(this, interfaceC74236TBoArr[2]);
        if (interfaceC153185zm != null) {
            interfaceC153185zm.lz(this, new AqS168S0100000_2(this, 245));
        }
        C60B c60b = this.LJLL;
        if (c60b != null) {
            c60b.LIZ();
        }
        if (this.LJLJI != null) {
            java.util.Map<Integer, View> map = this.LJLLI;
            AnonymousClass607 anonymousClass607 = this.LJLJI;
            if (anonymousClass607 != null) {
                map.put(1, anonymousClass607);
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        Activity activity = this.mActivity;
        o.LJII(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        VideoPublishEditModel LLJILJIL = LLJILJIL();
        WM7 wm7 = this.mParentScene;
        o.LJII(wm7, "null cannot be cast to non-null type com.bytedance.scene.group.GroupScene");
        C60B c60b2 = new C60B((ActivityC45651qj) activity, LLJILJIL, (WMH) wm7, (InterfaceC145325n6) this.LJLJLJ.getValue(), (InterfaceC153275zv) this.LJLJJLL.LIZ(this, interfaceC74236TBoArr[1]));
        c60b2.LJFF(this.LJLLI);
        c60b2.LIZLLL(this.LJLLI);
        c60b2.LJ(this.LJLLI);
        java.util.Map<Integer, View> map2 = this.LJLLI;
        o.LJIIIZ(map2, "map");
        if (C44384HbQ.LJJIFFI()) {
            if (((InterfaceC153275zv) this.LJLJJLL.LIZ(this, interfaceC74236TBoArr[1])).vq() != null) {
                C60903NvH.LJIIJJI().LJJIL().getCombinedShootModeTipShown(true);
            }
            c60b2.LIZIZ((View) ((LinkedHashMap) this.LJLLI).get(1));
        }
        this.LJLL = c60b2;
        C0IB<String> c0ib = this.LJLILLLLZI.LIZ;
        if (c0ib != null) {
            c0ib.LIZIZ(this, new AObjectS84S0100000_2(this, 117));
            C0IB<Integer> c0ib2 = this.LJLILLLLZI.LJI;
            if (c0ib2 != null) {
                c0ib2.LIZIZ(this, new AObjectS84S0100000_2(this, 118));
                C0IB<TextUtils.TruncateAt> c0ib3 = this.LJLILLLLZI.LIZJ;
                if (c0ib3 != null) {
                    c0ib3.LIZIZ(this, new AObjectS84S0100000_2(this, 119));
                    C0IB<Boolean> c0ib4 = this.LJLILLLLZI.LIZLLL;
                    if (c0ib4 != null) {
                        c0ib4.LIZIZ(this, new AObjectS84S0100000_2(this, LiveTryModeCountDownThresholdSetting.DEFAULT));
                        C0IB<Boolean> c0ib5 = this.LJLILLLLZI.LJFF;
                        if (c0ib5 != null) {
                            c0ib5.LIZIZ(this, new AObjectS84S0100000_2(this, 121));
                            C0IB<Boolean> c0ib6 = this.LJLILLLLZI.LJ;
                            if (c0ib6 != null) {
                                c0ib6.LIZIZ(this, new AObjectS84S0100000_2(this, 122));
                                C0IB<Boolean> c0ib7 = this.LJLILLLLZI.LIZIZ;
                                if (c0ib7 != null) {
                                    c0ib7.LIZIZ(this, new AObjectS84S0100000_2(this, 123));
                                    C0IB<OSZ<Boolean, InterfaceC65784Pro<C76800UCe>>> c0ib8 = this.LJLILLLLZI.LJII;
                                    if (c0ib8 != null) {
                                        c0ib8.LIZIZ(this, new AObjectS84S0100000_2(this, 116));
                                        if (!this.LJLJJI) {
                                            IDlS62S0100000_2 iDlS62S0100000_2 = new IDlS62S0100000_2(this, 27, 42);
                                            AnonymousClass607 anonymousClass6072 = this.LJLJI;
                                            if (anonymousClass6072 != null) {
                                                anonymousClass6072.setChooseMusicLayerListener(iDlS62S0100000_2);
                                            }
                                        } else {
                                            IDlS62S0100000_2 iDlS62S0100000_22 = new IDlS62S0100000_2(this, 28, 42);
                                            AnonymousClass607 anonymousClass6073 = this.LJLJI;
                                            if (anonymousClass6073 != null) {
                                                anonymousClass6073.setChooseMusicLayerListener(iDlS62S0100000_22);
                                            }
                                        }
                                        AnonymousClass607 anonymousClass6074 = this.LJLJI;
                                        if (anonymousClass6074 != null) {
                                            anonymousClass6074.setCancelMusicLayerListener(new IDlS62S0100000_2(this, 25, 42));
                                        }
                                        AnonymousClass607 anonymousClass6075 = this.LJLJI;
                                        if (anonymousClass6075 != null) {
                                            anonymousClass6075.setCutMusicLayerListener(new IDlS62S0100000_2(this, 26, 42));
                                            return;
                                        }
                                        return;
                                    }
                                    o.LJIJI("showOrHideWithAnim");
                                    throw null;
                                }
                                o.LJIJI("titleVisible");
                                throw null;
                            }
                            o.LJIJI("titleEnabled");
                            throw null;
                        }
                        o.LJIJI("titleAddMask");
                        throw null;
                    }
                    o.LJIJI("deleteVisible");
                    throw null;
                }
                o.LJIJI("titleEllipsize");
                throw null;
            }
            o.LJIJI("musicIconState");
            throw null;
        }
        o.LJIJI("titleText");
        throw null;
    }

    public AnonymousClass605(C82622Wbi diContainer, C149385te argument) {
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(argument, "argument");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = argument;
        this.LJLJJL = UCI.LJI(diContainer, VideoPublishEditModel.class, null);
        this.LJLJJLL = UCI.LJI(diContainer, InterfaceC153275zv.class, null);
        this.LJLJL = UCI.LJII(diContainer, InterfaceC153185zm.class, null);
        this.LJLJLJ = C269113v.LIZIZ(this, InterfaceC145325n6.class);
        this.LJLJLLL = C269113v.LIZIZ(this, InterfaceC145455nJ.class);
        this.LJLLI = new LinkedHashMap();
        this.LJLLL = -1L;
        IMusicService LJJLIIIJJI = MusicService.LJJLIIIJJI();
        o.LJIIIIZZ(LJJLIIIJJI, "get().getService(IMusicService::class.java)");
        this.LJLLLL = LJJLIIIJJI;
    }

    @Override // X.WM7
    public final void onViewCreated(View view, Bundle bundle) {
        AnonymousClass607 anonymousClass607;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        HashMap<String, Integer> extraShareOptions = LLJILJIL().creativeFlowData.getExtraShareOptions();
        if (extraShareOptions != null && extraShareOptions.containsKey("tiktok_videokit_disable_music_selection")) {
            HashMap<String, Integer> extraShareOptions2 = LLJILJIL().creativeFlowData.getExtraShareOptions();
            o.LJI(extraShareOptions2);
            Integer num = extraShareOptions2.get("tiktok_videokit_disable_music_selection");
            if (num != null && num.intValue() == 1) {
                this.LJLJJI = true;
            }
        }
        if (view instanceof AnonymousClass607) {
            anonymousClass607 = (AnonymousClass607) view;
        } else {
            anonymousClass607 = null;
        }
        this.LJLJI = anonymousClass607;
        if (anonymousClass607 != null) {
            anonymousClass607.setChooseMusicDockerContentView(anonymousClass607.findViewById(R.id.baz));
            anonymousClass607.setChooseMusicClickContainer(anonymousClass607.findViewById(R.id.bb6));
            anonymousClass607.setChooseMusicTextView((C8HF) anonymousClass607.findViewById(R.id.mok));
            anonymousClass607.setChooseMusicIconView((TuxIconView) anonymousClass607.findViewById(R.id.bb4));
            anonymousClass607.setCancelMusicClickContainer(anonymousClass607.findViewById(R.id.bay));
            anonymousClass607.setCutMusicClickContainer(anonymousClass607.findViewById(R.id.bb3));
        }
        AnonymousClass607 anonymousClass6072 = this.LJLJI;
        if (anonymousClass6072 != null) {
            anonymousClass6072.LIZLLL(AnonymousClass609.DARK_COLOR_WITHOUT_CANCEL_BUTTON);
        }
        SceneExtensionsKt.LIZIZ(this, new ARunnableS38S0100000_2(this, 103));
    }

    @Override // X.InterfaceC73150SnK
    public final <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns) {
        return (R) C73297Sph.LJIIZILJ(vm1, interfaceC88472Yns);
    }

    @Override // X.WM7
    public final View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle) {
        int i;
        o.LJIIIZ(inflater, "inflater");
        o.LJIIIZ(container, "container");
        if (C46126I8k.LIZ() == 4) {
            i = R.layout.drq;
        } else {
            i = R.layout.drp;
        }
        if (C165126dw.LIZ() && this.mActivity != null) {
            Context requireSceneContext = requireSceneContext();
            o.LJIIIIZZ(requireSceneContext, "requireSceneContext()");
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("editor");
            LIZ.append(i);
            View LIZJ = V0Z.LIZJ(requireSceneContext, i, container, X1D.LIZIZ(LIZ), inflater);
            if (LIZJ != null) {
                return LIZJ;
            }
        }
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, i, container, false);
        o.LJIIIIZZ(LLLLIILL, "inflater.inflate(layoutId, container, false)");
        return LLLLIILL;
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

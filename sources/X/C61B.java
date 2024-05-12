package X;

import Y.AObserverS70S0100000_2;
import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.ftc.components.toolbar.FTCEditToolbarState;
import com.ss.android.ugc.aweme.ftc.components.toolbar.FTCEditToolbarViewModel;
import com.ss.android.ugc.aweme.mvtheme.MvCreateVideoData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.views.IDlS62S0100000_2;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS184S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.61B, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C61B extends WM7 implements InterfaceC143795kd, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLLILLLL;
    public final C82622Wbi LJLIL;
    public ConstraintLayout LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C82632Wbs LJLJJI;
    public ImageView LJLJJL;
    public TextView LJLJJLL;
    public ViewGroup LJLJL;
    public final java.util.Map<Integer, View> LJLJLJ;
    public C61C LJLJLLL;
    public AnonymousClass618 LJLL;
    public final C5H3 LJLLI;

    static {
        TBT tbt = new TBT(C61B.class, "mModel", "getMModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C65352Pkq.LIZ.getClass();
        LJLLILLLL = new InterfaceC74236TBo[]{tbt};
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

    public final FTCEditToolbarViewModel LLJILJIL() {
        return (FTCEditToolbarViewModel) this.LJLJI.getValue();
    }

    public final VideoPublishEditModel LLJILJILJ() {
        return (VideoPublishEditModel) this.LJLJJI.LIZ(this, LJLLILLLL[0]);
    }

    @Override // X.WM7
    public final void onDestroyView() {
        super.onDestroyView();
        AnonymousClass618 anonymousClass618 = this.LJLL;
        if (anonymousClass618 != null) {
            anonymousClass618.LIZ();
        }
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    public C61B(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = diContainer;
        this.LJLJI = C221108m2.LIZIZ(new AqS152S0100000_2(this, 29));
        this.LJLJJI = UCI.LJI(diContainer, VideoPublishEditModel.class, null);
        this.LJLJLJ = new LinkedHashMap();
        this.LJLLI = C269113v.LIZ(this, InterfaceC143655kP.class);
    }

    @Override // X.WM7
    public final void onViewCreated(View view, Bundle bundle) {
        Object obj;
        int i;
        boolean z;
        int i2;
        ArrayList<String> arrayList;
        Bundle bundle2;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        View requireViewById = requireViewById(R.id.aeg);
        o.LJIIIIZZ(requireViewById, "requireViewById(R.id.back)");
        ImageView imageView = (ImageView) requireViewById;
        this.LJLJJL = imageView;
        imageView.setImageResource(R.drawable.axo);
        ImageView imageView2 = this.LJLJJL;
        MvCreateVideoData mvCreateVideoData = null;
        if (imageView2 != null) {
            C16880lQ.LJIILLIIL(imageView2, new IDlS62S0100000_2(this, (AbstractC156316Bn<Object>) 3));
            View requireViewById2 = requireViewById(R.id.m0a);
            o.LJIIIIZZ(requireViewById2, "requireViewById(R.id.tv_back_tip)");
            TextView textView = (TextView) requireViewById2;
            this.LJLJJLL = textView;
            C16880lQ.LJIJI(textView, new IDlS62S0100000_2(this, (AbstractC156316Bn<Object>) 4));
            View requireViewById3 = requireViewById(R.id.fn2);
            o.LJIIIIZZ(requireViewById3, "requireViewById(R.id.layout_tool_container)");
            this.LJLJL = (ViewGroup) requireViewById3;
            C73297Sph.LIZLLL(this, LLJILJIL(), new TBT() { // from class: X.61F
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj2) {
                    return ((FTCEditToolbarState) obj2).getBackVisible();
                }
            }, new AqS184S0100000_2(this, 5));
            C73297Sph.LIZLLL(this, LLJILJIL(), new TBT() { // from class: X.61G
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj2) {
                    return ((FTCEditToolbarState) obj2).getBackTipVisible();
                }
            }, new AqS184S0100000_2(this, 6));
            C73297Sph.LIZLLL(this, LLJILJIL(), new TBT() { // from class: X.61J
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj2) {
                    return ((FTCEditToolbarState) obj2).getBackTipText();
                }
            }, new AqS184S0100000_2(this, 7));
            C73297Sph.LIZLLL(this, LLJILJIL(), new TBT() { // from class: X.61K
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj2) {
                    return ((FTCEditToolbarState) obj2).getTitleBarItems();
                }
            }, new AqS184S0100000_2(this, 8));
            C73297Sph.LJIIJJI(this, LLJILJIL(), new TBT() { // from class: X.61H
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj2) {
                    return ((FTCEditToolbarState) obj2).getHideMoreEvent();
                }
            }, new AqS184S0100000_2(this, 3));
            LLJILJIL().Lv0().observe(C86793Y4n.LJJIJIIJIL(this), new AObserverS70S0100000_2(this, 3));
            C73297Sph.LIZLLL(this, LLJILJIL(), new TBT() { // from class: X.61E
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj2) {
                    return ((FTCEditToolbarState) obj2).getTopMargin();
                }
            }, new AqS184S0100000_2(this, 4));
            ArrayList arrayList2 = new ArrayList();
            AbstractC42651GoZ LJIJ = C86793Y4n.LJIJ(this);
            if (LJIJ != null && (bundle2 = LJIJ.mArguments) != null) {
                obj = bundle2.getSerializable("key_mv_theme_data");
            } else {
                obj = null;
            }
            if (obj instanceof MvCreateVideoData) {
                mvCreateVideoData = (MvCreateVideoData) obj;
            }
            boolean z2 = false;
            if (mvCreateVideoData != null && (arrayList = mvCreateVideoData.selectMediaList) != null) {
                i = arrayList.size();
            } else {
                i = 0;
            }
            if (i > 1) {
                z = true;
            } else {
                z = false;
            }
            if ("slideshow".equals(H7R.LJIIIZ(LLJILJILJ())) && z && C60T.LIZ()) {
                arrayList2.add(new C1536461g(5, -1, Integer.valueOf(R.string.gfw), null, Integer.valueOf(R.raw.icon_camera_filter_fill), null, false, 104));
                LLJILJIL().Sv0(arrayList2);
            } else {
                arrayList2.add(new C1536461g(5, -1, Integer.valueOf(R.string.gfw), null, Integer.valueOf(R.raw.icon_camera_filter_fill), null, false, 104));
                if (H7R.LJJJ(LLJILJILJ())) {
                    arrayList2.add(new C1536461g(15, -1, Integer.valueOf(R.string.fjf), null, Integer.valueOf(R.raw.icon_video_play_split_fill), null, false, 104));
                }
                if (C44384HbQ.LJJII(LLJILJILJ())) {
                    arrayList2.add(new C1536461g(6, -1, Integer.valueOf(R.string.bzk), null, Integer.valueOf(R.raw.icon_audio_editing), null, false, 104));
                }
                if (C44384HbQ.LJJIII(LLJILJILJ())) {
                    arrayList2.add(new C1536461g(10, -1, Integer.valueOf(R.string.e3_), null, Integer.valueOf(R.raw.icon_mic_fill), null, false, 104));
                }
                arrayList2.add(new C1536461g(8, R.drawable.b6r, Integer.valueOf(R.string.ed3), null, null, null, false, LiveTryModeCountDownThresholdSetting.DEFAULT));
                Integer valueOf = Integer.valueOf(R.string.rfx);
                if (C149055t7.LIZ()) {
                    i2 = R.raw.icon_control_fill;
                } else {
                    i2 = R.raw.icon_speaker_2_fill_ltr;
                }
                arrayList2.add(new C1536461g(7, -1, valueOf, null, Integer.valueOf(i2), null, false, 104));
                LLJILJIL().Sv0(arrayList2);
            }
            if (LLJILJILJ().mIsFromDraft) {
                if (LLJILJILJ().isUploadVideo()) {
                    LLJILJIL().V10(false);
                } else {
                    LLJILJIL().V10(true);
                }
                if (LLJILJILJ().isPhotoMvMode && LLJILJILJ().getOriginal() == 1) {
                    LLJILJIL().V10(true);
                    FTCEditToolbarViewModel LLJILJIL = LLJILJIL();
                    Activity activity = this.mActivity;
                    o.LJI(activity);
                    String string = activity.getResources().getString(R.string.e56);
                    o.LJIIIIZZ(string, "activity!!.resources.get…g.creation_picdraft_edit)");
                    LLJILJIL.cm(string);
                }
            }
            if (C44384HbQ.LJIILIIL(LLJILJILJ())) {
                if (LLJILJILJ().veAudioRecorderParam != null && LLJILJILJ().veAudioRecorderParam.hasRecord()) {
                    LLJILJIL().fg0(6, true);
                } else {
                    LLJILJIL().fg0(6, false);
                }
            }
            if (LLJILJILJ().getMMusicPath() != null) {
                z2 = true;
            }
            LLJILJIL().Jf(8, z2);
            ((InterfaceC143655kP) this.LJLLI.getValue()).Kh().observe(C86793Y4n.LJJIJIIJIL(this), new AObserverS70S0100000_2(this, 4));
            if (!C44384HbQ.LJJII(LLJILJILJ())) {
                C1536161d.LIZLLL(-1, "voice");
                return;
            } else {
                C1536161d.LIZLLL(C1536161d.LJI, "voice");
                return;
            }
        }
        o.LJIJI("mBackImageView");
        throw null;
    }

    @Override // X.InterfaceC73150SnK
    public final <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns) {
        return (R) C73297Sph.LJIIZILJ(vm1, interfaceC88472Yns);
    }

    @Override // X.WM7
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ConstraintLayout constraintLayout = (ConstraintLayout) C6D8.LIZJ(layoutInflater, "inflater", viewGroup, "container", layoutInflater, R.layout.cd8, viewGroup, false, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        this.LJLILLLLZI = constraintLayout;
        return constraintLayout;
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

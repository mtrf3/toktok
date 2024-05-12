package X;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.ftc.components.toolbar.FTCEditToolbarViewModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.views.IDlS62S0100000_2;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.611, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass611 extends WM7 implements InterfaceC143795kd, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLL;
    public final C82622Wbi LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C82632Wbs LJLJI;
    public final C5H3 LJLJJI;
    public RelativeLayout LJLJJL;
    public View LJLJJLL;
    public LinearLayout LJLJL;
    public final java.util.Map<Integer, View> LJLJLJ;
    public AnonymousClass618 LJLJLLL;

    static {
        TBT tbt = new TBT(AnonymousClass611.class, "mModel", "getMModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C65352Pkq.LIZ.getClass();
        LJLL = new InterfaceC74236TBo[]{tbt};
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
        return (FTCEditToolbarViewModel) this.LJLILLLLZI.getValue();
    }

    @Override // X.WM7
    public final void onDestroyView() {
        super.onDestroyView();
        AnonymousClass618 anonymousClass618 = this.LJLJLLL;
        if (anonymousClass618 != null) {
            anonymousClass618.LIZ();
        }
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    public AnonymousClass611(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS152S0100000_2(this, 23));
        this.LJLJI = UCI.LJI(diContainer, VideoPublishEditModel.class, null);
        this.LJLJJI = C269113v.LIZ(this, InterfaceC143655kP.class);
        this.LJLJLJ = new LinkedHashMap();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0076, code lost:
    
        if (r2.size() > 1) goto L16;
     */
    @Override // X.WM7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onActivityCreated(android.os.Bundle r27) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass611.onActivityCreated(android.os.Bundle):void");
    }

    @Override // X.WM7
    public final void onViewCreated(View view, Bundle bundle) {
        TextView textView;
        Typeface LIZLLL;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        View requireViewById = requireViewById(R.id.fh6);
        o.LJIIIIZZ(requireViewById, "requireViewById(R.id.layout_bottom_tool)");
        this.LJLJJL = (RelativeLayout) requireViewById;
        View requireViewById2 = requireViewById(R.id.aov);
        o.LJIIIIZZ(requireViewById2, "requireViewById(R.id.bottom_bar_container)");
        this.LJLJL = (LinearLayout) requireViewById2;
        View requireViewById3 = requireViewById(R.id.h12);
        o.LJIIIIZZ(requireViewById3, "requireViewById(R.id.next_step)");
        this.LJLJJLL = requireViewById3;
        C16880lQ.LJIIJ(new IDlS62S0100000_2(this, 2, 42), requireViewById3);
        View view2 = this.LJLJJLL;
        if (view2 != null) {
            if ((view2 instanceof TextView) && (textView = (TextView) view2) != null && (LIZLLL = C8HI.LIZJ().LIZLLL("medium")) != null) {
                textView.setTypeface(LIZLLL);
            }
            Activity activity = this.mActivity;
            if (activity != null && C60P.LIZ(activity)) {
                if (C173636rf.LIZIZ(activity)) {
                    View view3 = this.LJLJJLL;
                    if (view3 != null) {
                        view3.setBackground(C04270Et.LIZIZ(activity, R.drawable.rp));
                        return;
                    } else {
                        o.LJIJI("nextStep");
                        throw null;
                    }
                }
                View view4 = this.LJLJJLL;
                if (view4 != null) {
                    view4.setBackground(C04270Et.LIZIZ(activity, R.drawable.ro));
                    return;
                } else {
                    o.LJIJI("nextStep");
                    throw null;
                }
            }
            return;
        }
        o.LJIJI("nextStep");
        throw null;
    }

    @Override // X.InterfaceC73150SnK
    public final <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns) {
        return (R) C73297Sph.LJIIZILJ(vm1, interfaceC88472Yns);
    }

    @Override // X.WM7
    public final View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        o.LJIIIZ(container, "container");
        Activity activity = this.mActivity;
        if (activity != null) {
            o.LJI(activity);
            if (C60P.LIZ(activity)) {
                View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.cd3, container, false);
                o.LJIIIIZZ(LLLLIILL, "inflater.inflate(R.layou…_small, container, false)");
                return LLLLIILL;
            }
        }
        View LLLLIILL2 = C16880lQ.LLLLIILL(inflater, R.layout.cd2, container, false);
        o.LJIIIIZZ(LLLLIILL2, "inflater.inflate(R.layou…om_bar, container, false)");
        return LLLLIILL2;
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

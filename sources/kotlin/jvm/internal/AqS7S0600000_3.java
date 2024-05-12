package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.AbstractC72932td;
import X.C113554cx;
import X.C193627io;
import X.C198367qS;
import X.C213148Yc;
import X.C213168Ye;
import X.C213178Yf;
import X.C26227ARb;
import X.C26231ARf;
import X.C26338AVi;
import X.C3C8;
import X.C56412MCa;
import X.C62387Oe7;
import X.C68322mC;
import X.C73305Spp;
import X.C76800UCe;
import X.C8YR;
import X.FMX;
import X.InterfaceC62486Ofi;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import X.InterfaceC88475Ynv;
import X.OSZ;
import X.TBW;
import X.UC0;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.share.improve.pkg.VideoCollectionSharePackage;
import com.zhiliaoapp.musically.R;

/* loaded from: classes4.dex */
public class AqS7S0600000_3 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS7S0600000_3 aqS7S0600000_3) {
        return ((AssemViewModel) aqS7S0600000_3.l0).getVmDispatcher().LJIIIIZZ(null, (TBW) aqS7S0600000_3.l1, (C56412MCa) aqS7S0600000_3.l2, C213148Yc.LJLIL, (InterfaceC88472Yns) aqS7S0600000_3.l3, (InterfaceC65784Pro) aqS7S0600000_3.l4, (InterfaceC88472Yns) aqS7S0600000_3.l5);
    }

    public static final Object invoke$1(AqS7S0600000_3 aqS7S0600000_3) {
        C8YR vmDispatcher = ((AssemViewModel) aqS7S0600000_3.l0).getVmDispatcher();
        LifecycleOwner lifecycleOwner = (LifecycleOwner) aqS7S0600000_3.l1;
        return vmDispatcher.LJFF((TBW) aqS7S0600000_3.l2, (C56412MCa) aqS7S0600000_3.l3, lifecycleOwner, (InterfaceC88472Yns) aqS7S0600000_3.l4, C213168Ye.LJLIL, (InterfaceC88472Yns) aqS7S0600000_3.l5);
    }

    public static final Object invoke$2(AqS7S0600000_3 aqS7S0600000_3) {
        C26338AVi.LJI((C73305Spp) aqS7S0600000_3.l0, null, 0, null, null, false, 29);
        ((C73305Spp) aqS7S0600000_3.l0).LJFF();
        ((C73305Spp) aqS7S0600000_3.l0).setVisibility(0);
        ((View) aqS7S0600000_3.l1).setEnabled(false);
        ((View) aqS7S0600000_3.l2).setVisibility(0);
        ((ImageView) ((View) aqS7S0600000_3.l3)).setVisibility(8);
        ((TextView) aqS7S0600000_3.l4).setVisibility(8);
        ((View) aqS7S0600000_3.l5).setVisibility(8);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$3(AqS7S0600000_3 aqS7S0600000_3) {
        C26227ARb c26227ARb = new C26227ARb((Context) aqS7S0600000_3.l0);
        Context context = (Context) aqS7S0600000_3.l0;
        C68322mC c68322mC = (C68322mC) aqS7S0600000_3.l1;
        C193627io c193627io = (C193627io) aqS7S0600000_3.l2;
        VideoCollectionSharePackage videoCollectionSharePackage = (VideoCollectionSharePackage) aqS7S0600000_3.l3;
        C68322mC c68322mC2 = (C68322mC) aqS7S0600000_3.l4;
        C68322mC c68322mC3 = (C68322mC) aqS7S0600000_3.l5;
        c26227ARb.LJII = false;
        c26227ARb.LJFF(context.getString(R.string.hzk));
        c26227ARb.LIZIZ(context.getString(R.string.hzj));
        UC0.LIZJ(c26227ARb, new C198367qS(context, c68322mC, c193627io, videoCollectionSharePackage, c68322mC2, c68322mC3));
        new C26231ARf(c26227ARb).LIZLLL();
        DialogFragment dialogFragment = (DialogFragment) ((C68322mC) aqS7S0600000_3.l1).element;
        if (dialogFragment != null) {
            dialogFragment.dismissAllowingStateLoss();
        }
        FMX.LJIIL("show_make_public_popup", C113554cx.LJJLIIIIJ(new OSZ("collection_id", ((C193627io) aqS7S0600000_3.l2).LIZ), new OSZ("collection_name", ((C193627io) aqS7S0600000_3.l2).LIZJ), new OSZ("enter_from", ((C193627io) aqS7S0600000_3.l2).LJII)));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS7S0600000_3 aqS7S0600000_3) {
        ((InterfaceC88475Ynv) aqS7S0600000_3.l0).invoke((C3C8) aqS7S0600000_3.l1, aqS7S0600000_3.l2, aqS7S0600000_3.l3, aqS7S0600000_3.l4, aqS7S0600000_3.l5);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS7S0600000_3(C73305Spp c73305Spp, View view, View view2, View view3, TextView textView, View view4, int i) {
        super(0);
        this.$t = i;
        this.l0 = c73305Spp;
        this.l1 = view;
        this.l2 = view2;
        this.l3 = view3;
        this.l4 = textView;
        this.l5 = view4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS7S0600000_3(InterfaceC88475Ynv interfaceC88475Ynv, InterfaceC88475Ynv<C3C8, Object, Object, Object, Object, C76800UCe> interfaceC88475Ynv2, C3C8 c3c8, Object obj, Object obj2, Object obj3, Object obj4) {
        super(0);
        this.$t = obj4;
        this.l0 = interfaceC88475Ynv;
        this.l1 = interfaceC88475Ynv2;
        this.l2 = c3c8;
        this.l3 = obj;
        this.l4 = obj2;
        this.l5 = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS7S0600000_3(Context context, Context context2, C68322mC<TuxSheet> c68322mC, C193627io c193627io, VideoCollectionSharePackage videoCollectionSharePackage, C68322mC<InterfaceC62486Ofi> c68322mC2, C68322mC<C62387Oe7> c68322mC3) {
        super(0);
        this.$t = c68322mC3;
        this.l0 = context;
        this.l1 = context2;
        this.l2 = c68322mC;
        this.l3 = c193627io;
        this.l4 = videoCollectionSharePackage;
        this.l5 = c68322mC2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS7S0600000_3(AssemViewModel assemViewModel, AssemViewModel<S> assemViewModel2, TBW<S, ? extends AbstractC72932td<? extends T>> tbw, C56412MCa<C213178Yf<AbstractC72932td<T>>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC88472Yns<? super T, C76800UCe> interfaceC88472Yns2) {
        super(0);
        this.$t = interfaceC88472Yns2;
        this.l0 = assemViewModel;
        this.l1 = assemViewModel2;
        this.l2 = tbw;
        this.l3 = c56412MCa;
        this.l4 = interfaceC88472Yns;
        this.l5 = interfaceC65784Pro;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS7S0600000_3(AssemViewModel assemViewModel, AssemViewModel<S> assemViewModel2, LifecycleOwner lifecycleOwner, TBW<S, ? extends A> tbw, C56412MCa<C213178Yf<A>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88472Yns<? super A, C76800UCe> interfaceC88472Yns2) {
        super(0);
        this.$t = interfaceC88472Yns2;
        this.l0 = assemViewModel;
        this.l1 = assemViewModel2;
        this.l2 = lifecycleOwner;
        this.l3 = tbw;
        this.l4 = c56412MCa;
        this.l5 = interfaceC88472Yns;
    }
}

package X;

import X.C0I6;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.ui_component.UiState;
import java.lang.reflect.Field;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS184S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6eh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC165596eh<T extends JediViewModel<? extends UiState> & LifecycleOwner & C0I6> extends AbstractC29891Fh<T> implements InterfaceC151715xP {
    public final C62X LJLIL = new InterfaceC73141SnB(this) { // from class: X.62X
        public final AbstractC165596eh<T> LJLIL;

        @Override // X.InterfaceC73141SnB
        public final /* bridge */ /* synthetic */ LifecycleOwner getLifecycleOwner() {
            return this.LJLIL;
        }

        {
            this.LJLIL = this;
        }
    };
    public final C165666eo LJLILLLLZI = C165666eo.LJLIL;
    public final C5H3 LJLJI;
    public final C5H3 LJLJJI;
    public static final C165676ep LJLJL = new Object() { // from class: X.6ep
    };
    public static final C62822Ol8 LJLJJL = C221108m2.LIZIZ(C165636el.INSTANCE);
    public static final C62822Ol8 LJLJJLL = C221108m2.LIZIZ(G4S.LJLIL);

    public abstract WMH LJJLI();

    public boolean LJJLIIIIJ() {
        return false;
    }

    public abstract InterfaceC65784Pro<T> LJJLIIIJILLIZJL();

    /* JADX WARN: Incorrect return type in method signature: ()TT; */
    public final JediViewModel LJJLIIIJJI() {
        return (JediViewModel) this.LJLJJI.getValue();
    }

    public void LJJLIIIJJIZ() {
    }

    public abstract void LJJLIIIJLLLLLLLZ();

    @Override // X.InterfaceC73141SnB
    public final LifecycleOwner getLifecycleOwner() {
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

    /* JADX WARN: Type inference failed for: r0v0, types: [X.62X] */
    public AbstractC165596eh() {
        EnumC221088m0 enumC221088m0 = EnumC221088m0.NONE;
        this.LJLJI = C221108m2.LIZ(enumC221088m0, new AqS152S0100000_2(this, 644));
        this.LJLJJI = C221108m2.LIZ(enumC221088m0, new AqS152S0100000_2(this, 645));
    }

    @Override // X.AbstractC29891Fh
    public final C0I6 getApiComponent() {
        return (C0I6) LJJLIIIJJI();
    }

    @Override // X.AbstractC29891Fh
    public void onCreate() {
        super.onCreate();
        JediViewModel<S> LJJLIIIJJI = LJJLIIIJJI();
        if (LJJLIIIJJI != 0) {
            C165646em c165646em = new TBT() { // from class: X.6em
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((UiState) obj).getUi();
                }
            };
            C73165SnZ<C73140SnA> c73165SnZ = new C73165SnZ<>();
            c73165SnZ.LIZ = true;
            selectSubscribe(LJJLIIIJJI, c165646em, c73165SnZ, new AqS184S0100000_2(this, 56));
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.bytedance.ui_component.LifecycleAwareViewModel<com.bytedance.ui_component.UiState>");
    }

    @Override // X.AbstractC29891Fh
    public void onDestroy() {
        super.onDestroy();
        C165676ep c165676ep = LJLJL;
        Object _viewModelStore = this.LJLJI.getValue();
        o.LJIIIIZZ(_viewModelStore, "_viewModelStore");
        this.LJLILLLLZI.getClass();
        String str = "";
        if ("".length() == 0) {
            str = C16880lQ.LJLLILLLL(LJJLIIIJJI().getClass());
        }
        o.LJIIIIZZ(str, "keyFactory().ifEmpty { _…lass.java.canonicalName }");
        c165676ep.getClass();
        Object obj = ((Field) LJLJJLL.getValue()).get(_viewModelStore);
        if (obj != null) {
            C65777Prh.LIZJ(obj).remove(str);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.HashMap<*, *> /* = java.util.HashMap<*, *> */");
    }

    @Override // X.InterfaceC73150SnK
    public final InterfaceC73141SnB getLifecycleOwnerHolder() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC73150SnK
    public final <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 viewModel1, InterfaceC88472Yns<? super S1, ? extends R> block) {
        o.LJIIIZ(viewModel1, "viewModel1");
        o.LJIIIZ(block, "block");
        return (R) C73157SnR.LJIIJJI(viewModel1, block);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at> InterfaceC92693kP subscribe(JediViewModel<S> subscribe, C73165SnZ<S> config, InterfaceC88471Ynr<? super AML, ? super S, C76800UCe> subscriber) {
        o.LJIIIZ(subscribe, "$this$subscribe");
        o.LJIIIZ(config, "config");
        o.LJIIIZ(subscriber, "subscriber");
        return C73157SnR.LJI(this, subscribe, config, subscriber);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A> InterfaceC92693kP selectSubscribe(JediViewModel<S> selectSubscribe, TBW<S, ? extends A> prop1, C73165SnZ<C73140SnA> config, InterfaceC88471Ynr<? super AML, ? super A, C76800UCe> interfaceC88471Ynr) {
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(prop1, "prop1");
        o.LJIIIZ(config, "config");
        return C73157SnR.LIZIZ(this, selectSubscribe, prop1, config, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B> InterfaceC92693kP selectSubscribe(JediViewModel<S> selectSubscribe, TBW<S, ? extends A> prop1, TBW<S, ? extends B> prop2, C73165SnZ<TMG> config, InterfaceC88473Ynt<? super AML, ? super A, ? super B, C76800UCe> subscriber) {
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(prop1, "prop1");
        o.LJIIIZ(prop2, "prop2");
        o.LJIIIZ(config, "config");
        o.LJIIIZ(subscriber, "subscriber");
        return C73157SnR.LIZJ(this, selectSubscribe, prop1, prop2, config, subscriber);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, T> InterfaceC92693kP asyncSubscribe(JediViewModel<S> asyncSubscribe, TBW<S, ? extends AbstractC26082ALm<? extends T>> prop, C73165SnZ<C73140SnA> config, InterfaceC88471Ynr<? super AML, ? super Throwable, C76800UCe> interfaceC88471Ynr, InterfaceC88472Yns<? super AML, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super AML, ? super T, C76800UCe> interfaceC88471Ynr2) {
        o.LJIIIZ(asyncSubscribe, "$this$asyncSubscribe");
        o.LJIIIZ(prop, "prop");
        o.LJIIIZ(config, "config");
        return C73157SnR.LIZ(this, asyncSubscribe, prop, config, interfaceC88471Ynr, interfaceC88472Yns, interfaceC88471Ynr2);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B, C> InterfaceC92693kP selectSubscribe(JediViewModel<S> selectSubscribe, TBW<S, ? extends A> prop1, TBW<S, ? extends B> prop2, TBW<S, ? extends C> prop3, C73165SnZ<C157166Eu> config, InterfaceC88474Ynu<? super AML, ? super A, ? super B, ? super C, C76800UCe> interfaceC88474Ynu) {
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(prop1, "prop1");
        o.LJIIIZ(prop2, "prop2");
        o.LJIIIZ(prop3, "prop3");
        o.LJIIIZ(config, "config");
        return C73157SnR.LIZLLL(this, selectSubscribe, prop1, prop2, prop3, config, interfaceC88474Ynu);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B, C, D> InterfaceC92693kP selectSubscribe(JediViewModel<S> selectSubscribe, TBW<S, ? extends A> prop1, TBW<S, ? extends B> prop2, TBW<S, ? extends C> prop3, TBW<S, ? extends D> prop4, C73165SnZ<W1T> config, InterfaceC88475Ynv<? super AML, ? super A, ? super B, ? super C, ? super D, C76800UCe> interfaceC88475Ynv) {
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(prop1, "prop1");
        o.LJIIIZ(prop2, "prop2");
        o.LJIIIZ(prop3, "prop3");
        o.LJIIIZ(prop4, "prop4");
        o.LJIIIZ(config, "config");
        return C73157SnR.LJ(this, selectSubscribe, prop1, prop2, prop3, prop4, config, interfaceC88475Ynv);
    }
}

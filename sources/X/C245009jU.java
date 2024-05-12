package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.touchpoint.core.model.TextLink;
import com.bytedance.touchpoint.core.textlink.TextLinkViewModel;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* renamed from: X.9jU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C245009jU implements KPL, InterfaceC245209jo {
    public static final C214378bB LJLIL;
    public static final C245009jU LJLILLLLZI;

    @Override // X.KPL, X.C8YZ
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final C8YZ getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.KPL, X.InterfaceC212848Wy
    public final C3C8 getActualReceiver() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final InterfaceC212848Wy<C3C8> getActualReceiverHolder() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.KPL, X.C8YM
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final C3C8 getReceiverForHostVM() {
        return null;
    }

    @Override // X.C8YM
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    static {
        C245009jU c245009jU = new C245009jU();
        LJLILLLLZI = c245009jU;
        C246049lA c246049lA = C246049lA.LJLILLLLZI;
        C214378bB c214378bB = new C214378bB(C65352Pkq.LIZ(TextLinkViewModel.class), null, C214528bQ.LJLIL, C78926UyI.LJJII(c246049lA, false), C184077Kh.LJLIL, C245049jY.INSTANCE, null, null);
        LJLIL = c214378bB;
        C8YN.LJII(c245009jU, c214378bB.getValue(), new TBT() { // from class: X.9Od
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C9OZ) obj).LJLIL;
            }
        }, C213688a4.LIZLLL(), C245019jV.LJLIL, 4);
        C8YN.LJII(c245009jU, c214378bB.getValue(), new TBT() { // from class: X.9Oe
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C9OZ) obj).LJLILLLLZI;
            }
        }, C213688a4.LIZLLL(), C245059jZ.LJLIL, 4);
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return C246049lA.LJLILLLLZI.getLifecycleRegistry();
    }

    public static boolean LIZ(TextLink textLink) {
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4 = null;
        if (textLink != null) {
            num = textLink.showTimes;
            num2 = textLink.dismissAfter;
        } else {
            num = null;
            num2 = null;
        }
        C245029jW c245029jW = C245039jX.LJI;
        if (textLink != null) {
            num3 = textLink.LIZJ;
        } else {
            num3 = null;
        }
        c245029jW.getClass();
        C245039jX LIZ = C245029jW.LIZ(num3);
        if (num != null && C245029jW.LIZIZ().getInt(C247509nW.LIZ(LIZ.LIZIZ), 0) >= num.intValue()) {
            return false;
        }
        if (textLink != null) {
            num4 = textLink.LIZJ;
        }
        C245039jX LIZ2 = C245029jW.LIZ(num4);
        if (num2 != null && C245029jW.LIZIZ().getInt(C247509nW.LIZ(LIZ2.LIZJ), 0) >= num2.intValue()) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC245209jo
    public final void LJIJJ(EnumC245179jl type) {
        o.LJIIIZ(type, "type");
        LJLIL.getValue().setState(new AqS170S0100000_4(type, 1425));
    }

    @Override // X.C8YM
    public final <S extends C33Q> InterfaceC222288nw subscribe(AssemViewModel<S> subscribe, C56412MCa<S> config, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super S, C76800UCe> subscriber) {
        o.LJIIIZ(subscribe, "$this$subscribe");
        o.LJIIIZ(config, "config");
        o.LJIIIZ(subscriber, "subscriber");
        return C212418Vh.LJIIIIZZ(this, subscribe, config, interfaceC88472Yns, subscriber);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A> InterfaceC222288nw selectSubscribe(AssemViewModel<S> selectSubscribe, TBW<S, ? extends A> prop1, C56412MCa<C213178Yf<A>> config, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super A, C76800UCe> subscriber) {
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(prop1, "prop1");
        o.LJIIIZ(config, "config");
        o.LJIIIZ(subscriber, "subscriber");
        return C212418Vh.LIZJ(this, selectSubscribe, prop1, config, interfaceC88472Yns, subscriber);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A> InterfaceC222288nw selectSubscribeOnAsync(AssemViewModel<S> selectSubscribeOnAsync, TBW<S, ? extends A> prop1, C56412MCa<C213178Yf<A>> config, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super A, C76800UCe> subscriber) {
        o.LJIIIZ(selectSubscribeOnAsync, "$this$selectSubscribeOnAsync");
        o.LJIIIZ(prop1, "prop1");
        o.LJIIIZ(config, "config");
        o.LJIIIZ(subscriber, "subscriber");
        return C212418Vh.LJII(this, selectSubscribeOnAsync, prop1, config, interfaceC88472Yns, subscriber);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B> InterfaceC222288nw selectSubscribe(AssemViewModel<S> selectSubscribe, TBW<S, ? extends A> prop1, TBW<S, ? extends B> prop2, C56412MCa<C213198Yh<A, B>> config, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88473Ynt<? super C3C8, ? super A, ? super B, C76800UCe> subscriber) {
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(prop1, "prop1");
        o.LJIIIZ(prop2, "prop2");
        o.LJIIIZ(config, "config");
        o.LJIIIZ(subscriber, "subscriber");
        return C212418Vh.LIZIZ(selectSubscribe, this, config, interfaceC88472Yns, subscriber, prop1, prop2);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C> InterfaceC222288nw selectSubscribe(AssemViewModel<S> selectSubscribe, TBW<S, ? extends A> prop1, TBW<S, ? extends B> prop2, TBW<S, ? extends C> prop3, C56412MCa<OSK<A, B, C>> config, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88474Ynu<? super C3C8, ? super A, ? super B, ? super C, C76800UCe> subscriber) {
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(prop1, "prop1");
        o.LJIIIZ(prop2, "prop2");
        o.LJIIIZ(prop3, "prop3");
        o.LJIIIZ(config, "config");
        o.LJIIIZ(subscriber, "subscriber");
        return C212418Vh.LIZLLL(this, selectSubscribe, prop1, prop2, prop3, config, interfaceC88472Yns, subscriber);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C, D> InterfaceC222288nw selectSubscribe(AssemViewModel<S> selectSubscribe, TBW<S, ? extends A> prop1, TBW<S, ? extends B> prop2, TBW<S, ? extends C> prop3, TBW<S, ? extends D> prop4, C56412MCa<OSL<A, B, C, D>> config, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88475Ynv<? super C3C8, ? super A, ? super B, ? super C, ? super D, C76800UCe> subscriber) {
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(prop1, "prop1");
        o.LJIIIZ(prop2, "prop2");
        o.LJIIIZ(prop3, "prop3");
        o.LJIIIZ(prop4, "prop4");
        o.LJIIIZ(config, "config");
        o.LJIIIZ(subscriber, "subscriber");
        return C212418Vh.LJ(this, selectSubscribe, prop1, prop2, prop3, prop4, config, interfaceC88472Yns, subscriber);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C, D, E> InterfaceC222288nw selectSubscribe(AssemViewModel<S> selectSubscribe, TBW<S, ? extends A> prop1, TBW<S, ? extends B> prop2, TBW<S, ? extends C> prop3, TBW<S, ? extends D> prop4, TBW<S, ? extends E> prop5, C56412MCa<OSM<A, B, C, D, E>> config, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88476Ynw<? super C3C8, ? super A, ? super B, ? super C, ? super D, ? super E, C76800UCe> interfaceC88476Ynw) {
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(prop1, "prop1");
        o.LJIIIZ(prop2, "prop2");
        o.LJIIIZ(prop3, "prop3");
        o.LJIIIZ(prop4, "prop4");
        o.LJIIIZ(prop5, "prop5");
        o.LJIIIZ(config, "config");
        return C212418Vh.LJFF(this, selectSubscribe, prop1, prop2, prop3, prop4, prop5, config, interfaceC88472Yns, interfaceC88476Ynw);
    }
}

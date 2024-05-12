package X;

import android.content.Context;
import android.view.View;
import kotlin.jvm.internal.IDqS420S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.2Gb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C55572Gb<T extends View> extends AbstractC531926x {
    public T LJZL;
    public InterfaceC88472Yns<? super Context, ? extends T> LL;
    public InterfaceC88472Yns<? super T, C76800UCe> LLD;

    public /* bridge */ /* synthetic */ C04D getSubCompositionView() {
        return null;
    }

    public View getViewRoot() {
        return this;
    }

    public final InterfaceC88472Yns<Context, T> getFactory() {
        return this.LL;
    }

    public final T getTypedView$ui_release() {
        return this.LJZL;
    }

    public final InterfaceC88472Yns<T, C76800UCe> getUpdateBlock() {
        return this.LLD;
    }

    public final void setFactory(InterfaceC88472Yns<? super Context, ? extends T> interfaceC88472Yns) {
        this.LL = interfaceC88472Yns;
        if (interfaceC88472Yns != null) {
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            T invoke = interfaceC88472Yns.invoke(context);
            this.LJZL = invoke;
            setView$ui_release(invoke);
        }
    }

    public final void setTypedView$ui_release(T t) {
        this.LJZL = t;
    }

    public final void setUpdateBlock(InterfaceC88472Yns<? super T, C76800UCe> value) {
        o.LJIIIZ(value, "value");
        this.LLD = value;
        setUpdate(new IDqS420S0100000((C55572Gb) this, 178));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55572Gb(Context context, AbstractC24810yD abstractC24810yD, C25730zh dispatcher) {
        super(context, abstractC24810yD, dispatcher);
        o.LJIIIZ(context, "context");
        o.LJIIIZ(dispatcher, "dispatcher");
        setClipChildren(false);
        this.LLD = C24920yO.LIZ;
    }
}

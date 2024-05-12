package com.bytedance.ies.powerlist.page.config;

import X.A2F;
import X.A2G;
import X.A2H;
import X.C208128Eu;
import X.C221108m2;
import X.C3C5;
import X.C5H3;
import X.C72280SYi;
import X.C8BG;
import X.InterfaceC67352kd;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public abstract class PowerPageSource<T> {
    public static final C72280SYi Companion = new C72280SYi();
    public C208128Eu<T> defaultSource;
    public final C5H3 defaultOperator$delegate = C221108m2.LIZIZ(new AqS162S0100000_12(this, 74));
    public C8BG<T> operator = getDefaultOperator();

    public abstract void onLoadMore(InterfaceC67352kd<? super A2G<T>> interfaceC67352kd, T t);

    public abstract void onRefresh(InterfaceC67352kd<? super A2G<T>> interfaceC67352kd);

    private final C8BG<T> getDefaultOperator() {
        return (C8BG) this.defaultOperator$delegate.getValue();
    }

    public final C8BG<T> getOperator() {
        return this.operator;
    }

    private final void setOperator(C8BG<T> c8bg) {
        C208128Eu<T> c208128Eu;
        C8BG<T> c8bg2 = this.operator;
        this.operator = c8bg;
        if (o.LJ(c8bg2, getDefaultOperator()) && (c208128Eu = this.defaultSource) != null) {
            this.operator.LIZLLL(c208128Eu.LIZ, c208128Eu.LIZIZ, c208128Eu.LIZJ);
        }
    }

    public final void onLoad(C8BG<T> operator) {
        o.LJIIIZ(operator, "operator");
        setOperator(operator);
    }

    public void onLoadLatest(InterfaceC67352kd<? super A2G<T>> continuation, T t) {
        o.LJIIIZ(continuation, "continuation");
        A2H LIZIZ = A2F.LIZIZ(A2G.LIZ);
        C3C5.m7constructorimpl(LIZIZ);
        continuation.resumeWith(LIZIZ);
    }
}

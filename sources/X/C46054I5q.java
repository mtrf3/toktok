package X;

import Y.ACListenerS42S0200000_7;
import android.view.ViewGroup;
import kotlin.jvm.internal.o;

/* renamed from: X.I5q, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46054I5q extends C46050I5m {
    public final /* synthetic */ C46049I5l LJLJJLL;

    @Override // X.C46050I5m
    public final void M(C46050I5m holder) {
        o.LJIIIZ(holder, "holder");
        C16880lQ.LJIIJ(new ACListenerS42S0200000_7(this.LJLJJLL, holder, 36), this.itemView);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C46054I5q(C46049I5l c46049I5l, ViewGroup parent) {
        super(c46049I5l, parent);
        o.LJIIIZ(parent, "parent");
        this.LJLJJLL = c46049I5l;
    }
}

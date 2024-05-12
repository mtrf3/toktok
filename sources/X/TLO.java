package X;

import android.content.Context;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TLO extends TLH {
    public final /* synthetic */ TLS LJJJJJL;
    public final /* synthetic */ ViewGroup LJJJJL;

    @Override // X.TL5
    public final RecyclerView.ViewHolder LJIIIIZZ(ViewGroup parent) {
        RecyclerView.ViewHolder invoke;
        o.LJIIIZ(parent, "parent");
        InterfaceC88471Ynr<? super ViewGroup, ? super InterfaceC65784Pro<C76800UCe>, ? extends RecyclerView.ViewHolder> interfaceC88471Ynr = this.LJJJJJL.LIZ.LJIIL.LIZIZ;
        if (interfaceC88471Ynr != null && (invoke = interfaceC88471Ynr.invoke(parent, new AqS162S0100000_12(this, 1011))) != null) {
            return invoke;
        }
        return super.LJIIIIZZ(parent);
    }

    @Override // X.TL5
    public final void LJI(RecyclerView.ViewHolder holder, TEN loadMoreState) {
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(loadMoreState, "loadMoreState");
        InterfaceC88471Ynr<? super RecyclerView.ViewHolder, ? super TEN, C76800UCe> interfaceC88471Ynr = this.LJJJJJL.LIZ.LJIIL.LIZJ;
        if (interfaceC88471Ynr != null && interfaceC88471Ynr.invoke(holder, loadMoreState) != null) {
            return;
        }
        super.LJI(holder, loadMoreState);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TLO(TLS tls, ViewGroup viewGroup, Context context, LifecycleOwner lifecycleOwner, TLL tll, TLD tld, ViewGroup viewGroup2, int i, InterfaceC88472Yns interfaceC88472Yns, String str) {
        super(context, lifecycleOwner, tll, tld, viewGroup2, i, str, interfaceC88472Yns);
        this.LJJJJJL = tls;
        this.LJJJJL = viewGroup;
    }
}

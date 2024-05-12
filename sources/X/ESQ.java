package X;

/* loaded from: classes7.dex */
public final class ESQ<T> implements InterfaceC29911Fj {
    public final /* synthetic */ C29901Fi<Object> LJLIL;
    public final /* synthetic */ InterfaceC88472Yns<Object, Object> LJLILLLLZI;

    public ESQ(C29901Fi c29901Fi, W1Z w1z) {
        this.LJLIL = c29901Fi;
        this.LJLILLLLZI = w1z;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        this.LJLIL.LJII(this.LJLILLLLZI.invoke(obj));
    }
}

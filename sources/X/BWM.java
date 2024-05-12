package X;

import com.bytedance.android.live.base.model.live.UgActivityResult;

/* loaded from: classes6.dex */
public final class BWM implements InterfaceC48038ItG<C28467BFf<UgActivityResult>, InterfaceC115714gR<?>> {
    @Override // X.InterfaceC48038ItG
    public final InterfaceC115714gR<?> apply(C28467BFf<UgActivityResult> c28467BFf) {
        C28467BFf<UgActivityResult> c28467BFf2 = c28467BFf;
        int i = c28467BFf2.data.statusCode;
        if (i != 0 && i != 51) {
            return AbstractC73672Svk.LJJI(new Exception("retry"));
        }
        return AbstractC73672Svk.LJJIJIL(c28467BFf2);
    }
}

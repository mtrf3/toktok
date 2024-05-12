package X;

import com.bytedance.pipo.checkout.pux.theme.compose.theme.interfaze.IComponentProvider;

/* renamed from: X.a6R, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92171a6R implements IComponentProvider, Comparable<IComponentProvider> {
    public final C92164a6K LJLIL = new C92164a6K();
    public final C92165a6L LJLILLLLZI = new C92165a6L();
    public final C92166a6M LJLJI = new C92166a6M();
    public final C92167a6N LJLJJI = new C92167a6N();
    public final C92162a6I LJLJJL = new C92162a6I();
    public final C92169a6P LJLJJLL = new C92169a6P();
    public final C92163a6J LJLJL = new C92163a6J();
    public final C92170a6Q LJLJLJ = new C92170a6Q();
    public final C92168a6O LJLJLLL = new C92168a6O();

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.pipo.checkout.pux.theme.compose.theme.interfaze.IComponentProvider
    public final /* synthetic */ int compareTo(IComponentProvider iComponentProvider) {
        return C91772a00.LIZ(this, iComponentProvider);
    }

    @Override // com.bytedance.pipo.checkout.pux.theme.compose.theme.interfaze.IComponentProvider, java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(IComponentProvider iComponentProvider) {
        int compareTo;
        compareTo = compareTo((IComponentProvider) iComponentProvider);
        return compareTo;
    }

    @Override // com.bytedance.pipo.checkout.pux.theme.compose.theme.interfaze.IComponentProvider
    public final int getPriority() {
        return 0;
    }

    @Override // com.bytedance.pipo.checkout.pux.theme.compose.theme.interfaze.IComponentProvider
    public final InterfaceC91769Zzx getButton() {
        return this.LJLJJL;
    }

    @Override // com.bytedance.pipo.checkout.pux.theme.compose.theme.interfaze.IComponentProvider
    public final InterfaceC91773a01 getDialog() {
        return this.LJLJL;
    }

    @Override // com.bytedance.pipo.checkout.pux.theme.compose.theme.interfaze.IComponentProvider
    public final InterfaceC91774a02 getEditText() {
        return this.LJLIL;
    }

    @Override // com.bytedance.pipo.checkout.pux.theme.compose.theme.interfaze.IComponentProvider
    public final InterfaceC91776a04 getForm() {
        return this.LJLILLLLZI;
    }

    @Override // com.bytedance.pipo.checkout.pux.theme.compose.theme.interfaze.IComponentProvider
    public final InterfaceC91775a03 getFormPrefix() {
        return this.LJLJI;
    }

    @Override // com.bytedance.pipo.checkout.pux.theme.compose.theme.interfaze.IComponentProvider
    public final InterfaceC91777a05 getLoading() {
        return this.LJLJJI;
    }

    @Override // com.bytedance.pipo.checkout.pux.theme.compose.theme.interfaze.IComponentProvider
    public final InterfaceC91778a06 getStateView() {
        return this.LJLJLLL;
    }

    @Override // com.bytedance.pipo.checkout.pux.theme.compose.theme.interfaze.IComponentProvider
    public final InterfaceC91779a07 getTextCell() {
        return this.LJLJJLL;
    }

    @Override // com.bytedance.pipo.checkout.pux.theme.compose.theme.interfaze.IComponentProvider
    public final InterfaceC91780a08 getToast() {
        return this.LJLJLJ;
    }
}

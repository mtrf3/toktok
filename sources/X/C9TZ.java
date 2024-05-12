package X;

import android.view.View;

/* renamed from: X.9TZ, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9TZ implements View.OnFocusChangeListener {
    public long LJLIL;
    public long LJLILLLLZI;
    public final InterfaceC65784Pro<C76800UCe> LJLJI;
    public final InterfaceC88471Ynr<Long, Long, C76800UCe> LJLJJI;

    /* JADX WARN: Multi-variable type inference failed */
    public C9TZ(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC88471Ynr<? super Long, ? super Long, C76800UCe> interfaceC88471Ynr) {
        this.LJLJI = interfaceC65784Pro;
        this.LJLJJI = interfaceC88471Ynr;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        if (z) {
            this.LJLIL = System.currentTimeMillis();
            this.LJLJI.invoke();
        } else {
            this.LJLILLLLZI = System.currentTimeMillis();
            this.LJLJJI.invoke(Long.valueOf(this.LJLIL), Long.valueOf(this.LJLILLLLZI));
        }
    }
}

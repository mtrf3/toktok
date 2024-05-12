package X;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes14.dex */
public final class V1G implements InterfaceC86003Zc<View> {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ ViewGroup LJLILLLLZI;
    public final /* synthetic */ KOM LJLJI;

    @Override // X.InterfaceC86003Zc
    public final void subscribe(InterfaceC73573Su9<View> interfaceC73573Su9) {
        this.LJLJI.asyncLayoutInflater.LIZ(this.LJLIL, this.LJLILLLLZI, new V1H(this, (C73433Srt) interfaceC73573Su9));
    }

    public V1G(KOM kom, int i, ViewGroup viewGroup) {
        this.LJLJI = kom;
        this.LJLIL = i;
        this.LJLILLLLZI = viewGroup;
    }
}

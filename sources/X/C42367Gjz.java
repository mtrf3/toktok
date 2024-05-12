package X;

import com.ss.android.ugc.aweme.wavepublish.cloudmerge.PublishConfigModel;

/* renamed from: X.Gjz, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42367Gjz<T> implements InterfaceC64592gB {
    public final /* synthetic */ H5Y LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    public C42367Gjz(H5Y h5y, String str) {
        this.LJLIL = h5y;
        this.LJLILLLLZI = str;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        if (((PublishConfigModel) obj).vidCanReuse) {
            this.LJLIL.LJIIL(new C42363Gjv(this.LJLILLLLZI));
        } else {
            this.LJLIL.LJIIL(new C42365Gjx(new IllegalStateException("verify failed,couldn't reuse")));
        }
    }
}

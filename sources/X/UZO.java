package X;

import java.io.InputStream;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UZO implements InterfaceC116954iR<String> {
    public final /* synthetic */ UZP LJLIL;
    public final /* synthetic */ InputStream LJLILLLLZI;
    public final /* synthetic */ InputStream LJLJI;

    @Override // X.InterfaceC116954iR
    public final void onComplete() {
    }

    @Override // X.InterfaceC116954iR
    public final void onSubscribe(InterfaceC92693kP d) {
        o.LJIIIZ(d, "d");
    }

    @Override // X.InterfaceC116954iR
    public final void onError(Throwable e) {
        o.LJIIIZ(e, "e");
        try {
            this.LJLILLLLZI.close();
            this.LJLJI.close();
        } catch (Exception unused) {
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onNext(String t) {
        o.LJIIIZ(t, "t");
        this.LJLIL.LJLJJLL.getClass();
        this.LJLIL.LJLLLL.playAnimation();
        this.LJLIL.LJLLLLLL.playAnimation();
        UZP uzp = this.LJLIL;
        uzp.LJLLJ = true;
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = uzp.LJLJJLL.LIZLLL;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
        try {
            this.LJLILLLLZI.close();
            this.LJLJI.close();
        } catch (Exception unused) {
        }
    }

    public UZO(UZP uzp, InputStream inputStream, InputStream inputStream2) {
        this.LJLIL = uzp;
        this.LJLILLLLZI = inputStream;
        this.LJLJI = inputStream2;
    }
}

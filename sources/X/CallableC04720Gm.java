package X;

import java.util.concurrent.Callable;
import java.util.zip.ZipInputStream;

/* renamed from: X.0Gm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class CallableC04720Gm implements Callable<C0GQ<C0GY>> {
    public final /* synthetic */ ZipInputStream LJLIL;
    public final /* synthetic */ String LJLILLLLZI = null;

    @Override // java.util.concurrent.Callable
    public final C0GQ<C0GY> call() {
        return C04650Gf.LJIIJ(this.LJLIL, this.LJLILLLLZI);
    }

    public CallableC04720Gm(ZipInputStream zipInputStream) {
        this.LJLIL = zipInputStream;
    }
}

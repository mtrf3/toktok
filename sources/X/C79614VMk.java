package X;

import Y.ARunnableS15S1100000_14;
import android.webkit.ValueCallback;

/* renamed from: X.VMk, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79614VMk<T> implements ValueCallback<String> {
    public final /* synthetic */ VMR LIZ;

    public C79614VMk(VMR vmr) {
        this.LIZ = vmr;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(String str) {
        this.LIZ.LIZIZ.post(new ARunnableS15S1100000_14(this, str, 18));
    }
}

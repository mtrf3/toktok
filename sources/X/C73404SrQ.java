package X;

import Y.IDdS379S0100000_7;
import com.bytedance.retrofit2.R;
import com.bytedance.retrofit2.SsHttpCall;
import java.lang.reflect.Type;
import kotlin.jvm.internal.AqS143S0200000_12;

/* renamed from: X.SrQ, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73404SrQ implements InterfaceC65014PfO<R, InterfaceC68342mE<? extends R>> {
    public final Type LIZ;

    @Override // X.InterfaceC65014PfO
    public final Type LIZ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC65014PfO
    public final Object LIZIZ(SsHttpCall ssHttpCall) {
        C84657XKj LIZ = C77275UUl.LIZ();
        LIZ.LJJIII(new AqS143S0200000_12(LIZ, ssHttpCall, 111));
        ssHttpCall.enqueue(new IDdS379S0100000_7(LIZ, 2));
        return LIZ;
    }

    public C73404SrQ(Type type, InterfaceC65131PhH interfaceC65131PhH) {
        this.LIZ = type;
    }
}

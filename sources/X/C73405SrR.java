package X;

import Y.IDdS379S0100000_7;
import com.bytedance.retrofit2.SsHttpCall;
import java.lang.reflect.Type;
import kotlin.jvm.internal.AqS143S0200000_12;

/* renamed from: X.SrR, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73405SrR<R> implements InterfaceC65014PfO<R, InterfaceC68342mE<? extends R>> {
    public final Type LIZ;

    @Override // X.InterfaceC65014PfO
    public final Type LIZ() {
        return this.LIZ;
    }

    public C73405SrR(Type type) {
        this.LIZ = type;
    }

    @Override // X.InterfaceC65014PfO
    public final Object LIZIZ(SsHttpCall ssHttpCall) {
        C84657XKj LIZ = C77275UUl.LIZ();
        LIZ.LJJIII(new AqS143S0200000_12(LIZ, ssHttpCall, 173));
        ssHttpCall.enqueue(new IDdS379S0100000_7(LIZ, 5));
        return LIZ;
    }
}

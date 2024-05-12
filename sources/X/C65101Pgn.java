package X;

import Y.AgS123S0100000_6;
import com.bytedance.retrofit2.SsHttpCall;
import java.lang.reflect.Type;

/* renamed from: X.Pgn, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C65101Pgn implements InterfaceC65014PfO {
    public final InterfaceC65014PfO<?, ?> LIZ;

    @Override // X.InterfaceC65014PfO
    public final Type LIZ() {
        return this.LIZ.LIZ();
    }

    public C65101Pgn(InterfaceC65014PfO<?, ?> interfaceC65014PfO) {
        this.LIZ = interfaceC65014PfO;
    }

    @Override // X.InterfaceC65014PfO
    public final Object LIZIZ(SsHttpCall ssHttpCall) {
        return ((C10K) this.LIZ.LIZIZ(ssHttpCall)).LIZLLL(new AgS123S0100000_6(ssHttpCall, 27));
    }
}

package X;

import com.bytedance.retrofit2.SsHttpCall;
import java.lang.reflect.Type;

/* renamed from: X.Pig, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C65218Pig<R> implements InterfaceC65014PfO<R, C76L<R>> {
    public final InterfaceC65014PfO<R, C76L<C64797Pbt>> LIZ;

    @Override // X.InterfaceC65014PfO
    public final Type LIZ() {
        return this.LIZ.LIZ();
    }

    public C65218Pig(InterfaceC65014PfO<R, C76L<C64797Pbt>> interfaceC65014PfO) {
        this.LIZ = interfaceC65014PfO;
    }

    @Override // X.InterfaceC65014PfO
    public final Object LIZIZ(SsHttpCall ssHttpCall) {
        return new C65730Pqw(this, (C76L) this.LIZ.LIZIZ(ssHttpCall));
    }
}

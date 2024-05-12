package X;

import java.lang.Enum;
import kotlin.jvm.internal.o;

/* renamed from: X.WwJ, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83899WwJ<KEY extends Enum<KEY>> {
    public C83898WwI<KEY> LIZ;
    public final InterfaceC88472Yns<InterfaceC83822Wv4<KEY>, C76800UCe> LIZIZ;

    public final C83898WwI<KEY> LIZ() {
        C83898WwI<KEY> c83898WwI = this.LIZ;
        if (c83898WwI != null) {
            return c83898WwI;
        }
        C83898WwI<KEY> c83898WwI2 = new C83898WwI<>();
        this.LIZIZ.invoke(c83898WwI2);
        this.LIZ = c83898WwI2;
        return c83898WwI2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C83899WwJ(InterfaceC88472Yns<? super InterfaceC83822Wv4<KEY>, C76800UCe> builder) {
        o.LJIIIZ(builder, "builder");
        this.LIZIZ = builder;
    }
}

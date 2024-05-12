package X;

import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.Fy4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40692Fy4 implements InterfaceC1039145z<C40517FvF> {
    public final CharSequence LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final InterfaceC88471Ynr<CharSequence, Integer, OSZ<Integer, Integer>> LIZLLL;

    @Override // X.InterfaceC1039145z
    public final Iterator<C40517FvF> iterator() {
        return new C40693Fy5(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C40692Fy4(CharSequence input, int i, int i2, InterfaceC88471Ynr<? super CharSequence, ? super Integer, OSZ<Integer, Integer>> interfaceC88471Ynr) {
        o.LJIIIZ(input, "input");
        this.LIZ = input;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = interfaceC88471Ynr;
    }
}

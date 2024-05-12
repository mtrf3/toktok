package X;

import java.util.List;

/* renamed from: X.Ia3, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46847Ia3 extends C0R1 implements IUK<Float> {
    @Override // X.IUK
    public final void accept(Float f) {
        for (Object obj : (List) this.LJLIL) {
            if (obj != null) {
                ((IUK) obj).accept(f);
            }
        }
    }
}

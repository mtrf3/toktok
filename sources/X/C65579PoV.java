package X;

import java.io.Serializable;

/* renamed from: X.PoV, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C65579PoV implements Serializable {
    public static final long serialVersionUID = 0;
    public final Object[] LJLIL;

    public Object readResolve() {
        return AbstractC65590Pog.copyOf(this.LJLIL);
    }

    public C65579PoV(Object[] objArr) {
        this.LJLIL = objArr;
    }
}

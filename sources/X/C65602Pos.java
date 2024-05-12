package X;

import java.io.Serializable;

/* renamed from: X.Pos, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C65602Pos implements Serializable {
    public static final long serialVersionUID = 0;
    public final Object[] LJLIL;

    public Object readResolve() {
        return AbstractC65583PoZ.copyOf(this.LJLIL);
    }

    public C65602Pos(Object[] objArr) {
        this.LJLIL = objArr;
    }
}

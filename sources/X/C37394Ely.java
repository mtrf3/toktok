package X;

/* renamed from: X.Ely, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C37394Ely extends RuntimeException {
    public final int LJLIL;

    public C37394Ely() {
        this("");
    }

    public int getCode() {
        return this.LJLIL;
    }

    public C37394Ely(int i) {
        this(i, "");
    }

    public C37394Ely(String str) {
        this(0, str);
    }

    public C37394Ely(int i, String str) {
        super(str);
        this.LJLIL = i;
    }
}

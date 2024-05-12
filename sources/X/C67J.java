package X;

/* renamed from: X.67J, reason: invalid class name */
/* loaded from: classes3.dex */
public class C67J {
    public int index;
    public String stickerPath;
    public int viewHash;

    public C67J(C67J c67j) {
        this(c67j.stickerPath, c67j.index, c67j.viewHash);
    }

    public C67J(String str, int i) {
        this(str, i, 0);
    }

    public C67J(String str, int i, int i2) {
        this.stickerPath = str;
        this.index = i;
        this.viewHash = i2;
    }
}

package X;

import java.io.File;

/* renamed from: X.X6v, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public class C84305X6v extends C84308X6y {
    public final File LJLJJL;
    public final int LJLJJLL;
    public final /* synthetic */ C84304X6u LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C84305X6v(C84304X6u c84304X6u, C84306X6w c84306X6w) {
        super(c84304X6u, c84306X6w);
        this.LJLJL = c84304X6u;
        this.LJLJJL = new File(c84304X6u.LIZLLL.getApplicationInfo().nativeLibraryDir);
        this.LJLJJLL = c84304X6u.LJIIIZ;
    }
}

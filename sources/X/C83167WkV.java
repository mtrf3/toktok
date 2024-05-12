package X;

import android.content.Context;
import kotlin.jvm.internal.o;

/* renamed from: X.WkV, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83167WkV {
    public final C83156WkK LIZ;
    public final Context LIZIZ;
    public final int LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final boolean LJFF;

    public C83167WkV(Context context, String beautyDir, String reshapeDir, int i, boolean z) {
        o.LJIIIZ(beautyDir, "beautyDir");
        o.LJIIIZ(reshapeDir, "reshapeDir");
        this.LIZIZ = context;
        this.LIZJ = i;
        this.LIZLLL = beautyDir;
        this.LJ = reshapeDir;
        this.LJFF = z;
        this.LIZ = new C83156WkK(this);
    }
}

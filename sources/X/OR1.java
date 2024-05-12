package X;

import java.io.File;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OR1 extends OR6 {
    public boolean LIZIZ;

    @Override // X.OR6
    public final File LIZ() {
        if (this.LIZIZ) {
            return null;
        }
        this.LIZIZ = true;
        return this.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OR1(File rootFile) {
        super(rootFile);
        o.LJIIIZ(rootFile, "rootFile");
    }
}

package X;

import java.io.File;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OR8 extends F9E {
    public final File LJLIL;
    public final List<File> LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OR8(File root, List<? extends File> segments) {
        o.LJIIIZ(root, "root");
        o.LJIIIZ(segments, "segments");
        this.LJLIL = root;
        this.LJLILLLLZI = segments;
    }
}

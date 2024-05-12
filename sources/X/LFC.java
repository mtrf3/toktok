package X;

import java.util.concurrent.Callable;

/* loaded from: classes10.dex */
public final class LFC<V> implements Callable {
    public static final LFC<V> LJLIL = new LFC<>();

    @Override // java.util.concurrent.Callable
    public final Object call() {
        LFD lfd = (LFD) LFE.LIZIZ.getValue();
        if (lfd == null) {
            return null;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("size_cache:");
        LIZ.append(C53947LFf.LIZLLL());
        LIZ.append(',');
        LIZ.append(C53947LFf.LIZ());
        LIZ.append(" \nsize_now: ");
        LIZ.append(C53946LFe.LIZJ(null, null).LIZIZ());
        LIZ.append(',');
        LIZ.append(C53946LFe.LIZJ(null, null).LIZ());
        LIZ.append(" \nisLandscape:");
        LIZ.append(C53946LFe.LIZJ(null, null).LJFF);
        LIZ.append(" \nauth:");
        LIZ.append(LF7.LIZIZ);
        LIZ.append(" \nlast_log:");
        LIZ.append(LFE.LIZJ);
        X1D.LIZIZ(LIZ);
        lfd.LIZJ();
        return C76800UCe.LIZ;
    }
}

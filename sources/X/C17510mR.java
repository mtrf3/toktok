package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.0mR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17510mR {
    public final String LIZ;
    public final float LIZIZ;
    public final float LIZJ;
    public final float LIZLLL;
    public final float LJ;
    public final float LJFF;
    public final float LJI;
    public final float LJII;
    public final List<? extends AbstractC17560mW> LJIIIIZZ;
    public final List<AbstractC17640me> LJIIIZ;

    public C17510mR() {
        this(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 1023);
    }

    public C17510mR(String name, float f, float f2, float f3, float f4, float f5, float f6, float f7, List clipPathData, int i) {
        ArrayList children;
        name = (i & 1) != 0 ? "" : name;
        f = (i & 2) != 0 ? 0.0f : f;
        f2 = (i & 4) != 0 ? 0.0f : f2;
        f3 = (i & 8) != 0 ? 0.0f : f3;
        f4 = (i & 16) != 0 ? 1.0f : f4;
        f5 = (i & 32) != 0 ? 1.0f : f5;
        f6 = (i & 64) != 0 ? 0.0f : f6;
        f7 = (i & 128) != 0 ? 0.0f : f7;
        clipPathData = (i & 256) != 0 ? C17630md.LIZ : clipPathData;
        if ((i & 512) != 0) {
            children = new ArrayList();
        } else {
            children = null;
        }
        o.LJIIIZ(name, "name");
        o.LJIIIZ(clipPathData, "clipPathData");
        o.LJIIIZ(children, "children");
        this.LIZ = name;
        this.LIZIZ = f;
        this.LIZJ = f2;
        this.LIZLLL = f3;
        this.LJ = f4;
        this.LJFF = f5;
        this.LJI = f6;
        this.LJII = f7;
        this.LJIIIIZZ = clipPathData;
        this.LJIIIZ = children;
    }
}

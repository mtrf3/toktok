package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import defpackage.q;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3YD, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3YD {
    public final C3YM LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public boolean LIZLLL;
    public long LJ;
    public long LJFF;
    public int LJI;
    public int LJII;
    public int LJIIIIZZ;
    public final C62822Ol8 LJIIIZ;

    public final String toString() {
        int size = ((List) this.LJIIIZ.getValue()).size();
        String str = "[";
        for (int i = 0; i < size; i = 1) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(str);
            str = q.LIZIZ(LIZ, (String) ListProtector.get((List) this.LJIIIZ.getValue(), i), ',', LIZ);
            if (i == 1) {
                break;
            }
        }
        String LIZIZ = C42398GkU.LIZIZ(str, ']');
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("RelationFetchResult{fetchScene=");
        LIZ2.append(this.LIZ);
        LIZ2.append(", initMaxTime=");
        LIZ2.append(this.LIZIZ);
        LIZ2.append(", initMinTime=");
        LIZ2.append(this.LIZJ);
        LIZ2.append(", fullSuccess=");
        LIZ2.append(this.LIZLLL);
        LIZ2.append(", fetchedMaxTime=");
        LIZ2.append(this.LJ);
        LIZ2.append(", fetchedMinTime=");
        LIZ2.append(this.LJFF);
        LIZ2.append(", fetchedSize=");
        LIZ2.append(this.LJI);
        LIZ2.append(", updatedSize=");
        LIZ2.append(this.LJII);
        LIZ2.append(", fetchTimes=");
        LIZ2.append(this.LJIIIIZZ);
        LIZ2.append(", logIdList=");
        LIZ2.append(LIZIZ);
        LIZ2.append('}');
        return X1D.LIZIZ(LIZ2);
    }

    public C3YD(C3YM fetchScene, long j, long j2) {
        o.LJIIIZ(fetchScene, "fetchScene");
        this.LIZ = fetchScene;
        this.LIZIZ = j;
        this.LIZJ = j2;
        this.LJIIIZ = C221108m2.LIZIZ(C3YO.LJLIL);
    }
}

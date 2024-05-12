package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.0f3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12930f3 {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final boolean LIZLLL;
    public long LJ;
    public final List<Integer> LJFF;
    public final List<C12940f4> LJI;
    public boolean LJII;
    public Boolean LJIIIIZZ;
    public String LJIIIZ;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LiveComposerNode(panel='");
        LIZ.append(this.LIZ);
        LIZ.append("', effectId='");
        LIZ.append(this.LIZIZ);
        LIZ.append("', path='");
        LIZ.append(this.LIZJ);
        LIZ.append("', isWithoutFace=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", updateTime=");
        LIZ.append(this.LJ);
        LIZ.append(", coexistGroup=");
        LIZ.append(this.LJFF);
        LIZ.append(", tagList=");
        LIZ.append(this.LJI);
        LIZ.append(", use=");
        return C48339Iy7.LIZJ(LIZ, this.LJII, ')', LIZ);
    }

    public C12930f3(C12930f3 node) {
        o.LJIIIZ(node, "node");
        ArrayList arrayList = new ArrayList();
        this.LJFF = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.LJI = arrayList2;
        this.LJIIIZ = "";
        this.LIZ = node.LIZ;
        this.LIZIZ = node.LIZIZ;
        this.LIZJ = node.LIZJ;
        this.LIZLLL = node.LIZLLL;
        this.LJ = node.LJ;
        this.LJII = node.LJII;
        arrayList.addAll(node.LJFF);
        arrayList2.addAll(node.LJI);
    }

    public C12930f3(long j, String str, boolean z, String str2, String str3) {
        HH1.LIZ(str, "panel", str2, "resourceId", str3, "path");
        this.LJFF = new ArrayList();
        this.LJI = new ArrayList();
        this.LJIIIZ = "";
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = z;
        this.LJ = j;
    }
}

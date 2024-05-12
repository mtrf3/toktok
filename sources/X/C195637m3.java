package X;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.7m3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C195637m3 {
    public boolean LIZ;
    public boolean LIZIZ;
    public long LIZJ;
    public String LIZLLL;
    public int LJ;
    public int LJFF;
    public int LJI;
    public CopyOnWriteArrayList<EnumC195697m9> LJII;
    public List<? extends InterfaceC194547kI> LJIIIIZZ;

    public final boolean LIZ() {
        if ((!this.LJIIIIZZ.isEmpty()) && (!this.LJII.isEmpty()) && this.LJI != -1 && !this.LIZ && this.LIZLLL.length() > 0) {
            return true;
        }
        return false;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CollectionInfo = [ isFirstBind = ");
        LIZ.append(this.LIZ);
        LIZ.append(", hasMoreBefore = ");
        LIZ.append(this.LIZIZ);
        LIZ.append(", preCursor = ");
        LIZ.append(this.LIZJ);
        LIZ.append(", nowSize = ");
        LIZ.append(this.LJ);
        LIZ.append(", localTotalCount = ");
        LIZ.append(this.LJFF);
        LIZ.append(", selectionPageIndex = ");
        LIZ.append(this.LJI);
        LIZ.append(", fakeStateList = ");
        LIZ.append(this.LJII);
        LIZ.append(" ,nowPostItemList.size = ");
        LIZ.append(this.LJIIIIZZ.size());
        LIZ.append(" ]");
        return X1D.LIZIZ(LIZ);
    }

    public C195637m3(int i) {
        CopyOnWriteArrayList<EnumC195697m9> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        C61878OQg nowPostItemList = C61878OQg.INSTANCE;
        o.LJIIIZ(nowPostItemList, "nowPostItemList");
        this.LIZ = true;
        this.LIZIZ = false;
        this.LIZJ = 0L;
        this.LIZLLL = "";
        this.LJ = 0;
        this.LJFF = 0;
        this.LJI = -1;
        this.LJII = copyOnWriteArrayList;
        this.LJIIIIZZ = nowPostItemList;
    }
}

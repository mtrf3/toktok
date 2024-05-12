package X;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.UNy, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77106UNy implements Comparable<Object> {
    public long LJLIL;
    public float LJLJI;
    public long LJLJJI;
    public long LJLJJL;
    public long LJLJL;
    public long LJLJLJ;
    public final ArrayList<C77107UNz> LJLILLLLZI = new ArrayList<>();
    public String LJLJJLL = "";

    public final void LIZLLL() {
        if (this.LJLILLLLZI.isEmpty()) {
            return;
        }
        long size = this.LJLJJI / this.LJLILLLLZI.size();
        long j = this.LJLIL;
        Iterator<C77107UNz> it = this.LJLILLLLZI.iterator();
        while (it.hasNext()) {
            C77107UNz next = it.next();
            next.LIZIZ = j;
            next.LJI = size;
            j += size;
        }
    }

    public C77106UNy(long j) {
        this.LJLIL = j;
    }

    public final void LIZJ(C77107UNz captionWord) {
        o.LJIIIZ(captionWord, "captionWord");
        this.LJLILLLLZI.add(captionWord);
        this.LJLJI += captionWord.LJ;
        this.LJLJJI += captionWord.LJI;
        captionWord.LIZLLL = this.LJLJJLL.length();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LJLJJLL);
        LIZ.append(captionWord.LIZ);
        this.LJLJJLL = X1D.LIZIZ(LIZ);
        captionWord.LIZJ = captionWord.LIZ.length() + captionWord.LIZLLL;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        if (obj == null || !(obj instanceof C77106UNy)) {
            return -1;
        }
        return 0;
    }
}

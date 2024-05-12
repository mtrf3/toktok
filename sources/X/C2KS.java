package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.2KS, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2KS {
    public static final C62822Ol8 LJ = C221108m2.LIZIZ(C2KT.LJLIL);
    public final String LIZ;
    public Aweme LIZJ;
    public final HashMap<Aweme, Integer> LIZIZ = new HashMap<>();
    public final CopyOnWriteArrayList<Aweme> LIZLLL = new CopyOnWriteArrayList<>();

    public final void LIZ() {
        CopyOnWriteArrayList<Aweme> copyOnWriteArrayList = this.LIZLLL;
        if (copyOnWriteArrayList != null) {
            Iterator<Aweme> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                C2U8.LIZ(new C55045Liz(it.next(), this.LIZ));
            }
        }
        this.LIZLLL.clear();
    }

    public C2KS(String str) {
        this.LIZ = str;
    }
}

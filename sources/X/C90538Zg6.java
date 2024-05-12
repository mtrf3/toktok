package X;

import android.util.SparseBooleanArray;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Zg6, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90538Zg6 {
    public static final C90843Zl1 LJFF = new C90843Zl1();
    public final List<C90537Zg5> LIZ;
    public final List<C90539Zg7> LIZIZ;
    public final C90537Zg5 LJ;
    public final SparseBooleanArray LIZLLL = new SparseBooleanArray();
    public final C1HQ LIZJ = new C1HQ();

    public C90538Zg6(List<C90537Zg5> list, List<C90539Zg7> list2) {
        this.LIZ = list;
        this.LIZIZ = list2;
        int size = ((ArrayList) list).size();
        int i = LiveLayoutPreloadThreadPriority.DEFAULT;
        C90537Zg5 c90537Zg5 = null;
        for (int i2 = 0; i2 < size; i2++) {
            C90537Zg5 c90537Zg52 = (C90537Zg5) ListProtector.get(this.LIZ, i2);
            int i3 = c90537Zg52.LJ;
            if (i3 > i) {
                c90537Zg5 = c90537Zg52;
                i = i3;
            }
        }
        this.LJ = c90537Zg5;
    }
}

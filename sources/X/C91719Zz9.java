package X;

import android.os.Bundle;
import kotlin.jvm.internal.o;

/* renamed from: X.Zz9, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C91719Zz9 implements Comparable<C91719Zz9> {
    public final C91720ZzA LJLIL;
    public final Bundle LJLILLLLZI;
    public final boolean LJLJI;
    public final boolean LJLJJI;
    public final int LJLJJL;

    @Override // java.lang.Comparable
    /* renamed from: LIZJ, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C91719Zz9 other) {
        o.LJIIIZ(other, "other");
        boolean z = this.LJLJI;
        if (z && !other.LJLJI) {
            return 1;
        }
        if (!z && other.LJLJI) {
            return -1;
        }
        Bundle bundle = this.LJLILLLLZI;
        if (bundle != null) {
            if (other.LJLILLLLZI == null) {
                return 1;
            }
            int size = bundle.size();
            Bundle bundle2 = other.LJLILLLLZI;
            o.LJI(bundle2);
            int size2 = size - bundle2.size();
            if (size2 > 0) {
                return 1;
            }
            if (size2 < 0) {
                return -1;
            }
        } else if (other.LJLILLLLZI != null) {
            return -1;
        }
        if (this.LJLJJI) {
            if (!other.LJLJJI) {
                return 1;
            }
        } else if (other.LJLJJI) {
            return -1;
        }
        return this.LJLJJL - other.LJLJJL;
    }

    public C91719Zz9(C91720ZzA destination, Bundle bundle, boolean z, boolean z2, int i) {
        o.LJIIIZ(destination, "destination");
        this.LJLIL = destination;
        this.LJLILLLLZI = bundle;
        this.LJLJI = z;
        this.LJLJJI = z2;
        this.LJLJJL = i;
    }
}

package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.7c8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C189487c8 implements C33Q {
    public final List<C189717cV> LJLIL;
    public final int LJLILLLLZI;
    public final Aweme LJLJI;
    public final C43I<Integer> LJLJJI;
    public final C43I<Boolean> LJLJJL;

    public C189487c8() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C189487c8)) {
            return false;
        }
        C189487c8 c189487c8 = (C189487c8) obj;
        return o.LJ(this.LJLIL, c189487c8.LJLIL) && this.LJLILLLLZI == c189487c8.LJLILLLLZI && o.LJ(this.LJLJI, c189487c8.LJLJI) && o.LJ(this.LJLJJI, c189487c8.LJLJJI) && o.LJ(this.LJLJJL, c189487c8.LJLJJL);
    }

    public final int hashCode() {
        int hashCode = ((this.LJLIL.hashCode() * 31) + this.LJLILLLLZI) * 31;
        Aweme aweme = this.LJLJI;
        int hashCode2 = (hashCode + (aweme == null ? 0 : aweme.hashCode())) * 31;
        C43I<Integer> c43i = this.LJLJJI;
        int hashCode3 = (hashCode2 + (c43i == null ? 0 : c43i.hashCode())) * 31;
        C43I<Boolean> c43i2 = this.LJLJJL;
        return hashCode3 + (c43i2 != null ? c43i2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StoryGalleryListState(items=");
        LIZ.append(this.LJLIL);
        LIZ.append(", selectedPosition=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", selectedStory=");
        LIZ.append(this.LJLJI);
        LIZ.append(", scrollToPositionEvent=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", exitActivityWithAnimationEvent=");
        return C61845OOz.LIZIZ(LIZ, this.LJLJJL, ')', LIZ);
    }

    public C189487c8(int i) {
        this(C61878OQg.INSTANCE, 0, null, null, null);
    }

    public C189487c8(List<C189717cV> items, int i, Aweme aweme, C43I<Integer> c43i, C43I<Boolean> c43i2) {
        o.LJIIIZ(items, "items");
        this.LJLIL = items;
        this.LJLILLLLZI = i;
        this.LJLJI = aweme;
        this.LJLJJI = c43i;
        this.LJLJJL = c43i2;
    }

    public static C189487c8 LIZ(C189487c8 c189487c8, List list, int i, Aweme aweme, C43I c43i, C43I c43i2, int i2) {
        C43I c43i3 = c43i2;
        C43I c43i4 = c43i;
        Aweme aweme2 = aweme;
        List items = list;
        int i3 = i;
        if ((i2 & 1) != 0) {
            items = c189487c8.LJLIL;
        }
        if ((i2 & 2) != 0) {
            i3 = c189487c8.LJLILLLLZI;
        }
        if ((i2 & 4) != 0) {
            aweme2 = c189487c8.LJLJI;
        }
        if ((i2 & 8) != 0) {
            c43i4 = c189487c8.LJLJJI;
        }
        if ((i2 & 16) != 0) {
            c43i3 = c189487c8.LJLJJL;
        }
        c189487c8.getClass();
        o.LJIIIZ(items, "items");
        return new C189487c8(items, i3, aweme2, c43i4, c43i3);
    }
}

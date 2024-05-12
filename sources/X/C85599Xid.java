package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Xid, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85599Xid extends C1BD {
    public final C62822Ol8 LJLJLJ;

    public final List<C85603Xih> LJJIIJZLJL() {
        return (List) this.LJLJLJ.getValue();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return LJJIIJZLJL().size();
    }

    public C85599Xid(FragmentManager fragmentManager) {
        super(fragmentManager, 0);
        this.LJLJLJ = C221108m2.LIZIZ(C85602Xig.LJLIL);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final CharSequence LJIILIIL(int i) {
        return ((C85603Xih) ListProtector.get(LJJIIJZLJL(), i)).LIZIZ;
    }

    @Override // X.C1BD
    public final Fragment LJJIII(int i) {
        return ((C85603Xih) ListProtector.get(LJJIIJZLJL(), i)).LIZ;
    }

    public final void LJJIIJ(C85603Xih fragment) {
        o.LJIIIZ(fragment, "fragment");
        if (!LJJIIJZLJL().contains(fragment)) {
            LJJIIJZLJL().add(fragment);
        }
    }
}

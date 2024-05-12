package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.7xY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C202767xY extends C1BC {
    public final List<Fragment> LJLJJLL;
    public final List<String> LJLJL;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.LJLJJLL.size();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final CharSequence LJIILIIL(int i) {
        return (CharSequence) ListProtector.get(this.LJLJL, i);
    }

    @Override // X.C1BC
    public final Fragment LJJIII(int i) {
        return (Fragment) ListProtector.get(this.LJLJJLL, i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C202767xY(FragmentManager fragmentManager, List<Fragment> fragments, List<String> fragmentTitles) {
        super(fragmentManager, 1);
        o.LJIIIZ(fragments, "fragments");
        o.LJIIIZ(fragmentTitles, "fragmentTitles");
        this.LJLJJLL = fragments;
        this.LJLJL = fragmentTitles;
    }
}

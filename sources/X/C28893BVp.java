package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.qa.BaseQATabFragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.BVp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28893BVp extends C1BC {
    public final List<BaseQATabFragment> LJLJJLL;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.LJLJJLL.size();
    }

    @Override // X.C1BC
    public final Fragment LJJIII(int i) {
        return (Fragment) ListProtector.get(this.LJLJJLL, i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28893BVp(FragmentManager fragmentManager, List pages) {
        super(fragmentManager, 0);
        o.LJIIIZ(pages, "pages");
        this.LJLJJLL = pages;
    }
}

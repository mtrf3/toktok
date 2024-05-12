package X;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.VoO, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80860VoO extends C1BC {
    public final /* synthetic */ List<Fragment> LJLJJLL;
    public final /* synthetic */ C85575XiF LJLJL;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.LJLJJLL.size();
    }

    @Override // X.C1BC
    public final Fragment LJJIII(int i) {
        return (Fragment) ListProtector.get(this.LJLJJLL, i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C80860VoO(List<? extends Fragment> list, C85575XiF c85575XiF, FragmentManager fragmentManager) {
        super(fragmentManager, 0);
        this.LJLJJLL = list;
        this.LJLJL = c85575XiF;
    }

    @Override // X.C1BC, androidx.viewpager.widget.PagerAdapter
    public final void LJIL(int i, ViewGroup container, Object object) {
        o.LJIIIZ(container, "container");
        o.LJIIIZ(object, "object");
        super.LJIL(i, container, object);
        while (i + 1 > this.LJLJJLL.size()) {
            LJJIII(i);
        }
        this.LJLJL.LJIILL();
    }
}

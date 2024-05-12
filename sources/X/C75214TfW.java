package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* renamed from: X.TfW, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75214TfW extends C1BD {
    public final C5H3 LJLJLJ;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return ((List) this.LJLJLJ.getValue()).size();
    }

    public C75214TfW(FragmentManager fragmentManager) {
        super(fragmentManager, 0);
        this.LJLJLJ = C78996UzQ.LJJIJIIJI(C75216TfY.LJLIL);
    }

    @Override // X.C1BD
    public final Fragment LJJIII(int i) {
        return ((C30785C6j) ListProtector.get((List) this.LJLJLJ.getValue(), i)).LJLJJI.invoke();
    }
}

package X;

import android.os.Bundle;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhihu.matisse.internal.entity.Item;
import com.zhihu.matisse.internal.ui.PreviewItemFragment;
import java.util.ArrayList;

/* renamed from: X.Vkv, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80645Vkv extends C1BC {
    public final ArrayList<Item> LJLJJLL;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.LJLJJLL.size();
    }

    public C80645Vkv(FragmentManager fragmentManager) {
        super(fragmentManager, 0);
        this.LJLJJLL = new ArrayList<>();
    }

    @Override // X.C1BC
    public final Fragment LJJIII(int i) {
        Item item = (Item) ListProtector.get(this.LJLJJLL, i);
        PreviewItemFragment previewItemFragment = new PreviewItemFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("args_item", item);
        previewItemFragment.setArguments(bundle);
        return previewItemFragment;
    }

    @Override // X.C1BC, androidx.viewpager.widget.PagerAdapter
    public final void LJIL(int i, ViewGroup viewGroup, Object obj) {
        super.LJIL(i, viewGroup, obj);
    }
}

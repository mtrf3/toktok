package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.bytedance.effectcreatormobile.objectselect.prefab.PrefabPageFragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.ahD, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94451ahD extends FragmentStateAdapter {
    public final /* synthetic */ List LJLL;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLL.size();
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public final Fragment LJZ(int i) {
        String categoryName = (String) ListProtector.get(this.LJLL, i);
        o.LJIIIZ(categoryName, "categoryName");
        Bundle bundle = new Bundle();
        bundle.putString("category_key", categoryName);
        PrefabPageFragment prefabPageFragment = new PrefabPageFragment();
        prefabPageFragment.setArguments(bundle);
        return prefabPageFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94451ahD(List list, Fragment fragment) {
        super(fragment);
        this.LJLL = list;
    }
}

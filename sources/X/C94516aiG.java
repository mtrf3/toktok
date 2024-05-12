package X;

import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* renamed from: X.aiG, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94516aiG extends FragmentStateAdapter {
    public final /* synthetic */ List LJLL;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLL.size();
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public final Fragment LJZ(int i) {
        return (Fragment) ((InterfaceC65784Pro) ((OSZ) ListProtector.get(this.LJLL, i)).getSecond()).invoke();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94516aiG(List list, Fragment fragment) {
        super(fragment);
        this.LJLL = list;
    }
}

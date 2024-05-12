package X;

import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.1ja, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C41221ja extends FragmentStateAdapter {
    public final List<AnonymousClass015> LJLL;

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter, X.AbstractC029409q
    public final long getItemId(int i) {
        return i;
    }

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return ((ArrayList) this.LJLL).size();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41221ja(Fragment fragment) {
        super(fragment);
        o.LJIIIZ(fragment, "fragment");
        this.LJLL = new ArrayList();
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public final Fragment LJZ(int i) {
        return C24250xJ.LIZ(((AnonymousClass015) ListProtector.get(this.LJLL, i)).LIZ);
    }
}

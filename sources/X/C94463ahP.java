package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.bytedance.effectcreatormobile.behaviour.view.eidt.ActionFragment;
import com.bytedance.effectcreatormobile.behaviour.view.eidt.BehaviourEditFragment;
import com.bytedance.effectcreatormobile.behaviour.view.eidt.TriggerFragment;
import com.bytedance.effectcreatormobile.behaviour.view.eidt.featurepage.FeatureFragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.ahP, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94463ahP extends FragmentStateAdapter {
    public List<C93440aQu> LJLL;
    public List<Long> LJLLI;
    public C93440aQu LJLLILLLL;
    public final C0CM LJLLJ;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLL.size();
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public final boolean LJLZ(long j) {
        return this.LJLLI.contains(Long.valueOf(j));
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public final Fragment LJZ(int i) {
        int i2 = C93767aWB.LIZ[((C93440aQu) ListProtector.get(this.LJLL, i)).LIZ.ordinal()];
        if (i2 != 1) {
            if (i2 != 2 && i2 != 3) {
                if (i2 != 4) {
                    return new Fragment();
                }
                return new ActionFragment();
            }
            return new FeatureFragment();
        }
        return new TriggerFragment();
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter, X.AbstractC029409q
    public final long getItemId(int i) {
        return ((Number) ListProtector.get(this.LJLLI, i)).longValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94463ahP(BehaviourEditFragment fragment, C0CM c0cm) {
        super(fragment);
        o.LJIIIZ(fragment, "fragment");
        this.LJLLJ = c0cm;
        C61878OQg c61878OQg = C61878OQg.INSTANCE;
        this.LJLL = c61878OQg;
        this.LJLLI = c61878OQg;
        this.LJLLILLLL = new C93440aQu(-1, EnumC93441aQv.VIEW_TYPE_MORE);
        c0cm.setOffscreenPageLimit(3);
        View childAt = c0cm.getChildAt(0);
        RecyclerView recyclerView = (RecyclerView) (childAt instanceof RecyclerView ? childAt : null);
        if (recyclerView != null) {
            recyclerView.setItemAnimator(null);
        }
    }
}

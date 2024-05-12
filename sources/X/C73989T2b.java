package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.android.live.base.model.emoji.BadgeIconTab;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.T2b, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73989T2b extends PagerAdapter {
    public final T2Y LJLILLLLZI;
    public final List<BadgeIconTab> LJLJI;
    public final RecyclerView.RecycledViewPool LJLJJI;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int LJIIL(Object item) {
        o.LJIIIZ(item, "item");
        return -2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return ((ArrayList) this.LJLJI).size();
    }

    public C73989T2b(T2Y emojiInputListener) {
        o.LJIIIZ(emojiInputListener, "emojiInputListener");
        this.LJLILLLLZI = emojiInputListener;
        this.LJLJI = new ArrayList();
        RecyclerView.RecycledViewPool recycledViewPool = new RecyclerView.RecycledViewPool();
        recycledViewPool.setMaxRecycledViews(0, 20);
        this.LJLJJI = recycledViewPool;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object LJIILLIIL(int i, ViewGroup container) {
        o.LJIIIZ(container, "container");
        BadgeIconTab badgeIconTab = (BadgeIconTab) ListProtector.get(this.LJLJI, i);
        C73988T2a c73988T2a = new C73988T2a(container, this.LJLJJI, this.LJLILLLLZI);
        o.LJIIIZ(badgeIconTab, "badgeIconTab");
        T2V t2v = c73988T2a.LIZIZ;
        t2v.getClass();
        t2v.LJLJI = badgeIconTab;
        ((ArrayList) t2v.LJLJJI).clear();
        ((ArrayList) t2v.LJLJJI).addAll(badgeIconTab.iconList);
        t2v.notifyDataSetChanged();
        container.addView(c73988T2a.LIZ);
        return c73988T2a;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean LJIIZILJ(View view, Object item) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(item, "item");
        if (item instanceof C73988T2a) {
            return o.LJ(((C73988T2a) item).LIZ, view);
        }
        return false;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIIIZ(int i, ViewGroup container, Object item) {
        o.LJIIIZ(container, "container");
        o.LJIIIZ(item, "item");
        if (item instanceof C73988T2a) {
            C16880lQ.LJLLL(((C73988T2a) item).LIZ, container);
        }
    }
}

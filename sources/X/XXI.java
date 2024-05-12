package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes16.dex */
public class XXI extends PagerAdapter {
    public List<MusicModel> LJLILLLLZI = null;
    public final LinkedList<XXR> LJLJI = new LinkedList<>();
    public final /* synthetic */ XXL LJLJJI;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int LJIIL(Object obj) {
        return -2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean LJIIZILJ(View view, Object obj) {
        return view == obj;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        List<MusicModel> list = this.LJLILLLLZI;
        int i = 0;
        if (list == null) {
            return 0;
        }
        int size = list.size() / 3;
        if (this.LJLILLLLZI.size() % 3 != 0) {
            i = 1;
        }
        return i + size;
    }

    public XXI(XXL xxl) {
        this.LJLJJI = xxl;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object LJIILLIIL(int i, ViewGroup viewGroup) {
        boolean z;
        XXR poll = this.LJLJI.poll();
        if (poll == null) {
            poll = new XXR(viewGroup.getContext(), this.LJLJJI.LJLLILLLL);
        }
        XXL xxl = this.LJLJJI;
        G88 g88 = xxl.LJLJJL;
        InterfaceC85019XYh<XYN> interfaceC85019XYh = xxl.LJLJL;
        poll.LJLILLLLZI = g88;
        poll.LJLJJI = interfaceC85019XYh;
        if (!poll.LJLIL.isEmpty()) {
            int i2 = 0;
            do {
                XXF xxf = (XXF) ListProtector.get(poll.LJLIL, i2);
                G88 g882 = poll.LJLILLLLZI;
                InterfaceC85019XYh<XYN> interfaceC85019XYh2 = poll.LJLJJI;
                xxf.LLD = g882;
                xxf.LLF = interfaceC85019XYh2;
                i2++;
            } while (i2 < 3);
        }
        List<MusicModel> list = this.LJLILLLLZI;
        int i3 = i * 3;
        XXL xxl2 = this.LJLJJI;
        int i4 = xxl2.LJLJLJ;
        int i5 = xxl2.LJLJLLL;
        boolean z2 = xxl2.LJLLJ;
        if (list != null) {
            int min = Math.min(i3 + 3, list.size());
            for (int i6 = i3; i6 < min; i6++) {
                MusicModel musicModel = (MusicModel) ListProtector.get(list, i6);
                XXF xxf2 = (XXF) ListProtector.get(poll.getMusicItemViews(), i6 - i3);
                xxf2.itemView.setVisibility(0);
                if (i4 == i6) {
                    z = true;
                } else {
                    z = false;
                }
                xxf2.L(musicModel, z2, z, i5, i6);
            }
            for (int i7 = min - i3; i7 < 3; i7++) {
                ((RecyclerView.ViewHolder) ListProtector.get(poll.getMusicItemViews(), i7)).itemView.setVisibility(8);
            }
        }
        viewGroup.addView(poll);
        return poll;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIIIZ(int i, ViewGroup viewGroup, Object obj) {
        C16880lQ.LJLLL((View) obj, viewGroup);
        this.LJLJI.offer(obj);
    }
}

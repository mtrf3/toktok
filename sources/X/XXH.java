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
public class XXH extends PagerAdapter {
    public List<MusicModel> LJLILLLLZI = null;
    public final LinkedList<XXQ> LJLJI = new LinkedList<>();
    public final /* synthetic */ XXJ LJLJJI;

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

    public XXH(XXJ xxj) {
        this.LJLJJI = xxj;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object LJIILLIIL(int i, ViewGroup viewGroup) {
        boolean z;
        XXQ poll = this.LJLJI.poll();
        if (poll == null) {
            poll = new XXQ(viewGroup.getContext(), this.LJLJJI.LJLLJ);
        }
        XXJ xxj = this.LJLJJI;
        G87 g87 = xxj.LJLJJL;
        C72H<XYM> c72h = xxj.LJLJL;
        poll.LJLILLLLZI = g87;
        poll.LJLJJI = c72h;
        int i2 = 0;
        if (!poll.LJLIL.isEmpty()) {
            int i3 = 0;
            do {
                XXG xxg = (XXG) ListProtector.get(poll.LJLIL, i3);
                G87 g872 = poll.LJLILLLLZI;
                C72H<XYM> c72h2 = poll.LJLJJI;
                xxg.LLIIJLIL = g872;
                xxg.LLIIZ = c72h2;
                i3++;
            } while (i3 < 3);
        }
        List<MusicModel> list = this.LJLILLLLZI;
        int i4 = i * 3;
        XXJ xxj2 = this.LJLJJI;
        int i5 = xxj2.LJLJLJ;
        int i6 = xxj2.LJLJLLL;
        XVG xvg = xxj2.LJLL;
        boolean z2 = xxj2.LJLLL;
        boolean z3 = xxj2.LJLLLL;
        if (list != null) {
            int min = Math.min(i4 + 3, list.size());
            int i7 = i4;
            while (i7 < min) {
                MusicModel musicModel = (MusicModel) ListProtector.get(list, i7);
                XXG xxg2 = (XXG) ListProtector.get(poll.getMusicItemViews(), i7 - i4);
                xxg2.itemView.setVisibility(i2);
                if (i5 == i7) {
                    z = true;
                } else {
                    z = false;
                }
                boolean z4 = z2;
                xxg2.L(new XXW(musicModel, "", z4, false, z, z3, 0, i6, i7, xvg, musicModel.getDuration(), C52536Kjc.LIZIZ(), C52536Kjc.LIZ(), 0, false, false));
                i7++;
                z2 = z4;
                i2 = 0;
            }
            for (int i8 = min - i4; i8 < 3; i8++) {
                ((RecyclerView.ViewHolder) ListProtector.get(poll.getMusicItemViews(), i8)).itemView.setVisibility(8);
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

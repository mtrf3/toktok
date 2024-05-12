package X;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.ss.android.ugc.aweme.dsp.playpage.pageitem.audioview.lyric.BaseLyricsViewModel;
import com.ss.android.ugc.aweme.dsp.playpage.pageitem.audioview.lyric.p003short.ShortLyricsViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.ZvR, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91489ZvR extends AbstractC91339Zt1 {
    @Override // X.AbstractC91339Zt1
    public Class<? extends BaseLyricsViewModel> getViewModelClass() {
        return ShortLyricsViewModel.class;
    }

    @Override // X.AbstractC91339Zt1
    public Integer getFadingEdgeLen() {
        return Integer.valueOf((int) KL2.LIZJ(getContext(), 10.0f));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C91489ZvR(Context context) {
        super(context);
        new LinkedHashMap();
    }

    @Override // X.AbstractC91339Zt1
    public final Integer LIZJ(int i) {
        ArrayList<C91077Zon> arrayList;
        C0A2 c0a2;
        LinearLayoutManager linearLayoutManager;
        int LLILL;
        View LJJIJIL;
        C91367ZtT mAdapter = getMAdapter();
        if (mAdapter != null && (arrayList = mAdapter.LJLJI) != null) {
            C91542ZwI mLyricsRlv = getMLyricsRlv();
            if (mLyricsRlv != null) {
                c0a2 = mLyricsRlv.getLayoutManager();
            } else {
                c0a2 = null;
            }
            if (!(c0a2 instanceof LinearLayoutManager) || (linearLayoutManager = (LinearLayoutManager) c0a2) == null || (LLILL = linearLayoutManager.LLILL()) >= arrayList.size() || i >= arrayList.size() || (LJJIJIL = linearLayoutManager.LJJIJIL(LLILL)) == null) {
                return null;
            }
            int abs = Math.abs(LJJIJIL.getTop());
            int i2 = 0;
            if (LLILL > 0) {
                List<C91077Zon> subList = arrayList.subList(0, LLILL);
                o.LJIIIIZZ(subList, "lyricsInfoList.subList(0…firstVisibleViewPosition)");
                Iterator<C91077Zon> it = subList.iterator();
                while (it.hasNext()) {
                    abs += it.next().LIZJ;
                }
            }
            if (i > 0) {
                List<C91077Zon> subList2 = arrayList.subList(0, i);
                o.LJIIIIZZ(subList2, "lyricsInfoList.subList(0, toIndex)");
                Iterator<C91077Zon> it2 = subList2.iterator();
                while (it2.hasNext()) {
                    i2 += it2.next().LIZJ;
                }
            }
            return Integer.valueOf(i2 - abs);
        }
        return null;
    }
}

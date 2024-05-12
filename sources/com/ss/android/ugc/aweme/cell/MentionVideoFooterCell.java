package com.ss.android.ugc.aweme.cell;

import X.KUR;
import X.SZP;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes13.dex */
public final class MentionVideoFooterCell extends MusicFooterCell {
    @Override // com.ss.android.ugc.aweme.cell.MusicFooterCell
    public final void Q(SZP szp) {
        if (szp == null || szp == SZP.Refresh) {
            KUR kur = this.LJLJJI;
            if (kur != null) {
                kur.LJI();
                return;
            }
            return;
        }
        KUR kur2 = this.LJLJJI;
        if (kur2 != null) {
            kur2.setLayoutParams(new RecyclerView.LayoutParams(-1, 0));
        }
        KUR kur3 = this.LJLJJI;
        if (kur3 == null) {
            return;
        }
        kur3.setVisibility(8);
    }
}

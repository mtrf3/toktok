package X;

import android.app.Dialog;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.highlights.assem.HighlightsAssem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.highlights.model.HighlightCellItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.highlights.model.HighlightVideoInfo;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.highlights.viewmodel.HighlightsListViewModel;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HKY implements A91 {
    public final /* synthetic */ HighlightsAssem LJLIL;

    public HKY(HighlightsAssem highlightsAssem) {
        this.LJLIL = highlightsAssem;
    }

    @Override // X.A91
    public final void LIZ(Dialog dialog) {
        long j;
        String str;
        String str2;
        HighlightVideoInfo videoInfo;
        HighlightVideoInfo videoInfo2;
        Long length;
        o.LJIIIZ(dialog, "dialog");
        HighlightsListViewModel highlightsListViewModel = (HighlightsListViewModel) this.LJLIL.LJLJI.getValue();
        String str3 = highlightsListViewModel.LJLILLLLZI;
        String str4 = highlightsListViewModel.LJLJI;
        boolean z = highlightsListViewModel.LJLJLJ;
        HighlightCellItem highlightCellItem = highlightsListViewModel.LJLJLLL;
        if (highlightCellItem != null && (videoInfo2 = highlightCellItem.getVideoInfo()) != null && (length = videoInfo2.getLength()) != null) {
            j = length.longValue();
        } else {
            j = 0;
        }
        HighlightCellItem highlightCellItem2 = highlightsListViewModel.LJLJLLL;
        if (highlightCellItem2 == null || (videoInfo = highlightCellItem2.getVideoInfo()) == null || (str = videoInfo.getFragmentId()) == null) {
            str = "";
        }
        long currentTimeMillis = System.currentTimeMillis() - highlightsListViewModel.LJLL;
        HighlightCellItem highlightCellItem3 = highlightsListViewModel.LJLJLLL;
        if (highlightCellItem3 != null) {
            str2 = highlightCellItem3.getDaInfo();
        } else {
            str2 = null;
        }
        C44008HOy.LIZLLL(j, currentTimeMillis, str3, str4, str, "stop_loading", str2, z);
        Integer num = highlightsListViewModel.LJLJJL;
        if (num != null) {
            Downloader.getInstance(EF7.LIZIZ()).cancel(num.intValue());
        }
    }
}

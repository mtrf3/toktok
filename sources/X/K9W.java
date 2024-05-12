package X;

import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.ecomsearch.ui.EcSearchResultFragmentNew;
import com.ss.android.ugc.aweme.ecomsearch.viewmodel.EcSearchStartViewModel;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchLogEnterParams;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class K9W implements KHW {
    public final /* synthetic */ EcSearchResultFragmentNew LJLIL;

    /* JADX WARN: Removed duplicated region for block: B:33:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0186  */
    @Override // X.KHW
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.vision.model.PhotoSearchBusinessEnterParams LIZ() {
        /*
            Method dump skipped, instructions count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K9W.LIZ():com.ss.android.ugc.aweme.vision.model.PhotoSearchBusinessEnterParams");
    }

    @Override // X.KHW
    public final PhotoSearchLogEnterParams LIZIZ() {
        Integer num;
        Integer num2;
        String str;
        NextLiveData<Integer> hv0;
        K7X k7x = this.LJLIL.LJLZ.LJLLLL;
        if (k7x != null) {
            num = Integer.valueOf(k7x.LIZ());
        } else {
            num = null;
        }
        PhotoSearchLogEnterParams photoSearchLogEnterParams = new PhotoSearchLogEnterParams(null, null, null, null, 15, null);
        EcSearchResultFragmentNew ecSearchResultFragmentNew = this.LJLIL;
        photoSearchLogEnterParams.setSearchEntrance("mall");
        EcSearchStartViewModel ecSearchStartViewModel = ecSearchResultFragmentNew.LJLZ;
        if (ecSearchStartViewModel == null || (hv0 = ecSearchStartViewModel.hv0()) == null || (num2 = hv0.getValue()) == null) {
            num2 = -1;
        }
        o.LJIIIIZZ(num2, "searchStartViewModel?.searchTabIndex?.value ?: -1");
        String LJ = C51214K8c.LJ(num2.intValue());
        if (LJ.length() == 0) {
            photoSearchLogEnterParams.setSearchType("shop");
        } else {
            photoSearchLogEnterParams.setSearchType(LJ);
        }
        if (num == null || num.intValue() != 0) {
            str = "search_middle_page";
        } else {
            str = "search_result";
        }
        photoSearchLogEnterParams.setCurrentPage(str);
        return photoSearchLogEnterParams;
    }

    public K9W(EcSearchResultFragmentNew ecSearchResultFragmentNew) {
        this.LJLIL = ecSearchResultFragmentNew;
    }
}

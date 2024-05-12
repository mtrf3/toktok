package X;

import com.ss.android.ugc.aweme.search.ecommerce.middle.SearchResultFragmentNew;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchLogEnterParams;

/* loaded from: classes9.dex */
public final class K9X implements KHW {
    public final /* synthetic */ SearchResultFragmentNew LJLIL;

    /* JADX WARN: Removed duplicated region for block: B:33:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0181  */
    @Override // X.KHW
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.vision.model.PhotoSearchBusinessEnterParams LIZ() {
        /*
            Method dump skipped, instructions count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K9X.LIZ():com.ss.android.ugc.aweme.vision.model.PhotoSearchBusinessEnterParams");
    }

    @Override // X.KHW
    public final PhotoSearchLogEnterParams LIZIZ() {
        Integer num;
        String str;
        InterfaceC50548Jse interfaceC50548Jse = this.LJLIL.LLFZ.LJLZ;
        if (interfaceC50548Jse != null) {
            num = Integer.valueOf(interfaceC50548Jse.LIZ());
        } else {
            num = null;
        }
        PhotoSearchLogEnterParams photoSearchLogEnterParams = new PhotoSearchLogEnterParams(null, null, null, null, 15, null);
        photoSearchLogEnterParams.setSearchEntrance("mall");
        if (num == null || num.intValue() != 0) {
            str = "search_middle_page";
        } else {
            str = "search_result";
        }
        photoSearchLogEnterParams.setCurrentPage(str);
        photoSearchLogEnterParams.setSearchType("shop");
        return photoSearchLogEnterParams;
    }

    public K9X(SearchResultFragmentNew searchResultFragmentNew) {
        this.LJLIL = searchResultFragmentNew;
    }
}

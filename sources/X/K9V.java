package X;

import com.ss.android.ugc.aweme.ecommerce.search.searchbar.ECSearchBarAssem;
import com.ss.android.ugc.aweme.ecommerce.search.searchbar.ISearchBarContextAbility;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchBusinessEnterParams;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchLogEnterParams;

/* loaded from: classes9.dex */
public final class K9V implements KHW {
    public final /* synthetic */ ECSearchBarAssem LJLIL;

    @Override // X.KHW
    public final PhotoSearchBusinessEnterParams LIZ() {
        K9E k9e;
        K9F k9f;
        String str;
        String str2;
        KAU kau;
        String str3;
        String str4;
        Integer num;
        String str5;
        String str6;
        String str7;
        String str8;
        KAU kau2;
        String str9;
        C50948Jz6 c50948Jz6;
        ISearchBarContextAbility iSearchBarContextAbility = this.LJLIL.I3().LJLJJI;
        if (iSearchBarContextAbility != null) {
            k9e = iSearchBarContextAbility.g8();
        } else {
            k9e = null;
        }
        ISearchBarContextAbility iSearchBarContextAbility2 = this.LJLIL.I3().LJLJJI;
        if (iSearchBarContextAbility2 != null) {
            k9f = iSearchBarContextAbility2.H2();
        } else {
            k9f = null;
        }
        PhotoSearchBusinessEnterParams photoSearchBusinessEnterParams = new PhotoSearchBusinessEnterParams(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, null, 4194303, null);
        if (k9e == null || (str = k9e.LIZ) == null) {
            str = "";
        }
        photoSearchBusinessEnterParams.setEnterFrom(str);
        if (k9e != null) {
            str2 = k9e.LJII;
        } else {
            str2 = null;
        }
        photoSearchBusinessEnterParams.setTrafficSourceList(str2);
        if (k9f != null) {
            kau = k9f.LIZLLL;
        } else {
            kau = null;
        }
        KAU kau3 = KAU.RESULT;
        if (kau == kau3) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        photoSearchBusinessEnterParams.setFromMiddleBackFromResult(str3);
        if (k9e != null && (c50948Jz6 = k9e.LJIILIIL) != null) {
            str4 = c50948Jz6.getGroupId();
        } else {
            str4 = null;
        }
        photoSearchBusinessEnterParams.setGroupId(str4);
        if (k9e != null) {
            num = Integer.valueOf(k9e.LJIIIIZZ);
        } else {
            num = null;
        }
        photoSearchBusinessEnterParams.setFromVideo(num);
        if (k9e != null) {
            str5 = k9e.LJIIIZ;
        } else {
            str5 = null;
        }
        photoSearchBusinessEnterParams.setFromComment(str5);
        if (k9e != null) {
            str6 = k9e.LJIIJ;
        } else {
            str6 = null;
        }
        photoSearchBusinessEnterParams.setLastFromGroupId(str6);
        if (k9e != null) {
            str7 = k9e.LJIIJJI;
        } else {
            str7 = null;
        }
        photoSearchBusinessEnterParams.setAttachProducts(str7);
        if (k9e != null) {
            str8 = k9e.LJIIL;
        } else {
            str8 = null;
        }
        photoSearchBusinessEnterParams.setPersonalContextInfo(str8);
        if (k9f != null) {
            kau2 = k9f.LIZLLL;
        } else {
            kau2 = null;
        }
        if (kau2 == kau3) {
            str9 = "search_result";
        } else {
            str9 = "search_middle_page";
        }
        photoSearchBusinessEnterParams.setPhotoSearchPreviousPage(str9);
        photoSearchBusinessEnterParams.setPhotoSearchPreviousSearchType("shop");
        photoSearchBusinessEnterParams.setOriginIsMallTab("mall");
        photoSearchBusinessEnterParams.setSearchChannel("tiktok_mall_photo_search");
        return photoSearchBusinessEnterParams;
    }

    @Override // X.KHW
    public final PhotoSearchLogEnterParams LIZIZ() {
        String str;
        String str2;
        K9F H2;
        K9F H22;
        KAU kau = null;
        PhotoSearchLogEnterParams photoSearchLogEnterParams = new PhotoSearchLogEnterParams(null, null, null, null, 15, null);
        ECSearchBarAssem eCSearchBarAssem = this.LJLIL;
        photoSearchLogEnterParams.setSearchEntrance("mall");
        ISearchBarContextAbility iSearchBarContextAbility = eCSearchBarAssem.I3().LJLJJI;
        if (iSearchBarContextAbility != null && (H22 = iSearchBarContextAbility.H2()) != null) {
            str = H22.LIZIZ;
        } else {
            str = null;
        }
        photoSearchLogEnterParams.setSearchType(str);
        ISearchBarContextAbility iSearchBarContextAbility2 = eCSearchBarAssem.I3().LJLJJI;
        if (iSearchBarContextAbility2 != null && (H2 = iSearchBarContextAbility2.H2()) != null) {
            kau = H2.LIZLLL;
        }
        if (kau == KAU.RESULT) {
            str2 = "search_result";
        } else {
            str2 = "search_middle_page";
        }
        photoSearchLogEnterParams.setCurrentPage(str2);
        return photoSearchLogEnterParams;
    }

    public K9V(ECSearchBarAssem eCSearchBarAssem) {
        this.LJLIL = eCSearchBarAssem;
    }
}

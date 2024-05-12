package X;

import android.content.Intent;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchBusinessEnterParams;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchLogEnterParams;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class K9Y implements KHW {
    public final /* synthetic */ Intent LJLIL;

    @Override // X.KHW
    public final PhotoSearchBusinessEnterParams LIZ() {
        String str;
        String str2;
        String str3 = null;
        String str4 = null;
        PhotoSearchBusinessEnterParams photoSearchBusinessEnterParams = new PhotoSearchBusinessEnterParams(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, null, 4194303, null);
        Intent intent = this.LJLIL;
        if (intent != null) {
            str4 = C16880lQ.LLJJIJIIJIL(intent, "enter_from");
        }
        photoSearchBusinessEnterParams.setEnterFrom(str4);
        if (intent != null) {
            str = C16880lQ.LLJJIJIIJIL(intent, "traffic_source_list");
        } else {
            str = null;
        }
        photoSearchBusinessEnterParams.setTrafficSourceList(str);
        if (intent != null) {
            str2 = C16880lQ.LLJJIJIIJIL(intent, "origin_is_mall_tab");
        } else {
            str2 = null;
        }
        photoSearchBusinessEnterParams.setOriginIsMallTab(str2);
        if (intent != null) {
            str3 = C16880lQ.LLJJIJIIJIL(intent, "source_page_name");
        }
        photoSearchBusinessEnterParams.setPhotoSearchPreviousPage(str3);
        photoSearchBusinessEnterParams.setSearchChannel("tiktok_mall_photo_search");
        return photoSearchBusinessEnterParams;
    }

    @Override // X.KHW
    public final PhotoSearchLogEnterParams LIZIZ() {
        String str = null;
        String str2 = null;
        PhotoSearchLogEnterParams photoSearchLogEnterParams = new PhotoSearchLogEnterParams(null, null, null, null, 15, null);
        Intent intent = this.LJLIL;
        if (intent != null) {
            str2 = C16880lQ.LLJJIJIIJIL(intent, "search_entrance");
        }
        if (o.LJ("mall", str2)) {
            str2 = C16880lQ.LLJJIJIIJIL(intent, "enter_from");
        }
        photoSearchLogEnterParams.setSearchEntrance(str2);
        if (intent != null) {
            str = C16880lQ.LLJJIJIIJIL(intent, "source_page_name");
        }
        photoSearchLogEnterParams.setCurrentPage(str);
        return photoSearchLogEnterParams;
    }

    public K9Y(Intent intent) {
        this.LJLIL = intent;
    }
}

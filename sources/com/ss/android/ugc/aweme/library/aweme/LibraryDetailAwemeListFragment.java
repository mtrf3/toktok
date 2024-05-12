package com.ss.android.ugc.aweme.library.aweme;

import X.MGX;
import android.os.Bundle;
import com.bytedance.router.SmartRoute;
import com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.library.LibraryMaterialInfo;

/* loaded from: classes10.dex */
public class LibraryDetailAwemeListFragment extends DetailAwemeListFragment {
    public LibraryMaterialInfo LLILLL;
    public String LLILZ;

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment
    public final void initArguments(Bundle bundle) {
        super.initArguments(bundle);
        if (bundle != null) {
            this.LLILLL = (LibraryMaterialInfo) bundle.getSerializable("detail_library_data");
            this.LLILZ = (String) bundle.getSerializable("from_group_id");
        }
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment
    public final SmartRoute wl(MGX mgx, Aweme aweme) {
        SmartRoute wl = super.wl(mgx, aweme);
        wl.withParam("video_from", "library_detail_page");
        wl.withParam("enter_from", "library_detail_page");
        LibraryMaterialInfo libraryMaterialInfo = this.LLILLL;
        if (libraryMaterialInfo != null) {
            wl.withParam("feed_data_material_info", libraryMaterialInfo);
        }
        String str = this.LLILZ;
        if (str != null) {
            wl.withParam("from_group_id", str);
        }
        return wl;
    }
}

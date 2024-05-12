package com.ss.android.ugc.aweme.topic.book.detail.videos;

import X.C113554cx;
import X.C7U3;
import X.OSZ;
import com.ss.android.ugc.aweme.IDetailPageShareVMService;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.topic.book.detail.vm.BookVideoListVM;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class BookDetailSharedVMServiceImpl implements IDetailPageShareVMService {
    @Override // com.ss.android.ugc.aweme.IDetailPageShareVMService
    public final HashMap<String, C7U3> LIZ() {
        return C113554cx.LJJJLZIJ(new OSZ("BOOK_VIDEO_LIST_ENTRANCE", new C7U3() { // from class: X.7Tz
            @Override // X.C7U3
            public final OSZ<String, Class<? extends BaseDetailShareVM<?, ?, ?>>> LIZ(M89 param) {
                o.LJIIIZ(param, "param");
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("BOOK_VIDEO_LIST_VM_KEY");
                LIZ.append(param.getExtra().get("book_id"));
                LIZ.append(param.getExtra().get("page_id"));
                return new OSZ<>(X1D.LIZIZ(LIZ), BookVideoListVM.class);
            }
        }));
    }
}

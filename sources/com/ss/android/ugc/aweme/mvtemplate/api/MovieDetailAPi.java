package com.ss.android.ugc.aweme.mvtemplate.api;

import X.C76L;
import X.E4Q;
import X.E4T;
import X.InterfaceC195787mI;
import X.InterfaceC64989Pez;
import X.InterfaceC64992Pf2;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.mvtemplate.model.MvDetailListModel;
import com.ss.android.ugc.aweme.mvtemplate.model.MvDetailModel;
import java.util.Map;

/* loaded from: classes4.dex */
public final class MovieDetailAPi {
    public static final String LIZ = Api.LIZ;

    /* loaded from: classes4.dex */
    public interface MvDetail {
        @InterfaceC195787mI
        @E4T("/aweme/v1/ulike/collect/template/")
        C76L<Object> collectTemplate(@InterfaceC64992Pf2 Map<String, Object> map);

        @E4Q("/aweme/v1/mv/detail/")
        C76L<MvDetailModel> getMvDetail(@InterfaceC64989Pez("mv_id") String str, @InterfaceC64989Pez("mv_template_type") int i, @InterfaceC64989Pez("source_id") int i2);

        @E4Q("/aweme/v1/mv/aweme/")
        C76L<MvDetailListModel> getMvDetailList(@InterfaceC64989Pez("mv_id") String str, @InterfaceC64989Pez("cursor") long j, @InterfaceC64989Pez("mv_template_type") int i, @InterfaceC64989Pez("source_id") int i2);
    }
}

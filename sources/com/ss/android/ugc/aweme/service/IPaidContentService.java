package com.ss.android.ugc.aweme.service;

import X.AbstractC73672Svk;
import X.ActivityC45651qj;
import X.EnumC25627A3z;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import com.ss.android.ugc.aweme.model.PaidCollectionDetailResponse;
import com.ss.android.ugc.aweme.paidcontent.activity.PaidContentCollectionDetailFragment;
import com.ss.android.ugc.aweme.paidcontent.interceptor.PaidContentInterceptor;

/* loaded from: classes5.dex */
public interface IPaidContentService {
    PaidContentCollectionDetailFragment LIZ(String str, long j, String str2, long j2, EnumC25627A3z enumC25627A3z);

    void LIZIZ(ActivityC45651qj activityC45651qj, CollectionDetailModel collectionDetailModel, String str);

    AbstractC73672Svk<BaseResponse> LIZJ(long j, long j2, float f, float f2, int i);

    void LIZLLL(String str);

    AbstractC73672Svk<PaidCollectionDetailResponse> LJ(long j);

    void LJFF(FragmentManager fragmentManager, String str, String str2, String str3);

    boolean LJI();

    AbstractC73672Svk LJII(Long l, long j, int i);

    PaidContentInterceptor LJIIIIZZ();
}

package com.ss.android.ugc.aweme.service;

import X.A1M;
import X.A3Q;
import X.A4J;
import X.A4S;
import X.A4U;
import X.ASL;
import X.AbstractC36908Ee8;
import X.AbstractC73672Svk;
import X.ActivityC45651qj;
import X.AnonymousClass036;
import X.C123184sU;
import X.C19N;
import X.C58096Mr6;
import X.C61845OOz;
import X.C73536StY;
import X.EFJ;
import X.EnumC25627A3z;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.keva.Keva;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import com.ss.android.ugc.aweme.model.PaidCollectionDetailResponse;
import com.ss.android.ugc.aweme.paidcontent.activity.PaidContentCollectionDetailFragment;
import com.ss.android.ugc.aweme.paidcontent.api.PaidCollectionApi;
import com.ss.android.ugc.aweme.paidcontent.fragments.PaidContentReportMenuFragment;
import com.ss.android.ugc.aweme.paidcontent.interceptor.PaidContentInterceptor;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class PaidContentServiceImpl implements IPaidContentService {
    public static IPaidContentService LJIIIZ() {
        Object LIZ = C58096Mr6.LIZ(IPaidContentService.class, false);
        if (LIZ != null) {
            return (IPaidContentService) LIZ;
        }
        if (C58096Mr6.e5 == null) {
            synchronized (IPaidContentService.class) {
                if (C58096Mr6.e5 == null) {
                    C58096Mr6.e5 = new PaidContentServiceImpl();
                }
            }
        }
        return C58096Mr6.e5;
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentService
    public final PaidContentInterceptor LJIIIIZZ() {
        return new PaidContentInterceptor();
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentService
    public final boolean LJI() {
        return A3Q.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentService
    public final void LIZLLL(String str) {
        C123184sU.LIZ.add(str);
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentService
    public final AbstractC73672Svk<PaidCollectionDetailResponse> LJ(long j) {
        return A4J.LIZ(j);
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentService
    public final void LIZIZ(ActivityC45651qj activityC45651qj, CollectionDetailModel data, String str) {
        int i;
        o.LJIIIZ(data, "data");
        if (data.getCanReviewCollection() && data.getShouldPromptReview()) {
            String LIZ = C61845OOz.LIZ("should_prompt_rating", data.getCollectionId());
            Keva keva = A1M.LIZ;
            int i2 = keva.getInt(LIZ, 0);
            if (A4U.LIZ()) {
                i = 3;
            } else {
                i = 1;
            }
            if (i2 < i) {
                A4S.LJI(activityC45651qj.getSupportFragmentManager(), 0, str, null, data.getCollectionId(), data, null, null, 450);
                String LIZ2 = C61845OOz.LIZ("should_prompt_rating", data.getCollectionId());
                C19N.LIZJ(keva, LIZ2, 0, 1, LIZ2);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentService
    public final AbstractC73672Svk LJII(Long l, long j, int i) {
        return A4J.LIZIZ(l, j, i);
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentService
    public final void LJFF(FragmentManager fragmentManager, String str, String str2, String str3) {
        if (fragmentManager != null) {
            Bundle LIZJ = AnonymousClass036.LIZJ("owner_id", str, "aweme_id", str2);
            LIZJ.putString("enter_from", str3);
            PaidContentReportMenuFragment paidContentReportMenuFragment = new PaidContentReportMenuFragment();
            paidContentReportMenuFragment.setArguments(LIZJ);
            ASL asl = new ASL();
            asl.LIZ.LJLLILLLL = paidContentReportMenuFragment;
            asl.LJI(1);
            TuxSheet tuxSheet = asl.LIZ;
            tuxSheet.LJZI = false;
            tuxSheet.show(fragmentManager, "report");
        }
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentService
    public final PaidContentCollectionDetailFragment LIZ(String str, long j, String str2, long j2, EnumC25627A3z entrySource) {
        o.LJIIIZ(entrySource, "entrySource");
        Bundle bundle = new Bundle();
        bundle.putString("enter_from", str);
        bundle.putLong("collection_id", j);
        bundle.putString("owner_id", str2);
        bundle.putLong("room_id", j2);
        bundle.putBoolean("hide_back_button", true);
        bundle.putInt("purchase_button_text", R.string.qi8);
        bundle.putSerializable("entry_source", entrySource);
        PaidContentCollectionDetailFragment paidContentCollectionDetailFragment = new PaidContentCollectionDetailFragment();
        paidContentCollectionDetailFragment.setArguments(bundle);
        return paidContentCollectionDetailFragment;
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentService
    public final AbstractC73672Svk<BaseResponse> LIZJ(long j, long j2, float f, float f2, int i) {
        try {
            if (PaidCollectionApi.LIZJ == null) {
                IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
                String API_URL_PREFIX_SI = EFJ.LIZJ;
                o.LJIIIIZZ(API_URL_PREFIX_SI, "API_URL_PREFIX_SI");
                PaidCollectionApi.LIZJ = (PaidCollectionApi.PostPaidContentVideoProgressApi) LIZLLL.create(API_URL_PREFIX_SI).create(PaidCollectionApi.PostPaidContentVideoProgressApi.class);
            }
            PaidCollectionApi.PostPaidContentVideoProgressApi postPaidContentVideoProgressApi = PaidCollectionApi.LIZJ;
            if (postPaidContentVideoProgressApi != null) {
                return postPaidContentVideoProgressApi.postPaidContentVideoProgress(j, j2, ((int) f) / 1000, ((int) f2) / 1000, i);
            }
        } catch (ExecutionException e) {
            AbstractC36908Ee8.getCompatibleException(e);
        }
        C73536StY c73536StY = C73536StY.LJLIL;
        o.LJIIIIZZ(c73536StY, "empty()");
        return c73536StY;
    }
}

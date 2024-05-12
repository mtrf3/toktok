package com.ss.android.ugc.aweme.paidcontent.seriescreation.service;

import X.AbstractC73638SvC;
import X.C58096Mr6;
import X.C77800Ug8;
import X.C7VX;
import X.EnumC248719pT;
import X.EnumC248729pU;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.model.CreatorCollectionDetailResponse;
import com.ss.android.ugc.aweme.model.EditVideoRequest;
import com.ss.android.ugc.aweme.model.ManageCollectionRequest;
import com.ss.android.ugc.aweme.model.PricesResponse;
import com.ss.android.ugc.aweme.model.RemoveVideoRequest;
import com.ss.android.ugc.aweme.model.ReorderVideosRequest;
import com.ss.android.ugc.aweme.model.SetTrailerRequest;
import com.ss.android.ugc.aweme.model.SubmitSeriesRequest;
import com.ss.android.ugc.aweme.model.UpdatedVideosResponse;
import com.ss.android.ugc.aweme.paidcontent.manageseries.api.ManageSeriesApi;
import com.ss.android.ugc.aweme.paidcontent.seriescreation.api.PaidContentCreationApi;
import com.ss.android.ugc.aweme.service.IPaidContentCreationService;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class PaidContentCreationServiceImpl implements IPaidContentCreationService {
    public final PaidContentCreationApi LIZ;
    public final ManageSeriesApi LIZIZ;

    public static IPaidContentCreationService LJIIIZ() {
        Object LIZ = C58096Mr6.LIZ(IPaidContentCreationService.class, false);
        if (LIZ != null) {
            return (IPaidContentCreationService) LIZ;
        }
        return new PaidContentCreationServiceImpl();
    }

    public PaidContentCreationServiceImpl() {
        PaidContentCreationApi.LIZ.getClass();
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = Api.LIZ;
        this.LIZ = (PaidContentCreationApi) C77800Ug8.LIZIZ(str, "API_URL_PREFIX_SI", LIZLLL, str, PaidContentCreationApi.class);
        ManageSeriesApi.LIZ.getClass();
        this.LIZIZ = (ManageSeriesApi) RetrofitFactory.LIZLLL().create(str).create(ManageSeriesApi.class);
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentCreationService
    public final AbstractC73638SvC<CreatorCollectionDetailResponse> LIZ(String str) {
        return this.LIZ.getCollectionDetail(str);
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentCreationService
    public final AbstractC73638SvC<CreatorCollectionDetailResponse> LJFF(String str) {
        return this.LIZIZ.submitSeries(new SubmitSeriesRequest(str));
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentCreationService
    public final AbstractC73638SvC<PricesResponse> LJI(EnumC248729pU businessType) {
        o.LJIIIZ(businessType, "businessType");
        return this.LIZ.getPrices(businessType.getValue());
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentCreationService
    public final AbstractC73638SvC<UpdatedVideosResponse> LIZIZ(String str, String str2) {
        return this.LIZIZ.deleteVideo(new RemoveVideoRequest(str, str2));
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentCreationService
    public final AbstractC73638SvC<UpdatedVideosResponse> LIZJ(String str, String str2) {
        return this.LIZIZ.unsetTrailer(new SetTrailerRequest(str, str2));
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentCreationService
    public final AbstractC73638SvC<UpdatedVideosResponse> LJII(String str, String str2) {
        return this.LIZIZ.setTrailer(new SetTrailerRequest(str, str2));
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentCreationService
    public final AbstractC73638SvC<UpdatedVideosResponse> LJIIIIZZ(String str, List<String> list) {
        return this.LIZIZ.reorderVideo(new ReorderVideosRequest(str, list));
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentCreationService
    public final AbstractC73638SvC<UpdatedVideosResponse> LJ(String str, String str2, String str3, String str4) {
        return this.LIZIZ.editVideo(new EditVideoRequest(str, str2, str3, str4));
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentCreationService
    public final AbstractC73638SvC<CreatorCollectionDetailResponse> LIZLLL(EnumC248719pT operation, String str, String str2, String str3, String str4, String str5, String str6) {
        String str7 = str6;
        o.LJIIIZ(operation, "operation");
        PaidContentCreationApi paidContentCreationApi = this.LIZ;
        int value = operation.getValue();
        if (!C7VX.LIZ()) {
            str7 = null;
        }
        return paidContentCreationApi.manageCollection(new ManageCollectionRequest(value, str, str2, str3, str4, str5, str7));
    }
}

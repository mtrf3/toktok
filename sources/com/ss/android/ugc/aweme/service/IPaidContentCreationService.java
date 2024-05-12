package com.ss.android.ugc.aweme.service;

import X.AbstractC73638SvC;
import X.EnumC248719pT;
import X.EnumC248729pU;
import com.ss.android.ugc.aweme.model.CreatorCollectionDetailResponse;
import com.ss.android.ugc.aweme.model.PricesResponse;
import com.ss.android.ugc.aweme.model.UpdatedVideosResponse;
import java.util.List;

/* loaded from: classes5.dex */
public interface IPaidContentCreationService {
    AbstractC73638SvC<CreatorCollectionDetailResponse> LIZ(String str);

    AbstractC73638SvC<UpdatedVideosResponse> LIZIZ(String str, String str2);

    AbstractC73638SvC<UpdatedVideosResponse> LIZJ(String str, String str2);

    AbstractC73638SvC<CreatorCollectionDetailResponse> LIZLLL(EnumC248719pT enumC248719pT, String str, String str2, String str3, String str4, String str5, String str6);

    AbstractC73638SvC<UpdatedVideosResponse> LJ(String str, String str2, String str3, String str4);

    AbstractC73638SvC<CreatorCollectionDetailResponse> LJFF(String str);

    AbstractC73638SvC<PricesResponse> LJI(EnumC248729pU enumC248729pU);

    AbstractC73638SvC<UpdatedVideosResponse> LJII(String str, String str2);

    AbstractC73638SvC<UpdatedVideosResponse> LJIIIIZZ(String str, List<String> list);
}

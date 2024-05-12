package com.ss.android.ugc.aweme.ad.feed.candidate;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class CandidateResponse extends BaseResponse implements Serializable {

    @InterfaceC65349Pkn("aweme_list")
    public final List<Aweme> candidateList;

    @InterfaceC65349Pkn("sati_param_for_pitaya")
    public final String satiParamForPitaya;

    /* JADX WARN: Multi-variable type inference failed */
    public CandidateResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final List<Aweme> getCandidateList() {
        return this.candidateList;
    }

    public final String getSatiParamForPitaya() {
        return this.satiParamForPitaya;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CandidateResponse(List<? extends Aweme> list, String str) {
        this.candidateList = list;
        this.satiParamForPitaya = str;
    }

    public /* synthetic */ CandidateResponse(List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? "" : str);
    }
}

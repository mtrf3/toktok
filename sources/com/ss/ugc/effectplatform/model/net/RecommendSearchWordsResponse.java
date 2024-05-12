package com.ss.ugc.effectplatform.model.net;

import X.C78966Uyw;
import X.XDH;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes13.dex */
public final class RecommendSearchWordsResponse extends XDH<RecommendSearchWordsResponse> {
    public RecommendSearchWordsModel data;
    public String message;
    public int status_code;

    /* JADX WARN: Multi-variable type inference failed */
    public RecommendSearchWordsResponse() {
        this(null, 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ RecommendSearchWordsResponse copy$default(RecommendSearchWordsResponse recommendSearchWordsResponse, RecommendSearchWordsModel recommendSearchWordsModel, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            recommendSearchWordsModel = recommendSearchWordsResponse.data;
        }
        if ((i2 & 2) != 0) {
            i = recommendSearchWordsResponse.status_code;
        }
        if ((i2 & 4) != 0) {
            str = recommendSearchWordsResponse.message;
        }
        return recommendSearchWordsResponse.copy(recommendSearchWordsModel, i, str);
    }

    private Object[] getObjects() {
        return new Object[]{this.data, Integer.valueOf(this.status_code), this.message};
    }

    public final RecommendSearchWordsResponse copy(RecommendSearchWordsModel recommendSearchWordsModel, int i, String str) {
        return new RecommendSearchWordsResponse(recommendSearchWordsModel, i, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RecommendSearchWordsResponse) {
            return C78966Uyw.LJIIIZ(((RecommendSearchWordsResponse) obj).getObjects(), getObjects());
        }
        return false;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.XDH
    public RecommendSearchWordsResponse getResponseData() {
        return this;
    }

    public int hashCode() {
        return Objects.hash(getObjects());
    }

    public String toString() {
        return C78966Uyw.LJJJLL("RecommendSearchWordsResponse:%s,%s,%s", getObjects());
    }

    @Override // X.XDH
    public boolean checkValue() {
        if (this.data != null) {
            return true;
        }
        return false;
    }

    public final RecommendSearchWordsModel getData() {
        return this.data;
    }

    public final String getMessage() {
        return this.message;
    }

    @Override // X.XDH
    public /* bridge */ /* synthetic */ RecommendSearchWordsResponse getResponseData() {
        getResponseData();
        return this;
    }

    @Override // X.XDH
    public String getResponseMessage() {
        return this.message;
    }

    @Override // X.XDH
    public int getStatusCode() {
        return this.status_code;
    }

    public final int getStatus_code() {
        return this.status_code;
    }

    public final void setData(RecommendSearchWordsModel recommendSearchWordsModel) {
        this.data = recommendSearchWordsModel;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setStatus_code(int i) {
        this.status_code = i;
    }

    public RecommendSearchWordsResponse(RecommendSearchWordsModel recommendSearchWordsModel, int i, String str) {
        this.data = recommendSearchWordsModel;
        this.status_code = i;
        this.message = str;
    }

    public /* synthetic */ RecommendSearchWordsResponse(RecommendSearchWordsModel recommendSearchWordsModel, int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : recommendSearchWordsModel, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? null : str);
    }
}

package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class NoticeCombineResponse extends BaseResponse {

    @InterfaceC65349Pkn("data")
    public final NoticeCombineDatas data;

    /* JADX WARN: Multi-variable type inference failed */
    public NoticeCombineResponse() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ NoticeCombineResponse copy$default(NoticeCombineResponse noticeCombineResponse, NoticeCombineDatas noticeCombineDatas, int i, Object obj) {
        if ((i & 1) != 0) {
            noticeCombineDatas = noticeCombineResponse.data;
        }
        return noticeCombineResponse.copy(noticeCombineDatas);
    }

    public final NoticeCombineResponse copy(NoticeCombineDatas noticeCombineDatas) {
        return new NoticeCombineResponse(noticeCombineDatas);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof NoticeCombineResponse) && o.LJ(this.data, ((NoticeCombineResponse) obj).data);
    }

    public int hashCode() {
        NoticeCombineDatas noticeCombineDatas = this.data;
        if (noticeCombineDatas == null) {
            return 0;
        }
        return noticeCombineDatas.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NoticeCombineResponse(data=");
        LIZ.append(this.data);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final NoticeCombineDatas getData() {
        return this.data;
    }

    public NoticeCombineResponse(NoticeCombineDatas noticeCombineDatas) {
        this.data = noticeCombineDatas;
    }

    public /* synthetic */ NoticeCombineResponse(NoticeCombineDatas noticeCombineDatas, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : noticeCombineDatas);
    }
}

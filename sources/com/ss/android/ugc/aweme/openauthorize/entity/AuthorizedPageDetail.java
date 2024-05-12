package com.ss.android.ugc.aweme.openauthorize.entity;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class AuthorizedPageDetail extends BaseResponse implements Serializable {

    @InterfaceC65349Pkn("bc_scope_list")
    public final List<AuthorizedScope> bcScopeList;

    @InterfaceC65349Pkn("client_info")
    public final AuthorizedClient clientInfo;

    @InterfaceC65349Pkn("scope_list")
    public List<AuthorizedScope> scopeList;

    @InterfaceC65349Pkn("text_list")
    public final List<AuthorizedPageText> textList;

    /* JADX WARN: Multi-variable type inference failed */
    public AuthorizedPageDetail() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AuthorizedPageDetail copy$default(AuthorizedPageDetail authorizedPageDetail, AuthorizedClient authorizedClient, List list, List list2, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            authorizedClient = authorizedPageDetail.clientInfo;
        }
        if ((i & 2) != 0) {
            list = authorizedPageDetail.scopeList;
        }
        if ((i & 4) != 0) {
            list2 = authorizedPageDetail.textList;
        }
        if ((i & 8) != 0) {
            list3 = authorizedPageDetail.bcScopeList;
        }
        return authorizedPageDetail.copy(authorizedClient, list, list2, list3);
    }

    public final AuthorizedPageDetail copy(AuthorizedClient authorizedClient, List<AuthorizedScope> list, List<AuthorizedPageText> list2, List<AuthorizedScope> list3) {
        return new AuthorizedPageDetail(authorizedClient, list, list2, list3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthorizedPageDetail)) {
            return false;
        }
        AuthorizedPageDetail authorizedPageDetail = (AuthorizedPageDetail) obj;
        return o.LJ(this.clientInfo, authorizedPageDetail.clientInfo) && o.LJ(this.scopeList, authorizedPageDetail.scopeList) && o.LJ(this.textList, authorizedPageDetail.textList) && o.LJ(this.bcScopeList, authorizedPageDetail.bcScopeList);
    }

    public int hashCode() {
        AuthorizedClient authorizedClient = this.clientInfo;
        int hashCode = (authorizedClient == null ? 0 : authorizedClient.hashCode()) * 31;
        List<AuthorizedScope> list = this.scopeList;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<AuthorizedPageText> list2 = this.textList;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<AuthorizedScope> list3 = this.bcScopeList;
        return hashCode3 + (list3 != null ? list3.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AuthorizedPageDetail(clientInfo=");
        LIZ.append(this.clientInfo);
        LIZ.append(", scopeList=");
        LIZ.append(this.scopeList);
        LIZ.append(", textList=");
        LIZ.append(this.textList);
        LIZ.append(", bcScopeList=");
        return C1NE.LIZIZ(LIZ, this.bcScopeList, ')', LIZ);
    }

    public final List<AuthorizedScope> getBcScopeList() {
        return this.bcScopeList;
    }

    public final AuthorizedClient getClientInfo() {
        return this.clientInfo;
    }

    public final List<AuthorizedScope> getScopeList() {
        return this.scopeList;
    }

    public final List<AuthorizedPageText> getTextList() {
        return this.textList;
    }

    public final void setScopeList(List<AuthorizedScope> list) {
        this.scopeList = list;
    }

    public final String textValueByKey(String key) {
        o.LJIIIZ(key, "key");
        List<AuthorizedPageText> list = this.textList;
        if (list != null) {
            for (AuthorizedPageText authorizedPageText : list) {
                if (o.LJ(authorizedPageText.getTextKey(), key)) {
                    return authorizedPageText.getTextContent();
                }
            }
            return null;
        }
        return null;
    }

    public AuthorizedPageDetail(AuthorizedClient authorizedClient, List<AuthorizedScope> list, List<AuthorizedPageText> list2, List<AuthorizedScope> list3) {
        this.clientInfo = authorizedClient;
        this.scopeList = list;
        this.textList = list2;
        this.bcScopeList = list3;
    }

    public /* synthetic */ AuthorizedPageDetail(AuthorizedClient authorizedClient, List list, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : authorizedClient, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : list2, (i & 8) != 0 ? null : list3);
    }
}

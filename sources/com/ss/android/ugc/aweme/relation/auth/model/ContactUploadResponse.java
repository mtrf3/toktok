package com.ss.android.ugc.aweme.relation.auth.model;

import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ContactUploadResponse extends BaseResponse {

    @InterfaceC65349Pkn("client_next_upload_ts")
    public final Long cacheValidTimestamp;

    @InterfaceC65349Pkn("log_pb")
    public final LogPbBean logPbBean;

    @InterfaceC65349Pkn("provide_matched_len")
    public final Long provideMatchedLen;

    @InterfaceC65349Pkn("registered_user")
    public final List<RegisteredContactUser> registerUserListInternal;

    @InterfaceC65349Pkn("unregistered_contact")
    public final List<UnRegisteredContactUser> unregisteredContact;

    /* JADX WARN: Multi-variable type inference failed */
    public ContactUploadResponse() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContactUploadResponse)) {
            return false;
        }
        ContactUploadResponse contactUploadResponse = (ContactUploadResponse) obj;
        return o.LJ(this.unregisteredContact, contactUploadResponse.unregisteredContact) && o.LJ(this.registerUserListInternal, contactUploadResponse.registerUserListInternal) && o.LJ(this.logPbBean, contactUploadResponse.logPbBean) && o.LJ(this.cacheValidTimestamp, contactUploadResponse.cacheValidTimestamp) && o.LJ(this.provideMatchedLen, contactUploadResponse.provideMatchedLen);
    }

    public final int hashCode() {
        List<UnRegisteredContactUser> list = this.unregisteredContact;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<RegisteredContactUser> list2 = this.registerUserListInternal;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        LogPbBean logPbBean = this.logPbBean;
        int hashCode3 = (hashCode2 + (logPbBean == null ? 0 : logPbBean.hashCode())) * 31;
        Long l = this.cacheValidTimestamp;
        int hashCode4 = (hashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.provideMatchedLen;
        return hashCode4 + (l2 != null ? l2.hashCode() : 0);
    }

    public final List<RegisteredContactUser> LJ() {
        String imprId;
        LogPbBean logPbBean = this.logPbBean;
        if (logPbBean == null || (imprId = logPbBean.getImprId()) == null) {
            return this.registerUserListInternal;
        }
        List<RegisteredContactUser> list = this.registerUserListInternal;
        if (list == null) {
            return null;
        }
        Iterator<RegisteredContactUser> it = list.iterator();
        while (it.hasNext()) {
            it.next().setRequestId(imprId);
        }
        return list;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ContactUploadResponse(unregisteredContact=");
        LIZ.append(this.unregisteredContact);
        LIZ.append(", registerUserListInternal=");
        LIZ.append(this.registerUserListInternal);
        LIZ.append(", logPbBean=");
        LIZ.append(this.logPbBean);
        LIZ.append(", cacheValidTimestamp=");
        LIZ.append(this.cacheValidTimestamp);
        LIZ.append(", provideMatchedLen=");
        return JBR.LJ(LIZ, this.provideMatchedLen, ')', LIZ);
    }

    public ContactUploadResponse(List<UnRegisteredContactUser> list, List<RegisteredContactUser> list2, LogPbBean logPbBean, Long l, Long l2) {
        this.unregisteredContact = list;
        this.registerUserListInternal = list2;
        this.logPbBean = logPbBean;
        this.cacheValidTimestamp = l;
        this.provideMatchedLen = l2;
    }

    public /* synthetic */ ContactUploadResponse(List list, List list2, LogPbBean logPbBean, Long l, Long l2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : logPbBean, (i & 8) != 0 ? null : l, (i & 16) == 0 ? l2 : null);
    }
}

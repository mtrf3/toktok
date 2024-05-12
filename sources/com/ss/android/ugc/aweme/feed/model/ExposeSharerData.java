package com.ss.android.ugc.aweme.feed.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ExposeSharerData extends BaseResponse {

    @InterfaceC65349Pkn("log_pb")
    public LogPbBean logPbBean;

    @InterfaceC65349Pkn("share_url_extra")
    public ShareUrlExtra shareExtra;

    @InterfaceC65349Pkn("user_info")
    public User sharer;

    /* JADX WARN: Multi-variable type inference failed */
    public ExposeSharerData() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ExposeSharerData copy$default(ExposeSharerData exposeSharerData, User user, LogPbBean logPbBean, ShareUrlExtra shareUrlExtra, int i, Object obj) {
        if ((i & 1) != 0) {
            user = exposeSharerData.sharer;
        }
        if ((i & 2) != 0) {
            logPbBean = exposeSharerData.logPbBean;
        }
        if ((i & 4) != 0) {
            shareUrlExtra = exposeSharerData.shareExtra;
        }
        return exposeSharerData.copy(user, logPbBean, shareUrlExtra);
    }

    public final ExposeSharerData copy(User user, LogPbBean logPbBean, ShareUrlExtra shareUrlExtra) {
        return new ExposeSharerData(user, logPbBean, shareUrlExtra);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExposeSharerData)) {
            return false;
        }
        ExposeSharerData exposeSharerData = (ExposeSharerData) obj;
        return o.LJ(this.sharer, exposeSharerData.sharer) && o.LJ(this.logPbBean, exposeSharerData.logPbBean) && o.LJ(this.shareExtra, exposeSharerData.shareExtra);
    }

    public int hashCode() {
        User user = this.sharer;
        int hashCode = (user == null ? 0 : user.hashCode()) * 31;
        LogPbBean logPbBean = this.logPbBean;
        int hashCode2 = (hashCode + (logPbBean == null ? 0 : logPbBean.hashCode())) * 31;
        ShareUrlExtra shareUrlExtra = this.shareExtra;
        return hashCode2 + (shareUrlExtra != null ? shareUrlExtra.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ExposeSharerData(sharer=");
        LIZ.append(this.sharer);
        LIZ.append(", logPbBean=");
        LIZ.append(this.logPbBean);
        LIZ.append(", shareExtra=");
        LIZ.append(this.shareExtra);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public ExposeSharerData(User user, LogPbBean logPbBean, ShareUrlExtra shareUrlExtra) {
        this.sharer = user;
        this.logPbBean = logPbBean;
        this.shareExtra = shareUrlExtra;
    }

    public /* synthetic */ ExposeSharerData(User user, LogPbBean logPbBean, ShareUrlExtra shareUrlExtra, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : user, (i & 2) != 0 ? null : logPbBean, (i & 4) != 0 ? null : shareUrlExtra);
    }
}

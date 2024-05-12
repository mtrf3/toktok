package com.ss.android.ugc.aweme.notification.frequency;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.notice.repo.list.bean.Behavior;
import com.ss.android.ugc.aweme.notice.repo.list.bean.Condition;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class ReportNotice {

    @InterfaceC65349Pkn("account_type")
    public String accountType;

    @InterfaceC65349Pkn("behavior")
    public Behavior behavior;

    @InterfaceC65349Pkn("condition")
    public Condition condition;

    @InterfaceC65349Pkn("nid")
    public String nid;

    @InterfaceC65349Pkn("to_user_id")
    public int toUserId;

    @InterfaceC65349Pkn("user_action")
    public int userAction;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ReportNotice() {
        /*
            r9 = this;
            r1 = 0
            r2 = 0
            r7 = 63
            r0 = r9
            r3 = r1
            r4 = r2
            r5 = r1
            r6 = r1
            r8 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.frequency.ReportNotice.<init>():void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReportNotice)) {
            return false;
        }
        ReportNotice reportNotice = (ReportNotice) obj;
        return o.LJ(this.nid, reportNotice.nid) && this.toUserId == reportNotice.toUserId && o.LJ(this.accountType, reportNotice.accountType) && this.userAction == reportNotice.userAction && o.LJ(this.condition, reportNotice.condition) && o.LJ(this.behavior, reportNotice.behavior);
    }

    public final int hashCode() {
        String str = this.nid;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.toUserId) * 31;
        String str2 = this.accountType;
        int hashCode2 = (((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.userAction) * 31;
        Condition condition = this.condition;
        int hashCode3 = (hashCode2 + (condition == null ? 0 : condition.hashCode())) * 31;
        Behavior behavior = this.behavior;
        return hashCode3 + (behavior != null ? behavior.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ReportNotice(nid=");
        LIZ.append(this.nid);
        LIZ.append(", toUserId=");
        LIZ.append(this.toUserId);
        LIZ.append(", accountType=");
        LIZ.append(this.accountType);
        LIZ.append(", userAction=");
        LIZ.append(this.userAction);
        LIZ.append(", condition=");
        LIZ.append(this.condition);
        LIZ.append(", behavior=");
        LIZ.append(this.behavior);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public ReportNotice(String str, int i, String str2, int i2, Condition condition, Behavior behavior) {
        this.nid = str;
        this.toUserId = i;
        this.accountType = str2;
        this.userAction = i2;
        this.condition = condition;
        this.behavior = behavior;
    }

    public /* synthetic */ ReportNotice(String str, int i, String str2, int i2, Condition condition, Behavior behavior, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? null : str, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? null : str2, (i3 & 8) == 0 ? i2 : 0, (i3 & 16) != 0 ? null : condition, (i3 & 32) == 0 ? behavior : null);
    }
}

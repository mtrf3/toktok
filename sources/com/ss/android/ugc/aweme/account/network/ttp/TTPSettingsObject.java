package com.ss.android.ugc.aweme.account.network.ttp;

import X.AnonymousClass391;
import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.s0;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class TTPSettingsObject {

    @InterfaceC65349Pkn("disabled")
    public final boolean disabled;

    @InterfaceC65349Pkn("domains")
    public final List<String> domains;

    @InterfaceC65349Pkn("email_send_code_paths")
    public final List<String> email_send_code_paths;

    @InterfaceC65349Pkn("exclude_email_code_type")
    public final List<Integer> exclude_email_code_type;

    @InterfaceC65349Pkn("exclude_paths")
    public final List<String> exclude_paths;

    @InterfaceC65349Pkn("exclude_sms_code_type")
    public final List<Integer> exclude_sms_code_type;

    @InterfaceC65349Pkn("max_retry_count")
    public final Integer maxRetryCount;

    @InterfaceC65349Pkn("mobile_send_code_paths")
    public final List<String> mobile_send_code_paths;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TTPSettingsObject)) {
            return false;
        }
        TTPSettingsObject tTPSettingsObject = (TTPSettingsObject) obj;
        return this.disabled == tTPSettingsObject.disabled && o.LJ(this.domains, tTPSettingsObject.domains) && o.LJ(this.mobile_send_code_paths, tTPSettingsObject.mobile_send_code_paths) && o.LJ(this.exclude_sms_code_type, tTPSettingsObject.exclude_sms_code_type) && o.LJ(this.email_send_code_paths, tTPSettingsObject.email_send_code_paths) && o.LJ(this.exclude_email_code_type, tTPSettingsObject.exclude_email_code_type) && o.LJ(this.exclude_paths, tTPSettingsObject.exclude_paths) && o.LJ(this.maxRetryCount, tTPSettingsObject.maxRetryCount);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    public final int hashCode() {
        int hashCode;
        boolean z = this.disabled;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int LIZIZ = AnonymousClass391.LIZIZ(this.exclude_paths, AnonymousClass391.LIZIZ(this.exclude_email_code_type, AnonymousClass391.LIZIZ(this.email_send_code_paths, AnonymousClass391.LIZIZ(this.exclude_sms_code_type, AnonymousClass391.LIZIZ(this.mobile_send_code_paths, AnonymousClass391.LIZIZ(this.domains, r0 * 31, 31), 31), 31), 31), 31), 31);
        Integer num = this.maxRetryCount;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return LIZIZ + hashCode;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TTPSettingsObject(disabled=");
        LIZ.append(this.disabled);
        LIZ.append(", domains=");
        LIZ.append(this.domains);
        LIZ.append(", mobile_send_code_paths=");
        LIZ.append(this.mobile_send_code_paths);
        LIZ.append(", exclude_sms_code_type=");
        LIZ.append(this.exclude_sms_code_type);
        LIZ.append(", email_send_code_paths=");
        LIZ.append(this.email_send_code_paths);
        LIZ.append(", exclude_email_code_type=");
        LIZ.append(this.exclude_email_code_type);
        LIZ.append(", exclude_paths=");
        LIZ.append(this.exclude_paths);
        LIZ.append(", maxRetryCount=");
        return s0.LIZJ(LIZ, this.maxRetryCount, ')', LIZ);
    }

    public TTPSettingsObject(boolean z, List<String> domains, List<String> mobile_send_code_paths, List<Integer> exclude_sms_code_type, List<String> email_send_code_paths, List<Integer> exclude_email_code_type, List<String> exclude_paths, Integer num) {
        o.LJIIIZ(domains, "domains");
        o.LJIIIZ(mobile_send_code_paths, "mobile_send_code_paths");
        o.LJIIIZ(exclude_sms_code_type, "exclude_sms_code_type");
        o.LJIIIZ(email_send_code_paths, "email_send_code_paths");
        o.LJIIIZ(exclude_email_code_type, "exclude_email_code_type");
        o.LJIIIZ(exclude_paths, "exclude_paths");
        this.disabled = z;
        this.domains = domains;
        this.mobile_send_code_paths = mobile_send_code_paths;
        this.exclude_sms_code_type = exclude_sms_code_type;
        this.email_send_code_paths = email_send_code_paths;
        this.exclude_email_code_type = exclude_email_code_type;
        this.exclude_paths = exclude_paths;
        this.maxRetryCount = num;
    }
}

package com.ss.android.ugc.aweme.commercialize.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class AdDislikeReasonModel implements Serializable {

    @InterfaceC65349Pkn("category_key")
    public final String key;

    @InterfaceC65349Pkn("reason_text")
    public final String reason;

    @InterfaceC65349Pkn("toast_text")
    public final String toast;

    /* JADX WARN: Multi-variable type inference failed */
    public AdDislikeReasonModel() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ AdDislikeReasonModel copy$default(AdDislikeReasonModel adDislikeReasonModel, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = adDislikeReasonModel.key;
        }
        if ((i & 2) != 0) {
            str2 = adDislikeReasonModel.reason;
        }
        if ((i & 4) != 0) {
            str3 = adDislikeReasonModel.toast;
        }
        return adDislikeReasonModel.copy(str, str2, str3);
    }

    public final AdDislikeReasonModel copy(String str, String str2, String str3) {
        return new AdDislikeReasonModel(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdDislikeReasonModel)) {
            return false;
        }
        AdDislikeReasonModel adDislikeReasonModel = (AdDislikeReasonModel) obj;
        return o.LJ(this.key, adDislikeReasonModel.key) && o.LJ(this.reason, adDislikeReasonModel.reason) && o.LJ(this.toast, adDislikeReasonModel.toast);
    }

    public int hashCode() {
        String str = this.key;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.reason;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.toast;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AdDislikeReasonModel(key=");
        LIZ.append(this.key);
        LIZ.append(", reason=");
        LIZ.append(this.reason);
        LIZ.append(", toast=");
        return q.LIZIZ(LIZ, this.toast, ')', LIZ);
    }

    public final String getKey() {
        return this.key;
    }

    public final String getReason() {
        return this.reason;
    }

    public final String getToast() {
        return this.toast;
    }

    public AdDislikeReasonModel(String str, String str2, String str3) {
        this.key = str;
        this.reason = str2;
        this.toast = str3;
    }

    public /* synthetic */ AdDislikeReasonModel(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}

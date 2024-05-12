package com.android.billingclient.api;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class PurchaseHistoryRecord {
    public final String toString() {
        return "PurchaseHistoryRecord. Json: ".concat("null");
    }

    public final int hashCode() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PurchaseHistoryRecord)) {
            return false;
        }
        obj.getClass();
        if (TextUtils.equals(null, null) && TextUtils.equals(null, null)) {
            return true;
        }
        return false;
    }
}

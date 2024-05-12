package com.appsflyer.internal;

/* loaded from: classes.dex */
public final class bm<Body> {
    public final int AFInAppEventParameterName;
    public final boolean AFInAppEventType;
    public final Body AFKeystoreWrapper;

    public final int hashCode() {
        int i;
        Body body = this.AFKeystoreWrapper;
        if (body != null) {
            i = body.hashCode();
        } else {
            i = 0;
        }
        return (((i * 31) + this.AFInAppEventParameterName) * 31) + (this.AFInAppEventType ? 1 : 0);
    }

    public final String toString() {
        return "Response{body=" + this.AFKeystoreWrapper + ", statusCode=" + this.AFInAppEventParameterName + ", isSuccessful=" + this.AFInAppEventType + '}';
    }

    public final boolean valueOf() {
        return this.AFInAppEventType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && bm.class == obj.getClass()) {
            bm bmVar = (bm) obj;
            if (this.AFInAppEventParameterName != bmVar.AFInAppEventParameterName || this.AFInAppEventType != bmVar.AFInAppEventType) {
                return false;
            }
            Body body = this.AFKeystoreWrapper;
            Body body2 = bmVar.AFKeystoreWrapper;
            if (body != null) {
                return body.equals(body2);
            }
            if (body2 == null) {
                return true;
            }
        }
        return false;
    }

    public bm(Body body, int i, boolean z) {
        this.AFKeystoreWrapper = body;
        this.AFInAppEventParameterName = i;
        this.AFInAppEventType = z;
    }
}

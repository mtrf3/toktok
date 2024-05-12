package com.bytedance.android.livesdk.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import defpackage.t1;

/* loaded from: classes6.dex */
public final class AttrResponseParams extends F9E {

    @InterfaceC65349Pkn("data")
    public UserAttrResponse data;

    @InterfaceC65349Pkn("extra")
    public Extra extra;

    /* loaded from: classes6.dex */
    public static final class Extra {
        public final String toString() {
            return t1.LIZIZ(0, 2, "Extra{", '}');
        }
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        UserAttrResponse userAttrResponse = this.data;
        Extra extra = this.extra;
        return new Object[]{userAttrResponse, userAttrResponse, extra, extra};
    }
}

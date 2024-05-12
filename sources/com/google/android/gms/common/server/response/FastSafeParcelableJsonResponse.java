package com.google.android.gms.common.server.response;

import X.C64363PNv;
import X.QH7;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;

/* loaded from: classes12.dex */
public abstract class FastSafeParcelableJsonResponse extends FastJsonResponse implements SafeParcelable {
    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public Object LJ() {
        return null;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public boolean LJII() {
        return false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int hashCode() {
        int i = 0;
        for (FastJsonResponse.Field<?, ?> field : LIZIZ().values()) {
            if (LJI(field)) {
                Object LIZLLL = LIZLLL(field);
                QH7.LJIIIIZZ(LIZLLL);
                i = (i * 31) + LIZLLL.hashCode();
            }
        }
        return i;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!getClass().isInstance(obj)) {
            return false;
        }
        FastJsonResponse fastJsonResponse = (FastJsonResponse) obj;
        for (FastJsonResponse.Field<?, ?> field : LIZIZ().values()) {
            if (LJI(field)) {
                if (!fastJsonResponse.LJI(field) || !C64363PNv.LIZ(LIZLLL(field), fastJsonResponse.LIZLLL(field))) {
                    return false;
                }
            } else if (fastJsonResponse.LJI(field)) {
                return false;
            }
        }
        return true;
    }
}

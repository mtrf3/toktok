package com.google.firebase.messaging;

import X.C16880lQ;
import X.C1HQ;
import X.C67297Qb7;
import X.C67300QbA;
import X.C79057V0z;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Map;

/* loaded from: classes12.dex */
public final class RemoteMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RemoteMessage> CREATOR = new C67300QbA();
    public final Bundle LJLIL;
    public Map<String, String> data;
    public C67297Qb7 notification;

    public final Map<String, String> LJJJJL() {
        if (this.data == null) {
            Bundle bundle = this.LJLIL;
            C1HQ c1hq = new C1HQ();
            for (String str : bundle.keySet()) {
                Object LLJJIII = C16880lQ.LLJJIII(bundle, str);
                if ((LLJJIII instanceof String) && !str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                    c1hq.put(str, LLJJIII);
                }
            }
            this.data = c1hq;
        }
        return this.data;
    }

    public RemoteMessage(Bundle bundle) {
        this.LJLIL = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJLI(parcel, 2, this.LJLIL);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }
}

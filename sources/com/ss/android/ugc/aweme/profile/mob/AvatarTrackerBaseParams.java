package com.ss.android.ugc.aweme.profile.mob;

import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class AvatarTrackerBaseParams implements Serializable {

    @InterfaceC65349Pkn("avatar_upload_track_param")
    public final HashMap<String, String> params;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AvatarTrackerBaseParams copy$default(AvatarTrackerBaseParams avatarTrackerBaseParams, HashMap hashMap, int i, Object obj) {
        if ((i & 1) != 0) {
            hashMap = avatarTrackerBaseParams.params;
        }
        return avatarTrackerBaseParams.copy(hashMap);
    }

    public final AvatarTrackerBaseParams copy(HashMap<String, String> hashMap) {
        return new AvatarTrackerBaseParams(hashMap);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AvatarTrackerBaseParams) && o.LJ(this.params, ((AvatarTrackerBaseParams) obj).params);
    }

    public int hashCode() {
        HashMap<String, String> hashMap = this.params;
        if (hashMap == null) {
            return 0;
        }
        return hashMap.hashCode();
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AvatarTrackerBaseParams(params=");
        LIZ.append(this.params);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final HashMap<String, String> getParams() {
        return this.params;
    }

    public AvatarTrackerBaseParams(HashMap<String, String> hashMap) {
        this.params = hashMap;
    }
}

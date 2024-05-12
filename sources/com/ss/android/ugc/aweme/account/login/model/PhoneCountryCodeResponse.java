package com.ss.android.ugc.aweme.account.login.model;

import X.X1D;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class PhoneCountryCodeResponse {
    public final HashMap<String, List<PhoneCountryData>> map;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PhoneCountryCodeResponse copy$default(PhoneCountryCodeResponse phoneCountryCodeResponse, HashMap hashMap, int i, Object obj) {
        if ((i & 1) != 0) {
            hashMap = phoneCountryCodeResponse.map;
        }
        return phoneCountryCodeResponse.copy(hashMap);
    }

    public final PhoneCountryCodeResponse copy(HashMap<String, List<PhoneCountryData>> hashMap) {
        return new PhoneCountryCodeResponse(hashMap);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PhoneCountryCodeResponse) && o.LJ(this.map, ((PhoneCountryCodeResponse) obj).map);
    }

    public int hashCode() {
        HashMap<String, List<PhoneCountryData>> hashMap = this.map;
        if (hashMap == null) {
            return 0;
        }
        return hashMap.hashCode();
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PhoneCountryCodeResponse(map=");
        LIZ.append(this.map);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final HashMap<String, List<PhoneCountryData>> getMap() {
        return this.map;
    }

    public PhoneCountryCodeResponse(HashMap<String, List<PhoneCountryData>> hashMap) {
        this.map = hashMap;
    }
}

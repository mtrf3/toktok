package com.ss.android.ugc.tiktok.tpsc.model;

import X.C15890jp;
import X.InterfaceC65349Pkn;
import X.SPZ;
import X.X1D;
import java.io.Serializable;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class PrivacySettingsRestriction implements Serializable {
    public static final SPZ Companion = new SPZ();

    @InterfaceC65349Pkn("account")
    public final Map<String, PrivacySettingsRestrictionItem> account;

    @InterfaceC65349Pkn("video")
    public final Map<String, PrivacySettingsRestrictionItem> videoPrivacy;

    /* JADX WARN: Multi-variable type inference failed */
    public PrivacySettingsRestriction() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PrivacySettingsRestriction copy$default(PrivacySettingsRestriction privacySettingsRestriction, Map map, Map map2, int i, Object obj) {
        if ((i & 1) != 0) {
            map = privacySettingsRestriction.account;
        }
        if ((i & 2) != 0) {
            map2 = privacySettingsRestriction.videoPrivacy;
        }
        return privacySettingsRestriction.copy(map, map2);
    }

    public final PrivacySettingsRestriction copy(Map<String, PrivacySettingsRestrictionItem> map, Map<String, PrivacySettingsRestrictionItem> map2) {
        return new PrivacySettingsRestriction(map, map2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrivacySettingsRestriction)) {
            return false;
        }
        PrivacySettingsRestriction privacySettingsRestriction = (PrivacySettingsRestriction) obj;
        return o.LJ(this.account, privacySettingsRestriction.account) && o.LJ(this.videoPrivacy, privacySettingsRestriction.videoPrivacy);
    }

    public int hashCode() {
        Map<String, PrivacySettingsRestrictionItem> map = this.account;
        int hashCode = (map == null ? 0 : map.hashCode()) * 31;
        Map<String, PrivacySettingsRestrictionItem> map2 = this.videoPrivacy;
        return hashCode + (map2 != null ? map2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PrivacySettingsRestriction(account=");
        LIZ.append(this.account);
        LIZ.append(", videoPrivacy=");
        return C15890jp.LIZ(LIZ, this.videoPrivacy, ')', LIZ);
    }

    public final Map<String, PrivacySettingsRestrictionItem> getAccount() {
        return this.account;
    }

    public final Map<String, PrivacySettingsRestrictionItem> getVideoPrivacy() {
        return this.videoPrivacy;
    }

    public PrivacySettingsRestriction(Map<String, PrivacySettingsRestrictionItem> map, Map<String, PrivacySettingsRestrictionItem> map2) {
        this.account = map;
        this.videoPrivacy = map2;
    }

    public /* synthetic */ PrivacySettingsRestriction(Map map, Map map2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : map, (i & 2) != 0 ? null : map2);
    }
}

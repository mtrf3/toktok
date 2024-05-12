package com.ss.android.ugc.aweme.music.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class NewReleaseAnchorExtra {
    public static final Companion Companion = new Companion();

    @InterfaceC65349Pkn("anchor_type")
    public final String anchorType;

    @InterfaceC65349Pkn("resso_track_id")
    public final String ressoTrackId;

    @InterfaceC65349Pkn("store")
    public final TTMStoreLink store;

    @InterfaceC65349Pkn("subtitle")
    public final String subTitle;

    @InterfaceC65349Pkn("ttm_track_id")
    public final String ttmTrackId;

    /* JADX WARN: Multi-variable type inference failed */
    public NewReleaseAnchorExtra() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ NewReleaseAnchorExtra copy$default(NewReleaseAnchorExtra newReleaseAnchorExtra, String str, String str2, String str3, String str4, TTMStoreLink tTMStoreLink, int i, Object obj) {
        if ((i & 1) != 0) {
            str = newReleaseAnchorExtra.anchorType;
        }
        if ((i & 2) != 0) {
            str2 = newReleaseAnchorExtra.subTitle;
        }
        if ((i & 4) != 0) {
            str3 = newReleaseAnchorExtra.ressoTrackId;
        }
        if ((i & 8) != 0) {
            str4 = newReleaseAnchorExtra.ttmTrackId;
        }
        if ((i & 16) != 0) {
            tTMStoreLink = newReleaseAnchorExtra.store;
        }
        return newReleaseAnchorExtra.copy(str, str2, str3, str4, tTMStoreLink);
    }

    public final NewReleaseAnchorExtra copy(String str, String str2, String str3, String str4, TTMStoreLink tTMStoreLink) {
        return new NewReleaseAnchorExtra(str, str2, str3, str4, tTMStoreLink);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewReleaseAnchorExtra)) {
            return false;
        }
        NewReleaseAnchorExtra newReleaseAnchorExtra = (NewReleaseAnchorExtra) obj;
        return o.LJ(this.anchorType, newReleaseAnchorExtra.anchorType) && o.LJ(this.subTitle, newReleaseAnchorExtra.subTitle) && o.LJ(this.ressoTrackId, newReleaseAnchorExtra.ressoTrackId) && o.LJ(this.ttmTrackId, newReleaseAnchorExtra.ttmTrackId) && o.LJ(this.store, newReleaseAnchorExtra.store);
    }

    public int hashCode() {
        String str = this.anchorType;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.subTitle;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.ressoTrackId;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.ttmTrackId;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        TTMStoreLink tTMStoreLink = this.store;
        return hashCode4 + (tTMStoreLink != null ? tTMStoreLink.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NewReleaseAnchorExtra(anchorType=");
        LIZ.append(this.anchorType);
        LIZ.append(", subTitle=");
        LIZ.append(this.subTitle);
        LIZ.append(", ressoTrackId=");
        LIZ.append(this.ressoTrackId);
        LIZ.append(", ttmTrackId=");
        LIZ.append(this.ttmTrackId);
        LIZ.append(", store=");
        LIZ.append(this.store);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    private final boolean isTtmNewRelease() {
        return o.LJ(this.anchorType, "ttm_new_release");
    }

    private final boolean isTtmPreRelease() {
        return o.LJ(this.anchorType, "ttm_pre_save");
    }

    public final boolean isNewRelease() {
        return isTtmNewRelease();
    }

    public final boolean isPreRelease() {
        return isTtmPreRelease();
    }

    public final boolean isTtm() {
        if (isTtmNewRelease() || isTtmPreRelease()) {
            return true;
        }
        return false;
    }

    /* loaded from: classes13.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public NewReleaseAnchorExtra(String str, String str2, String str3, String str4, TTMStoreLink tTMStoreLink) {
        this.anchorType = str;
        this.subTitle = str2;
        this.ressoTrackId = str3;
        this.ttmTrackId = str4;
        this.store = tTMStoreLink;
    }

    public /* synthetic */ NewReleaseAnchorExtra(String str, String str2, String str3, String str4, TTMStoreLink tTMStoreLink, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) == 0 ? str4 : "", (i & 16) != 0 ? null : tTMStoreLink);
    }
}

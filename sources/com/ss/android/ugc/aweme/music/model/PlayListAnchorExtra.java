package com.ss.android.ugc.aweme.music.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class PlayListAnchorExtra {
    public static final Companion Companion = new Companion();

    @InterfaceC65349Pkn("store")
    public final TTMStoreLink store;

    @InterfaceC65349Pkn("subtype")
    public final String subType;

    public static /* synthetic */ PlayListAnchorExtra copy$default(PlayListAnchorExtra playListAnchorExtra, String str, TTMStoreLink tTMStoreLink, int i, Object obj) {
        if ((i & 1) != 0) {
            str = playListAnchorExtra.subType;
        }
        if ((i & 2) != 0) {
            tTMStoreLink = playListAnchorExtra.store;
        }
        return playListAnchorExtra.copy(str, tTMStoreLink);
    }

    public final PlayListAnchorExtra copy(String subType, TTMStoreLink tTMStoreLink) {
        o.LJIIIZ(subType, "subType");
        return new PlayListAnchorExtra(subType, tTMStoreLink);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlayListAnchorExtra)) {
            return false;
        }
        PlayListAnchorExtra playListAnchorExtra = (PlayListAnchorExtra) obj;
        return o.LJ(this.subType, playListAnchorExtra.subType) && o.LJ(this.store, playListAnchorExtra.store);
    }

    public int hashCode() {
        int hashCode = this.subType.hashCode() * 31;
        TTMStoreLink tTMStoreLink = this.store;
        return hashCode + (tTMStoreLink == null ? 0 : tTMStoreLink.hashCode());
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PlayListAnchorExtra(subType=");
        LIZ.append(this.subType);
        LIZ.append(", store=");
        LIZ.append(this.store);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final boolean isTTM() {
        return o.LJ(this.subType, "ttm_playlist");
    }

    /* loaded from: classes13.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public PlayListAnchorExtra(String subType, TTMStoreLink tTMStoreLink) {
        o.LJIIIZ(subType, "subType");
        this.subType = subType;
        this.store = tTMStoreLink;
    }

    public /* synthetic */ PlayListAnchorExtra(String str, TTMStoreLink tTMStoreLink, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : tTMStoreLink);
    }
}

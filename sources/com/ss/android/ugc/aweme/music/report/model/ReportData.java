package com.ss.android.ugc.aweme.music.report.model;

import X.InterfaceC65349Pkn;
import X.WM7;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class ReportData {

    @InterfaceC65349Pkn("action_type")
    public final int actionType;

    @InterfaceC65349Pkn("extra")
    public final ExtraData extraParams;

    @InterfaceC65349Pkn("item_id")
    public final String itemId;

    @InterfaceC65349Pkn("matched_song_id")
    public final String matchedSongId;

    @InterfaceC65349Pkn("music_id")
    public final String musicId;

    @InterfaceC65349Pkn(WM7.SCENE_SERVICE)
    public final int scene;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReportData)) {
            return false;
        }
        ReportData reportData = (ReportData) obj;
        return this.actionType == reportData.actionType && this.scene == reportData.scene && o.LJ(this.itemId, reportData.itemId) && o.LJ(this.musicId, reportData.musicId) && o.LJ(this.matchedSongId, reportData.matchedSongId) && o.LJ(this.extraParams, reportData.extraParams);
    }

    public final int hashCode() {
        int i = ((this.actionType * 31) + this.scene) * 31;
        String str = this.itemId;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.musicId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.matchedSongId;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ExtraData extraData = this.extraParams;
        return hashCode3 + (extraData != null ? extraData.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ReportData(actionType=");
        LIZ.append(this.actionType);
        LIZ.append(", scene=");
        LIZ.append(this.scene);
        LIZ.append(", itemId=");
        LIZ.append(this.itemId);
        LIZ.append(", musicId=");
        LIZ.append(this.musicId);
        LIZ.append(", matchedSongId=");
        LIZ.append(this.matchedSongId);
        LIZ.append(", extraParams=");
        LIZ.append(this.extraParams);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public ReportData(int i, int i2, String str, String str2, String str3, ExtraData extraData) {
        this.actionType = i;
        this.scene = i2;
        this.itemId = str;
        this.musicId = str2;
        this.matchedSongId = str3;
        this.extraParams = extraData;
    }

    public /* synthetic */ ReportData(int i, int i2, String str, String str2, String str3, ExtraData extraData, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, (i3 & 4) != 0 ? null : str, (i3 & 8) != 0 ? null : str2, (i3 & 16) != 0 ? null : str3, (i3 & 32) == 0 ? extraData : null);
    }
}

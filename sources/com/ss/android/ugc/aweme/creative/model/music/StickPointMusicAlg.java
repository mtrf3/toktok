package com.ss.android.ugc.aweme.creative.model.music;

import X.C45772Hxo;
import X.C45773Hxp;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class StickPointMusicAlg implements Serializable, Parcelable {
    public static int BEATES_FILE_DEFAULT;

    @InterfaceC65349Pkn("alg_type")
    public int algType = BEATES_FILE_DEFAULT;

    @InterfaceC65349Pkn("defaultlocal_path")
    public String defaultLocalPath;

    @InterfaceC65349Pkn("defaultlocal_url")
    public String defaultLocalUrl;

    @InterfaceC65349Pkn("downbeats_path")
    public String downBeatsPath;

    @InterfaceC65349Pkn("downbeats_url")
    public String downBeatsUrl;

    @InterfaceC65349Pkn("manmodebeats_path")
    public String manModeBeatsPath;

    @InterfaceC65349Pkn("manmodebeats_url")
    public String manModeBeatsUrl;

    @InterfaceC65349Pkn("max_seg")
    public int maxSeg;

    @InterfaceC65349Pkn("min_seg")
    public int minSeg;

    @InterfaceC65349Pkn("music_id")
    public String musicId;

    @InterfaceC65349Pkn("nostrengthbeats_path")
    public String noStrengthBeatsPath;

    @InterfaceC65349Pkn("nostrengthbeats_url")
    public String noStrengthBeatsUrl;

    @InterfaceC65349Pkn("vebeats_path")
    public String veBeatsPath;

    @InterfaceC65349Pkn("vebeats_url")
    public String veBeatsUrl;
    public static final C45773Hxp Companion = new C45773Hxp();
    public static final Parcelable.Creator<StickPointMusicAlg> CREATOR = new C45772Hxo();
    public static int BEATES_FILE_SERVER_C = 1;
    public static int BEATES_FILE_BEATS_A0 = 2;
    public static int BEATES_FILE_CUSTOM = 3;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(1);
    }

    public final int getAlgType() {
        return this.algType;
    }

    public final String getDefaultLocalPath() {
        return this.defaultLocalPath;
    }

    public final String getDefaultLocalUrl() {
        return this.defaultLocalUrl;
    }

    public final String getDownBeatsPath() {
        return this.downBeatsPath;
    }

    public final String getDownBeatsUrl() {
        return this.downBeatsUrl;
    }

    public final String getManModeBeatsPath() {
        return this.manModeBeatsPath;
    }

    public final String getManModeBeatsUrl() {
        return this.manModeBeatsUrl;
    }

    public final int getMaxSeg() {
        return this.maxSeg;
    }

    public final int getMinSeg() {
        return this.minSeg;
    }

    public final String getMusicId() {
        return this.musicId;
    }

    public final String getNoStrengthBeatsPath() {
        return this.noStrengthBeatsPath;
    }

    public final String getNoStrengthBeatsUrl() {
        return this.noStrengthBeatsUrl;
    }

    public final String getVeBeatsPath() {
        return this.veBeatsPath;
    }

    public final String getVeBeatsUrl() {
        return this.veBeatsUrl;
    }

    public final void setAlgType(int i) {
        this.algType = i;
    }

    public final void setDefaultLocalPath(String str) {
        this.defaultLocalPath = str;
    }

    public final void setDefaultLocalUrl(String str) {
        this.defaultLocalUrl = str;
    }

    public final void setDownBeatsPath(String str) {
        this.downBeatsPath = str;
    }

    public final void setDownBeatsUrl(String str) {
        this.downBeatsUrl = str;
    }

    public final void setManModeBeatsPath(String str) {
        this.manModeBeatsPath = str;
    }

    public final void setManModeBeatsUrl(String str) {
        this.manModeBeatsUrl = str;
    }

    public final void setMaxSeg(int i) {
        this.maxSeg = i;
    }

    public final void setMinSeg(int i) {
        this.minSeg = i;
    }

    public final void setMusicId(String str) {
        this.musicId = str;
    }

    public final void setNoStrengthBeatsPath(String str) {
        this.noStrengthBeatsPath = str;
    }

    public final void setNoStrengthBeatsUrl(String str) {
        this.noStrengthBeatsUrl = str;
    }

    public final void setVeBeatsPath(String str) {
        this.veBeatsPath = str;
    }

    public final void setVeBeatsUrl(String str) {
        this.veBeatsUrl = str;
    }
}

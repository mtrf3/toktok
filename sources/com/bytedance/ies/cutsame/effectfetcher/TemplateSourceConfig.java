package com.bytedance.ies.cutsame.effectfetcher;

import X.C45247HpL;
import X.C45249HpN;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class TemplateSourceConfig implements Parcelable {
    public final String ac;
    public final String accessKey;
    public final String appID;
    public final String appLanguage;
    public final String appVersion;
    public final String artistCacheDir;
    public final String artistHost;
    public final String deviceId;
    public final String effectCacheDir;
    public final String effectHost;
    public final String effectModelCacheDir;
    public final String effectSdkVersion;
    public final String imuseCacheDir;
    public final String imuseHost;
    public final boolean isEpRequest;
    public final String materialResourceAccessKey;
    public final String materialResourceAppId;
    public final String materialResourceAppName;
    public final String materialResourceAppVersion;
    public final String materialResourceCache;
    public final String materialResourceHost;
    public final int materialResourceStatus;
    public final String materialResourceTag;
    public final String mediaCacheDir;
    public final String musicCacheDir;
    public final String musicHost;
    public final String region;
    public final String templateCacheDir;
    public final String uid;
    public static final C45249HpN Companion = new C45249HpN();
    public static final Parcelable.Creator<TemplateSourceConfig> CREATOR = new C45247HpL();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.appID);
        out.writeString(this.appVersion);
        out.writeString(this.accessKey);
        out.writeString(this.deviceId);
        out.writeString(this.region);
        out.writeString(this.appLanguage);
        out.writeString(this.templateCacheDir);
        out.writeString(this.mediaCacheDir);
        out.writeString(this.effectSdkVersion);
        out.writeString(this.effectHost);
        out.writeString(this.effectCacheDir);
        out.writeString(this.effectModelCacheDir);
        out.writeString(this.imuseHost);
        out.writeString(this.imuseCacheDir);
        out.writeString(this.artistHost);
        out.writeString(this.artistCacheDir);
        out.writeString(this.musicHost);
        out.writeString(this.musicCacheDir);
        out.writeInt(this.isEpRequest ? 1 : 0);
        out.writeString(this.materialResourceAccessKey);
        out.writeString(this.materialResourceAppId);
        out.writeString(this.materialResourceAppVersion);
        out.writeString(this.materialResourceAppName);
        out.writeString(this.ac);
        out.writeString(this.uid);
        out.writeInt(this.materialResourceStatus);
        out.writeString(this.materialResourceTag);
        out.writeString(this.materialResourceHost);
        out.writeString(this.materialResourceCache);
    }

    public TemplateSourceConfig(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, boolean z, String str19, String str20, String str21, String str22, String str23, String str24, int i, String str25, String str26, String str27) {
        this.appID = str;
        this.appVersion = str2;
        this.accessKey = str3;
        this.deviceId = str4;
        this.region = str5;
        this.appLanguage = str6;
        this.templateCacheDir = str7;
        this.mediaCacheDir = str8;
        this.effectSdkVersion = str9;
        this.effectHost = str10;
        this.effectCacheDir = str11;
        this.effectModelCacheDir = str12;
        this.imuseHost = str13;
        this.imuseCacheDir = str14;
        this.artistHost = str15;
        this.artistCacheDir = str16;
        this.musicHost = str17;
        this.musicCacheDir = str18;
        this.isEpRequest = z;
        this.materialResourceAccessKey = str19;
        this.materialResourceAppId = str20;
        this.materialResourceAppVersion = str21;
        this.materialResourceAppName = str22;
        this.ac = str23;
        this.uid = str24;
        this.materialResourceStatus = i;
        this.materialResourceTag = str25;
        this.materialResourceHost = str26;
        this.materialResourceCache = str27;
    }
}

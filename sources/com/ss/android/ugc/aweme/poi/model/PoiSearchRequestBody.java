package com.ss.android.ugc.aweme.poi.model;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes12.dex */
public class PoiSearchRequestBody {

    @InterfaceC65349Pkn("ab_params")
    public final String abParams;

    @InterfaceC65349Pkn("appid")
    public final int appId;

    @InterfaceC65349Pkn("appversion")
    public final String appVersion;

    @InterfaceC65349Pkn("aweme_id")
    public final String awemeId;

    @InterfaceC65349Pkn("device")
    public final int device;

    @InterfaceC65349Pkn("did")
    public final String did;

    @InterfaceC65349Pkn("enc_data")
    public final String encData;

    @InterfaceC65349Pkn("enter_from")
    public final String enterFrom;

    @InterfaceC65349Pkn("language")
    public final String language;

    @InterfaceC65349Pkn("location_allowed")
    public final int locationAllowed;

    @InterfaceC65349Pkn("location_installed")
    public final int locationInstalled;

    @InterfaceC65349Pkn("location_precise")
    public final int locationPrecise;

    @InterfaceC65349Pkn("offset")
    public final long offset;

    @InterfaceC65349Pkn("page")
    public final long page;

    @InterfaceC65349Pkn("radius")
    public final long radius;

    @InterfaceC65349Pkn("region")
    public final String region;

    @InterfaceC65349Pkn("scenario")
    public final String scenario;

    @InterfaceC65349Pkn("sdkversion")
    public final String sdkVersion;

    @InterfaceC65349Pkn("session_id")
    public final Long sessionId;

    @InterfaceC65349Pkn("timestamp")
    public final long timeStamp;

    public PoiSearchRequestBody(String str, String str2, String str3, long j, long j2, long j3, int i, int i2, String str4, String str5, String str6, long j4, int i3, int i4, int i5, String str7, String str8, Long l, String str9, String str10) {
        this.region = str;
        this.language = str2;
        this.scenario = str3;
        this.radius = j;
        this.offset = j2;
        this.page = j3;
        this.device = i;
        this.appId = i2;
        this.did = str4;
        this.appVersion = str5;
        this.sdkVersion = str6;
        this.timeStamp = j4;
        this.locationAllowed = i3;
        this.locationInstalled = i4;
        this.locationPrecise = i5;
        this.abParams = str7;
        this.encData = str8;
        this.sessionId = l;
        this.awemeId = str9;
        this.enterFrom = str10;
    }

    public /* synthetic */ PoiSearchRequestBody(String str, String str2, String str3, long j, long j2, long j3, int i, int i2, String str4, String str5, String str6, long j4, int i3, int i4, int i5, String str7, String str8, Long l, String str9, String str10, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? null : str, (i6 & 2) != 0 ? null : str2, str3, j, j2, j3, i, i2, (i6 & 256) != 0 ? null : str4, (i6 & 512) != 0 ? null : str5, (i6 & 1024) != 0 ? null : str6, j4, i3, i4, i5, (32768 & i6) != 0 ? null : str7, (65536 & i6) != 0 ? null : str8, (131072 & i6) != 0 ? null : l, (262144 & i6) != 0 ? null : str9, (i6 & 524288) == 0 ? str10 : null);
    }
}

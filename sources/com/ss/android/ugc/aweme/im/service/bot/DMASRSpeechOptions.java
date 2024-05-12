package com.ss.android.ugc.aweme.im.service.bot;

import X.C47261Igj;
import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class DMASRSpeechOptions extends F9E implements Serializable {

    @InterfaceC65349Pkn("address")
    public final String address;

    @InterfaceC65349Pkn("app_id")
    public final String appId;

    @InterfaceC65349Pkn("cluster")
    public final String cluster;

    @InterfaceC65349Pkn("connect_time_out")
    public final int connectTimeOut;

    @InterfaceC65349Pkn("lang")
    public final List<String> language;

    @InterfaceC65349Pkn("receive_time_out")
    public final int receiveTimeOut;

    @InterfaceC65349Pkn("total_time_out")
    public final long totalTimeOut;

    @InterfaceC65349Pkn("uri")
    public final String uri;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public DMASRSpeechOptions() {
        /*
            r12 = this;
            r1 = 0
            r6 = 0
            r8 = 0
            r10 = 255(0xff, float:3.57E-43)
            r0 = r12
            r2 = r1
            r3 = r1
            r4 = r1
            r5 = r1
            r9 = r8
            r11 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.service.bot.DMASRSpeechOptions.<init>():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DMASRSpeechOptions copy$default(DMASRSpeechOptions dMASRSpeechOptions, String str, String str2, String str3, String str4, List list, long j, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = dMASRSpeechOptions.address;
        }
        if ((i3 & 2) != 0) {
            str2 = dMASRSpeechOptions.uri;
        }
        if ((i3 & 4) != 0) {
            str3 = dMASRSpeechOptions.cluster;
        }
        if ((i3 & 8) != 0) {
            str4 = dMASRSpeechOptions.appId;
        }
        if ((i3 & 16) != 0) {
            list = dMASRSpeechOptions.language;
        }
        if ((i3 & 32) != 0) {
            j = dMASRSpeechOptions.totalTimeOut;
        }
        if ((i3 & 64) != 0) {
            i = dMASRSpeechOptions.connectTimeOut;
        }
        if ((i3 & 128) != 0) {
            i2 = dMASRSpeechOptions.receiveTimeOut;
        }
        return dMASRSpeechOptions.copy(str, str2, str3, str4, list, j, i, i2);
    }

    public final DMASRSpeechOptions copy(String address, String uri, String cluster, String appId, List<String> language, long j, int i, int i2) {
        o.LJIIIZ(address, "address");
        o.LJIIIZ(uri, "uri");
        o.LJIIIZ(cluster, "cluster");
        o.LJIIIZ(appId, "appId");
        o.LJIIIZ(language, "language");
        return new DMASRSpeechOptions(address, uri, cluster, appId, language, j, i, i2);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.address, this.uri, this.cluster, this.appId, this.language, Long.valueOf(this.totalTimeOut), Integer.valueOf(this.connectTimeOut), Integer.valueOf(this.receiveTimeOut)};
    }

    public final String getAddress() {
        return this.address;
    }

    public final String getAppId() {
        return this.appId;
    }

    public final String getCluster() {
        return this.cluster;
    }

    public final int getConnectTimeOut() {
        return this.connectTimeOut;
    }

    public final List<String> getLanguage() {
        return this.language;
    }

    public final int getReceiveTimeOut() {
        return this.receiveTimeOut;
    }

    public final long getTotalTimeOut() {
        return this.totalTimeOut;
    }

    public final String getUri() {
        return this.uri;
    }

    public DMASRSpeechOptions(String address, String uri, String cluster, String appId, List<String> language, long j, int i, int i2) {
        o.LJIIIZ(address, "address");
        o.LJIIIZ(uri, "uri");
        o.LJIIIZ(cluster, "cluster");
        o.LJIIIZ(appId, "appId");
        o.LJIIIZ(language, "language");
        this.address = address;
        this.uri = uri;
        this.cluster = cluster;
        this.appId = appId;
        this.language = language;
        this.totalTimeOut = j;
        this.connectTimeOut = i;
        this.receiveTimeOut = i2;
    }

    public /* synthetic */ DMASRSpeechOptions(String str, String str2, String str3, String str4, List list, long j, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "wss://speech.tiktokv.com" : str, (i3 & 2) != 0 ? "/api/v1/sauc" : str2, (i3 & 4) != 0 ? "vs_tt_input" : str3, (i3 & 8) != 0 ? "vs_tt_tako" : str4, (i3 & 16) != 0 ? C47261Igj.LJJIJ("fil-PH") : list, (i3 & 32) != 0 ? 5000L : j, (i3 & 64) != 0 ? 3000 : i, (i3 & 128) == 0 ? i2 : 3000);
    }
}

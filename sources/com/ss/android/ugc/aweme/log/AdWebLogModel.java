package com.ss.android.ugc.aweme.log;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes11.dex */
public final class AdWebLogModel implements Serializable {

    @InterfaceC65349Pkn("cid")
    public String cid;

    @InterfaceC65349Pkn("extra_info")
    public String extraInfo;

    @InterfaceC65349Pkn("init_time")
    public long initTime;

    @InterfaceC65349Pkn("is_ad_web_page")
    public boolean isAdWebPage;

    @InterfaceC65349Pkn("is_prerender")
    public boolean isPreRender;

    @InterfaceC65349Pkn("is_web_url")
    public int isWebUrl;

    @InterfaceC65349Pkn("ix_to_externalurl")
    public int ixToExternalurl;

    @InterfaceC65349Pkn("landing_page_style")
    public int landingPageStyle;

    @InterfaceC65349Pkn("log_extra")
    public String logExtra;

    @InterfaceC65349Pkn("preload_channel")
    public String preloadChannel;

    @InterfaceC65349Pkn("preload_h5_type")
    public int preloadH5Type;

    @InterfaceC65349Pkn("preload_scene")
    public String preloadScene;

    @InterfaceC65349Pkn("preload_web")
    public int preloadWeb;

    @InterfaceC65349Pkn("preload_web_second_page")
    public int preloadWebSecondPage;

    @InterfaceC65349Pkn("refer")
    public String refer;

    @InterfaceC65349Pkn("session_id")
    public String sessionId;

    @InterfaceC65349Pkn("web_url")
    public String webUrl;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AdWebLogModel() {
        /*
            r21 = this;
            r1 = 0
            r3 = 0
            r9 = 0
            r19 = 131071(0x1ffff, float:1.8367E-40)
            r0 = r21
            r2 = r1
            r4 = r3
            r5 = r3
            r6 = r1
            r7 = r1
            r8 = r1
            r11 = r1
            r12 = r3
            r13 = r3
            r14 = r1
            r15 = r1
            r16 = r3
            r17 = r3
            r18 = r3
            r20 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.log.AdWebLogModel.<init>():void");
    }

    public final String getCid() {
        return this.cid;
    }

    public final String getExtraInfo() {
        return this.extraInfo;
    }

    public final long getInitTime() {
        return this.initTime;
    }

    public final int getIxToExternalurl() {
        return this.ixToExternalurl;
    }

    public final int getLandingPageStyle() {
        return this.landingPageStyle;
    }

    public final String getLogExtra() {
        return this.logExtra;
    }

    public final String getPreloadChannel() {
        return this.preloadChannel;
    }

    public final int getPreloadH5Type() {
        return this.preloadH5Type;
    }

    public final String getPreloadScene() {
        return this.preloadScene;
    }

    public final int getPreloadWeb() {
        return this.preloadWeb;
    }

    public final int getPreloadWebSecondPage() {
        return this.preloadWebSecondPage;
    }

    public final String getRefer() {
        return this.refer;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final String getWebUrl() {
        return this.webUrl;
    }

    public final boolean isAdWebPage() {
        return this.isAdWebPage;
    }

    public final boolean isPreRender() {
        return this.isPreRender;
    }

    public final int isWebUrl() {
        return this.isWebUrl;
    }

    public final void setAdWebPage(boolean z) {
        this.isAdWebPage = z;
    }

    public final void setCid(String str) {
        this.cid = str;
    }

    public final void setExtraInfo(String str) {
        this.extraInfo = str;
    }

    public final void setInitTime(long j) {
        this.initTime = j;
    }

    public final void setIxToExternalurl(int i) {
        this.ixToExternalurl = i;
    }

    public final void setLandingPageStyle(int i) {
        this.landingPageStyle = i;
    }

    public final void setLogExtra(String str) {
        this.logExtra = str;
    }

    public final void setPreRender(boolean z) {
        this.isPreRender = z;
    }

    public final void setPreloadChannel(String str) {
        this.preloadChannel = str;
    }

    public final void setPreloadH5Type(int i) {
        this.preloadH5Type = i;
    }

    public final void setPreloadScene(String str) {
        this.preloadScene = str;
    }

    public final void setPreloadWeb(int i) {
        this.preloadWeb = i;
    }

    public final void setPreloadWebSecondPage(int i) {
        this.preloadWebSecondPage = i;
    }

    public final void setRefer(String str) {
        this.refer = str;
    }

    public final void setSessionId(String str) {
        this.sessionId = str;
    }

    public final void setWebUrl(int i) {
        this.isWebUrl = i;
    }

    public final void setWebUrl(String str) {
        this.webUrl = str;
    }

    public AdWebLogModel(String str, String str2, int i, int i2, int i3, String str3, String str4, String str5, long j, String str6, int i4, int i5, String str7, String str8, boolean z, int i6, boolean z2) {
        this.cid = str;
        this.logExtra = str2;
        this.landingPageStyle = i;
        this.isWebUrl = i2;
        this.ixToExternalurl = i3;
        this.webUrl = str3;
        this.refer = str4;
        this.sessionId = str5;
        this.initTime = j;
        this.extraInfo = str6;
        this.preloadWeb = i4;
        this.preloadWebSecondPage = i5;
        this.preloadChannel = str7;
        this.preloadScene = str8;
        this.isPreRender = z;
        this.preloadH5Type = i6;
        this.isAdWebPage = z2;
    }

    public /* synthetic */ AdWebLogModel(String str, String str2, int i, int i2, int i3, String str3, String str4, String str5, long j, String str6, int i4, int i5, String str7, String str8, boolean z, int i6, boolean z2, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? null : str2, (i7 & 4) != 0 ? 0 : i, (i7 & 8) != 0 ? 0 : i2, (i7 & 16) != 0 ? 0 : i3, (i7 & 32) != 0 ? null : str3, (i7 & 64) != 0 ? null : str4, (i7 & 128) != 0 ? null : str5, (i7 & 256) != 0 ? System.currentTimeMillis() : j, (i7 & 512) != 0 ? "" : str6, (i7 & 1024) != 0 ? 0 : i4, (i7 & 2048) != 0 ? 0 : i5, (i7 & 4096) != 0 ? null : str7, (i7 & FileUtils.BUFFER_SIZE) != 0 ? null : str8, (i7 & 16384) != 0 ? false : z, (32768 & i7) != 0 ? 0 : i6, (i7 & 65536) != 0 ? false : z2);
    }
}

package com.ss.android.ugc.aweme.feed.model;

import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class BrowserConfig implements Serializable {

    @InterfaceC65349Pkn("act_internal_time")
    public final Long actInternalTime;

    @InterfaceC65349Pkn("click_id")
    public final String clickId;

    @InterfaceC65349Pkn("enable_replace_web_url")
    public final Integer enableReplaceWebUrl;

    @InterfaceC65349Pkn("target_url_prefix")
    public final String targetUrlPrefix;

    @InterfaceC65349Pkn("use_android_custom_tab")
    public final Integer useAndroidCustomTab;

    /* JADX WARN: Multi-variable type inference failed */
    public BrowserConfig() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ BrowserConfig copy$default(BrowserConfig browserConfig, Integer num, Integer num2, String str, String str2, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            num = browserConfig.useAndroidCustomTab;
        }
        if ((i & 2) != 0) {
            num2 = browserConfig.enableReplaceWebUrl;
        }
        if ((i & 4) != 0) {
            str = browserConfig.targetUrlPrefix;
        }
        if ((i & 8) != 0) {
            str2 = browserConfig.clickId;
        }
        if ((i & 16) != 0) {
            l = browserConfig.actInternalTime;
        }
        return browserConfig.copy(num, num2, str, str2, l);
    }

    public final BrowserConfig copy(Integer num, Integer num2, String str, String str2, Long l) {
        return new BrowserConfig(num, num2, str, str2, l);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BrowserConfig)) {
            return false;
        }
        BrowserConfig browserConfig = (BrowserConfig) obj;
        return o.LJ(this.useAndroidCustomTab, browserConfig.useAndroidCustomTab) && o.LJ(this.enableReplaceWebUrl, browserConfig.enableReplaceWebUrl) && o.LJ(this.targetUrlPrefix, browserConfig.targetUrlPrefix) && o.LJ(this.clickId, browserConfig.clickId) && o.LJ(this.actInternalTime, browserConfig.actInternalTime);
    }

    public int hashCode() {
        Integer num = this.useAndroidCustomTab;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.enableReplaceWebUrl;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.targetUrlPrefix;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.clickId;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.actInternalTime;
        return hashCode4 + (l != null ? l.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BrowserConfig(useAndroidCustomTab=");
        LIZ.append(this.useAndroidCustomTab);
        LIZ.append(", enableReplaceWebUrl=");
        LIZ.append(this.enableReplaceWebUrl);
        LIZ.append(", targetUrlPrefix=");
        LIZ.append(this.targetUrlPrefix);
        LIZ.append(", clickId=");
        LIZ.append(this.clickId);
        LIZ.append(", actInternalTime=");
        return JBR.LJ(LIZ, this.actInternalTime, ')', LIZ);
    }

    public final Long getActInternalTime() {
        return this.actInternalTime;
    }

    public final String getClickId() {
        return this.clickId;
    }

    public final Integer getEnableReplaceWebUrl() {
        return this.enableReplaceWebUrl;
    }

    public final String getTargetUrlPrefix() {
        return this.targetUrlPrefix;
    }

    public final Integer getUseAndroidCustomTab() {
        return this.useAndroidCustomTab;
    }

    public BrowserConfig(Integer num, Integer num2, String str, String str2, Long l) {
        this.useAndroidCustomTab = num;
        this.enableReplaceWebUrl = num2;
        this.targetUrlPrefix = str;
        this.clickId = str2;
        this.actInternalTime = l;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ BrowserConfig(java.lang.Integer r8, java.lang.Integer r9, java.lang.String r10, java.lang.String r11, java.lang.Long r12, int r13, kotlin.jvm.internal.DefaultConstructorMarker r14) {
        /*
            r7 = this;
            r6 = r12
            r2 = r8
            r4 = r10
            r1 = r13 & 1
            r0 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            if (r1 == 0) goto Ld
            r2 = r3
        Ld:
            r0 = r13 & 2
            if (r0 == 0) goto L2c
        L11:
            r0 = r13 & 4
            r5 = 0
            if (r0 == 0) goto L17
            r4 = r5
        L17:
            r0 = r13 & 8
            if (r0 == 0) goto L2a
        L1b:
            r0 = r13 & 16
            if (r0 == 0) goto L25
            r0 = 0
            java.lang.Long r6 = java.lang.Long.valueOf(r0)
        L25:
            r1 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            return
        L2a:
            r5 = r11
            goto L1b
        L2c:
            r3 = r9
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.model.BrowserConfig.<init>(java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Long, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}

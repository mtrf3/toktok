package com.ss.android.ugc.aweme.commercialize.model;

import X.C07670Rv;
import X.C47959Irz;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class AdStickerData implements Serializable {

    @InterfaceC65349Pkn("angle")
    public final float angle;

    @InterfaceC65349Pkn("enable_show_interval")
    public final boolean enableShowInterval;

    @InterfaceC65349Pkn("gecko_channel")
    public final List<String> geckoChannel;

    @InterfaceC65349Pkn("height")
    public final float height;

    @InterfaceC65349Pkn("position_x")
    public final float positionX;

    @InterfaceC65349Pkn("position_y")
    public final float positionY;

    @InterfaceC65349Pkn("show_seconds")
    public final int showSeconds;

    @InterfaceC65349Pkn("start_show_time")
    public final float startShowTime;

    @InterfaceC65349Pkn("sticker_data")
    public final String stickerData;

    @InterfaceC65349Pkn("sticker_url")
    public final String stickerUrl;

    @InterfaceC65349Pkn("stop_show_time")
    public final float stopShowTime;

    @InterfaceC65349Pkn("width")
    public final float width;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AdStickerData() {
        /*
            r15 = this;
            r1 = 0
            r6 = 0
            r10 = 0
            r13 = 4095(0xfff, float:5.738E-42)
            r0 = r15
            r2 = r1
            r3 = r1
            r4 = r1
            r5 = r1
            r7 = r6
            r8 = r1
            r9 = r1
            r11 = r10
            r12 = r10
            r14 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.model.AdStickerData.<init>():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AdStickerData copy$default(AdStickerData adStickerData, float f, float f2, float f3, float f4, float f5, boolean z, int i, float f6, float f7, String str, List list, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f = adStickerData.positionX;
        }
        if ((i2 & 2) != 0) {
            f2 = adStickerData.positionY;
        }
        if ((i2 & 4) != 0) {
            f3 = adStickerData.height;
        }
        if ((i2 & 8) != 0) {
            f4 = adStickerData.width;
        }
        if ((i2 & 16) != 0) {
            f5 = adStickerData.angle;
        }
        if ((i2 & 32) != 0) {
            z = adStickerData.enableShowInterval;
        }
        if ((i2 & 64) != 0) {
            i = adStickerData.showSeconds;
        }
        if ((i2 & 128) != 0) {
            f6 = adStickerData.startShowTime;
        }
        if ((i2 & 256) != 0) {
            f7 = adStickerData.stopShowTime;
        }
        if ((i2 & 512) != 0) {
            str = adStickerData.stickerUrl;
        }
        if ((i2 & 1024) != 0) {
            list = adStickerData.geckoChannel;
        }
        if ((i2 & 2048) != 0) {
            str2 = adStickerData.stickerData;
        }
        return adStickerData.copy(f, f2, f3, f4, f5, z, i, f6, f7, str, list, str2);
    }

    public final AdStickerData copy(float f, float f2, float f3, float f4, float f5, boolean z, int i, float f6, float f7, String str, List<String> list, String str2) {
        return new AdStickerData(f, f2, f3, f4, f5, z, i, f6, f7, str, list, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdStickerData)) {
            return false;
        }
        AdStickerData adStickerData = (AdStickerData) obj;
        return Float.compare(this.positionX, adStickerData.positionX) == 0 && Float.compare(this.positionY, adStickerData.positionY) == 0 && Float.compare(this.height, adStickerData.height) == 0 && Float.compare(this.width, adStickerData.width) == 0 && Float.compare(this.angle, adStickerData.angle) == 0 && this.enableShowInterval == adStickerData.enableShowInterval && this.showSeconds == adStickerData.showSeconds && Float.compare(this.startShowTime, adStickerData.startShowTime) == 0 && Float.compare(this.stopShowTime, adStickerData.stopShowTime) == 0 && o.LJ(this.stickerUrl, adStickerData.stickerUrl) && o.LJ(this.geckoChannel, adStickerData.geckoChannel) && o.LJ(this.stickerData, adStickerData.stickerData);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int hashCode2;
        int LIZIZ = C47959Irz.LIZIZ(this.angle, C47959Irz.LIZIZ(this.width, C47959Irz.LIZIZ(this.height, C47959Irz.LIZIZ(this.positionY, Float.floatToIntBits(this.positionX) * 31, 31), 31), 31), 31);
        boolean z = this.enableShowInterval;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int LIZIZ2 = C47959Irz.LIZIZ(this.stopShowTime, C47959Irz.LIZIZ(this.startShowTime, (((LIZIZ + i) * 31) + this.showSeconds) * 31, 31), 31);
        String str = this.stickerUrl;
        int i2 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i3 = (LIZIZ2 + hashCode) * 31;
        List<String> list = this.geckoChannel;
        if (list == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = list.hashCode();
        }
        int i4 = (i3 + hashCode2) * 31;
        String str2 = this.stickerData;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i4 + i2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AdStickerData(positionX=");
        sb.append(this.positionX);
        sb.append(", positionY=");
        sb.append(this.positionY);
        sb.append(", height=");
        sb.append(this.height);
        sb.append(", width=");
        sb.append(this.width);
        sb.append(", angle=");
        sb.append(this.angle);
        sb.append(", enableShowInterval=");
        sb.append(this.enableShowInterval);
        sb.append(", showSeconds=");
        sb.append(this.showSeconds);
        sb.append(", startShowTime=");
        sb.append(this.startShowTime);
        sb.append(", stopShowTime=");
        sb.append(this.stopShowTime);
        sb.append(", stickerUrl=");
        sb.append(this.stickerUrl);
        sb.append(", geckoChannel=");
        sb.append(this.geckoChannel);
        sb.append(", stickerData=");
        return C07670Rv.LIZIZ(sb, this.stickerData, ')');
    }

    public final float getAngle() {
        return this.angle;
    }

    public final boolean getEnableShowInterval() {
        return this.enableShowInterval;
    }

    public final List<String> getGeckoChannel() {
        return this.geckoChannel;
    }

    public final float getHeight() {
        return this.height;
    }

    public final float getPositionX() {
        return this.positionX;
    }

    public final float getPositionY() {
        return this.positionY;
    }

    public final int getShowSeconds() {
        return this.showSeconds;
    }

    public final float getStartShowTime() {
        return this.startShowTime;
    }

    public final String getStickerData() {
        return this.stickerData;
    }

    public final String getStickerUrl() {
        return this.stickerUrl;
    }

    public final float getStopShowTime() {
        return this.stopShowTime;
    }

    public final float getWidth() {
        return this.width;
    }

    public AdStickerData(float f, float f2, float f3, float f4, float f5, boolean z, int i, float f6, float f7, String str, List<String> list, String str2) {
        this.positionX = f;
        this.positionY = f2;
        this.height = f3;
        this.width = f4;
        this.angle = f5;
        this.enableShowInterval = z;
        this.showSeconds = i;
        this.startShowTime = f6;
        this.stopShowTime = f7;
        this.stickerUrl = str;
        this.geckoChannel = list;
        this.stickerData = str2;
    }

    public /* synthetic */ AdStickerData(float f, float f2, float f3, float f4, float f5, boolean z, int i, float f6, float f7, String str, List list, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0.0f : f, (i2 & 2) != 0 ? 0.0f : f2, (i2 & 4) != 0 ? 0.0f : f3, (i2 & 8) != 0 ? 0.0f : f4, (i2 & 16) != 0 ? 0.0f : f5, (i2 & 32) != 0 ? false : z, (i2 & 64) == 0 ? i : 0, (i2 & 128) != 0 ? 0.0f : f6, (i2 & 256) == 0 ? f7 : 0.0f, (i2 & 512) != 0 ? null : str, (i2 & 1024) != 0 ? null : list, (i2 & 2048) == 0 ? str2 : null);
    }
}

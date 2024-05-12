package com.bytedance.android.livesdk.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.ImageModel;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class RandomGiftPanelBanner extends F9E {

    @InterfaceC65349Pkn("banner_priority")
    public int bannerPriority;

    @InterfaceC65349Pkn("bg_color_values")
    public List<String> bgColors;

    @InterfaceC65349Pkn("collect_num")
    public long collectNum;

    @InterfaceC65349Pkn("display_text")
    public String displayText;

    @InterfaceC65349Pkn("left_icon")
    public ImageModel leftIcon;

    @InterfaceC65349Pkn("round")
    public long round;

    @InterfaceC65349Pkn("schema_url")
    public String schemaUrl;

    @InterfaceC65349Pkn("shading_image")
    public ImageModel shadingImage;

    @InterfaceC65349Pkn("target_num")
    public long targetNum;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public RandomGiftPanelBanner() {
        /*
            r15 = this;
            r1 = 0
            r2 = 0
            r12 = 0
            r13 = 511(0x1ff, float:7.16E-43)
            r0 = r15
            r4 = r2
            r6 = r2
            r8 = r1
            r9 = r1
            r10 = r1
            r11 = r1
            r14 = r1
            r0.<init>(r1, r2, r4, r6, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.model.RandomGiftPanelBanner.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.bgColors, Long.valueOf(this.round), Long.valueOf(this.targetNum), Long.valueOf(this.collectNum), this.displayText, this.leftIcon, this.shadingImage, this.schemaUrl, Integer.valueOf(this.bannerPriority)};
    }

    public RandomGiftPanelBanner(List<String> list, long j, long j2, long j3, String str, ImageModel imageModel, ImageModel imageModel2, String str2, int i) {
        this.bgColors = list;
        this.round = j;
        this.targetNum = j2;
        this.collectNum = j3;
        this.displayText = str;
        this.leftIcon = imageModel;
        this.shadingImage = imageModel2;
        this.schemaUrl = str2;
        this.bannerPriority = i;
    }

    public /* synthetic */ RandomGiftPanelBanner(List list, long j, long j2, long j3, String str, ImageModel imageModel, ImageModel imageModel2, String str2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : list, (i2 & 2) != 0 ? 1L : j, (i2 & 4) != 0 ? -1L : j2, (i2 & 8) != 0 ? 0L : j3, (i2 & 16) != 0 ? null : str, (i2 & 32) != 0 ? null : imageModel, (i2 & 64) == 0 ? imageModel2 : null, (i2 & 128) != 0 ? "sslocal://webcast_lynxview_popup?container_bg_color=00000000&show_mask=1&use_spark=1&url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Fmusically%2Ffe%2Flive%2Ftiktok_live_revenue_random_gift%2Fpages%2Fcollection%2Ftemplate.js&gravity=bottom&height=1090rpx&radius=16rpx" : str2, (i2 & 256) != 0 ? 0 : i);
    }
}

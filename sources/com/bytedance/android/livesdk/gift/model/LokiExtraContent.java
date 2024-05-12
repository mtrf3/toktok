package com.bytedance.android.livesdk.gift.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes14.dex */
public final class LokiExtraContent extends F9E {

    @InterfaceC65349Pkn("bef_view_fit_mode")
    public int befViewFitMode;

    @InterfaceC65349Pkn("bef_view_render_fps")
    public int befViewRenderFPS;

    @InterfaceC65349Pkn("bef_view_render_size")
    public BEFViewRenderSize befViewRenderSize;

    @InterfaceC65349Pkn("gift_duration")
    public Long giftDuration;

    @InterfaceC65349Pkn("gift_type")
    public String giftType;

    @InterfaceC65349Pkn("should_multi_frame")
    public boolean ismultiFrame;

    @InterfaceC65349Pkn("model_names")
    public String modelNames;

    @InterfaceC65349Pkn("need_screen_shot")
    public boolean needScreenShot;

    @InterfaceC65349Pkn("requirements")
    public List<String> requirements;

    @InterfaceC65349Pkn("view_overlay")
    public String viewOverlay;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public LokiExtraContent() {
        /*
            r13 = this;
            r1 = 0
            r3 = 0
            r11 = 1023(0x3ff, float:1.434E-42)
            r0 = r13
            r2 = r1
            r4 = r3
            r5 = r1
            r6 = r1
            r7 = r3
            r8 = r3
            r9 = r1
            r10 = r1
            r12 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.gift.model.LokiExtraContent.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.giftType, this.giftDuration, Boolean.valueOf(this.needScreenShot), Boolean.valueOf(this.ismultiFrame), this.viewOverlay, this.befViewRenderSize, Integer.valueOf(this.befViewRenderFPS), Integer.valueOf(this.befViewFitMode), this.modelNames, this.requirements};
    }

    public LokiExtraContent(String str, Long l, boolean z, boolean z2, String str2, BEFViewRenderSize bEFViewRenderSize, int i, int i2, String str3, List<String> list) {
        this.giftType = str;
        this.giftDuration = l;
        this.needScreenShot = z;
        this.ismultiFrame = z2;
        this.viewOverlay = str2;
        this.befViewRenderSize = bEFViewRenderSize;
        this.befViewRenderFPS = i;
        this.befViewFitMode = i2;
        this.modelNames = str3;
        this.requirements = list;
    }

    public /* synthetic */ LokiExtraContent(String str, Long l, boolean z, boolean z2, String str2, BEFViewRenderSize bEFViewRenderSize, int i, int i2, String str3, List list, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? null : str, (i3 & 2) != 0 ? null : l, (i3 & 4) != 0 ? false : z, (i3 & 8) != 0 ? false : z2, (i3 & 16) != 0 ? null : str2, (i3 & 32) != 0 ? null : bEFViewRenderSize, (i3 & 64) != 0 ? 0 : i, (i3 & 128) == 0 ? i2 : 0, (i3 & 256) != 0 ? null : str3, (i3 & 512) == 0 ? list : null);
    }
}

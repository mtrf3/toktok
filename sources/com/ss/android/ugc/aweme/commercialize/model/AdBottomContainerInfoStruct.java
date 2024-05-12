package com.ss.android.ugc.aweme.commercialize.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class AdBottomContainerInfoStruct implements Serializable {

    @InterfaceC65349Pkn("animation_info")
    public final AnimationInfoStruct animationInfo;

    @InterfaceC65349Pkn("change_color_seconds")
    public final int changeColorSeconds;

    @InterfaceC65349Pkn("container_url")
    public final String containerUrl;

    @InterfaceC65349Pkn("element_sequence")
    public final List<Integer> elementSequence;

    @InterfaceC65349Pkn("height")
    public final int height;

    @InterfaceC65349Pkn("show_seconds")
    public final int showSeconds;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AdBottomContainerInfoStruct() {
        /*
            r9 = this;
            r1 = 0
            r2 = 0
            r7 = 63
            r0 = r9
            r3 = r2
            r4 = r1
            r5 = r2
            r6 = r1
            r8 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.model.AdBottomContainerInfoStruct.<init>():void");
    }

    public final AnimationInfoStruct getAnimationInfo() {
        return this.animationInfo;
    }

    public final int getChangeColorSeconds() {
        return this.changeColorSeconds;
    }

    public final String getContainerUrl() {
        return this.containerUrl;
    }

    public final List<Integer> getElementSequence() {
        return this.elementSequence;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getShowSeconds() {
        return this.showSeconds;
    }

    public AdBottomContainerInfoStruct(String containerUrl, int i, int i2, List<Integer> list, int i3, AnimationInfoStruct animationInfoStruct) {
        o.LJIIIZ(containerUrl, "containerUrl");
        this.containerUrl = containerUrl;
        this.showSeconds = i;
        this.height = i2;
        this.elementSequence = list;
        this.changeColorSeconds = i3;
        this.animationInfo = animationInfoStruct;
    }

    public /* synthetic */ AdBottomContainerInfoStruct(String str, int i, int i2, List list, int i3, AnimationInfoStruct animationInfoStruct, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? 0 : i, (i4 & 4) != 0 ? 0 : i2, (i4 & 8) != 0 ? null : list, (i4 & 16) == 0 ? i3 : 0, (i4 & 32) == 0 ? animationInfoStruct : null);
    }
}

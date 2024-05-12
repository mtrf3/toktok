package com.ss.android.ugc.aweme.commercialize.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class AdTopContainerInfoStruct implements Serializable {

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
    public AdTopContainerInfoStruct() {
        /*
            r7 = this;
            r1 = 0
            r2 = 0
            r5 = 15
            r0 = r7
            r3 = r2
            r4 = r1
            r6 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.model.AdTopContainerInfoStruct.<init>():void");
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

    public AdTopContainerInfoStruct(String containerUrl, int i, int i2, List<Integer> list) {
        o.LJIIIZ(containerUrl, "containerUrl");
        this.containerUrl = containerUrl;
        this.showSeconds = i;
        this.height = i2;
        this.elementSequence = list;
    }

    public /* synthetic */ AdTopContainerInfoStruct(String str, int i, int i2, List list, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0 : i2, (i3 & 8) != 0 ? null : list);
    }
}

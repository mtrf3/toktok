package com.ss.android.ugc.aweme.services.external.ui;

import X.C76800UCe;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class StickerDownloadConfig {
    public static final Companion Companion = new Companion();
    public int enterFromType;
    public InterfaceC88472Yns<? super Integer, C76800UCe> onFail;
    public InterfaceC65784Pro<C76800UCe> onSuccess;
    public final String region;
    public int sourceId;
    public final String stickerId;
    public Integer type;

    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public final int getEnterFromType() {
        return this.enterFromType;
    }

    public final InterfaceC88472Yns<Integer, C76800UCe> getOnFail() {
        return this.onFail;
    }

    public final InterfaceC65784Pro<C76800UCe> getOnSuccess() {
        return this.onSuccess;
    }

    public final String getRegion() {
        return this.region;
    }

    public final int getSourceId() {
        return this.sourceId;
    }

    public final String getStickerId() {
        return this.stickerId;
    }

    public final Integer getType() {
        return this.type;
    }

    public final void setEnterFromType(int i) {
        this.enterFromType = i;
    }

    public final void setOnFail(InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns) {
        this.onFail = interfaceC88472Yns;
    }

    public final void setOnSuccess(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        this.onSuccess = interfaceC65784Pro;
    }

    public final void setSourceId(int i) {
        this.sourceId = i;
    }

    public final void setType(Integer num) {
        this.type = num;
    }

    public StickerDownloadConfig(String stickerId, String region) {
        o.LJIIIZ(stickerId, "stickerId");
        o.LJIIIZ(region, "region");
        this.stickerId = stickerId;
        this.region = region;
        this.type = 0;
        this.enterFromType = 10002;
        this.sourceId = 1;
    }
}

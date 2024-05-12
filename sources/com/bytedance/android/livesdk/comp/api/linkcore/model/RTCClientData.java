package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.AbstractC65781Prl;
import X.C76800UCe;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import X.UB9;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class RTCClientData {
    public static final Companion Companion = new Companion();
    public final String background;
    public final boolean businessSideEnableIndependentMixStreamParams;
    public final UB9 client;
    public final InterfaceC65784Pro<String> generateRTCParamByRole;
    public final boolean initInBackground;
    public final MixInfo mixerInfo;
    public final boolean pushAdvance;
    public final RtcLiveVideoParam rtcVideoParamInfo;
    public final String sharedBgUrl;
    public final boolean shouldMixStream;

    /* renamed from: com.bytedance.android.livesdk.comp.api.linkcore.model.RTCClientData$1, reason: invalid class name */
    /* loaded from: classes14.dex */
    public final class AnonymousClass1 extends AbstractC65781Prl implements InterfaceC65784Pro<String> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // X.InterfaceC65784Pro
        public final String invoke() {
            return "";
        }
    }

    /* loaded from: classes14.dex */
    public static final class Builder {
        public String background;
        public boolean businessSideEnableIndependentMixStreamParams;
        public UB9 client;
        public boolean initInBackground;
        public MixInfo mixerInfo;
        public RtcLiveVideoParam rtcVideoParamInfo;
        public String sharedBgUrl;
        public boolean shouldMixStream;
        public boolean pushAdvance = true;
        public InterfaceC65784Pro<String> generateRTCParamByRole = RTCClientData$Builder$generateRTCParamByRole$1.INSTANCE;

        public final RTCClientData build() {
            return new RTCClientData(this);
        }

        public final String getBackground() {
            return this.background;
        }

        public final boolean getBusinessSideEnableIndependentMixStreamParams() {
            return this.businessSideEnableIndependentMixStreamParams;
        }

        public final UB9 getClient() {
            return this.client;
        }

        public final InterfaceC65784Pro<String> getGenerateRTCParamByRole() {
            return this.generateRTCParamByRole;
        }

        public final boolean getInitInBackground() {
            return this.initInBackground;
        }

        public final MixInfo getMixerInfo() {
            return this.mixerInfo;
        }

        public final boolean getPushAdvance() {
            return this.pushAdvance;
        }

        public final RtcLiveVideoParam getRtcVideoParamInfo() {
            return this.rtcVideoParamInfo;
        }

        public final String getSharedBgUrl() {
            return this.sharedBgUrl;
        }

        public final boolean getShouldMixStream() {
            return this.shouldMixStream;
        }

        public final void setBackground(String str) {
            this.background = str;
        }

        public final void setBusinessSideEnableIndependentMixStreamParams(boolean z) {
            this.businessSideEnableIndependentMixStreamParams = z;
        }

        public final void setClient(UB9 ub9) {
            this.client = ub9;
        }

        public final void setGenerateRTCParamByRole(InterfaceC65784Pro<String> interfaceC65784Pro) {
            o.LJIIIZ(interfaceC65784Pro, "<set-?>");
            this.generateRTCParamByRole = interfaceC65784Pro;
        }

        public final void setInitInBackground(boolean z) {
            this.initInBackground = z;
        }

        public final void setMixerInfo(MixInfo mixInfo) {
            this.mixerInfo = mixInfo;
        }

        public final void setPushAdvance(boolean z) {
            this.pushAdvance = z;
        }

        public final void setRtcVideoParamInfo(RtcLiveVideoParam rtcLiveVideoParam) {
            this.rtcVideoParamInfo = rtcLiveVideoParam;
        }

        public final void setSharedBgUrl(String str) {
            this.sharedBgUrl = str;
        }

        public final void setShouldMixStream(boolean z) {
            this.shouldMixStream = z;
        }
    }

    public /* synthetic */ RTCClientData(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }

    /* loaded from: classes14.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final RTCClientData build(InterfaceC88472Yns<? super Builder, C76800UCe> block) {
            o.LJIIIZ(block, "block");
            Builder builder = new Builder();
            block.invoke(builder);
            return builder.build();
        }
    }

    public final String getBackground() {
        return this.background;
    }

    public final boolean getBusinessSideEnableIndependentMixStreamParams() {
        return this.businessSideEnableIndependentMixStreamParams;
    }

    public final UB9 getClient() {
        return this.client;
    }

    public final InterfaceC65784Pro<String> getGenerateRTCParamByRole() {
        return this.generateRTCParamByRole;
    }

    public final boolean getInitInBackground() {
        return this.initInBackground;
    }

    public final MixInfo getMixerInfo() {
        return this.mixerInfo;
    }

    public final boolean getPushAdvance() {
        return this.pushAdvance;
    }

    public final RtcLiveVideoParam getRtcVideoParamInfo() {
        return this.rtcVideoParamInfo;
    }

    public final String getSharedBgUrl() {
        return this.sharedBgUrl;
    }

    public final boolean getShouldMixStream() {
        return this.shouldMixStream;
    }

    public RTCClientData(Builder builder) {
        this(builder.getShouldMixStream(), builder.getMixerInfo(), builder.getClient(), builder.getRtcVideoParamInfo(), builder.getPushAdvance(), builder.getInitInBackground(), builder.getBackground(), builder.getGenerateRTCParamByRole(), builder.getBusinessSideEnableIndependentMixStreamParams(), builder.getSharedBgUrl());
    }

    public RTCClientData(boolean z, MixInfo mixInfo, UB9 ub9, RtcLiveVideoParam rtcLiveVideoParam, boolean z2, boolean z3, String str, InterfaceC65784Pro<String> generateRTCParamByRole, boolean z4, String str2) {
        o.LJIIIZ(generateRTCParamByRole, "generateRTCParamByRole");
        this.shouldMixStream = z;
        this.mixerInfo = mixInfo;
        this.client = ub9;
        this.rtcVideoParamInfo = rtcLiveVideoParam;
        this.pushAdvance = z2;
        this.initInBackground = z3;
        this.background = str;
        this.generateRTCParamByRole = generateRTCParamByRole;
        this.businessSideEnableIndependentMixStreamParams = z4;
        this.sharedBgUrl = str2;
    }

    public /* synthetic */ RTCClientData(boolean z, MixInfo mixInfo, UB9 ub9, RtcLiveVideoParam rtcLiveVideoParam, boolean z2, boolean z3, String str, InterfaceC65784Pro interfaceC65784Pro, boolean z4, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, mixInfo, ub9, rtcLiveVideoParam, z2, z3, str, (i & 128) != 0 ? AnonymousClass1.INSTANCE : interfaceC65784Pro, (i & 256) != 0 ? false : z4, str2);
    }
}

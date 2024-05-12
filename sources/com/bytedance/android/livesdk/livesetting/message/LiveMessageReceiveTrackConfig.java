package com.bytedance.android.livesdk.livesetting.message;

import X.C47261Igj;
import X.C61878OQg;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveMessageReceiveTrackConfig extends LiveMessageServerSample {

    @InterfaceC65349Pkn("allow_method_list")
    public List<String> allowedMethods;

    @InterfaceC65349Pkn("allow_p2p_method_list")
    public List<String> allowedP2PMethods;

    @InterfaceC65349Pkn("p2p_sampling_rate")
    public double p2pFullSampling;

    @InterfaceC65349Pkn("common_sampling_rate")
    public double samplingRate;

    public LiveMessageReceiveTrackConfig() {
        this(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, null, null, 15, null);
    }

    public final List<String> getAllowedMethods() {
        return this.allowedMethods;
    }

    public final List<String> getAllowedP2PMethods() {
        return this.allowedP2PMethods;
    }

    public final double getP2pFullSampling() {
        return this.p2pFullSampling;
    }

    public final double getSamplingRate() {
        return this.samplingRate;
    }

    public final void setAllowedMethods(List<String> list) {
        o.LJIIIZ(list, "<set-?>");
        this.allowedMethods = list;
    }

    public final void setAllowedP2PMethods(List<String> list) {
        o.LJIIIZ(list, "<set-?>");
        this.allowedP2PMethods = list;
    }

    public final void setP2pFullSampling(double d) {
        this.p2pFullSampling = d;
    }

    public final void setSamplingRate(double d) {
        this.samplingRate = d;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveMessageReceiveTrackConfig(double d, double d2, List<String> allowedMethods, List<String> allowedP2PMethods) {
        super(null, null, 3, null);
        o.LJIIIZ(allowedMethods, "allowedMethods");
        o.LJIIIZ(allowedP2PMethods, "allowedP2PMethods");
        this.samplingRate = d;
        this.p2pFullSampling = d2;
        this.allowedMethods = allowedMethods;
        this.allowedP2PMethods = allowedP2PMethods;
    }

    public LiveMessageReceiveTrackConfig(double d, double d2, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 1.0E-4d : d, (i & 2) != 0 ? 1.0d : d2, (i & 4) != 0 ? C61878OQg.INSTANCE : list, (i & 8) != 0 ? C47261Igj.LJJIJIIJI(EnumC31509CYf.LINK_MESSAGE.getWsMethod(), EnumC31509CYf.LINK_AUDIENCE_NOTICE.getWsMethod(), EnumC31509CYf.BASE_LINK_LAYER_MESSAGE.getWsMethod(), EnumC31509CYf.LINK_MIC.getWsMethod(), EnumC31509CYf.LINK_MIC_BATTLE_ARMIES.getWsMethod()) : list2);
    }
}

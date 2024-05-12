package com.bytedance.helios.api.config;

import X.C113554cx;
import X.C47261Igj;
import X.C51029K0z;
import X.F9E;
import X.InterfaceC65349Pkn;
import X.OSZ;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class SignalConfig extends F9E {

    @InterfaceC65349Pkn("alog")
    public final Map<String, List<ConcernedALog>> alog;

    @InterfaceC65349Pkn("alog_enable")
    public final boolean alogEnable;

    @InterfaceC65349Pkn("composition")
    public final Map<String, List<String>> composition;

    @InterfaceC65349Pkn("enable")
    public final boolean enable;

    @InterfaceC65349Pkn("lifecycle")
    public final Map<String, List<String>> lifecycle;

    @InterfaceC65349Pkn("max_upload_size")
    public final int maxUploadSize;

    public SignalConfig() {
        this(false, 0, null, false, null, null, 63, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.enable), Integer.valueOf(this.maxUploadSize), this.composition, Boolean.valueOf(this.alogEnable), this.alog, this.lifecycle};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SignalConfig(boolean z, int i, Map<String, ? extends List<String>> composition, boolean z2, Map<String, ? extends List<ConcernedALog>> alog, Map<String, ? extends List<String>> lifecycle) {
        o.LJIIIZ(composition, "composition");
        o.LJIIIZ(alog, "alog");
        o.LJIIIZ(lifecycle, "lifecycle");
        this.enable = z;
        this.maxUploadSize = i;
        this.composition = composition;
        this.alogEnable = z2;
        this.alog = alog;
        this.lifecycle = lifecycle;
    }

    public SignalConfig(boolean z, int i, Map map, boolean z2, Map map2, Map map3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? true : z, (i2 & 2) != 0 ? 100 : i, (i2 & 4) != 0 ? C113554cx.LJJL(new OSZ("video", C47261Igj.LJJIJIIJI("sysMethod", "customMethod", "app", "guard", "sys", "alog")), new OSZ("audio", C47261Igj.LJJIJIIJI("sysMethod", "customMethod", "app", "guard", "sys", "alog"))) : map, (i2 & 8) == 0 ? z2 : false, (i2 & 16) != 0 ? C113554cx.LJJJLIIL() : map2, (i2 & 32) != 0 ? C51029K0z.LJJIIZI(new OSZ("com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity", C47261Igj.LJJIJIIJI("onPaused", "Stopped"))) : map3);
    }
}

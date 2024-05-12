package com.bytedance.helios.api.config;

import X.C47261Igj;
import X.C77275UUl;
import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DFIDCheckerConfig extends F9E {

    @InterfaceC65349Pkn("allow_list")
    public final Set<String> allowList;

    @InterfaceC65349Pkn("allow_suffix_list")
    public final List<String> allowSuffixList;

    @InterfaceC65349Pkn("enabled")
    public final boolean enabled;

    @InterfaceC65349Pkn("report_sample_rate")
    public final double reportSampleRate;

    @InterfaceC65349Pkn("stack_sample_rate")
    public final double stackSampleRate;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public DFIDCheckerConfig() {
        /*
            r10 = this;
            r1 = 0
            r2 = 0
            r6 = 0
            r8 = 31
            r0 = r10
            r4 = r2
            r7 = r6
            r9 = r6
            r0.<init>(r1, r2, r4, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.helios.api.config.DFIDCheckerConfig.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.enabled), Double.valueOf(this.reportSampleRate), Double.valueOf(this.stackSampleRate), this.allowList, this.allowSuffixList};
    }

    public DFIDCheckerConfig(boolean z, double d, double d2, Set<String> allowList, List<String> allowSuffixList) {
        o.LJIIIZ(allowList, "allowList");
        o.LJIIIZ(allowSuffixList, "allowSuffixList");
        this.enabled = z;
        this.reportSampleRate = d;
        this.stackSampleRate = d2;
        this.allowList = allowList;
        this.allowSuffixList = allowSuffixList;
    }

    public /* synthetic */ DFIDCheckerConfig(boolean z, double d, double d2, Set set, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? 1.0d : d, (i & 4) != 0 ? 0.01d : d2, (i & 8) != 0 ? C77275UUl.LJIIIIZZ("us.tiktok.com", "www.tiktok.com", "analytics.tiktok.com", "effecthouse.tiktok.com", "now.tiktok.com", "support.tiktok.com", "newsroom.tiktok.com", "m.tiktok.com", "vt.tiktok.com", "vm.tiktok.com", "shop.tiktok.com", "tv.tiktok.com", "t.tiktok.com", "livecenter.tiktok.com", "partner.us.tiktokshop.com", "open-api.tiktok.com", "business-api.tiktok.com", "open.tiktokapis.com", "open-upload.us.tiktokapis.com", "api.us.tiktokglobalshopv.com", "api16-normal-useast5.us.tiktokglobalshopv.com", "open-api.tiktokglobalshop.com", "services.us.tiktokshop.com", "video-useast5.tiktokv.com", "p0-tiktok-dm-video-cover-private.tiktokv.com", "test-ag.tiktok-us.org") : set, (i & 16) != 0 ? C47261Igj.LJJIJIIJI(".us.tiktok.com", "-us.tiktok.com", ".us.tiktokv.com", ".tiktokv-us.com", ".tiktokcdn-us.com", "-boot.tiktokv.com") : list);
    }
}

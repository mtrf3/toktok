package com.bytedance.pia.core.setting;

import X.C221108m2;
import X.C36743EbT;
import X.C37384Elo;
import X.C37411EmF;
import X.C37412EmG;
import X.C37413EmH;
import X.C37414EmI;
import X.C37415EmJ;
import X.C37432Ema;
import X.C61878OQg;
import X.C62822Ol8;
import X.C77275UUl;
import X.C85693Xx;
import X.InterfaceC37416EmK;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.net.Uri;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.pia.core.utils.GsonUtils;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ujb.o;

/* loaded from: classes7.dex */
public final class Settings {
    public static volatile Settings LJIIIIZZ;

    @InterfaceC37416EmK
    public final C62822Ol8 LIZ;

    @InterfaceC37416EmK
    public final C62822Ol8 LIZIZ;

    @InterfaceC37416EmK
    public final C62822Ol8 LIZJ;

    @InterfaceC37416EmK
    public final C62822Ol8 LIZLLL;

    @InterfaceC37416EmK
    public final C62822Ol8 LJ;

    @InterfaceC65349Pkn("allow_domains")
    public final List<String> allowedDomains;

    @InterfaceC65349Pkn("blocked_pages")
    public final List<String> blockedPages;

    @InterfaceC65349Pkn("blocked_pages_v1")
    public final List<String> blockedV1Page;

    @InterfaceC65349Pkn("features")
    public final Set<String> enabledFeatures;

    @InterfaceC65349Pkn("html_intercept_timeout")
    public final int htmlInterceptTimeout;

    @InterfaceC65349Pkn("boot")
    public final boolean isBootEnabled;

    @InterfaceC65349Pkn("cache")
    public final boolean isCacheEnabled;

    @InterfaceC65349Pkn("nsr_v1")
    public final boolean isNsrV1Enabled;

    @InterfaceC65349Pkn("main")
    public final boolean isPiaEnabled;

    @InterfaceC65349Pkn("experiment_disable_pia_query")
    public final boolean isPiaQueryDisable;

    @InterfaceC65349Pkn("prefetch_v1")
    public final boolean isPrefetchV1Enabled;

    @InterfaceC65349Pkn("snapshot_v1")
    public final boolean isSnapshotV1Enabled;

    @InterfaceC65349Pkn("vanilla_fetch")
    public final boolean isVanillaFetchEnabled;

    @InterfaceC65349Pkn("warmup")
    public final boolean isWarmupEnabled;

    @InterfaceC65349Pkn("worker")
    public final boolean isWorkerEnabled;

    @InterfaceC65349Pkn("page_storage_capacity")
    public final int pageStorageCapacity;

    @InterfaceC65349Pkn("streaming_intercept_timeout")
    public final int streamingInterceptTimeout;

    @InterfaceC65349Pkn("url_rules")
    public final List<String> urlRules;
    public static final C37413EmH LJIIIZ = new C37413EmH();
    public static final C62822Ol8 LJFF = C221108m2.LIZIZ(C37415EmJ.LJLIL);
    public static final C62822Ol8 LJI = C221108m2.LIZIZ(C37414EmI.LJLIL);
    public static volatile boolean LJII = true;

    public Settings() {
        this(false, false, false, false, false, false, null, 0, null, 0, 0, null, null, false, false, false, false, null, 262143, null);
    }

    public static final Settings LIZ() {
        return C37413EmH.LIZ(LJIIIZ);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PiaSettings(enabled=");
        LIZ.append(LJII);
        LIZ.append("): ");
        LIZ.append(GsonProtectorUtils.toJson(GsonUtils.LIZIZ(), this));
        return X1D.LIZIZ(LIZ);
    }

    public final boolean LIZIZ(Uri uri) {
        if (!LJII) {
            return true;
        }
        if (!this.isPiaEnabled || ((Collection) this.LIZJ.getValue()).isEmpty()) {
            return false;
        }
        if (((Collection) this.LIZJ.getValue()).contains("*")) {
            return true;
        }
        if (uri == null || !C85693Xx.LIZIZ(uri)) {
            return false;
        }
        Collection<String> collection = (Collection) this.LIZJ.getValue();
        if (!(collection instanceof Collection) || !collection.isEmpty()) {
            for (String str : collection) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append('.');
                LIZ.append(uri.getHost());
                if (o.LJJJJ(X1D.LIZIZ(LIZ), str, false)) {
                    return true;
                }
            }
        }
        return false;
    }

    public Settings(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, List<String> allowedDomains, int i, Set<String> enabledFeatures, int i2, int i3, List<String> blockedPages, List<String> urlRules, boolean z7, boolean z8, boolean z9, boolean z10, List<String> blockedV1Page) {
        kotlin.jvm.internal.o.LJIIJ(allowedDomains, "allowedDomains");
        kotlin.jvm.internal.o.LJIIJ(enabledFeatures, "enabledFeatures");
        kotlin.jvm.internal.o.LJIIJ(blockedPages, "blockedPages");
        kotlin.jvm.internal.o.LJIIJ(urlRules, "urlRules");
        kotlin.jvm.internal.o.LJIIJ(blockedV1Page, "blockedV1Page");
        this.isPiaEnabled = z;
        this.isBootEnabled = z2;
        this.isCacheEnabled = z3;
        this.isWorkerEnabled = z4;
        this.isVanillaFetchEnabled = z5;
        this.isWarmupEnabled = z6;
        this.allowedDomains = allowedDomains;
        this.htmlInterceptTimeout = i;
        this.enabledFeatures = enabledFeatures;
        this.pageStorageCapacity = i2;
        this.streamingInterceptTimeout = i3;
        this.blockedPages = blockedPages;
        this.urlRules = urlRules;
        this.isPiaQueryDisable = z7;
        this.isNsrV1Enabled = z8;
        this.isPrefetchV1Enabled = z9;
        this.isSnapshotV1Enabled = z10;
        this.blockedV1Page = blockedV1Page;
        this.LIZ = C221108m2.LIZIZ(new C37411EmF(this));
        this.LIZIZ = C221108m2.LIZIZ(new C37384Elo(this));
        this.LIZJ = C221108m2.LIZIZ(new C36743EbT(this));
        this.LIZLLL = C221108m2.LIZIZ(new C37412EmG(this));
        this.LJ = C221108m2.LIZIZ(new C37432Ema(this));
    }

    public Settings(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, List list, int i, Set set, int i2, int i3, List list2, List list3, boolean z7, boolean z8, boolean z9, boolean z10, List list4, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? true : z, (i4 & 2) != 0 ? true : z2, (i4 & 4) != 0 ? true : z3, (i4 & 8) != 0 ? true : z4, (i4 & 16) != 0 ? true : z5, (i4 & 32) == 0 ? z6 : true, (i4 & 64) != 0 ? C61878OQg.INSTANCE : list, (i4 & 128) != 0 ? 20 : i, (i4 & 256) != 0 ? C77275UUl.LJIIIIZZ("prefetch", "nsr", "snapshot", "cache", "streaming") : set, (i4 & 512) != 0 ? LiveMaxRetainAlogMessageSizeSetting.DEFAULT : i2, (i4 & 1024) != 0 ? 5 : i3, (i4 & 2048) != 0 ? C61878OQg.INSTANCE : list2, (i4 & 4096) != 0 ? C61878OQg.INSTANCE : list3, (i4 & FileUtils.BUFFER_SIZE) != 0 ? false : z7, (i4 & 16384) != 0 ? false : z8, (32768 & i4) != 0 ? false : z9, (65536 & i4) != 0 ? false : z10, (i4 & 131072) != 0 ? C61878OQg.INSTANCE : list4);
    }
}

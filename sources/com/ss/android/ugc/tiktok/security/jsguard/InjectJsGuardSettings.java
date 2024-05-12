package com.ss.android.ugc.tiktok.security.jsguard;

import X.AnonymousClass391;
import X.C00F;
import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.bytedance.ies.abmock.SettingsManager;
import defpackage.q;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class InjectJsGuardSettings {
    public static final InjectJsGuardConfig LIZ = new InjectJsGuardConfig(false, 0 == true ? 1 : 0, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);

    /* loaded from: classes7.dex */
    public static final class InjectJsGuardConfig {

        @InterfaceC65349Pkn("enable")
        public final boolean enable;

        @InterfaceC65349Pkn("hybrid_container_white_list")
        public final List<String> hybridContainerWhiteList;

        @InterfaceC65349Pkn("js_digest_white_list")
        public final List<JsDigest> jsDigestWhiteList;

        @InterfaceC65349Pkn("js_prefix_white_list")
        public final List<String> jsPrefixWhiteList;

        @InterfaceC65349Pkn("short_len")
        public final int scriptClipLength;

        /* JADX WARN: Multi-variable type inference failed */
        public InjectJsGuardConfig() {
            this(false, 0 == true ? 1 : 0, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InjectJsGuardConfig)) {
                return false;
            }
            InjectJsGuardConfig injectJsGuardConfig = (InjectJsGuardConfig) obj;
            return this.enable == injectJsGuardConfig.enable && this.scriptClipLength == injectJsGuardConfig.scriptClipLength && o.LJ(this.jsDigestWhiteList, injectJsGuardConfig.jsDigestWhiteList) && o.LJ(this.jsPrefixWhiteList, injectJsGuardConfig.jsPrefixWhiteList) && o.LJ(this.hybridContainerWhiteList, injectJsGuardConfig.hybridContainerWhiteList);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v8 */
        /* JADX WARN: Type inference failed for: r0v9 */
        public final int hashCode() {
            boolean z = this.enable;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            return this.hybridContainerWhiteList.hashCode() + AnonymousClass391.LIZIZ(this.jsPrefixWhiteList, AnonymousClass391.LIZIZ(this.jsDigestWhiteList, ((r0 * 31) + this.scriptClipLength) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("InjectJsGuardConfig(enable=");
            LIZ.append(this.enable);
            LIZ.append(", scriptClipLength=");
            LIZ.append(this.scriptClipLength);
            LIZ.append(", jsDigestWhiteList=");
            LIZ.append(this.jsDigestWhiteList);
            LIZ.append(", jsPrefixWhiteList=");
            LIZ.append(this.jsPrefixWhiteList);
            LIZ.append(", hybridContainerWhiteList=");
            return C1NE.LIZIZ(LIZ, this.hybridContainerWhiteList, ')', LIZ);
        }

        public InjectJsGuardConfig(boolean z, int i, List<JsDigest> list, List<String> list2, List<String> list3) {
            C00F.LJ(list, "jsDigestWhiteList", list2, "jsPrefixWhiteList", list3, "hybridContainerWhiteList");
            this.enable = z;
            this.scriptClipLength = i;
            this.jsDigestWhiteList = list;
            this.jsPrefixWhiteList = list2;
            this.hybridContainerWhiteList = list3;
        }

        public /* synthetic */ InjectJsGuardConfig(boolean z, int i, List list, List list2, List list3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? 40 : i, (i2 & 4) != 0 ? new ArrayList() : list, (i2 & 8) != 0 ? new ArrayList() : list2, (i2 & 16) != 0 ? new ArrayList() : list3);
        }
    }

    /* loaded from: classes7.dex */
    public static final class JsDigest {

        @InterfaceC65349Pkn("val")
        public final String digest;

        @InterfaceC65349Pkn("len")
        public final int len;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof JsDigest)) {
                return false;
            }
            JsDigest jsDigest = (JsDigest) obj;
            return this.len == jsDigest.len && o.LJ(this.digest, jsDigest.digest);
        }

        public final int hashCode() {
            return this.digest.hashCode() + (this.len * 31);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("JsDigest(len=");
            LIZ.append(this.len);
            LIZ.append(", digest=");
            return q.LIZIZ(LIZ, this.digest, ')', LIZ);
        }

        public JsDigest(int i, String digest) {
            o.LJIIIZ(digest, "digest");
            this.len = i;
            this.digest = digest;
        }
    }

    public static InjectJsGuardConfig LIZ() {
        try {
            SettingsManager LIZLLL = SettingsManager.LIZLLL();
            InjectJsGuardConfig injectJsGuardConfig = LIZ;
            InjectJsGuardConfig injectJsGuardConfig2 = (InjectJsGuardConfig) LIZLLL.LJIIIIZZ("inject_js_guard_settings", InjectJsGuardConfig.class, injectJsGuardConfig);
            if (injectJsGuardConfig2 != null) {
                return injectJsGuardConfig2;
            }
            return injectJsGuardConfig;
        } catch (Throwable unused) {
            return LIZ;
        }
    }
}

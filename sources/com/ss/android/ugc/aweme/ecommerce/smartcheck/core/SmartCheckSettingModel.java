package com.ss.android.ugc.aweme.ecommerce.smartcheck.core;

import X.C47261Igj;
import X.EDQ;
import X.F9E;
import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.b0;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class SmartCheckSettingModel extends F9E {

    @InterfaceC65349Pkn("debug")
    public final DebugConfig debugConfig;

    @InterfaceC65349Pkn("enable")
    public final boolean enable;

    @InterfaceC65349Pkn("native_page_keys")
    public final List<String> nativePageKeys;

    /* JADX WARN: Multi-variable type inference failed */
    public SmartCheckSettingModel() {
        this(false, null, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SmartCheckSettingModel copy$default(SmartCheckSettingModel smartCheckSettingModel, boolean z, DebugConfig debugConfig, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            z = smartCheckSettingModel.enable;
        }
        if ((i & 2) != 0) {
            debugConfig = smartCheckSettingModel.debugConfig;
        }
        if ((i & 4) != 0) {
            list = smartCheckSettingModel.nativePageKeys;
        }
        return smartCheckSettingModel.copy(z, debugConfig, list);
    }

    public final SmartCheckSettingModel copy(boolean z, DebugConfig debugConfig, List<String> nativePageKeys) {
        o.LJIIIZ(debugConfig, "debugConfig");
        o.LJIIIZ(nativePageKeys, "nativePageKeys");
        return new SmartCheckSettingModel(z, debugConfig, nativePageKeys);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.enable), this.debugConfig, this.nativePageKeys};
    }

    /* loaded from: classes7.dex */
    public static final class DebugConfig {

        @InterfaceC65349Pkn("enable")
        public final boolean enable;

        @InterfaceC65349Pkn("toast_interval")
        public final int toastInterval;

        @InterfaceC65349Pkn("toast_level")
        public final int toastLevel;

        /* JADX WARN: Multi-variable type inference failed */
        public DebugConfig() {
            this(false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, null);
        }

        public static /* synthetic */ DebugConfig copy$default(DebugConfig debugConfig, boolean z, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                z = debugConfig.enable;
            }
            if ((i3 & 2) != 0) {
                i = debugConfig.toastLevel;
            }
            if ((i3 & 4) != 0) {
                i2 = debugConfig.toastInterval;
            }
            return debugConfig.copy(z, i, i2);
        }

        public final DebugConfig copy(boolean z, int i, int i2) {
            return new DebugConfig(z, i, i2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DebugConfig)) {
                return false;
            }
            DebugConfig debugConfig = (DebugConfig) obj;
            return this.enable == debugConfig.enable && this.toastLevel == debugConfig.toastLevel && this.toastInterval == debugConfig.toastInterval;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v4 */
        /* JADX WARN: Type inference failed for: r0v5 */
        public int hashCode() {
            boolean z = this.enable;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            return (((r0 * 31) + this.toastLevel) * 31) + this.toastInterval;
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("DebugConfig(enable=");
            LIZ.append(this.enable);
            LIZ.append(", toastLevel=");
            LIZ.append(this.toastLevel);
            LIZ.append(", toastInterval=");
            return b0.LIZJ(LIZ, this.toastInterval, ')', LIZ);
        }

        public final boolean getEnable() {
            return this.enable;
        }

        public final int getToastInterval() {
            return this.toastInterval;
        }

        public final int getToastLevel() {
            return this.toastLevel;
        }

        public DebugConfig(boolean z, int i, int i2) {
            this.enable = z;
            this.toastLevel = i;
            this.toastInterval = i2;
        }

        public /* synthetic */ DebugConfig(boolean z, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? false : z, (i3 & 2) != 0 ? EDQ.WARNING.getValue() : i, (i3 & 4) != 0 ? 0 : i2);
        }
    }

    public final DebugConfig getDebugConfig() {
        return this.debugConfig;
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public final List<String> getNativePageKeys() {
        return this.nativePageKeys;
    }

    public SmartCheckSettingModel(boolean z, DebugConfig debugConfig, List<String> nativePageKeys) {
        o.LJIIIZ(debugConfig, "debugConfig");
        o.LJIIIZ(nativePageKeys, "nativePageKeys");
        this.enable = z;
        this.debugConfig = debugConfig;
        this.nativePageKeys = nativePageKeys;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ SmartCheckSettingModel(boolean z, DebugConfig debugConfig, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? new DebugConfig(false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, null) : debugConfig, (i & 4) != 0 ? C47261Igj.LJJIJIL("://ec/") : list);
    }
}

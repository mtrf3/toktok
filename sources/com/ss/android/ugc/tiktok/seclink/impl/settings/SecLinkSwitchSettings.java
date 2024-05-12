package com.ss.android.ugc.tiktok.seclink.impl.settings;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import com.bytedance.ies.abmock.SettingsManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class SecLinkSwitchSettings {
    public static final SeclinkSwitch LIZ = new SeclinkSwitch(false, 0, null, 7, 0 == true ? 1 : 0);

    /* loaded from: classes7.dex */
    public static final class SeclinkSwitch {

        @InterfaceC65349Pkn("sync_firstjump_switch")
        public final boolean enable;

        @InterfaceC65349Pkn("sync_timeout")
        public final long timeout;

        @InterfaceC65349Pkn("sync_white_list")
        public final List<String> white_list;

        /* JADX WARN: Multi-variable type inference failed */
        public SeclinkSwitch() {
            this(false, 0L, null, 7, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SeclinkSwitch)) {
                return false;
            }
            SeclinkSwitch seclinkSwitch = (SeclinkSwitch) obj;
            return this.enable == seclinkSwitch.enable && this.timeout == seclinkSwitch.timeout && o.LJ(this.white_list, seclinkSwitch.white_list);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v6 */
        /* JADX WARN: Type inference failed for: r0v7 */
        public final int hashCode() {
            boolean z = this.enable;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            return this.white_list.hashCode() + JBR.LIZJ(this.timeout, r0 * 31, 31);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("SeclinkSwitch(enable=");
            LIZ.append(this.enable);
            LIZ.append(", timeout=");
            LIZ.append(this.timeout);
            LIZ.append(", white_list=");
            return C1NE.LIZIZ(LIZ, this.white_list, ')', LIZ);
        }

        public SeclinkSwitch(boolean z, long j, List<String> white_list) {
            o.LJIIIZ(white_list, "white_list");
            this.enable = z;
            this.timeout = j;
            this.white_list = white_list;
        }

        public /* synthetic */ SeclinkSwitch(boolean z, long j, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? 1000L : j, (i & 4) != 0 ? new ArrayList() : list);
        }
    }

    public static SeclinkSwitch LIZ() {
        try {
            SettingsManager LIZLLL = SettingsManager.LIZLLL();
            SeclinkSwitch seclinkSwitch = LIZ;
            SeclinkSwitch seclinkSwitch2 = (SeclinkSwitch) LIZLLL.LJIIIIZZ("force_seclink_sync_firstjump", SeclinkSwitch.class, seclinkSwitch);
            if (seclinkSwitch2 != null) {
                return seclinkSwitch2;
            }
            return seclinkSwitch;
        } catch (Throwable unused) {
            return LIZ;
        }
    }
}

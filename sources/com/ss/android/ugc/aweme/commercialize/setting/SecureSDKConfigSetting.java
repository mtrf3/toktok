package com.ss.android.ugc.aweme.commercialize.setting;

import X.AnonymousClass391;
import X.C1NE;
import X.C221108m2;
import X.C58705N2f;
import X.C62822Ol8;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class SecureSDKConfigSetting {
    public static final SecureSDKConfigSetting LIZ = new SecureSDKConfigSetting();
    public static final SecureSDkConfig LIZIZ = new SecureSDkConfig(false, 0 == true ? 1 : 0, null, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(C58705N2f.LJLIL);

    /* loaded from: classes11.dex */
    public static final class SecureSDkConfig {

        @InterfaceC65349Pkn("duplicate_check_threshold")
        public final int duplicateCheckThreshold;

        @InterfaceC65349Pkn("duplicate_filter_list")
        public final List<List<String>> duplicateFilterList;

        @InterfaceC65349Pkn("enable_check_required_params")
        public final boolean isEnableCheck;

        @InterfaceC65349Pkn("validate_skip_list")
        public final List<List<String>> validateSkipList;

        /* JADX WARN: Multi-variable type inference failed */
        public SecureSDkConfig() {
            this(false, 0 == true ? 1 : 0, null, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SecureSDkConfig)) {
                return false;
            }
            SecureSDkConfig secureSDkConfig = (SecureSDkConfig) obj;
            return this.isEnableCheck == secureSDkConfig.isEnableCheck && this.duplicateCheckThreshold == secureSDkConfig.duplicateCheckThreshold && o.LJ(this.validateSkipList, secureSDkConfig.validateSkipList) && o.LJ(this.duplicateFilterList, secureSDkConfig.duplicateFilterList);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v7 */
        /* JADX WARN: Type inference failed for: r0v8 */
        public final int hashCode() {
            boolean z = this.isEnableCheck;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            return this.duplicateFilterList.hashCode() + AnonymousClass391.LIZIZ(this.validateSkipList, ((r0 * 31) + this.duplicateCheckThreshold) * 31, 31);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("SecureSDkConfig(isEnableCheck=");
            LIZ.append(this.isEnableCheck);
            LIZ.append(", duplicateCheckThreshold=");
            LIZ.append(this.duplicateCheckThreshold);
            LIZ.append(", validateSkipList=");
            LIZ.append(this.validateSkipList);
            LIZ.append(", duplicateFilterList=");
            return C1NE.LIZIZ(LIZ, this.duplicateFilterList, ')', LIZ);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public SecureSDkConfig(boolean z, int i, List<? extends List<String>> validateSkipList, List<? extends List<String>> duplicateFilterList) {
            o.LJIIIZ(validateSkipList, "validateSkipList");
            o.LJIIIZ(duplicateFilterList, "duplicateFilterList");
            this.isEnableCheck = z;
            this.duplicateCheckThreshold = i;
            this.validateSkipList = validateSkipList;
            this.duplicateFilterList = duplicateFilterList;
        }

        public /* synthetic */ SecureSDkConfig(boolean z, int i, List list, List list2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? 1 : i, (i2 & 4) != 0 ? new ArrayList() : list, (i2 & 8) != 0 ? new ArrayList() : list2);
        }
    }
}

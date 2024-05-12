package com.ss.android.ugc.aweme.compliance.common.hydrogen.configs;

import X.C1NE;
import X.C61878OQg;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class ActivityCenterLibraSetting {
    public static final ActivityCenterSettingModel LIZ = new ActivityCenterSettingModel(null, null, 3, null);

    /* loaded from: classes7.dex */
    public static final class ActivityCenterSettingModel {

        @InterfaceC65349Pkn("ac_entry_uri")
        public final String acEntry;

        @InterfaceC65349Pkn("feats")
        public final List<String> feats;

        public ActivityCenterSettingModel() {
            this(null, null, 3, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActivityCenterSettingModel)) {
                return false;
            }
            ActivityCenterSettingModel activityCenterSettingModel = (ActivityCenterSettingModel) obj;
            return o.LJ(this.acEntry, activityCenterSettingModel.acEntry) && o.LJ(this.feats, activityCenterSettingModel.feats);
        }

        public final int hashCode() {
            String str = this.acEntry;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            List<String> list = this.feats;
            return hashCode + (list != null ? list.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ActivityCenterSettingModel(acEntry=");
            LIZ.append(this.acEntry);
            LIZ.append(", feats=");
            return C1NE.LIZIZ(LIZ, this.feats, ')', LIZ);
        }

        public ActivityCenterSettingModel(String str, List<String> list) {
            this.acEntry = str;
            this.feats = list;
        }

        public ActivityCenterSettingModel(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? C61878OQg.INSTANCE : list);
        }
    }
}

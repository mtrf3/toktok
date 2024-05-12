package com.ss.android.ugc.aweme;

import X.C221108m2;
import X.C35514Dwk;
import X.C62822Ol8;
import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class ActivityCenterEntranceExperiment {
    public static final ActivityCenterSettingModel LIZ = new ActivityCenterSettingModel(false, null, 3, 0 == true ? 1 : 0);
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C35514Dwk.LJLIL);

    /* loaded from: classes7.dex */
    public static final class ActivityCenterSettingModel {

        @InterfaceC65349Pkn("enable")
        public final boolean enable;

        @InterfaceC65349Pkn("url")
        public final String url;

        /* JADX WARN: Multi-variable type inference failed */
        public ActivityCenterSettingModel() {
            this(false, null, 3, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActivityCenterSettingModel)) {
                return false;
            }
            ActivityCenterSettingModel activityCenterSettingModel = (ActivityCenterSettingModel) obj;
            return this.enable == activityCenterSettingModel.enable && o.LJ(this.url, activityCenterSettingModel.url);
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
            int i = r0 * 31;
            String str = this.url;
            return i + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ActivityCenterSettingModel(enable=");
            LIZ.append(this.enable);
            LIZ.append(", url=");
            return q.LIZIZ(LIZ, this.url, ')', LIZ);
        }

        public ActivityCenterSettingModel(boolean z, String str) {
            this.enable = z;
            this.url = str;
        }

        public /* synthetic */ ActivityCenterSettingModel(boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : str);
        }
    }
}

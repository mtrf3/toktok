package com.ss.android.ugc.aweme.i18n.xbridge.depend.runtime;

import X.C48339Iy7;
import X.C61878OQg;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class UpdateNonLazyResourceSwitch {
    public static final UpdateNonLazyResourceModel LIZ = new UpdateNonLazyResourceModel(C61878OQg.INSTANCE, false);

    /* loaded from: classes11.dex */
    public static final class UpdateNonLazyResourceModel {

        @InterfaceC65349Pkn("deny_list")
        public final List<String> denyList;

        /* renamed from: switch, reason: not valid java name */
        @InterfaceC65349Pkn("switch")
        public final boolean f29switch;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UpdateNonLazyResourceModel)) {
                return false;
            }
            UpdateNonLazyResourceModel updateNonLazyResourceModel = (UpdateNonLazyResourceModel) obj;
            return o.LJ(this.denyList, updateNonLazyResourceModel.denyList) && this.f29switch == updateNonLazyResourceModel.f29switch;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final int hashCode() {
            List<String> list = this.denyList;
            int hashCode = (list == null ? 0 : list.hashCode()) * 31;
            boolean z = this.f29switch;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            return hashCode + i;
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("UpdateNonLazyResourceModel(denyList=");
            LIZ.append(this.denyList);
            LIZ.append(", switch=");
            return C48339Iy7.LIZJ(LIZ, this.f29switch, ')', LIZ);
        }

        public UpdateNonLazyResourceModel(List<String> list, boolean z) {
            this.denyList = list;
            this.f29switch = z;
        }
    }
}

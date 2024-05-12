package com.ss.android.ugc.aweme.hybridkit.experiment;

import X.C1NE;
import X.C61878OQg;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;
import yq4.a;

/* loaded from: classes7.dex */
public final class EnableGlobalpropsDesensitizationSettings {
    public static final EnableGlobalpropsDesensitizationModel LIZ = new EnableGlobalpropsDesensitizationModel(new ArrayList(), false, new ArrayList());

    /* loaded from: classes7.dex */
    public static final class EnableGlobalpropsDesensitizationModel {

        @InterfaceC65349Pkn("denyList")
        public final List<String> denyList;

        @InterfaceC65349Pkn("enable")
        public final boolean enable;

        @InterfaceC65349Pkn("removeKeys")
        public final List<String> removeKeys;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EnableGlobalpropsDesensitizationModel)) {
                return false;
            }
            EnableGlobalpropsDesensitizationModel enableGlobalpropsDesensitizationModel = (EnableGlobalpropsDesensitizationModel) obj;
            return o.LJ(this.denyList, enableGlobalpropsDesensitizationModel.denyList) && this.enable == enableGlobalpropsDesensitizationModel.enable && o.LJ(this.removeKeys, enableGlobalpropsDesensitizationModel.removeKeys);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final int hashCode() {
            List<String> list = this.denyList;
            int hashCode = (list == null ? 0 : list.hashCode()) * 31;
            boolean z = this.enable;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            int i2 = (hashCode + i) * 31;
            List<String> list2 = this.removeKeys;
            return i2 + (list2 != null ? list2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("EnableGlobalpropsDesensitizationModel(denyList=");
            LIZ.append(this.denyList);
            LIZ.append(", enable=");
            LIZ.append(this.enable);
            LIZ.append(", removeKeys=");
            return C1NE.LIZIZ(LIZ, this.removeKeys, ')', LIZ);
        }

        public EnableGlobalpropsDesensitizationModel(List<String> list, boolean z, List<String> list2) {
            this.denyList = list;
            this.enable = z;
            this.removeKeys = list2;
        }
    }

    public static final List<String> LIZ(String str) {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        EnableGlobalpropsDesensitizationModel enableGlobalpropsDesensitizationModel = LIZ;
        EnableGlobalpropsDesensitizationModel enableGlobalpropsDesensitizationModel2 = (EnableGlobalpropsDesensitizationModel) LIZLLL.LJIIIIZZ("enable_globalprops_desensitization", EnableGlobalpropsDesensitizationModel.class, enableGlobalpropsDesensitizationModel);
        if (enableGlobalpropsDesensitizationModel2 != null) {
            enableGlobalpropsDesensitizationModel = enableGlobalpropsDesensitizationModel2;
        }
        ArrayList arrayList = new ArrayList();
        if (LIZIZ(str)) {
            Collection collection = enableGlobalpropsDesensitizationModel.removeKeys;
            if (collection == null) {
                collection = C61878OQg.INSTANCE;
            }
            arrayList.addAll(collection);
        }
        return arrayList;
    }

    public static final boolean LIZIZ(String str) {
        boolean z;
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        EnableGlobalpropsDesensitizationModel enableGlobalpropsDesensitizationModel = LIZ;
        EnableGlobalpropsDesensitizationModel enableGlobalpropsDesensitizationModel2 = (EnableGlobalpropsDesensitizationModel) LIZLLL.LJIIIIZZ("enable_globalprops_desensitization", EnableGlobalpropsDesensitizationModel.class, enableGlobalpropsDesensitizationModel);
        if (enableGlobalpropsDesensitizationModel2 != null) {
            enableGlobalpropsDesensitizationModel = enableGlobalpropsDesensitizationModel2;
        }
        List<String> list = enableGlobalpropsDesensitizationModel.denyList;
        boolean z2 = false;
        if (list != null) {
            z = false;
            for (String str2 : list) {
                if (str != null && s.LJJJLZIJ(str, str2, false)) {
                    z = true;
                }
            }
        } else {
            z = false;
        }
        if (!enableGlobalpropsDesensitizationModel.enable) {
            return false;
        }
        IComplianceBusinessService LJFF = a.LJFF();
        if (str == null) {
            str = "";
        }
        if (LJFF.LIZLLL(str)) {
            z2 = true;
        }
        return z2 & (!z);
    }
}

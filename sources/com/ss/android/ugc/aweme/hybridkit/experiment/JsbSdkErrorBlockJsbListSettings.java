package com.ss.android.ugc.aweme.hybridkit.experiment;

import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class JsbSdkErrorBlockJsbListSettings {
    public static final JsbSdkErrorBlockJsbListModel LIZ;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        JsbSdkErrorBlockJsbListModel jsbSdkErrorBlockJsbListModel = new JsbSdkErrorBlockJsbListModel(null, 1, 0 == true ? 1 : 0);
        jsbSdkErrorBlockJsbListModel.methods.add("x.getDebugInfo");
        jsbSdkErrorBlockJsbListModel.methods.add("x.getDeviceStatus");
        LIZ = jsbSdkErrorBlockJsbListModel;
    }

    /* loaded from: classes2.dex */
    public static final class JsbSdkErrorBlockJsbListModel {

        @InterfaceC65349Pkn("methods")
        public final ArrayList<String> methods;

        /* JADX WARN: Multi-variable type inference failed */
        public JsbSdkErrorBlockJsbListModel() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof JsbSdkErrorBlockJsbListModel) && o.LJ(this.methods, ((JsbSdkErrorBlockJsbListModel) obj).methods);
        }

        public final int hashCode() {
            return this.methods.hashCode();
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("JsbSdkErrorBlockJsbListModel(methods=");
            LIZ.append(this.methods);
            LIZ.append(')');
            return X1D.LIZIZ(LIZ);
        }

        public JsbSdkErrorBlockJsbListModel(ArrayList<String> methods) {
            o.LJIIIZ(methods, "methods");
            this.methods = methods;
        }

        public /* synthetic */ JsbSdkErrorBlockJsbListModel(ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new ArrayList() : arrayList);
        }
    }
}

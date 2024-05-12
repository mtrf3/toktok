package com.ss.android.ugc.aweme.hybridkit.experiment;

import X.C19U;
import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.b0;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class JsbSecureAuthConfigSettings {
    public static final JsbSecureAuthConfigModel LIZ;

    /* loaded from: classes2.dex */
    public static final class JsbSecurePublicKeyModel {

        @InterfaceC65349Pkn("publicKey")
        public final String publicKey;

        @InterfaceC65349Pkn("status")
        public final int status;

        /* JADX WARN: Multi-variable type inference failed */
        public JsbSecurePublicKeyModel() {
            this(null, 0, 3, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof JsbSecurePublicKeyModel)) {
                return false;
            }
            JsbSecurePublicKeyModel jsbSecurePublicKeyModel = (JsbSecurePublicKeyModel) obj;
            return o.LJ(this.publicKey, jsbSecurePublicKeyModel.publicKey) && this.status == jsbSecurePublicKeyModel.status;
        }

        public final int hashCode() {
            return (this.publicKey.hashCode() * 31) + this.status;
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("JsbSecurePublicKeyModel(publicKey=");
            LIZ.append(this.publicKey);
            LIZ.append(", status=");
            return b0.LIZJ(LIZ, this.status, ')', LIZ);
        }

        public JsbSecurePublicKeyModel(String publicKey, int i) {
            o.LJIIIZ(publicKey, "publicKey");
            this.publicKey = publicKey;
            this.status = i;
        }

        public /* synthetic */ JsbSecurePublicKeyModel(String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i);
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        arrayList.add("x.createCalendarEvent");
        arrayList.add("x.startGyroscope");
        arrayList.add("x.stopGyroscope");
        arrayList.add("x.sendSMS");
        arrayList.add("x.copy");
        C19U.LIZLLL(arrayList, "x.openApp", "x.openForThird", "x.requestForThird", "openBAConversionToolsWithType");
        arrayList.add("openAdLandPageLinks");
        arrayList.add("openAdApp");
        arrayList.add("openAdLandPage");
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new JsbSecurePublicKeyModel("MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAmrjnhFSv3K66fyKzNJkZq2Xq5sMAcRJhRVWHFzg6mxT2lymt8O27TA5wAiFlqwdDhZDDANb6jTk87nqokFT/SOzoniGgMVauhsVdk3sVGlivrePs35o03+N7iN7ApJ4R0i8RTuSi+zidZyylFLkoR+H/guusjNxZiIhRm9g2i9/ur18dYbz/g4XoKLMsnTWBubtjAEjtzIOX6zsJqrwkfEmHgdnokvC7xQjSnE3fWulXavwNTtabXcTIa0Rn4YQWazB56kTKel4dS5zoghys5IvH1kqjte+Yu3qoitnph69jxXukSl08jQzY1aE1OP4misJ3zUKoZOvzHBR5iedhQQIDAQAB", 0));
        LIZ = new JsbSecureAuthConfigModel(arrayList, false, arrayList2);
    }

    /* loaded from: classes2.dex */
    public static final class JsbSecureAuthConfigModel {

        @InterfaceC65349Pkn("enable")
        public boolean enable;

        @InterfaceC65349Pkn("secureFallbackMethodList")
        public final ArrayList<String> secureFallbackMethodList;

        @InterfaceC65349Pkn("securePublicKeyList")
        public final ArrayList<JsbSecurePublicKeyModel> securePublicKeyList;

        /* JADX WARN: Multi-variable type inference failed */
        public JsbSecureAuthConfigModel() {
            this(null, false, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof JsbSecureAuthConfigModel)) {
                return false;
            }
            JsbSecureAuthConfigModel jsbSecureAuthConfigModel = (JsbSecureAuthConfigModel) obj;
            return o.LJ(this.secureFallbackMethodList, jsbSecureAuthConfigModel.secureFallbackMethodList) && this.enable == jsbSecureAuthConfigModel.enable && o.LJ(this.securePublicKeyList, jsbSecureAuthConfigModel.securePublicKeyList);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final int hashCode() {
            int hashCode = this.secureFallbackMethodList.hashCode() * 31;
            boolean z = this.enable;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            return this.securePublicKeyList.hashCode() + ((hashCode + i) * 31);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("JsbSecureAuthConfigModel(secureFallbackMethodList=");
            LIZ.append(this.secureFallbackMethodList);
            LIZ.append(", enable=");
            LIZ.append(this.enable);
            LIZ.append(", securePublicKeyList=");
            LIZ.append(this.securePublicKeyList);
            LIZ.append(')');
            return X1D.LIZIZ(LIZ);
        }

        public JsbSecureAuthConfigModel(ArrayList<String> secureFallbackMethodList, boolean z, ArrayList<JsbSecurePublicKeyModel> securePublicKeyList) {
            o.LJIIIZ(secureFallbackMethodList, "secureFallbackMethodList");
            o.LJIIIZ(securePublicKeyList, "securePublicKeyList");
            this.secureFallbackMethodList = secureFallbackMethodList;
            this.enable = z;
            this.securePublicKeyList = securePublicKeyList;
        }

        public /* synthetic */ JsbSecureAuthConfigModel(ArrayList arrayList, boolean z, ArrayList arrayList2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new ArrayList() : arrayList, (i & 2) != 0 ? false : z, (i & 4) != 0 ? new ArrayList() : arrayList2);
        }
    }
}

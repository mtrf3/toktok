package com.bytedance.bpea.basics;

import X.AbstractC39330Fc6;
import X.C44881HjR;
import X.C44882HjS;
import X.C44883HjT;
import X.JBR;
import X.OHW;
import X.Q0C;
import X.X1D;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class PrivacyCert extends AbstractC39330Fc6 {
    public static final C44883HjT Companion = new C44883HjT();
    public final C44881HjR LJLIL;
    public final String LJLILLLLZI;
    public final C44882HjS[] LJLJI;

    /* loaded from: classes8.dex */
    public static final class Builder {
        public static final Companion Companion = new Companion();
        public String privacyCertId;
        public C44882HjS[] privacyPolicies;
        public String tag;
        public String usage;

        public static final Builder with(String str) {
            return Companion.with(str);
        }

        public final PrivacyCert build() {
            C44881HjR c44881HjR = new C44881HjR(this.privacyCertId);
            c44881HjR.setTag(this.tag);
            return new PrivacyCert(c44881HjR, this.usage, this.privacyPolicies);
        }

        /* loaded from: classes8.dex */
        public static final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Builder with(String id) {
                o.LJIIJ(id, "id");
                Builder builder = new Builder();
                builder.privacyCertId = id;
                return builder;
            }
        }

        public final String getPrivacyCertId() {
            return this.privacyCertId;
        }

        public final C44882HjS[] getPrivacyPolicies() {
            return this.privacyPolicies;
        }

        public final String getTag() {
            return this.tag;
        }

        public final String getUsage() {
            return this.usage;
        }

        public final Builder policies(C44882HjS... privacyPolicies) {
            o.LJIIJ(privacyPolicies, "privacyPolicies");
            int length = privacyPolicies.length;
            C44882HjS[] c44882HjSArr = new C44882HjS[length];
            for (int i = 0; i < length; i++) {
                c44882HjSArr[i] = privacyPolicies[i];
            }
            this.privacyPolicies = c44882HjSArr;
            return this;
        }

        public final Builder tag(String str) {
            this.tag = str;
            return this;
        }

        public final Builder usage(String usage) {
            o.LJIIJ(usage, "usage");
            this.usage = usage;
            return this;
        }
    }

    public static /* synthetic */ PrivacyCert copy$default(PrivacyCert privacyCert, C44881HjR c44881HjR, String str, C44882HjS[] c44882HjSArr, int i, Object obj) {
        if ((i & 1) != 0) {
            c44881HjR = privacyCert.LJLIL;
        }
        if ((i & 2) != 0) {
            str = privacyCert.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            c44882HjSArr = privacyCert.LJLJI;
        }
        return privacyCert.copy(c44881HjR, str, c44882HjSArr);
    }

    public final PrivacyCert copy(C44881HjR c44881HjR, String str, C44882HjS[] c44882HjSArr) {
        return new PrivacyCert(c44881HjR, str, c44882HjSArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrivacyCert)) {
            return false;
        }
        PrivacyCert privacyCert = (PrivacyCert) obj;
        return o.LJ(this.LJLIL, privacyCert.LJLIL) && o.LJ(this.LJLILLLLZI, privacyCert.LJLILLLLZI) && o.LJ(this.LJLJI, privacyCert.LJLJI);
    }

    public int hashCode() {
        C44881HjR c44881HjR = this.LJLIL;
        int hashCode = (c44881HjR != null ? c44881HjR.hashCode() : 0) * 31;
        String str = this.LJLILLLLZI;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        C44882HjS[] c44882HjSArr = this.LJLJI;
        return hashCode2 + (c44882HjSArr != null ? Arrays.hashCode(c44882HjSArr) : 0);
    }

    @Override // X.AbstractC39330Fc6, com.bytedance.bpea.basics.Cert
    public JSONObject toJSON() {
        String str;
        JSONObject json = super.toJSON();
        try {
            json.put("usage", this.LJLILLLLZI);
            C44881HjR c44881HjR = this.LJLIL;
            if (c44881HjR != null) {
                str = c44881HjR.getTag();
            } else {
                str = null;
            }
            json.put("tag", str);
            JSONArray jSONArray = new JSONArray();
            C44882HjS[] c44882HjSArr = this.LJLJI;
            if (c44882HjSArr != null) {
                for (C44882HjS c44882HjS : c44882HjSArr) {
                    jSONArray.put(c44882HjS.getDataType());
                }
            }
            json.put("dataType", jSONArray.toString());
        } catch (Throwable unused) {
        }
        return json;
    }

    @Override // X.AbstractC39330Fc6
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PrivacyCert(privacyPoint=");
        LIZ.append(this.LJLIL);
        LIZ.append(", usage=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", privacyPolicies=");
        return JBR.LJFF(LIZ, Arrays.toString(this.LJLJI), ")", LIZ);
    }

    public final C44881HjR getPrivacyPoint() {
        return this.LJLIL;
    }

    public final C44882HjS[] getPrivacyPolicies() {
        return this.LJLJI;
    }

    public final String getUsage() {
        return this.LJLILLLLZI;
    }

    @Override // X.AbstractC39330Fc6, com.bytedance.bpea.basics.Cert
    public void validate(OHW context) {
        String id;
        o.LJIIJ(context, "context");
        super.validate(context);
        C44881HjR c44881HjR = this.LJLIL;
        if (c44881HjR == null || (id = c44881HjR.getId()) == null || ujb.o.LJJJJJL(id)) {
            throw new Q0C(-1, "certId is empty");
        }
        C44882HjS[] c44882HjSArr = this.LJLJI;
        if (c44882HjSArr == null || c44882HjSArr.length == 0) {
            throw new Q0C(-1, "policy is empty");
        }
        String[] strArr = context.LIZLLL;
        if (strArr == null || strArr.length == 0) {
            throw new Q0C(-1, "check dataType is empty");
        }
        for (String str : strArr) {
            boolean z = false;
            for (C44882HjS c44882HjS : this.LJLJI) {
                String dataType = c44882HjS.getDataType();
                if (dataType != null && dataType.equals(str)) {
                    z = true;
                }
            }
            if (!z) {
                throw new Q0C(-1, "dataType do not match");
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public PrivacyCert(X.C44881HjR r3, java.lang.String r4, X.C44882HjS[] r5) {
        /*
            r2 = this;
            if (r3 == 0) goto L12
            java.lang.String r1 = r3.getId()
        L6:
            java.lang.String r0 = "PrivacyCert"
            r2.<init>(r1, r0)
            r2.LJLIL = r3
            r2.LJLILLLLZI = r4
            r2.LJLJI = r5
            return
        L12:
            r1 = 0
            goto L6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.bpea.basics.PrivacyCert.<init>(X.HjR, java.lang.String, X.HjS[]):void");
    }
}

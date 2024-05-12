package com.ss.android.ugc.aweme.hybridkit.experiment;

import X.C48339Iy7;
import X.C79062V1e;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.bytedance.ies.abmock.SettingsManager;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class BdxbridgeUrlSecurityTokenSettings {
    public static final BdxbridgeUrlSecurityTokenModel LIZ;

    /* loaded from: classes7.dex */
    public static final class BdxbridgeUrlSecurityTokenModel {

        @InterfaceC65349Pkn("JSCode")
        public final String JSCode;

        @InterfaceC65349Pkn("enable")
        public final boolean enable;

        @InterfaceC65349Pkn("noAuthTokenPassUrlList")
        public final List<String> noAuthTokenPassUrlList;

        @InterfaceC65349Pkn("noTokenUseUrl")
        public final boolean noTokenUseUrl;

        @InterfaceC65349Pkn("reportAllTokenState")
        public final boolean reportAllTokenState;

        @InterfaceC65349Pkn("tokenDefine")
        public final String tokenDefine;

        @InterfaceC65349Pkn("useNewBDXBridgeTask")
        public final boolean useNewBDXBridgeTask;

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public BdxbridgeUrlSecurityTokenModel() {
            /*
                r10 = this;
                r1 = 0
                r2 = 0
                r8 = 127(0x7f, float:1.78E-43)
                r0 = r10
                r3 = r2
                r4 = r1
                r5 = r1
                r6 = r2
                r7 = r1
                r9 = r2
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.hybridkit.experiment.BdxbridgeUrlSecurityTokenSettings.BdxbridgeUrlSecurityTokenModel.<init>():void");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BdxbridgeUrlSecurityTokenModel)) {
                return false;
            }
            BdxbridgeUrlSecurityTokenModel bdxbridgeUrlSecurityTokenModel = (BdxbridgeUrlSecurityTokenModel) obj;
            return this.enable == bdxbridgeUrlSecurityTokenModel.enable && o.LJ(this.JSCode, bdxbridgeUrlSecurityTokenModel.JSCode) && o.LJ(this.tokenDefine, bdxbridgeUrlSecurityTokenModel.tokenDefine) && this.noTokenUseUrl == bdxbridgeUrlSecurityTokenModel.noTokenUseUrl && this.useNewBDXBridgeTask == bdxbridgeUrlSecurityTokenModel.useNewBDXBridgeTask && o.LJ(this.noAuthTokenPassUrlList, bdxbridgeUrlSecurityTokenModel.noAuthTokenPassUrlList) && this.reportAllTokenState == bdxbridgeUrlSecurityTokenModel.reportAllTokenState;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v15 */
        /* JADX WARN: Type inference failed for: r0v16 */
        /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
        /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
        public final int hashCode() {
            int hashCode;
            boolean z = this.enable;
            int i = 1;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            int LJ = C79062V1e.LJ(this.tokenDefine, C79062V1e.LJ(this.JSCode, r0 * 31, 31), 31);
            ?? r02 = this.noTokenUseUrl;
            int i2 = r02;
            if (r02 != 0) {
                i2 = 1;
            }
            int i3 = (LJ + i2) * 31;
            ?? r03 = this.useNewBDXBridgeTask;
            int i4 = r03;
            if (r03 != 0) {
                i4 = 1;
            }
            int i5 = (i3 + i4) * 31;
            List<String> list = this.noAuthTokenPassUrlList;
            if (list == null) {
                hashCode = 0;
            } else {
                hashCode = list.hashCode();
            }
            int i6 = (i5 + hashCode) * 31;
            if (!this.reportAllTokenState) {
                i = 0;
            }
            return i6 + i;
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("BdxbridgeUrlSecurityTokenModel(enable=");
            LIZ.append(this.enable);
            LIZ.append(", JSCode=");
            LIZ.append(this.JSCode);
            LIZ.append(", tokenDefine=");
            LIZ.append(this.tokenDefine);
            LIZ.append(", noTokenUseUrl=");
            LIZ.append(this.noTokenUseUrl);
            LIZ.append(", useNewBDXBridgeTask=");
            LIZ.append(this.useNewBDXBridgeTask);
            LIZ.append(", noAuthTokenPassUrlList=");
            LIZ.append(this.noAuthTokenPassUrlList);
            LIZ.append(", reportAllTokenState=");
            return C48339Iy7.LIZJ(LIZ, this.reportAllTokenState, ')', LIZ);
        }

        public BdxbridgeUrlSecurityTokenModel(boolean z, String JSCode, String tokenDefine, boolean z2, boolean z3, List<String> list, boolean z4) {
            o.LJIIIZ(JSCode, "JSCode");
            o.LJIIIZ(tokenDefine, "tokenDefine");
            this.enable = z;
            this.JSCode = JSCode;
            this.tokenDefine = tokenDefine;
            this.noTokenUseUrl = z2;
            this.useNewBDXBridgeTask = z3;
            this.noAuthTokenPassUrlList = list;
            this.reportAllTokenState = z4;
        }

        public /* synthetic */ BdxbridgeUrlSecurityTokenModel(boolean z, String str, String str2, boolean z2, boolean z3, List list, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? "" : str, (i & 4) == 0 ? str2 : "", (i & 8) != 0 ? true : z2, (i & 16) == 0 ? z3 : false, (i & 32) != 0 ? null : list, (i & 64) != 0 ? true : z4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        boolean z = false;
        LIZ = new BdxbridgeUrlSecurityTokenModel(z, null, 0 == true ? 1 : 0, z, z, 0 == true ? 1 : 0, z, 127, 0 == true ? 1 : 0);
    }

    public static final BdxbridgeUrlSecurityTokenModel LIZ() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        BdxbridgeUrlSecurityTokenModel bdxbridgeUrlSecurityTokenModel = LIZ;
        BdxbridgeUrlSecurityTokenModel bdxbridgeUrlSecurityTokenModel2 = (BdxbridgeUrlSecurityTokenModel) LIZLLL.LJIIIIZZ("bdxbridge_url_security_token", BdxbridgeUrlSecurityTokenModel.class, bdxbridgeUrlSecurityTokenModel);
        if (bdxbridgeUrlSecurityTokenModel2 == null) {
            return bdxbridgeUrlSecurityTokenModel;
        }
        return bdxbridgeUrlSecurityTokenModel2;
    }
}

package com.ss.android.ugc.aweme.search.ecommerce.entrance.ab;

import X.C48339Iy7;
import X.C51279KAp;
import X.EnumC51280KAq;
import X.FFL;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class ECEntranceNewArch {
    public static final ECEntranceNewArch LIZ = new ECEntranceNewArch();
    public static final ECEntranceNewArchModel LIZIZ = new ECEntranceNewArchModel(false, false, false, false, false, false);

    /* loaded from: classes9.dex */
    public static final class ECEntranceNewArchModel {

        @InterfaceC65349Pkn("anchor")
        public final boolean anchorSwitch;

        @InterfaceC65349Pkn("comment_top")
        public final boolean commentTopSwitch;

        @InterfaceC65349Pkn("fashion_channel")
        public final boolean fashionChannelSwitch;

        @InterfaceC65349Pkn("feed_bar")
        public final boolean feedBarSwitch;

        @InterfaceC65349Pkn("mall")
        public final boolean mallSwitch;

        @InterfaceC65349Pkn("pdp")
        public final boolean pdpSwitch;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ECEntranceNewArchModel)) {
                return false;
            }
            ECEntranceNewArchModel eCEntranceNewArchModel = (ECEntranceNewArchModel) obj;
            return this.pdpSwitch == eCEntranceNewArchModel.pdpSwitch && this.anchorSwitch == eCEntranceNewArchModel.anchorSwitch && this.commentTopSwitch == eCEntranceNewArchModel.commentTopSwitch && this.feedBarSwitch == eCEntranceNewArchModel.feedBarSwitch && this.fashionChannelSwitch == eCEntranceNewArchModel.fashionChannelSwitch && this.mallSwitch == eCEntranceNewArchModel.mallSwitch;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v15 */
        /* JADX WARN: Type inference failed for: r0v16 */
        /* JADX WARN: Type inference failed for: r0v2, types: [boolean] */
        /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
        /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
        /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
        public final int hashCode() {
            boolean z = this.pdpSwitch;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            int i = r0 * 31;
            ?? r02 = this.anchorSwitch;
            int i2 = r02;
            if (r02 != 0) {
                i2 = 1;
            }
            int i3 = (i + i2) * 31;
            ?? r03 = this.commentTopSwitch;
            int i4 = r03;
            if (r03 != 0) {
                i4 = 1;
            }
            int i5 = (i3 + i4) * 31;
            ?? r04 = this.feedBarSwitch;
            int i6 = r04;
            if (r04 != 0) {
                i6 = 1;
            }
            int i7 = (i5 + i6) * 31;
            ?? r05 = this.fashionChannelSwitch;
            int i8 = r05;
            if (r05 != 0) {
                i8 = 1;
            }
            return ((i7 + i8) * 31) + (this.mallSwitch ? 1 : 0);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ECEntranceNewArchModel(pdpSwitch=");
            LIZ.append(this.pdpSwitch);
            LIZ.append(", anchorSwitch=");
            LIZ.append(this.anchorSwitch);
            LIZ.append(", commentTopSwitch=");
            LIZ.append(this.commentTopSwitch);
            LIZ.append(", feedBarSwitch=");
            LIZ.append(this.feedBarSwitch);
            LIZ.append(", fashionChannelSwitch=");
            LIZ.append(this.fashionChannelSwitch);
            LIZ.append(", mallSwitch=");
            return C48339Iy7.LIZJ(LIZ, this.mallSwitch, ')', LIZ);
        }

        public ECEntranceNewArchModel(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
            this.pdpSwitch = z;
            this.anchorSwitch = z2;
            this.commentTopSwitch = z3;
            this.feedBarSwitch = z4;
            this.fashionChannelSwitch = z5;
            this.mallSwitch = z6;
        }
    }

    static {
        new ECEntranceNewArchModel(true, true, false, false, false, false);
        new ECEntranceNewArchModel(true, true, true, true, true, true);
    }

    public static boolean LIZ(EnumC51280KAq enumC51280KAq) {
        FFL LJIIIZ = FFL.LJIIIZ();
        ECEntranceNewArchModel eCEntranceNewArchModel = LIZIZ;
        LJIIIZ.getClass();
        ECEntranceNewArchModel eCEntranceNewArchModel2 = (ECEntranceNewArchModel) FFL.LJIJ(true, "ec_search_entrance_new_arch", 31744, ECEntranceNewArchModel.class, eCEntranceNewArchModel);
        if (eCEntranceNewArchModel2 != null) {
            eCEntranceNewArchModel = eCEntranceNewArchModel2;
        }
        o.LJIIIIZZ(eCEntranceNewArchModel, "ABManager.getInstance()\n…h::class.java) ?: DEFAULT");
        if (enumC51280KAq != null) {
            switch (C51279KAp.LIZ[enumC51280KAq.ordinal()]) {
                case 1:
                    return eCEntranceNewArchModel.pdpSwitch;
                case 2:
                    return eCEntranceNewArchModel.anchorSwitch;
                case 3:
                    return eCEntranceNewArchModel.commentTopSwitch;
                case 4:
                    return eCEntranceNewArchModel.feedBarSwitch;
                case 5:
                    return eCEntranceNewArchModel.fashionChannelSwitch;
                case 6:
                case 7:
                case 8:
                    return eCEntranceNewArchModel.mallSwitch;
                case 9:
                case 10:
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                case 12:
                case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                case 14:
                case 15:
                case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                case 17:
                    return true;
            }
        }
        return false;
    }
}

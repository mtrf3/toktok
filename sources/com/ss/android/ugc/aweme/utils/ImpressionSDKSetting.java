package com.ss.android.ugc.aweme.utils;

import X.C48339Iy7;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.bytedance.ies.abmock.SettingsManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class ImpressionSDKSetting {
    public static final ImpressionSDK LIZ = new ImpressionSDK(new BannerShowImpression(false, true));

    /* loaded from: classes11.dex */
    public static final class BannerShowImpression {

        @InterfaceC65349Pkn("enable")
        public final boolean enable;

        @InterfaceC65349Pkn("use_one_pixel")
        public final boolean useOnePixel;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public BannerShowImpression() {
            /*
                r3 = this;
                r2 = 3
                r1 = 0
                r0 = 0
                r3.<init>(r0, r0, r2, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.utils.ImpressionSDKSetting.BannerShowImpression.<init>():void");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BannerShowImpression)) {
                return false;
            }
            BannerShowImpression bannerShowImpression = (BannerShowImpression) obj;
            return this.enable == bannerShowImpression.enable && this.useOnePixel == bannerShowImpression.useOnePixel;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v4 */
        public final int hashCode() {
            boolean z = this.enable;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            return (r0 * 31) + (this.useOnePixel ? 1 : 0);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("BannerShowImpression(enable=");
            LIZ.append(this.enable);
            LIZ.append(", useOnePixel=");
            return C48339Iy7.LIZJ(LIZ, this.useOnePixel, ')', LIZ);
        }

        public BannerShowImpression(boolean z, boolean z2) {
            this.enable = z;
            this.useOnePixel = z2;
        }

        public /* synthetic */ BannerShowImpression(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? true : z2);
        }
    }

    public static final ImpressionSDK LIZ() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        ImpressionSDK impressionSDK = LIZ;
        ImpressionSDK impressionSDK2 = (ImpressionSDK) LIZLLL.LJIIIIZZ("impression_sdk_setting", ImpressionSDK.class, impressionSDK);
        if (impressionSDK2 == null) {
            return impressionSDK;
        }
        return impressionSDK2;
    }

    /* loaded from: classes11.dex */
    public static final class ImpressionSDK {

        @InterfaceC65349Pkn("banner_show_impression")
        public final BannerShowImpression bannerShowImpression;

        /* JADX WARN: Multi-variable type inference failed */
        public ImpressionSDK() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ImpressionSDK) && o.LJ(this.bannerShowImpression, ((ImpressionSDK) obj).bannerShowImpression);
        }

        public final int hashCode() {
            return this.bannerShowImpression.hashCode();
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ImpressionSDK(bannerShowImpression=");
            LIZ.append(this.bannerShowImpression);
            LIZ.append(')');
            return X1D.LIZIZ(LIZ);
        }

        public ImpressionSDK(BannerShowImpression bannerShowImpression) {
            o.LJIIIZ(bannerShowImpression, "bannerShowImpression");
            this.bannerShowImpression = bannerShowImpression;
        }

        public /* synthetic */ ImpressionSDK(BannerShowImpression bannerShowImpression, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new BannerShowImpression(false, true) : bannerShowImpression);
        }
    }
}

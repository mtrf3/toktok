package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.AnonymousClass391;
import X.C47261Igj;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverMinSizeSetting;
import defpackage.b0;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class EcMainImageSizeOptSettings {
    public static final EcMainImageSizeOptSettingsModel LIZ = new EcMainImageSizeOptSettingsModel(C47261Igj.LJJIJIIJI(new Size(150), new Size(LiveCoverMinSizeSetting.DEFAULT), new Size(300)), C47261Igj.LJJIJIIJI(new Size(150), new Size(180), new Size(216)), C47261Igj.LJJIJIIJI(new Size(150), new Size(LiveCoverMinSizeSetting.DEFAULT), new Size(300)), C47261Igj.LJJIJIIJI(new Size(600), new Size(600), new Size(800)), new DeviceLevelClass(new NetLevel(2, 2), new NetLevel(1, 1), new NetLevel(1, 2), new NetLevel(1, 3)));

    /* loaded from: classes12.dex */
    public static final class EcMainImageSizeOptSettingsModel {

        @InterfaceC65349Pkn("grade")
        public final DeviceLevelClass grade;

        @InterfaceC65349Pkn("live_bag_cart")
        public final List<Size> liveBagCart;

        @InterfaceC65349Pkn("live_pop_cart")
        public final List<Size> livePopCart;

        @InterfaceC65349Pkn("pdp_head")
        public final List<Size> pdpHead;

        @InterfaceC65349Pkn("video_anchor")
        public final List<Size> videoAnchor;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EcMainImageSizeOptSettingsModel)) {
                return false;
            }
            EcMainImageSizeOptSettingsModel ecMainImageSizeOptSettingsModel = (EcMainImageSizeOptSettingsModel) obj;
            return o.LJ(this.videoAnchor, ecMainImageSizeOptSettingsModel.videoAnchor) && o.LJ(this.livePopCart, ecMainImageSizeOptSettingsModel.livePopCart) && o.LJ(this.liveBagCart, ecMainImageSizeOptSettingsModel.liveBagCart) && o.LJ(this.pdpHead, ecMainImageSizeOptSettingsModel.pdpHead) && o.LJ(this.grade, ecMainImageSizeOptSettingsModel.grade);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("EcMainImageSizeOptSettingsModel(videoAnchor=");
            LIZ.append(this.videoAnchor);
            LIZ.append(", livePopCart=");
            LIZ.append(this.livePopCart);
            LIZ.append(", liveBagCart=");
            LIZ.append(this.liveBagCart);
            LIZ.append(", pdpHead=");
            LIZ.append(this.pdpHead);
            LIZ.append(", grade=");
            LIZ.append(this.grade);
            LIZ.append(')');
            return X1D.LIZIZ(LIZ);
        }

        public final int hashCode() {
            return this.grade.hashCode() + AnonymousClass391.LIZIZ(this.pdpHead, AnonymousClass391.LIZIZ(this.liveBagCart, AnonymousClass391.LIZIZ(this.livePopCart, this.videoAnchor.hashCode() * 31, 31), 31), 31);
        }

        public EcMainImageSizeOptSettingsModel(List<Size> videoAnchor, List<Size> livePopCart, List<Size> liveBagCart, List<Size> pdpHead, DeviceLevelClass grade) {
            o.LJIIIZ(videoAnchor, "videoAnchor");
            o.LJIIIZ(livePopCart, "livePopCart");
            o.LJIIIZ(liveBagCart, "liveBagCart");
            o.LJIIIZ(pdpHead, "pdpHead");
            o.LJIIIZ(grade, "grade");
            this.videoAnchor = videoAnchor;
            this.livePopCart = livePopCart;
            this.liveBagCart = liveBagCart;
            this.pdpHead = pdpHead;
            this.grade = grade;
        }
    }

    /* loaded from: classes12.dex */
    public static final class NetLevel {

        @InterfaceC65349Pkn("low")
        public final int low;

        @InterfaceC65349Pkn("normal")
        public final int normal;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NetLevel)) {
                return false;
            }
            NetLevel netLevel = (NetLevel) obj;
            return this.low == netLevel.low && this.normal == netLevel.normal;
        }

        public final int hashCode() {
            return (this.low * 31) + this.normal;
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("NetLevel(low=");
            LIZ.append(this.low);
            LIZ.append(", normal=");
            return b0.LIZJ(LIZ, this.normal, ')', LIZ);
        }

        public NetLevel(int i, int i2) {
            this.low = i;
            this.normal = i2;
        }
    }

    /* loaded from: classes12.dex */
    public static final class Size {

        @InterfaceC65349Pkn("width")
        public final int width;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Size) && this.width == ((Size) obj).width;
        }

        public final int hashCode() {
            return this.width;
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Size(width=");
            return b0.LIZJ(LIZ, this.width, ')', LIZ);
        }

        public Size(int i) {
            this.width = i;
        }
    }

    /* loaded from: classes12.dex */
    public static final class DeviceLevelClass {

        @InterfaceC65349Pkn("high")
        public final NetLevel high;

        @InterfaceC65349Pkn("low")
        public final NetLevel low;

        @InterfaceC65349Pkn("middle")
        public final NetLevel middle;

        @InterfaceC65349Pkn("unknown")
        public final NetLevel unknown;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DeviceLevelClass)) {
                return false;
            }
            DeviceLevelClass deviceLevelClass = (DeviceLevelClass) obj;
            return o.LJ(this.unknown, deviceLevelClass.unknown) && o.LJ(this.low, deviceLevelClass.low) && o.LJ(this.middle, deviceLevelClass.middle) && o.LJ(this.high, deviceLevelClass.high);
        }

        public final int hashCode() {
            return this.high.hashCode() + ((this.middle.hashCode() + ((this.low.hashCode() + (this.unknown.hashCode() * 31)) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("DeviceLevelClass(unknown=");
            LIZ.append(this.unknown);
            LIZ.append(", low=");
            LIZ.append(this.low);
            LIZ.append(", middle=");
            LIZ.append(this.middle);
            LIZ.append(", high=");
            LIZ.append(this.high);
            LIZ.append(')');
            return X1D.LIZIZ(LIZ);
        }

        public DeviceLevelClass(NetLevel unknown, NetLevel low, NetLevel middle, NetLevel high) {
            o.LJIIIZ(unknown, "unknown");
            o.LJIIIZ(low, "low");
            o.LJIIIZ(middle, "middle");
            o.LJIIIZ(high, "high");
            this.unknown = unknown;
            this.low = low;
            this.middle = middle;
            this.high = high;
        }
    }
}

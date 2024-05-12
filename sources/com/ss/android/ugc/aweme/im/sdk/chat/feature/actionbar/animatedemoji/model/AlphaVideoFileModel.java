package com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.animatedemoji.model;

import X.C0JT;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.live.alphaplayer.model.DataSource;
import java.util.Arrays;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class AlphaVideoFileModel {

    @InterfaceC65349Pkn("landscape")
    public final Item landscape;

    @InterfaceC65349Pkn("portrait")
    public final Item portrait;

    /* loaded from: classes2.dex */
    public static final class Item {

        @InterfaceC65349Pkn("h")
        public final int actualHeight;

        @InterfaceC65349Pkn("w")
        public final int actualWidth;

        @InterfaceC65349Pkn("align")
        public final int align;

        @InterfaceC65349Pkn("aFrame")
        public final int[] alphaFrame;

        @InterfaceC65349Pkn("masks")
        public final Map<String, Map<String, DataSource.Element>> masks;

        @InterfaceC65349Pkn("path")
        public final String path;

        @InterfaceC65349Pkn("rgbFrame")
        public final int[] rgbFrame;

        @InterfaceC65349Pkn("f")
        public final int totalFrame;

        @InterfaceC65349Pkn("v")
        public final int version;

        @InterfaceC65349Pkn("videoH")
        public final int videoHeight;

        @InterfaceC65349Pkn("videoW")
        public final int videoWidth;

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public Item() {
            /*
                r14 = this;
                r1 = 0
                r2 = 0
                r12 = 2047(0x7ff, float:2.868E-42)
                r0 = r14
                r3 = r2
                r4 = r2
                r5 = r2
                r6 = r2
                r7 = r2
                r8 = r2
                r9 = r1
                r10 = r1
                r11 = r1
                r13 = r1
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.animatedemoji.model.AlphaVideoFileModel.Item.<init>():void");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            return o.LJ(this.path, item.path) && this.align == item.align && this.version == item.version && this.totalFrame == item.totalFrame && this.actualWidth == item.actualWidth && this.actualHeight == item.actualHeight && this.videoWidth == item.videoWidth && this.videoHeight == item.videoHeight && o.LJ(this.alphaFrame, item.alphaFrame) && o.LJ(this.rgbFrame, item.rgbFrame) && o.LJ(this.masks, item.masks);
        }

        public final int hashCode() {
            String str = this.path;
            int hashCode = (((((((((((((((str == null ? 0 : str.hashCode()) * 31) + this.align) * 31) + this.version) * 31) + this.totalFrame) * 31) + this.actualWidth) * 31) + this.actualHeight) * 31) + this.videoWidth) * 31) + this.videoHeight) * 31;
            int[] iArr = this.alphaFrame;
            int hashCode2 = (hashCode + (iArr == null ? 0 : Arrays.hashCode(iArr))) * 31;
            int[] iArr2 = this.rgbFrame;
            int hashCode3 = (hashCode2 + (iArr2 == null ? 0 : Arrays.hashCode(iArr2))) * 31;
            Map<String, Map<String, DataSource.Element>> map = this.masks;
            return hashCode3 + (map != null ? map.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Item(path=");
            sb.append(this.path);
            sb.append(", align=");
            sb.append(this.align);
            sb.append(", version=");
            sb.append(this.version);
            sb.append(", totalFrame=");
            sb.append(this.totalFrame);
            sb.append(", actualWidth=");
            sb.append(this.actualWidth);
            sb.append(", actualHeight=");
            sb.append(this.actualHeight);
            sb.append(", videoWidth=");
            sb.append(this.videoWidth);
            sb.append(", videoHeight=");
            sb.append(this.videoHeight);
            sb.append(", alphaFrame=");
            C0JT.LIZLLL(this.alphaFrame, sb, ", rgbFrame=");
            C0JT.LIZLLL(this.rgbFrame, sb, ", masks=");
            sb.append(this.masks);
            sb.append(')');
            return sb.toString();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Item(String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int[] iArr, int[] iArr2, Map<String, ? extends Map<String, DataSource.Element>> map) {
            this.path = str;
            this.align = i;
            this.version = i2;
            this.totalFrame = i3;
            this.actualWidth = i4;
            this.actualHeight = i5;
            this.videoWidth = i6;
            this.videoHeight = i7;
            this.alphaFrame = iArr;
            this.rgbFrame = iArr2;
            this.masks = map;
        }

        public /* synthetic */ Item(String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int[] iArr, int[] iArr2, Map map, int i8, DefaultConstructorMarker defaultConstructorMarker) {
            this((i8 & 1) != 0 ? null : str, (i8 & 2) != 0 ? 0 : i, (i8 & 4) != 0 ? 0 : i2, (i8 & 8) != 0 ? 0 : i3, (i8 & 16) != 0 ? 0 : i4, (i8 & 32) != 0 ? 0 : i5, (i8 & 64) != 0 ? 0 : i6, (i8 & 128) == 0 ? i7 : 0, (i8 & 256) != 0 ? null : iArr, (i8 & 512) != 0 ? null : iArr2, (i8 & 1024) == 0 ? map : null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AlphaVideoFileModel() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AlphaVideoFileModel)) {
            return false;
        }
        AlphaVideoFileModel alphaVideoFileModel = (AlphaVideoFileModel) obj;
        return o.LJ(this.portrait, alphaVideoFileModel.portrait) && o.LJ(this.landscape, alphaVideoFileModel.landscape);
    }

    public final int hashCode() {
        Item item = this.portrait;
        int hashCode = (item == null ? 0 : item.hashCode()) * 31;
        Item item2 = this.landscape;
        return hashCode + (item2 != null ? item2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AlphaVideoFileModel(portrait=");
        LIZ.append(this.portrait);
        LIZ.append(", landscape=");
        LIZ.append(this.landscape);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public AlphaVideoFileModel(Item item, Item item2) {
        this.portrait = item;
        this.landscape = item2;
    }

    public /* synthetic */ AlphaVideoFileModel(Item item, Item item2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : item, (i & 2) != 0 ? null : item2);
    }
}

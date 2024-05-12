package com.bytedance.android.livesdk.model;

import X.C78966Uyw;
import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.ImageModel;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class RoomSticker extends Sticker {
    public boolean LIZIZ;

    @InterfaceC65349Pkn("bottom_right_h")
    public int bottomRightHeight;

    @InterfaceC65349Pkn("bottom_right_w")
    public int bottomRightWidth;

    @InterfaceC65349Pkn("content_key")
    public String contentKey;

    @InterfaceC65349Pkn("edited")
    public boolean edited;

    @InterfaceC65349Pkn("image")
    public ImageModel image;

    @InterfaceC65349Pkn("name")
    public String name;

    @InterfaceC65349Pkn("nine_patch_image")
    public ImageModel ninePatchImage;

    @InterfaceC65349Pkn("review_status")
    public int reviewStatus;

    @InterfaceC65349Pkn("top_left_h")
    public int topLeftHeight;

    @InterfaceC65349Pkn("top_left_w")
    public int topLeftWidth;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public RoomSticker() {
        /*
            r14 = this;
            r1 = 0
            r2 = 0
            r12 = 2047(0x7ff, float:2.868E-42)
            r0 = r14
            r3 = r2
            r4 = r1
            r5 = r1
            r6 = r1
            r7 = r1
            r8 = r2
            r9 = r2
            r10 = r1
            r11 = r1
            r13 = r2
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.model.RoomSticker.<init>():void");
    }

    public final Object[] LIZIZ() {
        return new Object[]{Boolean.valueOf(this.LIZIZ), this.image, this.ninePatchImage, Integer.valueOf(this.topLeftHeight), Integer.valueOf(this.topLeftWidth), Integer.valueOf(this.bottomRightHeight), Integer.valueOf(this.bottomRightWidth), this.contentKey, this.name, Integer.valueOf(this.reviewStatus), Boolean.valueOf(this.edited)};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RoomSticker) {
            return C78966Uyw.LJIIIZ(((RoomSticker) obj).LIZIZ(), LIZIZ());
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(LIZIZ());
    }

    public final String toString() {
        return C78966Uyw.LJJJLL("RoomSticker:%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s", LIZIZ());
    }

    public static RoomSticker LIZ(RoomSticker roomSticker) {
        boolean z = roomSticker.LIZIZ;
        ImageModel imageModel = roomSticker.image;
        ImageModel imageModel2 = roomSticker.ninePatchImage;
        int i = roomSticker.topLeftHeight;
        int i2 = roomSticker.topLeftWidth;
        int i3 = roomSticker.bottomRightHeight;
        int i4 = roomSticker.bottomRightWidth;
        String contentKey = roomSticker.contentKey;
        String name = roomSticker.name;
        int i5 = roomSticker.reviewStatus;
        boolean z2 = roomSticker.edited;
        roomSticker.getClass();
        o.LJIIIZ(contentKey, "contentKey");
        o.LJIIIZ(name, "name");
        return new RoomSticker(z, imageModel, imageModel2, i, i2, i3, i4, contentKey, name, i5, z2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoomSticker(boolean z, ImageModel imageModel, ImageModel imageModel2, int i, int i2, int i3, int i4, String contentKey, String name, int i5, boolean z2) {
        super(null, 0L, 0, null, null, 0, 0, 0, 0, 0, 1023, null);
        o.LJIIIZ(contentKey, "contentKey");
        o.LJIIIZ(name, "name");
        this.LIZIZ = z;
        this.image = imageModel;
        this.ninePatchImage = imageModel2;
        this.topLeftHeight = i;
        this.topLeftWidth = i2;
        this.bottomRightHeight = i3;
        this.bottomRightWidth = i4;
        this.contentKey = contentKey;
        this.name = name;
        this.reviewStatus = i5;
        this.edited = z2;
    }

    public /* synthetic */ RoomSticker(boolean z, ImageModel imageModel, ImageModel imageModel2, int i, int i2, int i3, int i4, String str, String str2, int i5, boolean z2, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? false : z, (i6 & 2) != 0 ? null : imageModel, (i6 & 4) == 0 ? imageModel2 : null, (i6 & 8) != 0 ? 0 : i, (i6 & 16) != 0 ? 0 : i2, (i6 & 32) != 0 ? 0 : i3, (i6 & 64) != 0 ? 0 : i4, (i6 & 128) != 0 ? "" : str, (i6 & 256) == 0 ? str2 : "", (i6 & 512) != 0 ? 0 : i5, (i6 & 1024) == 0 ? z2 : false);
    }
}

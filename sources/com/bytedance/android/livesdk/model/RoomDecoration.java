package com.bytedance.android.livesdk.model;

import X.C78966Uyw;
import X.InterfaceC65349Pkn;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.ImageModel;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class RoomDecoration extends Sticker {

    @InterfaceC65349Pkn("image")
    public ImageModel image;

    @InterfaceC65349Pkn("input_rect")
    public List<Long> inputRect;

    @InterfaceC65349Pkn("kind")
    public long kind;

    @InterfaceC65349Pkn("max_length")
    public long maxLength;

    @InterfaceC65349Pkn("sit_rect")
    public List<Double> sit_rect;

    @InterfaceC65349Pkn("status")
    public long status;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public RoomDecoration() {
        /*
            r12 = this;
            r1 = 0
            r2 = 0
            r10 = 63
            r0 = r12
            r4 = r1
            r5 = r2
            r7 = r2
            r9 = r1
            r11 = r1
            r0.<init>(r1, r2, r4, r5, r7, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.model.RoomDecoration.<init>():void");
    }

    public final Object[] LIZIZ() {
        return new Object[]{this.image, Long.valueOf(this.maxLength), this.inputRect, Long.valueOf(this.status), Long.valueOf(this.kind), this.sit_rect};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RoomDecoration) {
            return C78966Uyw.LJIIIZ(((RoomDecoration) obj).LIZIZ(), LIZIZ());
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(LIZIZ());
    }

    public final String toString() {
        return C78966Uyw.LJJJLL("RoomDecoration:%s,%s,%s,%s,%s,%s", LIZIZ());
    }

    public final OrganizationModel LIZ() {
        if (!TextUtils.isEmpty(this.content)) {
            try {
                return (OrganizationModel) new Gson().LJI(this.content, OrganizationModel.class);
            } catch (Exception unused) {
                return null;
            }
        }
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoomDecoration(ImageModel imageModel, long j, List<Long> inputRect, long j2, long j3, List<Double> list) {
        super(null, 0L, 0, null, null, 0, 0, 0, 0, 0, 1023, null);
        o.LJIIIZ(inputRect, "inputRect");
        this.image = imageModel;
        this.maxLength = j;
        this.inputRect = inputRect;
        this.status = j2;
        this.kind = j3;
        this.sit_rect = list;
    }

    public /* synthetic */ RoomDecoration(ImageModel imageModel, long j, List list, long j2, long j3, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : imageModel, (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? new ArrayList() : list, (i & 8) != 0 ? 0L : j2, (i & 16) == 0 ? j3 : 0L, (i & 32) == 0 ? list2 : null);
    }
}

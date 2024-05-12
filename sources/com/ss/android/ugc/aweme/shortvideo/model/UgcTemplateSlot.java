package com.ss.android.ugc.aweme.shortvideo.model;

import X.C16880lQ;
import X.C1JX;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class UgcTemplateSlot implements Parcelable {

    @InterfaceC65349Pkn("clip_end")
    public final double clipEnd;

    @InterfaceC65349Pkn("clip_start")
    public final double clipStart;

    @InterfaceC65349Pkn("endtime")
    public final double endTime;

    @InterfaceC65349Pkn("source")
    public final String source;

    @InterfaceC65349Pkn("starttime")
    public final double startTime;

    @InterfaceC65349Pkn("type")
    public final String type;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<UgcTemplateSlot> CREATOR = new Creator();

    /* loaded from: classes8.dex */
    public static final class Creator implements Parcelable.Creator<UgcTemplateSlot> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UgcTemplateSlot createFromParcel(Parcel parcel) {
            o.LJIIIZ(parcel, "parcel");
            return new UgcTemplateSlot(parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UgcTemplateSlot[] newArray(int i) {
            return new UgcTemplateSlot[i];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public UgcTemplateSlot() {
        /*
            r13 = this;
            r1 = 0
            r9 = 0
            r11 = 63
            r0 = r13
            r3 = r1
            r5 = r1
            r7 = r1
            r10 = r9
            r12 = r9
            r0.<init>(r1, r3, r5, r7, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.model.UgcTemplateSlot.<init>():void");
    }

    public static /* synthetic */ UgcTemplateSlot copy$default(UgcTemplateSlot ugcTemplateSlot, double d, double d2, double d3, double d4, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            d = ugcTemplateSlot.startTime;
        }
        if ((i & 2) != 0) {
            d2 = ugcTemplateSlot.endTime;
        }
        if ((i & 4) != 0) {
            d3 = ugcTemplateSlot.clipStart;
        }
        if ((i & 8) != 0) {
            d4 = ugcTemplateSlot.clipEnd;
        }
        if ((i & 16) != 0) {
            str = ugcTemplateSlot.source;
        }
        if ((i & 32) != 0) {
            str2 = ugcTemplateSlot.type;
        }
        return ugcTemplateSlot.copy(d, d2, d3, d4, str, str2);
    }

    public final UgcTemplateSlot copy(double d, double d2, double d3, double d4, String str, String str2) {
        return new UgcTemplateSlot(d, d2, d3, d4, str, str2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UgcTemplateSlot)) {
            return false;
        }
        UgcTemplateSlot ugcTemplateSlot = (UgcTemplateSlot) obj;
        return Double.compare(this.startTime, ugcTemplateSlot.startTime) == 0 && Double.compare(this.endTime, ugcTemplateSlot.endTime) == 0 && Double.compare(this.clipStart, ugcTemplateSlot.clipStart) == 0 && Double.compare(this.clipEnd, ugcTemplateSlot.clipEnd) == 0 && o.LJ(this.source, ugcTemplateSlot.source) && o.LJ(this.type, ugcTemplateSlot.type);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeDouble(this.startTime);
        out.writeDouble(this.endTime);
        out.writeDouble(this.clipStart);
        out.writeDouble(this.clipEnd);
        out.writeString(this.source);
        out.writeString(this.type);
    }

    public final double getDuration() {
        return this.clipEnd - this.clipStart;
    }

    public final double getSlotEndTTime() {
        double d = this.clipEnd - this.clipStart;
        double d2 = this.endTime;
        if (d2 < LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
            return getSlotStartTime() + d;
        }
        return d2;
    }

    public final double getSlotStartTime() {
        double d = this.startTime;
        if (d < LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
            return LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        }
        return d;
    }

    public int hashCode() {
        int hashCode;
        int LIZIZ = C1JX.LIZIZ(this.clipEnd, C1JX.LIZIZ(this.clipStart, C1JX.LIZIZ(this.endTime, C16880lQ.LLJI(this.startTime) * 31, 31), 31), 31);
        String str = this.source;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (LIZIZ + hashCode) * 31;
        String str2 = this.type;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UgcTemplateSlot(startTime=");
        LIZ.append(this.startTime);
        LIZ.append(", endTime=");
        LIZ.append(this.endTime);
        LIZ.append(", slotStartTime=");
        LIZ.append(getSlotStartTime());
        LIZ.append(", slotEndTime=");
        LIZ.append(getSlotEndTTime());
        LIZ.append(", clipStart=");
        LIZ.append(this.clipStart);
        LIZ.append(", clipEnd=");
        LIZ.append(this.clipEnd);
        LIZ.append(", source=");
        LIZ.append(this.source);
        LIZ.append(", type=");
        return q.LIZIZ(LIZ, this.type, ')', LIZ);
    }

    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public final boolean hasCross(UgcTemplateSlot slot) {
        o.LJIIIZ(slot, "slot");
        double slotStartTime = getSlotStartTime();
        double slotEndTTime = getSlotEndTTime();
        double slotStartTime2 = slot.getSlotStartTime();
        double slotEndTTime2 = slot.getSlotEndTTime();
        double d = slotStartTime - slotStartTime2;
        if (1.0E-6d < d && 1.0E-6d < slotEndTTime2 - slotStartTime) {
            return true;
        }
        if ((1.0E-6d <= slotStartTime2 - slotStartTime || slotStartTime2 == slotStartTime) && (1.0E-6d <= slotEndTTime - slotEndTTime2 || slotEndTTime == slotEndTTime2)) {
            return true;
        }
        if ((1.0E-6d <= d || slotStartTime == slotStartTime2) && (1.0E-6d <= slotEndTTime2 - slotEndTTime || slotEndTTime2 == slotEndTTime)) {
            return true;
        }
        if (1.0E-6d < slotEndTTime - slotStartTime2 && 1.0E-6d < slotEndTTime2 - slotEndTTime) {
            return true;
        }
        return false;
    }

    public UgcTemplateSlot(double d, double d2, double d3, double d4, String str, String str2) {
        this.startTime = d;
        this.endTime = d2;
        this.clipStart = d3;
        this.clipEnd = d4;
        this.source = str;
        this.type = str2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ UgcTemplateSlot(double r12, double r14, double r16, double r18, java.lang.String r20, java.lang.String r21, int r22, kotlin.jvm.internal.DefaultConstructorMarker r23) {
        /*
            r11 = this;
            r9 = r20
            r5 = r16
            r1 = r12
            r3 = r14
            r0 = r22 & 1
            r7 = 0
            if (r0 == 0) goto Le
            r1 = 0
        Le:
            r0 = r22 & 2
            if (r0 == 0) goto L14
            r3 = 0
        L14:
            r0 = r22 & 4
            if (r0 == 0) goto L1a
            r5 = 0
        L1a:
            r0 = r22 & 8
            if (r0 == 0) goto L30
        L1e:
            r0 = r22 & 16
            r10 = 0
            if (r0 == 0) goto L24
            r9 = r10
        L24:
            r0 = r22 & 32
            if (r0 == 0) goto L2d
        L28:
            r0 = r11
            r0.<init>(r1, r3, r5, r7, r9, r10)
            return
        L2d:
            r10 = r21
            goto L28
        L30:
            r7 = r18
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.model.UgcTemplateSlot.<init>(double, double, double, double, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}

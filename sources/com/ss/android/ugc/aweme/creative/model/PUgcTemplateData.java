package com.ss.android.ugc.aweme.creative.model;

import X.C00F;
import X.GL5;
import X.GPV;
import X.InterfaceC65349Pkn;
import X.UC7;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class PUgcTemplateData implements Parcelable {
    public static final Parcelable.Creator<PUgcTemplateData> CREATOR = new GL5();

    @InterfaceC65349Pkn("can_post")
    public boolean canPostTemplate;

    @GPV
    public int contentCnt;

    @GPV
    public List<Integer> fixedSlotIndex;

    @GPV
    public List<String> fixedSlots;

    @GPV
    public String pugcTemplateZipUrl;

    @GPV
    public List<Integer> slotDurations;

    @GPV
    public String uploadVid;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public PUgcTemplateData() {
        /*
            r10 = this;
            r1 = 0
            r2 = 0
            r8 = 127(0x7f, float:1.78E-43)
            r0 = r10
            r3 = r1
            r4 = r1
            r5 = r1
            r6 = r2
            r7 = r1
            r9 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.creative.model.PUgcTemplateData.<init>():void");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.pugcTemplateZipUrl);
        out.writeInt(this.canPostTemplate ? 1 : 0);
        out.writeStringList(this.fixedSlots);
        Iterator LIZJ = UC7.LIZJ(this.fixedSlotIndex, out);
        while (LIZJ.hasNext()) {
            out.writeInt(((Number) LIZJ.next()).intValue());
        }
        out.writeString(this.uploadVid);
        out.writeInt(this.contentCnt);
        Iterator LIZJ2 = UC7.LIZJ(this.slotDurations, out);
        while (LIZJ2.hasNext()) {
            out.writeInt(((Number) LIZJ2.next()).intValue());
        }
    }

    public PUgcTemplateData(String str, boolean z, List<String> list, List<Integer> list2, String str2, int i, List<Integer> list3) {
        C00F.LJ(list, "fixedSlots", list2, "fixedSlotIndex", list3, "slotDurations");
        this.pugcTemplateZipUrl = str;
        this.canPostTemplate = z;
        this.fixedSlots = list;
        this.fixedSlotIndex = list2;
        this.uploadVid = str2;
        this.contentCnt = i;
        this.slotDurations = list3;
    }

    public /* synthetic */ PUgcTemplateData(String str, boolean z, List list, List list2, String str2, int i, List list3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? new ArrayList() : list, (i2 & 8) != 0 ? new ArrayList() : list2, (i2 & 16) == 0 ? str2 : null, (i2 & 32) == 0 ? i : 0, (i2 & 64) != 0 ? new ArrayList() : list3);
    }
}

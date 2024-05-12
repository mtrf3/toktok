package com.ss.android.ugc.aweme.pns.agegate.data;

import X.C1NE;
import X.EnumC86062Xq6;
import X.IN4;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.pns.agegate.PNSAgeConfirmOption;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class PNSDialogModel implements Serializable {
    public final boolean LJLIL;
    public final boolean LJLILLLLZI;
    public final boolean LJLJI;
    public final List<PNSHyperlink> LJLJJI;

    @InterfaceC65349Pkn("alignment_type")
    public final int alignmentType;

    @InterfaceC65349Pkn("description")
    public final String message;

    @InterfaceC65349Pkn("options")
    public final List<PNSAgeConfirmOption> options;

    @InterfaceC65349Pkn("style")
    public final Integer style;

    @InterfaceC65349Pkn("title")
    public final String title;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public PNSDialogModel() {
        /*
            r12 = this;
            r1 = 0
            r5 = 0
            r10 = 511(0x1ff, float:7.16E-43)
            r0 = r12
            r2 = r1
            r3 = r1
            r4 = r1
            r6 = r5
            r7 = r5
            r8 = r5
            r9 = r1
            r11 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.pns.agegate.data.PNSDialogModel.<init>():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PNSDialogModel copy$default(PNSDialogModel pNSDialogModel, String str, String str2, List list, Integer num, int i, boolean z, boolean z2, boolean z3, List list2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = pNSDialogModel.message;
        }
        if ((i2 & 2) != 0) {
            str2 = pNSDialogModel.title;
        }
        if ((i2 & 4) != 0) {
            list = pNSDialogModel.options;
        }
        if ((i2 & 8) != 0) {
            num = pNSDialogModel.style;
        }
        if ((i2 & 16) != 0) {
            i = pNSDialogModel.alignmentType;
        }
        if ((i2 & 32) != 0) {
            z = pNSDialogModel.LJLIL;
        }
        if ((i2 & 64) != 0) {
            z2 = pNSDialogModel.LJLILLLLZI;
        }
        if ((i2 & 128) != 0) {
            z3 = pNSDialogModel.LJLJI;
        }
        if ((i2 & 256) != 0) {
            list2 = pNSDialogModel.LJLJJI;
        }
        return pNSDialogModel.copy(str, str2, list, num, i, z, z2, z3, list2);
    }

    public final PNSDialogModel copy(String str, String str2, List<PNSAgeConfirmOption> list, Integer num, int i, boolean z, boolean z2, boolean z3, List<PNSHyperlink> list2) {
        return new PNSDialogModel(str, str2, list, num, i, z, z2, z3, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PNSDialogModel)) {
            return false;
        }
        PNSDialogModel pNSDialogModel = (PNSDialogModel) obj;
        return o.LJ(this.message, pNSDialogModel.message) && o.LJ(this.title, pNSDialogModel.title) && o.LJ(this.options, pNSDialogModel.options) && o.LJ(this.style, pNSDialogModel.style) && this.alignmentType == pNSDialogModel.alignmentType && this.LJLIL == pNSDialogModel.LJLIL && this.LJLILLLLZI == pNSDialogModel.LJLILLLLZI && this.LJLJI == pNSDialogModel.LJLJI && o.LJ(this.LJLJJI, pNSDialogModel.LJLJJI);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.message;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<PNSAgeConfirmOption> list = this.options;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.style;
        int hashCode4 = (((hashCode3 + (num == null ? 0 : num.hashCode())) * 31) + this.alignmentType) * 31;
        boolean z = this.LJLIL;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode4 + i) * 31;
        boolean z2 = this.LJLILLLLZI;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (((i2 + i3) * 31) + (this.LJLJI ? 1 : 0)) * 31;
        List<PNSHyperlink> list2 = this.LJLJJI;
        return i4 + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PNSDialogModel(message=");
        LIZ.append((Object) this.message);
        LIZ.append(", title=");
        LIZ.append((Object) this.title);
        LIZ.append(", options=");
        LIZ.append(this.options);
        LIZ.append(", style=");
        LIZ.append(this.style);
        LIZ.append(", alignmentType=");
        LIZ.append(this.alignmentType);
        LIZ.append(", isDestructive=");
        LIZ.append(this.LJLIL);
        LIZ.append(", cancellable=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", forceVertical=");
        LIZ.append(this.LJLJI);
        LIZ.append(", hyperLinks=");
        return C1NE.LIZIZ(LIZ, this.LJLJJI, ')', LIZ);
    }

    public final int getAlignmentType() {
        return this.alignmentType;
    }

    public final boolean getCancellable() {
        return this.LJLILLLLZI;
    }

    public final boolean getForceVertical() {
        return this.LJLJI;
    }

    public final List<PNSHyperlink> getHyperLinks() {
        return this.LJLJJI;
    }

    public final String getMessage() {
        return this.message;
    }

    public final List<PNSAgeConfirmOption> getOptions() {
        return this.options;
    }

    public final Integer getStyle() {
        return this.style;
    }

    public final String getTitle() {
        return this.title;
    }

    public final boolean isDestructive() {
        return this.LJLIL;
    }

    public PNSDialogModel(String str, String str2, List<PNSAgeConfirmOption> list, Integer num, int i, boolean z, boolean z2, boolean z3, List<PNSHyperlink> list2) {
        this.message = str;
        this.title = str2;
        this.options = list;
        this.style = num;
        this.alignmentType = i;
        this.LJLIL = z;
        this.LJLILLLLZI = z2;
        this.LJLJI = z3;
        this.LJLJJI = list2;
    }

    public /* synthetic */ PNSDialogModel(String str, String str2, List list, Integer num, int i, boolean z, boolean z2, boolean z3, List list2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : list, (i2 & 8) != 0 ? Integer.valueOf(EnumC86062Xq6.ACTION.getValue()) : num, (i2 & 16) != 0 ? IN4.VERTICAL.getType() : i, (i2 & 32) != 0 ? false : z, (i2 & 64) == 0 ? z2 : false, (i2 & 128) != 0 ? true : z3, (i2 & 256) == 0 ? list2 : null);
    }
}

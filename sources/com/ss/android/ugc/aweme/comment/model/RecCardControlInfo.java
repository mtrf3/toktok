package com.ss.android.ugc.aweme.comment.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.b0;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class RecCardControlInfo {

    @InterfaceC65349Pkn("ids_insert_rec_card")
    public final List<String> idsInsertRecCard;

    @InterfaceC65349Pkn("insert_interval")
    public final int insertInterval;

    @InterfaceC65349Pkn("show_at_bottom")
    public final boolean showAtBottom;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RecCardControlInfo copy$default(RecCardControlInfo recCardControlInfo, List list, boolean z, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = recCardControlInfo.idsInsertRecCard;
        }
        if ((i2 & 2) != 0) {
            z = recCardControlInfo.showAtBottom;
        }
        if ((i2 & 4) != 0) {
            i = recCardControlInfo.insertInterval;
        }
        return recCardControlInfo.copy(list, z, i);
    }

    public final RecCardControlInfo copy(List<String> list, boolean z, int i) {
        return new RecCardControlInfo(list, z, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecCardControlInfo)) {
            return false;
        }
        RecCardControlInfo recCardControlInfo = (RecCardControlInfo) obj;
        return o.LJ(this.idsInsertRecCard, recCardControlInfo.idsInsertRecCard) && this.showAtBottom == recCardControlInfo.showAtBottom && this.insertInterval == recCardControlInfo.insertInterval;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        List<String> list = this.idsInsertRecCard;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        boolean z = this.showAtBottom;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((hashCode + i) * 31) + this.insertInterval;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RecCardControlInfo(idsInsertRecCard=");
        LIZ.append(this.idsInsertRecCard);
        LIZ.append(", showAtBottom=");
        LIZ.append(this.showAtBottom);
        LIZ.append(", insertInterval=");
        return b0.LIZJ(LIZ, this.insertInterval, ')', LIZ);
    }

    public RecCardControlInfo(List<String> list, boolean z, int i) {
        this.idsInsertRecCard = list;
        this.showAtBottom = z;
        this.insertInterval = i;
    }
}

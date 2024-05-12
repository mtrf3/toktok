package com.ss.android.ugc.aweme.creatoredit;

import X.C1NE;
import X.X1D;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class CreatorCaptionEditItem implements Serializable {
    public final List<CreatorCaptionEditData> transSubtitleItem;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CreatorCaptionEditItem copy$default(CreatorCaptionEditItem creatorCaptionEditItem, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = creatorCaptionEditItem.transSubtitleItem;
        }
        return creatorCaptionEditItem.copy(list);
    }

    public final CreatorCaptionEditItem copy(List<CreatorCaptionEditData> list) {
        return new CreatorCaptionEditItem(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CreatorCaptionEditItem) && o.LJ(this.transSubtitleItem, ((CreatorCaptionEditItem) obj).transSubtitleItem);
    }

    public int hashCode() {
        List<CreatorCaptionEditData> list = this.transSubtitleItem;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CreatorCaptionEditItem(transSubtitleItem=");
        return C1NE.LIZIZ(LIZ, this.transSubtitleItem, ')', LIZ);
    }

    public final List<CreatorCaptionEditData> getTransSubtitleItem() {
        return this.transSubtitleItem;
    }

    public CreatorCaptionEditItem(List<CreatorCaptionEditData> list) {
        this.transSubtitleItem = list;
    }
}

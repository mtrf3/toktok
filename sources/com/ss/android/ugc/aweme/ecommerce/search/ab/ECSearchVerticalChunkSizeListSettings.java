package com.ss.android.ugc.aweme.ecommerce.search.ab;

import X.C1NE;
import X.C47261Igj;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.bytedance.ies.abmock.SettingsManager;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class ECSearchVerticalChunkSizeListSettings {
    public static final ECSearchVerticalChunkSizeListModel LIZ = new ECSearchVerticalChunkSizeListModel(C47261Igj.LJJIJIIJI(6L, 6L));

    /* loaded from: classes9.dex */
    public static final class ECSearchVerticalChunkSizeListModel {

        @InterfaceC65349Pkn("chunk_size_list")
        public final List<Long> chunkSizeList;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ECSearchVerticalChunkSizeListModel) && o.LJ(this.chunkSizeList, ((ECSearchVerticalChunkSizeListModel) obj).chunkSizeList);
        }

        public final int hashCode() {
            return this.chunkSizeList.hashCode();
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ECSearchVerticalChunkSizeListModel(chunkSizeList=");
            return C1NE.LIZIZ(LIZ, this.chunkSizeList, ')', LIZ);
        }

        public ECSearchVerticalChunkSizeListModel(List<Long> chunkSizeList) {
            o.LJIIIZ(chunkSizeList, "chunkSizeList");
            this.chunkSizeList = chunkSizeList;
        }
    }

    public static final ECSearchVerticalChunkSizeListModel LIZ() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        ECSearchVerticalChunkSizeListModel eCSearchVerticalChunkSizeListModel = LIZ;
        ECSearchVerticalChunkSizeListModel eCSearchVerticalChunkSizeListModel2 = (ECSearchVerticalChunkSizeListModel) LIZLLL.LJIIIIZZ("ec_search_vertical_chunk_size_list", ECSearchVerticalChunkSizeListModel.class, eCSearchVerticalChunkSizeListModel);
        if (eCSearchVerticalChunkSizeListModel2 == null) {
            return eCSearchVerticalChunkSizeListModel;
        }
        return eCSearchVerticalChunkSizeListModel2;
    }
}

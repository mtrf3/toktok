package com.ss.android.ugc.aweme.i18n.xbridge.depend.runtime;

import X.C1NE;
import X.C61878OQg;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class UpdateGeckoWhiteListSettings {
    public static final UpdateGeckoWhiteListModel LIZ = new UpdateGeckoWhiteListModel(C61878OQg.INSTANCE);

    /* loaded from: classes7.dex */
    public static final class UpdateGeckoWhiteListModel {

        @InterfaceC65349Pkn("white_list")
        public final List<String> whiteList;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateGeckoWhiteListModel) && o.LJ(this.whiteList, ((UpdateGeckoWhiteListModel) obj).whiteList);
        }

        public final int hashCode() {
            return this.whiteList.hashCode();
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("UpdateGeckoWhiteListModel(whiteList=");
            return C1NE.LIZIZ(LIZ, this.whiteList, ')', LIZ);
        }

        public UpdateGeckoWhiteListModel(List<String> whiteList) {
            o.LJIIIZ(whiteList, "whiteList");
            this.whiteList = whiteList;
        }
    }
}

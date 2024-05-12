package com.ss.android.ugc.aweme.ecommerce.video.settings;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ECVideoListOperatorWhiteList {
    public static final ECVideoListOperatorWhiteListConfig LIZ;

    /* loaded from: classes2.dex */
    public static final class ECVideoListOperatorWhiteListConfig {

        @InterfaceC65349Pkn("from_white_list")
        public List<String> fromWhiteList;

        /* JADX WARN: Multi-variable type inference failed */
        public ECVideoListOperatorWhiteListConfig() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ECVideoListOperatorWhiteListConfig copy$default(ECVideoListOperatorWhiteListConfig eCVideoListOperatorWhiteListConfig, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = eCVideoListOperatorWhiteListConfig.fromWhiteList;
            }
            return eCVideoListOperatorWhiteListConfig.copy(list);
        }

        public final ECVideoListOperatorWhiteListConfig copy(List<String> fromWhiteList) {
            o.LJIIIZ(fromWhiteList, "fromWhiteList");
            return new ECVideoListOperatorWhiteListConfig(fromWhiteList);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ECVideoListOperatorWhiteListConfig) && o.LJ(this.fromWhiteList, ((ECVideoListOperatorWhiteListConfig) obj).fromWhiteList);
        }

        public int hashCode() {
            return this.fromWhiteList.hashCode();
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ECVideoListOperatorWhiteListConfig(fromWhiteList=");
            return C1NE.LIZIZ(LIZ, this.fromWhiteList, ')', LIZ);
        }

        public final List<String> getFromWhiteList() {
            return this.fromWhiteList;
        }

        public ECVideoListOperatorWhiteListConfig(List<String> fromWhiteList) {
            o.LJIIIZ(fromWhiteList, "fromWhiteList");
            this.fromWhiteList = fromWhiteList;
        }

        public final void setFromWhiteList(List<String> list) {
            o.LJIIIZ(list, "<set-?>");
            this.fromWhiteList = list;
        }

        public /* synthetic */ ECVideoListOperatorWhiteListConfig(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new ArrayList() : list);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        new ECVideoListOperatorWhiteList();
        LIZ = new ECVideoListOperatorWhiteListConfig(null, 1, 0 == true ? 1 : 0);
    }
}

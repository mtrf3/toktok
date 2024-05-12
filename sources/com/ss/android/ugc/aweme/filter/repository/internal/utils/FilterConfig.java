package com.ss.android.ugc.aweme.filter.repository.internal.utils;

import X.F9E;
import X.JBR;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class FilterConfig extends F9E {
    public List<FilterConfigItem> items;
    public String resource;

    /* JADX WARN: Multi-variable type inference failed */
    public FilterConfig() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FilterConfig copy$default(FilterConfig filterConfig, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = filterConfig.resource;
        }
        if ((i & 2) != 0) {
            list = filterConfig.items;
        }
        return filterConfig.copy(str, list);
    }

    public final FilterConfig copy(String str, List<FilterConfigItem> list) {
        return new FilterConfig(str, list);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.resource, this.items};
    }

    /* loaded from: classes5.dex */
    public static final class FilterConfigItem {
        public int max;
        public int min;
        public String name;
        public String tag;
        public int value;

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public FilterConfigItem() {
            /*
                r8 = this;
                r1 = 0
                r4 = 0
                r6 = 31
                r0 = r8
                r2 = r1
                r3 = r1
                r5 = r4
                r7 = r4
                r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.filter.repository.internal.utils.FilterConfig.FilterConfigItem.<init>():void");
        }

        public static /* synthetic */ FilterConfigItem copy$default(FilterConfigItem filterConfigItem, int i, int i2, int i3, String str, String str2, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                i = filterConfigItem.min;
            }
            if ((i4 & 2) != 0) {
                i2 = filterConfigItem.max;
            }
            if ((i4 & 4) != 0) {
                i3 = filterConfigItem.value;
            }
            if ((i4 & 8) != 0) {
                str = filterConfigItem.tag;
            }
            if ((i4 & 16) != 0) {
                str2 = filterConfigItem.name;
            }
            return filterConfigItem.copy(i, i2, i3, str, str2);
        }

        public final FilterConfigItem copy(int i, int i2, int i3, String tag, String name) {
            o.LJIIIZ(tag, "tag");
            o.LJIIIZ(name, "name");
            return new FilterConfigItem(i, i2, i3, tag, name);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FilterConfigItem)) {
                return false;
            }
            FilterConfigItem filterConfigItem = (FilterConfigItem) obj;
            return this.min == filterConfigItem.min && this.max == filterConfigItem.max && this.value == filterConfigItem.value && o.LJ(this.tag, filterConfigItem.tag) && o.LJ(this.name, filterConfigItem.name);
        }

        public int hashCode() {
            int i = ((((this.min * 31) + this.max) * 31) + this.value) * 31;
            String str = this.tag;
            int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.name;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("FilterConfigItem(min=");
            LIZ.append(this.min);
            LIZ.append(", max=");
            LIZ.append(this.max);
            LIZ.append(", value=");
            LIZ.append(this.value);
            LIZ.append(", tag=");
            LIZ.append(this.tag);
            LIZ.append(", name=");
            return JBR.LJFF(LIZ, this.name, ")", LIZ);
        }

        public final int getMax() {
            return this.max;
        }

        public final int getMin() {
            return this.min;
        }

        public final String getName() {
            return this.name;
        }

        public final String getTag() {
            return this.tag;
        }

        public final int getValue() {
            return this.value;
        }

        public final void setMax(int i) {
            this.max = i;
        }

        public final void setMin(int i) {
            this.min = i;
        }

        public final void setName(String str) {
            o.LJIIIZ(str, "<set-?>");
            this.name = str;
        }

        public final void setTag(String str) {
            o.LJIIIZ(str, "<set-?>");
            this.tag = str;
        }

        public final void setValue(int i) {
            this.value = i;
        }

        public FilterConfigItem(int i, int i2, int i3, String tag, String name) {
            o.LJIIIZ(tag, "tag");
            o.LJIIIZ(name, "name");
            this.min = i;
            this.max = i2;
            this.value = i3;
            this.tag = tag;
            this.name = name;
        }

        public /* synthetic */ FilterConfigItem(int i, int i2, int i3, String str, String str2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) == 0 ? i3 : 0, (i4 & 8) != 0 ? "" : str, (i4 & 16) == 0 ? str2 : "");
        }
    }

    public final List<FilterConfigItem> getItems() {
        return this.items;
    }

    public final String getResource() {
        return this.resource;
    }

    public final void setItems(List<FilterConfigItem> list) {
        this.items = list;
    }

    public final void setResource(String str) {
        this.resource = str;
    }

    public FilterConfig(String str, List<FilterConfigItem> list) {
        this.resource = str;
        this.items = list;
    }

    public /* synthetic */ FilterConfig(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list);
    }
}

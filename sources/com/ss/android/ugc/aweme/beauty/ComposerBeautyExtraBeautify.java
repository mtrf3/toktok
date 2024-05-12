package com.ss.android.ugc.aweme.beauty;

import X.JBR;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class ComposerBeautyExtraBeautify {
    public List<ItemsBean> items;
    public String resource;

    /* JADX WARN: Multi-variable type inference failed */
    public ComposerBeautyExtraBeautify() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* loaded from: classes15.dex */
    public static final class ItemsBean {
        public boolean doubleDirection;
        public int max;
        public int min;
        public String name;
        public String tag;
        public int value;

        /* JADX WARN: Multi-variable type inference failed */
        public ItemsBean() {
            this(false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, 0 == true ? 1 : 0, 63, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ ItemsBean copy$default(ItemsBean itemsBean, boolean z, int i, int i2, int i3, String str, String str2, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                z = itemsBean.doubleDirection;
            }
            if ((i4 & 2) != 0) {
                i = itemsBean.min;
            }
            if ((i4 & 4) != 0) {
                i2 = itemsBean.max;
            }
            if ((i4 & 8) != 0) {
                i3 = itemsBean.value;
            }
            if ((i4 & 16) != 0) {
                str = itemsBean.tag;
            }
            if ((i4 & 32) != 0) {
                str2 = itemsBean.name;
            }
            return itemsBean.copy(z, i, i2, i3, str, str2);
        }

        public final ItemsBean copy(boolean z, int i, int i2, int i3, String tag, String name) {
            o.LJIIIZ(tag, "tag");
            o.LJIIIZ(name, "name");
            return new ItemsBean(z, i, i2, i3, tag, name);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ItemsBean)) {
                return false;
            }
            ItemsBean itemsBean = (ItemsBean) obj;
            return this.doubleDirection == itemsBean.doubleDirection && this.min == itemsBean.min && this.max == itemsBean.max && this.value == itemsBean.value && o.LJ(this.tag, itemsBean.tag) && o.LJ(this.name, itemsBean.name);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v10 */
        /* JADX WARN: Type inference failed for: r0v11 */
        public int hashCode() {
            boolean z = this.doubleDirection;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            int i = ((((((r0 * 31) + this.min) * 31) + this.max) * 31) + this.value) * 31;
            String str = this.tag;
            int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.name;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ItemsBean(doubleDirection=");
            LIZ.append(this.doubleDirection);
            LIZ.append(", min=");
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

        public final boolean getDoubleDirection() {
            return this.doubleDirection;
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

        public final void setDoubleDirection(boolean z) {
            this.doubleDirection = z;
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

        public ItemsBean(boolean z, int i, int i2, int i3, String tag, String name) {
            o.LJIIIZ(tag, "tag");
            o.LJIIIZ(name, "name");
            this.doubleDirection = z;
            this.min = i;
            this.max = i2;
            this.value = i3;
            this.tag = tag;
            this.name = name;
        }

        public /* synthetic */ ItemsBean(boolean z, int i, int i2, int i3, String str, String str2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this((i4 & 1) != 0 ? false : z, (i4 & 2) != 0 ? 0 : i, (i4 & 4) != 0 ? 0 : i2, (i4 & 8) == 0 ? i3 : 0, (i4 & 16) != 0 ? "" : str, (i4 & 32) == 0 ? str2 : "");
        }
    }

    public final List<ItemsBean> getItems() {
        return this.items;
    }

    public final String getResource() {
        return this.resource;
    }

    public final void setItems(List<ItemsBean> list) {
        this.items = list;
    }

    public final void setResource(String str) {
        this.resource = str;
    }

    public ComposerBeautyExtraBeautify(String str, List<ItemsBean> list) {
        this.resource = str;
        this.items = list;
    }

    public /* synthetic */ ComposerBeautyExtraBeautify(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list);
    }
}

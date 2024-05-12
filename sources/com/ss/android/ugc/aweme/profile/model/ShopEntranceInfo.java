package com.ss.android.ugc.aweme.profile.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import X.V0N;
import java.io.Serializable;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class ShopEntranceInfo extends F9E implements Serializable {

    @InterfaceC65349Pkn("count")
    public final int count;

    @InterfaceC65349Pkn("creator_type")
    public final int creatorType;

    @InterfaceC65349Pkn("schema")
    public final String schema;

    @InterfaceC65349Pkn("shop_type")
    public final int shopType;

    public static /* synthetic */ ShopEntranceInfo copy$default(ShopEntranceInfo shopEntranceInfo, String str, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = shopEntranceInfo.schema;
        }
        if ((i4 & 2) != 0) {
            i = shopEntranceInfo.count;
        }
        if ((i4 & 4) != 0) {
            i2 = shopEntranceInfo.shopType;
        }
        if ((i4 & 8) != 0) {
            i3 = shopEntranceInfo.creatorType;
        }
        return shopEntranceInfo.copy(str, i, i2, i3);
    }

    public final ShopEntranceInfo copy(String schema, int i, int i2, int i3) {
        o.LJIIIZ(schema, "schema");
        return new ShopEntranceInfo(schema, i, i2, i3);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.schema, Integer.valueOf(this.count), Integer.valueOf(this.shopType), Integer.valueOf(this.creatorType)};
    }

    public final ShopCreatorTypeEnum getCreatorType() {
        return ShopCreatorTypeEnum.Companion.fromInt(Integer.valueOf(this.creatorType));
    }

    public final ShopTypeEnum getShopType() {
        return ShopTypeEnum.Companion.fromInt(Integer.valueOf(this.shopType));
    }

    /* loaded from: classes14.dex */
    public enum ShopCreatorTypeEnum {
        UNKNOWN(0, "unknown"),
        OFFICIAL(1, "official"),
        CHANNEL(2, "channel"),
        NORMAL(3, "normal");

        public static final Companion Companion = new Companion();
        public final String mobString;
        public final int value;

        public static ShopCreatorTypeEnum valueOf(String str) {
            return (ShopCreatorTypeEnum) V0N.LJJJ(ShopCreatorTypeEnum.class, str);
        }

        /* loaded from: classes14.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public Companion() {
            }

            public final ShopCreatorTypeEnum fromInt(Integer num) {
                if (num != null) {
                    num.intValue();
                    for (ShopCreatorTypeEnum shopCreatorTypeEnum : ShopCreatorTypeEnum.values()) {
                        if (shopCreatorTypeEnum.getValue() == num.intValue()) {
                            return shopCreatorTypeEnum;
                        }
                    }
                    throw new NoSuchElementException("Array contains no element matching the predicate.");
                }
                return ShopCreatorTypeEnum.OFFICIAL;
            }
        }

        public final String getMobString() {
            return this.mobString;
        }

        public final int getValue() {
            return this.value;
        }

        ShopCreatorTypeEnum(int i, String str) {
            this.value = i;
            this.mobString = str;
        }
    }

    /* loaded from: classes14.dex */
    public enum ShopTypeEnum {
        UNKNOWN(0),
        SHOWCASE(1),
        SHOP(2);

        public static final Companion Companion = new Companion();
        public final int value;

        public static ShopTypeEnum valueOf(String str) {
            return (ShopTypeEnum) V0N.LJJJ(ShopTypeEnum.class, str);
        }

        /* loaded from: classes14.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public Companion() {
            }

            public final ShopTypeEnum fromInt(Integer num) {
                if (num != null) {
                    num.intValue();
                    for (ShopTypeEnum shopTypeEnum : ShopTypeEnum.values()) {
                        if (shopTypeEnum.getValue() == num.intValue()) {
                            return shopTypeEnum;
                        }
                    }
                    throw new NoSuchElementException("Array contains no element matching the predicate.");
                }
                return ShopTypeEnum.UNKNOWN;
            }
        }

        public final int getValue() {
            return this.value;
        }

        ShopTypeEnum(int i) {
            this.value = i;
        }
    }

    public final int getCount() {
        return this.count;
    }

    public final String getSchema() {
        return this.schema;
    }

    public ShopEntranceInfo(String schema, int i, int i2, int i3) {
        o.LJIIIZ(schema, "schema");
        this.schema = schema;
        this.count = i;
        this.shopType = i2;
        this.creatorType = i3;
    }
}

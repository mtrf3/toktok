package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.C15890jp;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import X.X1D;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class MultiCancelData {
    public static final Companion Companion = new Companion();
    public final Map<String, Object> custom;

    /* loaded from: classes11.dex */
    public static final class Builder {
        public Map<String, ? extends Object> custom;

        public final MultiCancelData build() {
            return new MultiCancelData(this);
        }

        public final Map<String, Object> getCustom() {
            return this.custom;
        }

        public final void setCustom(Map<String, ? extends Object> map) {
            this.custom = map;
        }
    }

    public /* synthetic */ MultiCancelData(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MultiCancelData copy$default(MultiCancelData multiCancelData, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = multiCancelData.custom;
        }
        return multiCancelData.copy(map);
    }

    public final MultiCancelData copy(Map<String, ? extends Object> map) {
        return new MultiCancelData(map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MultiCancelData) && o.LJ(this.custom, ((MultiCancelData) obj).custom);
    }

    public int hashCode() {
        Map<String, Object> map = this.custom;
        if (map == null) {
            return 0;
        }
        return map.hashCode();
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MultiCancelData(custom=");
        return C15890jp.LIZ(LIZ, this.custom, ')', LIZ);
    }

    /* loaded from: classes11.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final MultiCancelData build(InterfaceC88472Yns<? super Builder, C76800UCe> block) {
            o.LJIIIZ(block, "block");
            Builder builder = new Builder();
            block.invoke(builder);
            return builder.build();
        }
    }

    public final Map<String, Object> getCustom() {
        return this.custom;
    }

    public MultiCancelData(Builder builder) {
        this((Map<String, ? extends Object>) builder.getCustom());
    }

    public MultiCancelData(Map<String, ? extends Object> map) {
        this.custom = map;
    }
}

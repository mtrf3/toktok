package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.C76800UCe;
import X.F9E;
import X.InterfaceC88472Yns;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class LayoutDSLConfig extends F9E {
    public static final Companion Companion = new Companion();
    public final String layoutId;
    public final int sceneVersion;

    /* loaded from: classes14.dex */
    public static final class Builder {
        public String layoutId = "";
        public int sceneVersion;

        public final LayoutDSLConfig build() {
            return new LayoutDSLConfig(this);
        }

        public final String getLayoutId() {
            return this.layoutId;
        }

        public final int getSceneVersion() {
            return this.sceneVersion;
        }

        public final void setLayoutId(String str) {
            o.LJIIIZ(str, "<set-?>");
            this.layoutId = str;
        }

        public final void setSceneVersion(int i) {
            this.sceneVersion = i;
        }
    }

    public /* synthetic */ LayoutDSLConfig(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }

    public static /* synthetic */ LayoutDSLConfig copy$default(LayoutDSLConfig layoutDSLConfig, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = layoutDSLConfig.sceneVersion;
        }
        if ((i2 & 2) != 0) {
            str = layoutDSLConfig.layoutId;
        }
        return layoutDSLConfig.copy(i, str);
    }

    public final LayoutDSLConfig copy(int i, String layoutId) {
        o.LJIIIZ(layoutId, "layoutId");
        return new LayoutDSLConfig(i, layoutId);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.sceneVersion), this.layoutId};
    }

    /* loaded from: classes14.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final LayoutDSLConfig build(InterfaceC88472Yns<? super Builder, C76800UCe> block) {
            o.LJIIIZ(block, "block");
            Builder builder = new Builder();
            block.invoke(builder);
            return builder.build();
        }
    }

    public final String getLayoutId() {
        return this.layoutId;
    }

    public final int getSceneVersion() {
        return this.sceneVersion;
    }

    public LayoutDSLConfig(Builder builder) {
        this(builder.getSceneVersion(), builder.getLayoutId());
    }

    public LayoutDSLConfig(int i, String layoutId) {
        o.LJIIIZ(layoutId, "layoutId");
        this.sceneVersion = i;
        this.layoutId = layoutId;
    }
}

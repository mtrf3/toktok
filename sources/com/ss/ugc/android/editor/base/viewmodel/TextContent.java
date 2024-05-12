package com.ss.ugc.android.editor.base.viewmodel;

import X.C47261Igj;
import X.F9E;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class TextContent extends F9E {
    public final List<Double> bounding_box;
    public final double duration;
    public final int index;
    public final float start_time;
    public final String value;

    /* JADX WARN: Multi-variable type inference failed */
    public TextContent() {
        this(0, null, 0.0f, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TextContent copy$default(TextContent textContent, int i, String str, float f, double d, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = textContent.index;
        }
        if ((i2 & 2) != 0) {
            str = textContent.value;
        }
        if ((i2 & 4) != 0) {
            f = textContent.start_time;
        }
        if ((i2 & 8) != 0) {
            d = textContent.duration;
        }
        if ((i2 & 16) != 0) {
            list = textContent.bounding_box;
        }
        return textContent.copy(i, str, f, d, list);
    }

    public final TextContent copy(int i, String value, float f, double d, List<Double> bounding_box) {
        o.LJIIJ(value, "value");
        o.LJIIJ(bounding_box, "bounding_box");
        return new TextContent(i, value, f, d, bounding_box);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.index), this.value, Float.valueOf(this.start_time), Double.valueOf(this.duration), this.bounding_box};
    }

    public final List<Double> getBounding_box() {
        return this.bounding_box;
    }

    public final double getDuration() {
        return this.duration;
    }

    public final int getIndex() {
        return this.index;
    }

    public final float getStart_time() {
        return this.start_time;
    }

    public final String getValue() {
        return this.value;
    }

    public TextContent(int i, String value, float f, double d, List<Double> bounding_box) {
        o.LJIIJ(value, "value");
        o.LJIIJ(bounding_box, "bounding_box");
        this.index = i;
        this.value = value;
        this.start_time = f;
        this.duration = d;
        this.bounding_box = bounding_box;
    }

    public /* synthetic */ TextContent(int i, String str, float f, double d, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? 0.0f : f, (i2 & 8) != 0 ? LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX : d, (i2 & 16) != 0 ? C47261Igj.LJJIJIIJI(Double.valueOf(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX), Double.valueOf(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX), Double.valueOf(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX), Double.valueOf(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX)) : list);
    }
}

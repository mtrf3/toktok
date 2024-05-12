package com.ss.android.ugc.aweme.beauty;

import X.F9E;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class BeautifyTag extends F9E {
    public final String tag;
    public final float value;

    /* JADX WARN: Multi-variable type inference failed */
    public BeautifyTag() {
        this(null, 0.0f, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ BeautifyTag copy$default(BeautifyTag beautifyTag, String str, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            str = beautifyTag.tag;
        }
        if ((i & 2) != 0) {
            f = beautifyTag.value;
        }
        return beautifyTag.copy(str, f);
    }

    public final BeautifyTag copy(String tag, float f) {
        o.LJIIIZ(tag, "tag");
        return new BeautifyTag(tag, f);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.tag, Float.valueOf(this.value)};
    }

    public final String getTag() {
        return this.tag;
    }

    public final float getValue() {
        return this.value;
    }

    public BeautifyTag(String tag, float f) {
        o.LJIIIZ(tag, "tag");
        this.tag = tag;
        this.value = f;
    }

    public /* synthetic */ BeautifyTag(String str, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0.0f : f);
    }
}

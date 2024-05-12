package com.bytedance.router.fragment;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes11.dex */
public final class PopOp extends FragmentOp {
    public boolean popInclusive;
    public boolean tryFinishActivity;

    /* JADX WARN: Multi-variable type inference failed */
    public PopOp() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PopOp(String str) {
        this(str, null, 2, 0 == true ? 1 : 0);
    }

    public final boolean getPopInclusive() {
        return this.popInclusive;
    }

    public final boolean getTryFinishActivity() {
        return this.tryFinishActivity;
    }

    public final void setPopInclusive(boolean z) {
        this.popInclusive = z;
    }

    public final void setTryFinishActivity(boolean z) {
        this.tryFinishActivity = z;
    }

    public PopOp(String str, String str2) {
        super(str, str2, false, 4, null);
        this.tryFinishActivity = true;
        this.popInclusive = true;
    }

    public /* synthetic */ PopOp(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}

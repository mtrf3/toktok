package com.bytedance.router.fragment;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class PushOp extends FragmentOp {
    public int enterAnim;
    public int exitAnim;
    public final Integer flag;
    public int popEnterAnim;
    public int popExitAnim;
    public PushType pushType;

    /* JADX WARN: Multi-variable type inference failed */
    public PushOp() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PushOp(String str) {
        this(str, null, 0 == true ? 1 : 0, 6, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PushOp(String str, String str2) {
        this(str, str2, null, 4, 0 == true ? 1 : 0);
    }

    public final int getEnterAnim() {
        return this.enterAnim;
    }

    public final int getExitAnim() {
        return this.exitAnim;
    }

    public final Integer getFlag() {
        return this.flag;
    }

    public final int getPopEnterAnim() {
        return this.popEnterAnim;
    }

    public final int getPopExitAnim() {
        return this.popExitAnim;
    }

    public final PushType getPushType() {
        return this.pushType;
    }

    public final void setEnterAnim(int i) {
        this.enterAnim = i;
    }

    public final void setExitAnim(int i) {
        this.exitAnim = i;
    }

    public final void setPopEnterAnim(int i) {
        this.popEnterAnim = i;
    }

    public final void setPopExitAnim(int i) {
        this.popExitAnim = i;
    }

    public final void setPushType(PushType pushType) {
        o.LJIIIZ(pushType, "<set-?>");
        this.pushType = pushType;
    }

    public PushOp(String str, String str2, Integer num) {
        super(str, str2, false, 4, null);
        this.flag = num;
        this.pushType = PushType.REPLACE;
        this.popEnterAnim = -1;
        this.popExitAnim = -1;
        this.enterAnim = -1;
        this.exitAnim = -1;
    }

    public /* synthetic */ PushOp(String str, String str2, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : num);
    }
}

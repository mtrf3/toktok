package X;

import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes12.dex */
public @interface QD3 {
    int priority() default 0;

    boolean sticky() default false;

    ThreadMode threadMode() default ThreadMode.POSTING;
}

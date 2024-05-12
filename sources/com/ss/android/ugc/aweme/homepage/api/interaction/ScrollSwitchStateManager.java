package com.ss.android.ugc.aweme.homepage.api.interaction;

import androidx.fragment.app.Fragment;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public class ScrollSwitchStateManager extends BaseScrollSwitchStateManager {
    public static final /* synthetic */ int LLFFF = 0;

    public final Fragment wv0() {
        WeakReference<Fragment> weakReference = this.LJZI;
        if (weakReference == null) {
            return null;
        }
        o.LJI(weakReference);
        return weakReference.get();
    }
}

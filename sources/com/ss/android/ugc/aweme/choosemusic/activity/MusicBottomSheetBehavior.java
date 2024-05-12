package com.ss.android.ugc.aweme.choosemusic.activity;

import X.C45621qg;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class MusicBottomSheetBehavior<V extends View> extends ViewPagerBottomSheetBehavior<V> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MusicBottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        o.LJIIIZ(context, "context");
        o.LJIIIZ(attributeSet, "attributeSet");
    }

    @Override // com.ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior, X.C06C
    public final boolean onInterceptTouchEvent(C45621qg parent, V child, MotionEvent event) {
        o.LJIIIZ(parent, "parent");
        o.LJIIIZ(child, "child");
        o.LJIIIZ(event, "event");
        return super.onInterceptTouchEvent(parent, child, event);
    }
}

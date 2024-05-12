package com.ss.android.ugc.aweme.vision.behavior;

import X.C270714l;
import X.C45621qg;
import X.C80591Vk3;
import X.C80594Vk6;
import X.InterpolatorC80595Vk7;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.OverScroller;
import java.lang.reflect.Field;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class PhotoSearchBottomSheetBehavior<V extends View> extends SearchBottomSheetBehavior<V> {
    public static final /* synthetic */ int LJJIII = 0;
    public final C80594Vk6 LJJII;

    public PhotoSearchBottomSheetBehavior() {
        this(null, null);
    }

    @Override // com.ss.android.ugc.aweme.vision.behavior.SearchBottomSheetBehavior
    public final boolean LIZIZ(View view) {
        int i;
        if (view != null) {
            i = view.getTop();
        } else {
            i = 0;
        }
        if (i > (((this.LJIL - r1) / 4.0f) * 3) + this.LJJ) {
            return false;
        }
        return true;
    }

    public PhotoSearchBottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LJJII = new C80594Vk6();
    }

    @Override // com.ss.android.ugc.aweme.vision.behavior.SearchBottomSheetBehavior
    public final C270714l LIZ(C45621qg parent, C80591Vk3 callback) {
        o.LJIIIZ(parent, "parent");
        o.LJIIIZ(callback, "callback");
        C80594Vk6 interpolatorFactory = this.LJJII;
        o.LJIIIZ(interpolatorFactory, "interpolatorFactory");
        C270714l LJIIIZ = C270714l.LJIIIZ(parent, callback);
        try {
            Field declaredField = C270714l.class.getDeclaredField("LJIIZILJ");
            declaredField.setAccessible(true);
            declaredField.set(LJIIIZ, new OverScroller(parent.getContext(), InterpolatorC80595Vk7.LIZ));
        } catch (Exception unused) {
        }
        return LJIIIZ;
    }

    @Override // com.ss.android.ugc.aweme.vision.behavior.SearchBottomSheetBehavior
    public final boolean shouldHide(View view, float f) {
        int i;
        float f2 = ((this.LJIL - r2) / 3.0f) + this.LJJ;
        if (view != null) {
            i = view.getTop();
        } else {
            i = 0;
        }
        float f3 = i;
        if (f3 >= f2) {
            return true;
        }
        float f4 = (f * 0.1f) + f3;
        int i2 = this.LIZIZ;
        if (i2 == 0) {
            i2 = this.LIZJ;
        }
        if (Math.abs(f4 - this.LJI) / i2 <= 0.5f) {
            return false;
        }
        return true;
    }
}

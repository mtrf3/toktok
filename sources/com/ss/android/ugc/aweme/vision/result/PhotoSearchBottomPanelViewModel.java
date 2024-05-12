package com.ss.android.ugc.aweme.vision.result;

import X.C60996Nwm;
import X.KHK;
import android.content.Context;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import androidx.lifecycle.ViewModel;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class PhotoSearchBottomPanelViewModel extends ViewModel {
    public static final /* synthetic */ int LJLJLJ = 0;
    public RectF LJLIL;
    public final int[] LJLILLLLZI = new int[2];
    public int LJLJI = 3;
    public int LJLJJI;
    public int LJLJJL;
    public FrameLayout LJLJJLL;
    public KHK LJLJL;

    public final boolean gv0(Context context, MotionEvent event) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(event, "event");
        FrameLayout frameLayout = this.LJLJJLL;
        if (frameLayout != null) {
            frameLayout.getLocationOnScreen(this.LJLILLLLZI);
        }
        int i = this.LJLILLLLZI[1];
        RectF rectF = this.LJLIL;
        if (rectF == null) {
            rectF = new RectF(0.0f, i, C60996Nwm.LJIIIIZZ(context), i + this.LJLJJI);
        }
        this.LJLIL = rectF;
        return rectF.contains(event.getX(), event.getY());
    }
}

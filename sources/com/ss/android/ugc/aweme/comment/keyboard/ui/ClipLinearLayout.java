package com.ss.android.ugc.aweme.comment.keyboard.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;

/* loaded from: classes3.dex */
public class ClipLinearLayout extends LinearLayout {
    public int LJLIL;
    public final Path LJLILLLLZI;

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.LJLIL > -1) {
            this.LJLILLLLZI.reset();
            this.LJLILLLLZI.addRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - this.LJLIL, Path.Direction.CW);
            canvas.clipPath(this.LJLILLLLZI);
        }
        super.onDraw(canvas);
    }

    public void setClipHeight(int i) {
        this.LJLIL = i;
    }

    public ClipLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJLIL = -1;
        if (getBackground() == null) {
            setBackgroundResource(R.drawable.bop);
        }
        this.LJLILLLLZI = new Path();
    }
}

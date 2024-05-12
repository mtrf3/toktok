package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveChatShowDelayForHotLiveSetting;
import com.lynx.tasm.behavior.ui.view.UIComponent;
import defpackage.a1;

/* renamed from: X.JRy, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49182JRy extends FrameLayout {
    public int LJLIL;
    public UIComponent LJLILLLLZI;
    public int LJLJI;

    public final int getAdapterPosition() {
        return this.LJLJI;
    }

    public final int getLayoutStatus() {
        return this.LJLIL;
    }

    public final UIComponent getUIComponent() {
        return this.LJLILLLLZI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49182JRy(Context context) {
        super(context);
        a1.LJFF(context, "context");
    }

    public final void setAdapterPosition(int i) {
        this.LJLJI = i;
    }

    public final void setLayoutStatus(int i) {
        this.LJLIL = i;
    }

    public final void setUIComponent(UIComponent uIComponent) {
        this.LJLILLLLZI = uIComponent;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int measuredWidth;
        int measuredHeight;
        UIComponent uIComponent = this.LJLILLLLZI;
        if (this.LJLIL == 0) {
            measuredWidth = View.MeasureSpec.getSize(i);
            measuredHeight = LiveChatShowDelayForHotLiveSetting.DEFAULT;
        } else if (uIComponent != null && uIComponent.getHeight() > 0) {
            uIComponent.measure();
            if (2 == this.LJLIL) {
                this.LJLIL = 3;
            }
            measuredWidth = uIComponent.getWidth() + uIComponent.mMarginLeft + uIComponent.mMarginRight;
            measuredHeight = uIComponent.mMarginBottom + uIComponent.getHeight() + uIComponent.mMarginTop;
        } else {
            measuredWidth = getMeasuredWidth();
            measuredHeight = getMeasuredHeight();
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        UIComponent uIComponent = this.LJLILLLLZI;
        if (uIComponent == null) {
            return;
        }
        uIComponent.setTop(0);
        uIComponent.setLeft(0);
        uIComponent.layout();
        int i5 = uIComponent.mMarginLeft;
        int i6 = uIComponent.mMarginTop;
        ((ViewGroup) uIComponent.mView).layout(i5, i6, uIComponent.getWidth() + i5, uIComponent.getHeight() + i6);
    }
}

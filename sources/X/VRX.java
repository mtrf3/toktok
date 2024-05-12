package X;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveChatShowDelayForHotLiveSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.lynx.tasm.behavior.ui.list.UIList;
import com.lynx.tasm.behavior.ui.view.UIComponent;
import java.util.HashMap;

/* loaded from: classes15.dex */
public class VRX extends FrameLayout {
    public int LJLIL;
    public UIComponent LJLILLLLZI;
    public int LJLJI;
    public final int LJLJJI;
    public boolean LJLJJL;
    public int LJLJJLL;
    public VRZ LJLJL;

    public VRZ getMeasureListener() {
        return this.LJLJL;
    }

    public VRX(Context context) {
        super(context);
        this.LJLJI = LiveChatShowDelayForHotLiveSetting.DEFAULT;
        this.LJLJJI = -1;
    }

    public void setComponentInitMeasure(boolean z) {
        this.LJLJJL = z;
    }

    public void setMeasureListener(VRZ vrz) {
        this.LJLJL = vrz;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int measuredWidth;
        int measuredHeight;
        HashMap<String, Integer> hashMap;
        UIComponent uIComponent;
        T t;
        if (this.LJLIL == 0) {
            measuredWidth = this.LJLJJI;
            if (measuredWidth <= 0) {
                measuredWidth = View.MeasureSpec.getSize(i);
            }
            measuredHeight = this.LJLJI;
            if (this.LJLJJL && (uIComponent = this.LJLILLLLZI) != null && (t = uIComponent.mView) != 0 && t.isLayoutRequested()) {
                this.LJLILLLLZI.measureChildren();
            }
        } else {
            UIComponent uIComponent2 = this.LJLILLLLZI;
            if (uIComponent2 != null) {
                uIComponent2.measure();
                if (2 == this.LJLIL) {
                    this.LJLIL = 3;
                }
                int width = this.LJLILLLLZI.getWidth();
                UIComponent uIComponent3 = this.LJLILLLLZI;
                measuredWidth = width + uIComponent3.mMarginLeft + uIComponent3.mMarginRight;
                int height = uIComponent3.getHeight();
                UIComponent uIComponent4 = this.LJLILLLLZI;
                measuredHeight = height + uIComponent4.mMarginTop + uIComponent4.mMarginBottom + this.LJLJJLL;
                VRZ vrz = this.LJLJL;
                if (vrz != null) {
                    String str = uIComponent4.LJLIL;
                    VRY vry = (VRY) vrz;
                    vry.getClass();
                    if (!TextUtils.isEmpty(str) && (hashMap = vry.LIZ.LL) != null && hashMap.containsKey(str)) {
                        for (int i3 = 0; i3 < vry.LIZ.LLFFF.size(); i3++) {
                            int intValue = vry.LIZ.LL.get(str).intValue();
                            if (ListProtector.get(vry.LIZ.LLFFF, i3) != null && ((HashMap) ListProtector.get(vry.LIZ.LLFFF, i3)).containsKey(Integer.valueOf(intValue))) {
                                ((HashMap) ListProtector.get(vry.LIZ.LLFFF, i3)).put(Integer.valueOf(intValue), Integer.valueOf(measuredHeight));
                            }
                        }
                        UIList uIList = vry.LIZ.LJLJI;
                        if (uIList.LLIIJLIL && uIList.LJJI()) {
                            vry.LIZ.LLFII.put(str, Integer.valueOf(measuredHeight));
                        }
                    }
                }
            } else {
                measuredWidth = getMeasuredWidth();
                measuredHeight = getMeasuredHeight();
            }
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        UIComponent uIComponent = this.LJLILLLLZI;
        if (uIComponent != null) {
            uIComponent.setTop(0);
            this.LJLILLLLZI.setLeft(0);
            this.LJLILLLLZI.layout();
            UIComponent uIComponent2 = this.LJLILLLLZI;
            int i5 = uIComponent2.mMarginLeft;
            int i6 = uIComponent2.mMarginTop;
            ((ViewGroup) this.LJLILLLLZI.mView).layout(i5, i6, uIComponent2.getWidth() + i5, this.LJLILLLLZI.getHeight() + i6);
            if (this.LJLILLLLZI.getOverflow() != 0 && getParent() != null) {
                ((ViewGroup) getParent()).setClipChildren(false);
            }
            Rect LIZ = C16320kW.LIZ(this.LJLILLLLZI.mView);
            if (LIZ != null) {
                LIZ.set(Math.min(LIZ.left, i), Math.min(LIZ.top, i2), Math.max(LIZ.right, i3), Math.max(LIZ.bottom, i4));
                C16320kW.LIZJ(this, LIZ);
            }
        }
    }
}

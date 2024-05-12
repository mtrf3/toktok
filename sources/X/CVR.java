package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.dataChannel.VideoViewMeasureEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* loaded from: classes6.dex */
public class CVR extends TextureView implements InterfaceC28165B3p, C0RR {
    public int LJLIL;
    public int LJLILLLLZI;
    public int LJLJI;
    public DataChannel LJLJJI;
    public C0RP LJLJJL;
    public int LJLJJLL;

    @Override // X.C0RR
    public final void LJJJJIZL() {
        this.LJLJJLL++;
    }

    @Override // X.C0RR
    public C0RP getCacheHelper() {
        if (this.LJLJJL == null) {
            this.LJLJJL = new C0RP();
        }
        return this.LJLJJL;
    }

    @Override // X.B4L
    public final void reset() {
        B4I.LIZ("RenderView", "TextureView:reset");
        this.LJLIL = 0;
        this.LJLILLLLZI = 0;
    }

    @Override // X.C0RR
    public int getCallCount() {
        return this.LJLJJLL;
    }

    @Override // X.B4L
    public int getStreamHeight() {
        return this.LJLILLLLZI;
    }

    @Override // X.B4L
    public int getStreamWidth() {
        return this.LJLIL;
    }

    public int getTextureLayout() {
        return this.LJLJI;
    }

    public CVR(Context context) {
        super(context);
        this.LJLJI = 2;
    }

    @Override // X.C0RR
    public final void LJJIIZ(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
    }

    @Override // X.InterfaceC28165B3p
    public void setDataChannel(DataChannel dataChannel) {
        this.LJLJJI = dataChannel;
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C0RQ.LIZ(this, layoutParams);
    }

    @Override // X.B4L
    public void setScaleType(int i) {
        LIZ(i, "");
    }

    public CVR(Context context, int i) {
        super(context, null, 0);
        this.LJLJI = 2;
    }

    @Override // X.B4L
    public final void LIZ(int i, String str) {
        this.LJLJI = i;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TextureView:setScaleType :");
        LIZ.append(i);
        B4I.LIZ("RenderView", X1D.LIZIZ(LIZ));
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        float f;
        int i3;
        float f2;
        float f3;
        int i4;
        int i5;
        int paddingRight = getPaddingRight() + getPaddingLeft() + getSuggestedMinimumWidth();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + getSuggestedMinimumHeight();
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode == 1073741824) {
            paddingRight = size;
        } else if (mode == Integer.MIN_VALUE) {
            paddingRight = Math.min(paddingRight, size);
        }
        if (mode2 == 1073741824) {
            paddingBottom = size2;
        } else if (mode2 == Integer.MIN_VALUE) {
            paddingBottom = Math.min(paddingBottom, size2);
        }
        int i6 = this.LJLJI;
        if (i6 == 2 || (i4 = this.LJLIL) == 0 || (i5 = this.LJLILLLLZI) == 0) {
            float f4 = paddingBottom;
            float f5 = paddingRight;
            float f6 = f4 / f5;
            int i7 = this.LJLIL;
            if (i7 == 0 || (i3 = this.LJLILLLLZI) == 0) {
                f = 1.7777778f;
                i7 = 9;
                i3 = 16;
            } else {
                f = i3 / i7;
            }
            if (f > f6) {
                paddingBottom = (int) (i3 * ((f5 * 1.0f) / i7));
            } else {
                f2 = (f4 * 1.0f) / i3;
                f3 = i7;
                paddingRight = (int) (f3 * f2);
            }
        } else if (i6 != 1) {
            if (i6 == 0) {
                f3 = i4;
                float f7 = i5;
                int i8 = (int) (((paddingRight * 1.0f) / f3) * f7);
                if (i8 > paddingBottom) {
                    f2 = (paddingBottom * 1.0f) / f7;
                    paddingRight = (int) (f3 * f2);
                } else {
                    paddingBottom = i8;
                }
            } else if (i6 == 3) {
                paddingBottom = (int) (i5 * ((paddingRight * 1.0f) / i4));
            } else {
                paddingRight = 0;
                paddingBottom = 0;
            }
        }
        B4I.LIZ("RenderView", "TextureView:onMeasure width:" + paddingRight + " height:" + paddingBottom);
        setMeasuredDimension(paddingRight, paddingBottom);
        DataChannel dataChannel = this.LJLJJI;
        if (dataChannel != null) {
            dataChannel.pv0(VideoViewMeasureEvent.class);
        }
    }

    @Override // X.B4L
    public final void setVideoSize(int i, int i2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TextureView:setVideoSize width:");
        LIZ.append(i);
        LIZ.append(" height:");
        LIZ.append(i2);
        B4I.LIZ("RenderView", X1D.LIZIZ(LIZ));
        if (i > 0 && i2 > 0) {
            this.LJLIL = i;
            this.LJLILLLLZI = i2;
            requestLayout();
        }
    }

    public CVR(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LJLJI = 2;
    }
}

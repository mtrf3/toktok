package X;

import android.content.Context;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.dataChannel.VideoViewMeasureEvent;
import com.bytedance.common.utility.Logger;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CVS extends SurfaceView implements InterfaceC28165B3p, C0RR {
    public int LJLIL;
    public int LJLILLLLZI;
    public int LJLJI;
    public final float LJLJJI;
    public DataChannel LJLJJL;
    public C0RP LJLJJLL;
    public int LJLJL;

    @Override // X.C0RR
    public final void LJJJJIZL() {
        this.LJLJL++;
    }

    @Override // X.C0RR
    public C0RP getCacheHelper() {
        C0RP c0rp = this.LJLJJLL;
        if (c0rp == null) {
            C0RP c0rp2 = new C0RP();
            this.LJLJJLL = c0rp2;
            return c0rp2;
        }
        return c0rp;
    }

    @Override // X.B4L
    public final void reset() {
        B4I.LIZ("RenderView", "SurfaceView:reset");
    }

    @Override // X.C0RR
    public int getCallCount() {
        return this.LJLJL;
    }

    @Override // X.B4L
    public int getStreamHeight() {
        return this.LJLILLLLZI;
    }

    @Override // X.B4L
    public int getStreamWidth() {
        return this.LJLIL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CVS(Context context) {
        super(context);
        a1.LJFF(context, "context");
        this.LJLJI = 2;
        this.LJLJJI = 1.7777778f;
    }

    @Override // X.C0RR
    public final void LJJIIZ(ViewGroup.LayoutParams layoutParams) {
        Integer num;
        int i;
        super.setLayoutParams(layoutParams);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("surfaceview performChangeLayoutParams: width: ");
        Integer num2 = null;
        if (layoutParams != null) {
            num = Integer.valueOf(layoutParams.width);
        } else {
            num = null;
        }
        LIZ.append(num);
        LIZ.append(", height: ");
        if (layoutParams != null) {
            num2 = Integer.valueOf(layoutParams.height);
        }
        LIZ.append(num2);
        LIZ.append(", hc = ");
        LIZ.append(hashCode());
        LIZ.append(" lp.hc = ");
        if (layoutParams != null) {
            i = layoutParams.hashCode();
        } else {
            i = 0;
        }
        LIZ.append(i);
        Logger.i("ttlive_enter_room_log_RenderView", X1D.LIZIZ(LIZ));
    }

    @Override // X.InterfaceC28165B3p
    public void setDataChannel(DataChannel dataChannel) {
        o.LJIIIZ(dataChannel, "dataChannel");
        this.LJLJJL = dataChannel;
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        Integer num;
        int i;
        C0RQ.LIZ(this, layoutParams);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("surfaceview performChangeLayoutParams: width: ");
        Integer num2 = null;
        if (layoutParams != null) {
            num = Integer.valueOf(layoutParams.width);
        } else {
            num = null;
        }
        LIZ.append(num);
        LIZ.append(", height: ");
        if (layoutParams != null) {
            num2 = Integer.valueOf(layoutParams.height);
        }
        LIZ.append(num2);
        LIZ.append(", hc = ");
        LIZ.append(hashCode());
        LIZ.append(" params.hc = ");
        if (layoutParams != null) {
            i = layoutParams.hashCode();
        } else {
            i = 0;
        }
        LIZ.append(i);
        Logger.i("ttlive_enter_room_log_RenderView", X1D.LIZIZ(LIZ));
    }

    @Override // X.B4L
    public void setScaleType(int i) {
        LIZ(i, "");
    }

    @Override // android.view.SurfaceView, android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
    }

    @Override // X.B4L
    public final void LIZ(int i, String from) {
        o.LJIIIZ(from, "from");
        this.LJLJI = i;
        StringBuilder LIZ = C06830Op.LIZ("SurfaceView:setScaleType :", i, " from:", from, " hc = ");
        LIZ.append(hashCode());
        B4I.LIZ("RenderView", X1D.LIZIZ(LIZ));
    }

    @Override // android.view.SurfaceView, android.view.View
    public final void onMeasure(int i, int i2) {
        float f;
        int i3;
        float f2;
        float f3;
        float f4;
        int i4;
        int i5;
        int i6;
        int i7;
        int paddingRight = getPaddingRight() + getPaddingLeft() + getSuggestedMinimumWidth();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + getSuggestedMinimumHeight();
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 1073741824) {
                paddingRight = size;
            }
        } else {
            paddingRight = Math.min(paddingRight, size);
        }
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 == 1073741824) {
                paddingBottom = size2;
            }
        } else {
            paddingBottom = Math.min(paddingBottom, size2);
        }
        int i8 = this.LJLJI;
        if (i8 == 2 || (i6 = this.LJLIL) == 0 || (i7 = this.LJLILLLLZI) == 0) {
            float f5 = paddingBottom;
            float f6 = paddingRight;
            float f7 = f5 / f6;
            int i9 = this.LJLIL;
            if (i9 == 0 || (i3 = this.LJLILLLLZI) == 0) {
                f = this.LJLJJI;
                i9 = 9;
                i3 = 16;
            } else {
                f = i3 / i9;
            }
            if (f > f7) {
                f4 = i3 * ((f6 * 1.0f) / i9);
                i5 = (int) f4;
                i4 = paddingRight;
            } else {
                f2 = (f5 * 1.0f) / i3;
                f3 = i9;
                i4 = (int) (f3 * f2);
                i5 = paddingBottom;
            }
        } else if (i8 == 1) {
            i4 = paddingRight;
            i5 = paddingBottom;
        } else if (i8 == 0) {
            f3 = i6;
            float f8 = i7;
            f4 = ((paddingRight * 1.0f) / f3) * f8;
            float f9 = paddingBottom;
            if (f4 > f9) {
                f2 = (f9 * 1.0f) / f8;
                i4 = (int) (f3 * f2);
                i5 = paddingBottom;
            }
            i5 = (int) f4;
            i4 = paddingRight;
        } else if (i8 == 3) {
            i5 = (int) (i7 * ((paddingRight * 1.0f) / i6));
            i4 = paddingRight;
        } else {
            i4 = 0;
            i5 = 0;
        }
        StringBuilder sb = new StringBuilder("SurfaceView:onMeasure width:");
        sb.append(i4);
        sb.append(" height:");
        sb.append(i5);
        sb.append(" surfaceViewLayout:");
        sb.append(this.LJLJI);
        sb.append(" mVideoWidth:");
        sb.append(this.LJLIL);
        sb.append(" mVideoHeight:");
        sb.append(this.LJLILLLLZI);
        sb.append(", hc=");
        sb.append(hashCode());
        sb.append("，Measure W/H + ");
        C15890jp.LIZIZ(sb, paddingRight, " + ", paddingBottom, ", hc=");
        sb.append(hashCode());
        B4I.LIZ("RenderView", sb.toString());
        setMeasuredDimension(i4, i5);
        DataChannel dataChannel = this.LJLJJL;
        if (dataChannel != null) {
            dataChannel.pv0(VideoViewMeasureEvent.class);
        }
    }

    @Override // X.B4L
    public final void setVideoSize(int i, int i2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SurfaceView:setVideoSize width:");
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
}

package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.ss.ttlivestreamer.livestreamv2.DragSurfaceView$onUpdataLocationListener;

/* renamed from: X.6l1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class ViewOnTouchListenerC169516l1 extends SurfaceView implements View.OnTouchListener {
    public int lastX;
    public int lastY;
    public Activity mActivity;
    public boolean mDragable;
    public boolean mIsFirstTouch;
    public boolean mIsScale;
    public DragSurfaceView$onUpdataLocationListener mLocationListener;
    public int offset;
    public int oriBottom;
    public int oriLeft;
    public int oriRight;
    public int oriTop;
    public int screenHeight;
    public int screenWidth;
    public int viewOrigHeight;
    public int viewOrigWidth;

    private void initView() {
        setFocusable(true);
        setLongClickable(true);
        setClickable(true);
        super.setOnTouchListener(this);
    }

    private int getTitleTopHeight() {
        Rect rect = new Rect();
        Activity activity = (Activity) getContext();
        this.mActivity = activity;
        try {
            activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
            return rect.top;
        } catch (NullPointerException unused) {
            return 0;
        }
    }

    private ViewGroup.LayoutParams getNewLayoutParams() {
        if (getLayoutParams() instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) getLayoutParams();
            int i = this.oriLeft;
            layoutParams.leftMargin = i;
            int i2 = this.oriTop;
            layoutParams.topMargin = i2;
            layoutParams.width = this.oriRight - i;
            layoutParams.height = this.oriBottom - i2;
            return layoutParams;
        }
        if (getLayoutParams() instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) getLayoutParams();
            int i3 = this.oriLeft;
            layoutParams2.leftMargin = i3;
            int i4 = this.oriTop;
            layoutParams2.topMargin = i4;
            layoutParams2.width = this.oriRight - i3;
            layoutParams2.height = this.oriBottom - i4;
            return layoutParams2;
        }
        return null;
    }

    public ViewOnTouchListenerC169516l1(Context context) {
        super(context);
        this.mIsFirstTouch = true;
        this.offset = 20;
        initView();
    }

    public void setDragable(boolean z) {
        this.mDragable = z;
    }

    @Override // android.view.View
    public void setOnTouchListener(final View.OnTouchListener onTouchListener) {
        super.setOnTouchListener(new View.OnTouchListener() { // from class: X.6l2
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean lambda$setOnTouchListener$0;
                lambda$setOnTouchListener$0 = ViewOnTouchListenerC169516l1.this.lambda$setOnTouchListener$0(onTouchListener, view, motionEvent);
                return lambda$setOnTouchListener$0;
            }
        });
    }

    public void setUpdateLocationListener(DragSurfaceView$onUpdataLocationListener dragSurfaceView$onUpdataLocationListener) {
        this.mLocationListener = dragSurfaceView$onUpdataLocationListener;
    }

    public ViewOnTouchListenerC169516l1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mIsFirstTouch = true;
        this.offset = 20;
        initView();
    }

    private boolean onTouchInternal(View view, MotionEvent motionEvent) {
        return onTouch(view, motionEvent);
    }

    private void scaleView(View view, int i) {
        int i2 = (this.viewOrigHeight * i) / this.viewOrigWidth;
        int i3 = this.oriRight + i;
        this.oriRight = i3;
        int i4 = this.oriBottom + i2;
        this.oriBottom = i4;
        int i5 = this.screenWidth;
        int i6 = this.offset;
        if (i3 > i5 - i6 || i4 > this.screenHeight - i6 || (i3 - this.oriLeft) - (i6 * 2) < 200 || (i4 - this.oriTop) - (i6 * 2) < 200) {
            this.oriRight = i3 - i;
            this.oriBottom = i4 - i2;
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.mIsFirstTouch) {
            this.viewOrigHeight = view.getHeight();
            this.viewOrigWidth = view.getWidth();
            this.screenHeight = (getResources().getDisplayMetrics().heightPixels - 40) - getTitleTopHeight();
            this.screenWidth = getResources().getDisplayMetrics().widthPixels;
            this.mIsFirstTouch = false;
        }
        if (!this.mDragable) {
            return true;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.oriLeft = view.getLeft();
            this.oriRight = view.getRight();
            this.oriTop = view.getTop();
            this.oriBottom = view.getBottom();
            this.lastY = (int) motionEvent.getRawY();
            this.lastX = (int) motionEvent.getRawX();
            this.mIsScale = isScale(view, (int) motionEvent.getX(), (int) motionEvent.getY());
        } else if (action == 2) {
            int rawX = ((int) motionEvent.getRawX()) - this.lastX;
            int rawY = ((int) motionEvent.getRawY()) - this.lastY;
            if (this.mIsScale) {
                scaleView(view, rawX);
            } else {
                moveView(view, rawX, rawY);
            }
            view.layout(this.oriLeft, this.oriTop, this.oriRight, this.oriBottom);
            this.lastX = (int) motionEvent.getRawX();
            this.lastY = (int) motionEvent.getRawY();
            DragSurfaceView$onUpdataLocationListener dragSurfaceView$onUpdataLocationListener = this.mLocationListener;
            if (dragSurfaceView$onUpdataLocationListener != null) {
                int i = this.screenWidth;
                float f = (this.oriRight * 1.0f) / i;
                int i2 = this.screenHeight;
                dragSurfaceView$onUpdataLocationListener.onUpdateLocation((this.oriLeft * 1.0f) / i, f, (this.oriTop * 1.0f) / i2, (this.oriBottom * 1.0f) / i2);
            }
        } else if (action == 1) {
            ViewGroup.LayoutParams newLayoutParams = getNewLayoutParams();
            if (newLayoutParams != null) {
                view.setLayoutParams(newLayoutParams);
            }
            this.mIsScale = false;
        }
        invalidate();
        return true;
    }

    public ViewOnTouchListenerC169516l1(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mIsFirstTouch = true;
        this.offset = 20;
        initView();
    }

    private boolean isScale(View view, int i, int i2) {
        int left = view.getLeft();
        int right = view.getRight();
        int bottom = view.getBottom();
        int top = view.getTop();
        if ((right - left) - i < 80 && (bottom - top) - i2 < 80) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$setOnTouchListener$0(View.OnTouchListener onTouchListener, View view, MotionEvent motionEvent) {
        boolean onTouch = onTouchListener.onTouch(view, motionEvent);
        onTouchInternal(view, motionEvent);
        return onTouch;
    }

    private void moveView(View view, int i, int i2) {
        int i3 = this.oriLeft;
        int i4 = i3 + i;
        int i5 = this.offset;
        if (i4 > i5) {
            int i6 = this.oriRight;
            if (i6 + i < this.screenWidth - i5) {
                this.oriLeft = i3 + i;
                this.oriRight = i6 + i;
            }
        }
        int i7 = this.oriTop;
        if (i7 + i2 > i5) {
            int i8 = this.oriBottom;
            if (i8 + i2 < this.screenHeight - i5) {
                this.oriTop = i7 + i2;
                this.oriBottom = i8 + i2;
            }
        }
    }
}

package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.5hL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ViewOnTouchListenerC141755hL extends FrameLayout implements View.OnTouchListener {
    public int LJLIL;
    public RecyclerView LJLILLLLZI;
    public C141765hM LJLJI;
    public float LJLJJI;
    public float LJLJJL;
    public View LJLJJLL;
    public View LJLJL;
    public FrameLayout.LayoutParams LJLJLJ;
    public FrameLayout.LayoutParams LJLJLLL;
    public int LJLL;
    public int LJLLI;

    public final void setOnScrollListener(InterfaceC141785hO interfaceC141785hO) {
    }

    public final void LIZLLL() {
        C141765hM c141765hM = this.LJLJI;
        if (c141765hM != null) {
            c141765hM.setOnTouchListener(null);
            C141765hM c141765hM2 = this.LJLJI;
            o.LJI(c141765hM2);
            c141765hM2.setVisibility(8);
        }
    }

    public final AbstractC029409q<?> getAdapter() {
        RecyclerView recyclerView = this.LJLILLLLZI;
        o.LJI(recyclerView);
        return recyclerView.getAdapter();
    }

    public final float getOneThumbHeight() {
        o.LJI(this.LJLJI);
        return r0.getHeight() - (KL2.LIZJ(getContext(), 2.0f) * 2);
    }

    public final float getOneThumbWidth() {
        return getMeasuredWidth() / this.LJLIL;
    }

    public final int getCoverSize() {
        return this.LJLIL;
    }

    public final int getFrameHeight() {
        return this.LJLLI;
    }

    public final int getFrameWidth() {
        return this.LJLL;
    }

    public final void LIZ(float f) {
        FrameLayout.LayoutParams layoutParams = this.LJLJLJ;
        o.LJI(layoutParams);
        layoutParams.width = (int) (f - 0);
        View view = this.LJLJJLL;
        o.LJI(view);
        view.setLayoutParams(this.LJLJLJ);
        FrameLayout.LayoutParams layoutParams2 = this.LJLJLLL;
        o.LJI(layoutParams2);
        o.LJI(this.LJLJI);
        layoutParams2.width = (int) ((getMeasuredWidth() - f) + r0.getWidth());
        View view2 = this.LJLJL;
        o.LJI(view2);
        o.LJI(this.LJLJI);
        view2.setX(f + r0.getWidth());
        View view3 = this.LJLJL;
        o.LJI(view3);
        view3.setLayoutParams(this.LJLJLLL);
    }

    public final float LIZIZ(MotionEvent motionEvent) {
        o.LJII(getParent(), "null cannot be cast to non-null type android.view.ViewGroup");
        this.LJLJJI = ((View) r1).getPaddingLeft();
        this.LJLJJL = getPaddingLeft();
        float rawX = this.LJLJJL + (motionEvent.getRawX() - this.LJLJJI);
        o.LJI(this.LJLJI);
        float width = rawX - (r0.getWidth() / 2.0f);
        o.LJI(this.LJLJI);
        if (width > (this.LJLIL - 1) * r0.getWidth()) {
            C141765hM c141765hM = this.LJLJI;
            o.LJI(c141765hM);
            width = (this.LJLIL - 1) * c141765hM.getWidth();
        }
        if (width < 0.0f) {
            return 0.0f;
        }
        return width;
    }

    public final void LIZJ(MotionEvent motionEvent) {
        float LIZIZ = LIZIZ(motionEvent);
        C141765hM c141765hM = this.LJLJI;
        o.LJI(c141765hM);
        ViewPropertyAnimator x = c141765hM.animate().x(LIZIZ);
        C141765hM c141765hM2 = this.LJLJI;
        o.LJI(c141765hM2);
        x.y(c141765hM2.getY()).setDuration(0L).start();
        LIZ(LIZIZ);
    }

    public final void setAdapter(AbstractC029409q<?> abstractC029409q) {
        RecyclerView recyclerView = this.LJLILLLLZI;
        o.LJI(recyclerView);
        recyclerView.setAdapter(abstractC029409q);
    }

    public final void setCoverSize(int i) {
        this.LJLIL = i;
    }

    public final void setFrameHeight(int i) {
        this.LJLLI = i;
    }

    public final void setFrameWidth(int i) {
        this.LJLL = i;
    }

    public final void setLayoutManager(C0A2 c0a2) {
        RecyclerView recyclerView = this.LJLILLLLZI;
        o.LJI(recyclerView);
        recyclerView.setLayoutManager(c0a2);
    }

    public final void setVideoCoverFrameView(Bitmap bitmap) {
        if (bitmap == null) {
            return;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int oneThumbWidth = (int) getOneThumbWidth();
        int oneThumbHeight = (int) getOneThumbHeight();
        int i = height * oneThumbWidth;
        int i2 = width * oneThumbHeight;
        if (i > i2) {
            oneThumbWidth = i2 / height;
        } else {
            oneThumbHeight = i / width;
        }
        C141765hM c141765hM = this.LJLJI;
        o.LJI(c141765hM);
        c141765hM.setImageBitmap(Bitmap.createScaledBitmap(bitmap, oneThumbWidth, oneThumbHeight, true));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnTouchListenerC141755hL(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLIL = 7;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.a87, R.attr.a8q, R.attr.a8r, R.attr.aet, R.attr.aev, R.attr.anz, R.attr.b0v, R.attr.b0w, R.attr.b24, R.attr.b4z, R.attr.bah, R.attr.bbm, R.attr.bee});
            o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr….styleable.VideoEditView)");
            this.LJLL = Math.round(obtainStyledAttributes.getDimension(4, 0.0f));
            this.LJLLI = Math.round(obtainStyledAttributes.getDimension(3, 0.0f));
        }
        RecyclerView recyclerView = new RecyclerView(context, null);
        this.LJLILLLLZI = recyclerView;
        recyclerView.setTag("tag_RecyclerView");
        RecyclerView recyclerView2 = this.LJLILLLLZI;
        o.LJI(recyclerView2);
        recyclerView2.setOnTouchListener(this);
        addView(this.LJLILLLLZI, new FrameLayout.LayoutParams(-1, -1));
        C141765hM c141765hM = new C141765hM(context);
        this.LJLJI = c141765hM;
        c141765hM.setScaleType(ImageView.ScaleType.CENTER_CROP);
        C141765hM c141765hM2 = this.LJLJI;
        o.LJI(c141765hM2);
        Context context2 = getContext();
        o.LJIIIIZZ(context2, "this.context");
        c141765hM2.setColor(AnonymousClass636.LJIIIIZZ(R.attr.eb, context2));
        C141765hM c141765hM3 = this.LJLJI;
        o.LJI(c141765hM3);
        c141765hM3.setTag("tag_VideoCoverFrameView");
        C141765hM c141765hM4 = this.LJLJI;
        o.LJI(c141765hM4);
        c141765hM4.setOnTouchListener(this);
        addView(this.LJLJI);
        this.LJLJJLL = new View(context);
        this.LJLJLJ = new FrameLayout.LayoutParams(-1, -1);
        View view = this.LJLJJLL;
        o.LJI(view);
        view.setBackgroundResource(R.drawable.a1h);
        this.LJLJL = new View(context);
        this.LJLJLLL = new FrameLayout.LayoutParams(-1, -1);
        View view2 = this.LJLJL;
        o.LJI(view2);
        view2.setBackgroundResource(R.drawable.a1h);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredHeight = getMeasuredHeight();
        int measuredWidth = getMeasuredWidth();
        C141765hM c141765hM = this.LJLJI;
        o.LJI(c141765hM);
        c141765hM.LIZ(measuredWidth / this.LJLIL, measuredHeight);
        C141765hM c141765hM2 = this.LJLJI;
        o.LJI(c141765hM2);
        LIZ(c141765hM2.getX());
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View v, MotionEvent event) {
        o.LJIIIZ(v, "v");
        o.LJIIIZ(event, "event");
        Object tag = v.getTag();
        o.LJII(tag, "null cannot be cast to non-null type kotlin.String");
        if (o.LJ(tag, "tag_VideoCoverFrameView")) {
            int action = event.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action == 2) {
                        LIZJ(event);
                    }
                } else {
                    LIZIZ(event);
                }
            } else {
                LIZIZ(event);
            }
            return true;
        }
        if (o.LJ(tag, "tag_RecyclerView")) {
            int action2 = event.getAction();
            if (action2 != 0) {
                if (action2 == 1) {
                    LIZJ(event);
                    LIZIZ(event);
                }
            } else {
                LIZIZ(event);
            }
            return true;
        }
        return onTouchEvent(event);
    }
}

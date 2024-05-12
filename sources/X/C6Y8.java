package X;

import Y.AfS54S0100000_2;
import Y.IDTListenerS112S0100000_2;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* renamed from: X.6Y8, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6Y8 extends FrameLayout {
    public final int LJLIL;
    public RecyclerView LJLILLLLZI;
    public C141765hM LJLJI;
    public final View LJLJJI;
    public C6Y9 LJLJJL;
    public final C73893SzJ<MotionEvent> LJLJJLL;

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    private final float getOneThumbHeight() {
        return this.LJLJI.getHeight() - (KL2.LIZJ(getContext(), 2.0f) * 2);
    }

    public final float getVideoCoverViewX() {
        return this.LJLJI.getX();
    }

    public final float getOneThumbWidth() {
        return getMeasuredWidth() / this.LJLIL;
    }

    public final int getCoverSize() {
        return this.LJLIL;
    }

    public final RecyclerView getRecyclerView() {
        return this.LJLILLLLZI;
    }

    public final C141765hM getVideoCoverView() {
        return this.LJLJI;
    }

    public final float LIZ(MotionEvent motionEvent) {
        float x;
        float oneThumbWidth;
        float f;
        float f2 = 2;
        if (motionEvent.getX() <= getOneThumbWidth() / f2) {
            f = 0.0f;
        } else {
            if (motionEvent.getX() >= getMeasuredWidth() - (getOneThumbWidth() / f2)) {
                x = getMeasuredWidth();
                oneThumbWidth = getOneThumbWidth();
            } else {
                x = motionEvent.getX();
                oneThumbWidth = getOneThumbWidth() / f2;
            }
            f = x - oneThumbWidth;
        }
        float measuredWidth = f / (getMeasuredWidth() - getOneThumbWidth());
        if (measuredWidth > 0.9f) {
            return 0.9f;
        }
        return measuredWidth;
    }

    public final void LIZIZ(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float f = 2;
        if (x <= getOneThumbWidth() / f) {
            this.LJLJI.setX(0.0f);
        } else if (x >= getMeasuredWidth() - (getOneThumbWidth() / f)) {
            this.LJLJI.setX(getMeasuredWidth() - getOneThumbWidth());
        } else {
            this.LJLJI.setX(x - (getOneThumbWidth() / f));
        }
    }

    public final void LIZJ(float f) {
        this.LJLJI.animate().scaleX(f).scaleY(f).setDuration(100L).start();
    }

    public final void setAdapter(AbstractC029409q<RecyclerView.ViewHolder> adapter) {
        o.LJIIIZ(adapter, "adapter");
        this.LJLILLLLZI.setAdapter(adapter);
    }

    public final void setOnScrollListener(C6Y9 onScrollListener) {
        o.LJIIIZ(onScrollListener, "onScrollListener");
        this.LJLJJL = onScrollListener;
    }

    public final void setRecyclerView(RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "<set-?>");
        this.LJLILLLLZI = recyclerView;
    }

    public final void setVideoCoverFrameView(Bitmap bitmap) {
        int i;
        int i2;
        o.LJIIIZ(bitmap, "bitmap");
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        float oneThumbWidth = getOneThumbWidth();
        float oneThumbHeight = getOneThumbHeight();
        if (height * oneThumbWidth > width * oneThumbHeight) {
            i = (int) oneThumbHeight;
            i2 = (width * i) / height;
        } else {
            int i3 = (int) oneThumbWidth;
            i = (height * i3) / width;
            i2 = i3;
        }
        this.LJLJI.setImageBitmap(Bitmap.createScaledBitmap(bitmap, i2, i, true));
    }

    public final void setVideoCoverView(C141765hM c141765hM) {
        o.LJIIIZ(c141765hM, "<set-?>");
        this.LJLJI = c141765hM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6Y8(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLIL = 7;
        RecyclerView recyclerView = new RecyclerView(context, attributeSet);
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        recyclerView.setHasFixedSize(true);
        this.LJLILLLLZI = recyclerView;
        C141765hM c141765hM = new C141765hM(context);
        c141765hM.setScaleType(ImageView.ScaleType.CENTER_CROP);
        c141765hM.setColor(AnonymousClass636.LJIIIIZZ(R.attr.eb, context));
        this.LJLJI = c141765hM;
        View view = new View(context, attributeSet);
        view.setBackgroundResource(R.drawable.a1h);
        this.LJLJJI = view;
        C73893SzJ<MotionEvent> c73893SzJ = new C73893SzJ<>();
        this.LJLJJLL = c73893SzJ;
        C73603Sud LJJIFFI = c73893SzJ.LJJIFFI(C32810CuE.LJLIL);
        C73603Sud LJJIFFI2 = c73893SzJ.LJJIFFI(C73343SqR.LJLJJI);
        C73603Sud LJJIFFI3 = c73893SzJ.LJJIFFI(C38891fp.LJLJJI);
        C73603Sud LJJIFFI4 = c73893SzJ.LJJIFFI(C30591Hz.LJLJI);
        addView(this.LJLILLLLZI, new FrameLayout.LayoutParams(-1, -1));
        addView(view, new FrameLayout.LayoutParams(-1, -1));
        addView(this.LJLJI);
        setOnTouchListener(new IDTListenerS112S0100000_2(this, 13));
        LJJIFFI.LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new AfS54S0100000_2(this, 24));
        LJJIFFI2.LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new AfS54S0100000_2(this, 25));
        LJJIFFI3.LJIIJJI(200L, TimeUnit.MILLISECONDS).LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new AfS54S0100000_2(this, 26));
        LJJIFFI4.LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new AfS54S0100000_2(this, 27));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.LJLJI.LIZ(getMeasuredWidth() / this.LJLIL, getMeasuredHeight());
    }
}

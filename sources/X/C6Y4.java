package X;

import Y.ARunnableS21S0200000_2;
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

/* renamed from: X.6Y4, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6Y4 extends FrameLayout {
    public int LJLIL;
    public int LJLILLLLZI;
    public int LJLJI;
    public RecyclerView LJLJJI;
    public C141765hM LJLJJL;
    public View LJLJJLL;
    public C6YC LJLJL;
    public final C73893SzJ<MotionEvent> LJLJLJ;

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    private final float getOneThumbHeight() {
        return this.LJLJJL.getHeight() - (KL2.LIZJ(getContext(), 2.0f) * 2);
    }

    public final AbstractC029409q<RecyclerView.ViewHolder> getAdapter() {
        return this.LJLJJI.getAdapter();
    }

    public final float getVideoCoverViewX() {
        return this.LJLJJL.getX();
    }

    public final float getOneThumbWidth() {
        return getMeasuredWidth() / (this.LJLIL / this.LJLILLLLZI);
    }

    public final int getCoverSize() {
        return this.LJLIL;
    }

    public final int getCurPage() {
        return this.LJLJI;
    }

    public final int getItemCount() {
        return this.LJLIL;
    }

    public final RecyclerView getRecyclerView() {
        return this.LJLJJI;
    }

    public final View getShadowView() {
        return this.LJLJJLL;
    }

    public final int getTotalPage() {
        return this.LJLILLLLZI;
    }

    public final C141765hM getVideoCoverView() {
        return this.LJLJJL;
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
            measuredWidth = 0.9f;
        }
        if (C173636rf.LIZIZ(getContext())) {
            measuredWidth = 0.9f - measuredWidth;
        }
        return (this.LJLJI + measuredWidth) * (1.0f / this.LJLILLLLZI);
    }

    public final void LIZIZ(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float f = 2;
        if (x <= getOneThumbWidth() / f) {
            this.LJLJJL.setX(0.0f);
        } else if (x >= getMeasuredWidth() - (getOneThumbWidth() / f)) {
            this.LJLJJL.setX(getMeasuredWidth() - getOneThumbWidth());
        } else {
            this.LJLJJL.setX(x - (getOneThumbWidth() / f));
        }
    }

    public final void LIZJ(float f) {
        this.LJLJJL.animate().scaleX(f).scaleY(f).setDuration(100L).start();
    }

    public final void setAdapter(AbstractC029409q<RecyclerView.ViewHolder> adapter) {
        o.LJIIIZ(adapter, "adapter");
        this.LJLJJI.setAdapter(adapter);
    }

    public final void setCurPage(int i) {
        this.LJLJI = i;
    }

    public final void setItemCount(int i) {
        this.LJLIL = i;
    }

    public final void setOnScrollListener(C6YC onScrollListener) {
        o.LJIIIZ(onScrollListener, "onScrollListener");
        this.LJLJL = onScrollListener;
    }

    public final void setRecyclerView(RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "<set-?>");
        this.LJLJJI = recyclerView;
    }

    public final void setShadowView(View view) {
        o.LJIIIZ(view, "<set-?>");
        this.LJLJJLL = view;
    }

    public final void setTotalPage(int i) {
        this.LJLILLLLZI = i;
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
        if (i2 > 0 && i > 0) {
            C141765hM c141765hM = this.LJLJJL;
            c141765hM.getClass();
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i2, i, true);
            int min = Math.min(i2, i);
            int i4 = (int) ((min * oneThumbHeight) / oneThumbWidth);
            int max = Math.max((i2 - min) / 2, 0);
            int max2 = Math.max((i - i4) / 2, 0);
            if (max + min > i2 || max2 + i4 > i) {
                c141765hM.post(new ARunnableS21S0200000_2(createScaledBitmap, c141765hM, 58));
                return;
            }
            C1M5 c1m5 = new C1M5(c141765hM.getResources(), Bitmap.createBitmap(createScaledBitmap, max, max2, min, i4));
            c1m5.LIZJ(KL2.LIZJ(c141765hM.getContext(), 4.0f));
            c141765hM.post(new ARunnableS21S0200000_2(c1m5, c141765hM, 59));
        }
    }

    public final void setVideoCoverView(C141765hM c141765hM) {
        o.LJIIIZ(c141765hM, "<set-?>");
        this.LJLJJL = c141765hM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6Y4(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLIL = 7;
        this.LJLILLLLZI = 1;
        RecyclerView recyclerView = new RecyclerView(context, attributeSet);
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        recyclerView.setHasFixedSize(true);
        this.LJLJJI = recyclerView;
        C141765hM c141765hM = new C141765hM(context);
        c141765hM.setScaleType(ImageView.ScaleType.CENTER_CROP);
        c141765hM.setColor(AnonymousClass636.LJIIIIZZ(R.attr.eb, context));
        this.LJLJJL = c141765hM;
        View view = new View(context, attributeSet);
        view.setBackgroundResource(R.drawable.a1h);
        this.LJLJJLL = view;
        C73893SzJ<MotionEvent> c73893SzJ = new C73893SzJ<>();
        this.LJLJLJ = c73893SzJ;
        C73603Sud LJJIFFI = c73893SzJ.LJJIFFI(C73312Spw.LJLIL);
        C73603Sud LJJIFFI2 = c73893SzJ.LJJIFFI(C1FE.LJLILLLLZI);
        C73603Sud LJJIFFI3 = c73893SzJ.LJJIFFI(O6R.LJLJI);
        C73603Sud LJJIFFI4 = c73893SzJ.LJJIFFI(C48841JEv.LJLJJL);
        addView(this.LJLJJI, new FrameLayout.LayoutParams(-1, -1));
        addView(this.LJLJJLL, new FrameLayout.LayoutParams(-1, -1));
        addView(this.LJLJJL);
        setOnTouchListener(new IDTListenerS112S0100000_2(this, 16));
        LJJIFFI.LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new AfS54S0100000_2(this, 30));
        LJJIFFI2.LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new AfS54S0100000_2(this, 31));
        LJJIFFI3.LJIIJJI(200L, TimeUnit.MILLISECONDS).LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new AfS54S0100000_2(this, 32));
        LJJIFFI4.LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new AfS54S0100000_2(this, 33));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.LJLJJL.LIZ(getMeasuredWidth() / (this.LJLIL / this.LJLILLLLZI), getMeasuredHeight());
    }
}

package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.V9c, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79268V9c extends C79267V9b<C79275V9j> {
    @Override // X.C79267V9b, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C54339LUh.LIZ(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C79268V9c(Context context) {
        super(context);
        new LinkedHashMap();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        super.onDraw(canvas);
        int size = getMultiDraweeHolder().LIZIZ.size();
        List<C79275V9j> imageInfoList = getImageInfoList();
        boolean LJIIZILJ = C15380j0.LJIIZILJ();
        if (imageInfoList != null && size == imageInfoList.size()) {
            for (int i = size - 1; -1 < i; i--) {
                Drawable LIZJ = getMultiDraweeHolder().LIZIZ.get(i).LIZJ();
                if (LIZJ != null) {
                    int i2 = ((C79276V9k) ListProtector.get(imageInfoList, i)).LIZIZ;
                    int i3 = ((C79276V9k) ListProtector.get(imageInfoList, i)).LIZJ;
                    int i4 = ((C79275V9j) ListProtector.get(imageInfoList, i)).LJ;
                    if (i3 > getHeight()) {
                        i3 = getHeight();
                    }
                    if (LJIIZILJ) {
                        i4 = (getWidth() - i4) - i2;
                    }
                    int height = (getHeight() - i3) / 2;
                    LIZJ.setBounds(i4, height, i2 + i4, i3 + height);
                    LIZJ.setAlpha(((C79275V9j) ListProtector.get(imageInfoList, i)).LJFF);
                    LIZJ.draw(canvas);
                }
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        int min;
        int min2;
        List<C79275V9j> imageInfoList = getImageInfoList();
        if (imageInfoList == null || imageInfoList.isEmpty()) {
            super.onMeasure(i, i2);
            return;
        }
        int i3 = 0;
        int i4 = 0;
        for (C79275V9j c79275V9j : imageInfoList) {
            i3 = Math.max(i3, c79275V9j.LJ + c79275V9j.LIZIZ);
            i4 = Math.max(i4, c79275V9j.LIZJ);
        }
        int mode = View.MeasureSpec.getMode(i);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode != 1073741824) {
                    min = Math.min(i3, View.MeasureSpec.getSize(i));
                } else {
                    min = View.MeasureSpec.getSize(i);
                }
            } else {
                min = Math.min(i3, View.MeasureSpec.getSize(i));
            }
        } else {
            min = Math.min(i3, View.MeasureSpec.getSize(i));
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 != 0) {
                if (mode2 != 1073741824) {
                    min2 = Math.min(i4, View.MeasureSpec.getSize(i2));
                } else {
                    min2 = View.MeasureSpec.getSize(i);
                }
            } else {
                min2 = Math.min(i4, View.MeasureSpec.getSize(i2));
            }
        } else {
            min2 = Math.min(i4, View.MeasureSpec.getSize(i2));
        }
        setMeasuredDimension(min, min2);
    }
}

package X;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.android.livesdk.comp.api.subscription.base.flashcomponent.FlashDataProvider;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.DJx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C33685DJx extends View {
    public FlashDataProvider LJLIL;

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
    }

    public final InterfaceC33684DJw getViewBinder() {
        return null;
    }

    public void setNativeViewBinder(InterfaceC33684DJw viewBinder) {
        o.LJIIIZ(viewBinder, "viewBinder");
    }

    public final void setViewBinder(InterfaceC33684DJw interfaceC33684DJw) {
    }

    public final FlashDataProvider getDataProvider() {
        return this.LJLIL;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        try {
            super.onRestoreInstanceState(parcelable);
        } catch (Exception unused) {
        }
    }

    public final void setDataProvider(FlashDataProvider flashDataProvider) {
        this.LJLIL = flashDataProvider;
    }

    public final void setFlashDataProvider(FlashDataProvider flashDataProvider) {
        o.LJIIIZ(flashDataProvider, "flashDataProvider");
        this.LJLIL = flashDataProvider;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C33685DJx(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33685DJx(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a1.LJFF(context, "context");
        setWillNotDraw(true);
        setVisibility(8);
    }
}

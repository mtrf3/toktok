package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS156S0100000_6;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DJQ extends View {
    public int LJLIL;
    public int LJLILLLLZI;
    public int LJLJI;
    public boolean LJLJJI;
    public int LJLJJL;
    public final C62822Ol8 LJLJJLL;

    private final Paint getPaint() {
        return (Paint) this.LJLJJLL.getValue();
    }

    public final int getColor() {
        return this.LJLJJL;
    }

    public final int getMax() {
        return this.LJLILLLLZI;
    }

    public final int getMin() {
        return this.LJLIL;
    }

    public final int getProgress() {
        return this.LJLJI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DJQ(Context context) {
        super(context, null, 0);
        new LinkedHashMap();
        this.LJLILLLLZI = 100;
        this.LJLJI = this.LJLIL;
        this.LJLJJI = getLayoutDirection() == 1;
        Integer LJI = C79045V0n.LJI(R.attr.dm, context);
        this.LJLJJL = LJI != null ? LJI.intValue() : 0;
        this.LJLJJLL = C221108m2.LIZIZ(new AqS156S0100000_6(this, 0));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        super.onDraw(canvas);
        if (this.LJLJJI) {
            canvas.drawRect(getWidth() - ((this.LJLJI / (this.LJLILLLLZI - this.LJLIL)) * getWidth()), 0.0f, getWidth(), getHeight(), getPaint());
        } else {
            canvas.drawRect(0.0f, 0.0f, (this.LJLJI / (this.LJLILLLLZI - this.LJLIL)) * getWidth(), getHeight(), getPaint());
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        this.LJLJJI = z;
    }

    public final void setColor(int i) {
        this.LJLJJL = i;
        getPaint().setColor(i);
        postInvalidate();
    }

    public final void setMax(int i) {
        this.LJLILLLLZI = i;
        postInvalidate();
    }

    public final void setMin(int i) {
        this.LJLIL = i;
        postInvalidate();
    }

    public final void setProgress(int i) {
        this.LJLJI = i;
        postInvalidate();
    }
}

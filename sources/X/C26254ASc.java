package X;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.reflect.Field;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.ASc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26254ASc extends FrameLayout {
    public static final Field LJLJI;
    public static final Field LJLJJI;
    public int LJLIL;
    public int LJLILLLLZI;

    static {
        Field declaredField = View.class.getDeclaredField("mAttachInfo");
        declaredField.setAccessible(true);
        LJLJI = declaredField;
        Field declaredField2 = Class.forName("android.view.View$AttachInfo").getDeclaredField("mVisibleInsets");
        declaredField2.setAccessible(true);
        LJLJJI = declaredField2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26254ASc(Context context) {
        super(context, null, 0);
        new LinkedHashMap();
        this.LJLIL = -1;
        this.LJLILLLLZI = -1;
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        int i = this.LJLIL;
        if (i >= 0 && rect != null) {
            rect.top = i;
        }
        int i2 = this.LJLILLLLZI;
        if (i2 >= 0 && rect != null) {
            rect.bottom = i2;
        }
        return super.fitSystemWindows(rect);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        try {
            if (Build.VERSION.SDK_INT < 30) {
                Object obj = LJLJJI.get(LJLJI.get(this));
                o.LJII(obj, "null cannot be cast to non-null type android.graphics.Rect");
                Rect rect = (Rect) obj;
                int i3 = this.LJLIL;
                int i4 = rect.top;
                if (i3 != i4 || this.LJLILLLLZI != rect.bottom) {
                    this.LJLIL = i4;
                    this.LJLILLLLZI = rect.bottom;
                    requestApplyInsets();
                }
            }
        } catch (Exception unused) {
        }
    }
}

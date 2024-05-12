package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.NYy, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59556NYy extends RelativeLayout {
    public LinearLayout LJLIL;
    public View LJLILLLLZI;
    public View LJLJI;
    public final boolean LJLJJI;
    public C59555NYx LJLJJL;

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        View findViewById = findViewById(R.id.d49);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.fake_user_tab_container)");
        this.LJLIL = (LinearLayout) findViewById;
        View findViewById2 = findViewById(R.id.d41);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.fake_user_indicator)");
        this.LJLILLLLZI = findViewById2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C59556NYy(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLJJI = true;
    }

    public final void LIZ(float f, int i, View view) {
        if (!C27740Aue.LJFF(view)) {
            return;
        }
        LinearLayout linearLayout = this.LJLIL;
        if (linearLayout != null) {
            View childAt = linearLayout.getChildAt(i);
            if (childAt == null) {
                return;
            }
            int i2 = i + 1;
            LinearLayout linearLayout2 = this.LJLIL;
            if (linearLayout2 != null) {
                View childAt2 = linearLayout2.getChildAt(i2);
                if (childAt2 == null) {
                    return;
                }
                if (childAt.getVisibility() != 0 || childAt2.getVisibility() != 0) {
                    if (C27740Aue.LJFF(childAt)) {
                        view.setX(((childAt.getX() + getX()) + (childAt.getWidth() / 2)) - (view.getWidth() / 2));
                        return;
                    }
                    return;
                }
                float x = (childAt.getX() + (childAt.getWidth() / 2)) - (view.getWidth() / 2);
                view.setX(((((childAt2.getX() + (childAt2.getWidth() / 2)) - (view.getWidth() / 2)) - x) * f) + getX() + x);
                return;
            }
            o.LJIJI("tabContainer");
            throw null;
        }
        o.LJIJI("tabContainer");
        throw null;
    }
}

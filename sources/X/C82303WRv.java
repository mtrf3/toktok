package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import kotlin.jvm.internal.o;

/* renamed from: X.WRv, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82303WRv extends LinearLayout {
    public final C82304WRw LJLIL;
    public final C82304WRw LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C82303WRv(Context context, AttributeSet attrs) {
        super(context, attrs);
        o.LJIIIZ(context, "context");
        o.LJIIIZ(attrs, "attrs");
        C82304WRw c82304WRw = new C82304WRw(getContext());
        this.LJLIL = c82304WRw;
        C82304WRw c82304WRw2 = new C82304WRw(getContext());
        this.LJLILLLLZI = c82304WRw2;
        setOrientation(1);
        addView(c82304WRw);
        addView(c82304WRw2);
        c82304WRw2.setScaleX(0.5f);
        c82304WRw2.setScaleY(0.5f);
    }

    public final void LIZ(TIQ tiq, TIQ tiq2, boolean z) {
        C82304WRw c82304WRw = this.LJLIL;
        String str = tiq.LJLIL;
        String str2 = tiq2.LJLIL;
        c82304WRw.getClass();
        RunnableC82305WRx runnableC82305WRx = new RunnableC82305WRx(c82304WRw, str, str2, z);
        if (c82304WRw.LJLJI != 0.0f) {
            runnableC82305WRx.run();
        } else {
            c82304WRw.LJLJJI = runnableC82305WRx;
        }
        C82304WRw c82304WRw2 = this.LJLILLLLZI;
        String str3 = tiq.LJLILLLLZI;
        String str4 = tiq2.LJLILLLLZI;
        c82304WRw2.getClass();
        RunnableC82305WRx runnableC82305WRx2 = new RunnableC82305WRx(c82304WRw2, str3, str4, z);
        if (c82304WRw2.LJLJI != 0.0f) {
            runnableC82305WRx2.run();
        } else {
            c82304WRw2.LJLJJI = runnableC82305WRx2;
        }
        setVisibility(0);
    }
}

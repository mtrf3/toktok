package X;

import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;
import defpackage.a1;

/* renamed from: X.Tzt, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76477Tzt extends FrameLayout {
    public final C29701Eo LJLIL;
    public final C29701Eo LJLILLLLZI;
    public final C29701Eo LJLJI;
    public AnimatorSet LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C76477Tzt(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.dbx, this, true);
        C29701Eo c29701Eo = (C29701Eo) findViewById(R.id.gay);
        this.LJLIL = c29701Eo;
        C29701Eo c29701Eo2 = (C29701Eo) findViewById(R.id.gaz);
        this.LJLILLLLZI = c29701Eo2;
        C29701Eo c29701Eo3 = (C29701Eo) findViewById(R.id.gb0);
        this.LJLJI = c29701Eo3;
        if (c29701Eo != null) {
            c29701Eo.removeAllAnimatorListeners();
            c29701Eo.cancelAnimation();
        }
        if (c29701Eo2 != null) {
            c29701Eo2.removeAllAnimatorListeners();
            c29701Eo2.cancelAnimation();
        }
        if (c29701Eo3 != null) {
            c29701Eo3.removeAllAnimatorListeners();
            c29701Eo3.cancelAnimation();
        }
    }
}

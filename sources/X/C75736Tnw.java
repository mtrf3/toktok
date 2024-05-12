package X;

import android.animation.AnimatorSet;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Tnw, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75736Tnw extends FrameLayout {
    public C47061t0 LJLIL;
    public C47061t0 LJLILLLLZI;
    public AnimatorSet LJLJI;

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        AnimatorSet animatorSet;
        super.onDetachedFromWindow();
        AnimatorSet animatorSet2 = this.LJLJI;
        if (animatorSet2 != null && animatorSet2.isRunning() && (animatorSet = this.LJLJI) != null) {
            animatorSet.end();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C75736Tnw(Context context) {
        super(context, null, 0);
        new LinkedHashMap();
        FrameLayout.inflate(context, R.layout.cva, this);
        View findViewById = findViewById(R.id.acf);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.avatar_iv)");
        this.LJLIL = (C47061t0) findViewById;
        View findViewById2 = findViewById(R.id.aco);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.avatar_new_iv)");
        this.LJLILLLLZI = (C47061t0) findViewById2;
    }
}

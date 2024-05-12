package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public class LBE extends LBF {
    public TuxIconView LJLJI;

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        TuxIconView tuxIconView = (TuxIconView) findViewById(R.id.e_q);
        this.LJLJI = tuxIconView;
        if (tuxIconView != null) {
            getAnimatingViews().add(tuxIconView);
        }
        LBG animationDelegate = getAnimationDelegate();
        List<View> views = getAnimatingViews();
        animationDelegate.getClass();
        o.LJIIIZ(views, "views");
        Iterator<View> it = views.iterator();
        while (it.hasNext()) {
            it.next().setAlpha(0.5f);
        }
        LBG animationDelegate2 = getAnimationDelegate();
        LBD lbd = new LBD(this);
        animationDelegate2.getClass();
        animationDelegate2.LIZLLL = lbd;
    }

    public final void setImageResource(int i) {
        TuxIconView tuxIconView = this.LJLJI;
        if (tuxIconView != null) {
            tuxIconView.setIconRes(i);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LBE(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a1.LJFF(context, "context");
    }
}

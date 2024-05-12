package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;
import au3.IDdS56S0100000_5;
import com.bytedance.android.live.base.model.UrlModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* renamed from: X.Bnw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29872Bnw extends AnimatorListenerAdapter {
    public int LJLIL;
    public final /* synthetic */ List LJLILLLLZI;
    public final /* synthetic */ InterfaceC75158Tec LJLJI;
    public final /* synthetic */ C29867Bnr LJLJJI;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.LJLJJI.LIZLLL();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        super.onAnimationRepeat(animator);
        int i = this.LJLIL + 1;
        this.LJLIL = i;
        if (i % 16 == 0) {
            if (i == this.LJLILLLLZI.size() * 16) {
                this.LJLIL = 0;
            }
            C15640jQ.LJIIIZ(this.LJLJJI.LJLLLL, ((UrlModel) ListProtector.get(this.LJLILLLLZI, this.LJLIL / 16)).L(), -1, -1, -1, this.LJLJI);
            this.LJLJJI.LJLLLL.setIcon((Drawable) null);
        }
    }

    public C29872Bnw(C29867Bnr c29867Bnr, List list, IDdS56S0100000_5 iDdS56S0100000_5) {
        this.LJLJJI = c29867Bnr;
        this.LJLILLLLZI = list;
        this.LJLJI = iDdS56S0100000_5;
    }
}

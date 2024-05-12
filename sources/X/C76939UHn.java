package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bytedance.tux.icon.TuxIconView;
import defpackage.a1;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import kotlin.jvm.internal.o;

/* renamed from: X.UHn, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76939UHn extends FrameLayout {
    public Queue<TuxIconView> LJLIL;
    public Context LJLILLLLZI;
    public int LJLJI;
    public int LJLJJI;
    public Random LJLJJL;
    public C2068389v LJLJJLL;
    public int LJLJL;

    public final int getMLikeViewHeight() {
        return this.LJLJI;
    }

    public final int getMLikeViewWidth() {
        return this.LJLJJI;
    }

    public final Queue<TuxIconView> getMLikeViews() {
        return this.LJLIL;
    }

    public final Random getMRandom() {
        return this.LJLJJL;
    }

    public final void setMLikeViewHeight(int i) {
        this.LJLJI = i;
    }

    public final void setMLikeViewWidth(int i) {
        this.LJLJJI = i;
    }

    public final void setMLikeViews(Queue<TuxIconView> queue) {
        o.LJIIIZ(queue, "<set-?>");
        this.LJLIL = queue;
    }

    public final void setMRandom(Random random) {
        this.LJLJJL = random;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C76939UHn(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLIL = new LinkedList();
        this.LJLJI = -1;
        this.LJLJJI = -1;
        this.LJLILLLLZI = context;
        this.LJLJJL = new Random();
        this.LJLJJI = (int) KL2.LIZJ(context, 72.0f);
        this.LJLJI = (int) KL2.LIZJ(context, 72.0f);
        this.LJLJL = C60996Nwm.LJIIIIZZ(context);
    }
}

package X;

import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import com.bytedance.android.live.base.model.ImageModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.U4y, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76612U4y extends FrameLayout {
    public C73411SrX LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C62822Ol8 LJLJJI;
    public final C62822Ol8 LJLJJL;
    public final C62822Ol8 LJLJJLL;

    private final Animation getMAnimation1() {
        Object value = this.LJLJJL.getValue();
        o.LJIIIIZZ(value, "<get-mAnimation1>(...)");
        return (Animation) value;
    }

    private final Animation getMAnimation2() {
        Object value = this.LJLJJLL.getValue();
        o.LJIIIIZZ(value, "<get-mAnimation2>(...)");
        return (Animation) value;
    }

    private final C31597Caf getMUserAvatar() {
        Object value = this.LJLJJI.getValue();
        o.LJIIIIZZ(value, "<get-mUserAvatar>(...)");
        return (C31597Caf) value;
    }

    public final View getMAnimView1() {
        Object value = this.LJLILLLLZI.getValue();
        o.LJIIIIZZ(value, "<get-mAnimView1>(...)");
        return (View) value;
    }

    public final View getMAnimView2() {
        Object value = this.LJLJI.getValue();
        o.LJIIIIZZ(value, "<get-mAnimView2>(...)");
        return (View) value;
    }

    public final void LIZJ() {
        KL2.LJIILLIIL(0, getMAnimView1());
        getMAnimView1().startAnimation(getMAnimation1());
        KL2.LJIILLIIL(0, getMAnimView2());
        getMAnimView2().startAnimation(getMAnimation2());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C73411SrX c73411SrX = this.LJLIL;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
        getMAnimation1().cancel();
        getMAnimation2().cancel();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C76612U4y(Context context) {
        super(context, null, 0);
        new LinkedHashMap();
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS163S0100000_13(this, 39));
        this.LJLJI = C221108m2.LIZIZ(new AqS163S0100000_13(this, 40));
        this.LJLJJI = C221108m2.LIZIZ(new AqS163S0100000_13(this, 34));
        this.LJLJJL = C221108m2.LIZIZ(new AqS163S0100000_13(this, 41));
        this.LJLJJLL = C221108m2.LIZIZ(new AqS163S0100000_13(this, 33));
        C16880lQ.LLLZIIL(R.layout.dlj, C16880lQ.LLZIL(getContext()), this);
    }

    public final void LIZ(int i) {
        C15640jQ.LJIIJ(getMUserAvatar(), i, getMUserAvatar().getWidth(), getMUserAvatar().getHeight());
    }

    public final void LIZIZ(ImageModel imageModel) {
        C31665Cbl.LJIIJ(getMUserAvatar(), imageModel, getMUserAvatar().getWidth(), getMUserAvatar().getHeight(), R.drawable.cuk);
    }
}

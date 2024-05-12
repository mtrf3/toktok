package X;

import Y.ACListenerS25S0100000_5;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.o;

/* renamed from: X.BjL, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29587BjL extends ConstraintLayout {
    public DataChannel LJLIL;
    public final C5H3 LJLILLLLZI;
    public final java.util.Map<Integer, View> LJLJI;

    public final View _$_findCachedViewById(int i) {
        java.util.Map<Integer, View> map = this.LJLJI;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    private final C47121t6 getCountDownContentView() {
        Object value = this.LJLILLLLZI.getValue();
        o.LJIIIIZZ(value, "<get-countDownContentView>(...)");
        return (C47121t6) value;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C29587BjL(Context ctx, AttributeSet attributeSet) {
        this(ctx, attributeSet, 0);
        o.LJIIIZ(ctx, "ctx");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29587BjL(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LJLJI = C62850Ola.LJFF(context, "ctx");
        this.LJLILLLLZI = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 56));
        o.LJII(ViewGroup.inflate(getContext(), R.layout.dk3, this), "null cannot be cast to non-null type android.view.ViewGroup");
        C16880lQ.LJJII((LiveIconView) _$_findCachedViewById(R.id.b95), new ACListenerS25S0100000_5(this, 34));
        C16880lQ.LJIIZILJ((LinearLayout) _$_findCachedViewById(R.id.bw5), new ACListenerS25S0100000_5(this, 35));
        Drawable LJI = C15380j0.LJI(R.drawable.d4r);
        if (LJI != null) {
            LJI.setBounds(0, 0, C7MY.LIZIZ(12), O6R.LJJIIZ(C32151Nz.LJIIZILJ(12)));
        } else {
            LJI = null;
        }
        C2068189t.LIZ(getCountDownContentView(), R.string.mbg, LJI);
    }
}

package X;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.livesdk.livesetting.publicscreen.CapsuleViewExpandDisable;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.o;
import q03.IDaS200S0200000_5;

/* renamed from: X.BpU, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29968BpU extends ConstraintLayout {
    public final C62822Ol8 LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C62822Ol8 LJLJI;

    private final TextView getAction() {
        Object value = this.LJLIL.getValue();
        o.LJIIIIZZ(value, "<get-action>(...)");
        return (TextView) value;
    }

    private final int getActionMaxWidth() {
        return ((Number) this.LJLJI.getValue()).intValue();
    }

    private final TextView getContent() {
        Object value = this.LJLILLLLZI.getValue();
        o.LJIIIIZZ(value, "<get-content>(...)");
        return (TextView) value;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C29968BpU(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
    }

    public final void LJJLJLI(CQQ cqq, InterfaceC29964BpQ model) {
        o.LJIIIZ(model, "model");
        getContent().setText(model.getContent());
        getAction().setText(model.LJFF());
        if (CapsuleViewExpandDisable.INSTANCE.disable()) {
            C16880lQ.LJIIJ(new IDaS200S0200000_5(model, cqq, 0), getAction());
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        Integer num;
        getAction().setTextSize(1, 12.0f);
        getAction().setMaxWidth(Integer.MAX_VALUE);
        getContent().setTextSize(1, 12.0f);
        getContent().setMaxLines(Integer.MAX_VALUE);
        super.onMeasure(i, i2);
        Layout layout = getContent().getLayout();
        if (layout != null) {
            num = Integer.valueOf(layout.getLineCount());
        } else {
            num = null;
        }
        if (getAction().getMeasuredWidth() > getActionMaxWidth() || (num != null && num.intValue() > 3)) {
            getAction().setTextSize(1, 9.0f);
            getAction().setMaxWidth(getActionMaxWidth());
            getContent().setTextSize(1, 9.0f);
            getContent().setMaxLines(3);
            super.onMeasure(i, i2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29968BpU(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a1.LJFF(context, "context");
        this.LJLIL = C221108m2.LIZIZ(new AqS155S0100000_5(this, 64));
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS155S0100000_5(this, 65));
        this.LJLJI = C221108m2.LIZIZ(C29969BpV.LJLIL);
        C29306Beo.LJIIIIZZ(R.layout.d6v, this, true);
    }
}

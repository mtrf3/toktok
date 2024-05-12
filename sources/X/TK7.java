package X;

import Y.ACListenerS32S0100000_12;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public abstract class TK7 extends FrameLayout {
    public static final /* synthetic */ int LJLJJI = 0;
    public InterfaceC65784Pro<C76800UCe> LJLIL;
    public final C5H3<TK6> LJLILLLLZI;
    public final C5H3 LJLJI;

    private final TK6 getAutoRetryManager() {
        return (TK6) this.LJLJI.getValue();
    }

    public abstract void LIZLLL();

    public final void LIZ() {
        if (C74216TAu.LIZIZ.LJII() == T39.AVAILABLE) {
            return;
        }
        getAutoRetryManager().LIZ();
    }

    public final void LIZIZ() {
        if (this.LJLILLLLZI.isInitialized()) {
            getAutoRetryManager().LIZIZ();
        } else {
            if (C74216TAu.LIZIZ.LJII() != T39.AVAILABLE) {
                return;
            }
            this.LJLIL.invoke();
        }
    }

    public final void LIZJ() {
        if (this.LJLILLLLZI.isInitialized()) {
            getAutoRetryManager().LIZJ();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        LIZJ();
    }

    public final void setAutoRetryCondition(InterfaceC65784Pro<Boolean> condition) {
        o.LJIIIZ(condition, "condition");
        TK6 autoRetryManager = getAutoRetryManager();
        autoRetryManager.getClass();
        autoRetryManager.LIZJ = condition;
    }

    public final void setRetryCallback(InterfaceC65784Pro<C76800UCe> callback) {
        o.LJIIIZ(callback, "callback");
        this.LJLIL = callback;
        setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS32S0100000_12(this, 119)));
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 0) {
            LIZLLL();
        } else {
            LIZJ();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TK7(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        o.LJIIIZ(context, "context");
        this.LJLIL = T3E.LJLIL;
        C5H3<TK6> LIZ = C221108m2.LIZ(EnumC221088m0.NONE, new AqS162S0100000_12(this, 1047));
        this.LJLILLLLZI = LIZ;
        this.LJLJI = LIZ;
    }
}

package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.NavButton;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import q03.IDaS204S0200000_12;

/* renamed from: X.Rgu, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC70204Rgu extends ConstraintLayout {
    public NavButton LJLIL;

    public abstract int getLayoutId();

    public final NavButton getNavButton() {
        return this.LJLIL;
    }

    public final void setNavButton(NavButton navButton) {
        this.LJLIL = navButton;
    }

    public final void setOnClickListener(InterfaceC88471Ynr<? super View, ? super NavButton, C76800UCe> block) {
        o.LJIIIZ(block, "block");
        C16880lQ.LJIIJ(new IDaS204S0200000_12(block, this, 0), this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC70204Rgu(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        new LinkedHashMap();
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), getLayoutId(), this, true);
    }
}

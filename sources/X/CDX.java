package X;

import Y.ACListenerS40S0200000_5;
import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.livesdk.impl.revenue.subscription.ui.privilege.SubscriptionPrivilegeDetailFragment;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CDX extends ConstraintLayout {
    public final int LJLIL;
    public final int LJLILLLLZI;
    public final C119404mO LJLJI;
    public final C47061t0 LJLJJI;
    public final int LJLJJL;
    public final int LJLJJLL;

    public final C119404mO getDotView() {
        return this.LJLJI;
    }

    public final C47061t0 getIndicatorIcon() {
        return this.LJLJJI;
    }

    public final int getIndicatorTopMargin() {
        return this.LJLJJL;
    }

    public final int getIndicatorTopMarginChosen() {
        return this.LJLJJLL;
    }

    public final int getLastItemPosition() {
        return this.LJLILLLLZI;
    }

    public final int getPosition() {
        return this.LJLIL;
    }

    public final void setOnChosen(boolean z) {
        if (z) {
            this.LJLJI.setVisibility(8);
            this.LJLJJI.setVisibility(0);
        } else {
            this.LJLJI.setVisibility(0);
            this.LJLJJI.setVisibility(8);
        }
        int i = this.LJLIL;
        if (i == 0) {
            if (z) {
                C29306Beo.LJJLIIIJILLIZJL(this.LJLJJLL, this);
                return;
            } else {
                C29306Beo.LJJLIIIJILLIZJL(this.LJLJJL, this);
                return;
            }
        }
        if (i != this.LJLILLLLZI) {
            return;
        }
        if (z) {
            C29306Beo.LJJJJJL(this.LJLJJLL, this);
        } else {
            C29306Beo.LJJJJJL(this.LJLJJL, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CDX(int i, int i2, SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment, Context context) {
        super(context, null, 0);
        new LinkedHashMap();
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        int LIZ = C15380j0.LIZ(6.0f);
        this.LJLJJL = C15380j0.LIZ(3.0f);
        this.LJLJJLL = C15380j0.LIZ(3.0f);
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), R.layout.dh4, this, true);
        View findViewById = findViewById(R.id.cf_);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.dot_view)");
        this.LJLJI = (C119404mO) findViewById;
        View findViewById2 = findViewById(R.id.el8);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.indicator_icon)");
        this.LJLJJI = (C47061t0) findViewById2;
        setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS40S0200000_5(this, subscriptionPrivilegeDetailFragment, 57)));
        setPadding(0, LIZ, 0, LIZ);
    }
}

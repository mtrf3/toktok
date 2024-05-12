package X;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.tux.badge.TuxAlertBadgeLayout;
import com.zhiliaoapp.musically.R;
import defpackage.a1;

/* renamed from: X.Lxk, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55960Lxk extends LBE {
    public TuxAlertBadgeLayout LJLJJI;

    public final void LIZ() {
        TuxAlertBadgeLayout tuxAlertBadgeLayout = this.LJLJJI;
        if (tuxAlertBadgeLayout != null && tuxAlertBadgeLayout.LJLJL) {
            tuxAlertBadgeLayout.LIZIZ();
        }
    }

    public final void LIZIZ() {
        TuxAlertBadgeLayout tuxAlertBadgeLayout = this.LJLJJI;
        if (tuxAlertBadgeLayout != null && !tuxAlertBadgeLayout.LJLJL) {
            tuxAlertBadgeLayout.LIZJ();
        }
    }

    @Override // X.LBE, android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.LJLJJI = (TuxAlertBadgeLayout) findViewById(R.id.a0h);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55960Lxk(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a1.LJFF(context, "context");
    }
}

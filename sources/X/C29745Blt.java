package X;

import Y.ACListenerS25S0100000_5;
import android.view.View;
import kotlin.jvm.internal.o;
import o3.h0;

/* renamed from: X.Blt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29745Blt extends C16120kC {
    public final /* synthetic */ View LIZ;
    public final /* synthetic */ C41071jL LIZIZ;
    public final /* synthetic */ CharSequence LIZJ;
    public final /* synthetic */ String LIZLLL;
    public final /* synthetic */ String LJ;
    public final /* synthetic */ String LJFF;

    @Override // X.C16120kC
    public final void onInitializeAccessibilityNodeInfo(View host, C17760mq info) {
        String str;
        o.LJIIIZ(host, "host");
        o.LJIIIZ(info, "info");
        super.onInitializeAccessibilityNodeInfo(host, info);
        if (!this.LIZ.hasOnClickListeners() && this.LIZIZ.isEnabled()) {
            C16880lQ.LJIIJ(new ACListenerS25S0100000_5(this.LIZIZ, 117), this.LIZ);
        }
        info.LJIIL(true);
        info.LJIILIIL(this.LIZIZ.isChecked());
        info.LJIJJ(this.LIZIZ.isEnabled());
        info.LJIJ(this.LIZJ);
        info.LJJIFFI(this.LIZLLL);
        View view = this.LIZ;
        if (this.LIZIZ.isChecked()) {
            str = this.LJ;
        } else {
            str = this.LJFF;
        }
        h0.LJJII(view, str);
    }

    public C29745Blt(View view, C41071jL c41071jL, CharSequence charSequence, String str, String str2, String str3) {
        this.LIZ = view;
        this.LIZIZ = c41071jL;
        this.LIZJ = charSequence;
        this.LIZLLL = str;
        this.LJ = str2;
        this.LJFF = str3;
    }
}

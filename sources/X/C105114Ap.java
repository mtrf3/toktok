package X;

import android.app.Activity;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.InputViewDelegate;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.4Ap, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C105114Ap {
    public final InterfaceC105124Aq LIZ;
    public final View LIZIZ;
    public final String LIZJ;
    public final Activity LIZLLL;
    public final InputViewDelegate LJ;
    public final ViewGroup LJFF;
    public final C62822Ol8 LJI;
    public final C62822Ol8 LJII;
    public final C62822Ol8 LJIIIIZZ;
    public final C62822Ol8 LJIIIZ;
    public final C62822Ol8 LJIIJ;
    public final C62822Ol8 LJIIJJI;
    public final C62822Ol8 LJIIL;
    public final C62822Ol8 LJIILIIL;
    public C4BI LJIILJJIL;
    public final Handler LJIILL;

    public final int LIZ() {
        return ((Number) this.LJIIJJI.getValue()).intValue();
    }

    public final int LIZIZ() {
        return ((Number) this.LJIIJ.getValue()).intValue();
    }

    public C105114Ap(InterfaceC105124Aq inputView, View view, String sessionId) {
        o.LJIIIZ(inputView, "inputView");
        o.LJIIIZ(sessionId, "sessionId");
        this.LIZ = inputView;
        this.LIZIZ = view;
        this.LIZJ = sessionId;
        Activity LIZ = FT5.LIZ(view, "rootLayout.context");
        this.LIZLLL = LIZ;
        this.LJ = new InputViewDelegate(inputView);
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.b75, C16880lQ.LLZIL(LIZ), null);
        o.LJII(LLLZIIL, "null cannot be cast to non-null type android.view.ViewGroup");
        this.LJFF = (ViewGroup) LLLZIIL;
        this.LJI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 941));
        this.LJII = C221108m2.LIZIZ(new AqS151S0100000_1(this, 944));
        this.LJIIIIZZ = C221108m2.LIZIZ(new AqS151S0100000_1(this, 945));
        this.LJIIIZ = C221108m2.LIZIZ(new AqS151S0100000_1(this, 943));
        this.LJIIJ = C221108m2.LIZIZ(new AqS151S0100000_1(this, 942));
        this.LJIIJJI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 938));
        this.LJIIL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 939));
        this.LJIILIIL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 940));
        this.LJIILL = new Handler(C16880lQ.LLJJJJ());
    }
}

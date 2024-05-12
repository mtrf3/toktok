package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.tux.input.TuxTextView;
import kotlin.jvm.internal.AqS151S0200000_4;
import kotlin.jvm.internal.o;

/* renamed from: X.9gE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C242989gE extends AbstractC242999gF {
    public boolean LJ;
    public final C72062SPy LJFF;

    public final void LIZJ() {
        this.LJ = true;
        this.LJFF.LIZ = true;
    }

    @Override // X.ARS
    public final View LIZIZ() {
        TuxTextView tuxTextView = new TuxTextView((Context) this.LIZIZ, null, 6, 0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        tuxTextView.setLayoutParams(layoutParams);
        C72062SPy c72062SPy = this.LJFF;
        Context context = tuxTextView.getContext();
        o.LJIIIIZZ(context, "context");
        tuxTextView.setText(c72062SPy.LIZ(context));
        tuxTextView.setMovementMethod(AnonymousClass898.LIZ);
        return tuxTextView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C242989gE(Context context) {
        super(context);
        o.LJIIIZ(context, "context");
        C72062SPy c72062SPy = new C72062SPy();
        c72062SPy.LIZIZ = "";
        c72062SPy.LIZ = this.LJ;
        c72062SPy.LJ(((ARJ) this.LIZJ).LJIJI);
        c72062SPy.LIZIZ(((ARJ) this.LIZJ).LJ);
        this.LJFF = c72062SPy;
    }

    @Override // X.ARS
    public final void LIZ(C26231ARf dialog) {
        o.LJIIIZ(dialog, "dialog");
        this.LIZLLL = dialog;
    }

    public final void LIZLLL(String value) {
        o.LJIIIZ(value, "value");
        C72062SPy c72062SPy = this.LJFF;
        c72062SPy.getClass();
        c72062SPy.LIZIZ = value;
    }

    public final void LJ(InterfaceC88472Yns<? super C242979gD, C76800UCe> interfaceC88472Yns) {
        this.LJFF.LJFF = new AqS151S0200000_4((InterfaceC88472Yns) interfaceC88472Yns, (InterfaceC88472Yns<? super C242979gD, C76800UCe>) this, (C242989gE) 32);
    }
}

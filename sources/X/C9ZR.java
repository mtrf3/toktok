package X;

import Y.IDTListenerS114S0100000_4;
import android.text.method.KeyListener;
import android.widget.TextView;
import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaWelcomeMessageEditActivity;
import com.zhiliaoapp.musically.R;
import fjb.a;
import java.util.Arrays;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaWelcomeMessageEditActivity$onCreate$3$1", f = "BaWelcomeMessageEditActivity.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.9ZR, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9ZR extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ BaWelcomeMessageEditActivity LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9ZR(BaWelcomeMessageEditActivity baWelcomeMessageEditActivity, InterfaceC67352kd<? super C9ZR> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = baWelcomeMessageEditActivity;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C9ZR(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        BaWelcomeMessageEditActivity baWelcomeMessageEditActivity = this.LJLIL;
        C19K c19k = (C19K) baWelcomeMessageEditActivity._$_findCachedViewById(R.id.cq9);
        KeyListener keyListener = baWelcomeMessageEditActivity.LJLJI;
        if (keyListener != null) {
            c19k.setKeyListener(keyListener);
            int i = baWelcomeMessageEditActivity.LJLJJI.LIZIZ;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i == 4) {
                                baWelcomeMessageEditActivity._$_findCachedViewById(R.id.fls).setVisibility(0);
                                StringBuilder sb = new StringBuilder();
                                sb.append(baWelcomeMessageEditActivity.getResources().getString(R.string.q73));
                                sb.append('\n');
                                String string = baWelcomeMessageEditActivity.getResources().getString(R.string.q74);
                                o.LJIIIIZZ(string, "resources.getString(R.st…g.review_rejected_reason)");
                                String LLLZ = C16880lQ.LLLZ(string, Arrays.copyOf(new Object[]{baWelcomeMessageEditActivity.LJLJJI.LIZLLL}, 1));
                                o.LJIIIIZZ(LLLZ, "format(this, *args)");
                                sb.append(LLLZ);
                                ((TextView) baWelcomeMessageEditActivity._$_findCachedViewById(R.id.ml7)).setText(sb);
                            }
                        } else {
                            baWelcomeMessageEditActivity._$_findCachedViewById(R.id.fls).setVisibility(0);
                            ((TextView) baWelcomeMessageEditActivity._$_findCachedViewById(R.id.ml7)).setText(R.string.i39);
                        }
                    } else {
                        baWelcomeMessageEditActivity._$_findCachedViewById(R.id.fls).setVisibility(0);
                        ((TextView) baWelcomeMessageEditActivity._$_findCachedViewById(R.id.ml7)).setText(R.string.tda);
                        baWelcomeMessageEditActivity._$_findCachedViewById(R.id.fi2).setVisibility(4);
                        ((C19K) baWelcomeMessageEditActivity._$_findCachedViewById(R.id.cq9)).setKeyListener(null);
                        baWelcomeMessageEditActivity._$_findCachedViewById(R.id.cq9).setOnTouchListener(new IDTListenerS114S0100000_4(baWelcomeMessageEditActivity, 14));
                        baWelcomeMessageEditActivity._$_findCachedViewById(R.id.b2e).setVisibility(4);
                    }
                } else {
                    baWelcomeMessageEditActivity._$_findCachedViewById(R.id.fls).setVisibility(0);
                    ((TextView) baWelcomeMessageEditActivity._$_findCachedViewById(R.id.ml7)).setText(R.string.q50);
                }
            } else {
                baWelcomeMessageEditActivity._$_findCachedViewById(R.id.fls).setVisibility(8);
            }
            ((TextView) baWelcomeMessageEditActivity._$_findCachedViewById(R.id.cq9)).setText(baWelcomeMessageEditActivity.LJLJJI.LIZJ);
            baWelcomeMessageEditActivity.LLII();
            return C76800UCe.LIZ;
        }
        o.LJIJI("keyListener");
        throw null;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

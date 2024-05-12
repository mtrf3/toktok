package X;

import Y.IDTListenerS114S0100000_4;
import android.text.method.KeyListener;
import android.widget.TextView;
import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaAutoReplyEditActivity;
import com.zhiliaoapp.musically.R;
import fjb.a;
import java.util.Arrays;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaAutoReplyEditActivity$onCreate$4$1", f = "BaAutoReplyEditActivity.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.9Z0, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9Z0 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ BaAutoReplyEditActivity LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9Z0(BaAutoReplyEditActivity baAutoReplyEditActivity, InterfaceC67352kd<? super C9Z0> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = baAutoReplyEditActivity;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C9Z0(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        BaAutoReplyEditActivity baAutoReplyEditActivity = this.LJLIL;
        C19K c19k = (C19K) baAutoReplyEditActivity._$_findCachedViewById(R.id.coy);
        KeyListener keyListener = baAutoReplyEditActivity.LJLJJL;
        if (keyListener != null) {
            c19k.setKeyListener(keyListener);
            C19K c19k2 = (C19K) baAutoReplyEditActivity._$_findCachedViewById(R.id.cp3);
            KeyListener keyListener2 = baAutoReplyEditActivity.LJLJJLL;
            if (keyListener2 != null) {
                c19k2.setKeyListener(keyListener2);
                int i = baAutoReplyEditActivity.LJLJJI.LIZIZ;
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i == 4) {
                                    baAutoReplyEditActivity._$_findCachedViewById(R.id.fls).setVisibility(0);
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(baAutoReplyEditActivity.getResources().getString(R.string.q73));
                                    sb.append('\n');
                                    String string = baAutoReplyEditActivity.getResources().getString(R.string.q74);
                                    o.LJIIIIZZ(string, "resources.getString(R.st…g.review_rejected_reason)");
                                    String LLLZ = C16880lQ.LLLZ(string, Arrays.copyOf(new Object[]{baAutoReplyEditActivity.LJLJJI.LJ}, 1));
                                    o.LJIIIIZZ(LLLZ, "format(this, *args)");
                                    sb.append(LLLZ);
                                    ((TextView) baAutoReplyEditActivity._$_findCachedViewById(R.id.ml7)).setText(sb);
                                }
                            } else {
                                baAutoReplyEditActivity._$_findCachedViewById(R.id.fls).setVisibility(0);
                                ((TextView) baAutoReplyEditActivity._$_findCachedViewById(R.id.ml7)).setText(R.string.i39);
                            }
                        } else {
                            baAutoReplyEditActivity._$_findCachedViewById(R.id.fls).setVisibility(0);
                            ((TextView) baAutoReplyEditActivity._$_findCachedViewById(R.id.ml7)).setText(R.string.tda);
                            baAutoReplyEditActivity._$_findCachedViewById(R.id.fi2).setVisibility(4);
                            ((C19K) baAutoReplyEditActivity._$_findCachedViewById(R.id.coy)).setKeyListener(null);
                            ((C19K) baAutoReplyEditActivity._$_findCachedViewById(R.id.cp3)).setKeyListener(null);
                            IDTListenerS114S0100000_4 iDTListenerS114S0100000_4 = new IDTListenerS114S0100000_4(baAutoReplyEditActivity, 15);
                            baAutoReplyEditActivity._$_findCachedViewById(R.id.coy).setOnTouchListener(iDTListenerS114S0100000_4);
                            baAutoReplyEditActivity._$_findCachedViewById(R.id.cp3).setOnTouchListener(iDTListenerS114S0100000_4);
                            baAutoReplyEditActivity._$_findCachedViewById(R.id.b2e).setVisibility(4);
                            baAutoReplyEditActivity._$_findCachedViewById(R.id.b22).setVisibility(4);
                            baAutoReplyEditActivity._$_findCachedViewById(R.id.m_7).setVisibility(4);
                            baAutoReplyEditActivity._$_findCachedViewById(R.id.m_8).setVisibility(4);
                            baAutoReplyEditActivity._$_findCachedViewById(R.id.m_9).setVisibility(4);
                            baAutoReplyEditActivity._$_findCachedViewById(R.id.mb9).setVisibility(4);
                            baAutoReplyEditActivity._$_findCachedViewById(R.id.mb_).setVisibility(4);
                            baAutoReplyEditActivity._$_findCachedViewById(R.id.mba).setVisibility(4);
                            baAutoReplyEditActivity._$_findCachedViewById(R.id.cd_).setVisibility(4);
                            baAutoReplyEditActivity._$_findCachedViewById(R.id.cda).setVisibility(4);
                        }
                    } else {
                        baAutoReplyEditActivity._$_findCachedViewById(R.id.fls).setVisibility(0);
                        ((SY4) baAutoReplyEditActivity._$_findCachedViewById(R.id.b2e)).setEnabled(true);
                        ((TextView) baAutoReplyEditActivity._$_findCachedViewById(R.id.ml7)).setText(R.string.q4z);
                    }
                } else {
                    baAutoReplyEditActivity._$_findCachedViewById(R.id.fls).setVisibility(8);
                    baAutoReplyEditActivity._$_findCachedViewById(R.id.b22).setVisibility(8);
                }
                ((TextView) baAutoReplyEditActivity._$_findCachedViewById(R.id.coy)).setText(baAutoReplyEditActivity.LJLJJI.LIZJ);
                ((TextView) baAutoReplyEditActivity._$_findCachedViewById(R.id.cp3)).setText(baAutoReplyEditActivity.LJLJJI.LIZLLL);
                return C76800UCe.LIZ;
            }
            o.LJIJI("messageKeyListener");
            throw null;
        }
        o.LJIJI("keywordKeyListener");
        throw null;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

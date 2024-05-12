package X;

import android.app.Activity;
import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.IProfileNaviService;
import com.ss.android.ugc.aweme.ProfileNaviServiceImpl;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.zhiliaoapp.musically.R;
import fjb.a;
import kotlin.jvm.internal.o;
import ujb.s;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.navi.NaviViewLogic$showNaviNotice$1", f = "NaviViewLogic.kt", l = {100}, m = "invokeSuspend")
/* renamed from: X.3jG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C91983jG extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C109544Rq LJLILLLLZI;
    public final /* synthetic */ Context LJLJI;
    public final /* synthetic */ MutableLiveData<C76800UCe> LJLJJI;
    public final /* synthetic */ TextView LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C91983jG(C109544Rq c109544Rq, Context context, MutableLiveData<C76800UCe> mutableLiveData, TextView textView, InterfaceC67352kd<? super C91983jG> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c109544Rq;
        this.LJLJI = context;
        this.LJLJJI = mutableLiveData;
        this.LJLJJL = textView;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C91983jG(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            IMUser LJIIJ = C80533Eb.LJIIJ(String.valueOf(this.LJLILLLLZI.getSender()), this.LJLILLLLZI.getSecSender());
            if (LJIIJ == null) {
                return C76800UCe.LIZ;
            }
            String string = this.LJLJI.getString(R.string.c18);
            o.LJIIIIZZ(string, "context.getString(R.stri…_line_message_create_now)");
            String string2 = this.LJLJI.getString(R.string.c19, LJIIJ.getNickName(), string);
            o.LJIIIIZZ(string2, "context.getString(\n     …reateNowStr\n            )");
            int LJJLIIIJL = s.LJJLIIIJL(string2, string, 0, false, 6);
            C40517FvF c40517FvF = new C40517FvF(LJJLIIIJL, string2.length());
            if (LJJLIIIJL == -1) {
                return C76800UCe.LIZ;
            }
            final int LJIIIIZZ = AnonymousClass636.LJIIIIZZ(R.attr.eb, this.LJLJI);
            T5U t5u = new T5U(62, false);
            final MutableLiveData<C76800UCe> mutableLiveData = this.LJLJJI;
            ClickableSpan clickableSpan = new ClickableSpan() { // from class: X.4Ba
                @Override // android.text.style.ClickableSpan
                public final void onClick(View widget) {
                    o.LJIIIZ(widget, "widget");
                    Context context = widget.getContext();
                    o.LJIIIIZZ(context, "widget.context");
                    Activity LJIJJ = C45804HyK.LJIJJ(context);
                    if (LJIJJ == null) {
                        return;
                    }
                    IProfileNaviService LJIIL = ProfileNaviServiceImpl.LJIIL();
                    o.LJIIIIZZ(LJIIL, "get()\n                  …eNaviService::class.java)");
                    LJIIL.LJIIJ(LJIJJ, widget, "chat_in-line_msg", new C61658OHu(false, false, mutableLiveData));
                }

                @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                public final void updateDrawState(TextPaint ds) {
                    o.LJIIIZ(ds, "ds");
                    ds.setColor(LJIIIIZZ);
                    ds.setUnderlineText(false);
                }
            };
            T5R t5r = new T5R(string2);
            t5r.LIZ(61);
            t5r.setSpan(clickableSpan, LJJLIIIJL, c40517FvF.LJLILLLLZI, 34);
            t5r.setSpan(t5u, LJJLIIIJL, c40517FvF.LJLILLLLZI, 34);
            AbstractC78621UtN abstractC78621UtN = C36636EZk.LIZ;
            C91973jF c91973jF = new C91973jF(this.LJLJJL, t5r, null);
            this.LJLIL = 1;
            if (XKX.LJI(abstractC78621UtN, c91973jF, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

package X;

import android.content.res.Resources;
import com.bytedance.poplayer.core.PopupManager;
import com.zhiliaoapp.musically.R;
import fjb.a;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.tiktok.addyours.service.AddYoursSendNotiInviteBehavior$onSelected$3", f = "AddYoursInviteBehavior.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.7qt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C198637qt extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ int LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C198637qt(int i, InterfaceC67352kd<? super C198637qt> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = i;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C198637qt(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        final int i = this.LJLIL;
        PopupManager.LJIIL(new AbstractC55363Lo7(i) { // from class: X.7qs
            public final int LJLIL;

            @Override // X.InterfaceC55641Lsb
            public final /* bridge */ /* synthetic */ C54082LKk getPopupContext() {
                return null;
            }

            @Override // X.InterfaceC56321M8n
            public final int getPriority() {
                return 7001;
            }

            {
                this.LJLIL = i;
            }

            @Override // X.M72
            public final void LIZLLL(C54082LKk context, M78 wrapper) {
                o.LJIIIZ(context, "context");
                o.LJIIIZ(wrapper, "wrapper");
                ActivityC45651qj LIZJ = context.LIZJ();
                if (LIZJ == null) {
                    wrapper.LIZ();
                    return;
                }
                C26045AKb c26045AKb = new C26045AKb(LIZJ);
                c26045AKb.LIZJ(new AqS153S0100000_3(wrapper, 1735));
                Resources resources = LIZJ.getResources();
                int i2 = this.LJLIL;
                c26045AKb.LJIIIZ(resources.getQuantityString(R.plurals.b0, i2, Integer.valueOf(i2)));
                c26045AKb.LJFF(R.raw.icon_tick_fill_small);
                c26045AKb.LJII(R.attr.e8);
                c26045AKb.LIZ(true);
                c26045AKb.LJIIJ();
            }
        });
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

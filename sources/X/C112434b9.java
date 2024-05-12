package X;

import android.app.Activity;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import com.bytedance.tiktok.homepage.services.MainPageFragmentImpl;
import com.ss.android.ugc.aweme.specact.SpecActServiceImpl;
import fjb.a;
import kotlin.jvm.internal.AqS132S0200000_1;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.notification.legacy.IMNotificationPlayer$showNotificationAsync$1$2", f = "IMNotificationPlayer.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.4b9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C112434b9 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C68322mC<C112454bB> LJLIL;
    public final /* synthetic */ C112444bA LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C112434b9(C68322mC<C112454bB> c68322mC, C112444bA c112444bA, InterfaceC67352kd<? super C112434b9> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c68322mC;
        this.LJLILLLLZI = c112444bA;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C112434b9(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        View view;
        ViewGroup viewGroup;
        String str;
        Long l;
        int i;
        String LJFF;
        String valueOf;
        int i2;
        String str2;
        Window window;
        C141335gf.LIZJ(obj);
        C112454bB c112454bB = this.LJLIL.element;
        if (c112454bB == null) {
            return C76800UCe.LIZ;
        }
        C112444bA c112444bA = this.LJLILLLLZI;
        c112444bA.getClass();
        if (C31Q.LJIILLIIL.LJ().LIZJ == 0) {
            if (c112444bA.LIZJ == null) {
                c112444bA.LIZJ = new C112424b8();
            }
            c112444bA.LJIIIIZZ = true;
            c112444bA.LJII = true;
            C112424b8 c112424b8 = c112444bA.LIZJ;
            if (c112424b8 != null) {
                c112424b8.LIZLLL = c112454bB;
                Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
                if (LJIIIIZZ != null && (window = LJIIIIZZ.getWindow()) != null) {
                    view = window.getDecorView();
                } else {
                    view = null;
                }
                if (view instanceof ViewGroup) {
                    viewGroup = (ViewGroup) view;
                } else {
                    viewGroup = null;
                }
                c112424b8.LIZIZ = viewGroup;
                CountDownTimerC112534bJ countDownTimerC112534bJ = c112424b8.LJ;
                synchronized (countDownTimerC112534bJ) {
                    countDownTimerC112534bJ.cancel();
                    countDownTimerC112534bJ.LIZ = null;
                }
                c112424b8.LJ.LIZ(c112454bB);
                if (c112424b8.LIZ) {
                    ViewOnClickListenerC112504bG viewOnClickListenerC112504bG = c112424b8.LIZJ;
                    if (viewOnClickListenerC112504bG != null) {
                        viewOnClickListenerC112504bG.LIZ(c112424b8.LIZLLL);
                        ViewGroup.LayoutParams layoutParams = viewOnClickListenerC112504bG.getLayoutParams();
                        if (layoutParams != null) {
                            layoutParams.height = -2;
                            viewOnClickListenerC112504bG.setLayoutParams(layoutParams);
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                        }
                    }
                } else {
                    Activity LJIIIIZZ2 = C84763XOl.LJIIIIZZ();
                    if (LJIIIIZZ2 != null) {
                        c112424b8.LIZ = true;
                        C86550Xxy.LIZIZ.LIZ(true, false);
                        SpecActServiceImpl.LJJJIL().LJIILIIL(true);
                        ViewOnClickListenerC112504bG viewOnClickListenerC112504bG2 = new ViewOnClickListenerC112504bG(C78605Ut7.LJIIIIZZ(LJIIIIZZ2));
                        viewOnClickListenerC112504bG2.LIZ(c112454bB);
                        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
                        layoutParams2.gravity = 48;
                        layoutParams2.topMargin = C63081OpJ.LJJJJLI(LJIIIIZZ2);
                        viewOnClickListenerC112504bG2.setLayoutParams(layoutParams2);
                        viewOnClickListenerC112504bG2.setActionListener(new AqS132S0200000_1(c112424b8, c112454bB, 107));
                        viewOnClickListenerC112504bG2.LIZJ();
                        c112424b8.LIZJ = viewOnClickListenerC112504bG2;
                        ViewGroup viewGroup2 = c112424b8.LIZIZ;
                        if (viewGroup2 != null) {
                            viewGroup2.addView(viewOnClickListenerC112504bG2);
                        }
                    }
                }
                String LJJLIIIJJI = MainPageFragmentImpl.LJI().LJJLIIIJJI();
                Long l2 = c112454bB.LJIILIIL;
                String str3 = "";
                if (l2 == null || (str = l2.toString()) == null) {
                    str = "";
                }
                C109544Rq c109544Rq = c112454bB.LJIJI;
                if (c109544Rq != null) {
                    l = Long.valueOf(c109544Rq.getMsgId());
                } else {
                    l = null;
                }
                String valueOf2 = String.valueOf(l);
                String LJIILJJIL = C1FP.LJIILJJIL(c112454bB);
                String str4 = c112454bB.LJIJJLI;
                String LJIIJJI = C1FP.LJIIJJI(c112454bB);
                Integer num = c112454bB.LJIJ;
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = -1;
                }
                String str5 = c112454bB.LJJ;
                if (str5 != null) {
                    str3 = str5;
                }
                String LIZIZ = C112474bD.LIZIZ(c112454bB.LIZ);
                C109544Rq c109544Rq2 = c112454bB.LJIJI;
                if (c109544Rq2 == null) {
                    LJFF = "unknown";
                } else {
                    LJFF = C106674Gp.LJFF(c109544Rq2, null);
                }
                C109544Rq c109544Rq3 = c112454bB.LJIJI;
                if (c109544Rq3 == null) {
                    valueOf = "-1";
                } else {
                    valueOf = String.valueOf(c109544Rq3.getMsgType());
                }
                C112484bE c112484bE = new C112484bE(LJJLIIIJJI, str, valueOf2, LJIILJJIL, str4, LJIIJJI, i, str3, LIZIZ, LJFF, valueOf);
                C85323Wm onEventV3 = C772831o.LIZ();
                o.LJIIIZ(onEventV3, "onEventV3");
                onEventV3.LIZIZ("show_message_inner_push", C113554cx.LJJL(new OSZ("enter_from", c112484bE.LIZ), new OSZ("chat_cnt", String.valueOf(c112484bE.LJIIIIZZ)), new OSZ("from_user_id", c112484bE.LJI)));
                onEventV3.LIZIZ("inner_push_show", C112464bC.LJFF(c112484bE));
                Integer num2 = c112454bB.LJIJ;
                if (num2 != null) {
                    i2 = num2.intValue();
                } else {
                    i2 = 1;
                }
                C112464bC.LIZJ("show_as_inner_push", i2);
                if (c112454bB.LIZ == 3) {
                    Integer num3 = c112454bB.LIZJ;
                    int i3 = AbstractC63505Ow9.LIZ;
                    if (num3 == null || num3.intValue() != i3) {
                        str2 = "group";
                    } else {
                        str2 = "private";
                    }
                    C93363lU.LIZIZ(str2);
                }
            }
            c112444bA.LJFF = false;
            if (!c112444bA.LJIIIIZZ && c112454bB.LIZ == 1) {
                C112464bC.LIZIZ(SystemClock.elapsedRealtime() - FKB.LIZJ);
            }
            c112444bA.LIZIZ(c112454bB, false);
            C112464bC.LIZLLL(c112454bB);
            c112444bA.LIZ = true;
            c112444bA.LIZJ(1000L);
        } else {
            c112444bA.LIZIZ(c112454bB, true);
            c112444bA.LJFF = false;
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

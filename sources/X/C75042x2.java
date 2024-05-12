package X;

import Y.ARunnableS37S0100000_1;
import Y.IDAListenerS229S0100000_1;
import android.app.Activity;
import android.os.CountDownTimer;
import android.view.animation.Animation;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.live.slot.IFrameSlot;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.common.data.QuickProductCheck;
import com.ss.android.ugc.aweme.influencer.ecommercelive.framework.network.BaseResponse;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.zhiliaoapp.musically.R;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.business.broadcaster.duringlive.slot.quickproduct.QuickProductSlot$onCreate$3$2$1", f = "QuickProductSlot.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2x2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C75042x2 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ BaseResponse<QuickProductCheck> LJLIL;
    public final /* synthetic */ C71256Rxs LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C75042x2(BaseResponse<QuickProductCheck> baseResponse, C71256Rxs c71256Rxs, InterfaceC67352kd<? super C75042x2> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = baseResponse;
        this.LJLILLLLZI = c71256Rxs;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C75042x2(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        String str;
        QuickProductCheck data;
        QuickProductCheck data2;
        QuickProductCheck data3;
        C141335gf.LIZJ(obj);
        BaseResponse<QuickProductCheck> baseResponse = this.LJLIL;
        if (baseResponse != null && (data3 = baseResponse.getData()) != null && data3.available) {
            z = true;
        } else {
            z = false;
        }
        String str2 = null;
        if (z) {
            C71256Rxs c71256Rxs = this.LJLILLLLZI;
            c71256Rxs.getClass();
            c71256Rxs.LJ(EnumC75152xD.CAPTURE);
            final C109174Qf c109174Qf = c71256Rxs.LJLJLJ;
            if (c109174Qf != null) {
                c109174Qf.setVisibility(0);
                LiveOuterService.LJJJLL().LJJIJIL().LJIJ(true);
                final long j = c109174Qf.LJLJJI;
                new CountDownTimer(j) { // from class: X.3v4
                    @Override // android.os.CountDownTimer
                    public final void onFinish() {
                        C109174Qf c109174Qf2 = C109174Qf.this;
                        if (c109174Qf2.LJLJJL) {
                            c109174Qf2.post(new ARunnableS37S0100000_1(c109174Qf2, 10));
                            C109174Qf.this.setVisibility(8);
                        }
                        InterfaceC75072x5 interfaceC75072x5 = C109174Qf.this.LJLJI;
                        if (interfaceC75072x5 != null) {
                            o.LJI(interfaceC75072x5);
                            interfaceC75072x5.LIZ();
                        }
                    }

                    @Override // android.os.CountDownTimer
                    public final void onTick(long j2) {
                        C47121t6 c47121t6 = C109174Qf.this.LJLILLLLZI;
                        o.LJI(c47121t6);
                        long j3 = j2 / 1000;
                        c47121t6.setText(String.valueOf(1 + j3));
                        if (j3 < 2) {
                            Animation animation = C109174Qf.this.LJLIL;
                            o.LJI(animation);
                            animation.setAnimationListener(new IDAListenerS229S0100000_1(C109174Qf.this, 0));
                        }
                        Animation animation2 = C109174Qf.this.LJLIL;
                        o.LJI(animation2);
                        animation2.reset();
                        C47121t6 c47121t62 = C109174Qf.this.LJLILLLLZI;
                        o.LJI(c47121t62);
                        c47121t62.startAnimation(C109174Qf.this.LJLIL);
                    }
                }.start();
                IFrameSlot.SlotViewModel slotViewModel = c71256Rxs.LJLLLLLL;
                if (slotViewModel != null) {
                    XKX.LIZLLL(ViewModelKt.getViewModelScope(slotViewModel), (MB6) c71256Rxs.LJLLL.getValue(), null, new C66662jW(null), 2);
                } else {
                    o.LJIJI("viewModel");
                    throw null;
                }
            } else {
                o.LJIJI("countDownView");
                throw null;
            }
        } else {
            Activity LJIJJ = C45804HyK.LJIJJ(this.LJLILLLLZI.LJLIL);
            if (LJIJJ != null) {
                BaseResponse<QuickProductCheck> baseResponse2 = this.LJLIL;
                C71256Rxs c71256Rxs2 = this.LJLILLLLZI;
                C26045AKb c26045AKb = new C26045AKb(LJIJJ);
                if (baseResponse2 != null && (data2 = baseResponse2.getData()) != null) {
                    str = data2.blockReason;
                } else {
                    str = null;
                }
                if (C78685UuP.LJJJZ(str)) {
                    if (baseResponse2 != null && (data = baseResponse2.getData()) != null) {
                        str2 = data.blockReason;
                    }
                } else {
                    str2 = c71256Rxs2.LJLIL.getResources().getString(R.string.hu1);
                }
                c26045AKb.LJIIIZ(str2);
                c26045AKb.LJIIJ();
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

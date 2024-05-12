package X;

import Y.IDeS360S0100000_1;
import com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelViewModel;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import fjb.a;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelViewModel$refresh$1", f = "SharePanelViewModel.kt", l = {821}, m = "invokeSuspend")
/* renamed from: X.3Qq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C83803Qq extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ SharePanelViewModel LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C83803Qq(SharePanelViewModel sharePanelViewModel, InterfaceC67352kd<? super C83803Qq> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = sharePanelViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C83803Qq(this.LJLILLLLZI, interfaceC67352kd);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.OQg, T] */
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
            final long currentTimeMillis = System.currentTimeMillis();
            final C72242sW c72242sW = new C72242sW();
            final C68322mC c68322mC = new C68322mC();
            c68322mC.element = C61878OQg.INSTANCE;
            final C34K c34k = new C34K();
            C82563Lw c82563Lw = C82563Lw.LJLIL;
            c82563Lw.getClass();
            IDeS360S0100000_1 iDeS360S0100000_1 = new IDeS360S0100000_1(new IDeS360S0100000_1(new IDeS360S0100000_1(C82563Lw.LJLJJI, 6), 7), 8);
            XKQ xkq = C82563Lw.LJLJJL;
            if (xkq == null || !xkq.isActive()) {
                XKQ xkq2 = C82563Lw.LJLJJL;
                if (xkq2 != null) {
                    xkq2.LIZIZ(null);
                }
                C82563Lw.LJLJJL = XKX.LIZLLL(c82563Lw, null, null, new C3HR(null), 3);
            }
            final SharePanelViewModel sharePanelViewModel = this.LJLILLLLZI;
            InterfaceC64672gJ<InterfaceC83863Qw> interfaceC64672gJ = new InterfaceC64672gJ<InterfaceC83863Qw>() { // from class: X.3Qs
                /* JADX WARN: Type inference failed for: r0v23, types: [T, java.util.List<com.ss.android.ugc.aweme.im.service.model.IMContact>] */
                @Override // X.InterfaceC64672gJ
                public final Object emit(InterfaceC83863Qw interfaceC83863Qw, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
                    InterfaceC83863Qw interfaceC83863Qw2 = interfaceC83863Qw;
                    if (!o.LJ(interfaceC83863Qw2, C83883Qy.LIZ) && (interfaceC83863Qw2 instanceof C83813Qr)) {
                        C83813Qr c83813Qr = (C83813Qr) interfaceC83863Qw2;
                        List<IMContact> list = c83813Qr.LIZ;
                        int size = list.size();
                        int i2 = sharePanelViewModel.LJLL;
                        if (size > i2) {
                            list = list.subList(0, i2);
                        }
                        boolean z = !o.LJ(c83813Qr.LIZ, C68322mC.this.element);
                        if (z) {
                            sharePanelViewModel.zr0(ORZ.LLJILJILJ(list), false);
                        }
                        SharePanelViewModel sharePanelViewModel2 = sharePanelViewModel;
                        if (sharePanelViewModel2.LLIIIJ) {
                            c72242sW.element = System.currentTimeMillis();
                            c34k.element = !c83813Qr.LIZIZ;
                            InterfaceC83893Qz interfaceC83893Qz = sharePanelViewModel.LJLILLLLZI;
                            if (interfaceC83893Qz != null) {
                                interfaceC83893Qz.Ql(c83813Qr.LIZ.size(), sharePanelViewModel.LJLL, c34k.element);
                            }
                            sharePanelViewModel.LLIIIJ = false;
                            C68322mC.this.element = c83813Qr.LIZ;
                        } else if (!c83813Qr.LIZIZ && sharePanelViewModel2.LLIIIL) {
                            InterfaceC83893Qz interfaceC83893Qz2 = sharePanelViewModel2.LJLILLLLZI;
                            if (interfaceC83893Qz2 != null) {
                                interfaceC83893Qz2.sz(c72242sW.element - currentTimeMillis, c34k.element, c83813Qr.LIZ.size(), z, sharePanelViewModel.LJLL);
                            }
                            sharePanelViewModel.LLIIIL = false;
                        }
                    }
                    return C76800UCe.LIZ;
                }
            };
            this.LJLIL = 1;
            if (iDeS360S0100000_1.collect(interfaceC64672gJ, this) == enumC58928NAu) {
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

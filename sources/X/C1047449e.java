package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.helper.unreadindicator.UnreadIndicatorDelegate$initParamAndCheckShow$2", f = "UnreadIndicatorDelegate.kt", l = {149, 167}, m = "invokeSuspend")
/* renamed from: X.49e, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1047449e extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super Boolean>, Object> {
    public int LJLIL;
    public final /* synthetic */ C1047549f LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1047449e(C1047549f c1047549f, InterfaceC67352kd<? super C1047449e> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c1047549f;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C1047449e(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        long j;
        long j2;
        Long l;
        Long l2;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C141335gf.LIZJ(obj);
                    z = ((Boolean) obj).booleanValue();
                    return Boolean.valueOf(z);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C141335gf.LIZJ(obj);
        } else {
            C141335gf.LIZJ(obj);
            XIA xia = C78613UtF.LIZJ;
            C1047749h c1047749h = new C1047749h(this.LJLILLLLZI, null);
            this.LJLIL = 1;
            obj = XKX.LJI(xia, c1047749h, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        C32M c32m = (C32M) obj;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("unreadIndicatorParameter: ");
        LIZ.append(c32m);
        C34B.LIZIZ("UnreadMessageTips", X1D.LIZIZ(LIZ));
        if (c32m != null) {
            C1047549f c1047549f = this.LJLILLLLZI;
            Long l3 = c32m.LIZ;
            if (l3 != null) {
                c1047549f.LJLLILLLL = l3.longValue();
                Long l4 = c32m.LIZIZ;
                if (l4 != null) {
                    c1047549f.LJLLL = l4.longValue();
                    Long l5 = c32m.LIZJ;
                    if (l5 != null) {
                        c1047549f.LJLLLL = l5.longValue();
                    } else {
                        return Boolean.FALSE;
                    }
                } else {
                    return Boolean.FALSE;
                }
            } else {
                return Boolean.FALSE;
            }
        }
        if (this.LJLILLLLZI.LJLJJI.isGroupChat() && C81253Gv.LIZ()) {
            C1047549f c1047549f2 = this.LJLILLLLZI;
            if (c32m != null && (l2 = c32m.LJ) != null) {
                j = l2.longValue();
            } else {
                j = 0;
            }
            c1047549f2.LJLLJ = j;
            C1047549f c1047549f3 = this.LJLILLLLZI;
            if (c32m != null && (l = c32m.LIZLLL) != null) {
                j2 = l.longValue();
            } else {
                j2 = 0;
            }
            c1047549f3.LJZ = j2;
        }
        C1047549f c1047549f4 = this.LJLILLLLZI;
        c1047549f4.LL = true;
        if (c1047549f4.LJLJI.getItemCount() > 0) {
            C1047549f c1047549f5 = this.LJLILLLLZI;
            long j3 = c1047549f5.LJLLL;
            if (j3 > 0 && !c1047549f5.LJLJLJ && c1047549f5.LL) {
                long j4 = c1047549f5.LJLLLL;
                long j5 = c1047549f5.LJZ;
                this.LJLIL = 2;
                obj = c1047549f5.LIZ(j3, j4, j5, this);
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
                z = ((Boolean) obj).booleanValue();
                return Boolean.valueOf(z);
            }
        }
        z = this.LJLILLLLZI.LJLL;
        return Boolean.valueOf(z);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

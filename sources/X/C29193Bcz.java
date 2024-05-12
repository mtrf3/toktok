package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.live.GoLiveChecker$runCheck$1$isPluginReady$1", f = "GoLiveChecker.kt", l = {BaseNotice.CREATOR}, m = "invokeSuspend")
/* renamed from: X.Bcz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29193Bcz extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super Boolean>, Object> {
    public int LJLIL;
    public final /* synthetic */ C29199Bd5 LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29193Bcz(C29199Bd5 c29199Bd5, InterfaceC67352kd<? super C29193Bcz> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c29199Bd5;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C29193Bcz(this.LJLILLLLZI, interfaceC67352kd);
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
            C29199Bd5 c29199Bd5 = this.LJLILLLLZI;
            this.LJLIL = 1;
            c29199Bd5.getClass();
            C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(this));
            EnumC30836C8i enumC30836C8i = EnumC30836C8i.LiveResource;
            if (enumC30836C8i.isInstalled()) {
                Boolean bool = Boolean.TRUE;
                C3C5.m7constructorimpl(bool);
                c84654XKg.resumeWith(bool);
            } else {
                enumC30836C8i.checkInstall(c29199Bd5.LIZ, "broadcast", new BIJ(c84654XKg));
            }
            obj = c84654XKg.LIZ();
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

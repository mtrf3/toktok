package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.AwemeDetailList;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.adapter.LongClickHandlerExtKt$openCreationFlowPage$2$1", f = "LongClickHandlerExt.kt", l = {534, 540}, m = "invokeSuspend")
/* renamed from: X.2sV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C72232sV extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public C72242sW LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ ActivityC45651qj LJLJJI;
    public final /* synthetic */ DialogC25756A8y LJLJJL;
    public final /* synthetic */ long LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C72232sV(String str, ActivityC45651qj activityC45651qj, DialogC25756A8y dialogC25756A8y, long j, InterfaceC67352kd<? super C72232sV> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = str;
        this.LJLJJI = activityC45651qj;
        this.LJLJJL = dialogC25756A8y;
        this.LJLJJLL = j;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C72232sV(this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        AwemeDetailList awemeDetailList;
        C72242sW c72242sW;
        Object obj2 = obj;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLILLLLZI;
        try {
        } catch (Exception e) {
            C34B.LJ("LongClickHandlerExt", e);
            awemeDetailList = null;
        }
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C141335gf.LIZJ(obj2);
                    return C76800UCe.LIZ;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c72242sW = this.LJLIL;
            C141335gf.LIZJ(obj2);
        } else {
            C141335gf.LIZJ(obj2);
            c72242sW = new C72242sW();
            c72242sW.element = SystemClock.elapsedRealtime();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append('[');
            LIZ.append(this.LJLJI);
            LIZ.append(']');
            String LIZIZ = X1D.LIZIZ(LIZ);
            this.LJLIL = c72242sW;
            this.LJLILLLLZI = 1;
            obj2 = C30U.LIZIZ(LIZIZ, "", this);
            if (obj2 == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        awemeDetailList = (AwemeDetailList) obj2;
        c72242sW.element = SystemClock.elapsedRealtime() - c72242sW.element;
        XIF xif = EXV.LIZ;
        C85053Vl c85053Vl = new C85053Vl(awemeDetailList, this.LJLJJI, this.LJLJJL, this.LJLJJLL, c72242sW, this.LJLJI, null);
        this.LJLIL = null;
        this.LJLILLLLZI = 2;
        if (XKX.LJI(xif, c85053Vl, this) == enumC58928NAu) {
            return enumC58928NAu;
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

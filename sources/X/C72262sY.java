package X;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.AwemeDetailList;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.share.improve.action.StickerAction$execute$3", f = "StickerAction.kt", l = {99, 104}, m = "invokeSuspend")
/* renamed from: X.2sY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C72262sY extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public C72242sW LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ C85143Vu LJLJI;
    public final /* synthetic */ Activity LJLJJI;
    public final /* synthetic */ long LJLJJL;
    public final /* synthetic */ DialogC25756A8y LJLJJLL;
    public final /* synthetic */ Context LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C72262sY(C85143Vu c85143Vu, Activity activity, long j, DialogC25756A8y dialogC25756A8y, Context context, InterfaceC67352kd<? super C72262sY> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = c85143Vu;
        this.LJLJJI = activity;
        this.LJLJJL = j;
        this.LJLJJLL = dialogC25756A8y;
        this.LJLJL = context;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C72262sY(this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, interfaceC67352kd);
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
            C34B.LJFF(e);
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
            LIZ.append(this.LJLJI.LJLIL.getAid());
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
        AbstractC78621UtN abstractC78621UtN = C36636EZk.LIZ;
        C85093Vp c85093Vp = new C85093Vp(awemeDetailList, c72242sW, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, null);
        this.LJLIL = null;
        this.LJLILLLLZI = 2;
        if (XKX.LJI(abstractC78621UtN, c85093Vp, this) == enumC58928NAu) {
            return enumC58928NAu;
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

package X;

import android.content.Context;
import com.ss.android.ugc.gamora.editor.audioservice.service.speechtosong.model.StsResult;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editor.audioservice.service.speechtosong.handlers.FileHandler$handleData$2$asyncResult$1", f = "FileHandler.kt", l = {39}, m = "invokeSuspend")
/* renamed from: X.6gh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C166836gh extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C166536gD>, Object> {
    public int LJLIL;
    public final /* synthetic */ C166856gj LJLILLLLZI;
    public final /* synthetic */ StsResult LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ String LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C166836gh(C166856gj c166856gj, StsResult stsResult, String str, String str2, InterfaceC67352kd<? super C166836gh> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c166856gj;
        this.LJLJI = stsResult;
        this.LJLJJI = str;
        this.LJLJJL = str2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C166836gh(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
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
            Context context = this.LJLILLLLZI.LIZJ;
            String str = this.LJLJI.url;
            String str2 = this.LJLJJI;
            String str3 = this.LJLJJL;
            this.LJLIL = 1;
            obj = C167106h8.LIZ(context, str, str2, str3, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C166536gD> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

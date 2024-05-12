package X;

import android.content.Context;
import com.ss.android.ugc.aweme.shortvideo.edit.audioedit.common.vc.VCAudioResult;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editor.audioservice.service.voicechange.vc.handlers.FileHandler$handleData$2$asyncResult$1", f = "FileHandler.kt", l = {46}, m = "invokeSuspend")
/* renamed from: X.6g7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C166476g7 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C166536gD>, Object> {
    public int LJLIL;
    public final /* synthetic */ C166396fz LJLILLLLZI;
    public final /* synthetic */ VCAudioResult LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C166476g7(C166396fz c166396fz, VCAudioResult vCAudioResult, InterfaceC67352kd<? super C166476g7> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c166396fz;
        this.LJLJI = vCAudioResult;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C166476g7(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
            C166396fz c166396fz = this.LJLILLLLZI;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(this.LJLJI.originalVid);
            LIZ.append(this.LJLJI.speaker);
            String identify = X1D.LIZIZ(LIZ);
            c166396fz.getClass();
            o.LJIIIZ(identify, "identify");
            String LIZ2 = c166396fz.LJ.LIZ(identify);
            C167106h8 c167106h8 = C167106h8.LIZ;
            Context context = this.LJLILLLLZI.LIZJ;
            VCAudioResult vCAudioResult = this.LJLJI;
            this.LJLIL = 1;
            obj = c167106h8.LJ(context, vCAudioResult, LIZ2, this);
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

package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.avatar.ChangAvatarActionStage$loadMusic$2$1", f = "ChangAvatarActionStage.kt", l = {243}, m = "invokeSuspend")
/* renamed from: X.2mS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C68482mS extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ Activity LJLILLLLZI;
    public final /* synthetic */ VideoPublishEditModel LJLJI;
    public final /* synthetic */ InterfaceC67352kd<Boolean> LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C68482mS(Activity activity, VideoPublishEditModel videoPublishEditModel, InterfaceC67352kd<? super Boolean> interfaceC67352kd, InterfaceC67352kd<? super C68482mS> interfaceC67352kd2) {
        super(2, interfaceC67352kd2);
        this.LJLILLLLZI = activity;
        this.LJLJI = videoPublishEditModel;
        this.LJLJJI = interfaceC67352kd;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C68482mS(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
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
            XIA xia = C78613UtF.LIZJ;
            C68492mT c68492mT = new C68492mT(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, null);
            this.LJLIL = 1;
            if (XKX.LJI(xia, c68492mT, this) == enumC58928NAu) {
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

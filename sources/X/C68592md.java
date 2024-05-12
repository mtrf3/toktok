package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.aigc.AIGCManagerKt$updateAIGCLabelTypeInCoroutine$1$1", f = "AIGCManager.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2md, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C68592md extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ VideoPublishEditModel LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C68592md(VideoPublishEditModel videoPublishEditModel, InterfaceC67352kd<? super C68592md> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = videoPublishEditModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C68592md(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C152165y8.LJI(this.LJLIL);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

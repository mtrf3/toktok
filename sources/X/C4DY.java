package X;

import com.ss.android.ugc.aweme.emoji.emojichoose.model.NaviStatusCode;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.emoji.systembigemoji.EmojiModel$pollResources$1$1", f = "EmojiModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.4DY, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4DY extends AbstractC65782Prm implements InterfaceC88471Ynr<C76800UCe, InterfaceC67352kd<? super Boolean>, Object> {
    public C4DY(InterfaceC67352kd<? super C4DY> interfaceC67352kd) {
        super(2, interfaceC67352kd);
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C4DY(interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C141335gf.LIZJ(obj);
        if (C4FF.LJLJJI.LIZ == NaviStatusCode.SUCCESS && o.LJ(C4FD.LJLILLLLZI, Boolean.FALSE)) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(C76800UCe c76800UCe, InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        return new C4DY(interfaceC67352kd).invokeSuspend(C76800UCe.LIZ);
    }
}

package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastTaskResourceIdSetting;
import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.utils.PhotoModeImageLoader$downloadImagesWithFilePaths$2", f = "PhotoModeImageLoader.kt", l = {LiveBroadcastTaskResourceIdSetting.DEFAULT}, m = "invokeSuspend")
/* renamed from: X.2iZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C66072iZ extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super List<? extends C76800UCe>>, Object> {
    public int LJLIL;
    public final /* synthetic */ C78774Uvq LJLILLLLZI;
    public final /* synthetic */ List<W5O> LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C66072iZ(C78774Uvq c78774Uvq, List<? extends W5O> list, InterfaceC67352kd<? super C66072iZ> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c78774Uvq;
        this.LJLJI = list;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C66072iZ(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
            C78774Uvq c78774Uvq = this.LJLILLLLZI;
            List<W5O> list = this.LJLJI;
            this.LJLIL = 1;
            c78774Uvq.getClass();
            obj = C48841JEv.LJI(new C66062iY(c78774Uvq, list, null), this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super List<? extends C76800UCe>> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

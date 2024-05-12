package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastTaskResourceIdSetting;
import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.rss.components.ArticleImageLoader$downloadImagesWithFilePaths$2", f = "ArticleImageLoader.kt", l = {LiveBroadcastTaskResourceIdSetting.DEFAULT}, m = "invokeSuspend")
/* renamed from: X.2iX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C66052iX extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super List<? extends C76800UCe>>, Object> {
    public int LJLIL;
    public final /* synthetic */ C78773Uvp LJLILLLLZI;
    public final /* synthetic */ List<W5O> LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C66052iX(C78773Uvp c78773Uvp, List<? extends W5O> list, InterfaceC67352kd<? super C66052iX> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c78773Uvp;
        this.LJLJI = list;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C66052iX(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
            C78773Uvp c78773Uvp = this.LJLILLLLZI;
            List<W5O> list = this.LJLJI;
            this.LJLIL = 1;
            c78773Uvp.getClass();
            obj = C48841JEv.LJI(new C66042iW(c78773Uvp, list, null), this);
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

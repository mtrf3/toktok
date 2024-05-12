package X;

import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.PreviewImageScene;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.PreviewImageScene$showAnimateAsync$1", f = "PreviewImageScene.kt", l = {150}, m = "invokeSuspend")
/* renamed from: X.Gdq, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41986Gdq extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ PreviewImageScene LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41986Gdq(PreviewImageScene previewImageScene, InterfaceC67352kd<? super C41986Gdq> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = previewImageScene;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C41986Gdq(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String str;
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
            MyMediaModel myMediaModel = this.LJLILLLLZI.LJLJJL;
            if (myMediaModel != null) {
                str = myMediaModel.fileLocalUriPath;
            } else {
                str = null;
            }
            int LIZIZ = C42307Gj1.LIZIZ(str);
            XIF xif = EXT.LIZ;
            C81933WDp c81933WDp = new C81933WDp(this.LJLILLLLZI, LIZIZ, null);
            this.LJLIL = 1;
            if (XKX.LJI(xif, c81933WDp, this) == enumC58928NAu) {
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

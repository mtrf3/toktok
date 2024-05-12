package X;

import com.bytedance.retrofit2.mime.TypedFile;
import com.ss.android.ugc.aweme.nows.api.AICaptionApi;
import com.ss.android.ugc.aweme.nows.api.AICaptionNetworkModule;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.nows.api.AICaptionNetworkModule$submitImage$2", f = "AICaptionNetworkModule.kt", l = {47}, m = "invokeSuspend")
/* renamed from: X.EaY, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36686EaY extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super AICaptionNetworkModule.AICaptionResponse>, Object> {
    public int LJLIL;
    public final /* synthetic */ TypedFile LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36686EaY(TypedFile typedFile, InterfaceC67352kd<? super C36686EaY> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = typedFile;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C36686EaY(this.LJLILLLLZI, interfaceC67352kd);
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
            AICaptionApi aICaptionApi = (AICaptionApi) AICaptionNetworkModule.LIZ.getValue();
            TypedFile typedFile = this.LJLILLLLZI;
            Object value = AICaptionNetworkModule.LIZIZ.getValue();
            o.LJIIIIZZ(value, "<get-appLanguage>(...)");
            this.LJLIL = 1;
            obj = aICaptionApi.getImageInfo(typedFile, (String) value, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super AICaptionNetworkModule.AICaptionResponse> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

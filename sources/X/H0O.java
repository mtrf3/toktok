package X;

import com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig;
import com.ss.android.ugc.aweme.publish.model.UploadImageConfig;
import com.ss.android.ugc.aweme.shortvideo.AVApiImpl;
import com.ss.android.ugc.aweme.uploader.retrofit.UploaderRetrofitService;
import fjb.a;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.tools.music.aichoosemusic.task.BaseAIMusicUploadFrameTask$start$2$1$frameUploadAuthKeyConfigDefer$1", f = "BaseAIMusicUploadFrameTask.kt", l = {135}, m = "invokeSuspend")
/* loaded from: classes8.dex */
public final class H0O extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super UploadImageConfig>, Object> {
    public int LJLIL;
    public final /* synthetic */ AbstractC41925Gcr LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H0O(AbstractC41925Gcr abstractC41925Gcr, InterfaceC67352kd<? super H0O> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = abstractC41925Gcr;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new H0O(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
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
            AbstractC41925Gcr abstractC41925Gcr = this.LJLILLLLZI;
            this.LJLIL = 1;
            abstractC41925Gcr.getClass();
            XKS xks = new XKS(1, C78555UsJ.LJJII(this));
            xks.LJIIL();
            java.util.Map<String, String> LJJIIZI = C51029K0z.LJJIIZI(new OSZ("purpose", "AI"));
            H0P h0p = new H0P(xks);
            String LIZ = AVApiImpl.LIZJ().LIZ();
            o.LJIIIIZZ(LIZ, "get().getService(AVApi::…s.java).apI_URL_PREFIX_SI");
            InterfaceC789838c create = C46104I7o.LJJII().create(LIZ);
            if (create != null) {
                obj2 = create.create(UploaderRetrofitService.class);
            } else {
                obj2 = null;
            }
            o.LJI(obj2);
            C76L<UploadAuthKeyConfig> uploadAuthKeyConfig = ((UploaderRetrofitService) obj2).getUploadAuthKeyConfig(LJJIIZI);
            uploadAuthKeyConfig.LJFF(new RunnableC65751PrH(uploadAuthKeyConfig, h0p), EnumC169566l6.LJLIL);
            xks.LJIILIIL(new AqS173S0100000_7(uploadAuthKeyConfig, (C76L<UploadAuthKeyConfig>) 225));
            obj = xks.LJIIJJI();
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super UploadImageConfig> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

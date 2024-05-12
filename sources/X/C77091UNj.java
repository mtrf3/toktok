package X;

import com.bytedance.android.livesdk.model.message.CaptionContent;
import com.bytedance.android.livesdk.model.message.CaptionMessage;
import com.ss.ugc.live.sdk.message.data.IMessage;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.android.live.publicscreen.impl.caption.CaptionViewModelV2$onMessage$1$1", f = "CaptionViewModelV2.kt", l = {142, 119}, m = "invokeSuspend")
/* renamed from: X.UNj, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77091UNj extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public InterfaceC75422xe LJLIL;
    public C77090UNi LJLILLLLZI;
    public IMessage LJLJI;
    public CaptionContent LJLJJI;
    public long LJLJJL;
    public int LJLJJLL;
    public final /* synthetic */ C77090UNi LJLJL;
    public final /* synthetic */ IMessage LJLJLJ;
    public final /* synthetic */ CaptionContent LJLJLLL;
    public final /* synthetic */ long LJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C77091UNj(C77090UNi c77090UNi, IMessage iMessage, CaptionContent captionContent, long j, InterfaceC67352kd<? super C77091UNj> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJL = c77090UNi;
        this.LJLJLJ = iMessage;
        this.LJLJLLL = captionContent;
        this.LJLL = j;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C77091UNj(this.LJLJL, this.LJLJLJ, this.LJLJLLL, this.LJLL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C77090UNi c77090UNi;
        InterfaceC75422xe interfaceC75422xe;
        IMessage iMessage;
        CaptionContent captionContent;
        long j;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLJJLL;
        try {
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        interfaceC75422xe = this.LJLIL;
                        try {
                            C141335gf.LIZJ(obj);
                            interfaceC75422xe.LIZIZ(null);
                            return C76800UCe.LIZ;
                        } catch (Throwable th) {
                            th = th;
                            interfaceC75422xe.LIZIZ(null);
                            throw th;
                        }
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = this.LJLJJL;
                captionContent = this.LJLJJI;
                iMessage = this.LJLJI;
                c77090UNi = this.LJLILLLLZI;
                interfaceC75422xe = this.LJLIL;
                C141335gf.LIZJ(obj);
            } else {
                C141335gf.LIZJ(obj);
                c77090UNi = this.LJLJL;
                interfaceC75422xe = c77090UNi.LJLJLLL;
                iMessage = this.LJLJLJ;
                captionContent = this.LJLJLLL;
                j = this.LJLL;
                this.LJLIL = interfaceC75422xe;
                this.LJLILLLLZI = c77090UNi;
                this.LJLJI = iMessage;
                this.LJLJJI = captionContent;
                this.LJLJJL = j;
                this.LJLJJLL = 1;
                if (interfaceC75422xe.LIZ(null, this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            UO1 uo1 = c77090UNi.LJLJI;
            C77106UNy c77106UNy = new C77106UNy(((CaptionMessage) iMessage).timestampMs);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(captionContent.content);
            LIZ.append(' ');
            String LIZIZ = X1D.LIZIZ(LIZ);
            o.LJIIIZ(LIZIZ, "<set-?>");
            c77106UNy.LJLJJLL = LIZIZ;
            c77106UNy.LJLJJI = ((CaptionMessage) iMessage).durationMs;
            c77106UNy.LJLJJL = ((CaptionMessage) iMessage).baseMessage.messageId;
            c77106UNy.LJLJL = j;
            c77106UNy.LJLJLJ = ((CaptionMessage) iMessage).timestampMs;
            this.LJLIL = interfaceC75422xe;
            this.LJLILLLLZI = null;
            this.LJLJI = null;
            this.LJLJJI = null;
            this.LJLJJLL = 2;
            if (uo1.LIZ(c77106UNy, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
            interfaceC75422xe.LIZIZ(null);
            return C76800UCe.LIZ;
        } catch (Throwable th2) {
            th = th2;
            interfaceC75422xe.LIZIZ(null);
            throw th;
        }
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

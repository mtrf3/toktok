package X;

import com.ss.android.ugc.aweme.im.sdk.chat.feature.tikbot.api.TakoProcessInfoResponse;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.tikbot.service.BotTypingProcessInfoManager;
import fjb.a;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.tikbot.service.BotTypingProcessInfoManager$handleMsg$1$1", f = "TakoTypingProcessInfoService.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2yk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C76102yk extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C68322mC<TakoProcessInfoResponse> LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C76102yk(C68322mC<TakoProcessInfoResponse> c68322mC, String str, InterfaceC67352kd<? super C76102yk> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c68322mC;
        this.LJLILLLLZI = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C76102yk(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Integer num;
        C141335gf.LIZJ(obj);
        BotTypingProcessInfoManager botTypingProcessInfoManager = BotTypingProcessInfoManager.INSTANCE;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("getTakoProcessInfo response.processStatus = ");
        TakoProcessInfoResponse takoProcessInfoResponse = this.LJLIL.element;
        List<String> list = null;
        if (takoProcessInfoResponse != null) {
            num = takoProcessInfoResponse.getProcessStatus();
        } else {
            num = null;
        }
        LIZ.append(num);
        LIZ.append(", response.processInfoList = ");
        TakoProcessInfoResponse takoProcessInfoResponse2 = this.LJLIL.element;
        if (takoProcessInfoResponse2 != null) {
            list = takoProcessInfoResponse2.getProcessInfoList();
        }
        LIZ.append(list);
        botTypingProcessInfoManager.log(X1D.LIZIZ(LIZ));
        if (botTypingProcessInfoManager.isQueryMsgIdInvalid(this.LJLILLLLZI) || botTypingProcessInfoManager.isTimeOut()) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("2 isInvalid == true, queryMsgId = ");
            LIZ2.append(this.LJLILLLLZI);
            botTypingProcessInfoManager.log(X1D.LIZIZ(LIZ2));
            return C76800UCe.LIZ;
        }
        TakoProcessInfoResponse takoProcessInfoResponse3 = this.LJLIL.element;
        TakoProcessInfoResponse takoProcessInfoResponse4 = takoProcessInfoResponse3;
        if (takoProcessInfoResponse4 != null && takoProcessInfoResponse4.error_code == 0) {
            Integer processStatus = takoProcessInfoResponse3.getProcessStatus();
            if (processStatus != null) {
                BotTypingProcessInfoManager.currentProcessInfo.LJLJI = processStatus.intValue();
            }
            C76112yl c76112yl = BotTypingProcessInfoManager.currentProcessInfo;
            List<C76142yo> spannableList = botTypingProcessInfoManager.getSpannableList(this.LJLIL.element.getProcessInfoList(), c76112yl.LJLJI);
            c76112yl.getClass();
            o.LJIIIZ(spannableList, "<set-?>");
            c76112yl.LJLIL = spannableList;
            InterfaceC76122ym interfaceC76122ym = BotTypingProcessInfoManager.processInfoChangedListener;
            if (interfaceC76122ym != null) {
                interfaceC76122ym.LIZ(c76112yl);
            }
        }
        botTypingProcessInfoManager.continuePollingProcessInfo(this.LJLILLLLZI);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

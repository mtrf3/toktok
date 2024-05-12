package X;

import com.bytedance.android.live.publicscreen.impl.messagehistory.FetchHistoryApi;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.message.ProtoMessageFetchResult;
import com.bytedance.android.message.IMessageService;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import fjb.a;
import java.util.ArrayList;
import java.util.LinkedHashMap;

@InterfaceC65848Psq(c = "com.bytedance.android.live.publicscreen.impl.messagehistory.MessageHistoryFetcher$fetchHistory$1$fetchResult$1", f = "MessageHistoryFetcher.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class CR7 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super CRU>, Object> {
    public final /* synthetic */ CRF LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CR7(CRF crf, InterfaceC67352kd<? super CR7> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = crf;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new CR7(this.LJLIL, interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v15, types: [X.Q9H, T] */
    /* JADX WARN: Type inference failed for: r0v7, types: [T, java.lang.String] */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        java.util.Map<String, String> fetchHistoryParams;
        C141335gf.LIZJ(obj);
        int secret = ((C29374Bfu) B83.LIZ().LIZIZ()).LIZIZ.getSecret();
        ArrayList arrayList = new ArrayList();
        C34K c34k = new C34K();
        C68322mC c68322mC = new C68322mC();
        String str = "";
        c68322mC.element = "";
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        IMessageManager iMessageManager = this.LJLIL.LJIIIIZZ;
        if (iMessageManager != null && (fetchHistoryParams = iMessageManager.getFetchHistoryParams()) != null && (!fetchHistoryParams.isEmpty())) {
            linkedHashMap.putAll(fetchHistoryParams);
        }
        CRF crf = this.LJLIL;
        Room room = crf.LJFF;
        Boolean bool = null;
        if (room == null) {
            return null;
        }
        try {
            C65814PsI.LIZ().getClass();
            C64797Pbt<Q9I> execute = ((FetchHistoryApi) C65814PsI.LIZJ(FetchHistoryApi.class)).fetchCommentHistory(room.getId(), secret, crf.LIZ(), linkedHashMap).execute();
            if (execute.LIZIZ()) {
                C68322mC c68322mC2 = new C68322mC();
                c68322mC2.element = new Q9H();
                C65124PhA.LIZLLL().getClass();
                InterfaceC31105CIr LJ = C65124PhA.LJ(ProtoMessageFetchResult.class);
                if (LJ != null) {
                    Q9H q9h = (Q9H) c68322mC2.element;
                    q9h.LJIIL(execute.LIZIZ);
                    ProtoMessageFetchResult protoMessageFetchResult = (ProtoMessageFetchResult) LJ.LIZ(q9h);
                    if (protoMessageFetchResult != null) {
                        bool = Boolean.valueOf(protoMessageFetchResult.historyNoMore);
                    }
                    c34k.element = C29306Beo.LJIILLIIL(bool);
                    T t = str;
                    if (protoMessageFetchResult != null) {
                        String str2 = protoMessageFetchResult.historyCommentCursor;
                        t = str;
                        if (str2 != null) {
                            t = str2;
                        }
                    }
                    c68322mC.element = t;
                    for (ProtoMessageFetchResult.BaseProtoMessage baseProtoMessage : protoMessageFetchResult.messages) {
                        try {
                            Class<? extends CR6> messageClass = ((IMessageService) CN1.LIZ(IMessageService.class)).getMessageClass(baseProtoMessage.method);
                            if (messageClass != null) {
                                C65124PhA.LIZLLL().getClass();
                                InterfaceC31105CIr LJ2 = C65124PhA.LJ(messageClass);
                                if (LJ2 != null) {
                                    Q9H q9h2 = new Q9H();
                                    q9h2.LJIIL(new Q9M(baseProtoMessage.payload));
                                    CR6 cr6 = (CR6) LJ2.LIZ(q9h2);
                                    if (cr6 != null) {
                                        cr6.generalMessageType = baseProtoMessage.msgType;
                                        cr6.isHistoryMessage = true;
                                        cr6.receiveTime = C30725C4b.LIZ();
                                        arrayList.add(cr6);
                                    }
                                }
                            }
                        } catch (Throwable unused) {
                        }
                    }
                } else {
                    throw new AssertionError("No ProtoDecoder found for ProtoMessageFetchResult??!");
                }
            } else {
                c34k.element = crf.LIZIZ();
                c68322mC.element = crf.LIZ();
            }
        } catch (Exception unused2) {
            c34k.element = crf.LIZIZ();
            c68322mC.element = crf.LIZ();
        }
        return new CRU(arrayList, c34k.element, (String) c68322mC.element);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super CRU> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

package X;

import com.bytedance.ies.im.core.api.model.RichTextInfo;
import fjb.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.ChatViewModel$sendMentionMessage$1", f = "ChatViewModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.3Gz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C81293Gz extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ List<RichTextInfo> LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C81293Gz(String str, List list, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = list;
        this.LJLILLLLZI = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C81293Gz(this.LJLILLLLZI, this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        List LJLJJI;
        C141335gf.LIZJ(obj);
        List<RichTextInfo> list = this.LJLIL;
        if (list != null && !list.isEmpty() && (str = this.LJLILLLLZI) != null) {
            C82983Nm c82983Nm = C82983Nm.LIZ;
            List<RichTextInfo> richTextInfoList = this.LJLIL;
            c82983Nm.getClass();
            o.LJIIIZ(richTextInfoList, "richTextInfoList");
            C3Q9.LIZ.getClass();
            C75782yE.LIZ();
            C63120Opw LIZ = C4WC.LIZIZ.LIZ(str);
            if (LIZ != null) {
                ArrayList arrayList = new ArrayList();
                for (RichTextInfo richTextInfo : richTextInfoList) {
                    if (richTextInfo.type == C3H0.MENTION_SINGLE.getValue()) {
                        String str3 = richTextInfo.mentionedUid;
                        if (str3 != null) {
                            arrayList.add(str3);
                        }
                        if (arrayList.size() == 5) {
                            break;
                        }
                    }
                }
                if (arrayList.size() < 5 && (str2 = LIZ.getLocalExt().get("a:recent_mentions")) != null && (LJLJJI = s.LJLJJI(str2, new char[]{','}, false, 6)) != null && !LJLJJI.isEmpty()) {
                    arrayList.addAll(ORZ.LLILLL(LJLJJI, 5 - arrayList.size()));
                }
                if (arrayList.size() > 0) {
                    java.util.Map<String, String> localExt = LIZ.getLocalExt();
                    o.LJIIIIZZ(localExt, "conversation.localExt");
                    localExt.put("a:recent_mentions", ORZ.LLD(arrayList, ",", null, null, null, 62));
                    AbstractC90763hI LIZ2 = C81273Gx.LIZ(str);
                    java.util.Map<String, String> localExt2 = LIZ.getLocalExt();
                    o.LJIIIIZZ(localExt2, "conversation.localExt");
                    LIZ2.LJIJJ(localExt2, null);
                }
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

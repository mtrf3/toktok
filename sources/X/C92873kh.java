package X;

import com.bytedance.ies.im.core.api.model.RichTextInfo;
import com.bytedance.im.core.proto.ReferenceInfo;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent;
import com.ss.android.ugc.aweme.im.message.template.component.TextComponent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ReferenceInfoHint;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.TextContent;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.suggestedreply.data.SuggestedReply;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.suggestedreply.data.SuggestedReplyAnimeEmoji;
import com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.ChatViewModel;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import fjb.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.ChatViewModel$sendMessage$1", f = "ChatViewModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.3kh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C92873kh extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ ChatViewModel LJLIL;
    public final /* synthetic */ CharSequence LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ List<RichTextInfo> LJLJJL;
    public final /* synthetic */ C99033ud LJLJJLL;
    public final /* synthetic */ C109544Rq LJLJL;
    public final /* synthetic */ java.util.Map<String, String> LJLJLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C92873kh(ChatViewModel chatViewModel, CharSequence charSequence, String str, String str2, List<RichTextInfo> list, C99033ud c99033ud, C109544Rq c109544Rq, java.util.Map<String, String> map, InterfaceC67352kd<? super C92873kh> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = chatViewModel;
        this.LJLILLLLZI = charSequence;
        this.LJLJI = str;
        this.LJLJJI = str2;
        this.LJLJJL = list;
        this.LJLJJLL = c99033ud;
        this.LJLJL = c109544Rq;
        this.LJLJLJ = map;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C92873kh(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        String LIZJ;
        int i;
        boolean z2;
        LinkedHashMap linkedHashMap;
        java.util.Map<String, String> linkedHashMap2;
        String searchId;
        C92723kS c92723kS;
        SuggestedReply suggestedReply;
        String str;
        String str2;
        BaseTemplate LJIILL;
        PreviewHintComponent LLZLL;
        TextComponent textComponent;
        int i2;
        boolean z3;
        C141335gf.LIZJ(obj);
        final ChatViewModel chatViewModel = this.LJLIL;
        CharSequence charSequence = this.LJLILLLLZI;
        String str3 = this.LJLJI;
        String str4 = this.LJLJJI;
        List<RichTextInfo> list = this.LJLJJL;
        C99033ud c99033ud = this.LJLJJLL;
        C109544Rq c109544Rq = this.LJLJL;
        java.util.Map<String, String> map = this.LJLJLJ;
        chatViewModel.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        int i3 = 1;
        if (list == null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            RichTextInfo richTextInfo = (RichTextInfo) ORZ.LLFF(list);
            if (richTextInfo.position + richTextInfo.length >= charSequence.length()) {
                LIZJ = charSequence.toString();
            } else {
                String charSequence2 = charSequence.toString();
                int length = charSequence2.length() - 1;
                int i4 = 0;
                boolean z4 = false;
                while (true) {
                    if (i4 > length) {
                        break;
                    }
                    if (!z4) {
                        i2 = i4;
                    } else {
                        i2 = length;
                    }
                    if (o.LJIIJJI(charSequence2.charAt(i2), 32) <= 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (!z4) {
                        if (!z3) {
                            z4 = true;
                        } else {
                            i4++;
                        }
                    } else {
                        if (!z3) {
                            i3 = 1;
                            break;
                        }
                        length--;
                    }
                    i3 = 1;
                }
                LIZJ = C132805Jc.LIZJ(length, i3, charSequence2, i4);
            }
        } else {
            String charSequence3 = charSequence.toString();
            int length2 = charSequence3.length() - 1;
            int i5 = 0;
            boolean z5 = false;
            while (true) {
                if (i5 > length2) {
                    break;
                }
                if (!z5) {
                    i = i5;
                } else {
                    i = length2;
                }
                if (o.LJIIJJI(charSequence3.charAt(i), 32) <= 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z5) {
                    if (!z2) {
                        i3 = 1;
                        z5 = true;
                    } else {
                        i5++;
                    }
                } else {
                    if (!z2) {
                        i3 = 1;
                        break;
                    }
                    length2--;
                }
                i3 = 1;
            }
            LIZJ = C132805Jc.LIZJ(length2, i3, charSequence3, i5);
        }
        ReferenceInfo referenceInfo = null;
        TextContent obtain = TextContent.Companion.obtain(LIZJ, null, list);
        obtain.setSendStartTime(currentTimeMillis);
        if (c109544Rq != null) {
            obtain.type = 703;
            String str5 = "";
            if (!C93793mB.LJIILL(c109544Rq) || (LJIILL = C1DJ.LJIILL(c109544Rq)) == null || (LLZLL = LJIILL.LLZLL()) == null || (textComponent = LLZLL.quotePreviewText) == null || (str = textComponent.text) == null) {
                str = "";
            }
            String content = c109544Rq.getContent();
            if (content == null) {
                content = "";
            }
            String valueOf = String.valueOf(c109544Rq.getSender());
            String secSender = c109544Rq.getSecSender();
            secSender.toString();
            int msgType = c109544Rq.getMsgType();
            String str6 = c109544Rq.getExt().get("a:src");
            String content2 = c109544Rq.getContent();
            if (content2 != null) {
                str5 = content2;
            }
            ReferenceInfoHint referenceInfoHint = new ReferenceInfoHint(content, valueOf, secSender, msgType, str6, str5, str);
            C63577OxJ c63577OxJ = new C63577OxJ();
            c63577OxJ.LJ = C62070OXq.LIZIZ(referenceInfoHint);
            c63577OxJ.LIZLLL = Long.valueOf(c109544Rq.getMsgId());
            c63577OxJ.LJFF = Long.valueOf(c109544Rq.getMsgType());
            c63577OxJ.LJI = c109544Rq.getMessageStatus();
            c63577OxJ.LJIIJJI = str;
            referenceInfo = c63577OxJ.build();
            linkedHashMap = new LinkedHashMap();
            if (C93793mB.LJIIIIZZ(c109544Rq)) {
                str2 = "true";
            } else {
                str2 = "false";
            }
            linkedHashMap.put("quick_reply_message", str2);
            String str7 = c109544Rq.getLocalExt().get("feed_video_status_flag");
            if (str7 != null) {
                linkedHashMap.put("feed_video_status_flag", str7);
            }
        } else {
            linkedHashMap = new LinkedHashMap();
        }
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        if (C78685UuP.LJJJZ(str4)) {
            linkedHashMap.put("enter_method", str4);
        }
        if (c99033ud != null && c99033ud.isTakoChat$im_base_release()) {
            java.util.Map<String, String> botSendParams = c99033ud.getBotSendParams();
            if (botSendParams != null) {
                linkedHashMap2 = C113554cx.LJJLIL(botSendParams);
            } else {
                linkedHashMap2 = new LinkedHashMap<>();
            }
            linkedHashMap2.put("content_type", CardStruct.IStatusCode.DEFAULT);
        } else {
            linkedHashMap2 = new LinkedHashMap<>();
        }
        AbstractC92763kW<SuggestedReply> value = chatViewModel.LJLL.getValue();
        if ((value instanceof C92723kS) && (c92723kS = (C92723kS) value) != null && (suggestedReply = (SuggestedReply) c92723kS.LIZ) != null) {
            String json = GsonProtectorUtils.toJson(GsonHolder.LIZLLL().LIZ(), new SuggestedReplyAnimeEmoji(suggestedReply.getReplyEmoji()));
            o.LJIIIIZZ(json, "get().gson.toJson(Sugges…Anime = this.replyEmoji))");
            linkedHashMap2.put("a:sug_reply_anime", json);
            linkedHashMap2.put("a:src", "aweme_video:suggested_reply");
        }
        if (c99033ud != null && c99033ud.isTakoChat$im_base_release() && (searchId = c99033ud.getSearchId()) != null) {
            linkedHashMap.put("search_id", searchId);
        }
        if (list != null) {
            ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
            Iterator<RichTextInfo> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().mentionedUid);
            }
            java.util.Map<? extends String, ? extends String> LJJLIIIIJ = C113554cx.LJJLIIIIJ(new OSZ("a:mentioned_uids", ORZ.LLD(ORZ.LLJI(arrayList), ",", null, null, null, 62)));
            if (LJJLIIIIJ != null) {
                linkedHashMap2.putAll(LJJLIIIIJ);
            }
        }
        C4MW c4mw = (C4MW) C88903eI.LIZ();
        c4mw.LIZ.LIZIZ = str3;
        c4mw.LIZLLL(obtain);
        C4MX c4mx = c4mw.LIZ;
        c4mx.LJIIJJI = referenceInfo;
        c4mx.LJII = linkedHashMap;
        c4mx.LJFF = linkedHashMap2;
        c4mw.LJII(new InterfaceC92803ka() { // from class: X.3kQ
            @Override // X.InterfaceC92793kZ
            public final void LIZ(C63120Opw c63120Opw, List<? extends C109544Rq> list2) {
            }

            @Override // X.InterfaceC92803ka
            public final void LIZIZ(C63120Opw c63120Opw, C109544Rq c109544Rq2) {
            }

            @Override // X.InterfaceC92793kZ
            public final void LIZJ(C63120Opw c63120Opw, C109544Rq c109544Rq2) {
            }

            @Override // X.InterfaceC92803ka
            public final void LIZLLL(C63120Opw c63120Opw, List<C109544Rq> list2, java.util.Map<C109544Rq, C63623Oy3> map2) {
            }

            @Override // X.InterfaceC92803ka
            public final void LJFF(C63120Opw c63120Opw, C109544Rq c109544Rq2) {
                ChatViewModel.this.LJLJLJ.setValue(new C92723kS(c109544Rq2));
            }

            @Override // X.InterfaceC92803ka
            public final void LJ(C63120Opw c63120Opw, C109544Rq c109544Rq2, C63623Oy3 c63623Oy3) {
                ChatViewModel chatViewModel2 = ChatViewModel.this;
                chatViewModel2.LJLJJLL = 3;
                chatViewModel2.LJLJLJ.setValue(new C92733kT(c63623Oy3));
            }
        });
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

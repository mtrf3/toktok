package X;

import android.content.Context;
import android.content.Intent;
import com.bytedance.android.livesdk.livesetting.banner.LiveEffectMusicFadeDurationSetting;
import com.bytedance.im.core.proto.ReferenceInfo;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ReferenceInfoHint;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.TextContent;
import com.ss.android.ugc.aweme.im.sdk.notification.PushQuickActionReceiver;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.notification.PushQuickActionReceiver$onReceive$1", f = "PushQuickActionReceiver.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.3kk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C92903kk extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ PushQuickActionReceiver LJLIL;
    public final /* synthetic */ Context LJLILLLLZI;
    public final /* synthetic */ Intent LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C92903kk(PushQuickActionReceiver pushQuickActionReceiver, Context context, Intent intent, InterfaceC67352kd<? super C92903kk> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = pushQuickActionReceiver;
        this.LJLILLLLZI = context;
        this.LJLJI = intent;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C92903kk(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        android.net.Uri parsedUri;
        String queryParameter;
        Long l;
        Integer num;
        String str;
        ReferenceInfoHint referenceInfoHint;
        String valueOf;
        int msgType;
        C141335gf.LIZJ(obj);
        PushQuickActionReceiver pushQuickActionReceiver = this.LJLIL;
        Context context = this.LJLILLLLZI;
        Intent intent = this.LJLJI;
        pushQuickActionReceiver.getClass();
        String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "reply_content_str");
        if (LLJJIJIIJIL != null && (queryParameter = UriProtector.getQueryParameter((parsedUri = UriProtector.parse(LLJJIJIIJIL)), "conversation_id")) != null) {
            C96423qQ.LIZ();
            C4Z2.LJJIFFI(context);
            o.LJIIIIZZ(parsedUri, "parsedUri");
            String queryParameter2 = UriProtector.getQueryParameter(parsedUri, "reply_to_message_server_id");
            ReferenceInfo referenceInfo = null;
            if (queryParameter2 != null) {
                l = Long.valueOf(CastLongProtector.parseLong(queryParameter2));
            } else {
                l = null;
            }
            String queryParameter3 = UriProtector.getQueryParameter(parsedUri, "reply_to_message_type");
            if (queryParameter3 != null) {
                num = Integer.valueOf(CastIntegerProtector.parseInt(queryParameter3));
            } else {
                num = null;
            }
            String queryParameter4 = UriProtector.getQueryParameter(parsedUri, "reply_to_message_content");
            if (queryParameter4 != null) {
                str = android.net.Uri.decode(queryParameter4);
            } else {
                str = null;
            }
            String queryParameter5 = UriProtector.getQueryParameter(parsedUri, "reply_to_message_from_uid");
            if (str != null && str.length() != 0 && l != null && num != null && queryParameter5 != null && queryParameter5.length() != 0) {
                EnumC109604Rw enumC109604Rw = EnumC109604Rw.AVAILABLE;
                C31F.LIZ.getClass();
                C31G.LIZ();
                C109544Rq LJIILIIL = C63150OqQ.LJIILIIL(l.longValue());
                if (LJIILIIL != null) {
                    enumC109604Rw = LJIILIIL.getMessageStatus();
                    o.LJIIIIZZ(enumC109604Rw, "it.messageStatus");
                    String content = LJIILIIL.getContent();
                    if (content == null) {
                        content = str;
                    }
                    if (LJIILIIL.getSender() <= 0) {
                        valueOf = queryParameter5;
                    } else {
                        valueOf = String.valueOf(LJIILIIL.getSender());
                    }
                    String secSender = LJIILIIL.getSecSender();
                    if (secSender != null) {
                        queryParameter5 = secSender;
                    }
                    if (LJIILIIL.getMsgType() <= 0) {
                        msgType = num.intValue();
                    } else {
                        msgType = LJIILIIL.getMsgType();
                    }
                    String content2 = LJIILIIL.getContent();
                    if (content2 != null) {
                        str = content2;
                    }
                    referenceInfoHint = new ReferenceInfoHint(content, valueOf, queryParameter5, msgType, null, str, null, 80, null);
                } else {
                    referenceInfoHint = new ReferenceInfoHint(str, queryParameter5, queryParameter5, num.intValue(), null, str, null, 80, null);
                }
                C63577OxJ c63577OxJ = new C63577OxJ();
                c63577OxJ.LJ = C62070OXq.LIZIZ(referenceInfoHint);
                c63577OxJ.LIZLLL = l;
                c63577OxJ.LJFF = Long.valueOf(num.intValue());
                c63577OxJ.LJI = enumC109604Rw;
                referenceInfo = c63577OxJ.build();
            }
            String queryParameter6 = UriProtector.getQueryParameter(parsedUri, "reply_text");
            if (queryParameter6 == null) {
                queryParameter6 = "";
            }
            TextContent obtain$default = TextContent.Companion.obtain$default(TextContent.Companion, C40689Fy1.LLIIII(LiveEffectMusicFadeDurationSetting.DEFAULT, queryParameter6), null, null, 6, null);
            obtain$default.type = 703;
            obtain$default.setSendStartTime(System.currentTimeMillis());
            C4MW c4mw = (C4MW) C88903eI.LIZ();
            c4mw.LIZ.LIZIZ = queryParameter;
            c4mw.LIZLLL(obtain$default);
            c4mw.LIZ.LJIIJJI = referenceInfo;
            c4mw.LIZ.LJII = C113554cx.LJJLIIIIJ(new OSZ("enter_from", "outer_push"), new OSZ("enter_method", "push_reply"), new OSZ("quick_reply_message", "true"));
            c4mw.LJI();
            C81273Gx.LIZ(queryParameter).LJII();
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

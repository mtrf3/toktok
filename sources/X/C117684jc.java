package X;

import Y.IDcS364S0100000_1;
import com.ss.android.ugc.aweme.im.message.template.card.PictureCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent;
import com.ss.android.ugc.aweme.im.message.template.component.IconTypeComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ImageComponent;
import com.ss.android.ugc.aweme.im.message.template.component.QueryDataComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ResolutionComponent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.4jc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C117684jc {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [T, X.4jp] */
    public static final void LIZ(final C109544Rq chatMessage) {
        C117824jq c117824jq;
        String uri;
        Integer valueOf;
        o.LJIIIZ(chatMessage, "chatMessage");
        chatMessage.addLocalExt("key_resend", "1");
        int msgType = chatMessage.getMsgType();
        C117824jq c117824jq2 = null;
        r5 = null;
        r5 = null;
        InterfaceC86963bA<C109544Rq> interfaceC86963bA = null;
        if (msgType != 1802) {
            if (msgType != 1803) {
                EnumC110124Tw.Companion.getClass();
                BaseContent LIZJ = C110134Tx.LIZJ(chatMessage);
                if (LIZJ != null && (valueOf = Integer.valueOf(LIZJ.type)) != null) {
                    if (valueOf.intValue() == 706) {
                        interfaceC86963bA = new InterfaceC86963bA<C109544Rq>() { // from class: X.2xy
                            @Override // X.InterfaceC86963bA
                            public final void LIZIZ(C63623Oy3 c63623Oy3) {
                            }

                            @Override // X.InterfaceC86963bA
                            public final void onSuccess(C109544Rq c109544Rq) {
                                C109544Rq c109544Rq2 = c109544Rq;
                                if (c109544Rq2 == null) {
                                    return;
                                }
                                XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new C75562xs(c109544Rq2, null), 3);
                            }
                        };
                    } else if (valueOf.intValue() == 707) {
                        interfaceC86963bA = new InterfaceC86963bA<C109544Rq>() { // from class: X.30l
                            @Override // X.InterfaceC86963bA
                            public final void LIZIZ(C63623Oy3 c63623Oy3) {
                            }

                            @Override // X.InterfaceC86963bA
                            public final void onSuccess(C109544Rq c109544Rq) {
                                C769730j.LIZIZ(c109544Rq);
                            }
                        };
                    }
                }
                C106674Gp.LJIIL(interfaceC86963bA, chatMessage);
                return;
            }
            C78857UxB.LJJJJI(new C117744ji(chatMessage, null));
            return;
        }
        final C117994k7 c117994k7 = new C117994k7(System.currentTimeMillis(), false, false, EnumC117974k5.PHOTO, 1, true, 8);
        List<C117824jq> attachments = chatMessage.getAttachments();
        if (attachments == null) {
            return;
        }
        Iterator<C117824jq> it = attachments.iterator();
        while (true) {
            if (it.hasNext()) {
                c117824jq = it.next();
                if (c117824jq.getIndex() == 0) {
                    break;
                }
            } else {
                c117824jq = null;
                break;
            }
        }
        C117824jq c117824jq3 = c117824jq;
        if (c117824jq3 == null) {
            return;
        }
        int uploadState = c117824jq3.getUploadState();
        if (uploadState == EnumC117804jo.UPLOADED.getState()) {
            List<C117824jq> attachments2 = chatMessage.getAttachments();
            if (attachments2 == null) {
                return;
            }
            Iterator<C117824jq> it2 = attachments2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                C117824jq next = it2.next();
                if (next.getIndex() == 1) {
                    c117824jq2 = next;
                    break;
                }
            }
            C117824jq c117824jq4 = c117824jq2;
            if (c117824jq4 == null || (uri = c117824jq4.getUri()) == null) {
                return;
            }
            int originalWidth = c117824jq4.getOriginalWidth();
            int originalHeight = c117824jq4.getOriginalHeight();
            String secretKey = c117824jq4.getSecretKey();
            if (secretKey == null) {
                return;
            }
            chatMessage.setScene("private_image");
            chatMessage.setContentPB(new PictureCardTemplate(new ImageComponent(C61878OQg.INSTANCE, uri, new ResolutionComponent(originalWidth, originalHeight), secretKey, (IconTypeComponent) null, 36), C87277YNd.LJIILJJIL(R.string.emj), new BaseRequestComponent(new QueryDataComponent(uri, C113554cx.LJJLIIIIJ(new OSZ("decrypt_key", secretKey), new OSZ("image_width", String.valueOf(originalWidth)), new OSZ("image_height", String.valueOf(originalHeight))))), 78).encode());
            C106674Gp.LJIIL(new IDcS364S0100000_1(C117994k7.LIZ(c117994k7, EnumC117794jn.UPLOADED), 6), chatMessage);
            return;
        }
        if (uploadState == EnumC117804jo.SYNTHESISED.getState()) {
            final C117814jp c117814jp = new C117814jp(c117824jq3.getLocalPath(), null, c117824jq3.getOriginalWidth(), c117824jq3.getOriginalHeight(), 114);
            String uuid = chatMessage.getUuid();
            o.LJIIIIZZ(uuid, "msg.uuid");
            C117874jv.LJI(uuid, c117814jp, C4HF.NORMAL_PHOTO.getScene(), true, 24);
            String uuid2 = chatMessage.getUuid();
            o.LJIIIIZZ(uuid2, "msg.uuid");
            C117874jv.LIZ(new InterfaceC41771GaN() { // from class: X.4jd
                @Override // X.InterfaceC41771GaN
                public final void LIZIZ(String str) {
                }

                @Override // X.InterfaceC41771GaN
                public final void LIZJ(C117914jz c117914jz) {
                }

                @Override // X.InterfaceC41771GaN
                public final void onProgress(int i) {
                }

                @Override // X.InterfaceC41771GaN
                public final void LIZ(C118004k8 result) {
                    o.LJIIIZ(result, "result");
                    C117704je.LJ(chatMessage, c117814jp, result, this, C117994k7.LIZ(c117994k7, EnumC117794jn.SYNTHESISED), null);
                }

                @Override // X.InterfaceC41771GaN
                public final void onFailed(String errMsg) {
                    o.LJIIIZ(errMsg, "errMsg");
                    C117704je.LIZLLL(chatMessage, this, C117994k7.LIZ(c117994k7, EnumC117794jn.SYNTHESISED));
                }
            }, uuid2);
            return;
        }
        final C68322mC c68322mC = new C68322mC();
        c68322mC.element = new C117814jp(c117824jq3.getLocalPath(), null, c117824jq3.getOriginalWidth(), c117824jq3.getOriginalHeight(), 114);
        chatMessage.setMsgStatus(0);
        C106674Gp.LJIILIIL(chatMessage);
        String uuid3 = chatMessage.getUuid();
        o.LJIIIIZZ(uuid3, "msg.uuid");
        C117874jv.LJI(uuid3, (C117814jp) c68322mC.element, C4HF.NORMAL_PHOTO.getScene(), false, 56);
        String uuid4 = chatMessage.getUuid();
        o.LJIIIIZZ(uuid4, "msg.uuid");
        C117874jv.LIZ(new InterfaceC41771GaN() { // from class: X.4jm
            @Override // X.InterfaceC41771GaN
            public final void onProgress(int i) {
            }

            @Override // X.InterfaceC41771GaN
            public final void LIZ(C118004k8 result) {
                o.LJIIIZ(result, "result");
                C117704je.LJ(chatMessage, c68322mC.element, result, this, C117994k7.LIZ(c117994k7, EnumC117794jn.DEFAULT), new AqS167S0100000_1(c68322mC, (C68322mC<C117814jp>) 236));
            }

            @Override // X.InterfaceC41771GaN
            public final void LIZIZ(String str) {
                C109544Rq c109544Rq = chatMessage;
                C68322mC<C117814jp> c68322mC2 = c68322mC;
                C117704je.LIZIZ(c109544Rq, str, c68322mC2.element, new AqS167S0100000_1(c68322mC2, (C68322mC<C117814jp>) 234));
            }

            @Override // X.InterfaceC41771GaN
            public final void LIZJ(C117914jz c117914jz) {
                C109544Rq c109544Rq = chatMessage;
                C68322mC<C117814jp> c68322mC2 = c68322mC;
                C117704je.LIZJ(c109544Rq, c117914jz, c68322mC2.element, new AqS167S0100000_1(c68322mC2, (C68322mC<C117814jp>) 235));
            }

            @Override // X.InterfaceC41771GaN
            public final void onFailed(String errMsg) {
                o.LJIIIZ(errMsg, "errMsg");
                C117704je.LIZLLL(chatMessage, this, C117994k7.LIZ(c117994k7, EnumC117794jn.DEFAULT));
            }
        }, uuid4);
    }
}

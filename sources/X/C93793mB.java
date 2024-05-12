package X;

import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.google.android.play.core.appupdate.u;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.message.template.card.AwemeCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.ImageCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent;
import com.ss.android.ugc.aweme.im.message.template.component.QueryDataComponent;
import com.ss.android.ugc.aweme.im.message.template.component.VideoCoverComponent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.CommentContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareAwemeContent;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.3mB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C93793mB {
    public static final java.util.Map<OSZ<String, Integer>, Boolean> LIZ = new LinkedHashMap();

    public static final String LIZ(C109544Rq c109544Rq) {
        VideoCoverComponent videoCoverComponent;
        String str;
        ImageCardTemplate imageCardTemplate;
        BaseRequestComponent LLLL;
        QueryDataComponent queryDataComponent;
        ShareAwemeContent shareAwemeContent;
        o.LJIIIZ(c109544Rq, "<this>");
        String str2 = c109544Rq.getLocalExt().get("aweme_id");
        if (str2 == null || str2.length() == 0) {
            int msgType = c109544Rq.getMsgType();
            if (msgType == 8) {
                C110134Tx c110134Tx = EnumC110124Tw.Companion;
                EnumC110124Tw enumC110124Tw = EnumC110124Tw.SHARE_AWEME_SEND;
                c110134Tx.getClass();
                ShareAwemeContent shareAwemeContent2 = (ShareAwemeContent) C110134Tx.LIZLLL(c109544Rq, enumC110124Tw);
                if (shareAwemeContent2 == null) {
                    return null;
                }
                return shareAwemeContent2.getItemId();
            }
            if (msgType == 11) {
                C110134Tx c110134Tx2 = EnumC110124Tw.Companion;
                EnumC110124Tw enumC110124Tw2 = EnumC110124Tw.SHARE_SUB_ONLY_VIDEO_SEND;
                c110134Tx2.getClass();
                ShareAwemeContent shareAwemeContent3 = (ShareAwemeContent) C110134Tx.LIZLLL(c109544Rq, enumC110124Tw2);
                if (shareAwemeContent3 == null) {
                    return null;
                }
                return shareAwemeContent3.getItemId();
            }
            if (msgType == 1025) {
                C110134Tx c110134Tx3 = EnumC110124Tw.Companion;
                EnumC110124Tw enumC110124Tw3 = EnumC110124Tw.SHARE_STORY_SEND;
                c110134Tx3.getClass();
                ShareAwemeContent shareAwemeContent4 = (ShareAwemeContent) C110134Tx.LIZLLL(c109544Rq, enumC110124Tw3);
                if (shareAwemeContent4 == null) {
                    return null;
                }
                return shareAwemeContent4.getItemId();
            }
            if (msgType == 40) {
                C110134Tx c110134Tx4 = EnumC110124Tw.Companion;
                EnumC110124Tw enumC110124Tw4 = EnumC110124Tw.COMMENT_SEND;
                c110134Tx4.getClass();
                CommentContent commentContent = (CommentContent) C110134Tx.LIZLLL(c109544Rq, enumC110124Tw4);
                if (commentContent == null) {
                    return null;
                }
                return commentContent.getAwemeId();
            }
            if (msgType == 7) {
                if (c109544Rq.getReferenceInfo() == null) {
                    return null;
                }
                BaseContent LJIJ = C1DJ.LJIJ(c109544Rq);
                if (!(LJIJ instanceof ShareAwemeContent) || (shareAwemeContent = (ShareAwemeContent) LJIJ) == null) {
                    return null;
                }
                return shareAwemeContent.getItemId();
            }
            if (msgType == 1801) {
                if (!o.LJ(c109544Rq.getScene(), "now_post") || (imageCardTemplate = (ImageCardTemplate) C1DJ.LJIILL(c109544Rq)) == null || (LLLL = imageCardTemplate.LLLL()) == null || (queryDataComponent = LLLL.queryData) == null) {
                    return null;
                }
                return queryDataComponent.resourceID;
            }
            if (msgType == 1809) {
                AwemeCardTemplate awemeCardTemplate = (AwemeCardTemplate) C1DJ.LJIILL(c109544Rq);
                if (awemeCardTemplate != null && (videoCoverComponent = awemeCardTemplate.baseVideoComponent) != null && (str = videoCoverComponent.id) != null) {
                    return str;
                }
                return "";
            }
            if (msgType == 1803) {
                return C78939UyV.LJJJLL(c109544Rq, null).getAid();
            }
            if (msgType != 1802) {
                return null;
            }
            return C78939UyV.LJJJLIIL(c109544Rq, null).getAid();
        }
        return str2;
    }

    public static final int LIZIZ(C109544Rq c109544Rq) {
        IMUser LJFF;
        long LIZLLL = C81273Gx.LIZLLL(c109544Rq.getConversationId());
        if (LIZLLL > 0 && (LJFF = C80533Eb.LJFF(String.valueOf(LIZLLL), null)) != null) {
            return LJFF.getFollowStatus();
        }
        return -1;
    }

    public static final String LIZJ(C109544Rq c109544Rq) {
        String extValue;
        if (c109544Rq == null || (extValue = c109544Rq.getExtValue("a:query_client_message_id")) == null) {
            return "";
        }
        return extValue;
    }

    public static final boolean LIZLLL(C109544Rq c109544Rq) {
        o.LJIIIZ(c109544Rq, "<this>");
        if (o.LJ(c109544Rq.getScene(), "ttba_qa")) {
            return true;
        }
        return false;
    }

    public static final boolean LJ(C109544Rq c109544Rq) {
        o.LJIIIZ(c109544Rq, "<this>");
        return o.LJ(c109544Rq.getExt().get("a:src"), "link");
    }

    public static boolean LJFF(C109544Rq c109544Rq) {
        long j;
        BaseTemplate LJIILL;
        try {
            j = CastLongProtector.parseLong(ujb.o.LJJJJZ(EF7.LJII(), ".", CardStruct.IStatusCode.DEFAULT, false));
        } catch (NumberFormatException unused) {
            j = 0;
        }
        o.LJIIIZ(c109544Rq, "<this>");
        String content = c109544Rq.getContent();
        if (content != null && content.length() != 0 && !o.LJ(c109544Rq.getContent(), "{}") && !o.LJ(c109544Rq.getContent(), "{\"hack\":\"1\"}")) {
            return false;
        }
        C64537PUn contentPB = c109544Rq.getContentPB();
        if (contentPB != null && contentPB.size() > 0 && (LJIILL = C1DJ.LJIILL(c109544Rq)) != null && j >= LJIILL.LLILLJJLI().minVersion) {
            return false;
        }
        return true;
    }

    public static final boolean LJI(C109544Rq c109544Rq) {
        o.LJIIIZ(c109544Rq, "<this>");
        if (c109544Rq.getMsgType() == 1802 || c109544Rq.getMsgType() == 1803) {
            return true;
        }
        return false;
    }

    public static final boolean LJIIIIZZ(C109544Rq c109544Rq) {
        o.LJIIIZ(c109544Rq, "<this>");
        return o.LJ(c109544Rq.getLocalExt().get("quick_reply_message"), "true");
    }

    public static final boolean LJIIIZ(C109544Rq c109544Rq) {
        if (c109544Rq == null || c109544Rq.getMsgStatus() != 1) {
            return false;
        }
        return true;
    }

    public static final boolean LJIIJ(C109544Rq c109544Rq) {
        String str;
        if (C95043oC.LIZLLL || C2304092m.LIZ()) {
            String str2 = null;
            if (c109544Rq != null) {
                str = c109544Rq.getScene();
            } else {
                str = null;
            }
            if (!o.LJ(str, "story_reply")) {
                if (c109544Rq != null) {
                    str2 = c109544Rq.getScene();
                }
                if (o.LJ(str2, "story_reaction")) {
                }
            }
            return true;
        }
        return false;
    }

    public static final boolean LJIIJJI(C109544Rq c109544Rq) {
        if (c109544Rq == null || c109544Rq.getMsgType() != 1807) {
            return false;
        }
        return true;
    }

    public static final boolean LJIIL(C109544Rq c109544Rq) {
        String str;
        C82223Ko c82223Ko = C99033ud.Companion;
        if (c109544Rq != null) {
            str = c109544Rq.getConversationId();
        } else {
            str = null;
        }
        c82223Ko.getClass();
        return C82223Ko.LIZ(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean LJIILIIL(X.C109544Rq r4) {
        /*
            r1 = 0
            if (r4 == 0) goto L2c
            java.lang.String r3 = r4.getScene()
            if (r3 == 0) goto L1c
            int r2 = r3.hashCode()
            r0 = -1934923215(0xffffffff8cab6a31, float:-2.6410633E-31)
            if (r2 == r0) goto L43
            r0 = -761532173(0xffffffffd29bf0f3, float:-3.348812E11)
            if (r2 == r0) goto L3a
            r0 = 65042035(0x3e07673, float:1.3192731E-36)
            if (r2 == r0) goto L31
        L1c:
            if (r4 == 0) goto L2c
            java.util.Map r2 = r4.getLocalExt()
            if (r2 == 0) goto L2c
            java.lang.String r0 = "tako_card_type"
            java.lang.Object r1 = r2.get(r0)
            java.lang.String r1 = (java.lang.String) r1
        L2c:
            boolean r0 = X.C1GE.LJIIL(r1)
        L30:
            return r0
        L31:
            java.lang.String r0 = "guide_card"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L4b
            goto L1c
        L3a:
            java.lang.String r0 = "reunion_card"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L4b
            goto L1c
        L43:
            java.lang.String r0 = "knowledge_card"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L1c
        L4b:
            r0 = 1
            goto L30
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C93793mB.LJIILIIL(X.4Rq):boolean");
    }

    public static final boolean LJIILJJIL(C109544Rq c109544Rq) {
        if (c109544Rq == null || c109544Rq.getMsgType() != 4004) {
            return false;
        }
        return true;
    }

    public static final boolean LJIILL(C109544Rq c109544Rq) {
        o.LJIIIZ(c109544Rq, "<this>");
        C64537PUn contentPB = c109544Rq.getContentPB();
        if (contentPB == null || contentPB.size() <= 0) {
            return false;
        }
        return true;
    }

    public static final boolean LJIILLIIL(C109544Rq c109544Rq) {
        if (c109544Rq == null || c109544Rq.getMsgType() != 4002) {
            return false;
        }
        return true;
    }

    public static final boolean LJIIZILJ(C109544Rq c109544Rq) {
        o.LJIIIZ(c109544Rq, "<this>");
        if (!C114394eJ.LIZ()) {
            return false;
        }
        return o.LJ(c109544Rq.getExt().get("a:is_violative"), "true");
    }

    public static final boolean LJII(C63120Opw c63120Opw, C109544Rq c109544Rq) {
        String str;
        if (c109544Rq == null) {
            if (c63120Opw == null) {
                return true;
            }
        } else if (c63120Opw == null) {
            C3Q9.LIZ.getClass();
            C75782yE.LIZ();
            C4WC c4wc = C4WC.LIZIZ;
            if (c109544Rq != null) {
                str = c109544Rq.getConversationId();
            } else {
                str = null;
            }
            c63120Opw = c4wc.LIZ(str);
            if (c63120Opw == null) {
                return true;
            }
        }
        if (!c63120Opw.isMute() && (!C55888Lwa.LIZIZ.LJJI(true) || u.LJJII(c63120Opw))) {
            return true;
        }
        return false;
    }
}

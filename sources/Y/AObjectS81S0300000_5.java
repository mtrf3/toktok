package Y;

import X.BZI;
import X.C05170If;
import X.C28787BRn;
import X.C29306Beo;
import X.C31319CQx;
import X.C73933Szx;
import X.C73969T1h;
import X.C76800UCe;
import X.CQJ;
import X.CQK;
import X.CQO;
import X.CQQ;
import X.CRD;
import X.CSC;
import X.InterfaceC29856Bng;
import X.InterfaceC65784Pro;
import X.OSZ;
import X.Q7L;
import X.T16;
import android.app.Activity;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.emoji.EmoteWithIndex;
import com.bytedance.android.live.publicscreen.impl.api.PublicScreenApi;
import com.bytedance.android.livesdk.model.message.ChatMessage;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import defpackage.g0;
import java.util.List;

/* loaded from: classes6.dex */
public class AObjectS81S0300000_5 implements InterfaceC65784Pro {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS81S0300000_5 aObjectS81S0300000_5) {
        Object obj;
        String str;
        String str2;
        String LJJLIL;
        String str3;
        String str4;
        C31319CQx c31319CQx = (C31319CQx) aObjectS81S0300000_5.l0;
        CSC csc = (CSC) aObjectS81S0300000_5.l1;
        CQO cqo = (CQO) aObjectS81S0300000_5.l2;
        c31319CQx.getClass();
        long LJLILLLLZI = cqo.LJLILLLLZI();
        CQQ cqq = c31319CQx.LLIILZL;
        if (cqq != null && cqq.LJIIIIZZ != null) {
            String str5 = "anchor";
            if (csc.LJJLIIIJLLLLLLLZ()) {
                csc.LJJIZ(false);
                c31319CQx.LJLL(csc);
                BZI LIZ = C28787BRn.LIZ("livesdk_undo_translate_comment");
                LIZ.LJIILLIIL(c31319CQx.LLIILZL.LJIIIIZZ);
                if (!c31319CQx.LLIILZL.LJFF) {
                    str5 = "user";
                }
                LIZ.LJIJJ(str5, "user_type");
                LIZ.LJIJJ("undo_translate", "click_icon");
                LIZ.LJIJJ(Long.valueOf(LJLILLLLZI), "to_user_id");
                LIZ.LJJIIJZLJL();
            } else if (TextUtils.isEmpty(csc.LJJJLIIL())) {
                if (!csc.LJIIZILJ() && csc.LJJLIIIJLJLI()) {
                    csc.LJJIIJ(true);
                    c31319CQx.LJLLJ(csc);
                    StringBuilder sb = new StringBuilder();
                    String str6 = "";
                    if (!(cqo instanceof CQJ)) {
                        str3 = "";
                        str4 = "";
                    } else {
                        CQK cqk = (CQK) cqo;
                        str3 = C05170If.LJ(((ChatMessage) cqk.LJIJJLI).atUser);
                        str4 = C05170If.LIZLLL(((ChatMessage) cqk.LJIJJLI).atUser);
                        List<EmoteWithIndex> LLIFFJFJJ = cqk.LLIFFJFJJ();
                        for (int i = 0; i < LLIFFJFJJ.size(); i++) {
                            if (ListProtector.get(LLIFFJFJJ, i) != null) {
                                if (sb.length() != 0) {
                                    sb.append(",");
                                }
                                sb.append(((EmoteWithIndex) ListProtector.get(LLIFFJFJJ, i)).index);
                            }
                        }
                    }
                    PublicScreenApi publicScreenApi = (PublicScreenApi) Q7L.LIZIZ(PublicScreenApi.class);
                    if (csc.LJJLIIIJJIZ() != null) {
                        str6 = csc.LJJLIIIJJIZ().toString();
                    }
                    CQQ cqq2 = c31319CQx.LLIILZL;
                    ((InterfaceC29856Bng) publicScreenApi.translateComment(str6, cqq2.LJIILLIIL, cqq2.LJIIJJI, csc.getMessageId(), cqo.LJIJJLI.baseMessage.roomMessageHeatLevel, str3, str4, sb.toString()).LJJJ(C73969T1h.LIZIZ()).LJJL(T16.LIZ()).LIZJ(C73933Szx.LJ(c31319CQx.LLIILZL.LIZIZ))).LIZJ(new AfS0S0300100_5(LJLILLLLZI, csc, cqo, c31319CQx, 1), new AfS0S0300100_5(LJLILLLLZI, csc, cqo, c31319CQx, 2));
                    BZI LIZ2 = C28787BRn.LIZ("livesdk_translate_comment_click");
                    LIZ2.LJIILLIIL(c31319CQx.LLIILZL.LJIIIIZZ);
                    if (!c31319CQx.LLIILZL.LJFF) {
                        str5 = "user";
                    }
                    LIZ2.LJIJJ(str5, "user_type");
                    LIZ2.LJIJJ(Long.valueOf(LJLILLLLZI), "to_user_id");
                    LIZ2.LJJIIJZLJL();
                }
            } else {
                csc.LJJIZ(true);
                BZI LIZ3 = C28787BRn.LIZ("livesdk_translate_comment_click");
                LIZ3.LJIILLIIL(c31319CQx.LLIILZL.LJIIIIZZ);
                if (c31319CQx.LLIILZL.LJFF) {
                    obj = "anchor";
                } else {
                    obj = "user";
                }
                LIZ3.LJIJJ(obj, "user_type");
                LIZ3.LJIJJ(Long.valueOf(LJLILLLLZI), "to_user_id");
                LIZ3.LJJIIJZLJL();
                OSZ LJLL = c31319CQx.LJLL(csc);
                Activity LJIILJJIL = g0.LJIILJJIL(c31319CQx.LLIILZL.LIZ);
                BZI LIZ4 = C28787BRn.LIZ("livesdk_translate_comment");
                LIZ4.LJIILLIIL(c31319CQx.LLIILZL.LJIIIIZZ);
                if (!c31319CQx.LLIILZL.LJFF) {
                    str5 = "user";
                }
                LIZ4.LJIJJ(str5, "user_type");
                if (csc.LJJIIZI().LIZIZ) {
                    str = "pin_comment";
                } else {
                    str = "normal";
                }
                LIZ4.LJIJJ(str, "translate_type");
                if (((Boolean) LJLL.getSecond()).booleanValue()) {
                    str2 = "1";
                } else {
                    str2 = CardStruct.IStatusCode.DEFAULT;
                }
                LIZ4.LJIJJ(str2, "is_top");
                LIZ4.LJIJJ(Long.valueOf(cqo.LJIJJLI.getMessageId()), "message_id");
                LIZ4.LJIJJ(Long.valueOf(cqo.LJIILLIIL.LIZ), "message_release_id");
                LIZ4.LJIJJ(Long.valueOf(LJLILLLLZI), "to_user_id");
                if (LJIILJJIL == null) {
                    LJJLIL = "portrait";
                } else {
                    LJJLIL = C29306Beo.LJJLIL(Integer.valueOf(LJIILJJIL.getRequestedOrientation()));
                }
                LIZ4.LJIJJ(LJJLIL, "room_orientation");
                LIZ4.LJJIIJZLJL();
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AObjectS81S0300000_5 aObjectS81S0300000_5) {
        ((C31319CQx) aObjectS81S0300000_5.l0).LJLLILLLL((ChatMessage) aObjectS81S0300000_5.l1, (CRD) aObjectS81S0300000_5.l2);
        return C76800UCe.LIZ;
    }

    public AObjectS81S0300000_5(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}

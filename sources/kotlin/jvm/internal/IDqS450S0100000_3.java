package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C176996x5;
import X.C177336xd;
import X.C178406zM;
import X.C1794072i;
import X.C1799274i;
import X.C186227So;
import X.C191707fi;
import X.C199627sU;
import X.C224748ru;
import X.C31811Ce7;
import X.C76800UCe;
import X.C79234V7u;
import X.C84G;
import X.InterfaceC199637sV;
import X.InterfaceC88474Ynu;
import X.O6R;
import X.OSZ;
import X.S1E;
import X.S1T;
import X.X1D;
import android.graphics.Bitmap;
import android.text.Editable;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.CommentMentionAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.topic.ui.TopicDescRatingAssem;
import com.zhiliaoapp.musically.R;

/* loaded from: classes4.dex */
public class IDqS450S0100000_3 extends AbstractC65781Prl implements InterfaceC88474Ynu {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC88474Ynu
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3, obj4);
            case 1:
                return invoke$1(this, obj, obj2, obj3, obj4);
            case 2:
                return invoke$2(this, obj, obj2, obj3, obj4);
            case 3:
                return invoke$3(this, obj, obj2, obj3, obj4);
            case 4:
                return invoke$4(this, obj, obj2, obj3, obj4);
            case 5:
                return invoke$5(this, obj, obj2, obj3, obj4);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS450S0100000_3(C199627sU c199627sU, int i) {
        super(4);
        this.$t = i;
        this.l0 = c199627sU;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS450S0100000_3(InterfaceC199637sV interfaceC199637sV, int i) {
        super(4);
        this.$t = i;
        this.l0 = interfaceC199637sV;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS450S0100000_3(S1E s1e, int i) {
        super(4);
        this.$t = i;
        this.l0 = s1e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS450S0100000_3(CommentMentionAssem commentMentionAssem, int i) {
        super(4);
        this.$t = i;
        this.l0 = commentMentionAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS450S0100000_3(TopicDescRatingAssem topicDescRatingAssem, int i) {
        super(4);
        this.$t = i;
        this.l0 = topicDescRatingAssem;
    }

    public static final Object invoke$0(IDqS450S0100000_3 iDqS450S0100000_3, Object selectSubscribe, Object obj, Object obj2, Object obj3) {
        float floatValue = ((Number) obj).floatValue();
        long longValue = ((Number) obj2).longValue();
        ((Number) obj3).longValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        C84G c84g = ((TopicDescRatingAssem) iDqS450S0100000_3.l0).LJLL;
        if (c84g != null) {
            c84g.setRatingValue(floatValue);
            TuxTextView tuxTextView = ((TopicDescRatingAssem) iDqS450S0100000_3.l0).LJLLI;
            if (tuxTextView != null) {
                tuxTextView.setText(String.valueOf(O6R.LJJIIZ(floatValue * 10) / 10.0f));
                TuxTextView tuxTextView2 = ((TopicDescRatingAssem) iDqS450S0100000_3.l0).LJLLILLLL;
                if (tuxTextView2 != null) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append('(');
                    LIZ.append(longValue);
                    LIZ.append(')');
                    tuxTextView2.setText(X1D.LIZIZ(LIZ));
                    TopicDescRatingAssem topicDescRatingAssem = (TopicDescRatingAssem) iDqS450S0100000_3.l0;
                    if (topicDescRatingAssem.LJLLJ) {
                        ((AssemViewModel) topicDescRatingAssem.LJLJLLL.getValue()).setState(C186227So.LJLIL);
                        ((TopicDescRatingAssem) iDqS450S0100000_3.l0).LJLLJ = false;
                    }
                    return C76800UCe.LIZ;
                }
                o.LJIJI("ratingCount");
                throw null;
            }
            o.LJIJI("ratingText");
            throw null;
        }
        o.LJIJI("ratingBar");
        throw null;
    }

    public static final Object invoke$1(IDqS450S0100000_3 iDqS450S0100000_3, Object obj, Object obj2, Object obj3, Object obj4) {
        String str;
        Fragment LJIIIZ;
        String str2;
        String str3;
        String str4;
        Aweme aweme;
        Integer num;
        Aweme aweme2;
        Aweme aweme3;
        User user = (User) obj;
        int intValue = ((Number) obj2).intValue();
        String str5 = (String) obj3;
        boolean booleanValue = ((Boolean) obj4).booleanValue();
        CommentMentionAssem commentMentionAssem = (CommentMentionAssem) iDqS450S0100000_3.l0;
        boolean z = true;
        String str6 = null;
        Aweme aweme4 = null;
        if (booleanValue) {
            C224748ru c224748ru = commentMentionAssem.LJLJJI;
            if (c224748ru != null) {
                Editable text = c224748ru.getText();
                int selectionStart = c224748ru.getSelectionStart();
                String LIZIZ = commentMentionAssem.x3().LIZIZ(selectionStart, c224748ru.getText(), false);
                if (LIZIZ == null || LIZIZ.length() == 0) {
                    LIZIZ = "";
                }
                if (text != null) {
                    text.delete(selectionStart - LIZIZ.length(), selectionStart);
                }
                if (user != null) {
                    C177336xd C3 = commentMentionAssem.C3();
                    if (C3 != null) {
                        str = C3.LJLJL;
                    } else {
                        str = null;
                    }
                    String LJ = C1799274i.LJ(user, str);
                    C224748ru c224748ru2 = commentMentionAssem.LJLJJI;
                    if (c224748ru2 != null) {
                        if (LJ.length() + c224748ru2.length() > C176996x5.LJJI(false)) {
                            Fragment LJIIIZ2 = C79234V7u.LJIIIZ(c224748ru);
                            if (LJIIIZ2 != null) {
                                C31811Ce7.LIZJ(LJIIIZ2, R.string.cm8);
                            }
                        }
                    }
                    String uid = user.getUid();
                    o.LJIIIIZZ(uid, "user.uid");
                    String secUid = user.getSecUid();
                    o.LJIIIIZZ(secUid, "user.secUid");
                    C224748ru c224748ru3 = commentMentionAssem.LJLJJI;
                    if (c224748ru3 == null || !c224748ru3.LJI(LJ, uid, secUid)) {
                        if (c224748ru.getContext() != null && (LJIIIZ = C79234V7u.LJIIIZ(c224748ru)) != null) {
                            C31811Ce7.LIZJ(LJIIIZ, R.string.bnk);
                        }
                    } else {
                        C177336xd C32 = commentMentionAssem.C3();
                        if (C32 != null) {
                            str2 = C32.LJLJJLL;
                        } else {
                            str2 = null;
                        }
                        C177336xd C33 = commentMentionAssem.C3();
                        if (C33 != null && (aweme3 = C33.LJLLI) != null) {
                            str3 = aweme3.getAid();
                        } else {
                            str3 = null;
                        }
                        C177336xd C34 = commentMentionAssem.C3();
                        if (C34 != null && (aweme2 = C34.LJLLI) != null) {
                            str4 = aweme2.getAuthorUid();
                        } else {
                            str4 = null;
                        }
                        C177336xd C35 = commentMentionAssem.C3();
                        if (C35 != null) {
                            aweme = C35.LJLLI;
                        } else {
                            aweme = null;
                        }
                        String LJIIIZ3 = C178406zM.LJIIIZ(aweme);
                        Integer valueOf = Integer.valueOf(LIZIZ.length());
                        String nickname = user.getNickname();
                        if (nickname != null) {
                            num = Integer.valueOf(nickname.length());
                        } else {
                            num = null;
                        }
                        int i = intValue + 1;
                        String uid2 = user.getUid();
                        int followStatus = user.getFollowStatus();
                        C177336xd C36 = commentMentionAssem.C3();
                        if (C36 != null) {
                            aweme4 = C36.LJLLI;
                        }
                        C1794072i.LJ(str2, str3, str4, LJIIIZ3, valueOf, num, i, LIZIZ, uid2, str5, followStatus, aweme4);
                    }
                }
            }
            z = false;
        } else {
            C224748ru c224748ru4 = commentMentionAssem.LJLJJI;
            if (c224748ru4 != null) {
                if (user != null) {
                    str6 = user.getUid();
                }
                c224748ru4.LJIIIIZZ(str6);
            }
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$2(IDqS450S0100000_3 iDqS450S0100000_3, Object obj, Object obj2, Object obj3, Object obj4) {
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        int intValue3 = ((Number) obj3).intValue();
        int intValue4 = ((Number) obj4).intValue();
        S1E s1e = (S1E) iDqS450S0100000_3.l0;
        if (s1e instanceof S1T) {
            ((S1T) s1e).LJJJJJ(intValue, intValue2, 0, intValue3, intValue4, 0);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(IDqS450S0100000_3 iDqS450S0100000_3, Object obj, Object obj2, Object obj3, Object obj4) {
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        int intValue3 = ((Number) obj3).intValue();
        int intValue4 = ((Number) obj4).intValue();
        S1E s1e = (S1E) iDqS450S0100000_3.l0;
        if (s1e instanceof S1T) {
            ((S1T) s1e).LJJJJJ(intValue, intValue2, 0, intValue3, intValue4, 0);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(IDqS450S0100000_3 iDqS450S0100000_3, Object obj, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        C191707fi topMarker = (C191707fi) obj2;
        OSZ anchor = (OSZ) obj3;
        Bitmap bitmap = (Bitmap) obj4;
        o.LJIIIZ(topMarker, "topMarker");
        o.LJIIIZ(anchor, "anchor");
        o.LJIIIZ(bitmap, "bitmap");
        C199627sU c199627sU = (C199627sU) iDqS450S0100000_3.l0;
        c199627sU.LJ = topMarker.LIZJ().floatValue();
        c199627sU.LIZ = bitmap;
        float floatValue = ((Number) anchor.getFirst()).floatValue();
        float floatValue2 = ((Number) anchor.getSecond()).floatValue();
        c199627sU.LIZLLL = floatValue;
        c199627sU.LIZJ = floatValue2;
        String title = String.valueOf(booleanValue);
        o.LJIIIZ(title, "title");
        c199627sU.LIZIZ = title;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(IDqS450S0100000_3 iDqS450S0100000_3, Object obj, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        C191707fi topMarker = (C191707fi) obj2;
        OSZ anchor = (OSZ) obj3;
        Bitmap bitmap = (Bitmap) obj4;
        o.LJIIIZ(topMarker, "topMarker");
        o.LJIIIZ(anchor, "anchor");
        o.LJIIIZ(bitmap, "bitmap");
        InterfaceC199637sV interfaceC199637sV = (InterfaceC199637sV) iDqS450S0100000_3.l0;
        interfaceC199637sV.LIZ(topMarker.LIZJ().floatValue());
        interfaceC199637sV.LIZLLL(bitmap);
        interfaceC199637sV.LIZIZ(((Number) anchor.getFirst()).floatValue(), ((Number) anchor.getSecond()).floatValue());
        interfaceC199637sV.LIZJ(Boolean.valueOf(booleanValue));
        return C76800UCe.LIZ;
    }
}

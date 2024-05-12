package X;

import android.text.Editable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.views.mention.MentionEditText$MentionSpan;
import com.ss.android.ugc.now.interaction.NowFeedMobHierarchyData;
import com.ss.android.ugc.now.interaction.assem.NowCommentMentionAssem;
import com.zhiliaoapp.musically.R;
import defpackage.i0;
import java.util.Arrays;
import kotlin.jvm.internal.o;

/* renamed from: X.70V, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C70V extends AbstractC65781Prl implements InterfaceC88474Ynu<User, Integer, String, Boolean, Boolean> {
    public final /* synthetic */ NowCommentMentionAssem LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C70V(NowCommentMentionAssem nowCommentMentionAssem) {
        super(4);
        this.LJLIL = nowCommentMentionAssem;
    }

    @Override // X.InterfaceC88474Ynu
    public final Boolean invoke(User user, Integer num, String str, Boolean bool) {
        String str2;
        boolean z;
        Fragment LJIIIZ;
        String str3;
        String str4;
        String str5;
        Integer num2;
        User user2 = user;
        int intValue = num.intValue();
        String str6 = str;
        boolean booleanValue = bool.booleanValue();
        NowCommentMentionAssem nowCommentMentionAssem = this.LJLIL;
        int i = 0;
        if (booleanValue) {
            C224738rt c224738rt = nowCommentMentionAssem.LJLJJL;
            if (c224738rt != null) {
                Editable text = c224738rt.getText();
                int selectionStart = c224738rt.getSelectionStart();
                String LIZIZ = nowCommentMentionAssem.LJLJJI.LIZIZ(selectionStart, c224738rt.getText(), false);
                if (LIZIZ == null || LIZIZ.length() == 0) {
                    LIZIZ = "";
                }
                if (text != null) {
                    text.delete(selectionStart - LIZIZ.length(), selectionStart);
                }
                if (user2 != null) {
                    String LIZLLL = AV1.LIZLLL(user2);
                    o.LJIIIIZZ(LIZLLL, "getHandle(user)");
                    String uid = user2.getUid();
                    o.LJIIIIZZ(uid, "user.uid");
                    String secUid = user2.getSecUid();
                    o.LJIIIIZZ(secUid, "user.secUid");
                    C224738rt c224738rt2 = nowCommentMentionAssem.LJLJJL;
                    if (c224738rt2 != null) {
                        int selectionStart2 = c224738rt2.getSelectionStart();
                        Editable text2 = c224738rt2.getText();
                        if (text2 != null) {
                            SpannableString spannableString = new SpannableString(i0.LJFF("@", LIZLLL));
                            MentionEditText$MentionSpan mentionEditText$MentionSpan = new MentionEditText$MentionSpan(spannableString.toString(), uid, c224738rt2.LJLJL, 0, "", secUid);
                            spannableString.setSpan(mentionEditText$MentionSpan, 0, spannableString.length(), 33);
                            if (c224738rt2.LJLJLJ != 0) {
                                spannableString.setSpan(new StyleSpan(c224738rt2.LJLJLJ), 0, spannableString.length(), 33);
                            }
                            MentionEditText$MentionSpan[] mentionText = c224738rt2.getMentionText();
                            if (mentionText == null || !Arrays.asList(mentionText).contains(mentionEditText$MentionSpan)) {
                                if (TextUtils.isEmpty(text2)) {
                                    text2.insert(0, spannableString);
                                    text2.append((CharSequence) " ");
                                } else {
                                    int length = text2.length();
                                    if (selectionStart2 <= length && selectionStart2 >= 0) {
                                        if (selectionStart2 > 0) {
                                            int i2 = selectionStart2 - 1;
                                            if (TextUtils.equals(text2.subSequence(i2, selectionStart2), "@")) {
                                                text2.delete(i2, selectionStart2);
                                                length--;
                                                selectionStart2 = i2;
                                            }
                                        }
                                        int min = Math.min(length, Math.max(0, selectionStart2));
                                        text2.insert(min, spannableString);
                                        text2.insert(Math.min(spannableString.length() + min, text2.length()), " ");
                                    }
                                }
                                NowFeedMobHierarchyData nowFeedMobHierarchyData = nowCommentMentionAssem.x3().LJLJJL;
                                if (nowFeedMobHierarchyData != null) {
                                    str3 = nowFeedMobHierarchyData.getEnterFrom();
                                } else {
                                    str3 = null;
                                }
                                Aweme aweme = nowCommentMentionAssem.x3().LJLIL;
                                if (aweme != null) {
                                    str4 = aweme.getAid();
                                } else {
                                    str4 = null;
                                }
                                Aweme aweme2 = nowCommentMentionAssem.x3().LJLIL;
                                if (aweme2 != null) {
                                    str5 = aweme2.getAuthorUid();
                                } else {
                                    str5 = null;
                                }
                                String LJIIIZ2 = C178406zM.LJIIIZ(nowCommentMentionAssem.x3().LJLIL);
                                Integer valueOf = Integer.valueOf(LIZIZ.length());
                                String nickname = user2.getNickname();
                                if (nickname != null) {
                                    num2 = Integer.valueOf(nickname.length());
                                } else {
                                    num2 = null;
                                }
                                C1794072i.LJ(str3, str4, str5, LJIIIZ2, valueOf, num2, intValue + 1, LIZIZ, user2.getUid(), str6, user2.getFollowStatus(), nowCommentMentionAssem.x3().LJLIL);
                            }
                        }
                    }
                    if (c224738rt.getContext() != null && (LJIIIZ = C79234V7u.LJIIIZ(c224738rt)) != null) {
                        C31811Ce7.LIZJ(LJIIIZ, R.string.bnk);
                    }
                }
            }
            z = false;
            return Boolean.valueOf(z);
        }
        C224738rt c224738rt3 = nowCommentMentionAssem.LJLJJL;
        if (c224738rt3 != null) {
            if (user2 != null) {
                str2 = user2.getUid();
            } else {
                str2 = null;
            }
            MentionEditText$MentionSpan[] mentionText2 = c224738rt3.getMentionText();
            if (mentionText2 != null && !TextUtils.isEmpty(str2)) {
                int length2 = mentionText2.length;
                while (true) {
                    if (i >= length2) {
                        break;
                    }
                    MentionEditText$MentionSpan mentionEditText$MentionSpan2 = mentionText2[i];
                    if (TextUtils.equals(str2, mentionEditText$MentionSpan2.mId)) {
                        int end = mentionEditText$MentionSpan2.mStruct.getEnd();
                        int i3 = end + 1;
                        if (i3 <= c224738rt3.getEditableText().length() && ' ' == c224738rt3.getEditableText().charAt(end)) {
                            end = i3;
                        }
                        c224738rt3.getEditableText().delete(mentionEditText$MentionSpan2.mStruct.getStart(), end);
                    } else {
                        i++;
                    }
                }
            }
        }
        z = true;
        return Boolean.valueOf(z);
    }
}

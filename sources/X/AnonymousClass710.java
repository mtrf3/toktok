package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.comment.commentlist.CommentListFragment;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentReplyListItem;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import kotlin.jvm.internal.o;

/* renamed from: X.710, reason: invalid class name */
/* loaded from: classes4.dex */
public final class AnonymousClass710 {
    public static final /* synthetic */ int LIZ = 0;

    public static final String LIZJ(Comment comment) {
        int i;
        boolean z;
        o.LJIIIZ(comment, "comment");
        int i2 = 0;
        String LIZIZ = C1799274i.LIZIZ(comment, false);
        if (TextUtils.isEmpty(LIZIZ)) {
            return "";
        }
        boolean[] zArr = new boolean[LIZIZ.length()];
        if (comment.getTextExtra() != null) {
            for (TextExtraStruct textExtraStruct : comment.getTextExtra()) {
                if (textExtraStruct.getType() != 6) {
                    int start = textExtraStruct.getStart();
                    if (start <= 0) {
                        start = 0;
                    }
                    int length = LIZIZ.length();
                    int end = textExtraStruct.getEnd();
                    if (length > end) {
                        length = end;
                    }
                    while (start < length) {
                        zArr[start] = true;
                        start++;
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        int length2 = LIZIZ.length();
        for (int i3 = 0; i3 < length2; i3++) {
            if (!zArr[i3]) {
                sb.append(LIZIZ.charAt(i3));
            }
        }
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "content.toString()");
        int length3 = sb2.length() - 1;
        int i4 = 0;
        boolean z2 = false;
        while (i4 <= length3) {
            if (!z2) {
                i = i4;
            } else {
                i = length3;
            }
            if (o.LJIIJJI(sb2.charAt(i), 32) <= 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z2) {
                if (!z) {
                    z2 = true;
                } else {
                    i4++;
                }
            } else {
                if (!z) {
                    break;
                }
                length3--;
            }
        }
        String charSequence = sb2.subSequence(i4, length3 + 1).toString();
        Matcher matcher = AnonymousClass714.LIZ.matcher(charSequence);
        StringBuilder sb3 = new StringBuilder(charSequence);
        while (matcher.find()) {
            int start2 = matcher.start() + i2;
            int end2 = matcher.end() + i2;
            if (AnonymousClass714.LIZJ.LIZJ(matcher.group())) {
                sb3.insert(start2, "<no_trans>");
                sb3.insert(end2 + 10, "</no_trans>");
                i2 += 21;
            }
        }
        return sb3.toString();
    }

    public static final boolean LIZLLL(Comment comment) {
        o.LJIIIZ(comment, "comment");
        if (!C174996tr.LIZ() || comment.getTransBtnStyle() != 1 || LIZIZ(comment, false)) {
            return false;
        }
        return true;
    }

    public static final void LIZ(Comment originalComment, String translatedResult) {
        o.LJIIIZ(originalComment, "originalComment");
        o.LJIIIZ(translatedResult, "translatedResult");
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(AnonymousClass714.LIZ(translatedResult));
        LIZ2.append(' ');
        String LIZIZ = X1D.LIZIZ(LIZ2);
        sb.append(String.valueOf(LIZIZ));
        if (originalComment.getTextExtra() != null) {
            int size = originalComment.getTextExtra().size();
            for (int i = 0; i < size; i++) {
                TextExtraStruct textExtraStruct = (TextExtraStruct) ListProtector.get(originalComment.getTextExtra(), i);
                if (textExtraStruct.getType() != 6) {
                    int start = textExtraStruct.getStart();
                    if (start < 0) {
                        start = 0;
                    }
                    int length = C1799274i.LIZLLL(originalComment).length();
                    if (start > length) {
                        start = length;
                    }
                    int end = textExtraStruct.getEnd();
                    int length2 = C1799274i.LIZLLL(originalComment).length();
                    if (end > length2) {
                        end = length2;
                    }
                    StringBuilder LIZ3 = X1D.LIZ();
                    String substring = C1799274i.LIZLLL(originalComment).substring(start, end);
                    o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    LIZ3.append(substring);
                    LIZ3.append(' ');
                    String LIZIZ2 = X1D.LIZIZ(LIZ3);
                    sb.append(LIZIZ2);
                    TextExtraStruct m142clone = textExtraStruct.m142clone();
                    o.LJIIIIZZ(m142clone, "textExtraStruct.clone()");
                    int length3 = LIZIZ2.length();
                    if (i == 0) {
                        m142clone.setStart(LIZIZ.length());
                    } else {
                        m142clone.setStart(((TextExtraStruct) ListProtector.get(arrayList, i - 1)).getEnd() + 1);
                    }
                    m142clone.setEnd((m142clone.getStart() + length3) - 1);
                    arrayList.add(m142clone);
                }
            }
        }
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "resultSb.toString()");
        originalComment.setText(sb2);
        originalComment.setTextExtra(arrayList);
    }

    public static final boolean LIZIZ(Comment comment, boolean z) {
        o.LJIIIZ(comment, "comment");
        if (TextUtils.isEmpty(LIZJ(comment)) || TextUtils.equals(Comment.getAuthorUid(comment), HG3.LJIILL().getCurUserId())) {
            return true;
        }
        if (comment.getAliasAweme() != null && !z) {
            return true;
        }
        return false;
    }

    public static final InterfaceC176226vq LJ(C76S c76s, AnonymousClass711 anonymousClass711, final InterfaceC1797373p internalListener, final boolean z, final Comment comment, final C176216vp translationBlock, Context context) {
        o.LJIIIZ(internalListener, "internalListener");
        o.LJIIIZ(comment, "comment");
        o.LJIIIZ(translationBlock, "translationBlock");
        o.LJIIIZ(context, "context");
        if (C174996tr.LIZ() && anonymousClass711 != null) {
            C78886Uxe.LJJLIIIJJI(anonymousClass711);
            C1799274i.LIZ(anonymousClass711, O6R.LJJIIZ(C32151Nz.LJIIZILJ(4)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(4)));
            if (LIZLLL(comment)) {
                AnonymousClass712 anonymousClass712 = new AnonymousClass712();
                anonymousClass712.LIZIZ = context.getString(R.string.dm8);
                anonymousClass712.LIZJ = context.getString(R.string.qfr);
                anonymousClass712.LIZ = comment;
                anonymousClass711.LIZJ(anonymousClass712);
                C88463da.LIZJ(C88463da.LIZ, anonymousClass711, EnumC1796673i.BUTTON, 0.0f, 12);
                anonymousClass711.setOnClickListener(new ViewOnClickListenerC13880ga(new View.OnClickListener() { // from class: X.6tS
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        List<Comment> list;
                        InterfaceC1797373p interfaceC1797373p = InterfaceC1797373p.this;
                        Comment comment2 = comment;
                        InterfaceC174756tT interfaceC174756tT = translationBlock;
                        boolean z2 = z;
                        boolean isTranslated = comment2.isTranslated();
                        CommentListFragment commentListFragment = (CommentListFragment) interfaceC1797373p;
                        if (z2) {
                            CommentReplyListItem LJII = commentListFragment.LLIZLLLIL.LJII(comment2.getCid());
                            if (LJII != null) {
                                list = LJII.mReplyComments;
                            } else {
                                list = null;
                            }
                            if (isTranslated) {
                                interfaceC174756tT.resetTranslatedMultiComment(list);
                            } else {
                                interfaceC174756tT.translateMultiWithReplyComment(list);
                            }
                        } else {
                            commentListFragment.getClass();
                            if (isTranslated) {
                                interfaceC174756tT.resetTranslate();
                            } else {
                                interfaceC174756tT.translate();
                            }
                        }
                        int LJ = C178406zM.LJ(commentListFragment.LLIZLLLIL, comment2);
                        if (isTranslated) {
                            C74Z.LJJIJIL(comment2, "translate", commentListFragment.LJLILLLLZI.getEnterFrom(), LJ, commentListFragment.LJLJI);
                        } else {
                            commentListFragment.LLJILJIL.LJLJI = true;
                            C74Z.LJJIJL(comment2, "translate", commentListFragment.LJLILLLLZI.getEnterFrom(), LJ, commentListFragment.LJLJI);
                        }
                    }
                }));
            } else {
                C78886Uxe.LJJLIIIJILLIZJL(anonymousClass711);
            }
            return anonymousClass711;
        }
        return c76s;
    }
}

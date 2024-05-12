package X;

import Y.ARunnableS0S0204000_3;
import Y.IDComparatorS31S0000000_3;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.commercialize.model.CommentStruct;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import defpackage.i0;
import defpackage.s1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.74i, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1799274i {
    public static final String LIZLLL(Comment comment) {
        String str = "";
        if (TextUtils.isEmpty(comment.getForwardId())) {
            String text = comment.getText();
            if (text == null) {
                return "";
            }
            return text;
        }
        String LIZLLL = C1DD.LIZLLL(R.string.glk, "AppContextManager.getApp…tString(R.string.forward)");
        String text2 = comment.getText();
        if (text2 != null && text2.length() != 0) {
            LIZLLL = i0.LJFF(LIZLLL, " • ");
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(LIZLLL);
        String text3 = comment.getText();
        if (text3 != null) {
            str = text3;
        }
        LIZ.append(str);
        return X1D.LIZIZ(LIZ);
    }

    public static final String LJFF(Comment comment) {
        o.LJIIIZ(comment, "<this>");
        if (C176536wL.LIZ().LIZ) {
            if (TextUtils.isEmpty(comment.getTimeFormat())) {
                comment.setTimeFormat(LJII(comment));
            }
            String timeFormat = comment.getTimeFormat();
            o.LJIIIIZZ(timeFormat, "timeFormat");
            return timeFormat;
        }
        return LJII(comment);
    }

    public static final String LJI(CommentStruct commentStruct) {
        String LIZIZ;
        if (TextUtils.isEmpty(commentStruct.mTimeDesc)) {
            if (e1.LIZ(31744, "standardize_timestamp", true, false)) {
                LIZIZ = QZP.LIZIZ("(.)", C86036Xpg.LIZIZ(commentStruct.getCommentTime() * 1000), "$1\u2060");
            } else {
                String LIZJ = C57105Mb7.LIZJ(commentStruct.getCommentTime() * 1000, EF7.LIZIZ());
                o.LJIIIIZZ(LIZJ, "formatCreateTimeDesc(\n  …me * 1000L,\n            )");
                LIZIZ = QZP.LIZIZ("(.)", LIZJ, "$1\u2060");
            }
            commentStruct.mTimeDesc = LIZIZ;
        }
        String mTimeDesc = commentStruct.mTimeDesc;
        o.LJIIIIZZ(mTimeDesc, "mTimeDesc");
        return mTimeDesc;
    }

    public static final String LJII(Comment comment) {
        o.LJIIIZ(comment, "<this>");
        FFL.LJIIIZ().getClass();
        if (FFL.LJ(31744, "standardize_timestamp", true, false)) {
            return C86036Xpg.LIZIZ(comment.getCreateTime() * 1000);
        }
        Context LJIIIIZZ = C84763XOl.LJIIIIZZ();
        if (LJIIIIZZ == null) {
            LJIIIIZZ = EF7.LIZIZ();
        }
        String LIZJ = C57105Mb7.LIZJ(comment.getCreateTime() * 1000, LJIIIIZZ);
        o.LJIIIIZZ(LIZJ, "{\n        //false 使用老的\n … * 1000L,\n        )\n    }");
        return LIZJ;
    }

    public static final String LIZIZ(Comment comment, boolean z) {
        List<TextExtraStruct> textExtra;
        o.LJIIIZ(comment, "<this>");
        String text = comment.getText();
        if (text == null) {
            text = "";
        }
        StringBuilder sb = new StringBuilder(text);
        if (C8DR.LIZ() && (textExtra = comment.getTextExtra()) != null && !textExtra.isEmpty()) {
            List<TextExtraStruct> textExtra2 = comment.getTextExtra();
            ArrayList LIZIZ = s1.LIZIZ(textExtra2, "textExtra");
            for (TextExtraStruct textExtraStruct : textExtra2) {
                if (textExtraStruct.getType() == 6) {
                    LIZIZ.add(textExtraStruct);
                }
            }
            Iterator it = ORZ.LLILII(new IDComparatorS31S0000000_3(7), LIZIZ).iterator();
            int i = 0;
            while (it.hasNext()) {
                sb.insert(sb.offsetByCodePoints(0, ((TextExtraStruct) it.next()).getEnd() + i), "\u200b");
                i++;
            }
        }
        if (!TextUtils.isEmpty(comment.getForwardId())) {
            String LIZLLL = C1DD.LIZLLL(R.string.glk, "AppContextManager.getApp…tString(R.string.forward)");
            String text2 = comment.getText();
            if (text2 != null && text2.length() != 0) {
                LIZLLL = i0.LJFF(LIZLLL, " • ");
            }
            sb.insert(0, LIZLLL);
        }
        if ((comment.getCommentType() == 1 || V16.LJJIZ(comment)) && comment.isAuthorPin()) {
            sb.insert(0, "\u200b");
        }
        if (z) {
            sb.append(" ");
            sb.append(LJFF(comment));
        }
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "builder.toString()");
        return sb2;
    }

    public static final String LJ(User user, String str) {
        if (user == null) {
            return "";
        }
        boolean LJ = o.LJ(str, "homepage_friends");
        StringBuilder LIZLLL = C00F.LIZLLL("getMainNameInComment isSocial->", LJ, " regionDiff->", true, " eventType->");
        LIZLLL.append(str);
        C71Y.LIZ("CommentHelper", X1D.LIZIZ(LIZLLL));
        if (str == null || str.length() == 0) {
        }
        return C56331M8x.LIZIZ(user, LJ, true);
    }

    public static final void LIZ(View view, int i, int i2) {
        View view2;
        if (view == null) {
            return;
        }
        Object parent = view.getParent();
        if ((parent instanceof View) && (view2 = (View) parent) != null) {
            view2.post(new ARunnableS0S0204000_3(view, i, i2, view2, 1));
        }
    }

    public static final List<TextExtraStruct> LIZJ(Comment comment, Context context, boolean z) {
        ArrayList arrayList;
        String str;
        o.LJIIIZ(comment, "<this>");
        o.LJIIIZ(context, "context");
        if (comment.getTextExtra() != null) {
            arrayList = new ArrayList(comment.getTextExtra().size());
            Iterator<TextExtraStruct> it = comment.getTextExtra().iterator();
            while (it.hasNext()) {
                TextExtraStruct m142clone = it.next().m142clone();
                o.LJIIIIZZ(m142clone, "textExtraStruct.clone()");
                arrayList.add(m142clone);
            }
        } else {
            arrayList = new ArrayList();
        }
        String text = comment.getText();
        if (!z) {
            TextExtraStruct textExtraStruct = new TextExtraStruct();
            textExtraStruct.setType(65281);
            int LJJIFFI = C78886Uxe.LJJIFFI(R.attr.gs, R.color.cq, context);
            String LJFF = LJFF(comment);
            String str2 = "";
            if (text == null) {
                str = "";
            } else {
                str = text;
            }
            int length = str.length() + 1;
            if (text != null) {
                str2 = text;
            }
            int LIZ = C1FL.LIZ(LJFF, str2.length(), 1);
            textExtraStruct.setCustomSpan(new C8F6(C17N.LJJJLL(13.0d), LJJIFFI));
            textExtraStruct.setStart(length);
            textExtraStruct.setEnd(LIZ);
            arrayList.add(textExtraStruct);
        }
        int i = 0;
        if (!TextUtils.isEmpty(comment.getForwardId())) {
            String string = context.getString(R.string.glk);
            o.LJIIIIZZ(string, "context.getString(R.string.forward)");
            if (text != null && text.length() != 0) {
                string = i0.LJFF(string, " • ");
            }
            int length2 = string.length();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                TextExtraStruct textExtraStruct2 = (TextExtraStruct) it2.next();
                textExtraStruct2.setStart(textExtraStruct2.getStart() + length2);
                textExtraStruct2.setEnd(textExtraStruct2.getEnd() + length2);
                textExtraStruct2.setUserId(textExtraStruct2.getUserId());
            }
        }
        if (C8DR.LIZ()) {
            int i2 = 0;
            for (TextExtraStruct textExtraStruct3 : ORZ.LLILII(new IDComparatorS31S0000000_3(8), ORZ.LLJI(arrayList))) {
                if (textExtraStruct3.getType() == 6) {
                    o.LJIIIIZZ(text, "text");
                    textExtraStruct3.setStart(text.offsetByCodePoints(0, textExtraStruct3.getStart()) + i2);
                    textExtraStruct3.setEnd(text.offsetByCodePoints(0, textExtraStruct3.getEnd()) + i2);
                    if (((Number) C52579KkJ.LIZ.getValue()).intValue() == 1) {
                        textExtraStruct3.setBoldText(false);
                    } else {
                        textExtraStruct3.setBoldText(true);
                    }
                } else {
                    textExtraStruct3.setStart(textExtraStruct3.getStart() + i2);
                    textExtraStruct3.setEnd(textExtraStruct3.getEnd() + i2);
                }
                if (textExtraStruct3.getType() == 6) {
                    i2++;
                }
            }
        }
        if ((comment.getCommentType() == 1 || V16.LJJIZ(comment)) && comment.isAuthorPin()) {
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                Object next = it3.next();
                int i3 = i + 1;
                if (i >= 0) {
                    TextExtraStruct textExtraStruct4 = (TextExtraStruct) next;
                    if (i != 0) {
                        textExtraStruct4.setStart(textExtraStruct4.getStart() + 1);
                        textExtraStruct4.setEnd(textExtraStruct4.getEnd() + 1);
                    }
                    i = i3;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
        }
        return arrayList;
    }
}

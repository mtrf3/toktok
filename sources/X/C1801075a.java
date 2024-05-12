package X;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.comment.experiment.PersonalizedEmojiExperiment;
import com.ss.android.ugc.aweme.comment.widgets.CommentEditText$MentionSpan;
import com.ss.android.ugc.aweme.comment.widgets.CommentEmojiSpan;
import com.ss.android.ugc.aweme.feed.model.CommentPersonalizedEmoji;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.o;

/* renamed from: X.75a, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1801075a {
    public static final Pattern LIZ = PatternProtector.compile("(?:[\\uD83C\\uDF00-\\uD83D\\uDDFF]|[\\uD83E\\uDD00-\\uD83E\\uDDFF]|[\\uD83D\\uDE00-\\uD83D\\uDE4F]|[\\uD83D\\uDE80-\\uD83D\\uDEFF]|[\\u2600-\\u26FF]\\uFE0F?|[\\u2700-\\u27BF]\\uFE0F?|\\u24C2\\uFE0F?|[\\uD83C\\uDDE6-\\uD83C\\uDDFF]{1,2}|[\\uD83C\\uDD70\\uD83C\\uDD71\\uD83C\\uDD7E\\uD83C\\uDD7F\\uD83C\\uDD8E\\uD83C\\uDD91-\\uD83C\\uDD9A]\\uFE0F?|[\\u0023\\u002A\\u0030-\\u0039]\\uFE0F?\\u20E3|[\\u2194-\\u2199\\u21A9-\\u21AA]\\uFE0F?|[\\u2B05-\\u2B07\\u2B1B\\u2B1C\\u2B50\\u2B55]\\uFE0F?|[\\u2934\\u2935]\\uFE0F?|[\\u3030\\u303D]\\uFE0F?|[\\u3297\\u3299]\\uFE0F?|[\\uD83C\\uDE01\\uD83C\\uDE02\\uD83C\\uDE1A\\uD83C\\uDE2F\\uD83C\\uDE32-\\uD83C\\uDE3A\\uD83C\\uDE50\\uD83C\\uDE51]\\uFE0F?|[\\u203C\\u2049]\\uFE0F?|[\\u25AA\\u25AB\\u25B6\\u25C0\\u25FB-\\u25FE]\\uFE0F?|[\\u00A9\\u00AE]\\uFE0F?|[\\u2122\\u2139]\\uFE0F?|\\uD83C\\uDC04\\uFE0F?|\\uD83C\\uDCCF\\uFE0F?|[\\u231A\\u231B\\u2328\\u23CF\\u23E9-\\u23F3\\u23F8-\\u23FA]\\uFE0F?)");

    public static SpannableString LIZ(CommentPersonalizedEmoji commentPersonalizedEmoji) {
        int i;
        String str = "";
        if (commentPersonalizedEmoji == null || commentPersonalizedEmoji.getEmoji() == null) {
            return new SpannableString("");
        }
        SpannableString spannableString = new SpannableString(commentPersonalizedEmoji.getEmoji());
        String valueOf = String.valueOf(commentPersonalizedEmoji.getEmoji());
        Integer score = commentPersonalizedEmoji.getScore();
        if (score != null) {
            i = score.intValue();
        } else {
            i = 0;
        }
        Integer valueOf2 = Integer.valueOf(i);
        String strategy = commentPersonalizedEmoji.getStrategy();
        if (strategy == null) {
            strategy = "";
        }
        String source = commentPersonalizedEmoji.getSource();
        if (source != null) {
            str = source;
        }
        spannableString.setSpan(new CommentEmojiSpan(valueOf, valueOf2, strategy, str, null, 16, null), 0, spannableString.length(), 33);
        return spannableString;
    }

    public static int LIZJ(String str) {
        int i = 0;
        if (str == null) {
            return 0;
        }
        if (!TextUtils.isEmpty(str)) {
            Matcher matcher = LIZ.matcher(str);
            o.LJIIIIZZ(matcher, "EMOJI.matcher(text)");
            while (matcher.find()) {
                i++;
            }
        }
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.util.List, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r9v3, types: [X.OQg] */
    public static void LIZIZ(int i, int i2, CharSequence charSequence) {
        CharSequence charSequence2;
        SpannableStringBuilder spannableStringBuilder;
        ?? arrayList;
        int i3;
        SpannableStringBuilder spannableStringBuilder2;
        Integer num;
        SpannableStringBuilder spannableStringBuilder3;
        CommentEmojiSpan[] commentEmojiSpanArr;
        CommentEditText$MentionSpan[] commentEditText$MentionSpanArr = null;
        if (charSequence != null) {
            charSequence2 = charSequence.subSequence(i, i + i2);
        } else {
            charSequence2 = null;
        }
        boolean z = charSequence2 instanceof SpannableStringBuilder;
        if (z) {
            spannableStringBuilder = (SpannableStringBuilder) charSequence2;
        } else {
            spannableStringBuilder = null;
        }
        if (spannableStringBuilder != null) {
            commentEditText$MentionSpanArr = (CommentEditText$MentionSpan[]) spannableStringBuilder.getSpans(0, ((SpannableStringBuilder) charSequence2).length(), CommentEditText$MentionSpan.class);
        }
        if (commentEditText$MentionSpanArr != null && commentEditText$MentionSpanArr.length == 1) {
            return;
        }
        if (charSequence2 == null) {
            arrayList = C61878OQg.INSTANCE;
        } else {
            arrayList = new ArrayList();
            Matcher matcher = LIZ.matcher(charSequence2);
            o.LJIIIIZZ(matcher, "EMOJI.matcher(text)");
            while (matcher.find()) {
                String emoji = matcher.group();
                int start = matcher.start();
                int end = matcher.end();
                o.LJIIIIZZ(emoji, "emoji");
                arrayList.add(new C1801175b(start, end, emoji));
            }
        }
        if (!arrayList.isEmpty()) {
            if (!z || (spannableStringBuilder3 = (SpannableStringBuilder) charSequence2) == null || (commentEmojiSpanArr = (CommentEmojiSpan[]) spannableStringBuilder3.getSpans(0, ((SpannableStringBuilder) charSequence2).length(), CommentEmojiSpan.class)) == null || commentEmojiSpanArr.length == 0) {
                if (arrayList.size() == 1 && PersonalizedEmojiExperiment.LIZIZ()) {
                    C75W.LIZ(((C1801175b) ListProtector.get(arrayList, 0)).LJLJI.toString());
                }
                HashMap hashMap = new HashMap();
                for (C1801175b c1801175b : arrayList) {
                    if (hashMap.containsKey(c1801175b.LJLJI) && (num = (Integer) hashMap.get(c1801175b.LJLJI)) != null) {
                        i3 = num.intValue();
                    } else {
                        i3 = 0;
                    }
                    hashMap.put(c1801175b.LJLJI, Integer.valueOf(i3 + 1));
                    CommentEmojiSpan commentEmojiSpan = new CommentEmojiSpan(c1801175b.LJLJI.toString(), 0, "", "system_emoji_board", null, 16, null);
                    if ((charSequence instanceof SpannableStringBuilder) && (spannableStringBuilder2 = (SpannableStringBuilder) charSequence) != null) {
                        int i4 = c1801175b.LJLIL + i;
                        if (i4 < 0) {
                            i4 = 0;
                        }
                        int i5 = c1801175b.LJLILLLLZI + i;
                        int length = ((SpannableStringBuilder) charSequence).length();
                        if (i5 > length) {
                            i5 = length;
                        }
                        spannableStringBuilder2.setSpan(commentEmojiSpan, i4, i5, 33);
                    }
                }
                for (Map.Entry entry : hashMap.entrySet()) {
                    C74Z.LJJIIJZLJL((CharSequence) entry.getKey(), "system_emoji_board", ((Number) entry.getValue()).intValue(), 0, "");
                }
            }
        }
    }
}

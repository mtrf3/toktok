package X;

import android.text.SpannableString;
import android.text.style.StyleSpan;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.qnasearch.api.QnaSearchSuggestion;
import com.ss.android.ugc.aweme.qnasearch.api.QnaSearchSuggestionExtraInfo;
import com.ss.android.ugc.aweme.qnasearch.api.QnaSearchSuggestionHighlightPositions;
import com.ss.android.ugc.aweme.qnasearch.api.QnaSearchSuggestionLogPb;
import com.ss.android.ugc.aweme.qnasearch.api.QnaSearchSuggestionResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KKB<T> implements InterfaceC64592gB {
    public final /* synthetic */ KKL LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ long LJLJI;

    public KKB(KKL kkl, String str, long j) {
        this.LJLIL = kkl;
        this.LJLILLLLZI = str;
        this.LJLJI = j;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        String str;
        QnaSearchSuggestionExtraInfo qnaSearchSuggestionExtraInfo;
        String str2;
        Integer LJJIL;
        QnaSearchSuggestionResponse it = (QnaSearchSuggestionResponse) obj;
        if (it != null && it.statusCode == 0) {
            List<QnaSearchSuggestion> list = it.qnaSearchSuggestion;
            if (list != null && list.isEmpty()) {
                this.LJLIL.LIZJ(this.LJLILLLLZI, KKR.SUCCESS_EMPTY);
                return;
            }
            KKL kkl = this.LJLIL;
            o.LJIIIIZZ(it, "it");
            kkl.getClass();
            ArrayList arrayList = new ArrayList();
            int size = it.qnaSearchSuggestion.size();
            int i = 0;
            while (true) {
                ArrayList arrayList2 = null;
                if (i < size) {
                    QnaSearchSuggestion qnaSearchSuggestion = (QnaSearchSuggestion) ListProtector.get(it.qnaSearchSuggestion, i);
                    QnaSearchSuggestionLogPb qnaSearchSuggestionLogPb = it.qnaSearchSuggestionLogPb;
                    if (qnaSearchSuggestionLogPb != null) {
                        str = qnaSearchSuggestionLogPb.imprId;
                    } else {
                        str = null;
                    }
                    o.LJIIIZ(qnaSearchSuggestion, "<this>");
                    if (qnaSearchSuggestion.content != null && (qnaSearchSuggestionExtraInfo = qnaSearchSuggestion.extraInfo) != null && (str2 = qnaSearchSuggestionExtraInfo.questionAnswerCount) != null && (LJJIL = C38350F3i.LJJIL(str2)) != null) {
                        LJJIL.intValue();
                        if (qnaSearchSuggestion.wordRecord != null) {
                            String str3 = qnaSearchSuggestion.content;
                            int parseInt = CastIntegerProtector.parseInt(qnaSearchSuggestion.extraInfo.questionAnswerCount);
                            String str4 = qnaSearchSuggestion.extraInfo.questionId;
                            KKD kkd = new KKD(str3, parseInt, str4, qnaSearchSuggestion.highlightPos, new KKF(str, i, qnaSearchSuggestion.content, str4, qnaSearchSuggestion.wordRecord.groupId));
                            List<QnaSearchSuggestionHighlightPositions> list2 = kkd.LIZLLL;
                            String str5 = kkd.LIZ;
                            if (list2 != null) {
                                LinkedHashSet linkedHashSet = new LinkedHashSet();
                                for (QnaSearchSuggestionHighlightPositions qnaSearchSuggestionHighlightPositions : list2) {
                                    int i2 = qnaSearchSuggestionHighlightPositions.begin;
                                    int i3 = qnaSearchSuggestionHighlightPositions.end;
                                    if (i2 <= i3) {
                                        while (true) {
                                            linkedHashSet.add(Integer.valueOf(i2));
                                            if (i2 != i3) {
                                                i2++;
                                            }
                                        }
                                    }
                                }
                                arrayList2 = new ArrayList();
                                int length = str5.length();
                                for (int i4 = 0; i4 < length; i4++) {
                                    if (!linkedHashSet.contains(Integer.valueOf(i4))) {
                                        arrayList2.add(Integer.valueOf(i4));
                                    }
                                }
                            }
                            String str6 = kkd.LIZJ;
                            SpannableString spannableString = new SpannableString(ujb.o.LJJJJZ(QZP.LIZIZ("(?m)^[ \t]*\r?\n", kkd.LIZ, ""), "￼", "", false));
                            if (arrayList2 != null) {
                                Iterator it2 = arrayList2.iterator();
                                while (it2.hasNext()) {
                                    int intValue = ((Number) it2.next()).intValue();
                                    try {
                                        spannableString.setSpan(new StyleSpan(1), intValue, intValue + 1, 33);
                                    } catch (Exception unused) {
                                    }
                                }
                            }
                            arrayList.add(new KKM(str6, spannableString, T6W.LJII(Integer.valueOf(kkd.LIZIZ), true), kkd.LJ));
                        }
                    }
                    i++;
                } else {
                    XKX.LIZLLL(C48841JEv.LIZ(C36636EZk.LIZ), null, null, new KKI(this.LJLIL, this.LJLILLLLZI, arrayList, this.LJLJI, null), 3);
                    return;
                }
            }
        } else {
            this.LJLIL.LIZJ(this.LJLILLLLZI, KKR.FAILURE);
        }
    }
}

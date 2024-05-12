package X;

import android.text.Editable;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct;
import com.ss.android.ugc.aweme.lexical.platform.span.MentionSpan;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.shortvideo.model.AVTextExtraStructHelper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class GQ6 {
    public static List LIZ(G8I g8i, String str) {
        C41486GPy c41486GPy = (C41486GPy) g8i;
        c41486GPy.getClass();
        ArrayList arrayList = new ArrayList();
        Editable text = c41486GPy.LIZ.getText();
        if (!TextUtils.isEmpty(text)) {
            C41549GSj[] c41549GSjArr = (C41549GSj[]) text.getSpans(0, text.length(), C41549GSj.class);
            int length = c41549GSjArr.length;
            int[] iArr = new int[length];
            if (c41549GSjArr.length > 0) {
                for (int i = 0; i < length; i++) {
                    iArr[i] = text.getSpanStart(c41549GSjArr[i]);
                }
                Arrays.sort(iArr);
            }
            for (MentionSpan mentionSpan : c41486GPy.LIZ.getMentionText()) {
                int i2 = mentionSpan.mType;
                if (i2 == 0 || i2 == 5) {
                    int spanStart = text.getSpanStart(mentionSpan);
                    int i3 = 0;
                    for (int i4 = 0; i4 < length; i4++) {
                        if (spanStart > iArr[i4]) {
                            i3++;
                        }
                    }
                    mentionSpan.mStruct.setStart(text.getSpanStart(mentionSpan) - i3);
                    mentionSpan.mStruct.setEnd(text.getSpanEnd(mentionSpan) - i3);
                    AVTextExtraStruct from = AVTextExtraStructHelper.from(mentionSpan.mStruct);
                    C163056ab.LIZIZ(c41486GPy.LIZ.LJZ, from);
                    arrayList.add(from);
                }
            }
            GSR gsr = c41486GPy.LIZ;
            Iterator it = ((ArrayList) gsr.LJIJ(gsr.getNoAdTagText())).iterator();
            while (it.hasNext()) {
                C41529GRp c41529GRp = (C41529GRp) it.next();
                int i5 = c41529GRp.LIZ;
                int i6 = 0;
                for (int i7 = 0; i7 < length; i7++) {
                    if (i5 > iArr[i7]) {
                        i6++;
                    }
                }
                MentionSpan[] mentionSpanArr = (MentionSpan[]) text.getSpans(c41529GRp.LIZ, c41529GRp.LIZIZ, MentionSpan.class);
                if (mentionSpanArr != null) {
                    boolean z = false;
                    for (MentionSpan mentionSpan2 : mentionSpanArr) {
                        TextExtraStruct textExtraStruct = mentionSpan2.mStruct;
                        if (textExtraStruct != null && textExtraStruct.getType() != 1) {
                            z = true;
                        }
                    }
                    if (z) {
                    }
                }
                AVTextExtraStruct aVTextExtraStruct = new AVTextExtraStruct();
                aVTextExtraStruct.type = 1;
                aVTextExtraStruct.hashTagName = c41529GRp.LIZJ.replaceAll("#", "");
                aVTextExtraStruct.start = c41529GRp.LIZ - i6;
                aVTextExtraStruct.end = c41529GRp.LIZIZ - i6;
                C163056ab.LIZIZ(c41486GPy.LIZ.LJZ, aVTextExtraStruct);
                arrayList.add(aVTextExtraStruct);
                GSR gsr2 = c41486GPy.LIZ;
                String str2 = aVTextExtraStruct.hashTagName;
                gsr2.getClass();
                GSR.LJJII(str, str2);
            }
            List<AVTextExtraStruct> list = c41486GPy.LIZ.LJZ.creativeModel.postPageModel.transientExtra;
            if (!C79004UzY.LJJIFFI(list)) {
                arrayList.addAll(0, list);
            }
            GQL.LIZIZ(arrayList, true);
        }
        return arrayList;
    }
}

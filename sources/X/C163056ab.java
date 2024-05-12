package X;

import android.app.Activity;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct;
import com.ss.android.ugc.aweme.sticker.data.QaStruct;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.6ab, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C163056ab {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0019, code lost:
    
        if (r0.isDuet() != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZIZ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r1, com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct r2) {
        /*
            java.lang.String r0 = "editModel"
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)
            if (r2 != 0) goto L8
        L7:
            return
        L8:
            boolean r0 = r1.isDuet()
            if (r0 != 0) goto L1b
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r1.creativeModel
            com.ss.android.ugc.aweme.creative.model.EditPostModel r0 = r0.editPostModel
            r1 = 0
            if (r0 == 0) goto L1c
            boolean r0 = r0.isDuet()
            if (r0 == 0) goto L1c
        L1b:
            r1 = 1
        L1c:
            r2.setDuet(r1)
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C163056ab.LIZIZ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct):void");
    }

    public static boolean LIZJ(AVTextExtraStruct aVTextExtraStruct, String str) {
        int i;
        if (aVTextExtraStruct.isTransient() && (i = aVTextExtraStruct.start) >= 0 && i < str.length()) {
            int i2 = aVTextExtraStruct.start;
            int i3 = aVTextExtraStruct.end;
            if (i2 < i3 && i3 <= str.length()) {
                return true;
            }
        }
        return false;
    }

    public static String LJ(Activity activity, QaStruct qaStruct) {
        if (qaStruct.getQuestionId() == 0) {
            StringBuilder LIZ2 = X1D.LIZ();
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append('@');
            LIZ3.append(qaStruct.getUserName());
            LIZ2.append(activity.getString(R.string.pqh, X1D.LIZIZ(LIZ3)));
            LIZ2.append(' ');
            return X1D.LIZIZ(LIZ2);
        }
        StringBuilder LIZ4 = X1D.LIZ();
        StringBuilder LIZ5 = X1D.LIZ();
        LIZ5.append('@');
        LIZ5.append(qaStruct.getUserName());
        LIZ4.append(activity.getString(R.string.pqg, X1D.LIZIZ(LIZ5)));
        LIZ4.append(' ');
        return X1D.LIZIZ(LIZ4);
    }

    public static boolean LIZ(String str, List list, AVTextExtraStruct aVTextExtraStruct) {
        if (LIZJ(aVTextExtraStruct, str)) {
            ListProtector.add(list, 0, aVTextExtraStruct);
            return true;
        }
        C41859Gbn LIZIZ = C1I0.LIZIZ();
        StringBuilder LIZIZ2 = C25620zW.LIZIZ("add transient metadata failed, displayText: ", str, ", transient metadata: ");
        String json = GsonProtectorUtils.toJson(C60903NvH.LJIIJJI().LIZ(), list);
        o.LJIIIIZZ(json, "serializer.toJson(this)");
        LIZIZ2.append(json);
        LIZIZ2.append(", chain boundary: ");
        LIZIZ2.append(aVTextExtraStruct);
        LIZIZ.LIZJ("CaptionBoundary", X1D.LIZIZ(LIZIZ2));
        return false;
    }

    public static void LIZLLL(String str, String str2, List list, List list2) {
        C41859Gbn LIZIZ = C1I0.LIZIZ();
        StringBuilder LIZLLL = C06540Nm.LIZLLL("chain: ", str, ", caption: ", str2, ", transientMetadata: ");
        LIZLLL.append(list);
        LIZLLL.append(", metadata: ");
        LIZLLL.append(list2);
        LIZIZ.LIZJ("CaptionBoundary", X1D.LIZIZ(LIZLLL));
        GQ3 LJIJJLI = C60903NvH.LJIIJJI().getPublishService().LJIJJLI();
        LinkedHashMap LIZIZ2 = JF1.LIZIZ("resolveChainString", str, "caption", str2);
        LIZIZ2.put("transientMetadata", list.toString());
        LIZIZ2.put("metadataForRendering", list2.toString());
        LJIJJLI.LIZIZ(LIZIZ2);
    }
}

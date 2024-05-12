package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.compliance.business.serviceimpl.ComplianceBusinessServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.share.dislike.DislikeHashTag;
import com.ss.android.ugc.aweme.share.dislike.NewDislikeReason;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Om1, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62877Om1 {
    public static final String[] LIZ = ComplianceBusinessServiceImpl.LJJJJIZL().LJI();
    public static final List<String> LIZIZ = C47261Igj.LJJIJIIJI("#viral", "#fyf", "#fyp", "#foryou", "#foryoufeed", "#foryoupage", "#fy");
    public static final String LIZJ = "6";
    public static NewDislikeReason LIZLLL;
    public static final NewDislikeReason[] LJ;
    public static List<NewDislikeReason> LJFF;
    public static final int LJI;

    static {
        NewDislikeReason[] newDislikeReasonArr = (NewDislikeReason[]) C62884Om8.LIZ.getValue();
        if (newDislikeReasonArr == null) {
            newDislikeReasonArr = new NewDislikeReason[0];
        }
        LJ = newDislikeReasonArr;
        LJI = CastIntegerProtector.parseInt("6");
    }

    public static final List<DislikeHashTag> LIZ(Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        ArrayList arrayList = new ArrayList();
        if (aweme.getTextExtra() == null) {
            return arrayList;
        }
        for (TextExtraStruct textExtraStruct : aweme.getTextExtra()) {
            if (textExtraStruct.getType() == 1 && !TextUtils.isEmpty(textExtraStruct.getHashTagName())) {
                if (!ORY.LJJIJIIJIL(textExtraStruct.getHashTagName(), LIZ) && !LIZIZ.contains(textExtraStruct.getHashTagName())) {
                    String cid = textExtraStruct.getCid();
                    String str = "";
                    if (cid == null) {
                        cid = "";
                    }
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append('#');
                    String hashTagName = textExtraStruct.getHashTagName();
                    if (hashTagName != null) {
                        str = hashTagName;
                    }
                    LIZ2.append(str);
                    arrayList.add(new DislikeHashTag(cid, X1D.LIZIZ(LIZ2)));
                }
            }
        }
        return arrayList;
    }
}

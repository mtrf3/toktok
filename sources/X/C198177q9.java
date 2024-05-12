package X;

import Y.ARunnableS39S0100000_3;
import com.ss.android.ugc.aweme.nows.campaign.p004new.year.NowNewYearEventConfig;
import com.ss.android.ugc.aweme.nows.campaign.p004new.year.NowNewYearTimeRange;
import java.text.DateFormat;
import java.util.Date;
import kotlin.jvm.internal.o;

/* renamed from: X.7q9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C198177q9 {
    public static final C198177q9 LIZ = new C198177q9();
    public static final NowNewYearEventConfig LIZIZ = new NowNewYearEventConfig(null, null, null, 7, null);
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(C198197qB.LJLIL);
    public static final C62822Ol8 LIZLLL = C221108m2.LIZIZ(C198217qD.LJLIL);
    public static final C62822Ol8 LJ = C221108m2.LIZIZ(C198187qA.LJLIL);
    public static final C62822Ol8 LJFF = C221108m2.LIZIZ(C198167q8.LJLIL);
    public static final C62822Ol8 LJI = C221108m2.LIZIZ(C198207qC.LJLIL);
    public static volatile boolean LJII;
    public static volatile long LJIIIIZZ;

    public static EnumC198137q5 LIZ() {
        Long l;
        Long l2;
        C198157q7 postAction = C198157q7.LJLIL;
        o.LJIIIZ(postAction, "postAction");
        if (C210188Ms.LIZLLL()) {
            C37179EiV.LJFF.post(new ARunnableS39S0100000_3((Object) postAction, 208));
        } else {
            postAction.invoke();
        }
        C62822Ol8 c62822Ol8 = LJFF;
        NowNewYearTimeRange nowNewYearTimeRange = (NowNewYearTimeRange) c62822Ol8.getValue();
        if (nowNewYearTimeRange != null && (l = nowNewYearTimeRange.start) != null) {
            long longValue = l.longValue();
            NowNewYearTimeRange nowNewYearTimeRange2 = (NowNewYearTimeRange) c62822Ol8.getValue();
            if (nowNewYearTimeRange2 != null && (l2 = nowNewYearTimeRange2.end) != null) {
                long longValue2 = l2.longValue();
                String format = ((DateFormat) LJI.getValue()).format(new Date());
                o.LJIIIIZZ(format, "timeRangeDateFormat.format(Date())");
                Long LJJIZ = C38350F3i.LJJIZ(format);
                if (LJJIZ != null) {
                    long longValue3 = LJJIZ.longValue();
                    if (longValue <= longValue3 && longValue3 <= longValue2) {
                        return (EnumC198137q5) LJ.getValue();
                    }
                    return EnumC198137q5.NO_EVENT;
                }
                return EnumC198137q5.NO_EVENT;
            }
            return EnumC198137q5.NO_EVENT;
        }
        return EnumC198137q5.NO_EVENT;
    }

    public static EnumC198137q5 LIZIZ() {
        EnumC198137q5 LIZ2 = LIZ();
        EnumC198137q5 enumC198137q5 = EnumC198137q5.NO_EVENT;
        if (LIZ2 == enumC198137q5) {
            return LIZ2;
        }
        if (LJII) {
            return LIZ2;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (LJIIIIZZ + 30000 > currentTimeMillis) {
            return enumC198137q5;
        }
        LJIIIIZZ = currentTimeMillis;
        LJII = C198227qE.LIZ(C77117UOj.LJJI(LIZ2, "share_card_bg", null, false, 28)).exists();
        if (LJII) {
            return LIZ2;
        }
        return enumC198137q5;
    }
}

package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.ss.android.ugc.aweme.notice.repo.list.bean.GeneralTemplateNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.MVv, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C56927MVv {
    public final MusNotice LIZ;
    public final MW1 LIZIZ;

    public String LIZ(boolean z) {
        return null;
    }

    public void LIZIZ() {
    }

    public void LIZJ(EnumC56820MRs event, Context context) {
        o.LJIIIZ(event, "event");
    }

    public void LIZLLL() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [X.SY9, T] */
    /* JADX WARN: Type inference failed for: r0v18, types: [X.SY9, T] */
    /* JADX WARN: Type inference failed for: r0v25, types: [X.SY9, T] */
    public C56927MVv(MusNotice musNotice) {
        GeneralTemplateNotice generalTemplateNotice;
        Integer num;
        Integer num2;
        this.LIZ = musNotice;
        MW1 mw1 = new MW1(0);
        this.LIZIZ = mw1;
        C68322mC c68322mC = new C68322mC();
        if (musNotice != null && (generalTemplateNotice = musNotice.templateNotice) != null && (num = generalTemplateNotice.type) != null) {
            if (num.intValue() == 31) {
                C2068389v c2068389v = new C2068389v();
                c2068389v.LIZ = R.raw.icon_exclamation_mark_circle;
                c2068389v.LIZIZ = C7MY.LIZIZ(16);
                c2068389v.LIZJ = C7MY.LIZIZ(16);
                c2068389v.LJ = Integer.valueOf(R.attr.gv);
                c68322mC.element = c2068389v.LIZ(EF7.LIZIZ());
            } else if (num.intValue() == 41) {
                Integer num3 = generalTemplateNotice.legacySubType;
                if ((num3 != null && num3.intValue() == 9) || ((num2 = generalTemplateNotice.legacySubType) != null && num2.intValue() == 10)) {
                    C2068389v c2068389v2 = new C2068389v();
                    c2068389v2.LIZ = R.raw.icon_exclamation_mark_circle;
                    c2068389v2.LIZIZ = C7MY.LIZIZ(16);
                    c2068389v2.LIZJ = C7MY.LIZIZ(16);
                    c2068389v2.LJ = Integer.valueOf(R.attr.gv);
                    c68322mC.element = c2068389v2.LIZ(EF7.LIZIZ());
                }
            } else if (num.intValue() == 45) {
                C2068389v c2068389v3 = new C2068389v();
                c2068389v3.LIZ = R.raw.icon_exclamation_mark_circle;
                c2068389v3.LIZIZ = C7MY.LIZIZ(16);
                c2068389v3.LIZJ = C7MY.LIZIZ(16);
                c2068389v3.LJ = Integer.valueOf(R.attr.gv);
                c68322mC.element = c2068389v3.LIZ(EF7.LIZIZ());
            }
        }
        mw1.LJ = (Drawable) c68322mC.element;
        mw1.LIZJ = true;
        mw1.LIZLLL = true;
        if (MWD.LIZ(musNotice)) {
            mw1.LJFF = true;
        }
    }
}

package X;

import android.view.View;
import com.ss.android.ugc.aweme.homepage.ui.inflate.IFragmentMainPageIcon;
import kotlin.jvm.internal.o;

/* renamed from: X.LLt, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C54117LLt {
    public View LJLIL;

    public View LIZ(LCZ lcz, LH4 iconData) {
        o.LJIIIZ(iconData, "iconData");
        C36093EEn c36093EEn = C36093EEn.LIZ;
        LNZ lnz = LNZ.LIZIZ;
        IFragmentMainPageIcon fragmentMainPageIcon = lnz.getFragmentMainPageIcon();
        c36093EEn.getClass();
        if (((IFragmentMainPageIcon) C36093EEn.LJFF(fragmentMainPageIcon)).LJIIIZ()) {
            C54113LLp LJI = ((IFragmentMainPageIcon) C36093EEn.LJFF(lnz.getFragmentMainPageIcon())).LJI(iconData.LIZIZ);
            if (LJI == null) {
                return lcz.LIZ(iconData);
            }
            return LJI;
        }
        return lcz.LIZ(iconData);
    }
}

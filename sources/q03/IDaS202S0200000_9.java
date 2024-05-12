package q03;

import X.C222588oQ;
import X.C55723Ltv;
import X.C57826Mmk;
import X.C98T;
import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsRecUserCell;
import com.ss.android.ugc.aweme.services.story.EnterStoryParam;
import com.ss.android.ugc.aweme.story.feed.immersive.component.StoryCameraEntranceComponent;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public class IDaS202S0200000_9 extends C98T {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.C98T
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                return;
            case 1:
                LIZ$1(this, view);
                return;
            default:
                super.LIZ(view);
                return;
        }
    }

    public static final void LIZ$0(IDaS202S0200000_9 iDaS202S0200000_9, View view) {
        if (view != null) {
            ((AbsRecUserCell) iDaS202S0200000_9.l0).c0((C57826Mmk) iDaS202S0200000_9.l1);
        }
    }

    public static final void LIZ$1(IDaS202S0200000_9 iDaS202S0200000_9, View view) {
        String str;
        if (view != null) {
            C222588oQ c222588oQ = ((StoryCameraEntranceComponent) iDaS202S0200000_9.l0).a1().LIZLLL;
            String str2 = null;
            if (c222588oQ != null) {
                str2 = c222588oQ.LJIIIZ;
            }
            String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            C222588oQ c222588oQ2 = ((StoryCameraEntranceComponent) iDaS202S0200000_9.l0).a1().LIZLLL;
            if (c222588oQ2 != null && (str = c222588oQ2.LJIIIZ) != null) {
                str3 = str;
            }
            EnterStoryParam enterStoryParam = new EnterStoryParam(null, "story_immersive_feed", str2, false, false, false, false, str3, "story_immersive_feed", null, false, null, 3633, null);
            C55723Ltv c55723Ltv = C55723Ltv.LIZIZ;
            Context context = ((View) iDaS202S0200000_9.l1).getContext();
            o.LJIIIIZZ(context, "view.context");
            c55723Ltv.LIZLLL(context, enterStoryParam);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDaS202S0200000_9(Object obj, Object obj2, int i) {
        super(300L);
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}

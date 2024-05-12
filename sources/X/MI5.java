package X;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.keva.Keva;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.ui.IFeedUniformFontService;
import com.ss.android.ugc.aweme.feed.ui.font.FeedUniformFontServiceImpl;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MI5 extends FrameLayout {
    public static final /* synthetic */ int LJLIL = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MI5(Context context) {
        super(context, null, 0);
        boolean z;
        String str;
        String str2;
        boolean z2;
        int LIZ;
        int i;
        new LinkedHashMap();
        T7F t7f = InterfaceC72761Sh3.LIZ;
        MI2.LIZ.getClass();
        if (MI2.LIZ().getQna_experiment_ver() == 1) {
            z = true;
        } else {
            z = false;
        }
        t7f.getClass();
        if (z) {
            str = "total_questions";
        } else {
            str = "total_answers";
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "homepage_hot");
        c188727au.LJIIIZ("copy", str);
        FMX.LJIIL("qa_trending_banner_show", c188727au.LIZ);
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.c_3, this, true);
        TuxTextView tuxTextView = (TuxTextView) findViewById(R.id.ihr);
        if (MI2.LIZ().getQna_experiment_ver() == 1 || MI2.LIZ().getQna_experiment_ver() == 2) {
            if (MI2.LIZ().getQna_experiment_ver() == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            Keva keva = MI6.LIZ;
            long j = keva.getLong("daily_count_last_update", -1L);
            long currentTimeMillis = System.currentTimeMillis();
            long j2 = (currentTimeMillis - j) / 86400000;
            if (j == -1 || j2 >= 1) {
                keva.erase("daily_count_video_focus");
                keva.erase("daily_count_question_focus");
                keva.storeLong("daily_count_last_update", currentTimeMillis);
                LIZ = MI4.LIZ(z2);
            } else {
                if (z2) {
                    LIZ = keva.getInt("daily_count_question_focus", -1);
                } else {
                    LIZ = keva.getInt("daily_count_video_focus", -1);
                }
                if (LIZ == -1) {
                    LIZ = MI4.LIZ(z2);
                }
            }
            if (z2) {
                i = R.string.pqx;
            } else {
                i = R.string.pqw;
            }
            str2 = EF7.LIZIZ().getResources().getString(i, C77123UOp.LJJIIJ(LIZ));
            o.LJIIIIZZ(str2, "AppContextManager.getApp…stringId, formattedCount)");
        } else if (MI2.LIZ().getQna_experiment_ver() == 3) {
            str2 = EF7.LIZIZ().getResources().getString(R.string.pqz);
            o.LJIIIIZZ(str2, "{\n            AppContext…er_trending_v2)\n        }");
        } else if (MI2.LIZ().getQna_experiment_ver() == 4) {
            str2 = EF7.LIZIZ().getResources().getString(R.string.pr0);
            o.LJIIIIZZ(str2, "{\n            AppContext…er_trending_v3)\n        }");
        } else {
            str2 = "";
        }
        tuxTextView.setText(str2);
        IFeedUniformFontService LIZJ = FeedUniformFontServiceImpl.LIZJ();
        o.LJIIIIZZ(LIZJ, "get().getService(IFeedUn…mFontService::class.java)");
        LIZJ.LIZ(tuxTextView, null);
    }
}

package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.DanmakuEntranceAbility;
import com.ss.android.ugc.aweme.core.DanmakuViewModel;
import com.ss.android.ugc.aweme.eventtrack.eventfiles.ClickAddDanmakuEvent;
import com.ss.android.ugc.aweme.eventtrack.eventfiles.ExpandDanmakuEvent;
import com.ss.android.ugc.aweme.eventtrack.eventfiles.HideDanmakuEvent;
import com.ss.android.ugc.aweme.feed.landscape.LandscapeEntrancesControlAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.input.DanmakuInputFragment;
import kotlin.jvm.internal.o;

/* renamed from: X.8bp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C214778bp {
    public static final C214778bp LIZ = new C214778bp();
    public static boolean LIZIZ;

    public static boolean LIZIZ() {
        if (C215608dA.LIZ().getBoolean("already_tried_add_danmaku", false) || C215608dA.LIZ().getInt("danmaku_active_day_count_number", 0) > 10) {
            return false;
        }
        return true;
    }

    public static void LIZJ(boolean z, Aweme aweme, String enterFrom, EnumC214798br enterMethod) {
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(enterMethod, "enterMethod");
        C215608dA.LIZ().storeBoolean("danmaku_allow_show", z);
        if (z) {
            C214788bq.LIZ(new ExpandDanmakuEvent(), C61878OQg.INSTANCE, aweme, enterFrom);
        } else {
            C214788bq.LIZ(new HideDanmakuEvent(), C47261Igj.LJJIJ(new C2Y3(enterMethod.getValue(), 5)), aweme, enterFrom);
        }
    }

    public static void LIZLLL(final ActivityC45651qj activityC45651qj, final DanmakuViewModel danmakuVM, final InterfaceC55235Lm3 vScope, final EnumC214798br enterMethod) {
        final Aweme aweme;
        final String str;
        o.LJIIIZ(danmakuVM, "danmakuVM");
        o.LJIIIZ(vScope, "vScope");
        o.LJIIIZ(enterMethod, "enterMethod");
        VideoItemParams gv0 = danmakuVM.gv0();
        if (gv0 == null || (aweme = gv0.getAweme()) == null) {
            return;
        }
        VideoItemParams gv02 = danmakuVM.gv0();
        if (gv02 == null || (str = gv02.mEventType) == null) {
            str = "";
        }
        final long currentPosition = IWF.LJJLIIIIJ().getCurrentPosition();
        if (!((RBX) HG3.LJIILL()).isLogin()) {
            C40883G2t c40883G2t = new C40883G2t();
            c40883G2t.LIZLLL("group_id", aweme.getAid());
            c40883G2t.LIZLLL("author_id", aweme.getAuthorUid());
            c40883G2t.LIZLLL("log_pb", C227768wm.LJIIIZ(aweme.getAid()));
            J9P.LIZIZ(activityC45651qj, str, "add_danmaku", (Bundle) c40883G2t.LIZ, new JJ4() { // from class: X.8bt
                @Override // X.JJ4
                public final /* synthetic */ void LIZIZ() {
                }

                @Override // X.JJ4
                public final void LIZ() {
                    C214778bp c214778bp = C214778bp.LIZ;
                    ActivityC45651qj activityC45651qj2 = ActivityC45651qj.this;
                    Aweme aweme2 = aweme;
                    long j = currentPosition;
                    DanmakuViewModel danmakuViewModel = danmakuVM;
                    InterfaceC55235Lm3 interfaceC55235Lm3 = vScope;
                    String str2 = str;
                    EnumC214798br enumC214798br = enterMethod;
                    c214778bp.getClass();
                    C214778bp.LIZ(activityC45651qj2, aweme2, j, danmakuViewModel, interfaceC55235Lm3, str2, enumC214798br);
                }
            });
            return;
        }
        LIZ(activityC45651qj, aweme, currentPosition, danmakuVM, vScope, str, enterMethod);
    }

    public static void LIZ(ActivityC45651qj activityC45651qj, Aweme aweme, long j, DanmakuViewModel danmakuVM, InterfaceC55235Lm3 interfaceC55235Lm3, String enterFrom, EnumC214798br enterMethod) {
        boolean LIZIZ2;
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(enterMethod, "enterMethod");
        C214788bq.LIZ(new ClickAddDanmakuEvent(), C47261Igj.LJJIJ(new C2Y3(enterMethod.getValue(), 5)), aweme, enterFrom);
        DanmakuEntranceAbility danmakuEntranceAbility = (DanmakuEntranceAbility) C55096Ljo.LIZ(interfaceC55235Lm3, DanmakuEntranceAbility.class, null);
        if (danmakuEntranceAbility != null) {
            LIZIZ2 = danmakuEntranceAbility.bt0();
        } else {
            LIZIZ2 = LIZIZ();
        }
        C215608dA.LIZ().storeBoolean("already_tried_add_danmaku", true);
        if (LIZIZ2) {
            try {
                LandscapeEntrancesControlAbility landscapeEntrancesControlAbility = (LandscapeEntrancesControlAbility) C55096Ljo.LIZ(interfaceC55235Lm3, LandscapeEntrancesControlAbility.class, null);
                if (landscapeEntrancesControlAbility != null) {
                    landscapeEntrancesControlAbility.XQ(null);
                }
            } catch (Exception unused) {
            }
        }
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(danmakuVM, "danmakuVM");
        if (activityC45651qj == null) {
            return;
        }
        new DanmakuInputFragment(interfaceC55235Lm3, danmakuVM, new C214928c4(aweme, j, "", false, "")).show(activityC45651qj.getSupportFragmentManager(), "DanmakuInputFragment");
    }
}

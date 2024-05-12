package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.8My, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C210248My implements InterfaceC184277Lb {
    public static final C210248My LIZ = new C210248My();

    @Override // X.InterfaceC184277Lb
    public final C212518Vr LIZIZ() {
        if (C210258Mz.LIZ()) {
            return C8NZ.LIZ;
        }
        return C212518Vr.LIZ;
    }

    @Override // X.InterfaceC184277Lb
    public final void LIZ(ActivityC45651qj activityC45651qj) {
        if (activityC45651qj == null || !C210258Mz.LIZ()) {
            return;
        }
        C38619FDr.LIZLLL(R.layout.abj, activityC45651qj);
        C38619FDr.LIZLLL(R.layout.cod, activityC45651qj);
        C38619FDr.LIZLLL(R.layout.coz, activityC45651qj);
        C38619FDr.LIZLLL(R.layout.cok, activityC45651qj);
        C38619FDr.LIZLLL(R.layout.cpb, activityC45651qj);
        Integer LJJIJIL = C38891fp.LJJIJIL("detail_feed_story_normal_creator_bottom");
        if (LJJIJIL != null) {
            int intValue = LJJIJIL.intValue();
            C38619FDr.LIZLLL.getClass();
            C38619FDr.LJ(null, intValue, "detail_feed_story_normal_creator_bottom");
        }
        C38619FDr.LIZLLL(R.layout.cob, activityC45651qj);
        C38619FDr.LIZLLL(R.layout.cow, activityC45651qj);
        C38619FDr.LIZLLL(R.layout.coy, activityC45651qj);
        C38619FDr.LIZLLL(R.layout.cou, activityC45651qj);
    }

    public final <RECEIVER extends C3C8> void LIZLLL(ReusedUISlotAssem<RECEIVER> reusedUISlotAssem, String str, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        o.LJIIIZ(reusedUISlotAssem, "<this>");
        System.currentTimeMillis();
        reusedUISlotAssem.l4(LIZIZ());
        interfaceC65784Pro.invoke();
    }

    @Override // X.InterfaceC184277Lb
    public final View LIZJ(String tag, Context context, int i, LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View LLLLIILL;
        o.LJIIIZ(tag, "tag");
        System.currentTimeMillis();
        if (C210258Mz.LIZ() && context != null) {
            LLLLIILL = C38619FDr.LIZIZ(i, context, viewGroup, z);
        } else {
            if (layoutInflater == null) {
                layoutInflater = C16880lQ.LLZIL(context);
            }
            LLLLIILL = C16880lQ.LLLLIILL(layoutInflater, i, viewGroup, z);
        }
        o.LJIIIIZZ(LLLLIILL, "if (StoryInflateOptExp.i…startTime} ms\")\n        }");
        return LLLLIILL;
    }
}

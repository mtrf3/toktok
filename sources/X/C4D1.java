package X;

import Y.IDDListenerS141S0100000_1;
import android.content.Context;
import android.view.View;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.feed.model.CommentPersonalizedEmoji;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifpanel.bottomsheet.GifChoosePanelBottomSheet;
import kotlin.jvm.internal.o;

/* renamed from: X.4D1, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4D1 {
    /* JADX WARN: Type inference failed for: r0v9, types: [X.4C5] */
    public static void LIZ(ActivityC45651qj activityC45651qj, final InterfaceC88473Ynt interfaceC88473Ynt) {
        if (activityC45651qj.getSupportFragmentManager().LJJJIL("gifChoosePanelBottomSheet") != null) {
            return;
        }
        GifChoosePanelBottomSheet gifChoosePanelBottomSheet = new GifChoosePanelBottomSheet();
        int LJJIIZ = O6R.LJJIIZ(activityC45651qj.getResources().getDisplayMetrics().heightPixels * 0.8f);
        ASL asl = new ASL();
        asl.LIZ.LJLLJ = true;
        asl.LJI(1);
        TuxSheet tuxSheet = asl.LIZ;
        tuxSheet.LJLLLLLL = LJJIIZ;
        tuxSheet.LJZL = true;
        tuxSheet.LJZI = false;
        tuxSheet.LJLILLLLZI = new IDDListenerS141S0100000_1(gifChoosePanelBottomSheet, 3);
        tuxSheet.LJLLILLLL = gifChoosePanelBottomSheet;
        gifChoosePanelBottomSheet.LJLJJI = new C3UR() { // from class: X.4C5
            @Override // X.C3UR
            public final void LIZIZ() {
            }

            @Override // X.C3UR
            public final void LIZJ(C32V c32v, boolean z) {
            }

            @Override // X.C3UR
            public final void LIZLLL(String emojiText) {
                o.LJIIIZ(emojiText, "emojiText");
            }

            @Override // X.C3UR
            public final void LJ(Context context) {
            }

            @Override // X.C3UR
            public final void j2(CommentPersonalizedEmoji emoji) {
                o.LJIIIZ(emoji, "emoji");
            }

            @Override // X.C3UR
            public final void LIZ(View view, C105454Bx emoji) {
                o.LJIIIZ(view, "view");
                o.LJIIIZ(emoji, "emoji");
                interfaceC88473Ynt.invoke(view, emoji, 1);
            }
        };
        C1DG.LJII(activityC45651qj, "activity.supportFragmentManager", tuxSheet, "gifChoosePanelBottomSheet");
    }
}

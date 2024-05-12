package X;

import Y.ARunnableS22S0200000_3;
import com.ss.android.ugc.now.interaction.assem.CommentItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.738, reason: invalid class name */
/* loaded from: classes4.dex */
public final class AnonymousClass738 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(boolean z, SYL syl, String str) {
        if (z) {
            List<InterfaceC57784Mm4> LJII = syl.getState().LJII();
            C76732zl c76732zl = new C76732zl();
            Iterator it = ((ArrayList) LJII).iterator();
            int i = 0;
            while (true) {
                if (it.hasNext()) {
                    InterfaceC57784Mm4 interfaceC57784Mm4 = (InterfaceC57784Mm4) it.next();
                    o.LJII(interfaceC57784Mm4, "null cannot be cast to non-null type com.ss.android.ugc.now.interaction.assem.CommentItem");
                    if (o.LJ(((CommentItem) interfaceC57784Mm4).getComment().getCid(), str)) {
                        break;
                    } else {
                        i++;
                    }
                } else {
                    i = -1;
                    break;
                }
            }
            c76732zl.element = i;
            c76732zl.element = syl.getHeaderCount() + i;
            syl.post(new ARunnableS22S0200000_3(syl, c76732zl, 55));
            syl.postDelayed(new ARunnableS22S0200000_3(syl, c76732zl, 56), 20L);
            return;
        }
        syl.animate().translationY(0.0f).setDuration(300L).start();
    }
}

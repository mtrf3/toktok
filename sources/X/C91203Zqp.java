package X;

import Y.IDRunnableS88S0100000_29;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.top.IXTabPanelAbility;
import kotlin.jvm.internal.IDqS421S0100000_29;
import kotlin.jvm.internal.o;

/* renamed from: X.Zqp, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91203Zqp {
    public static final C91202Zqo LIZ = new C91202Zqo();
    public static boolean LIZIZ;

    public static C46420IJs LIZ() {
        return (C46420IJs) LIZ.LIZLLL.getValue();
    }

    public static C46420IJs LIZIZ() {
        return (C46420IJs) LIZ.LIZJ.getValue();
    }

    public static void LIZJ(InterfaceC65784Pro interfaceC65784Pro) {
        if (o.LJ(C16880lQ.LLLLIIIILLL(), C16880lQ.LLJJJJ().getThread())) {
            interfaceC65784Pro.invoke();
        } else {
            ExecutorC142245i8.LJLILLLLZI.execute(new IDRunnableS88S0100000_29(interfaceC65784Pro, 15));
        }
    }

    public static void LIZLLL(IXTabPanelAbility ability) {
        o.LJIIIZ(ability, "ability");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("updateModelsIfHasFavorites ability is ");
        LIZ2.append(ability);
        LIZ2.append(" call updateSubTabData,favoritescount is ");
        LIZ2.append(C91211Zqx.LIZ());
        X1D.LIZIZ(LIZ2);
        LIZJ(new IDqS421S0100000_29(ability, 71));
    }
}

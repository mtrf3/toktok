package X;

import com.ss.android.ugc.aweme.discover.mob.ISearchResultStatistics;
import kotlin.jvm.internal.o;

/* renamed from: X.JdJ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49597JdJ implements ISearchResultStatistics {
    public static final C49597JdJ LIZ = new C49597JdJ();

    @Override // com.ss.android.ugc.aweme.discover.mob.ISearchResultStatistics
    public final void LIZ(C49601JdN c49601JdN) {
        String LIZIZ = C49503Jbn.LIZIZ();
        C50653JuL.LJLILLLLZI.getClass();
        java.util.Map LIZIZ2 = C50654JuM.LIZIZ();
        C49602JdO c49602JdO = new C49602JdO(c49601JdN.LJLIL);
        c49602JdO.LJIJI(c49601JdN.LJLILLLLZI);
        c49602JdO.LJIIZILJ("log_pb", C3A5.LIZ.LIZIZ(LIZIZ));
        c49602JdO.LJIJ("search_result_id", C49503Jbn.LJ);
        c49602JdO.LJIIZILJ("music_id", c49601JdN.LJLJI);
        c49602JdO.LJIILLIIL(LIZIZ2);
        c49602JdO.LJIILIIL();
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00bc, code lost:
    
        if (r11 >= 0) goto L30;
     */
    @Override // com.ss.android.ugc.aweme.discover.mob.ISearchResultStatistics
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(X.C49598JdK r15) {
        /*
            Method dump skipped, instructions count: 621
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49597JdJ.LIZIZ(X.JdK):void");
    }

    @Override // com.ss.android.ugc.aweme.discover.mob.ISearchResultStatistics
    public final void LIZJ(C49599JdL c49599JdL) {
        String str;
        String str2;
        C50469JrN searchVideoModel;
        String LIZIZ = C49503Jbn.LIZIZ();
        C49602JdO c49602JdO = new C49602JdO(c49599JdL.LJLIL);
        c49602JdO.LJIJI(c49599JdL.LJLJI);
        c49602JdO.LJIIZILJ("enter_method", c49599JdL.LJLJJL);
        C50652JuK.Companion.getClass();
        C50650JuI LIZJ = C50651JuJ.LIZJ();
        if (LIZJ != null && (searchVideoModel = LIZJ.getSearchVideoModel()) != null) {
            str = searchVideoModel.getGroupId();
        } else {
            str = null;
        }
        c49602JdO.LJIIZILJ("last_from_group_id", str);
        c49602JdO.LJIIZILJ("log_pb", C3A5.LIZ.LIZIZ(LIZIZ));
        c49602JdO.LJIJ("search_result_id", C49503Jbn.LJ);
        if (o.LJ(C49503Jbn.LJFF, "general_search")) {
            str2 = "general";
        } else {
            str2 = C49503Jbn.LJFF;
        }
        c49602JdO.LJIIZILJ("search_type", str2);
        c49602JdO.LJIIZILJ("search_id", LIZIZ);
        c49602JdO.LJIIZILJ("previous_page", c49599JdL.LJLJJLL);
        String param = c49599JdL.LJLJL;
        o.LJIIIZ(param, "param");
        c49602JdO.LJIJ("follow_type", param);
        c49602JdO.LJIIZILJ("is_search_scene", String.valueOf(Integer.valueOf(c49599JdL.LJLJLJ)));
        c49602JdO.LJ("to_user_id", c49599JdL.LJLILLLLZI, InterfaceC1798974f.LIZ);
        c49602JdO.LJIILIIL();
    }
}

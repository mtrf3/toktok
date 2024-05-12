package X;

import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.following.ui.viewmodel.FollowerRelationState;
import com.ss.android.ugc.aweme.following.ui.viewmodel.FollowerRelationViewModel;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.SjN, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72905SjN extends AbstractC65781Prl implements InterfaceC88472Yns<FollowerRelationState, C76800UCe> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ FollowerRelationViewModel LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C72905SjN(String str, FollowerRelationViewModel followerRelationViewModel, int i, String str2, int i2) {
        super(1);
        this.LJLIL = str;
        this.LJLILLLLZI = followerRelationViewModel;
        this.LJLJI = i;
        this.LJLJJI = str2;
        this.LJLJJL = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(FollowerRelationState it) {
        o.LJIIIZ(it, "it");
        String LLLZ = C16880lQ.LLLZ("repo_maf_follow_back_notice_%s", Arrays.copyOf(new Object[]{it.getUserId()}, 1));
        o.LJIIIIZZ(LLLZ, "format(this, *args)");
        Keva repo = Keva.getRepo(LLLZ);
        String LLLZ2 = C16880lQ.LLLZ("key_highlight_user_nid_%s", Arrays.copyOf(new Object[]{this.LJLIL}, 1));
        o.LJIIIIZZ(LLLZ2, "format(this, *args)");
        boolean z = repo.getBoolean(LLLZ2, false);
        ((LinkedHashMap) this.LJLILLLLZI.LJLLILLLL).clear();
        if (this.LJLJI > 1000 || !C53136KtI.LIZ()) {
            this.LJLILLLLZI.LJLJLLL = null;
            return;
        }
        if (z) {
            return;
        }
        FollowerRelationViewModel followerRelationViewModel = this.LJLILLLLZI;
        String str = this.LJLJJI;
        int i = this.LJLJJL;
        followerRelationViewModel.getClass();
        if (str == null || str.length() == 0) {
            return;
        }
        List LJLJJL = s.LJLJJL(str, new String[]{","}, 0, 6);
        if (LJLJJL.isEmpty()) {
            return;
        }
        if (LJLJJL.size() == 1) {
            followerRelationViewModel.LJLLILLLL.put(ListProtector.get(LJLJJL, 0), Boolean.TRUE);
            return;
        }
        if (LJLJJL.size() == 2 && 1 <= i && i < 4) {
            java.util.Map<String, Boolean> map = followerRelationViewModel.LJLLILLLL;
            Object obj = ListProtector.get(LJLJJL, 0);
            Boolean bool = Boolean.TRUE;
            map.put(obj, bool);
            followerRelationViewModel.LJLLILLLL.put(ListProtector.get(LJLJJL, 1), bool);
            return;
        }
        if (LJLJJL.size() == 3 || (i == 3 && LJLJJL.size() > 3)) {
            java.util.Map<String, Boolean> map2 = followerRelationViewModel.LJLLILLLL;
            Object obj2 = ListProtector.get(LJLJJL, 0);
            Boolean bool2 = Boolean.TRUE;
            map2.put(obj2, bool2);
            followerRelationViewModel.LJLLILLLL.put(ListProtector.get(LJLJJL, 1), bool2);
            followerRelationViewModel.LJLLILLLL.put(ListProtector.get(LJLJJL, 2), bool2);
            return;
        }
        if (LJLJJL.size() <= 1) {
            return;
        }
        java.util.Map<String, Boolean> map3 = followerRelationViewModel.LJLLILLLL;
        Object obj3 = ListProtector.get(LJLJJL, 0);
        Boolean bool3 = Boolean.TRUE;
        map3.put(obj3, bool3);
        followerRelationViewModel.LJLLILLLL.put(ListProtector.get(LJLJJL, 1), bool3);
    }

    @Override // X.InterfaceC88472Yns
    public /* bridge */ /* synthetic */ C76800UCe invoke(FollowerRelationState followerRelationState) {
        invoke2(followerRelationState);
        return C76800UCe.LIZ;
    }
}

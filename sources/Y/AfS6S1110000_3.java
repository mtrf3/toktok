package Y;

import X.C1810478q;
import X.C1811378z;
import X.C64920Pds;
import X.C71Y;
import X.C74Z;
import X.EF7;
import X.InterfaceC64592gB;
import X.L61;
import X.L6F;
import X.OSZ;
import com.ss.android.ugc.aweme.comment.likelist.model.LikeListResponse;
import com.ss.android.ugc.aweme.comment.likelist.viewmodel.LikeListVM;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public class AfS6S1110000_3 implements InterfaceC64592gB {
    public final int $t;
    public Object l1;
    public String s0;
    public boolean z2;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void accept$0(AfS6S1110000_3 afS6S1110000_3, Object obj) {
        long j;
        LikeListResponse it = (LikeListResponse) obj;
        LikeListVM likeListVM = ((LikeListVM.BubbleBridge) afS6S1110000_3.l1).LJLJL;
        o.LJIIIIZZ(it, "it");
        likeListVM.LJLLILLLL.LIZ();
        likeListVM.LJLLILLLL.LIZLLL(it);
        likeListVM.LJLLILLLL.LJFF();
        if (afS6S1110000_3.z2 && !it.getHasMore()) {
            List<User> likeList = it.getLikeList();
            if (likeList != null) {
                j = likeList.size();
            } else {
                j = 0;
            }
            Long l = (Long) ((Map) ((LikeListVM.BubbleBridge) afS6S1110000_3.l1).LJLJLJ.getValue()).get(afS6S1110000_3.s0);
            if (l == null || j != l.longValue()) {
                ((Map) ((LikeListVM.BubbleBridge) afS6S1110000_3.l1).LJLJLJ.getValue()).put(afS6S1110000_3.s0, Long.valueOf(j));
                C71Y.LIZLLL("LikeListVM", "Like bubble fetchLikeList notifyLikeCountChange");
                C1811378z.LIZIZ(afS6S1110000_3.s0, j, it);
            }
        }
        if (afS6S1110000_3.z2) {
            ((LikeListVM.BubbleBridge) afS6S1110000_3.l1).jv0(new OSZ(afS6S1110000_3.s0, it), "REFRESH_LIKED_LIST_SUCCESS");
        } else {
            ((LikeListVM.BubbleBridge) afS6S1110000_3.l1).jv0(new OSZ(afS6S1110000_3.s0, it), "LOAD_MORE_LIKED_LIST_SUCCESS");
        }
        L6F.LIZIZ.LIZLLL(L61.STORY, null, it.getLikeList(), C1810478q.LJLIL);
        C74Z.LJFF((Set) ((LikeListVM.BubbleBridge) afS6S1110000_3.l1).LJLJLLL.getValue(), it.getLikeList(), "normal_video", "like_list");
    }

    public static final void accept$1(AfS6S1110000_3 afS6S1110000_3, Object obj) {
        Throwable it = (Throwable) obj;
        if (afS6S1110000_3.z2) {
            ((LikeListVM.BubbleBridge) afS6S1110000_3.l1).jv0(afS6S1110000_3.s0, "REFRESH_LIKED_LIST_FAIL");
        } else {
            ((LikeListVM.BubbleBridge) afS6S1110000_3.l1).jv0(afS6S1110000_3.s0, "LOAD_MORE_LIKED_LIST_FAIL");
        }
        LikeListVM likeListVM = ((LikeListVM.BubbleBridge) afS6S1110000_3.l1).LJLJL;
        o.LJIIIIZZ(it, "it");
        likeListVM.LJLLILLLL.LJI(C64920Pds.LIZ(EF7.LIZIZ(), it));
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS6S1110000_3(com.ss.android.ugc.aweme.comment.likelist.viewmodel.LikeListVM.BubbleBridge r2, java.lang.String r3, boolean r4, int r5) {
        /*
            r1 = this;
            r1.$t = r5
            switch(r5) {
                case 0: goto L10;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.z2 = r4
            r0.l1 = r2
            r0.s0 = r3
        Lc:
            r0.<init>()
            return
        L10:
            r0 = r1
            r0.l1 = r2
            r0.z2 = r4
            r0.s0 = r3
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS6S1110000_3.<init>(com.ss.android.ugc.aweme.comment.likelist.viewmodel.LikeListVM$BubbleBridge, java.lang.String, boolean, int):void");
    }
}

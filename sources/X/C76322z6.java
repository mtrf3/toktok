package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.2z6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C76322z6 {
    public static final List<Aweme> LIZIZ = new ArrayList();
    public final BaseListFragmentPanel LIZ;

    public C76322z6(BaseListFragmentPanel panel) {
        o.LJIIIZ(panel, "panel");
        this.LIZ = panel;
    }

    public final void LIZ(int i, int i2, String targetUid) {
        List<Aweme> list;
        User sharer;
        User sharer2;
        o.LJIIIZ(targetUid, "targetUid");
        InterfaceC55062LjG adapter = this.LIZ.getAdapter();
        if (adapter == null || (list = adapter.Q8()) == null) {
            list = C61878OQg.INSTANCE;
        }
        List LLIIIZ = ORZ.LLIIIZ(LIZIZ, list);
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) LLIIIZ).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (hashSet.add(((Aweme) next).getAid())) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Aweme aweme = (Aweme) it2.next();
            if (aweme != null && (sharer2 = aweme.getSharer()) != null && o.LJ(sharer2.getUid(), targetUid) && sharer2.getFollowStatus() != i) {
                arrayList2.add(aweme);
            }
        }
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            Aweme aweme2 = (Aweme) it3.next();
            User sharer3 = aweme2.getSharer();
            if (sharer3 != null) {
                sharer3.setFollowStatus(i);
            }
            if (i2 != -1 && (sharer = aweme2.getSharer()) != null) {
                sharer.setFollowerStatus(i2);
            }
        }
        C221018lt.LJFF("@LinkRelation_Video", "need update aweme size: " + arrayList2.size());
        if (!arrayList2.isEmpty()) {
            XKX.LIZLLL(C48841JEv.LIZ(EXV.LIZ), null, null, new C76312z5(arrayList2, this, i, null), 3);
        } else {
            C221018lt.LJFF("@LinkRelation_Video", "not need to update followStatus");
        }
    }
}

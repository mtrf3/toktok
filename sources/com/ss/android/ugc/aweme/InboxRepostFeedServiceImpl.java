package com.ss.android.ugc.aweme;

import X.ActivityC45651qj;
import X.AnonymousClass028;
import X.C141335gf;
import X.C221018lt;
import X.C26045AKb;
import X.C2U8;
import X.C2WD;
import X.C3C5;
import X.C61878OQg;
import X.C76800UCe;
import X.C7MY;
import X.C81553Hz;
import X.ORY;
import X.X1D;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.governance.eventbus.IEvent;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class InboxRepostFeedServiceImpl implements IInboxRepostFeedService {
    @Override // com.ss.android.ugc.aweme.IInboxRepostFeedService
    public final void LIZJ() {
        Object LIZ;
        try {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("store read repost aids, read aids: ");
            List<String> list = C2WD.LIZ;
            LIZ2.append(((ArrayList) list).size());
            LIZ2.append(", ");
            LIZ2.append(list);
            C221018lt.LJFF("InboxRepostList", X1D.LIZIZ(LIZ2));
            C2WD.LIZ().storeStringArray((String) C2WD.LIZIZ.getValue(), (String[]) ((ArrayList) list).toArray(new String[0]));
            LIZ = C76800UCe.LIZ;
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
        if (m10exceptionOrNullimpl != null) {
            C221018lt.LIZJ("InboxRepostList", "storeReadRepostAids", m10exceptionOrNullimpl);
        }
    }

    @Override // com.ss.android.ugc.aweme.IInboxRepostFeedService
    public final void LJFF() {
        C221018lt.LJFF("InboxRepostList", "clearReadAids");
        ((ArrayList) C2WD.LIZ).clear();
    }

    @Override // com.ss.android.ugc.aweme.IInboxRepostFeedService
    public final void LIZ() {
        C2U8.LIZ(new IEvent() { // from class: X.2kx
            @Override // com.ss.android.ugc.governance.eventbus.IEvent
            public final /* synthetic */ IEvent post() {
                C2U8.LIZ(this);
                return this;
            }

            @Override // com.ss.android.ugc.governance.eventbus.IEvent
            public final /* synthetic */ IEvent postSticky() {
                C2U8.LIZIZ(this);
                return this;
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.IInboxRepostFeedService
    public final void LJI() {
        C2U8.LIZ(new IEvent() { // from class: X.2kw
            @Override // com.ss.android.ugc.governance.eventbus.IEvent
            public final /* synthetic */ IEvent post() {
                C2U8.LIZ(this);
                return this;
            }

            @Override // com.ss.android.ugc.governance.eventbus.IEvent
            public final /* synthetic */ IEvent postSticky() {
                C2U8.LIZIZ(this);
                return this;
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.IInboxRepostFeedService
    public final void LIZIZ(String str) {
        if (str != null) {
            List<String> list = C2WD.LIZ;
            ArrayList arrayList = (ArrayList) list;
            if (!arrayList.contains(str)) {
                ArrayList arrayList2 = (ArrayList) C81553Hz.LJLJI;
                boolean z = !arrayList2.contains(str);
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("aid:");
                LIZ.append(str);
                LIZ.append(" is viewed: ");
                LIZ.append(z);
                C221018lt.LJFF("InboxRepostList", X1D.LIZIZ(LIZ));
                if (z) {
                    return;
                }
                arrayList.add(str);
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("cur aid: ");
                LIZ2.append(str);
                LIZ2.append(", read aids size: ");
                LIZ2.append(arrayList.size());
                LIZ2.append(", aids: ");
                LIZ2.append(list);
                C221018lt.LJFF("InboxRepostList", X1D.LIZIZ(LIZ2));
                arrayList2.remove(str);
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("aid:");
                LIZ3.append(str);
                LIZ3.append(" is removed from unViewedItems");
                C221018lt.LJFF("InboxRepostList", X1D.LIZIZ(LIZ3));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.IInboxRepostFeedService
    public final List<String> LIZLLL(int i) {
        boolean z = true;
        if (i == 1) {
            C61878OQg c61878OQg = null;
            try {
                String[] stringArray = C2WD.LIZ().getStringArray((String) C2WD.LIZIZ.getValue(), null);
                o.LJIIIIZZ(stringArray, "getRepo().getStringArray(repoKey, null)");
                List LJJZZIII = ORY.LJJZZIII(stringArray);
                if (LJJZZIII != 0 && !LJJZZIII.isEmpty()) {
                    z = false;
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("get read aids from store, readAids: ");
                LIZ.append(LJJZZIII);
                C221018lt.LJFF("InboxRepostList", X1D.LIZIZ(LIZ));
                c61878OQg = LJJZZIII;
            } catch (Throwable th) {
                Throwable LJFF = AnonymousClass028.LJFF(th);
                if (LJFF != null) {
                    C221018lt.LIZJ("InboxRepostList", "getReadRepostAids error", LJFF);
                }
            }
            if (c61878OQg == null) {
                c61878OQg = C61878OQg.INSTANCE;
            }
            ArrayList arrayList = (ArrayList) C2WD.LIZ;
            arrayList.clear();
            arrayList.addAll(c61878OQg);
        }
        StringBuilder LJ = C7MY.LJ("query type: ", i, ", read aids: ");
        List<String> list = C2WD.LIZ;
        LJ.append(((ArrayList) list).size());
        LJ.append(", ");
        LJ.append(list);
        C221018lt.LJFF("InboxRepostList", X1D.LIZIZ(LJ));
        return list;
    }

    @Override // com.ss.android.ugc.aweme.IInboxRepostFeedService
    public final void LJ(Fragment fragment) {
        o.LJIIIZ(fragment, "fragment");
        ActivityC45651qj mo49getActivity = fragment.mo49getActivity();
        if (mo49getActivity != null) {
            String string = mo49getActivity.getString(R.string.q4j);
            o.LJIIIIZZ(string, "activity.getString(R.str…reposts_feed_empty_title)");
            C26045AKb c26045AKb = new C26045AKb(mo49getActivity);
            c26045AKb.LJIIIZ(string);
            c26045AKb.LJIIJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.IInboxRepostFeedService
    public final boolean LJII(int i) {
        boolean z;
        if (i == 39) {
            z = true;
        } else {
            z = false;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("page type：");
        LIZ.append(i);
        LIZ.append(", is inbox repost list : ");
        LIZ.append(z);
        C221018lt.LJFF("InboxRepostList", X1D.LIZIZ(LIZ));
        return z;
    }
}

package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.friendstab.interfaces.IBottomTabLayoutAbility;
import com.ss.android.ugc.aweme.friendstab.interfaces.IFriendsTabLayoutAbility;
import com.ss.android.ugc.aweme.friendstab.interfaces.ISocial2TabProtocolAbility;
import com.ss.android.ugc.aweme.friendstab.model.NewContentResponse;
import com.ss.android.ugc.aweme.friendstab.model.SingleTabCounter;
import com.ss.android.ugc.aweme.friendstab.protocol.ISocialTabProtocol;
import com.ss.android.ugc.aweme.friendstab.tab.StateOwner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.LHk, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C54004LHk {
    public final String LIZ;
    public final boolean LIZIZ;
    public final ArrayList<SingleTabCounter> LIZJ;

    public static IBottomTabLayoutAbility LIZIZ() {
        ActivityC45651qj LIZLLL = StateOwner.LJLIL.LIZLLL();
        if (LIZLLL != null) {
            return C53976LGi.LJIIIIZZ(LIZLLL);
        }
        return null;
    }

    public final int LIZ() {
        Iterator<SingleTabCounter> it = this.LIZJ.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += it.next().getNumberCount();
        }
        return i;
    }

    public final void LJIIJ() {
        SingleTabCounter singleTabCounter;
        Iterator<SingleTabCounter> it = this.LIZJ.iterator();
        while (true) {
            if (it.hasNext()) {
                singleTabCounter = it.next();
                if (o.LJ(singleTabCounter.getTag(), LJFF())) {
                    break;
                }
            } else {
                singleTabCounter = null;
                break;
            }
        }
        SingleTabCounter singleTabCounter2 = singleTabCounter;
        if (singleTabCounter2 != null) {
            singleTabCounter2.setNumberCount(0);
            singleTabCounter2.setShowRedDot(false);
        }
    }

    public static String LJFF() {
        ActivityC45651qj LIZLLL;
        IFriendsTabLayoutAbility LIZJ;
        String TO;
        IBottomTabLayoutAbility LIZIZ = LIZIZ();
        if (LIZIZ == null || !LIZIZ.wY() || (LIZLLL = StateOwner.LJLIL.LIZLLL()) == null || (LIZJ = C53976LGi.LIZJ(LIZLLL)) == null || (TO = LIZJ.TO()) == null) {
            return "";
        }
        return TO;
    }

    public final void LJIIIZ() {
        List<ISocialTabProtocol> arrayList;
        ISocial2TabProtocolAbility LJFF;
        IBottomTabLayoutAbility LIZIZ = LIZIZ();
        if ((LIZIZ == null || LIZIZ.bn() == null) && this.LIZJ.isEmpty()) {
            ActivityC45651qj LIZLLL = StateOwner.LJLIL.LIZLLL();
            if (LIZLLL == null || (LJFF = C53976LGi.LJFF(LIZLLL)) == null || (arrayList = LJFF.NL()) == null) {
                arrayList = new ArrayList<>();
            }
            for (ISocialTabProtocol iSocialTabProtocol : arrayList) {
                this.LIZJ.add(new SingleTabCounter(iSocialTabProtocol.getTag(), 0, LJI(iSocialTabProtocol.getTag())));
            }
        }
    }

    public final SingleTabCounter LIZLLL(String tag) {
        SingleTabCounter singleTabCounter;
        o.LJIIIZ(tag, "tag");
        Iterator<SingleTabCounter> it = this.LIZJ.iterator();
        while (true) {
            if (it.hasNext()) {
                singleTabCounter = it.next();
                if (o.LJ(singleTabCounter.getTag(), tag)) {
                    break;
                }
            } else {
                singleTabCounter = null;
                break;
            }
        }
        return singleTabCounter;
    }

    public void LJ(String str) {
        SingleTabCounter singleTabCounter;
        Iterator<SingleTabCounter> it = this.LIZJ.iterator();
        while (true) {
            if (it.hasNext()) {
                singleTabCounter = it.next();
                if (o.LJ(singleTabCounter.getTag(), str)) {
                    break;
                }
            } else {
                singleTabCounter = null;
                break;
            }
        }
        SingleTabCounter singleTabCounter2 = singleTabCounter;
        if (singleTabCounter2 != null) {
            singleTabCounter2.setNumberCount(0);
            singleTabCounter2.setShowRedDot(false);
        }
    }

    public final boolean LJI(String str) {
        IFriendsTabLayoutAbility iFriendsTabLayoutAbility;
        InterfaceC54013LHt gb;
        if (!this.LIZIZ) {
            return false;
        }
        ActivityC45651qj LIZLLL = StateOwner.LJLIL.LIZLLL();
        if (LIZLLL != null) {
            iFriendsTabLayoutAbility = C53976LGi.LIZJ(LIZLLL);
        } else {
            iFriendsTabLayoutAbility = null;
        }
        if ((iFriendsTabLayoutAbility == null || (gb = iFriendsTabLayoutAbility.gb(str)) == null || !gb.LLLIIIL()) && LHJ.LIZ.getBoolean("has_shown_guide_dot", false)) {
            return false;
        }
        return true;
    }

    public final int LJII(String tag) {
        SingleTabCounter singleTabCounter;
        o.LJIIIZ(tag, "tag");
        Iterator<SingleTabCounter> it = this.LIZJ.iterator();
        while (true) {
            if (it.hasNext()) {
                singleTabCounter = it.next();
                if (o.LJ(singleTabCounter.getTag(), tag)) {
                    break;
                }
            } else {
                singleTabCounter = null;
                break;
            }
        }
        SingleTabCounter singleTabCounter2 = singleTabCounter;
        if (singleTabCounter2 != null) {
            return singleTabCounter2.getNumberCount();
        }
        return 0;
    }

    public void LJIIIIZZ(NewContentResponse response) {
        List<ISocialTabProtocol> arrayList;
        ISocial2TabProtocolAbility iSocial2TabProtocolAbility;
        ISocial2TabProtocolAbility LJFF;
        o.LJIIIZ(response, "response");
        this.LIZJ.clear();
        String LJFF2 = LJFF();
        ActivityC45651qj LIZLLL = StateOwner.LJLIL.LIZLLL();
        if (LIZLLL == null || (LJFF = C53976LGi.LJFF(LIZLLL)) == null || (arrayList = LJFF.NL()) == null) {
            arrayList = new ArrayList<>();
        }
        ArrayList arrayList2 = new ArrayList();
        for (ISocialTabProtocol iSocialTabProtocol : arrayList) {
            ISocialTabProtocol iSocialTabProtocol2 = iSocialTabProtocol;
            ActivityC45651qj LIZLLL2 = StateOwner.LJLIL.LIZLLL();
            if (LIZLLL2 != null) {
                iSocial2TabProtocolAbility = C53976LGi.LJFF(LIZLLL2);
            } else {
                iSocial2TabProtocolAbility = null;
            }
            if (iSocial2TabProtocolAbility != null && iSocial2TabProtocolAbility.v60()) {
                IBottomTabLayoutAbility LIZIZ = LIZIZ();
                if (LIZIZ != null && !LIZIZ.wY()) {
                    arrayList2.add(iSocialTabProtocol);
                }
            } else if (!o.LJ(iSocialTabProtocol2.getTag(), LJFF2)) {
                arrayList2.add(iSocialTabProtocol);
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            ISocialTabProtocol iSocialTabProtocol3 = (ISocialTabProtocol) it.next();
            this.LIZJ.add(new SingleTabCounter(iSocialTabProtocol3.getTag(), response.tabCount(iSocialTabProtocol3.getTag()), LJI(iSocialTabProtocol3.getTag())));
        }
    }

    public C54004LHk(String socialMainFeedName, boolean z) {
        o.LJIIIZ(socialMainFeedName, "socialMainFeedName");
        this.LIZ = socialMainFeedName;
        this.LIZIZ = z;
        this.LIZJ = new ArrayList<>();
    }

    public void LIZJ(int i, Aweme aweme) {
        SingleTabCounter singleTabCounter;
        Iterator<SingleTabCounter> it = this.LIZJ.iterator();
        while (true) {
            if (it.hasNext()) {
                singleTabCounter = it.next();
                if (o.LJ(singleTabCounter.getTag(), this.LIZ)) {
                    break;
                }
            } else {
                singleTabCounter = null;
                break;
            }
        }
        SingleTabCounter singleTabCounter2 = singleTabCounter;
        if (singleTabCounter2 != null && i != singleTabCounter2.getNumberCount()) {
            singleTabCounter2.setNumberCount(i);
        }
    }
}

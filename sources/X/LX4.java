package X;

import android.text.TextUtils;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tiktok.homepage.mainfragment.ability.IMFSocialAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.panel.FollowFeedFragmentPanelMT;
import com.ss.android.ugc.aweme.feed.ui.FeedFollowFragment;
import com.ss.android.ugc.aweme.follow.presenter.FollowFeed;

/* loaded from: classes10.dex */
public class LX4 extends AbstractC54421LXl<LX3> {
    public final /* synthetic */ FeedFollowFragment LIZIZ;

    @Override // X.AbstractC54421LXl
    public final void LIZ() {
        this.LIZ.LJJ(new C54883LgN());
    }

    @Override // X.AbstractC54421LXl
    public final boolean LIZJ() {
        T t = this.LIZ.LJLIL;
        if (t != 0 && ((C54883LgN) t).LJLJLJ) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC54421LXl
    public final boolean LJFF() {
        T t = this.LIZ.LJLIL;
        if (t != 0 && ((AbstractC51036K1g) t).isDataEmpty()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0059  */
    @Override // X.AbstractC54421LXl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJI() {
        /*
            r7 = this;
            java.lang.String r6 = "feed"
            X.2US r5 = X.C2US.LIZJ(r6)
            T extends X.K1b r0 = r7.LIZ
            T extends X.8BS r0 = r0.LJLIL
            if (r0 == 0) goto L1a
            X.LgN r0 = (X.C54883LgN) r0
            java.util.List<com.ss.android.ugc.aweme.follow.presenter.FollowFeed> r1 = r0.LJLJJLL
            if (r1 == 0) goto L1a
            java.util.concurrent.CopyOnWriteArrayList r1 = (java.util.concurrent.CopyOnWriteArrayList) r1
            int r0 = r1.size()
            if (r0 != 0) goto L5c
        L1a:
            r4 = 0
        L1b:
            boolean r0 = X.C79004UzY.LJJIFFI(r4)
            if (r0 == 0) goto L59
            java.util.List<java.lang.String> r0 = r5.LIZJ
            if (r0 == 0) goto L2a
            java.util.List<java.lang.String> r0 = r5.LIZJ
            r0.clear()
        L2a:
            T extends X.K1b r5 = r7.LIZ
            r4 = 2
            java.lang.Object[] r3 = new java.lang.Object[r4]
            r2 = 0
            r1 = 4
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r3[r2] = r0
            X.2US r0 = X.C2US.LIZJ(r6)
            java.lang.String r0 = r0.LJ()
            r2 = 1
            X.LX6 r1 = X.LX6.LIZIZ(r1, r4, r2, r0)
            X.2US r0 = X.C2US.LIZJ(r6)
            java.lang.String r0 = r0.LIZLLL()
            r1.LJ = r0
            X.LWk r0 = r1.LIZ()
            r3[r2] = r0
            boolean r0 = r5.LJIILL(r3)
            return r0
        L59:
            r5.LIZJ = r4
            goto L2a
        L5c:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r1.iterator()
        L65:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L1b
            java.lang.Object r2 = r3.next()
            X.JXl r2 = (X.AbstractC49325JXl) r2
            int r1 = r2.getFeedType()
            r0 = 65280(0xff00, float:9.1477E-41)
            if (r1 != r0) goto L65
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r2.getAweme()
            java.lang.String r0 = r0.getAid()
            r4.add(r0)
            goto L65
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LX4.LJI():boolean");
    }

    @Override // X.AbstractC54421LXl
    public final void LJIIIIZZ() {
        ((LX3) this.LIZ).LJLJL = true;
    }

    @Override // X.AbstractC54421LXl
    public final void LIZIZ(FollowFeedFragmentPanelMT followFeedFragmentPanelMT) {
        ((LX3) this.LIZ).LJLJJLL = followFeedFragmentPanelMT;
    }

    @Override // X.AbstractC54421LXl
    public final boolean LIZLLL(Object obj) {
        T t = this.LIZ;
        FollowFeed followFeed = new FollowFeed();
        followFeed.setFeedType(1);
        followFeed.setAweme((Aweme) obj);
        return t.LJJIIJZLJL(followFeed, 0);
    }

    @Override // X.AbstractC54421LXl
    public final boolean LJ(Aweme aweme) {
        T t = this.LIZ;
        String authorUid = aweme.getAuthorUid();
        t.getClass();
        if (!TextUtils.isEmpty(authorUid) && ((AbstractC51036K1g) t.LJLIL).getItems() != null) {
            int size = ((AbstractC51036K1g) t.LJLIL).getItems().size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                Aweme aweme2 = ((AbstractC49325JXl) ListProtector.get(((AbstractC51036K1g) t.LJLIL).getItems(), size)).getAweme();
                if (aweme2 != null && TextUtils.equals(authorUid, aweme2.getAuthorUid())) {
                    ListProtector.remove(((AbstractC51036K1g) t.LJLIL).getItems(), size);
                }
            }
        }
        return LIZLLL(aweme);
    }

    @Override // X.AbstractC54421LXl
    public final void LJIIIZ(boolean z) {
        String str;
        boolean z2;
        IMFSocialAbility LJIILLIIL;
        String LIZ = LIQ.LIZ();
        AbsFragment absFragment = this.LIZIZ.LJLJJL;
        if ((absFragment instanceof InterfaceC54054LJi) && (LJIILLIIL = C78929UyL.LJIILLIIL(absFragment)) != null) {
            str = LJIILLIIL.F80();
        } else {
            str = "";
        }
        FeedFollowFragment feedFollowFragment = this.LIZIZ;
        feedFollowFragment.LLIIIZ = z;
        LX3 lx3 = (LX3) this.LIZ;
        ActivityC45651qj mo49getActivity = feedFollowFragment.mo49getActivity();
        if (mo49getActivity == null || !KNV.LJFF(mo49getActivity, "page_feed") || !C54153LNd.LIZIZ(mo49getActivity)) {
            z2 = false;
        } else {
            z2 = true;
        }
        ((C54883LgN) lx3.LJLIL).LJLJI = z;
        lx3.LJLJJL = z;
        lx3.LJLJLJ = !z2;
        T t = this.LIZ;
        LX6 LIZIZ = LX6.LIZIZ(1, 0, 1, C2US.LIZJ("feed").LJ());
        LIZIZ.LJI = str;
        LIZIZ.LJ = LIZ;
        t.LJIILL(1, LIZIZ.LIZ());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LX4(FeedFollowFragment feedFollowFragment, LX3 lx3) {
        super(lx3);
        this.LIZIZ = feedFollowFragment;
    }

    @Override // X.AbstractC54421LXl
    public final void LJII(String str, String str2, String str3) {
        T t = this.LIZ;
        LX6 LIZIZ = LX6.LIZIZ(1, 0, 1, C2US.LIZJ("feed").LJ());
        LIZIZ.LJI = str;
        LIZIZ.LJII = str2;
        LIZIZ.LJ = str2;
        LIZIZ.LJIIIIZZ = str3;
        t.LJIILL(1, LIZIZ.LIZ());
    }
}

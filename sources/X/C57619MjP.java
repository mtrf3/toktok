package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.friends.FriendsFeed;
import com.ss.android.ugc.aweme.relation.feed.TTRecUserBigCardViewModel;
import com.ss.android.ugc.aweme.relation.feed.v4.RecSwipeViewModel;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;

/* renamed from: X.MjP, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57619MjP implements LWY {
    public static final java.util.Map<String, Boolean> LJII = new LinkedHashMap();
    public final TTRecUserBigCardViewModel LIZ;
    public final RecSwipeViewModel LIZIZ;
    public boolean LIZJ;
    public int LIZLLL;
    public int LJ;
    public int LJFF;
    public boolean LJI;

    @Override // X.LWY
    public final void LIZ() {
        XKX.LIZLLL(C48841JEv.LIZ(C36636EZk.LIZ), null, null, new C57621MjR(this, null), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x0249, code lost:
    
        if ((!r3) == false) goto L75;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZJ() {
        /*
            Method dump skipped, instructions count: 602
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57619MjP.LIZJ():boolean");
    }

    public C57619MjP(String str, TTRecUserBigCardViewModel tTRecUserBigCardViewModel, RecSwipeViewModel recSwipeViewModel) {
        this.LIZ = tTRecUserBigCardViewModel;
        this.LIZIZ = recSwipeViewModel;
    }

    @Override // X.LWY
    public final void LIZIZ(int i, boolean z, List list) {
        int i2;
        int i3;
        Aweme aweme;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[tryInsertRecUserInData]\n friendList total count = ");
        LIZ.append(list.size());
        LIZ.append("\n last friend feed size  = ");
        LIZ.append(i);
        LIZ.append("\n hasMore                = ");
        LIZ.append(z);
        C221018lt.LIZ("TTRecUserFriendsTabController", X1D.LIZIZ(LIZ));
        if (i == 0) {
            this.LIZLLL = 0;
            this.LJ = 0;
            this.LJFF = 0;
            this.LJI = false;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("[tryInsertRecUserInData]\n insertIndexForFriendsTab     = ");
        LIZ2.append(this.LIZLLL);
        LIZ2.append("\n totalNumberOfUnViewedVideos  = ");
        LIZ2.append(this.LJ);
        LIZ2.append("\n totalNumberOfHistoryVideos   = ");
        LIZ2.append(this.LJFF);
        C221018lt.LIZ("TTRecUserFriendsTabController", X1D.LIZIZ(LIZ2));
        if (list.isEmpty()) {
            C221018lt.LIZ("TTRecUserFriendsTabController", "[tryInsertRecUserInData] friendList is empty");
            return;
        }
        if (this.LIZJ) {
            C221018lt.LIZ("TTRecUserFriendsTabController", "[tryInsertRecUserInData] has insert in friends tab");
            return;
        }
        if (!LIZJ()) {
            C221018lt.LIZ("TTRecUserFriendsTabController", "[tryInsertRecUserInData] is not match insert common condition");
            return;
        }
        if (C53576L0y.LIZJ()) {
            if (!this.LIZIZ.mv0("homepage_friends")) {
                C221018lt.LIZ("TTRecUserFriendsTabController", "[tryInsertRecUserInData] the rec maf user list is empty, so we do not insert");
                this.LJI = true;
                return;
            }
        } else if (!this.LIZ.gv0()) {
            C221018lt.LIZ("TTRecUserFriendsTabController", "[tryInsertRecUserInData] the rec maf user list is empty, so we do not insert");
            this.LJI = true;
            return;
        }
        if (i > C47261Igj.LJJI(list)) {
            StringBuilder LJ = C7MY.LJ("[tryInsertRecUserInData] lastFriendFeedSize ", i, " > friendList.lastIndex ");
            LJ.append(C47261Igj.LJJI(list));
            C221018lt.LJFF("TTRecUserFriendsTabController", X1D.LIZIZ(LJ));
            return;
        }
        List<FriendsFeed> LLIIZ = ORZ.LLIIZ(list, new C40517FvF(i, C47261Igj.LJJI(list)));
        int i4 = -1;
        int i5 = 0;
        int i6 = 0;
        int i7 = -1;
        int i8 = 0;
        int i9 = 0;
        for (FriendsFeed friendsFeed : LLIIZ) {
            int i10 = i6 + 1;
            InterfaceC55143LkZ LJIIL = C57738MlK.LIZIZ.LJIIL();
            if (friendsFeed != null) {
                aweme = friendsFeed.getAweme();
            } else {
                aweme = null;
            }
            if (LJIIL.LJIIIIZZ(aweme)) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("index = ");
                LIZ3.append(i6);
                LIZ3.append(" and it is UnfollowFamiliarVideo ");
                C221018lt.LIZ("TTRecUserFriendsTabController", X1D.LIZIZ(LIZ3));
                i5++;
            }
            if (friendsFeed.getSource() != 4) {
                i8++;
                i7 = i6;
            } else {
                i9++;
                if (i4 == -1) {
                    i4 = i6;
                }
            }
            i6 = i10;
        }
        if (i5 > 1) {
            C221018lt.LIZ("TTRecUserFriendsTabController", "[tryInsertRecUserInData] numberOfRecommendVideos > 1");
            this.LJI = true;
            return;
        }
        StringBuilder LIZJ = C06460Ne.LIZJ("[tryInsertRecUserInData]\n lastNonHistoryViewedIndex    = ", i7, "\n lastNonHistoryViewedIndex    = ", i7, "\n numberOfRecommendVideos       = ");
        C15890jp.LIZIZ(LIZJ, i5, "\n numberOfUnViewedVideos       = ", i8, "\n numberOfHistoryVideos        = ");
        LIZJ.append(i9);
        C221018lt.LIZ("TTRecUserFriendsTabController", X1D.LIZIZ(LIZJ));
        int i11 = C57626MjW.LIZ().friendsTabConfig.historyFlowPosition;
        int i12 = this.LJFF;
        int i13 = (i11 - i12) - 1;
        this.LJ += i8;
        this.LJFF = i12 + i9;
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("[tryInsertRecUserInData]\n totalNumberOfUnViewedVideos  = ");
        LIZ4.append(this.LJ);
        LIZ4.append("\n totalNumberOfHistoryVideos   = ");
        LIZ4.append(this.LJFF);
        C221018lt.LIZ("TTRecUserFriendsTabController", X1D.LIZIZ(LIZ4));
        if (this.LJI && (this.LJ > 0 || this.LJFF > 0)) {
            C221018lt.LJFF("TTRecUserFriendsTabController", "[tryInsertRecUserInData] useFriendsTabBackupStrategy");
            if (((FriendsFeed) ORZ.LJLLJ(LLIIZ)).getSource() == 4 && this.LJFF <= 0) {
                this.LIZLLL = 0;
            }
            if (((FriendsFeed) ORZ.LJLLJ(LLIIZ)).getSource() == 4 && !z) {
                this.LIZLLL = LLIIZ.size();
            }
            if (((FriendsFeed) ORZ.LJLLJ(LLIIZ)).getSource() != 4 && !z) {
                this.LIZLLL = 0;
            }
        } else {
            if (i4 >= 0 || !z) {
                if (this.LJ > 0 && this.LJFF - i9 <= 0) {
                    this.LIZLLL = i7 + 1;
                } else if (i4 >= 0 && (i2 = i4 + i13) <= LLIIZ.size()) {
                    this.LIZLLL = i2;
                } else if (!z) {
                    this.LIZLLL = LLIIZ.size();
                }
            }
            C221018lt.LIZ("TTRecUserFriendsTabController", "[tryInsertRecUserInData] not meet insert time");
            return;
        }
        this.LIZLLL += i;
        StringBuilder LIZ5 = X1D.LIZ();
        LIZ5.append("[tryInsertRecUserInData] \n insertIndexForFriendsTab = ");
        LIZ5.append(this.LIZLLL);
        LIZ5.append("\n friendList.size          = ");
        LIZ5.append(list.size());
        C221018lt.LIZ("TTRecUserFriendsTabController", X1D.LIZIZ(LIZ5));
        if (this.LIZLLL > list.size()) {
            C221018lt.LIZ("TTRecUserFriendsTabController", "[tryInsertRecUserInData] insertIndexForFriendsTab > friend list size");
            return;
        }
        if (C65777Prh.LJI(list)) {
            FriendsFeed friendsFeed2 = new FriendsFeed(null, 0, null, 0, null, 31, null);
            Aweme aweme2 = new Aweme();
            aweme2.setAid(UUID.randomUUID().toString());
            aweme2.setRecBigCardFakeAweme(true);
            if (C53576L0y.LIZJ()) {
                i3 = 4004;
            } else {
                i3 = 4003;
            }
            aweme2.setAwemeType(i3);
            RecSwipeViewModel recSwipeViewModel = this.LIZIZ;
            recSwipeViewModel.LJLJJL = this.LIZLLL;
            recSwipeViewModel.LJLJJI = 0;
            friendsFeed2.setAweme(aweme2);
            ListProtector.add(list, this.LIZLLL, friendsFeed2);
            this.LIZJ = true;
            C221018lt.LIZ("TTRecUserFriendsTabController", "[tryInsertRecUserInData] finish rec big card insert");
        }
    }
}

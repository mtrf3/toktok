package X;

import com.ss.android.ugc.aweme.relation.feed.v4.RecSwipeViewModel;
import kotlin.jvm.internal.AqS175S0100000_9;

/* renamed from: X.MjO, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57618MjO implements InterfaceC54390LWg {
    public final RecSwipeViewModel LIZ;
    public boolean LIZIZ;
    public boolean LIZLLL;
    public int LJ;
    public final C62822Ol8 LIZJ = C221108m2.LIZIZ(C57658Mk2.LJLIL);
    public int LJFF = -1;

    public final boolean LIZJ() {
        int i;
        int i2;
        int i3;
        AbstractC57637Mjh abstractC57637Mjh = (AbstractC57637Mjh) this.LIZJ.getValue();
        abstractC57637Mjh.getClass();
        if (!((RBX) HG3.LJIILL()).isLogin() || !((Boolean) C52796Kno.LIZ.getValue()).booleanValue()) {
            return false;
        }
        if (!abstractC57637Mjh.LIZIZ()) {
            if (C53815LAd.LIZIZ() && 1 <= (i = C57644Mjo.LIZ().strategy) && i < 3) {
                if (C57644Mjo.LIZ().strategy == 1 && (i2 = C53815LAd.LIZ.getInt(C53815LAd.LIZ("rcmd_new_user_protection_cold_start_count"), 0)) <= (i3 = C57644Mjo.LIZ().coldStartCountLimit)) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("[needNewUserProtect] coldCnt is ");
                    LIZ.append(i2);
                    LIZ.append(", limit is ");
                    LIZ.append(i3);
                    C221018lt.LIZ("RecBigCardConditionUtil", X1D.LIZIZ(LIZ));
                    return false;
                }
                if (C57644Mjo.LIZ().strategy == 2) {
                    long currentTimeMillis = System.currentTimeMillis() - C53815LAd.LIZ.getLong(C53815LAd.LIZ("rcmd_new_user_protection_first_launch_time"), 0L);
                    if (currentTimeMillis <= C57644Mjo.LIZ().coldStartHourLimit * 3600000) {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("[needNewUserProtect] cur time slot is ");
                        LIZ2.append(((float) currentTimeMillis) / ((float) 3600000));
                        C221018lt.LIZ("RecBigCardConditionUtil", X1D.LIZIZ(LIZ2));
                        return false;
                    }
                }
            }
            if (!abstractC57637Mjh.LIZJ() || !abstractC57637Mjh.LIZ()) {
                return false;
            }
            if (!C57626MjW.LIZLLL() && !C57600Mj6.LIZ("homepage_hot")) {
                C221018lt.LIZ("RecBigCardConditionUtil", "[checkIfShowInFYPPage] has been shown in fyp");
                return false;
            }
            int friendCount = abstractC57637Mjh.LIZ.getFriendCount();
            if (!C57626MjW.LIZ().isWorkForHighMuf && friendCount > 60) {
                C221018lt.LIZ("RecBigCardConditionUtil", "[checkFriendCntIfHighMufNotEnable] Exceeding the limit number");
                return false;
            }
        }
        return true;
    }

    @Override // X.InterfaceC54390LWg
    public final void LIZ() {
        if (LIZJ() && !this.LIZ.mv0("homepage_follow")) {
            C221018lt.LJFF("FollowFeedRecUserBigCardController", "[fetchRecUserData] meet fetch condition");
            RecSwipeViewModel recSwipeViewModel = this.LIZ;
            recSwipeViewModel.getClass();
            recSwipeViewModel.withState(new AqS175S0100000_9(recSwipeViewModel, 603));
        }
    }

    public C57618MjO(RecSwipeViewModel recSwipeViewModel) {
        this.LIZ = recSwipeViewModel;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0066  */
    @Override // X.InterfaceC54390LWg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(int r8, int r9, java.util.List r10, java.util.List r11) {
        /*
            r7 = this;
            java.lang.String r0 = "allFeedList"
            kotlin.jvm.internal.o.LJIIIZ(r10, r0)
            java.lang.String r0 = "currentFeedList"
            kotlin.jvm.internal.o.LJIIIZ(r11, r0)
            boolean r0 = r7.LIZIZ
            java.lang.String r1 = "FollowFeedRecUserBigCardController"
            if (r0 == 0) goto L16
            java.lang.String r0 = "[insertRecUserData] has inserted before"
            X.C221018lt.LIZ(r1, r0)
            return
        L16:
            boolean r0 = r7.LIZJ()
            if (r0 != 0) goto L22
            java.lang.String r0 = "[insertRecUserData] doesn't meet common conditions"
            X.C221018lt.LIZ(r1, r0)
            return
        L22:
            com.ss.android.ugc.aweme.relation.feed.v4.RecSwipeViewModel r2 = r7.LIZ
            java.lang.String r0 = "homepage_follow"
            boolean r0 = r2.mv0(r0)
            r2 = 1
            if (r0 != 0) goto L3b
            java.lang.String r0 = "[insertRecUserData] big card data is not returned"
            X.C221018lt.LIZ(r1, r0)
            r7.LIZLLL = r2
            int r0 = r7.LJ
            int r0 = r0 + 1
            r7.LJ = r0
            return
        L3b:
            r0 = -1
            r6 = 0
            if (r8 != r0) goto L4d
            if (r9 != r2) goto L47
            int r5 = r11.size()
        L45:
            if (r5 != 0) goto L66
        L47:
            java.lang.String r0 = "[insertRecUserData] no new videos, not insert big card"
            X.C221018lt.LIZ(r1, r0)
            return
        L4d:
            int r3 = r10.size()
            int r0 = r11.size()
            int r3 = r3 - r0
            if (r8 >= r3) goto L59
            goto L47
        L59:
            int r5 = r8 + 1
            int r3 = r10.size()
            int r0 = r11.size()
            int r3 = r3 - r0
            int r5 = r5 - r3
            goto L45
        L66:
            boolean r0 = r7.LIZLLL
            if (r0 == 0) goto Lc5
            int r4 = r11.size()
            int r3 = r7.LJ
            if (r3 == r2) goto L76
            r0 = 2
            if (r3 == r0) goto Lc3
            r6 = r4
        L76:
            r7.LJFF = r6
        L78:
            com.ss.android.ugc.aweme.relation.feed.v4.RecSwipeViewModel r3 = r7.LIZ
            int r4 = r7.LJFF
            r3.LJLJJL = r4
            int r0 = r7.LJ
            int r0 = r0 + 1
            r3.LJLJJI = r0
            int r3 = r10.size()
            int r0 = r11.size()
            int r3 = r3 - r0
            int r3 = r3 + r4
            r7.LJFF = r3
            com.ss.android.ugc.aweme.follow.presenter.FollowFeed r4 = new com.ss.android.ugc.aweme.follow.presenter.FollowFeed
            r4.<init>()
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = new com.ss.android.ugc.aweme.feed.model.Aweme
            r3.<init>()
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            r3.setAid(r0)
            r3.setRecBigCardFakeAweme(r2)
            r0 = 4004(0xfa4, float:5.611E-42)
            r3.setAwemeType(r0)
            r4.setAweme(r3)
            r0 = 65280(0xff00, float:9.1477E-41)
            r4.setFeedType(r0)
            int r0 = r7.LJFF
            com.bytedance.mt.protector.impl.collections.ListProtector.add(r10, r0, r4)
            r7.LIZIZ = r2
            java.lang.String r0 = "[insertRecUserData] finish rec big card insert"
            X.C221018lt.LIZ(r1, r0)
            return
        Lc3:
            r6 = r5
            goto L76
        Lc5:
            com.ss.android.ugc.aweme.relation.feed.RecUserBigCardConfig r0 = X.C57626MjW.LIZ()
            com.ss.android.ugc.aweme.relation.feed.FollowFeedConfig r0 = r0.followFeedConfig
            int r0 = r0.unreadInsertPosition
            if (r5 >= r0) goto Ld2
        Lcf:
            r7.LJFF = r5
            goto L78
        Ld2:
            com.ss.android.ugc.aweme.relation.feed.RecUserBigCardConfig r0 = X.C57626MjW.LIZ()
            com.ss.android.ugc.aweme.relation.feed.FollowFeedConfig r0 = r0.followFeedConfig
            int r5 = r0.unreadInsertPosition
            goto Lcf
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57618MjO.LIZIZ(int, int, java.util.List, java.util.List):void");
    }
}

package X;

import Y.AObjectS54S0101000_9;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.relation.feed.TTRecUserBigCardViewModel;
import com.ss.android.ugc.aweme.relation.feed.v4.RecSwipeViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.MjQ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57620MjQ implements InterfaceC55018LiY {
    public static final java.util.Map<String, Boolean> LIZLLL = new LinkedHashMap();
    public final TTRecUserBigCardViewModel LIZ;
    public final RecSwipeViewModel LIZIZ;
    public int LIZJ;

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0190, code lost:
    
        if (java.lang.System.currentTimeMillis() >= (((((X.C57626MjW.LIZ().fypConfig.interval * 24) * 60) * 60) * 1000) + X.C60952aJ.LIZ().getLong("timestamp_of_maf_video_impression", 0))) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0249, code lost:
    
        if (r3 == false) goto L64;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZJ() {
        /*
            Method dump skipped, instructions count: 703
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57620MjQ.LIZJ():boolean");
    }

    @Override // X.InterfaceC55018LiY
    public final void LIZ() {
        boolean z;
        if (!LIZJ() || (!C53576L0y.LIZJ() ? this.LIZ.gv0() : this.LIZIZ.mv0("homepage_hot"))) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            C221018lt.LJFF("RecSwipeViewModel", "[fetchRecUserData] is not match fetch condition");
            return;
        }
        C221018lt.LJFF("RecSwipeViewModel", "[fetchRecUserData] start");
        if (C53576L0y.LIZJ()) {
            C221018lt.LIZ("RecSwipeViewModel", "begin manual refresh");
            RecSwipeViewModel recSwipeViewModel = this.LIZIZ;
            recSwipeViewModel.getClass();
            recSwipeViewModel.withState(new AqS175S0100000_9(recSwipeViewModel, 603));
            return;
        }
        TTRecUserBigCardViewModel tTRecUserBigCardViewModel = this.LIZ;
        tTRecUserBigCardViewModel.hv0().reset();
        ((ArrayList) tTRecUserBigCardViewModel.LJLIL).clear();
        tTRecUserBigCardViewModel.LJLJI = null;
        tTRecUserBigCardViewModel.LJLJJI = 0;
        tTRecUserBigCardViewModel.LJLJJL = 0;
        XKX.LIZLLL(ViewModelKt.getViewModelScope(tTRecUserBigCardViewModel), C36636EZk.LIZ, null, new C57631Mjb(tTRecUserBigCardViewModel, null), 2);
    }

    public C57620MjQ(String eventType, TTRecUserBigCardViewModel tTRecUserBigCardViewModel, RecSwipeViewModel recSwipeViewModel) {
        o.LJIIIZ(eventType, "eventType");
        this.LIZ = tTRecUserBigCardViewModel;
        this.LIZIZ = recSwipeViewModel;
    }

    @Override // X.InterfaceC55018LiY
    public final void LIZIZ(int i, List list, String str, AObjectS54S0101000_9 aObjectS54S0101000_9) {
        int i2;
        if (i == 0) {
            this.LIZJ = 0;
        }
        StringBuilder LJ = C7MY.LJ("[tryInsertRecUserInData] indexOfFlow is ", i, " aweme list size is ");
        LJ.append(list.size());
        C221018lt.LJFF("RecSwipeViewModel", X1D.LIZIZ(LJ));
        int i3 = C57626MjW.LIZ().fypConfig.flowIndex - 1;
        StringBuilder LIZJ = C06460Ne.LIZJ("[isMeetBatch]\n current indexOfFlow       = ", i, "\n config  configIndexOfFlow = ", i3, "\n insert Page Offset         = ");
        LIZJ.append(this.LIZJ);
        C221018lt.LIZ("RecSwipeViewModel", X1D.LIZIZ(LIZJ));
        if (i == i3 + this.LIZJ) {
            if (!LIZJ()) {
                C221018lt.LJFF("RecSwipeViewModel", "[tryInsertRecUserInData] is not match insert common condition");
                return;
            }
            if (!C57626MjW.LIZLLL() && ((Boolean) aObjectS54S0101000_9.invoke()).booleanValue()) {
                C221018lt.LJFF("RecSwipeViewModel", "[tryInsertRecUserInData] last data contains maf videos");
                return;
            }
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                int i4 = 0;
                while (it.hasNext()) {
                    if (((Aweme) it.next()).isAd() && (i4 = i4 + 1) < 0) {
                        C47261Igj.LJJJJIZL();
                        throw null;
                    }
                }
                if (i4 >= 2) {
                    C221018lt.LJFF("RecSwipeViewModel", "[tryInsertRecUserInData] the count of ad aweme >= 2, so we increase the insert page offset");
                    this.LIZJ++;
                    return;
                }
            }
            if (C53576L0y.LIZJ()) {
                if (!this.LIZIZ.mv0("homepage_hot")) {
                    C221018lt.LJFF("RecSwipeViewModel", "[swipe][tryInsertRecUserInData] the rec maf user list is empty, so we increase the insert page offset");
                    this.LIZJ++;
                    return;
                }
            } else if (!this.LIZ.gv0()) {
                C221018lt.LJFF("RecSwipeViewModel", "[tryInsertRecUserInData] the rec maf user list is empty, so we increase the insert page offset");
                this.LIZJ++;
                return;
            }
            int i5 = C57626MjW.LIZ().fypConfig.flowPosition - 1;
            if (i5 >= 0 && i5 < list.size() && ((Aweme) ListProtector.get(list, i5)).isAd()) {
                C221018lt.LJFF("RecSwipeViewModel", "[calculateInsertPos current aweme is ad, so we choose the backup insert position");
                i5 = C57626MjW.LIZ().fypConfig.backUpFlowPosition - 1;
            }
            int size = list.size();
            if (i5 > size) {
                i5 = size;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("[calculateInsertPos] insertIndex = ");
            LIZ.append(i5);
            C221018lt.LJFF("RecSwipeViewModel", X1D.LIZIZ(LIZ));
            if (i5 < 0) {
                C221018lt.LJFF("RecSwipeViewModel", "[tryInsertRecUserInData] insertPos = " + i5 + " illegal");
                return;
            }
            if (C57626MjW.LIZLLL()) {
                if (!list.isEmpty()) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        if (C57738MlK.LIZIZ.LJIIL().LJIIIIZZ((Aweme) it2.next())) {
                            C221018lt.LJFF("RecSwipeViewModel", "[tryInsertRecUserInData] current refresh data contains maf video, so we increase the insert page offset");
                            this.LIZJ++;
                            return;
                        }
                    }
                }
            } else {
                Iterator it3 = list.iterator();
                int i6 = 0;
                while (true) {
                    if (it3.hasNext()) {
                        if (C57738MlK.LIZIZ.LJIIL().LJIIIIZZ((Aweme) it3.next())) {
                            break;
                        } else {
                            i6++;
                        }
                    } else {
                        i6 = -1;
                        break;
                    }
                }
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("[tryInsertRecUserInData] firstMafIndex = ");
                LIZ2.append(i6);
                C221018lt.LJFF("RecSwipeViewModel", X1D.LIZIZ(LIZ2));
                if (i6 >= 0 && i6 <= i5) {
                    C221018lt.LJFF("RecSwipeViewModel", "[tryInsertRecUserInData]  Before that came the unfollow maf video");
                    return;
                }
            }
            if (C65777Prh.LJI(list)) {
                Aweme aweme = new Aweme();
                aweme.setAid(UUID.randomUUID().toString());
                aweme.setRecBigCardFakeAweme(true);
                if (C53576L0y.LIZJ()) {
                    i2 = 4004;
                } else {
                    i2 = 4003;
                }
                aweme.setAwemeType(i2);
                RecSwipeViewModel recSwipeViewModel = this.LIZIZ;
                recSwipeViewModel.LJLJI = i5;
                recSwipeViewModel.LJLILLLLZI = i;
                ListProtector.add(list, i5, aweme);
                C221018lt.LJFF("RecSwipeViewModel", "[tryInsertRecUserInData] finish rec big card insert");
                C2ZZ.LJII("friend_recommendation_card", aweme, str);
                return;
            }
            return;
        }
        C221018lt.LJFF("RecSwipeViewModel", "[tryInsertRecUserInData] is not meet batch");
    }
}

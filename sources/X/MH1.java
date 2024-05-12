package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.awemeservice.RequestIdService;
import com.ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import com.ss.android.ugc.aweme.challenge.model.ChallengeAwemeList;
import com.ss.android.ugc.aweme.challenge.model.MixCardStruct;
import com.ss.android.ugc.aweme.challenge.model.RoomStructV2;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import defpackage.s1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MH1 extends AbstractC51036K1g<Aweme, ChallengeAwemeList> {
    public static final HashMap<String, String> LJLJL = new HashMap<>();
    public String LJLIL;
    public int LJLILLLLZI;
    public List<Aweme> LJLJJI;
    public String LJLJI = "challenge_video";
    public final HDM LJLJJL = new HDM();
    public long LJLJJLL = 0;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC51036K1g
    public final List<Aweme> getItems() {
        List<Aweme> list;
        ArrayList arrayList = new ArrayList();
        if (!C79004UzY.LJJIFFI(this.LJLJJI)) {
            arrayList.addAll(this.LJLJJI);
        }
        T t = this.mData;
        if (t == 0) {
            list = null;
        } else {
            list = ((ChallengeAwemeList) t).items;
        }
        if (!C79004UzY.LJJIFFI(list)) {
            arrayList.addAll(list);
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC51036K1g
    public final boolean isDataEmpty() {
        T t = this.mData;
        if ((t == 0 || !((ChallengeAwemeList) t).isHasMore()) && C79004UzY.LJJIFFI(getItems())) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC51036K1g
    public final boolean isHasMore() {
        T t = this.mData;
        if (t != 0 && ((ChallengeAwemeList) t).isHasMore()) {
            return true;
        }
        return false;
    }

    @Override // X.C8BS
    public final boolean checkParams(Object... objArr) {
        if (objArr != null && objArr.length >= 4) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC51036K1g
    public final boolean deleteItem(Aweme aweme) {
        return C78996UzQ.LJIIIIZZ(getItems(), aweme, this.mNotifyListeners);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [T, com.ss.android.ugc.aweme.challenge.model.ChallengeAwemeList] */
    @Override // X.C8BS
    public final void handleData(Object obj) {
        List<Aweme> list;
        boolean z;
        Aweme aweme;
        String str;
        ?? r10 = (ChallengeAwemeList) obj;
        if (r10 != 0 && this.mListQueryType == 1) {
            LogPbBean logPbBean = r10.logPb;
            if (logPbBean == null) {
                this.LJLIL = "";
            } else {
                this.LJLIL = logPbBean.getImprId();
            }
        }
        C3A5.LIZ.LJFF(r10.getRequestId(), r10.logPb);
        List<MixCardStruct> list2 = r10.mixList;
        if (list2 == null || list2.isEmpty()) {
            list = r10.items;
        } else {
            List<MixCardStruct> list3 = r10.mixList;
            ArrayList LIZIZ = s1.LIZIZ(list3, "challengeAwemeList.mixList");
            Iterator<MixCardStruct> it = list3.iterator();
            if (!it.hasNext()) {
                ArrayList arrayList = new ArrayList(C32I.LJJL(LIZIZ, 10));
                Iterator it2 = LIZIZ.iterator();
                while (it2.hasNext()) {
                    MixCardStruct mixCardStruct = (MixCardStruct) it2.next();
                    if (mixCardStruct.isLive()) {
                        aweme = new Aweme();
                        aweme.setAwemeType(101);
                        RoomStructV2 roomInfo = mixCardStruct.getRoomInfo();
                        Long l = null;
                        if (roomInfo != null) {
                            str = roomInfo.getRawdata();
                        } else {
                            str = null;
                        }
                        aweme.setNewLiveRoomDataStr(str);
                        StringBuilder sb = new StringBuilder("");
                        LiveRoomStruct newLiveRoomData = aweme.getNewLiveRoomData();
                        if (newLiveRoomData != null) {
                            l = Long.valueOf(newLiveRoomData.id);
                        }
                        sb.append(l);
                        aweme.setAid(sb.toString());
                        aweme.setRequestId(r10.getRequestId());
                    } else {
                        aweme = mixCardStruct.getAweme();
                        o.LJI(aweme);
                    }
                    arrayList.add(aweme);
                }
                list = ORZ.LLJILJILJ(arrayList);
            } else {
                it.next();
                throw null;
            }
        }
        r10.items = list;
        if (C79004UzY.LJJIFFI(list) && !r10.isHasMore()) {
            z = true;
        } else {
            z = false;
        }
        this.mIsNewDataEmpty = z;
        if (!z) {
            if (list != null) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    Aweme R1 = AwemeService.LIZ().R1((Aweme) ListProtector.get(list, i));
                    R1.setIsTop(((Aweme) ListProtector.get(list, i)).getIsTop());
                    if (R1.getAid() != null) {
                        LJLJL.put(R1.getAid(), this.LJLIL);
                    }
                    IRequestIdService LJ = RequestIdService.LJ();
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(R1.getAid());
                    LIZ.append(this.LJLILLLLZI + 3000);
                    LJ.LIZJ(i, X1D.LIZIZ(LIZ), r10.getRequestId());
                    ListProtector.set(list, i, R1);
                }
            }
            int i2 = this.mListQueryType;
            if (i2 != 1) {
                if (i2 != 4) {
                    return;
                }
                if (list != null) {
                    if (C79004UzY.LJJIFFI(((ChallengeAwemeList) this.mData).items)) {
                        ((ChallengeAwemeList) this.mData).items = list;
                    } else {
                        C56544MHc.LIZ(((ChallengeAwemeList) this.mData).items, list, new InterfaceC88471Ynr() { // from class: X.2Lk
                            @Override // X.InterfaceC88471Ynr
                            public final Object invoke(Object obj2, Object obj3) {
                                return Boolean.valueOf(TextUtils.equals(((Aweme) obj2).getAid(), ((Aweme) obj3).getAid()));
                            }
                        });
                    }
                }
                ChallengeAwemeList challengeAwemeList = (ChallengeAwemeList) this.mData;
                challengeAwemeList.cursor = r10.cursor;
                challengeAwemeList.hasMore = r10.hasMore & challengeAwemeList.hasMore;
                return;
            }
            this.mData = r10;
            return;
        }
        T t = this.mData;
        if (t != 0) {
            ((ChallengeAwemeList) t).hasMore = 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC51036K1g
    public final void loadMoreList(Object... objArr) {
        long j;
        String str = (String) objArr[1];
        if (isDataEmpty()) {
            j = 0;
        } else {
            j = ((ChallengeAwemeList) this.mData).cursor;
        }
        LJIIIZ(str, j, ((Integer) objArr[2]).intValue(), ((Boolean) objArr[3]).booleanValue(), this.LJLIL, false);
    }

    @Override // X.AbstractC51036K1g
    public final void refreshList(Object... objArr) {
        if (objArr.length >= 6) {
            LJIIIZ((String) objArr[1], 0L, ((Integer) objArr[2]).intValue(), ((Boolean) objArr[3]).booleanValue(), null, ((Boolean) objArr[5]).booleanValue());
        } else {
            LJIIIZ((String) objArr[1], 0L, ((Integer) objArr[2]).intValue(), ((Boolean) objArr[3]).booleanValue(), null, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, com.ss.android.ugc.aweme.challenge.model.ChallengeAwemeList] */
    @Override // X.AbstractC51036K1g
    public final void setItems(List<Aweme> list) {
        if (this.mData == 0) {
            this.mData = new ChallengeAwemeList();
        }
        T t = this.mData;
        ((ChallengeAwemeList) t).hasMore = 1;
        ((ChallengeAwemeList) t).items = list;
    }

    public final void LJIIIZ(String str, long j, int i, boolean z, String str2, boolean z2) {
        this.LJLILLLLZI = i;
        if (!z2) {
            MH2 mh2 = MH2.LIZ;
            String str3 = this.LJLJI;
            mh2.getClass();
            MH2.LIZ(i, str, str3, str2, z, j);
            if (j == 0) {
                FRW.LIZIZ(-1L, "cd_hit_cache");
            }
        }
        this.LJLJJL.getClass();
        this.LJLJJL.getClass();
        this.LJLJJL.getClass();
        this.LJLJJL.getClass();
        this.LJLJJL.getClass();
        this.LJLJJL.getClass();
        this.LJLJJL.getClass();
        this.LJLJJL.getClass();
        this.LJLJJL.getClass();
        FGR.LIZIZ().LIZ(this.mHandler, new HDL(this, str, j, i, z, str2), 0);
    }
}

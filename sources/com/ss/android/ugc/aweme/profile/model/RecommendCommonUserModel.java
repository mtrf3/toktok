package com.ss.android.ugc.aweme.profile.model;

import X.AbstractC57537Mi5;
import X.C182587Eo;
import X.C3A5;
import X.C54960Lhc;
import X.HG3;
import X.RBY;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.friends.model.RecommendList;
import com.ss.android.ugc.aweme.social.api.IRecommendUserApi;
import com.ss.android.ugc.aweme.social.api.RecommendUserApiService;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public class RecommendCommonUserModel extends AbstractC57537Mi5<RecommendList> {
    public int newUserCount;
    public List<String> userIdList;
    public HashSet<String> mShownUserIds = new HashSet<>();
    public boolean isNewFindFriendsPage = false;
    public final IRecommendUserApi mRecommendApi = RecommendUserApiService.LIZIZ;

    private int getScenarioFromRecommendType(int i) {
        if (i == 4) {
            return 16;
        }
        if (i != 13) {
            return i != 21 ? 0 : 3;
        }
        return 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void removeFollowedUser() {
        T t = this.mData;
        if (t != 0 && !((RecommendList) t).getUserList().isEmpty()) {
            List<User> userList = ((RecommendList) this.mData).getUserList();
            int size = userList.size();
            int i = 0;
            while (i < size) {
                if (((User) ListProtector.get(userList, i)).getFollowStatus() != 0) {
                    ListProtector.remove(userList, i);
                    size--;
                    i--;
                }
                i++;
            }
            ((RecommendList) this.mData).setUserList(userList);
        }
    }

    public void resetShownUserIds() {
        this.mShownUserIds.clear();
        this.newUserCount = 0;
    }

    public int getUserImprOrder(String str) {
        List<String> list = this.userIdList;
        if (list != null) {
            return list.indexOf(str);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC57537Mi5
    public void handleData(RecommendList recommendList) {
        if (recommendList == 0) {
            return;
        }
        LogPbBean logPb = recommendList.getLogPb();
        if (recommendList.getUserList() != null && logPb != null) {
            Iterator<User> it = recommendList.getUserList().iterator();
            while (it.hasNext()) {
                it.next().setRequestId(logPb.getImprId());
            }
        }
        int i = this.mQueryType;
        if (i == 1) {
            this.newUserCount = 0;
            super.handleData((RecommendCommonUserModel) recommendList);
            Iterator<User> it2 = recommendList.getUserList().iterator();
            while (it2.hasNext()) {
                User next = it2.next();
                if (this.mShownUserIds.contains(next.getUid())) {
                    it2.remove();
                } else {
                    this.mShownUserIds.add(next.getUid());
                }
            }
        } else if (i == 4) {
            T t = this.mData;
            if (t != 0) {
                List<User> userList = ((RecommendList) t).getUserList();
                List<User> inviterList = ((RecommendList) this.mData).getInviterList();
                int size = userList.size();
                for (User user : recommendList.getUserList()) {
                    if (!this.mShownUserIds.contains(user.getUid())) {
                        userList.add(user);
                        this.mShownUserIds.add(user.getUid());
                    }
                }
                inviterList.addAll(recommendList.getInviterList());
                this.newUserCount = userList.size() - size;
                this.mData = recommendList;
                recommendList.setUserList(userList);
                ((RecommendList) this.mData).setInviterList(inviterList);
            } else {
                this.mData = recommendList;
            }
        }
        List<String> list = this.userIdList;
        if (list == null) {
            this.userIdList = new ArrayList();
        } else {
            list.clear();
        }
        if (recommendList.getUserList() != null) {
            Iterator<User> it3 = recommendList.getUserList().iterator();
            while (it3.hasNext()) {
                this.userIdList.add(it3.next().getUid());
            }
        }
        C3A5.LIZ.LJFF(recommendList.getRid(), recommendList.getLogPb());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void removeData(User user) {
        T t = this.mData;
        if (t != 0 && !((RecommendList) t).getUserList().isEmpty()) {
            List<User> userList = ((RecommendList) this.mData).getUserList();
            userList.remove(user);
            ((RecommendList) this.mData).setUserList(userList);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setData(List<User> list) {
        T t = this.mData;
        if (t != 0) {
            ((RecommendList) t).setUserList(list);
        }
    }

    public void setRecommendList(RecommendList recommendList) {
        this.mQueryType = 1;
        handleData(recommendList);
    }

    public void fetchData(int i, String str, int i2, int i3, int i4, int i5, String str2, int i6) {
        int i7;
        if (!this.mIsLoading) {
            if (((RBY) HG3.LJIILL()).isUidContactPermisioned()) {
                i7 = 1;
            } else {
                i7 = 2;
            }
            this.mIsLoading = true;
            this.mQueryType = 1;
            this.mRecommendApi.recommendList(Integer.valueOf(i), (Integer) 0, str, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i7), C54960Lhc.LIZ.LIZJ(), str2, i6).LIZLLL(new C182587Eo(this.mHandler));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void loadMore(int i, String str, int i2, int i3, int i4, int i5, String str2, String str3) {
        int cursor;
        if (!this.mIsLoading) {
            this.mIsLoading = true;
            this.mQueryType = 4;
            T t = this.mData;
            if (t == 0) {
                cursor = 0;
            } else {
                cursor = ((RecommendList) t).getCursor();
            }
            fetchData(i, str, cursor, i2, i3, i4, null, i5, str2, str3, false);
        }
    }

    private void fetchData(int i, String str, int i2, int i3, int i4, int i5, String str2, int i6, String str3, String str4, boolean z) {
        int i7;
        if (((RBY) HG3.LJIILL()).isUidContactPermisioned()) {
            i7 = 1;
        } else {
            i7 = 2;
        }
        this.mRecommendApi.recommendList(Integer.valueOf(i), Integer.valueOf(i2), str, Integer.valueOf(i3), 1, Integer.valueOf(i7), C54960Lhc.LIZ.LIZJ(), str2, str3, str4).LIZLLL(new C182587Eo(this.mHandler));
    }

    public void refreshRecommendUser(int i, String str, int i2, int i3, int i4, String str2, int i5, String str3, String str4, String str5, boolean z) {
        if (!this.mIsLoading) {
            this.mIsLoading = true;
            this.mQueryType = 1;
            fetchData(i, str, 0, i2, i3, i4, str2, i5, str3, str4, z);
        }
    }
}

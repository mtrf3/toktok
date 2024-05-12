package com.ss.android.ugc.aweme.feed.model;

import X.AbstractC51036K1g;
import X.C2U8;
import X.C54426LXq;
import X.C73969T1h;
import X.InterfaceC64592gB;
import X.LY5;
import X.LYS;
import X.T16;
import android.os.Message;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.api.FollowFeedApi;
import com.ss.android.ugc.aweme.feed.module.FollowingInterestFeedResponse;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class FollowingFeedListModel extends AbstractC51036K1g<Aweme, FollowingInterestFeedResponse> {
    public final List<String> blueDotList;
    public int footerNextCursor;
    public String footerUid;
    public boolean hasMoreFooter;
    public boolean hasMoreHeader;
    public int headerNextCursor;
    public String headerUid;
    public final List<String> uidList;

    @Override // X.C8BS
    public boolean checkParams(Object... params) {
        o.LJIIIZ(params, "params");
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC51036K1g
    public List<Aweme> getItems() {
        FollowingInterestFeedResponse followingInterestFeedResponse = (FollowingInterestFeedResponse) this.mData;
        if (followingInterestFeedResponse != null) {
            return followingInterestFeedResponse.getAwemeList();
        }
        return null;
    }

    @Override // X.AbstractC51036K1g
    public boolean isHasMore() {
        return this.hasMoreFooter;
    }

    @Override // X.AbstractC51036K1g
    public void loadLatestList(Object... params) {
        o.LJIIIZ(params, "params");
        if (!this.hasMoreHeader) {
            Message obtainMessage = this.mHandler.obtainMessage(0);
            o.LJIIIIZZ(obtainMessage, "mHandler.obtainMessage(MSG_REQUEST)");
            obtainMessage.obj = new Exception() { // from class: X.8pa
            };
            this.mHandler.sendMessage(obtainMessage);
            return;
        }
        loadList(this.headerNextCursor, this.headerUid, 3);
    }

    @Override // X.AbstractC51036K1g
    public void loadMoreList(Object... params) {
        o.LJIIIZ(params, "params");
        if (!this.hasMoreFooter) {
            return;
        }
        loadList(this.footerNextCursor, this.footerUid, 2);
    }

    @Override // X.AbstractC51036K1g
    public void refreshList(Object... params) {
        String str;
        o.LJIIIZ(params, "params");
        Object obj = params[1];
        if (!(obj instanceof String) || (str = (String) obj) == null) {
            return;
        }
        loadList(0, str, 1);
    }

    public FollowingFeedListModel(List<String> uidList, List<String> blueDotList) {
        o.LJIIIZ(uidList, "uidList");
        o.LJIIIZ(blueDotList, "blueDotList");
        this.uidList = uidList;
        this.blueDotList = blueDotList;
        this.headerUid = "";
        this.footerUid = "";
    }

    private final void loadList(final int i, final String str, final int i2) {
        int i3;
        boolean z;
        if (i2 == 3) {
            i3 = 1;
        } else {
            i3 = 2;
        }
        Iterator<String> it = this.uidList.iterator();
        int i4 = 0;
        while (true) {
            if (it.hasNext()) {
                if (ujb.o.LJJJJIZL(it.next(), str, true)) {
                    break;
                } else {
                    i4++;
                }
            } else {
                i4 = -1;
                break;
            }
        }
        if (i4 < this.blueDotList.size() && ujb.o.LJJJJIZL((String) ListProtector.get(this.blueDotList, i4), "true", true)) {
            z = true;
        } else {
            z = false;
        }
        FollowFeedApi.LIZ.getClass();
        final boolean z2 = z;
        LY5.LIZ().getFollowingInterestFeed(i, 8, str, i3, 2, z).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new InterfaceC64592gB() { // from class: com.ss.android.ugc.aweme.feed.model.FollowingFeedListModel$loadList$1
            @Override // X.InterfaceC64592gB
            public final void accept(FollowingInterestFeedResponse followingInterestFeedResponse) {
                boolean z3 = true;
                if (followingInterestFeedResponse.getCode() != 0) {
                    Message obtainMessage = FollowingFeedListModel.this.mHandler.obtainMessage(0);
                    o.LJIIIIZZ(obtainMessage, "mHandler.obtainMessage(MSG_REQUEST)");
                    obtainMessage.obj = new RuntimeException(followingInterestFeedResponse.getMsg());
                    FollowingFeedListModel.this.mHandler.sendMessage(obtainMessage);
                    FollowingFeedListModel.this.mIsNewDataEmpty = true;
                    return;
                }
                int i5 = i2;
                int i6 = -1;
                if (i5 == 1) {
                    List<String> list = FollowingFeedListModel.this.uidList;
                    String str2 = str;
                    Iterator<String> it2 = list.iterator();
                    int i7 = 0;
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        if (ujb.o.LJJJJIZL(it2.next(), str2, true)) {
                            i6 = i7;
                            break;
                        }
                        i7++;
                    }
                    FollowingFeedListModel followingFeedListModel = FollowingFeedListModel.this;
                    followingFeedListModel.hasMoreHeader = true;
                    if (i6 == 0) {
                        followingFeedListModel.hasMoreHeader = false;
                    } else {
                        followingFeedListModel.headerUid = (String) ListProtector.get(followingFeedListModel.uidList, i6 - 1);
                        FollowingFeedListModel.this.headerNextCursor = 0;
                    }
                    FollowingFeedListModel.this.hasMoreFooter = true;
                    if (followingInterestFeedResponse.getHasMore()) {
                        FollowingFeedListModel followingFeedListModel2 = FollowingFeedListModel.this;
                        followingFeedListModel2.footerUid = str;
                        followingFeedListModel2.footerNextCursor = followingInterestFeedResponse.getNextCursor();
                    } else if (i6 == FollowingFeedListModel.this.uidList.size() - 1) {
                        FollowingFeedListModel.this.hasMoreFooter = false;
                    } else {
                        FollowingFeedListModel followingFeedListModel3 = FollowingFeedListModel.this;
                        followingFeedListModel3.footerUid = (String) ListProtector.get(followingFeedListModel3.uidList, i6 + 1);
                        FollowingFeedListModel.this.footerNextCursor = 0;
                    }
                    Map<String, String> map = LYS.LIZ;
                    String str3 = str;
                    String str4 = ((Aweme) ListProtector.get(followingInterestFeedResponse.getAwemeList(), 0)).aid;
                    o.LJIIIIZZ(str4, "it.awemeList[0].aid");
                    map.put(str3, str4);
                    if (!followingInterestFeedResponse.getHasMore()) {
                        Map<String, String> map2 = LYS.LIZIZ;
                        String str5 = str;
                        String str6 = ((Aweme) ListProtector.get(followingInterestFeedResponse.getAwemeList(), followingInterestFeedResponse.getAwemeList().size() - 1)).aid;
                        o.LJIIIIZZ(str6, "it.awemeList[it.awemeList.size - 1].aid");
                        map2.put(str5, str6);
                    }
                    if (z2) {
                        C2U8.LIZ(new C54426LXq(str));
                    }
                } else if (i5 == 3) {
                    if (followingInterestFeedResponse.getHasMore()) {
                        FollowingFeedListModel followingFeedListModel4 = FollowingFeedListModel.this;
                        followingFeedListModel4.headerUid = str;
                        followingFeedListModel4.headerNextCursor = followingInterestFeedResponse.getNextCursor();
                    } else {
                        List<String> list2 = FollowingFeedListModel.this.uidList;
                        String str7 = str;
                        Iterator<String> it3 = list2.iterator();
                        int i8 = 0;
                        while (true) {
                            if (!it3.hasNext()) {
                                break;
                            }
                            if (ujb.o.LJJJJIZL(it3.next(), str7, true)) {
                                i6 = i8;
                                if (i8 == 0) {
                                    FollowingFeedListModel.this.hasMoreHeader = false;
                                }
                            } else {
                                i8++;
                            }
                        }
                        FollowingFeedListModel followingFeedListModel5 = FollowingFeedListModel.this;
                        followingFeedListModel5.headerUid = (String) ListProtector.get(followingFeedListModel5.uidList, i6 - 1);
                        FollowingFeedListModel.this.headerNextCursor = 0;
                    }
                    if (i == 0) {
                        Map<String, String> map3 = LYS.LIZIZ;
                        String str8 = str;
                        String str9 = ((Aweme) ListProtector.get(followingInterestFeedResponse.getAwemeList(), followingInterestFeedResponse.getAwemeList().size() - 1)).aid;
                        o.LJIIIIZZ(str9, "it.awemeList[it.awemeList.size - 1].aid");
                        map3.put(str8, str9);
                    }
                    if (!followingInterestFeedResponse.getHasMore()) {
                        Map<String, String> map4 = LYS.LIZ;
                        String str10 = str;
                        String str11 = ((Aweme) ListProtector.get(followingInterestFeedResponse.getAwemeList(), 0)).aid;
                        o.LJIIIIZZ(str11, "it.awemeList[0].aid");
                        map4.put(str10, str11);
                    }
                } else {
                    if (followingInterestFeedResponse.getHasMore()) {
                        FollowingFeedListModel followingFeedListModel6 = FollowingFeedListModel.this;
                        followingFeedListModel6.footerUid = str;
                        followingFeedListModel6.footerNextCursor = followingInterestFeedResponse.getNextCursor();
                    } else {
                        List<String> list3 = FollowingFeedListModel.this.uidList;
                        String str12 = str;
                        Iterator<String> it4 = list3.iterator();
                        int i9 = 0;
                        while (true) {
                            if (!it4.hasNext()) {
                                break;
                            }
                            if (ujb.o.LJJJJIZL(it4.next(), str12, true)) {
                                i6 = i9;
                                break;
                            }
                            i9++;
                        }
                        if (i6 == FollowingFeedListModel.this.uidList.size() - 1) {
                            FollowingFeedListModel.this.hasMoreFooter = false;
                        } else {
                            FollowingFeedListModel followingFeedListModel7 = FollowingFeedListModel.this;
                            followingFeedListModel7.footerUid = (String) ListProtector.get(followingFeedListModel7.uidList, i6 + 1);
                            FollowingFeedListModel.this.footerNextCursor = 0;
                        }
                    }
                    if (i == 0) {
                        Map<String, String> map5 = LYS.LIZ;
                        String str13 = str;
                        String str14 = ((Aweme) ListProtector.get(followingInterestFeedResponse.getAwemeList(), 0)).aid;
                        o.LJIIIIZZ(str14, "it.awemeList[0].aid");
                        map5.put(str13, str14);
                    }
                    if (!followingInterestFeedResponse.getHasMore()) {
                        Map<String, String> map6 = LYS.LIZIZ;
                        String str15 = str;
                        String str16 = ((Aweme) ListProtector.get(followingInterestFeedResponse.getAwemeList(), followingInterestFeedResponse.getAwemeList().size() - 1)).aid;
                        o.LJIIIIZZ(str16, "it.awemeList[it.awemeList.size - 1].aid");
                        map6.put(str15, str16);
                    }
                }
                FollowingFeedListModel followingFeedListModel8 = FollowingFeedListModel.this;
                List<Aweme> awemeList = followingInterestFeedResponse.getAwemeList();
                if (awemeList != null && !awemeList.isEmpty()) {
                    z3 = false;
                }
                followingFeedListModel8.mIsNewDataEmpty = z3;
                Message obtainMessage2 = FollowingFeedListModel.this.mHandler.obtainMessage(0);
                o.LJIIIIZZ(obtainMessage2, "mHandler.obtainMessage(MSG_REQUEST)");
                obtainMessage2.obj = followingInterestFeedResponse;
                FollowingFeedListModel.this.mHandler.sendMessage(obtainMessage2);
            }
        }, new InterfaceC64592gB() { // from class: com.ss.android.ugc.aweme.feed.model.FollowingFeedListModel$loadList$2
            @Override // X.InterfaceC64592gB
            public final void accept(Throwable th) {
                Message obtainMessage = FollowingFeedListModel.this.mHandler.obtainMessage(0);
                o.LJIIIIZZ(obtainMessage, "mHandler.obtainMessage(MSG_REQUEST)");
                obtainMessage.obj = new RuntimeException(th);
                FollowingFeedListModel.this.mHandler.sendMessage(obtainMessage);
            }
        });
    }
}

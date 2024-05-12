package com.bytedance.android.live.rank.impl.list.viewmodel;

import X.AbstractC78035Ujv;
import X.BPN;
import X.C0NB;
import X.C107244Iu;
import X.C28652BMi;
import X.C31520CYq;
import X.C31524CYu;
import X.C31526CYw;
import X.C47261Igj;
import X.C77942UiQ;
import X.C77951UiZ;
import X.C77979Uj1;
import X.C78016Ujc;
import X.C78020Ujg;
import X.C78024Ujk;
import X.CXJ;
import X.EnumC31514CYk;
import X.InterfaceC78033Ujt;
import android.net.Uri;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.bytedance.android.livesdk.rank.list.model.RankListV2Response;
import com.bytedance.android.livesdk.rank.model.RankTabInfo;
import com.bytedance.android.livesdk.rank.model.SubRankTabInfo;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;
import webcast.api.ranklist.RankExtraInfo;

/* loaded from: classes14.dex */
public final class RankRootViewModel extends ViewModel {
    public List<RankTabInfo> LJLIL;
    public boolean LJLJI;
    public RankTypeV2 LJLJJL;
    public boolean LJLJJLL;
    public int LJLJL;
    public RankTypeV2 LJLJLJ;
    public RankTypeV2 LJLJLLL;
    public RankTypeV2 LJLL;
    public final MutableLiveData<List<AbstractC78035Ujv>> LJLLI;
    public final MutableLiveData<String> LJLLILLLL;
    public final MutableLiveData<String> LJLLJ;
    public final MutableLiveData<C78024Ujk> LJLLL;
    public final MutableLiveData<C78020Ujg> LJLLLL;
    public final MutableLiveData<C77942UiQ> LJLLLLLL;
    public final MutableLiveData<C77942UiQ> LJLZ;
    public boolean LJLILLLLZI = true;
    public EnumC31514CYk LJLJJI = EnumC31514CYk.DEFAULT;

    public RankRootViewModel() {
        RankTypeV2 rankTypeV2 = RankTypeV2.LJIILL;
        this.LJLJJL = rankTypeV2;
        this.LJLJLJ = rankTypeV2;
        this.LJLJLLL = rankTypeV2;
        this.LJLL = rankTypeV2;
        this.LJLLI = new MutableLiveData<>();
        this.LJLLILLLL = new MutableLiveData<>();
        this.LJLLJ = new MutableLiveData<>();
        this.LJLLL = new MutableLiveData<>();
        this.LJLLLL = new MutableLiveData<>();
        this.LJLLLLLL = new MutableLiveData<>();
        this.LJLZ = new MutableLiveData<>();
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        C0NB.LIZIZ("RankRootViewModel", " onClear");
    }

    public final C31526CYw gv0(RankTypeV2 rankTypeV2) {
        return new C31526CYw(this.LJLJJI, rankTypeV2, rankTypeV2, this.LJLJLLL, this.LJLJJLL);
    }

    public final void hv0(RankListV2Response.RankView rankPage) {
        RankListV2Response.RankLeagueExtra rankLeagueExtra;
        int i;
        Text text;
        Text text2;
        RankListV2Response.LeagueTabInfo leagueTabInfo;
        RankListV2Response.RankLeagueTab rankLeagueTab;
        String str;
        String str2;
        int i2;
        RankListV2Response.PathToOtherList pathToOtherList;
        List<RankListV2Response.RankInfo> list;
        Long l;
        Long l2;
        User user;
        C78024Ujk value;
        RankListV2Response.HistoryEntrance historyEntrance;
        List<RankListV2Response.RankInfo> list2;
        RankListV2Response.RankInfo rankInfo;
        User user2;
        List<RankListV2Response.RankInfo> list3;
        RankListV2Response.LeagueTabInfo leagueTabInfo2;
        RankListV2Response.RankLeagueTab rankLeagueTab2;
        RankListV2Response.LeagueTabInfo leagueTabInfo3;
        List<RankListV2Response.RankLeagueTab> list4;
        int i3;
        int i4;
        Text text3;
        o.LJIIIZ(rankPage, "rankPage");
        RankExtraInfo rankExtraInfo = rankPage.rankExtraInfo;
        if (rankExtraInfo != null && (rankLeagueExtra = rankExtraInfo.rankLeagueExtra) != null) {
            ArrayList arrayList = new ArrayList();
            RankListV2Response.RankLeagueHeader rankLeagueHeader = rankLeagueExtra.rankLeagueHeader;
            int i5 = -1;
            if (rankLeagueHeader != null && (leagueTabInfo3 = rankLeagueHeader.leagueTabInfo) != null && (list4 = leagueTabInfo3.standardTab) != null) {
                int i6 = 0;
                for (RankListV2Response.RankLeagueTab rankLeagueTab3 : list4) {
                    int i7 = i6 + 1;
                    if (i6 >= 0) {
                        RankListV2Response.RankLeagueTab rankLeagueTab4 = rankLeagueTab3;
                        RankTabInfo rankTabInfo = new RankTabInfo();
                        if (rankLeagueTab4 != null) {
                            i3 = rankLeagueTab4.rankType;
                        } else {
                            i3 = -1;
                        }
                        rankTabInfo.rankType = i3;
                        if (rankLeagueTab4 != null) {
                            i4 = rankLeagueTab4.leaguePhase;
                        } else {
                            i4 = 0;
                        }
                        rankTabInfo.LJLILLLLZI = i4;
                        if (rankLeagueTab4 != null) {
                            text3 = rankLeagueTab4.titleText;
                        } else {
                            text3 = null;
                        }
                        rankTabInfo.title = text3;
                        arrayList.add(rankTabInfo);
                        i6 = i7;
                    } else {
                        C47261Igj.LJJJJJ();
                        throw null;
                    }
                }
            }
            this.LJLIL = arrayList;
            RankListV2Response.RankLeagueBase rankLeagueBase = rankLeagueExtra.rankLeagueBase;
            if (rankLeagueBase != null) {
                i5 = rankLeagueBase.rankType;
                i = rankLeagueBase.showLeaguePhase;
            } else {
                i = 0;
            }
            RankTypeV2 LIZ = BPN.LIZ(i5, i);
            this.LJLJLLL = LIZ;
            this.LJLL = LIZ;
            List<RankTabInfo> list5 = this.LJLIL;
            if (list5 != null) {
                int i8 = 0;
                for (RankTabInfo rankTabInfo2 : list5) {
                    int i9 = i8 + 1;
                    if (i8 >= 0) {
                        RankTabInfo rankTabInfo3 = rankTabInfo2;
                        int i10 = rankTabInfo3.rankType;
                        RankTypeV2 rankTypeV2 = this.LJLJLLL;
                        if (i10 == rankTypeV2.type && rankTabInfo3.LJLILLLLZI == rankTypeV2.rankPhase) {
                            jv0(i8);
                        }
                        i8 = i9;
                    } else {
                        C47261Igj.LJJJJJ();
                        throw null;
                    }
                }
            }
            C31526CYw gv0 = gv0(this.LJLJLJ);
            MutableLiveData<String> mutableLiveData = this.LJLLILLLL;
            RankListV2Response.RankLeagueHeader rankLeagueHeader2 = rankLeagueExtra.rankLeagueHeader;
            if (rankLeagueHeader2 != null && (leagueTabInfo2 = rankLeagueHeader2.leagueTabInfo) != null && (rankLeagueTab2 = leagueTabInfo2.superTab) != null) {
                text = rankLeagueTab2.titleText;
            } else {
                text = null;
            }
            mutableLiveData.postValue(CXJ.LJFF(text, "").toString());
            RankListV2Response.HistoryEntrance historyEntrance2 = rankLeagueExtra.rankLeagueHistoryEntrance;
            if (historyEntrance2 == null || !historyEntrance2.ifHasHistory || historyEntrance2.ranks == null || (historyEntrance2 != null && (list3 = historyEntrance2.ranks) != null && list3.size() == 0)) {
                MutableLiveData<String> mutableLiveData2 = this.LJLLJ;
                RankListV2Response.RankLeagueHeader rankLeagueHeader3 = rankLeagueExtra.rankLeagueHeader;
                if (rankLeagueHeader3 != null && (leagueTabInfo = rankLeagueHeader3.leagueTabInfo) != null && (rankLeagueTab = leagueTabInfo.superTab) != null) {
                    text2 = rankLeagueTab.briefDescription;
                } else {
                    text2 = null;
                }
                mutableLiveData2.postValue(CXJ.LJFF(text2, "").toString());
            } else {
                RankListV2Response.HistoryEntrance historyEntrance3 = rankLeagueExtra.rankLeagueHistoryEntrance;
                if (historyEntrance3 != null && (list = historyEntrance3.ranks) != null) {
                    int i11 = 0;
                    for (RankListV2Response.RankInfo rankInfo2 : list) {
                        int i12 = i11 + 1;
                        if (i11 >= 0) {
                            RankListV2Response.RankInfo rankInfo3 = rankInfo2;
                            MutableLiveData<C78024Ujk> mutableLiveData3 = this.LJLLL;
                            if (mutableLiveData3 != null && (value = mutableLiveData3.getValue()) != null && (historyEntrance = value.LIZ) != null && (list2 = historyEntrance.ranks) != null && (rankInfo = (RankListV2Response.RankInfo) ListProtector.get(list2, i11)) != null && (user2 = rankInfo.rankUser) != null) {
                                l = Long.valueOf(user2.getId());
                            } else {
                                l = null;
                            }
                            if (rankInfo3 != null && (user = rankInfo3.rankUser) != null) {
                                l2 = Long.valueOf(user.getId());
                            } else {
                                l2 = null;
                            }
                            if (!o.LJ(l, l2)) {
                                this.LJLLL.postValue(new C78024Ujk(gv0, rankLeagueExtra.rankLeagueHistoryEntrance));
                            }
                            i11 = i12;
                        } else {
                            C47261Igj.LJJJJJ();
                            throw null;
                        }
                    }
                }
            }
            RankListV2Response.PathToOtherList pathToOtherList2 = rankLeagueExtra.pathToDaily;
            if (pathToOtherList2 != null) {
                C77942UiQ value2 = this.LJLLLLLL.getValue();
                if (value2 != null && (pathToOtherList = value2.LIZIZ) != null) {
                    str2 = pathToOtherList.schema;
                } else {
                    str2 = null;
                }
                if (!C107244Iu.LIZ(str2, pathToOtherList2.schema)) {
                    Uri parse = UriProtector.parse(pathToOtherList2.schema);
                    MutableLiveData<C77942UiQ> mutableLiveData4 = this.LJLLLLLL;
                    String queryParameter = UriProtector.getQueryParameter(parse, "select_sub_rank_type");
                    if (queryParameter != null) {
                        i2 = CastIntegerProtector.parseInt(queryParameter);
                    } else {
                        i2 = 0;
                    }
                    mutableLiveData4.postValue(new C77942UiQ(gv0(BPN.LIZ(i2, 0)), pathToOtherList2));
                }
            }
            C78020Ujg value3 = this.LJLLLL.getValue();
            if (value3 != null) {
                str = value3.LIZIZ;
            } else {
                str = null;
            }
            if (!C107244Iu.LIZ(str, rankPage.ruleUrl)) {
                MutableLiveData<C78020Ujg> mutableLiveData5 = this.LJLLLL;
                String str3 = rankPage.ruleUrl;
                o.LJIIIIZZ(str3, "rankPage.ruleUrl");
                mutableLiveData5.postValue(new C78020Ujg(gv0, str3));
            }
        }
        this.LJLLI.postValue(null);
    }

    public final void jv0(int i) {
        int i2;
        int i3;
        RankTabInfo rankTabInfo;
        RankTabInfo rankTabInfo2;
        this.LJLJL = i;
        List<RankTabInfo> list = this.LJLIL;
        if (list != null && (rankTabInfo2 = (RankTabInfo) ListProtector.get(list, i)) != null) {
            i2 = rankTabInfo2.rankType;
        } else {
            i2 = -1;
        }
        List<RankTabInfo> list2 = this.LJLIL;
        if (list2 != null && (rankTabInfo = (RankTabInfo) ListProtector.get(list2, this.LJLJL)) != null) {
            i3 = rankTabInfo.LJLILLLLZI;
        } else {
            i3 = 0;
        }
        this.LJLJLJ = BPN.LIZ(i2, i3);
    }

    public final void iv0(String str, RankTypeV2 rankTypeV2, InterfaceC78033Ujt interfaceC78033Ujt, C77979Uj1 c77979Uj1, boolean z) {
        RankExtraInfo rankExtraInfo;
        RankListV2Response.RankLeagueExtra rankLeagueExtra;
        RankListV2Response.RankLeagueBase rankLeagueBase;
        long j;
        RankListV2Response.Data LIZ = C77951UiZ.LIZ(str);
        if (LIZ != null && LIZ.rankView != null) {
            if (z) {
                LIZ.rankView.LJLILLLLZI = true;
            } else {
                RankListV2Response.RankView rankView = LIZ.rankView;
                if (rankView != null && (rankExtraInfo = rankView.rankExtraInfo) != null && (rankLeagueExtra = rankExtraInfo.rankLeagueExtra) != null && (rankLeagueBase = rankLeagueExtra.rankLeagueBase) != null) {
                    C31520CYq.LIZIZ(rankTypeV2.type, rankLeagueBase.showLeaguePhase, str, this.LJLJJLL);
                }
                C31520CYq.LIZIZ(rankTypeV2.type, rankTypeV2.rankPhase, str, this.LJLJJLL);
            }
            RankListV2Response.RankView rankView2 = LIZ.rankView;
            List<SubRankTabInfo> list = rankView2.subTabs;
            if (list == null || list.isEmpty()) {
                SubRankTabInfo subRankTabInfo = new SubRankTabInfo();
                subRankTabInfo.rankType = rankTypeV2.type;
                rankView2.subTabs = C47261Igj.LJJIJ(subRankTabInfo);
            }
            boolean z2 = rankView2.history;
            if (z2) {
                j = -1;
            } else {
                j = 0;
            }
            rankView2.LJLIL = j;
            C28652BMi.LIZLLL(rankTypeV2.type, rankView2.ownerRank.rank, z2);
            if (!z) {
                List<RankListV2Response.RankInfo> ranks = rankView2.ranks;
                o.LJIIIIZZ(ranks, "ranks");
                if (true ^ ranks.isEmpty()) {
                    C31524CYu.LIZLLL(rankTypeV2.type, rankTypeV2.rankPhase, c77979Uj1.LIZ, c77979Uj1.LIZIZ, c77979Uj1.LIZJ, c77979Uj1.LIZLLL, str.length());
                } else {
                    C31524CYu.LIZIZ(rankTypeV2.type, rankTypeV2.rankPhase, c77979Uj1.LIZ, c77979Uj1.LIZIZ, c77979Uj1.LIZJ, c77979Uj1.LIZLLL);
                }
            }
            RankListV2Response.RankView rankView3 = LIZ.rankView;
            o.LJIIIIZZ(rankView3, "responseData.rankView");
            hv0(rankView3);
            RankListV2Response.RankView rankView4 = LIZ.rankView;
            o.LJIIIIZZ(rankView4, "responseData.rankView");
            interfaceC78033Ujt.LIZ(rankView4, 0L);
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C78016Ujc(gv0(this.LJLJLJ)));
        this.LJLLI.postValue(arrayList);
        if (z) {
            return;
        }
        C31524CYu.LIZIZ(rankTypeV2.type, rankTypeV2.rankPhase, c77979Uj1.LIZ, c77979Uj1.LIZIZ, c77979Uj1.LIZJ, c77979Uj1.LIZLLL);
    }
}

package X;

import Y.ACListenerS33S0100000_13;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.rank.impl.list.RankLeagueListDialog;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.rank.list.model.RankListV2Response;
import com.bytedance.android.livesdk.rank.model.RankTabInfo;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;
import webcast.api.ranklist.RankExtraInfo;

/* renamed from: X.UiS, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77944UiS implements InterfaceC78033Ujt {
    public final /* synthetic */ RankLeagueListDialog LIZ;

    @Override // X.InterfaceC78033Ujt
    public final void onError() {
    }

    public C77944UiS(RankLeagueListDialog rankLeagueListDialog) {
        this.LIZ = rankLeagueListDialog;
    }

    @Override // X.InterfaceC78033Ujt
    public final void LIZ(RankListV2Response.RankView rankView, long j) {
        RankListV2Response.RankLeagueExtra rankLeagueExtra;
        RankListV2Response.RankLeagueHeader rankLeagueHeader;
        RankListV2Response.LeagueTabInfo leagueTabInfo;
        List<RankListV2Response.RankLeagueTab> list;
        Text text;
        Text text2;
        Text text3;
        Text text4;
        Text text5;
        Text text6;
        RankLeagueListDialog rankLeagueListDialog = this.LIZ;
        rankLeagueListDialog.getClass();
        RankExtraInfo rankExtraInfo = rankView.rankExtraInfo;
        if (rankExtraInfo != null && (rankLeagueExtra = rankExtraInfo.rankLeagueExtra) != null && (rankLeagueHeader = rankLeagueExtra.rankLeagueHeader) != null && (leagueTabInfo = rankLeagueHeader.leagueTabInfo) != null && (list = leagueTabInfo.standardTab) != null) {
            int i = 0;
            for (RankListV2Response.RankLeagueTab rankLeagueTab : list) {
                int i2 = i + 1;
                Text text7 = null;
                if (i >= 0) {
                    RankListV2Response.RankLeagueTab rankLeagueTab2 = rankLeagueTab;
                    if (i != 0) {
                        if (i != 1) {
                            if (i == 2) {
                                C47121t6 c47121t6 = rankLeagueListDialog.LJZL;
                                if (c47121t6 != null) {
                                    if (rankLeagueTab2 != null) {
                                        text5 = rankLeagueTab2.titleText;
                                    } else {
                                        text5 = null;
                                    }
                                    c47121t6.setText(CXJ.LJFF(text5, "Final").toString());
                                }
                                C47121t6 c47121t62 = rankLeagueListDialog.LJLZ;
                                if (c47121t62 != null) {
                                    if (rankLeagueTab2 != null) {
                                        text6 = rankLeagueTab2.briefDescription;
                                    } else {
                                        text6 = null;
                                    }
                                    c47121t62.setText(CXJ.LJFF(text6, "10").toString());
                                }
                                C47121t6 c47121t63 = rankLeagueListDialog.LJLLL;
                                if (c47121t63 != null) {
                                    if (rankLeagueTab2 != null) {
                                        text7 = rankLeagueTab2.briefDescription;
                                    }
                                    c47121t63.setText(CXJ.LJFF(text7, "10").toString());
                                }
                            }
                        } else {
                            C47121t6 c47121t64 = rankLeagueListDialog.LJZI;
                            if (c47121t64 != null) {
                                if (rankLeagueTab2 != null) {
                                    text3 = rankLeagueTab2.titleText;
                                } else {
                                    text3 = null;
                                }
                                c47121t64.setText(CXJ.LJFF(text3, "Semi-Final").toString());
                            }
                            C47121t6 c47121t65 = rankLeagueListDialog.LJLLLLLL;
                            if (c47121t65 != null) {
                                if (rankLeagueTab2 != null) {
                                    text4 = rankLeagueTab2.briefDescription;
                                } else {
                                    text4 = null;
                                }
                                c47121t65.setText(CXJ.LJFF(text4, "50").toString());
                            }
                            C47121t6 c47121t66 = rankLeagueListDialog.LJLLJ;
                            if (c47121t66 != null) {
                                if (rankLeagueTab2 != null) {
                                    text7 = rankLeagueTab2.briefDescription;
                                }
                                c47121t66.setText(CXJ.LJFF(text7, "50").toString());
                            }
                        }
                    } else {
                        C47121t6 c47121t67 = rankLeagueListDialog.LJZ;
                        if (c47121t67 != null) {
                            if (rankLeagueTab2 != null) {
                                text = rankLeagueTab2.titleText;
                            } else {
                                text = null;
                            }
                            c47121t67.setText(CXJ.LJFF(text, "Preliminary").toString());
                        }
                        C47121t6 c47121t68 = rankLeagueListDialog.LJLLLL;
                        if (c47121t68 != null) {
                            if (rankLeagueTab2 != null) {
                                text2 = rankLeagueTab2.briefDescription;
                            } else {
                                text2 = null;
                            }
                            c47121t68.setText(CXJ.LJFF(text2, "100").toString());
                        }
                        C47121t6 c47121t69 = rankLeagueListDialog.LJLLILLLL;
                        if (c47121t69 != null) {
                            if (rankLeagueTab2 != null) {
                                text7 = rankLeagueTab2.briefDescription;
                            }
                            c47121t69.setText(CXJ.LJFF(text7, "100").toString());
                        }
                    }
                    i = i2;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
        }
        C80655Vl5 c80655Vl5 = rankLeagueListDialog.LLIIIL;
        if (c80655Vl5 != null) {
            c80655Vl5.LIZIZ(new UYL(rankLeagueListDialog));
        }
        VWJ vwj = rankLeagueListDialog.LLIIIZ;
        if (vwj != null) {
            vwj.removeOnPageChangeListener(rankLeagueListDialog.LJLJLLL);
        }
        VWJ vwj2 = rankLeagueListDialog.LLIIIZ;
        if (vwj2 != null) {
            vwj2.setOffscreenPageLimit(2);
        }
        List<RankTabInfo> list2 = rankLeagueListDialog.wl().LIZIZ().LJLIL;
        if (list2 != null) {
            C80655Vl5 c80655Vl52 = rankLeagueListDialog.LLIIIL;
            if (c80655Vl52 != null) {
                c80655Vl52.setCustomTabViewResId(R.layout.dcg);
                c80655Vl52.LJLJI.setPadding(0, 0, 0, 0);
                c80655Vl52.setAutoFillWhenScrollable(true);
            }
            try {
                VWJ vwj3 = rankLeagueListDialog.LLIIIZ;
                if (vwj3 != null) {
                    FragmentManager childFragmentManager = rankLeagueListDialog.getChildFragmentManager();
                    o.LJIIIIZZ(childFragmentManager, "childFragmentManager");
                    CZ2 cz2 = new CZ2(childFragmentManager);
                    rankLeagueListDialog.LLIIJI = cz2;
                    vwj3.setAdapter(cz2);
                }
            } catch (IllegalStateException unused) {
            }
            C80655Vl5 c80655Vl53 = rankLeagueListDialog.LLIIIL;
            if (c80655Vl53 != null) {
                c80655Vl53.setupWithViewPager(rankLeagueListDialog.LLIIIZ);
            }
            CZ2 cz22 = rankLeagueListDialog.LLIIJI;
            if (cz22 != null) {
                cz22.LJJIIJZLJL(rankLeagueListDialog.vl(list2), list2);
            }
            VWJ vwj4 = rankLeagueListDialog.LLIIIZ;
            if (vwj4 != null) {
                vwj4.setCurrentItem(rankLeagueListDialog.wl().LIZIZ().LJLJL);
            }
            VWJ vwj5 = rankLeagueListDialog.LLIIIZ;
            if (vwj5 != null) {
                vwj5.addOnPageChangeListener(rankLeagueListDialog.LJLJLLL);
            }
        }
        C47121t6 c47121t610 = rankLeagueListDialog.LJLLILLLL;
        if (c47121t610 != null) {
            C16880lQ.LJJIIZ(c47121t610, new ACListenerS33S0100000_13(rankLeagueListDialog, 203));
        }
        C47121t6 c47121t611 = rankLeagueListDialog.LJLLJ;
        if (c47121t611 != null) {
            C16880lQ.LJJIIZ(c47121t611, new ACListenerS33S0100000_13(rankLeagueListDialog, 204));
        }
        C47121t6 c47121t612 = rankLeagueListDialog.LJLLL;
        if (c47121t612 != null) {
            C16880lQ.LJJIIZ(c47121t612, new ACListenerS33S0100000_13(rankLeagueListDialog, 205));
        }
    }
}

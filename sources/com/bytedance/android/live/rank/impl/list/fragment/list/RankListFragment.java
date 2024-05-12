package com.bytedance.android.live.rank.impl.list.fragment.list;

import X.AbstractC030309z;
import X.ActivityC45651qj;
import X.BCW;
import X.BZI;
import X.C05170If;
import X.C06530Nl;
import X.C0A2;
import X.C10A;
import X.C141335gf;
import X.C15380j0;
import X.C16880lQ;
import X.C23010vJ;
import X.C2313596d;
import X.C28787BRn;
import X.C28835BTj;
import X.C29306Beo;
import X.C29S;
import X.C2A7;
import X.C30922CBq;
import X.C31415CUp;
import X.C31512CYi;
import X.C31522CYs;
import X.C31526CYw;
import X.C31665Cbl;
import X.C3C5;
import X.C3KP;
import X.C47061t0;
import X.C47121t6;
import X.C51029K0z;
import X.C72818Shy;
import X.C76800UCe;
import X.C77947UiV;
import X.C77956Uie;
import X.C77957Uif;
import X.C77962Uik;
import X.C77963Uil;
import X.C77965Uin;
import X.C77967Uip;
import X.C77969Uir;
import X.C77970Uis;
import X.C77971Uit;
import X.C77980Uj2;
import X.C77983Uj5;
import X.C78000UjM;
import X.C78006UjS;
import X.C78009UjV;
import X.C78010UjW;
import X.C78015Ujb;
import X.C78016Ujc;
import X.C78017Ujd;
import X.C78018Uje;
import X.C78020Ujg;
import X.C78021Ujh;
import X.C78934UyQ;
import X.C79045V0n;
import X.C90903hW;
import X.CXJ;
import X.CZ8;
import X.EnumC31066CHe;
import X.EnumC31514CYk;
import X.InterfaceC65784Pro;
import X.InterfaceC77978Uj0;
import X.InterfaceC78041Uk1;
import X.OA0;
import X.RunnableC31065CHd;
import X.V0N;
import X.ViewTreeObserverOnPreDrawListenerC77946UiU;
import X.X1D;
import Y.AObserverS76S0200000_13;
import Y.ARunnableS13S0301000_13;
import Y.ARunnableS32S0200000_13;
import Y.IDCSpanS31S0100000_5;
import Y.IDrS51S0100000_13;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.rank.impl.list.controller.RankListController;
import com.bytedance.android.live.rank.impl.list.controller.RankPageController;
import com.bytedance.android.live.rank.impl.list.fragment.list.layoutmanager.RankListLinearLayoutManager;
import com.bytedance.android.live.rank.impl.list.viewmodel.RankRootViewModel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveChatShowDelayForHotLiveSetting;
import com.bytedance.android.livesdk.rank.list.model.RankListV2Response;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.AqS80S1100000_13;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes14.dex */
public abstract class RankListFragment extends VisibilityFragment implements InterfaceC78041Uk1 {
    public RankListV2Response.RankView LJLJJL;
    public RankListController LJLJJLL;
    public RankPageController LJLJL;
    public InterfaceC65784Pro<C76800UCe> LJLJLJ;
    public long LJLJLLL;
    public C31415CUp LJLL;
    public RankListLinearLayoutManager LJLLI;
    public Runnable LJLLLL;
    public RunnableC31065CHd LJLLLLLL;
    public View LJLZ;
    public FrameLayout LJZ;
    public OA0 LJZI;
    public TextView LJZL;
    public TextView LL;
    public ImageView LLD;
    public C47061t0 LLF;
    public View LLFF;
    public C47121t6 LLFFF;
    public TextView LLFII;
    public C2A7 LLFZ;
    public TextView LLI;
    public boolean LLII;
    public final Map<Integer, View> LLIIII = new LinkedHashMap();
    public C31526CYw LJLJJI = C31526CYw.LJFF;
    public final ViewTreeObserverOnPreDrawListenerC77946UiU LJLLILLLL = new ViewTreeObserverOnPreDrawListenerC77946UiU(this);
    public final C77956Uie LJLLJ = new C77956Uie(this);
    public final C78000UjM LJLLL = new C78000UjM();
    public final C77947UiV LLIFFJFJJ = new C77947UiV(this);

    @Override // com.bytedance.android.live.rank.impl.list.fragment.list.VisibilityFragment
    public void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLIIII).clear();
    }

    @Override // com.bytedance.android.live.rank.impl.list.fragment.list.VisibilityFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        ViewTreeObserver viewTreeObserver;
        this.LJLLLL = null;
        OA0 oa0 = this.LJZI;
        if (oa0 != null) {
            oa0.LIZIZ();
        }
        super.onDestroyView();
        C72818Shy.LJII("ttlive_anchor_ranking_click_cell_event", this.LJLLJ);
        RunnableC31065CHd runnableC31065CHd = this.LJLLLLLL;
        if (runnableC31065CHd != null && (viewTreeObserver = runnableC31065CHd.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnPreDrawListener(this.LJLLILLLL);
        }
        RankListLinearLayoutManager rankListLinearLayoutManager = this.LJLLI;
        if (rankListLinearLayoutManager != null) {
            rankListLinearLayoutManager.LLIIIJ = null;
        }
        _$_clearFindViewByIdCache();
    }

    public abstract void xl(User user);

    public final void Dl() {
        RunnableC31065CHd runnableC31065CHd;
        C0A2 layoutManager;
        int LJJJJZ;
        InterfaceC77978Uj0 interfaceC77978Uj0;
        InterfaceC77978Uj0 interfaceC77978Uj02;
        if (vl() && (runnableC31065CHd = this.LJLLLLLL) != null && (layoutManager = runnableC31065CHd.getLayoutManager()) != null && (LJJJJZ = layoutManager.LJJJJZ()) > 0) {
            if (LJJJJZ <= 2) {
                RankListController rankListController = this.LJLJJLL;
                if (rankListController != null && (interfaceC77978Uj02 = ((RankPageController) rankListController.LJLILLLLZI).LJLJL) != null) {
                    interfaceC77978Uj02.N5(false);
                    return;
                }
                return;
            }
            RankListController rankListController2 = this.LJLJJLL;
            if (rankListController2 == null || (interfaceC77978Uj0 = ((RankPageController) rankListController2.LJLILLLLZI).LJLJL) == null) {
                return;
            }
            interfaceC77978Uj0.N5(true);
        }
    }

    @Override // X.InterfaceC78041Uk1
    public final void M2() {
        RunnableC31065CHd runnableC31065CHd;
        if (vl() && (runnableC31065CHd = this.LJLLLLLL) != null) {
            runnableC31065CHd.LJLIL(0);
        }
    }

    public void Al(RankListV2Response.RankInfo rankInfo) {
        ImageModel imageModel;
        int i;
        int i2;
        boolean z;
        ForegroundColorSpan foregroundColorSpan;
        ForegroundColorSpan foregroundColorSpan2;
        Integer LJI;
        Integer LJI2;
        RankRootViewModel LIZ;
        if (rankInfo != null) {
            TextView textView = this.LJZL;
            if (textView != null) {
                C78934UyQ.LJJIIJZLJL(textView, rankInfo.rankStr, C31512CYi.LIZIZ);
                int LJIILL = C78934UyQ.LJIILL(rankInfo.rank, this.LJLJJI.LIZIZ);
                textView.setTextColor(LJIILL);
                if (C30922CBq.LIZIZ) {
                    textView.setTag("CurrentBottomBar");
                }
                View view = this.LJLZ;
                if (view != null) {
                    view.post(new ARunnableS13S0301000_13(this, rankInfo, textView, LJIILL, 2));
                }
            }
            ImageView imageView = this.LLD;
            User user = rankInfo.user;
            if (user != null) {
                imageModel = user.getAvatarThumb();
            } else {
                imageModel = null;
            }
            ImageView imageView2 = this.LLD;
            if (imageView2 != null) {
                i = imageView2.getWidth();
            } else {
                i = 0;
            }
            ImageView imageView3 = this.LLD;
            if (imageView3 != null) {
                i2 = imageView3.getHeight();
            } else {
                i2 = 0;
            }
            C31665Cbl.LJIIJ(imageView, imageModel, i, i2, R.drawable.d1c);
            TextView textView2 = this.LL;
            String LIZ2 = C05170If.LIZ(rankInfo.user);
            boolean z2 = C31512CYi.LIZIZ;
            C78934UyQ.LJJIIJZLJL(textView2, LIZ2, z2);
            long j = rankInfo.rank;
            if (j > 0) {
                int i3 = (int) j;
                View view2 = this.LJLZ;
                if (view2 != null) {
                    C16880lQ.LJIIJ(new C77957Uif(this, i3), view2);
                }
            }
            RankListV2Response.Gap gap = rankInfo.gap;
            if (gap != null && gap.displayType == 1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                View view3 = this.LLFF;
                if (view3 != null) {
                    view3.setVisibility(8);
                }
                C47121t6 c47121t6 = this.LLFFF;
                if (c47121t6 != null) {
                    c47121t6.setVisibility(0);
                }
                C47121t6 c47121t62 = this.LLFFF;
                if (c47121t62 != null) {
                    RankListV2Response.Gap gap2 = rankInfo.gap;
                    int i4 = gap2.banInfo;
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 != 3) {
                                if (i4 != 5) {
                                    C78934UyQ.LJJIIJZLJL(c47121t62, CXJ.LJFF(gap2.gapDescription, "").toString(), z2);
                                    return;
                                } else {
                                    C78934UyQ.LJJIIJZLJL(c47121t62, CXJ.LJFF(gap2.gapDescription, "").toString(), z2);
                                    return;
                                }
                            }
                            Spannable LJFF = CXJ.LJFF(gap2.gapDescription, " ");
                            o.LJIIIIZZ(LJFF, "parsePatternAndGetSpanna…(gap.gapDescription, \" \")");
                            Hl(LJFF, "rookie_star_rank_bottom_bar");
                            return;
                        }
                        RankListController rankListController = this.LJLJJLL;
                        if (rankListController != null && (LIZ = rankListController.LIZ()) != null && LIZ.LJLJI) {
                            Spannable LJFF2 = CXJ.LJFF(rankInfo.gap.gapDescription, " ");
                            o.LJIIIIZZ(LJFF2, "parsePatternAndGetSpanna…(gap.gapDescription, \" \")");
                            StringBuilder LIZ3 = X1D.LIZ();
                            LIZ3.append(this.LJLJJI.LIZIZ.rankName);
                            LIZ3.append("_unstable_location");
                            Hl(LJFF2, X1D.LIZIZ(LIZ3));
                            return;
                        }
                        C78934UyQ.LJJIIJZLJL(c47121t62, CXJ.LJFF(rankInfo.gap.gapDescription, " ").toString(), z2);
                        return;
                    }
                    Spannable LJFF3 = CXJ.LJFF(gap2.gapDescription, " ");
                    o.LJIIIIZZ(LJFF3, "parsePatternAndGetSpanna…(gap.gapDescription, \" \")");
                    IDCSpanS31S0100000_5 iDCSpanS31S0100000_5 = new IDCSpanS31S0100000_5(this, 3);
                    Context context = getContext();
                    int LJJLIIIJL = s.LJJLIIIJL(LJFF3, "[", 0, false, 6);
                    int LJJLIIIJL2 = s.LJJLIIIJL(LJFF3, "]", 0, false, 6);
                    if (LJJLIIIJL == -1 || LJJLIIIJL2 == -1) {
                        c47121t62.setVisibility(0);
                        c47121t62.setText(LJFF3.toString());
                        return;
                    }
                    c47121t62.setVisibility(0);
                    C23010vJ.LIZJ(context, LJFF3, 0, LJFF3.length(), 33, 6, LiveChatShowDelayForHotLiveSetting.DEFAULT);
                    if (context != null && (LJI2 = C79045V0n.LJI(R.attr.gv, context)) != null) {
                        foregroundColorSpan = new ForegroundColorSpan(LJI2.intValue());
                    } else {
                        foregroundColorSpan = null;
                    }
                    LJFF3.setSpan(foregroundColorSpan, 0, LJFF3.length(), 33);
                    SpannableString spannableString = new SpannableString(LJFF3.subSequence(LJJLIIIJL + 1, LJJLIIIJL2).toString());
                    C23010vJ.LIZJ(context, spannableString, 0, spannableString.length(), 33, 6, 600);
                    if (context != null && (LJI = C79045V0n.LJI(R.attr.ec, context)) != null) {
                        foregroundColorSpan2 = new ForegroundColorSpan(LJI.intValue());
                    } else {
                        foregroundColorSpan2 = null;
                    }
                    spannableString.setSpan(foregroundColorSpan2, 0, spannableString.length(), 33);
                    spannableString.setSpan(iDCSpanS31S0100000_5, 0, spannableString.length(), 33);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LJFF3);
                    spannableStringBuilder.replace(LJJLIIIJL, LJJLIIIJL2 + 1, (CharSequence) spannableString);
                    c47121t62.setMovementMethod(LinkMovementMethod.getInstance());
                    c47121t62.setText(spannableStringBuilder);
                    c47121t62.setHighlightColor(0);
                    return;
                }
                return;
            }
            View view4 = this.LLFF;
            if (view4 != null) {
                view4.setVisibility(0);
            }
            C47121t6 c47121t63 = this.LLFFF;
            if (c47121t63 != null) {
                c47121t63.setVisibility(8);
            }
            C78934UyQ.LJJIIJZLJL(this.LLFII, CXJ.LJFF(rankInfo.gap.gapDescription, "").toString(), z2);
            if (rankInfo.gap.displayType == 2) {
                C2A7 c2a7 = this.LLFZ;
                if (c2a7 == null) {
                    return;
                }
                c2a7.setVisibility(8);
                return;
            }
            User user2 = rankInfo.user;
            if (user2 == null) {
                return;
            }
            xl(user2);
        }
    }

    public void Gl(C31415CUp c31415CUp) {
        boolean z;
        Boolean bool;
        DataChannel LJIILIIL = C51029K0z.LJIILIIL(this);
        if (LJIILIIL != null) {
            c31415CUp.LJLLLLLL(C77980Uj2.class, new C77967Uip(LJIILIIL, this.LLIFFJFJJ));
            c31415CUp.LJLLLLLL(C78009UjV.class, new C77965Uin());
            c31415CUp.LJLLLLLL(C78006UjS.class, new CZ8(LJIILIIL, this.LLIFFJFJJ));
        }
        RunnableC31065CHd runnableC31065CHd = this.LJLLLLLL;
        if (runnableC31065CHd != null) {
            if (this.LJLJJLL != null) {
                DataChannel LJIILIIL2 = C51029K0z.LJIILIIL(this);
                if (LJIILIIL2 != null && (bool = (Boolean) LJIILIIL2.kv0(BCW.class)) != null) {
                    z = bool.booleanValue();
                } else {
                    z = true;
                }
                runnableC31065CHd.LJLJL(EnumC31066CHe.RANK, z);
                runnableC31065CHd.LJLJJLL();
            }
            if (C31512CYi.LIZIZ) {
                runnableC31065CHd.setItemViewCacheSize(4);
            }
        }
    }

    @Override // com.bytedance.android.live.rank.impl.list.fragment.list.VisibilityFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        RankPageController rankPageController;
        super.onCreate(bundle);
        if (this.LJLJJLL == null && (rankPageController = this.LJLJL) != null) {
            RankListController rankListController = new RankListController(this.LJLJJI, this, rankPageController);
            getLifecycle().addObserver(rankListController);
            if (this.LJLJJL != null) {
                rankListController.LJII().LJLJLJ = this.LJLJLLL;
                rankListController.LJII().LJLILLLLZI = this.LJLJJL;
            }
            this.LJLJJLL = rankListController;
        }
    }

    @Override // com.bytedance.android.live.rank.impl.list.fragment.list.VisibilityFragment
    public void wl(boolean z) {
        String str;
        String str2;
        String str3;
        Long l;
        String str4;
        Long l2;
        Room room;
        RankListV2Response.RankInfo rankInfo;
        RankListController rankListController = this.LJLJJLL;
        if (rankListController != null) {
            if (z) {
                if (!this.LLII) {
                    this.LLII = true;
                    rankListController.LJIIIIZZ(true, false);
                }
                RankListV2Response.RankView rankView = rankListController.LJII().LJLILLLLZI;
                if (rankView != null) {
                    rankListController.LIZIZ().LJLJJL.postValue(new C78021Ujh(this.LJLJJI, rankView.history));
                    MutableLiveData<C78020Ujg> mutableLiveData = rankListController.LIZIZ().LJLJLJ;
                    C31526CYw c31526CYw = this.LJLJJI;
                    String str5 = rankView.ruleUrl;
                    if (str5 == null) {
                        str5 = "";
                    }
                    mutableLiveData.postValue(new C78020Ujg(c31526CYw, str5));
                }
                if (this.LJLLL.LIZ) {
                    ARunnableS32S0200000_13 aRunnableS32S0200000_13 = new ARunnableS32S0200000_13(rankListController, this, 27);
                    this.LJLLLL = aRunnableS32S0200000_13;
                    aRunnableS32S0200000_13.run();
                    if (!this.LJLJJI.LJ) {
                        C3KP.LJLILLLLZI = new WeakReference(this.LJLLLL);
                        return;
                    }
                    return;
                }
                return;
            }
            String str6 = "last";
            if (rankListController.LJII().LJLIL.LIZ == EnumC31514CYk.E_COMMERCE) {
                DataChannel LJIILIIL = C51029K0z.LJIILIIL(this);
                RankListV2Response.RankView rankView2 = rankListController.LJII().LJLILLLLZI;
                long currentTimeMillis = System.currentTimeMillis() - this.LJLLL.LIZLLL;
                BZI LIZ = C28787BRn.LIZ("livesdk_tiktokec_sale_rank_stay_time");
                LIZ.LJIILLIIL(LJIILIIL);
                if (C29306Beo.LJIIJ(LJIILIIL)) {
                    str3 = "1";
                } else {
                    str3 = CardStruct.IStatusCode.DEFAULT;
                }
                LIZ.LJIJJ(str3, "is_self");
                if (rankView2 != null && (rankInfo = rankView2.ownerRank) != null) {
                    l = Long.valueOf(rankInfo.rank);
                } else {
                    l = null;
                }
                LIZ.LJIJJ(l, "author_rank");
                if (rankView2 != null && rankView2.LJLIL == -1) {
                    str4 = "last";
                } else {
                    str4 = "this";
                }
                C06530Nl.LIZLLL(LIZ, str4, "rank_period", currentTimeMillis, "duration");
                if (LJIILIIL != null && (room = (Room) LJIILIIL.kv0(RoomChannel.class)) != null) {
                    l2 = Long.valueOf(room.getOwnerUserId());
                } else {
                    l2 = null;
                }
                LIZ.LJIJJ(l2, "author_id");
                LIZ.LJIJJ("TEMAI", "EVENT_ORIGIN_FEATURE");
                LIZ.LJIJJ("live", "page_name");
                LIZ.LIZLLL(C28835BTj.LIZJ("user_live_duration"));
                LIZ.LJJIIJZLJL();
                this.LJLLL.LIZLLL = 0L;
            }
            C78000UjM c78000UjM = this.LJLLL;
            if (!c78000UjM.LIZJ) {
                return;
            }
            c78000UjM.LIZJ = false;
            RankListV2Response.RankView rankView3 = rankListController.LJII().LJLILLLLZI;
            C31526CYw rankTypeAll = this.LJLJJI;
            long j = this.LJLLL.LJ;
            DataChannel LJIILIIL2 = C51029K0z.LJIILIIL(this);
            o.LJIIIZ(rankTypeAll, "rankTypeAll");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("last_user_rank", String.valueOf(j));
            if (LJIILIIL2 == null || !o.LJ(LJIILIIL2.kv0(BCW.class), Boolean.FALSE)) {
                str = "portrait";
            } else {
                str = "landscape";
            }
            linkedHashMap.put("room_orientation", str);
            C31522CYs.LIZJ(linkedHashMap, rankTypeAll, LJIILIIL2);
            BZI LIZLLL = C31522CYs.LIZLLL("livesdk_hourly_user_rank_swipe_to_end", linkedHashMap);
            C31522CYs.LIZ(LIZLLL, LJIILIIL2);
            if (LJIILIIL2 != null && C29306Beo.LJIIJ(LJIILIIL2)) {
                str2 = "anchor";
            } else {
                str2 = "user";
            }
            LIZLLL.LJIJJ(str2, "user_type");
            if (rankView3 == null || rankView3.LJLIL != -1) {
                str6 = "this";
            }
            LIZLLL.LJIJJ(str6, "rank_period");
            V0N.LJJIIZ(LIZLLL, rankTypeAll);
            LIZLLL.LJJIIJZLJL();
        }
    }

    public final void Hl(Spannable spannable, String str) {
        C47121t6 c47121t6 = this.LLFFF;
        if (c47121t6 != null) {
            c47121t6.setVisibility(0);
        }
        spannable.setSpan(new ForegroundColorSpan(C15380j0.LIZIZ(R.color.cu)), 0, spannable.length(), 33);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(' ');
        LIZ.append(C15380j0.LJIILJJIL(R.string.nsx));
        SpannableString spannableString = new SpannableString(X1D.LIZIZ(LIZ));
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(C15380j0.LIZIZ(R.color.c8));
        C77983Uj5 c77983Uj5 = new C77983Uj5(new AqS80S1100000_13(this, str, 0));
        C23010vJ.LIZJ(getContext(), spannableString, 0, spannableString.length(), 33, 6, 600);
        spannableString.setSpan(foregroundColorSpan, 0, spannableString.length(), 33);
        spannableString.setSpan(c77983Uj5, 0, spannableString.length(), 33);
        SpannableStringBuilder append = new SpannableStringBuilder(spannable).append((CharSequence) spannableString);
        C47121t6 c47121t62 = this.LLFFF;
        if (c47121t62 != null) {
            c47121t62.setMovementMethod(LinkMovementMethod.getInstance());
        }
        C47121t6 c47121t63 = this.LLFFF;
        if (c47121t63 == null) {
            return;
        }
        c47121t63.setText(append);
    }

    @Override // com.bytedance.android.live.rank.impl.list.fragment.list.VisibilityFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        RunnableC31065CHd runnableC31065CHd;
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver viewTreeObserver2;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        this.LJLLLLLL = (RunnableC31065CHd) view.findViewById(R.id.isn);
        this.LJLZ = view.findViewById(R.id.jng);
        this.LJZ = (FrameLayout) view.findViewById(R.id.dcj);
        View view2 = this.LJLZ;
        if (view2 != null) {
            this.LJZL = (TextView) view2.findViewById(R.id.imu);
            this.LL = (TextView) view2.findViewById(R.id.gvs);
            this.LLD = (ImageView) view2.findViewById(R.id.my0);
            this.LLF = (C47061t0) view2.findViewById(R.id.eyl);
            this.LLFF = view2.findViewById(R.id.j4y);
            this.LLFFF = (C47121t6) view2.findViewById(R.id.m8z);
            this.LLFII = (TextView) view2.findViewById(R.id.m7j);
            this.LLFZ = (C2A7) view2.findViewById(R.id.az2);
            this.LLI = (TextView) view2.findViewById(R.id.l7a);
        }
        getContext();
        RankListLinearLayoutManager rankListLinearLayoutManager = new RankListLinearLayoutManager();
        this.LJLLI = rankListLinearLayoutManager;
        rankListLinearLayoutManager.LLIIIJ = this;
        RunnableC31065CHd runnableC31065CHd2 = this.LJLLLLLL;
        if (runnableC31065CHd2 != null) {
            runnableC31065CHd2.setLayoutManager(rankListLinearLayoutManager);
        }
        RunnableC31065CHd runnableC31065CHd3 = this.LJLLLLLL;
        if (runnableC31065CHd3 != null && (viewTreeObserver2 = runnableC31065CHd3.getViewTreeObserver()) != null) {
            viewTreeObserver2.removeOnPreDrawListener(this.LJLLILLLL);
        }
        RunnableC31065CHd runnableC31065CHd4 = this.LJLLLLLL;
        if (runnableC31065CHd4 != null && (viewTreeObserver = runnableC31065CHd4.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnPreDrawListener(this.LJLLILLLL);
        }
        RunnableC31065CHd runnableC31065CHd5 = this.LJLLLLLL;
        if (runnableC31065CHd5 != null) {
            C31415CUp c31415CUp = this.LJLL;
            if (c31415CUp == null) {
                c31415CUp = new C31415CUp();
                this.LJLL = c31415CUp;
                c31415CUp.LJLLLLLL(C78017Ujd.class, new C77971Uit());
                RankListController rankListController = this.LJLJJLL;
                if (rankListController != null) {
                    c31415CUp.LJLLLLLL(C78018Uje.class, new C77969Uir(new AqS163S0100000_13(rankListController, 283)));
                    c31415CUp.LJLLLLLL(C78016Ujc.class, new C77970Uis(new AqS163S0100000_13(rankListController, 284)));
                }
                c31415CUp.LJLLLLLL(C78010UjW.class, new C77962Uik(C51029K0z.LJIILIIL(this)));
                c31415CUp.LJLLLLLL(C78015Ujb.class, new C77963Uil());
                Gl(c31415CUp);
            }
            runnableC31065CHd5.setAdapter(c31415CUp);
        }
        if (this.LJLJJI.LIZIZ.style == 1 && (runnableC31065CHd = this.LJLLLLLL) != null) {
            final int LIZ = C15380j0.LIZ(4.0f);
            runnableC31065CHd.LJII(new AbstractC030309z(LIZ) { // from class: X.4jU
                public final int LJLIL;

                {
                    this.LJLIL = LIZ;
                }

                @Override // X.AbstractC030309z
                public final void LJ(Rect rect, View view3, RecyclerView recyclerView, C0AC c0ac) {
                    if (C1JX.LIZJ(rect, "outRect", view3, "view", recyclerView, "parent", c0ac, "state", view3) != 0) {
                        rect.top = this.LJLIL;
                    }
                }
            }, -1);
        }
        RunnableC31065CHd runnableC31065CHd6 = this.LJLLLLLL;
        if (runnableC31065CHd6 != null) {
            runnableC31065CHd6.LJIIJJI(new IDrS51S0100000_13(this, 5));
        }
        RankListController rankListController2 = this.LJLJJLL;
        if (rankListController2 != null) {
            rankListController2.LJII().LJLJJI.observe(this, new AObserverS76S0200000_13(this, rankListController2, 3));
            rankListController2.LJII().LJLJJL.observe(this, new AObserverS76S0200000_13(this, rankListController2, 4));
        }
        C72818Shy.LIZLLL("ttlive_anchor_ranking_click_cell_event", this.LJLLJ);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        C2313596d.LIZIZ.put(this.LJLJJI.LIZIZ.type, false);
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.d5d, viewGroup, false);
        C29S c29s = null;
        if (!(LLLLIILL instanceof View)) {
            LLLLIILL = null;
        }
        if (LLLLIILL != null) {
            try {
                ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
                C10A.LIZIZ(LLLLIILL, this);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return LLLLIILL;
    }
}

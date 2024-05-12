package Y;

import X.AbstractC74727TUl;
import X.BZI;
import X.C012403c;
import X.C06490Nh;
import X.C0C3;
import X.C15380j0;
import X.C29306Beo;
import X.C31522CYs;
import X.C31524CYu;
import X.C47121t6;
import X.EnumC31514CYk;
import X.InterfaceC31805Ce1;
import X.ORZ;
import X.OSZ;
import X.TRT;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.anchor.MultiLiveAsAnchorListDialogV2;
import com.bytedance.android.live.rank.impl.list.RankListDialog;
import com.bytedance.android.live.rank.impl.list.controller.base.IChildController;
import com.bytedance.android.live.rank.impl.list.viewmodel.RankPageViewModel;
import com.bytedance.android.livesdk.impl.revenue.subscription.emote.preview.PreviewImageDialogFragment;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.bytedance.android.livesdk.rank.model.RankTabInfo;
import com.bytedance.android.livesdkapi.subscribe.emote.LiveSubMediaModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS100S0101000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public class IDiS274S0100000_13 implements C0C3 {
    public final int $t;
    public Object l0;

    public static final void onPageScrollStateChanged$0(IDiS274S0100000_13 iDiS274S0100000_13, int i) {
    }

    public static final void onPageScrollStateChanged$1(IDiS274S0100000_13 iDiS274S0100000_13, int i) {
    }

    public static final void onPageScrollStateChanged$2(IDiS274S0100000_13 iDiS274S0100000_13, int i) {
    }

    public static final void onPageScrollStateChanged$3(IDiS274S0100000_13 iDiS274S0100000_13, int i) {
    }

    public static final void onPageScrolled$0(IDiS274S0100000_13 iDiS274S0100000_13, int i, float f, int i2) {
    }

    public static final void onPageScrolled$1(IDiS274S0100000_13 iDiS274S0100000_13, int i, float f, int i2) {
    }

    public static final void onPageScrolled$2(IDiS274S0100000_13 iDiS274S0100000_13, int i, float f, int i2) {
    }

    public static final void onPageScrolled$3(IDiS274S0100000_13 iDiS274S0100000_13, int i, float f, int i2) {
    }

    @Override // X.C0C3
    public final void onPageScrollStateChanged(int i) {
        switch (this.$t) {
            case 0:
                onPageScrollStateChanged$0(this, i);
                return;
            case 1:
                onPageScrollStateChanged$1(this, i);
                return;
            case 2:
                onPageScrollStateChanged$2(this, i);
                return;
            case 3:
                onPageScrollStateChanged$3(this, i);
                return;
            default:
                return;
        }
    }

    @Override // X.C0C3
    public final void onPageScrolled(int i, float f, int i2) {
        switch (this.$t) {
            case 0:
                onPageScrolled$0(this, i, f, i2);
                return;
            case 1:
                onPageScrolled$1(this, i, f, i2);
                return;
            case 2:
                onPageScrolled$2(this, i, f, i2);
                return;
            case 3:
                onPageScrolled$3(this, i, f, i2);
                return;
            default:
                return;
        }
    }

    @Override // X.C0C3
    public final void onPageSelected(int i) {
        switch (this.$t) {
            case 0:
                onPageSelected$0(this, i);
                return;
            case 1:
                onPageSelected$1(this, i);
                return;
            case 2:
                onPageSelected$2(this, i);
                return;
            case 3:
                onPageSelected$3(this, i);
                return;
            default:
                return;
        }
    }

    public IDiS274S0100000_13(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onPageSelected$0(IDiS274S0100000_13 iDiS274S0100000_13, int i) {
        RankPageViewModel LIZIZ;
        RankTypeV2 rankTypeV2;
        String str;
        String str2;
        RankPageViewModel LIZIZ2;
        RankTypeV2 rankTypeV22;
        int i2 = ((RankListDialog) iDiS274S0100000_13.l0).wl().LIZIZ().LJLJL;
        RankTypeV2 fromRankTypeV2 = RankTypeV2.LJIILL;
        ((RankListDialog) iDiS274S0100000_13.l0).wl().LIZIZ().jv0(i);
        List<RankTabInfo> list = ((RankListDialog) iDiS274S0100000_13.l0).wl().LIZIZ().LJLIL;
        if (list != null) {
            RankListDialog rankListDialog = (RankListDialog) iDiS274S0100000_13.l0;
            if (list.size() > i) {
                IChildController iChildController = (IChildController) ((HashMap) rankListDialog.wl().LJLIL).get(new OSZ(Integer.valueOf(((RankTabInfo) ListProtector.get(list, i2)).rankType), Integer.valueOf(((RankTabInfo) ListProtector.get(list, i2)).LJLILLLLZI)));
                if (iChildController != null && (LIZIZ2 = iChildController.LIZIZ()) != null && (rankTypeV22 = LIZIZ2.LJLLL) != null) {
                    fromRankTypeV2 = rankTypeV22;
                }
                IChildController iChildController2 = (IChildController) ((HashMap) rankListDialog.wl().LJLIL).get(new OSZ(Integer.valueOf(((RankTabInfo) ListProtector.get(list, i)).rankType), Integer.valueOf(((RankTabInfo) ListProtector.get(list, i)).LJLILLLLZI)));
                if (iChildController2 != null && (LIZIZ = iChildController2.LIZIZ()) != null && (rankTypeV2 = LIZIZ.LJLLL) != null) {
                    EnumC31514CYk groupType = rankListDialog.wl().LIZIZ().LJLJJI;
                    DataChannel dataChannel = rankListDialog.dataChannel;
                    boolean z = rankListDialog.LJLIL;
                    o.LJIIIZ(fromRankTypeV2, "fromRankTypeV2");
                    o.LJIIIZ(groupType, "groupType");
                    C31522CYs.LIZIZ.put(new OSZ<>(Integer.valueOf(rankTypeV2.type), Integer.valueOf(rankTypeV2.rankPhase)), "click");
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    C31522CYs.LIZIZ(linkedHashMap, rankTypeV2, groupType, z, dataChannel);
                    BZI LIZLLL = C31522CYs.LIZLLL("livesdk_switch_tab", linkedHashMap);
                    C31522CYs.LIZ(LIZLLL, dataChannel);
                    if (dataChannel != null && C29306Beo.LJIIJ(dataChannel)) {
                        str = "anchor";
                    } else {
                        str = "user";
                    }
                    LIZLLL.LJIJJ(str, "user_type");
                    LIZLLL.LJIJJ(fromRankTypeV2.rankName, "from_rank_type");
                    LIZLLL.LJIJJ(rankTypeV2.rankName, "to_rank_type");
                    if (z) {
                        str2 = "last";
                    } else {
                        str2 = "this";
                    }
                    C06490Nh.LIZLLL(LIZLLL, str2, "rank_period", "click", "enter_from");
                    C31524CYu.LJ(rankTypeV2.type, rankTypeV2.rankPhase, false);
                }
            }
        }
    }

    public static final void onPageSelected$1(IDiS274S0100000_13 iDiS274S0100000_13, int i) {
        int intValue;
        RecyclerView.ViewHolder LJJIZ;
        LiveSubMediaModel liveSubMediaModel = (LiveSubMediaModel) ORZ.LJLLLLLL(i, ((PreviewImageDialogFragment) iDiS274S0100000_13.l0).LJLJJI.LJLILLLLZI);
        if (liveSubMediaModel != null) {
            PreviewImageDialogFragment previewImageDialogFragment = (PreviewImageDialogFragment) iDiS274S0100000_13.l0;
            previewImageDialogFragment.LJLJI = liveSubMediaModel;
            Integer LJLLLLLL = previewImageDialogFragment.LJLJJL.LJLLLLLL(liveSubMediaModel);
            if (LJLLLLLL == null || (intValue = LJLLLLLL.intValue() + 1) < 0) {
                return;
            }
            RecyclerView recyclerView = (RecyclerView) previewImageDialogFragment._$_findCachedViewById(R.id.i17);
            View view = null;
            if (recyclerView != null && (LJJIZ = recyclerView.LJJIZ(intValue)) != null) {
                view = LJJIZ.itemView;
            }
            int i2 = 0;
            if (view == null) {
                RecyclerView recyclerView2 = (RecyclerView) previewImageDialogFragment._$_findCachedViewById(R.id.i17);
                if (recyclerView2 == null) {
                    return;
                }
                int i3 = intValue - 1;
                if (i3 > 0) {
                    i2 = i3;
                }
                recyclerView2.LJLI(i2);
                return;
            }
            RecyclerView recyclerView3 = (RecyclerView) previewImageDialogFragment._$_findCachedViewById(R.id.i17);
            if (recyclerView3 == null) {
                return;
            }
            int i4 = intValue - 1;
            if (i4 > 0) {
                i2 = i4;
            }
            recyclerView3.LJLIL(i2);
        }
    }

    public static final void onPageSelected$2(IDiS274S0100000_13 iDiS274S0100000_13, int i) {
        String str;
        AbstractC74727TUl LIZ;
        MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV2 = (MultiLiveAsAnchorListDialogV2) iDiS274S0100000_13.l0;
        multiLiveAsAnchorListDialogV2.LLIZ = false;
        if (i == 0) {
            str = "guest";
        } else {
            str = "friends";
        }
        multiLiveAsAnchorListDialogV2.LLILIL = str;
        InterfaceC31805Ce1 LJJJJJL = multiLiveAsAnchorListDialogV2.LJJJJJL();
        if (LJJJJJL != null && (LIZ = LJJJJJL.LIZ()) != null) {
            ((MultiLiveAsAnchorListDialogV2) iDiS274S0100000_13.l0).LJJL(LIZ, 0L);
        }
        C012403c.LJ("onPageSelected position:", i, "MultiLiveAsAnchorListDialogV2");
        InterfaceC31805Ce1 LJJJJJL2 = ((MultiLiveAsAnchorListDialogV2) iDiS274S0100000_13.l0).LJJJJJL();
        if (LJJJJJL2 != null) {
            TRT.LIZ(LJJJJJL2, "", 0, null, new AqS100S0101000_13(i, (MultiLiveAsAnchorListDialogV2) iDiS274S0100000_13.l0, 6), 6);
        }
    }

    public static final void onPageSelected$3(IDiS274S0100000_13 iDiS274S0100000_13, int i) {
        int i2;
        int childCount = ((LinearLayout) iDiS274S0100000_13.l0).getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = ((LinearLayout) iDiS274S0100000_13.l0).getChildAt(i3);
            if (i3 == i) {
                i2 = R.color.a02;
            } else {
                i2 = R.color.cu;
            }
            if (childAt instanceof C47121t6) {
                ((TextView) childAt).setTextColor(C15380j0.LIZIZ(i2));
            }
        }
        C012403c.LJ("tabLayout onPageSelected position:", i, "MultiLiveAsAnchorListDialogV2");
    }
}

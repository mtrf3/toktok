package Y;

import X.C0A2;
import X.C0A6;
import X.C72972SkS;
import X.C77719Uep;
import X.X1D;
import android.animation.ObjectAnimator;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.liveinteract.multiguestv3.main.moderator.guest.managedialog.MultiGuestAsGuestModeratorManageDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.anchor.MultiLiveAsAnchorListDialogV2;
import com.bytedance.android.live.liveinteract.multimatch.business.dialog.MatchOnlyGiftSelectFragment;
import com.bytedance.android.live.rank.impl.list.fragment.list.RankListFragment;
import com.bytedance.android.livesdk.wallet.Diamond;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.setting.ui.I18nSettingNewVersionFragment;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public class IDrS51S0100000_13 extends C0A6 {
    public final int $t;
    public Object l0;

    @Override // X.C0A6
    public final void LJIILJJIL(int i, RecyclerView recyclerView) {
        switch (this.$t) {
            case 1:
                LJIILJJIL$0(this, i, recyclerView);
                return;
            case 2:
                LJIILJJIL$1(this, i, recyclerView);
                return;
            case 3:
            case 4:
            default:
                super.LJIILJJIL(i, recyclerView);
                return;
            case 5:
                LJIILJJIL$2(this, i, recyclerView);
                return;
            case 6:
                LJIILJJIL$3(this, i, recyclerView);
                return;
        }
    }

    @Override // X.C0A6
    public final void LJIILL(RecyclerView recyclerView, int i, int i2) {
        switch (this.$t) {
            case 0:
                LJIILL$0(this, recyclerView, i, i2);
                return;
            case 1:
            case 2:
            case 5:
            default:
                super.LJIILL(recyclerView, i, i2);
                return;
            case 3:
                LJIILL$1(this, recyclerView, i, i2);
                return;
            case 4:
                LJIILL$2(this, recyclerView, i, i2);
                return;
            case 6:
                LJIILL$3(this, recyclerView, i, i2);
                return;
        }
    }

    public IDrS51S0100000_13(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LJIILJJIL$0(IDrS51S0100000_13 iDrS51S0100000_13, int i, RecyclerView recyclerView) {
        boolean z;
        o.LJIIIZ(recyclerView, "recyclerView");
        MultiGuestAsGuestModeratorManageDialog multiGuestAsGuestModeratorManageDialog = (MultiGuestAsGuestModeratorManageDialog) iDrS51S0100000_13.l0;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        multiGuestAsGuestModeratorManageDialog.LJLLLL = z;
    }

    public static final void LJIILJJIL$1(IDrS51S0100000_13 iDrS51S0100000_13, int i, RecyclerView recyclerView) {
        boolean z;
        o.LJIIIZ(recyclerView, "recyclerView");
        MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV2 = (MultiLiveAsAnchorListDialogV2) iDrS51S0100000_13.l0;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        multiLiveAsAnchorListDialogV2.LLJJJIL = z;
    }

    public static final void LJIILJJIL$2(IDrS51S0100000_13 iDrS51S0100000_13, int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        if (i != 0) {
            ((RankListFragment) iDrS51S0100000_13.l0).LJLLL.LIZJ = true;
        }
    }

    public static final void LJIILJJIL$3(IDrS51S0100000_13 iDrS51S0100000_13, int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        ((MatchOnlyGiftSelectFragment) iDrS51S0100000_13.l0).wl();
    }

    public static final void LJIILL$0(IDrS51S0100000_13 iDrS51S0100000_13, RecyclerView recyclerView, int i, int i2) {
        boolean z;
        o.LJIIIZ(recyclerView, "recyclerView");
        C77719Uep c77719Uep = (C77719Uep) iDrS51S0100000_13.l0;
        c77719Uep.getClass();
        int[] iArr = new int[2];
        C0A2 layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            iArr[0] = linearLayoutManager.LLILL();
            int LLILLJJLI = linearLayoutManager.LLILLJJLI();
            int i3 = 1;
            iArr[1] = LLILLJJLI;
            int i4 = linearLayoutManager.LJLZ;
            int i5 = iArr[0];
            if (i5 > LLILLJJLI) {
                return;
            }
            while (true) {
                View LJJIJIL = linearLayoutManager.LJJIJIL(i5);
                Diamond diamond = (Diamond) ListProtector.get(c77719Uep.LJLJJI, i5);
                HashMap<String, Integer> hashMap = c77719Uep.LJLJJL;
                String str = diamond.iapId;
                if (str == null) {
                    str = "";
                }
                StringBuilder LJFF = C72972SkS.LJFF(str, '$');
                LJFF.append(diamond.LJLIL);
                Integer num = hashMap.get(X1D.LIZIZ(LJFF));
                if (num != null) {
                    int intValue = num.intValue();
                    if (LJJIJIL != null) {
                        boolean globalVisibleRect = LJJIJIL.getGlobalVisibleRect(new Rect());
                        if (i4 == i3 && r0.height() >= LJJIJIL.getMeasuredHeight() / 1.25f && globalVisibleRect) {
                            z = true;
                        } else {
                            z = false;
                        }
                        Long lastValue = c77719Uep.LJLJJLL.get(intValue, -1L);
                        long currentTimeMillis = System.currentTimeMillis();
                        o.LJIIIIZZ(lastValue, "lastValue");
                        if (lastValue.longValue() > 0) {
                            if (!z && lastValue.longValue() != currentTimeMillis) {
                                c77719Uep.LJLJJLL.put(intValue, -1L);
                                c77719Uep.LJLILLLLZI.LIZJ(false, intValue, diamond);
                            }
                        } else if (z) {
                            c77719Uep.LJLJJLL.put(intValue, Long.valueOf(currentTimeMillis));
                            c77719Uep.LJLILLLLZI.LIZJ(true, intValue, diamond);
                        }
                    }
                }
                if (i5 != LLILLJJLI) {
                    i5++;
                    i3 = 1;
                } else {
                    return;
                }
            }
        }
    }

    public static final void LJIILL$1(IDrS51S0100000_13 iDrS51S0100000_13, RecyclerView recyclerView, int i, int i2) {
        o.LJIIIZ(recyclerView, "recyclerView");
        if (!((ObjectAnimator) iDrS51S0100000_13.l0).isRunning() && recyclerView.getScrollState() == 1 && recyclerView.getAlpha() == 1.0f) {
            ((ObjectAnimator) iDrS51S0100000_13.l0).start();
        }
    }

    public static final void LJIILL$2(IDrS51S0100000_13 iDrS51S0100000_13, RecyclerView recyclerView, int i, int i2) {
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
        if (linearLayoutManager == null) {
            return;
        }
        if (linearLayoutManager.LLILL() > 0) {
            ((I18nSettingNewVersionFragment) iDrS51S0100000_13.l0).mTitleBar.findViewById(R.id.gwk).setAlpha(1.0f);
        } else {
            ((I18nSettingNewVersionFragment) iDrS51S0100000_13.l0).mTitleBar.findViewById(R.id.gwk).setAlpha(0.0f);
        }
    }

    public static final void LJIILL$3(IDrS51S0100000_13 iDrS51S0100000_13, RecyclerView recyclerView, int i, int i2) {
        o.LJIIIZ(recyclerView, "recyclerView");
        ((MatchOnlyGiftSelectFragment) iDrS51S0100000_13.l0).wl();
    }
}

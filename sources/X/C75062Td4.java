package X;

import android.view.View;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.RemoveReservationCardEvent;
import com.bytedance.android.live.liveinteract.multilive.model.ListByTypeResponse;
import com.bytedance.android.livesdk.chatroom.ui.SSLinearLayoutManager;
import com.bytedance.android.livesdk.livesetting.other.subscribe.SubscriptionIconHideTextMinimumDimensionSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.Td4, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75062Td4 extends AbstractC76218Tvi<C35373DuT> {
    public final DataChannel LJLIL;
    public final InterfaceC75076TdI LJLILLLLZI;
    public final int LJLJI;
    public final C31413CUn LJLJJI;
    public RunnableC31065CHd LJLJJL;
    public C31413CUn LJLJJLL;

    @Override // X.AbstractC76218Tvi
    public final void LJJJJIZL() {
        DataChannel dataChannel = this.LJLIL;
        if (dataChannel != null) {
            dataChannel.jv0(this);
        }
    }

    public final void N(Long l) {
        List<?> list;
        Long l2;
        Long l3;
        List<?> list2;
        C75070TdC c75070TdC;
        ListByTypeResponse.ReservedUser reservedUser;
        User user;
        C31413CUn c31413CUn = this.LJLJJLL;
        if (c31413CUn == null || (list = c31413CUn.LJLIL) == null) {
            return;
        }
        int i = 0;
        if (list.size() == 1) {
            Object obj = ListProtector.get(list, 0);
            if ((obj instanceof C75070TdC) && (c75070TdC = (C75070TdC) obj) != null && (reservedUser = c75070TdC.LJLIL) != null && (user = reservedUser.user) != null) {
                l3 = Long.valueOf(user.getId());
            } else {
                l3 = null;
            }
            if (o.LJ(l, l3)) {
                C31413CUn c31413CUn2 = this.LJLJJI;
                if (c31413CUn2 == null || (list2 = c31413CUn2.LJLIL) == null) {
                    return;
                }
                int size = list2.size();
                while (i < size) {
                    Object obj2 = ListProtector.get(list2, i);
                    if ((obj2 instanceof C74900TaS) && ((C74900TaS) obj2).LJLILLLLZI == 2) {
                        ListProtector.remove(list2, i);
                        ListProtector.remove(list2, i);
                        C31413CUn c31413CUn3 = this.LJLJJI;
                        if (c31413CUn3 != null) {
                            c31413CUn3.LJZ(list2);
                        }
                        M(i, this.LJLJJI, 2);
                    }
                    i++;
                }
                return;
            }
        }
        if (list.size() <= 1) {
            return;
        }
        int size2 = list.size();
        while (i < size2) {
            Object obj3 = ListProtector.get(list, i);
            if (obj3 instanceof C75070TdC) {
                User user2 = ((C75070TdC) obj3).LJLIL.user;
                if (user2 != null) {
                    l2 = Long.valueOf(user2.getId());
                } else {
                    l2 = null;
                }
                if (o.LJ(l2, l)) {
                    ListProtector.remove(list, i);
                    C31413CUn c31413CUn4 = this.LJLJJLL;
                    if (c31413CUn4 != null) {
                        c31413CUn4.LJLIL = list;
                    }
                    M(i, c31413CUn4, 1);
                    return;
                }
            }
            i++;
        }
    }

    @Override // X.AbstractC76218Tvi
    public final void L(int i, Object obj) {
        C35373DuT data = (C35373DuT) obj;
        o.LJIIIZ(data, "data");
        this.itemView.getContext();
        RunnableC31065CHd runnableC31065CHd = (RunnableC31065CHd) this.itemView.findViewById(R.id.iyb);
        this.LJLJJL = runnableC31065CHd;
        if (runnableC31065CHd != null) {
            SSLinearLayoutManager sSLinearLayoutManager = new SSLinearLayoutManager();
            sSLinearLayoutManager.LLJJIII(0);
            runnableC31065CHd.setLayoutManager(sSLinearLayoutManager);
        }
        C31413CUn c31413CUn = new C31413CUn();
        this.LJLJJLL = c31413CUn;
        c31413CUn.LJLZ(C75070TdC.class, new C75063Td5(this.LJLILLLLZI, this.LJLJI));
        RunnableC31065CHd runnableC31065CHd2 = this.LJLJJL;
        if (runnableC31065CHd2 != null) {
            runnableC31065CHd2.setAdapter(this.LJLJJLL);
        }
        List<ListByTypeResponse.ReservedUser> list = data.LIZ;
        if (list != null && !list.isEmpty()) {
            CJ2 cj2 = new CJ2();
            Iterator<ListByTypeResponse.ReservedUser> it = list.iterator();
            while (it.hasNext()) {
                cj2.add(new C75070TdC(it.next()));
            }
            C31413CUn c31413CUn2 = this.LJLJJLL;
            if (c31413CUn2 != null) {
                c31413CUn2.LJLIL = cj2;
                c31413CUn2.notifyDataSetChanged();
            }
        }
        DataChannel dataChannel = this.LJLIL;
        if (dataChannel != null) {
            dataChannel.mv0(RemoveReservationCardEvent.class, this, new AqS179S0100000_13(this, SubscriptionIconHideTextMinimumDimensionSetting.DEFAULT));
        }
    }

    public static void M(int i, C31413CUn c31413CUn, int i2) {
        List<?> list;
        if (c31413CUn != null) {
            c31413CUn.notifyItemRangeRemoved(i, i2);
            List<?> list2 = c31413CUn.LJLIL;
            if ((list2 != null && i == list2.size()) || (list = c31413CUn.LJLIL) == null) {
                return;
            }
            c31413CUn.notifyItemRangeChanged(i, list.size() - i);
        }
    }

    public C75062Td4(View view, DataChannel dataChannel, InterfaceC75076TdI interfaceC75076TdI, int i, C31413CUn c31413CUn) {
        super(view);
        this.LJLIL = dataChannel;
        this.LJLILLLLZI = interfaceC75076TdI;
        this.LJLJI = i;
        this.LJLJJI = c31413CUn;
    }
}

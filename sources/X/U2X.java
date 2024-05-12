package X;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import webcast.data.multi_guest_play.ShowListUser;

/* loaded from: classes14.dex */
public final class U2X extends C0B4 {
    public C76549U2n LIZLLL;
    public int LJ = -1;
    public final /* synthetic */ U2W LJFF;

    @Override // X.C0B4
    public final void LJIILL(RecyclerView.ViewHolder viewHolder) {
        o.LJIIIZ(viewHolder, "viewHolder");
    }

    public U2X(U2W u2w) {
        this.LJFF = u2w;
    }

    @Override // X.C0B4
    public final int LJ(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        o.LJIIIZ(recyclerView, "recyclerView");
        o.LJIIIZ(viewHolder, "viewHolder");
        return C0B4.LJIIIZ(3, 0);
    }

    @Override // X.C0B4
    public final void LJIILJJIL(RecyclerView.ViewHolder viewHolder, int i) {
        long j;
        long j2;
        ShowListUser showListUser;
        int i2;
        C76553U2r c76553U2r;
        ShowListUser showListUser2;
        ShowListUser showListUser3;
        C76553U2r c76553U2r2;
        ShowListUser showListUser4;
        C76549U2n c76549U2n;
        ShowListUser showListUser5;
        int i3 = -1;
        if (i == 2) {
            if ((viewHolder instanceof C76549U2n) && (c76549U2n = (C76549U2n) viewHolder) != null) {
                c76549U2n.itemView.setBackgroundResource(R.color.abc);
                c76549U2n.itemView.setElevation(8.0f);
                this.LIZLLL = c76549U2n;
                C76553U2r c76553U2r3 = c76549U2n.LJLJI;
                if (c76553U2r3 != null && (showListUser5 = c76553U2r3.LJLIL) != null) {
                    i3 = showListUser5.order;
                }
                this.LJ = i3;
            }
            U2W u2w = this.LJFF;
            u2w.LJZ = true;
            HashMap<String, Integer> originMap = u2w.LJLZ;
            o.LJIIIZ(originMap, "originMap");
            java.util.Set<Map.Entry<String, Integer>> entrySet = originMap.entrySet();
            o.LJIIIIZZ(entrySet, "originMap.entries");
            for (Map.Entry<String, Integer> entry : entrySet) {
                HashMap<String, Integer> hashMap = C76548U2m.LJ;
                String key = entry.getKey();
                o.LJIIIIZZ(key, "it.key");
                Integer value = entry.getValue();
                o.LJIIIIZZ(value, "it.value");
                hashMap.put(key, value);
            }
            return;
        }
        C76549U2n c76549U2n2 = this.LIZLLL;
        if (!(c76549U2n2 instanceof C76549U2n)) {
            c76549U2n2 = null;
        }
        long j3 = 0;
        if (c76549U2n2 != null && (c76553U2r2 = c76549U2n2.LJLJI) != null && (showListUser4 = c76553U2r2.LJLIL) != null) {
            j = showListUser4.userId;
        } else {
            j = 0;
        }
        HashMap<String, Integer> orderMap = this.LJFF.LJLZ;
        o.LJIIIZ(orderMap, "orderMap");
        String str = "1";
        if (orderMap.size() == C76548U2m.LJ.size()) {
            String str2 = CardStruct.IStatusCode.DEFAULT;
            for (Map.Entry<String, Integer> entry2 : orderMap.entrySet()) {
                int intValue = entry2.getValue().intValue();
                Integer num = C76548U2m.LJ.get(entry2.getKey());
                if (num == null || intValue != num.intValue()) {
                    str2 = "1";
                }
            }
            str = str2;
        }
        C76548U2m.LJ = new HashMap<>();
        java.util.Map LIZ = C76548U2m.LIZ();
        LIZ.put("guest_id", String.valueOf(j));
        LIZ.put("is_liveshow_ongoing", C76548U2m.LJFF());
        LIZ.put("is_success", str);
        C76548U2m.LJIIZILJ("livesdk_anchor_multiguest_liveshow_order_change", LIZ);
        C76549U2n c76549U2n3 = this.LIZLLL;
        if (!(c76549U2n3 instanceof C76549U2n)) {
            c76549U2n3 = null;
        }
        if (c76549U2n3 != null) {
            c76549U2n3.itemView.setBackgroundColor(0);
            c76549U2n3.itemView.setElevation(0.0f);
        }
        U2W u2w2 = this.LJFF;
        u2w2.LJZ = false;
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = u2w2.LJZI;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
            this.LJFF.LJZI = null;
        }
        U35 LIZ2 = TQA.LIZ();
        if (LIZ2 != null && LIZ2.LJII() == 2) {
            C76549U2n c76549U2n4 = this.LIZLLL;
            if ((c76549U2n4 instanceof C76549U2n) && c76549U2n4 != null) {
                C76553U2r c76553U2r4 = c76549U2n4.LJLJI;
                if (c76553U2r4 != null && (showListUser3 = c76553U2r4.LJLIL) != null) {
                    i3 = showListUser3.order;
                }
                if (i3 == this.LJ) {
                    C0NB.LIZIZ("LiveShowAnchorListDialog", "onSelectedChanged targetOrder == lastDragVHOrder return");
                    return;
                }
                if ((c76549U2n4 instanceof C76549U2n) && c76549U2n4 != null && (c76553U2r = c76549U2n4.LJLJI) != null && (showListUser2 = c76553U2r.LJLIL) != null) {
                    j2 = showListUser2.userId;
                } else {
                    j2 = 0;
                }
                List<?> list = this.LJFF.LJLJLLL.LJLIL;
                o.LJIIIIZZ(list, "listAdapter.items");
                long j4 = 0;
                for (Object obj : list) {
                    if ((obj instanceof C76553U2r) && ((i2 = (showListUser = ((C76553U2r) obj).LJLIL).status) == 2 || i2 == 1)) {
                        int i4 = showListUser.order;
                        if (i4 == i3 - 1) {
                            j3 = showListUser.userId;
                        }
                        if (i4 == i3 + 1) {
                            j4 = showListUser.userId;
                        }
                    }
                }
                StringBuilder LIZJ = V10.LIZJ("onUpdateUserOrder targetUserId: ", j2, "; preUserId: ");
                LIZJ.append(j3);
                LIZJ.append("; nextUserId: ");
                LIZJ.append(j4);
                C0NB.LIZIZ("LiveShowAnchorListDialog", X1D.LIZIZ(LIZJ));
                this.LJFF.LJLL.LJFF(j2, j3, j4);
            }
        }
    }

    @Override // X.C0B4
    public final boolean LJIIL(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
        Boolean bool;
        C76549U2n c76549U2n;
        C76553U2r c76553U2r;
        ShowListUser showListUser;
        String str;
        C76549U2n c76549U2n2;
        C76553U2r c76553U2r2;
        ShowListUser showListUser2;
        String str2;
        Integer num;
        String str3;
        Object obj;
        Object obj2;
        C76553U2r c76553U2r3;
        ShowListUser showListUser3;
        C76553U2r c76553U2r4;
        ShowListUser showListUser4;
        ShowListUser showListUser5;
        ShowListUser showListUser6;
        ShowListUser showListUser7;
        o.LJIIIZ(recyclerView, "recyclerView");
        o.LJIIIZ(viewHolder, "viewHolder");
        int absoluteAdapterPosition = viewHolder.getAbsoluteAdapterPosition();
        int absoluteAdapterPosition2 = viewHolder2.getAbsoluteAdapterPosition();
        Object obj3 = ListProtector.get(this.LJFF.LJLJLLL.LJLIL, absoluteAdapterPosition2);
        U35 LIZ = TQA.LIZ();
        if (LIZ != null) {
            bool = Boolean.valueOf(LIZ.LJIIJJI());
        } else {
            bool = null;
        }
        if (!C29306Beo.LJJIFFI(bool) ? !(obj3 instanceof C76553U2r) : !((obj3 instanceof C76553U2r) && ((C76553U2r) obj3).LJLIL.status == 1)) {
            return false;
        }
        this.LJFF.LJLJLLL.notifyItemMoved(absoluteAdapterPosition, absoluteAdapterPosition2);
        U2W u2w = this.LJFF;
        u2w.getClass();
        if ((viewHolder instanceof C76549U2n) && (viewHolder2 instanceof C76549U2n) && (c76553U2r = (c76549U2n = (C76549U2n) viewHolder).LJLJI) != null && (showListUser = c76553U2r.LJLIL) != null && (str = showListUser.linkmicIdStr) != null && (c76553U2r2 = (c76549U2n2 = (C76549U2n) viewHolder2).LJLJI) != null && (showListUser2 = c76553U2r2.LJLIL) != null && (str2 = showListUser2.linkmicIdStr) != null && (num = u2w.LJLZ.get(str)) != null) {
            int intValue = num.intValue();
            HashMap<String, Integer> hashMap = u2w.LJLZ;
            C76553U2r c76553U2r5 = c76549U2n2.LJLJI;
            if (c76553U2r5 != null && (showListUser7 = c76553U2r5.LJLIL) != null) {
                str3 = showListUser7.linkmicIdStr;
            } else {
                str3 = null;
            }
            Integer num2 = hashMap.get(str3);
            if (num2 != null) {
                int intValue2 = num2.intValue();
                if (intValue != -1 && intValue2 != -1) {
                    C47121t6 c47121t6 = c76549U2n.LJLJL;
                    if (c47121t6 != null) {
                        c47121t6.setText(String.valueOf(intValue2));
                    }
                    C76553U2r c76553U2r6 = c76549U2n.LJLJI;
                    if (c76553U2r6 != null && (showListUser6 = c76553U2r6.LJLIL) != null) {
                        showListUser6.order = intValue2;
                    }
                    C47121t6 c47121t62 = c76549U2n2.LJLJL;
                    if (c47121t62 != null) {
                        c47121t62.setText(String.valueOf(intValue));
                    }
                    C76553U2r c76553U2r7 = c76549U2n2.LJLJI;
                    if (c76553U2r7 != null && (showListUser5 = c76553U2r7.LJLIL) != null) {
                        showListUser5.order = intValue;
                    }
                    List<?> list = u2w.LJLJLLL.LJLIL;
                    o.LJIIIIZZ(list, "listAdapter.items");
                    Iterator<?> it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if ((obj instanceof C76553U2r) && o.LJ(((C76553U2r) obj).LJLIL.linkmicIdStr, str)) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    List<?> list2 = u2w.LJLJLLL.LJLIL;
                    o.LJIIIIZZ(list2, "listAdapter.items");
                    Iterator<?> it2 = list2.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            obj2 = it2.next();
                            if ((obj2 instanceof C76553U2r) && o.LJ(((C76553U2r) obj2).LJLIL.linkmicIdStr, str2)) {
                                break;
                            }
                        } else {
                            obj2 = null;
                            break;
                        }
                    }
                    if ((obj instanceof C76553U2r) && (c76553U2r4 = (C76553U2r) obj) != null && (showListUser4 = c76553U2r4.LJLIL) != null) {
                        showListUser4.order = intValue2;
                    }
                    if ((obj2 instanceof C76553U2r) && (c76553U2r3 = (C76553U2r) obj2) != null && (showListUser3 = c76553U2r3.LJLIL) != null) {
                        showListUser3.order = intValue;
                    }
                    u2w.LJLZ.put(str, Integer.valueOf(intValue2));
                    u2w.LJLZ.put(str2, Integer.valueOf(intValue));
                }
            }
        }
        return true;
    }
}

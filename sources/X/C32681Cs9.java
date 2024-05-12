package X;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.zhiliaoapp.musically.R;
import java.util.LinkedList;
import kotlin.jvm.internal.o;

/* renamed from: X.Cs9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C32681Cs9 extends AbstractC029409q<AbstractC32678Cs6> implements InterfaceC32725Csr {
    public final DataChannel LJLIL;
    public final LinkedList<AbstractC32698CsQ<? extends C30896CAq>> LJLILLLLZI = new LinkedList<>();
    public final LinkedList<AbstractC32698CsQ<? extends C30896CAq>> LJLJI = new LinkedList<>();
    public InterfaceC32719Csl LJLJJI;
    public final Room LJLJJL;

    @Override // X.InterfaceC32725Csr
    public final boolean LJFF() {
        InterfaceC32719Csl interfaceC32719Csl = this.LJLJJI;
        if (interfaceC32719Csl != null) {
            return interfaceC32719Csl.LJFF();
        }
        return false;
    }

    @Override // X.InterfaceC32725Csr
    public final long LJJIII() {
        Room room = this.LJLJJL;
        if (room != null) {
            return room.getOwnerUserId();
        }
        return 0L;
    }

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLILLLLZI.size();
    }

    public C32681Cs9(DataChannel dataChannel) {
        Room room;
        this.LJLIL = dataChannel;
        if (dataChannel != null) {
            room = (Room) dataChannel.kv0(RoomChannel.class);
        } else {
            room = null;
        }
        this.LJLJJL = room;
    }

    @Override // X.InterfaceC32725Csr
    public final void LIZIZ(AbstractC32698CsQ<? extends C30896CAq> abstractC32698CsQ) {
        InterfaceC32719Csl interfaceC32719Csl = this.LJLJJI;
        if (interfaceC32719Csl != null) {
            interfaceC32719Csl.LIZIZ(abstractC32698CsQ);
        }
    }

    @Override // X.InterfaceC32725Csr
    public final void LIZJ(boolean z) {
        InterfaceC32719Csl interfaceC32719Csl = this.LJLJJI;
        if (interfaceC32719Csl != null) {
            interfaceC32719Csl.LIZJ(false);
        }
    }

    @Override // X.InterfaceC32725Csr
    public final void LIZLLL(AbstractC32698CsQ<? extends C30896CAq> panel) {
        o.LJIIIZ(panel, "panel");
        InterfaceC32719Csl interfaceC32719Csl = this.LJLJJI;
        if (interfaceC32719Csl != null) {
            interfaceC32719Csl.LIZLLL(panel);
        }
    }

    @Override // X.InterfaceC32725Csr
    public final void LJII(AbstractC32698CsQ<? extends C30896CAq> panel) {
        o.LJIIIZ(panel, "panel");
        InterfaceC32719Csl interfaceC32719Csl = this.LJLJJI;
        if (interfaceC32719Csl != null) {
            interfaceC32719Csl.LJII(panel);
        }
    }

    @Override // X.InterfaceC32725Csr
    public final void LJIIIIZZ(long j) {
        InterfaceC32719Csl interfaceC32719Csl = this.LJLJJI;
        if (interfaceC32719Csl != null) {
            interfaceC32719Csl.LJIIIIZZ(j);
        }
    }

    @Override // X.InterfaceC32725Csr
    public final void LJIIJJI(long j) {
        InterfaceC32719Csl interfaceC32719Csl = this.LJLJJI;
        if (interfaceC32719Csl != null) {
            interfaceC32719Csl.LJIIJJI(j);
        }
    }

    @Override // X.InterfaceC32725Csr
    public final void LJIILLIIL(AbstractC32698CsQ<? extends C30896CAq> abstractC32698CsQ) {
        InterfaceC32719Csl interfaceC32719Csl = this.LJLJJI;
        if (interfaceC32719Csl != null) {
            interfaceC32719Csl.LJIILLIIL(abstractC32698CsQ);
        }
    }

    @Override // X.InterfaceC32725Csr
    public final void LJJJJ(long j) {
        InterfaceC32719Csl interfaceC32719Csl = this.LJLJJI;
        if (interfaceC32719Csl != null) {
            interfaceC32719Csl.LJIJ(j);
        }
    }

    public final void LJLZ(LinkedList<AbstractC32698CsQ<? extends C30896CAq>> linkedList) {
        if (linkedList == null) {
            return;
        }
        this.LJLJI.clear();
        this.LJLJI.addAll(this.LJLILLLLZI);
        this.LJLILLLLZI.clear();
        this.LJLILLLLZI.addAll(linkedList);
        C03200Aq.LIZ(new C32703CsV(this), true).LIZJ(this);
    }

    public final void LJZ(LinkedList<AbstractC32698CsQ<? extends C30896CAq>> linkedList) {
        this.LJLILLLLZI.clear();
        if (linkedList != null) {
            this.LJLILLLLZI.addAll(linkedList);
        }
        notifyDataSetChanged();
    }

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        AbstractC32698CsQ<? extends C30896CAq> abstractC32698CsQ = this.LJLILLLLZI.get(i);
        if (abstractC32698CsQ != null) {
            return abstractC32698CsQ.LIZ;
        }
        return 0;
    }

    public AbstractC32678Cs6 LJLLLLLL(int i, ViewGroup parent) {
        int i2;
        Object c32727Cst;
        InterfaceC39413FdR interfaceC39413FdR;
        o.LJIIIZ(parent, "parent");
        long uptimeMillis = SystemClock.uptimeMillis();
        if (i != 1) {
            switch (i) {
                case 9:
                    View view = C20910rv.LIZ.LJII(R.layout.d8o);
                    if (view == null) {
                        view = C28289B8j.LIZ(parent, R.layout.d8o, parent, false);
                    }
                    o.LJIIIIZZ(view, "view");
                    c32727Cst = new C32600Cqq(view);
                    break;
                case 10:
                    View view2 = C20910rv.LIZ.LJII(R.layout.d8x);
                    if (view2 == null) {
                        view2 = C28289B8j.LIZ(parent, R.layout.d8x, parent, false);
                    }
                    o.LJIIIIZZ(view2, "view");
                    c32727Cst = new C32597Cqn(view2);
                    break;
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                    View view3 = C20910rv.LIZ.LJII(R.layout.d8x);
                    if (view3 == null) {
                        view3 = C28289B8j.LIZ(parent, R.layout.d8x, parent, false);
                    }
                    o.LJIIIIZZ(view3, "view");
                    c32727Cst = new C32598Cqo(view3);
                    break;
                case 12:
                    c32727Cst = new C32680Cs8(C1FL.LIZIZ(parent, R.layout.d8v, parent, false, "from(parent.context).inf…atch_item, parent, false)"), this.LJLILLLLZI);
                    break;
                case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                    c32727Cst = new C32582CqY(C1FL.LIZIZ(parent, R.layout.d8m, parent, false, "from(parent.context)\n   …tion_gift, parent, false)"), 13);
                    break;
                case 14:
                    c32727Cst = new C32582CqY(C1FL.LIZIZ(parent, R.layout.d8m, parent, false, "from(parent.context)\n   …tion_gift, parent, false)"), 14);
                    break;
                default:
                    c32727Cst = new C32754CtK(C1FL.LIZIZ(parent, R.layout.d8x, parent, false, "from(parent.context).inf…_envelope, parent, false)"));
                    break;
            }
        } else {
            if (C31160CKu.LIZ()) {
                i2 = R.layout.d8q;
            } else {
                i2 = R.layout.d8s;
            }
            View view4 = C20910rv.LIZ.LJII(i2);
            if (view4 == null) {
                view4 = C28289B8j.LIZ(parent, i2, parent, false);
            }
            o.LJIIIIZZ(view4, "view");
            c32727Cst = new C32727Cst(view4);
        }
        OSZ osz = new OSZ(c32727Cst, Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis));
        AbstractC32678Cs6 abstractC32678Cs6 = (AbstractC32678Cs6) osz.getFirst();
        long longValue = ((Number) osz.getSecond()).longValue();
        String type = abstractC32678Cs6.Q();
        o.LJIIIZ(type, "type");
        if (TextUtils.isEmpty("gift_view_holder_create_time") || (interfaceC39413FdR = C32777Cth.LIZ) == null || interfaceC39413FdR.LIZLLL(0.1f)) {
            BZI LIZ = C28787BRn.LIZ("gift_view_holder_create_time");
            LIZ.LJIJJ(Long.valueOf(longValue), "time");
            LIZ.LJIJJ(type, "type");
            LIZ.LJJIIJZLJL();
        }
        return abstractC32678Cs6;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(AbstractC32678Cs6 abstractC32678Cs6, int i) {
        InterfaceC39413FdR interfaceC39413FdR;
        AbstractC32678Cs6 holder = abstractC32678Cs6;
        o.LJIIIZ(holder, "holder");
        long uptimeMillis = SystemClock.uptimeMillis();
        AbstractC32698CsQ<? extends C30896CAq> abstractC32698CsQ = this.LJLILLLLZI.get(i);
        if (abstractC32698CsQ == null) {
            return;
        }
        if (abstractC32698CsQ.LIZ == 0) {
            holder.itemView.setVisibility(4);
            return;
        }
        holder.LJZI = this;
        holder.N(abstractC32698CsQ, this.LJLIL, i);
        long longValue = ((Number) new OSZ(C76800UCe.LIZ, Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis)).getSecond()).longValue();
        String type = holder.Q();
        o.LJIIIZ(type, "type");
        if (!TextUtils.isEmpty("gift_view_holder_create_time") && (interfaceC39413FdR = C32777Cth.LIZ) != null && !interfaceC39413FdR.LIZLLL(0.05f)) {
            return;
        }
        BZI LIZ = C28787BRn.LIZ("gift_view_holder_bind_time");
        LIZ.LJIJJ(Long.valueOf(longValue), "time");
        LIZ.LJIJJ(type, "type");
        LIZ.LJJIIJZLJL();
    }

    @Override // X.AbstractC029409q
    public AbstractC32678Cs6 onCreateViewHolder(ViewGroup viewGroup, int i) {
        AbstractC32678Cs6 LJLLLLLL = LJLLLLLL(i, viewGroup);
        C0AX.LIZ(viewGroup, LJLLLLLL.itemView, R.id.lj7);
        View view = LJLLLLLL.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
        }
        try {
            if (LJLLLLLL.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(LJLLLLLL.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) LJLLLLLL.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(LJLLLLLL.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = LJLLLLLL.getClass().getName();
        return LJLLLLLL;
    }

    @Override // X.InterfaceC32725Csr
    public final void LJI(int i, long j, AbstractC32698CsQ<? extends C30896CAq> abstractC32698CsQ) {
        StringBuilder LIZLLL = C1FJ.LIZLLL("Select new item, position: ", i, ", giftId: ", j);
        LIZLLL.append(", panel: ");
        LIZLLL.append(abstractC32698CsQ.LIZJ());
        C0NB.LIZIZ("GiftPanelSwipe", X1D.LIZIZ(LIZLLL));
        InterfaceC32719Csl interfaceC32719Csl = this.LJLJJI;
        if (interfaceC32719Csl != null) {
            interfaceC32719Csl.LJI(i, j, abstractC32698CsQ);
        }
    }

    @Override // X.InterfaceC32725Csr
    public final void LJJJJLI(int i, long j, boolean z) {
        InterfaceC32719Csl interfaceC32719Csl = this.LJLJJI;
        if (interfaceC32719Csl != null) {
            interfaceC32719Csl.LJIIZILJ(j, z);
        }
    }

    @Override // X.InterfaceC32725Csr
    public final void LJIIIZ(long j, float f, float f2, int i, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        InterfaceC32719Csl interfaceC32719Csl = this.LJLJJI;
        if (interfaceC32719Csl != null) {
            interfaceC32719Csl.LJIIIZ(j, f, f2, i, interfaceC65784Pro);
        }
    }
}

package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.impl.revenue.starcomment.paymentdialog.ChangeSelectItemEvent;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.CZl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31541CZl extends AbstractC029409q<AbstractC31544CZo> implements InterfaceC31548CZs {
    public List<C31540CZk> LJLIL;
    public final DataChannel LJLILLLLZI;
    public final boolean LJLJI;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLIL.size();
    }

    @Override // X.InterfaceC31548CZs
    public final void LJIJI(int i) {
        int i2 = -1;
        int i3 = 0;
        for (C31540CZk c31540CZk : this.LJLIL) {
            int i4 = i3 + 1;
            if (i3 >= 0) {
                C31540CZk c31540CZk2 = c31540CZk;
                if (c31540CZk2.LIZLLL) {
                    c31540CZk2.LIZLLL = false;
                    i2 = i3;
                }
                i3 = i4;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        ((C31540CZk) ListProtector.get(this.LJLIL, i)).LIZLLL = true;
        ((C31540CZk) ListProtector.get(this.LJLIL, i)).LJII = false;
        if (i2 == i) {
            return;
        }
        notifyItemChanged(i2, "ChangeSelect");
        notifyItemChanged(i, "ChangeSelect");
        DataChannel dataChannel = this.LJLILLLLZI;
        if (dataChannel != null) {
            dataChannel.qv0(ChangeSelectItemEvent.class, ListProtector.get(this.LJLIL, i));
        }
    }

    public final void LJLLLLLL(List<C31540CZk> commentItems) {
        o.LJIIIZ(commentItems, "commentItems");
        this.LJLIL = commentItems;
        Iterator it = ((ArrayList) commentItems).iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i2 = i + 1;
            if (i >= 0) {
                if (((C31540CZk) next).LIZLLL) {
                    notifyItemChanged(i, "RefreshTime");
                }
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
    }

    public C31541CZl(DataChannel dataChannel, List list) {
        Boolean bool;
        this.LJLIL = list;
        this.LJLILLLLZI = dataChannel;
        if (dataChannel != null) {
            bool = (Boolean) dataChannel.kv0(BCW.class);
        } else {
            bool = null;
        }
        this.LJLJI = C29306Beo.LJJ(bool);
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(AbstractC31544CZo abstractC31544CZo, int i) {
        AbstractC31544CZo holder = abstractC31544CZo;
        o.LJIIIZ(holder, "holder");
        holder.L((C31540CZk) ListProtector.get(this.LJLIL, i), new ArrayList());
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final AbstractC31544CZo com_ss_android_ugc_aweme_ecommerce_core_view_speclayoutv2_SpecItemAdapterV2__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        AbstractC31544CZo c31543CZn;
        o.LJIIIZ(parent, "parent");
        if (this.LJLJI) {
            View view = C28289B8j.LIZ(parent, R.layout.d9l, parent, false);
            o.LJIIIIZZ(view, "view");
            c31543CZn = new C31542CZm(view, this);
        } else {
            View view2 = C28289B8j.LIZ(parent, R.layout.d9m, parent, false);
            o.LJIIIIZZ(view2, "view");
            c31543CZn = new C31543CZn(view2, this);
        }
        C0AX.LIZ(parent, c31543CZn.itemView, R.id.lj7);
        View view3 = c31543CZn.itemView;
        if (view3 != null) {
            view3.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (c31543CZn.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c31543CZn.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c31543CZn.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c31543CZn.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = c31543CZn.getClass().getName();
        return c31543CZn;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(AbstractC31544CZo abstractC31544CZo, int i, List payloads) {
        AbstractC31544CZo holder = abstractC31544CZo;
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(payloads, "payloads");
        holder.L((C31540CZk) ListProtector.get(this.LJLIL, i), payloads);
    }
}

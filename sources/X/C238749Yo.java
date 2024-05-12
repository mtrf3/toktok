package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.9Yo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C238749Yo extends AbstractC029409q<BFB> {
    public final DataChannel LJLIL;
    public final String LJLILLLLZI;
    public final long LJLJI;
    public final boolean LJLJJI;
    public final boolean LJLJJL;
    public List<BFC> LJLJJLL = new ArrayList();
    public final List<BFC> LJLJL = new ArrayList();
    public InterfaceC88472Yns<? super Boolean, C76800UCe> LJLJLJ;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLJJLL.size();
    }

    public final void LJLLLLLL(String str) {
        Boolean bool;
        List<BFC> list = this.LJLJL;
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            BFC bfc = (BFC) next;
            String str2 = bfc.LIZJ;
            Boolean bool2 = null;
            if (str2 != null) {
                bool = Boolean.valueOf(s.LJJJLZIJ(str2, str, true));
            } else {
                bool = null;
            }
            if (!C29306Beo.LJJIFFI(bool)) {
                String str3 = bfc.LIZLLL;
                if (str3 != null) {
                    bool2 = Boolean.valueOf(s.LJJJLZIJ(str3, str, true));
                }
                if (C29306Beo.LJJIFFI(bool2)) {
                }
            }
            arrayList.add(next);
        }
        this.LJLJJLL = ORZ.LLJILJILJ(arrayList);
        notifyDataSetChanged();
        InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns = this.LJLJLJ;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(Boolean.valueOf(((ArrayList) this.LJLJJLL).isEmpty()));
        }
    }

    public final void LJLZ(long j) {
        BFC bfc = null;
        for (BFC bfc2 : this.LJLJL) {
            if (bfc2.LIZ == j) {
                bfc = bfc2;
            }
        }
        if (bfc != null) {
            ((ArrayList) this.LJLJL).remove(bfc);
            this.LJLJJLL.remove(bfc);
            notifyDataSetChanged();
        }
    }

    public final void setData(List<BFC> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (BFC bfc : list) {
            if (bfc.LIZ != this.LJLJI) {
                arrayList.add(bfc);
            }
        }
        ((ArrayList) this.LJLJL).clear();
        ((ArrayList) this.LJLJL).addAll(arrayList);
        this.LJLJJLL.clear();
        this.LJLJJLL.addAll(arrayList);
        notifyDataSetChanged();
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(BFB bfb, int i) {
        BFB holder = bfb;
        o.LJIIIZ(holder, "holder");
        holder.LJJZZIII(ListProtector.get(this.LJLJJLL, i));
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final BFB com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup viewGroup, int i) {
        View LIZIZ = C06490Nh.LIZIZ(viewGroup, "parent", R.layout.d6m, viewGroup, false);
        DataChannel dataChannel = this.LJLIL;
        BFA bfa = new BFA(dataChannel, LIZIZ, this.LJLILLLLZI, this.LJLJI, C29306Beo.LJJIZ(dataChannel), this.LJLJJI, this.LJLJL, this.LJLJJL);
        C0AX.LIZ(viewGroup, bfa.itemView, R.id.lj7);
        View view = bfa.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
        }
        try {
            if (bfa.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(BFA.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) bfa.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(bfa.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = BFA.class.getName();
        return bfa;
    }

    public C238749Yo(long j, DataChannel dataChannel, String str, boolean z, boolean z2) {
        this.LJLIL = dataChannel;
        this.LJLILLLLZI = str;
        this.LJLJI = j;
        this.LJLJJI = z;
        this.LJLJJL = z2;
    }
}

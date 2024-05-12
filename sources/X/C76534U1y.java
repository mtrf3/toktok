package X;

import Y.ACListenerS47S0200000_13;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdkapi.depend.model.live.match.MultiMatchPrepareResponse;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.U1y, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76534U1y extends AbstractC029409q<U22> {
    public final U24 LJLIL;
    public boolean LJLILLLLZI;
    public final List<C75883TqJ> LJLJI;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return ((ArrayList) this.LJLJI).size();
    }

    public C76534U1y(U24 supportCallback) {
        o.LJIIIZ(supportCallback, "supportCallback");
        this.LJLIL = supportCallback;
        this.LJLJI = new ArrayList();
    }

    public final void setData(List<C75883TqJ> list) {
        boolean z;
        ((ArrayList) this.LJLJI).clear();
        if (((ArrayList) list).isEmpty()) {
            return;
        }
        ((ArrayList) this.LJLJI).addAll(list);
        MultiMatchPrepareResponse multiMatchPrepareResponse = C76265TwT.LJIILLIIL;
        if (multiMatchPrepareResponse == null || multiMatchPrepareResponse.bestTeammateId != 0) {
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                C75883TqJ c75883TqJ = (C75883TqJ) it.next();
                MultiMatchPrepareResponse multiMatchPrepareResponse2 = C76265TwT.LJIILLIIL;
                if (multiMatchPrepareResponse2 != null && multiMatchPrepareResponse2.bestTeammateId == c75883TqJ.LIZ) {
                    z = true;
                } else {
                    z = false;
                }
                c75883TqJ.LJIJ = z;
            }
        }
        notifyItemRangeChanged(0, getItemCount());
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(U22 u22, int i) {
        ImageModel imageModel;
        String str;
        U22 holder = u22;
        o.LJIIIZ(holder, "holder");
        C75883TqJ coHostUser = (C75883TqJ) ListProtector.get(this.LJLJI, i);
        o.LJIIIZ(coHostUser, "coHostUser");
        C75883TqJ Y3 = holder.LJLJJL.LJLIL.Y3();
        if (Y3 != null && coHostUser.LIZ == Y3.LIZ) {
            holder.itemView.setBackgroundResource(R.drawable.cqj);
        } else {
            holder.itemView.setBackgroundResource(R.drawable.cqi);
        }
        holder.LJLJI.LIZIZ(14.0f);
        C47061t0 c47061t0 = holder.LJLIL;
        C75768ToS c75768ToS = coHostUser.LJIIZILJ;
        String str2 = null;
        if (c75768ToS != null) {
            imageModel = c75768ToS.LIZJ;
        } else {
            imageModel = null;
        }
        C15640jQ.LJIIIZ(c47061t0, imageModel, c47061t0.getWidth(), holder.LJLIL.getHeight(), R.drawable.b7n, null);
        C47121t6 c47121t6 = holder.LJLILLLLZI;
        C75768ToS c75768ToS2 = coHostUser.LJIIZILJ;
        if (c75768ToS2 != null) {
            str = c75768ToS2.LIZ;
            str2 = c75768ToS2.LIZIZ;
        } else {
            str = null;
        }
        c47121t6.setText(C05170If.LIZIZ(str, str2));
        MultiMatchPrepareResponse multiMatchPrepareResponse = C76265TwT.LJIILLIIL;
        if ((multiMatchPrepareResponse != null && coHostUser.LIZ == multiMatchPrepareResponse.bestTeammateId) || coHostUser.LJIJ) {
            if (holder.LJLJI.getVisibility() != 0) {
                holder.LJLJI.setVisibility(0);
            }
            if (CCJ.LIZ(holder.itemView.getContext())) {
                holder.LJLJJI.setLayoutDirection(1);
            }
        } else {
            holder.LJLJI.setVisibility(8);
        }
        C16880lQ.LJIIJ(new ACListenerS47S0200000_13(holder.LJLJJL, coHostUser, 49), holder.itemView);
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final U22 com_ss_android_ugc_aweme_ecommerce_core_view_speclayoutv2_SpecItemAdapterV2__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(parent.getContext()), R.layout.dey, parent, false);
        o.LJIIIIZZ(LLLLIILL, "inflater.inflate(\n      …      false\n            )");
        U22 u22 = new U22(this, LLLLIILL);
        C0AX.LIZ(parent, u22.itemView, R.id.lj7);
        View view = u22.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (u22.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(U22.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) u22.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(u22.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = U22.class.getName();
        return u22;
    }
}

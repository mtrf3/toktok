package X;

import Y.ACListenerS36S0200000_1;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelViewModel;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.social.model.MAFIMUser;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.4Pq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C109024Pq extends AbstractC029409q<RecyclerView.ViewHolder> {
    public final SharePanelViewModel LJLIL;
    public final C4OT LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final List<Integer> LJLJJI;
    public final List<Integer> LJLJJL;
    public final C62822Ol8 LJLJJLL;

    public final List<IMContact> getData() {
        return (List) this.LJLJJLL.getValue();
    }

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return getData().size();
    }

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        Object obj = ListProtector.get(getData(), i);
        if (obj instanceof C108724Om) {
            return 2;
        }
        if (obj instanceof C4NN) {
            return 3;
        }
        if (obj instanceof MAFIMUser) {
            if (C3UE.LIZ()) {
                return 1;
            }
            return 4;
        }
        if (obj instanceof C108734On) {
            return 5;
        }
        if (obj instanceof C4QE) {
            return 6;
        }
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC029409q
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder holder) {
        o.LJIIIZ(holder, "holder");
        super.onViewAttachedToWindow(holder);
        if (holder instanceof C4QS) {
            ((C4QS) holder).onAttachedToWindow();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC029409q
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder holder) {
        o.LJIIIZ(holder, "holder");
        super.onViewDetachedFromWindow(holder);
        if (holder instanceof C4QS) {
            ((C4QS) holder).onDetachedFromWindow();
        }
    }

    public C109024Pq(SharePanelViewModel viewModel, C4OT c4ot) {
        o.LJIIIZ(viewModel, "viewModel");
        this.LJLIL = viewModel;
        this.LJLILLLLZI = c4ot;
        this.LJLJI = C221108m2.LIZIZ(C4QD.LJLIL);
        this.LJLJJI = new ArrayList();
        this.LJLJJL = new ArrayList();
        this.LJLJJLL = C221108m2.LIZIZ(C4Q9.LJLIL);
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        o.LJIIIZ(viewHolder, "viewHolder");
        if (viewHolder instanceof C109054Pt) {
            ((C109054Pt) viewHolder).L((IMContact) ListProtector.get(getData(), i), this.LJLIL);
            return;
        }
        if (viewHolder instanceof C109114Pz) {
            Object obj = ListProtector.get(getData(), i);
            o.LJII(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.im.service.model.IMBatchGroup");
            ((C109114Pz) viewHolder).L((C4NN) obj, this.LJLIL);
            return;
        }
        if (viewHolder instanceof C108904Pe) {
            ((C108904Pe) viewHolder).L((IMContact) ListProtector.get(getData(), i), i, ((ArrayList) this.LJLJJI).contains(Integer.valueOf(i)), ((ArrayList) this.LJLJJL).contains(Integer.valueOf(i)), this.LJLIL, null, null, null);
            return;
        }
        if (viewHolder instanceof C57367MfL) {
            Object obj2 = ListProtector.get(getData(), i);
            o.LJII(obj2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.social.model.MAFIMUser");
            ((C57367MfL) viewHolder).L((MAFIMUser) obj2, i, this.LJLIL);
        } else {
            if (!(viewHolder instanceof C109214Qj)) {
                return;
            }
            C109214Qj c109214Qj = (C109214Qj) viewHolder;
            IMContact contact = (IMContact) ListProtector.get(getData(), i);
            o.LJIIIZ(contact, "contact");
            C1DG.LJI(c109214Qj.itemView, R.string.r5w, (TuxTextView) c109214Qj.itemView.findViewById(R.id.title));
            C16880lQ.LJIIJ(new ACListenerS36S0200000_1(contact, c109214Qj, 88), c109214Qj.itemView);
        }
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        RecyclerView.ViewHolder LIZ;
        o.LJIIIZ(parent, "parent");
        boolean z = true;
        if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    if (i != 5) {
                        if (i != 6) {
                            LIZ = C108934Ph.LIZ(parent, this.LJLIL, this.LJLILLLLZI, true, false);
                        } else {
                            LIZ = C4Q1.LIZ(parent);
                        }
                    } else {
                        SharePanelViewModel viewModel = this.LJLIL;
                        o.LJIIIZ(viewModel, "viewModel");
                        View itemView = C16880lQ.LLLLIILL(C16880lQ.LLZIL(parent.getContext()), R.layout.b3e, parent, false);
                        o.LJIIIIZZ(itemView, "itemView");
                        LIZ = new C109214Qj(itemView, viewModel);
                    }
                } else {
                    LIZ = C109094Px.LIZ(parent, this.LJLIL, this.LJLILLLLZI, false);
                }
            } else {
                LIZ = C109104Py.LIZ(parent, this.LJLIL, false);
            }
        } else {
            LIZ = C109084Pw.LIZ(parent, this.LJLIL, false);
        }
        C0AX.LIZ(parent, LIZ.itemView, R.id.lj7);
        View view = LIZ.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (LIZ.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(LIZ.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) LIZ.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(LIZ.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = LIZ.getClass().getName();
        return LIZ;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i, List<Object> payloads) {
        C108904Pe c108904Pe;
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(payloads, "payloads");
        if (payloads.isEmpty()) {
            super.onBindViewHolder(holder, i, payloads);
        } else {
            if (!(holder instanceof C108904Pe) || (c108904Pe = (C108904Pe) holder) == null) {
                return;
            }
            Object obj = ListProtector.get(payloads, 0);
            o.LJII(obj, "null cannot be cast to non-null type kotlin.Boolean");
            c108904Pe.Q(((Boolean) obj).booleanValue());
        }
    }
}

package X;

import Y.AfS61S0100000_9;
import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.inbox.api.MultiApiManager;
import com.ss.android.ugc.aweme.inbox.widget.multi.InboxEntrancePod;
import com.ss.android.ugc.aweme.inbox.widget.multi.MultiViewModel;
import com.ss.android.ugc.aweme.recommend.users.RecommendUserService;
import com.ss.android.ugc.aweme.recommend.users.RecommendUserServiceImpl;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MMG extends AbstractC28801Bc<AbstractC56676MMe, RecyclerView.ViewHolder> {
    public final Fragment LJLIL;
    public final Context LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final SparseArray<C96533qb> LJLJJI;
    public RecyclerView LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public final C62822Ol8 LJLJL;
    public final C62822Ol8 LJLJLJ;
    public final C62822Ol8 LJLJLLL;
    public final C62822Ol8 LJLL;
    public int LJLLI;
    public InboxEntrancePod LJLLILLLL;
    public int LJLLJ;
    public int LJLLL;

    public final MultiViewModel LJLZ() {
        return (MultiViewModel) this.LJLJI.getValue();
    }

    public final void LJZI() {
        InboxEntrancePod inboxEntrancePod = this.LJLLILLLL;
        if (inboxEntrancePod == null) {
            return;
        }
        C78999UzT.LJFF(MultiApiManager.LIZ().updateInboxEntrance(inboxEntrancePod.entranceCell.getCellId(), this.LJLLJ, inboxEntrancePod.entranceCell.getGroup(), inboxEntrancePod.entranceCell.getSystemNoticeType()).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS61S0100000_9(this, 43), new AfS61S0100000_9(this, 44)), (C73318Sq2) this.LJLJJLL.getValue());
    }

    public final void LJLLLLLL() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("delete item ");
        LIZ.append(this.LJLLI);
        LIZ.append(' ');
        C221018lt.LJFF("MultiAdapter", X1D.LIZIZ(LIZ));
        InboxEntrancePod inboxEntrancePod = this.LJLLILLLL;
        if (inboxEntrancePod != null) {
            if (inboxEntrancePod.entranceCell.getFilterType() != Integer.MIN_VALUE) {
                C54362LVe.LIZLLL(inboxEntrancePod.entranceCell.getFilterType());
            } else if (inboxEntrancePod.entranceCell.getGroup() != 0) {
                C54362LVe.LIZIZ(inboxEntrancePod.entranceCell.getGroup());
            }
            C2U8.LIZ(new C54251LQx(6, C54362LVe.LJIILJJIL(6)));
            LJLZ().tv0(inboxEntrancePod);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MMG(androidx.fragment.app.Fragment r4) {
        /*
            r3 = this;
            X.MMq r1 = new X.MMq
            r2 = 1
            r1.<init>(r2)
            java.lang.String r0 = "fragment"
            kotlin.jvm.internal.o.LJIIIZ(r4, r0)
            r3.<init>(r1)
            r3.LJLIL = r4
            android.content.Context r0 = r4.getContext()
            r3.LJLILLLLZI = r0
            r3.setHasStableIds(r2)
            kotlin.jvm.internal.AqS159S0100000_9 r1 = new kotlin.jvm.internal.AqS159S0100000_9
            r0 = 838(0x346, float:1.174E-42)
            r1.<init>(r3, r0)
            X.Ol8 r0 = X.C221108m2.LIZIZ(r1)
            r3.LJLJI = r0
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r3.LJLJJI = r0
            X.MMS r0 = X.MMS.LJLIL
            X.Ol8 r0 = X.C221108m2.LIZIZ(r0)
            r3.LJLJJLL = r0
            kotlin.jvm.internal.AqS159S0100000_9 r1 = new kotlin.jvm.internal.AqS159S0100000_9
            r0 = 836(0x344, float:1.171E-42)
            r1.<init>(r3, r0)
            X.Ol8 r0 = X.C221108m2.LIZIZ(r1)
            r3.LJLJL = r0
            kotlin.jvm.internal.AqS159S0100000_9 r1 = new kotlin.jvm.internal.AqS159S0100000_9
            r0 = 833(0x341, float:1.167E-42)
            r1.<init>(r3, r0)
            X.Ol8 r0 = X.C221108m2.LIZIZ(r1)
            r3.LJLJLJ = r0
            kotlin.jvm.internal.AqS159S0100000_9 r1 = new kotlin.jvm.internal.AqS159S0100000_9
            r0 = 834(0x342, float:1.169E-42)
            r1.<init>(r3, r0)
            X.Ol8 r0 = X.C221108m2.LIZIZ(r1)
            r3.LJLJLLL = r0
            kotlin.jvm.internal.AqS159S0100000_9 r1 = new kotlin.jvm.internal.AqS159S0100000_9
            r0 = 835(0x343, float:1.17E-42)
            r1.<init>(r3, r0)
            X.Ol8 r0 = X.C221108m2.LIZIZ(r1)
            r3.LJLL = r0
            r3.LJLLL = r2
            r0 = 0
            X.C56652MLg.LIZ = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MMG.<init>(androidx.fragment.app.Fragment):void");
    }

    @Override // X.AbstractC029409q
    public final long getItemId(int i) {
        return getItem(i).hashCode();
    }

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        InboxEntrancePod inboxEntrancePod;
        AbstractC56676MMe item = getItem(i);
        int i2 = item.type;
        if (i2 == 21) {
            this.LJLLL = i;
        }
        if ((item instanceof InboxEntrancePod) && (inboxEntrancePod = (InboxEntrancePod) item) != null) {
            if (inboxEntrancePod.entranceCell.isActivity() && C53357Kwr.LIZIZ()) {
                return 103;
            }
            return 102;
        }
        return i2;
    }

    @Override // X.AbstractC029409q
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        this.LJLJJL = recyclerView;
    }

    @Override // X.AbstractC029409q
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        super.onDetachedFromRecyclerView(recyclerView);
        ((C73318Sq2) this.LJLJJLL.getValue()).LIZLLL();
    }

    @Override // X.AbstractC029409q
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder holder) {
        o.LJIIIZ(holder, "holder");
        if (holder instanceof MMX) {
            MMX mmx = (MMX) holder;
            mmx.U(mmx.LJJIIZI());
        }
    }

    @Override // X.AbstractC029409q
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder holder) {
        o.LJIIIZ(holder, "holder");
        if (holder instanceof MMX) {
            MMX mmx = (MMX) holder;
            mmx.Y(mmx.LJJIIZI());
        }
    }

    @Override // X.AbstractC28801Bc
    public final void submitList(List<AbstractC56676MMe> list) {
        super.submitList(list);
    }

    public static final View LJZ(int i, ViewGroup viewGroup) {
        return C1FL.LIZIZ(viewGroup, i, viewGroup, false, "from(parent.context).inf…(layoutId, parent, false)");
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i) {
        MMX mmx;
        o.LJIIIZ(holder, "holder");
        if ((holder instanceof MMX) && (mmx = (MMX) holder) != null) {
            AbstractC56676MMe item = getItem(i);
            o.LJIIIIZZ(item, "getItem(position)");
            mmx.L(item);
        }
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        MMX mmx;
        int i2;
        o.LJIIIZ(parent, "parent");
        boolean z = true;
        if (i != 0) {
            if (i != 1) {
                if (i != 9) {
                    if (i != 13) {
                        if (i != 20) {
                            if (i != 21) {
                                if (i != 102) {
                                    if (i != 103) {
                                        mmx = new MMO(LJZ(R.layout.tn, parent));
                                    } else {
                                        MMX c56721MNx = new C56721MNx(LJZ(R.layout.ry, parent));
                                        MultiViewModel multiVM = LJLZ();
                                        o.LJIIIZ(multiVM, "multiVM");
                                        C56691MMt.LIZ.getClass();
                                        mmx = c56721MNx;
                                        if (C56691MMt.LIZ()) {
                                            MLS.LJFF = multiVM;
                                            mmx = c56721MNx;
                                        }
                                    }
                                } else {
                                    MNT mnt = new MNT(new MMY(LJZ(R.layout.s7, parent)));
                                    mnt.LJLZ = new MMF(this);
                                    mmx = mnt;
                                }
                            } else {
                                mmx = new MMK(LJZ(R.layout.s8, parent));
                            }
                        } else {
                            mmx = new C56698MNa(LJZ(R.layout.ry, parent));
                        }
                    } else {
                        if (((Boolean) C53349Kwj.LIZIZ.getValue()).booleanValue()) {
                            i2 = R.layout.s4;
                        } else {
                            i2 = R.layout.s3;
                        }
                        mmx = new MNV(LJZ(i2, parent));
                    }
                } else {
                    Context context = parent.getContext();
                    o.LJIIIIZZ(context, "parent.context");
                    mmx = (MMX) C56652MLg.LIZIZ(context);
                }
            } else {
                RecommendUserService LIZIZ = RecommendUserServiceImpl.LIZIZ();
                Context context2 = parent.getContext();
                o.LJIIIIZZ(context2, "parent.context");
                MO3 LIZ = LIZIZ.LIZ(context2);
                o.LJII(LIZ, "null cannot be cast to non-null type android.view.View");
                mmx = new MO0(new MMY(LIZ));
            }
        } else {
            mmx = new MNU(new MMY(LJZ(R.layout.s6, parent)), this.LJLLL);
        }
        MultiViewModel LJLZ = LJLZ();
        o.LJIIIZ(LJLZ, "<set-?>");
        mmx.LJLJJI = LJLZ;
        Fragment fragment = this.LJLIL;
        o.LJIIIZ(fragment, "<set-?>");
        mmx.LJLJJL = fragment;
        C96533qb c96533qb = this.LJLJJI.get(i);
        if (c96533qb != null) {
            mmx.LLL(c96533qb);
        }
        C0AX.LIZ(parent, mmx.itemView, R.id.lj7);
        View view = mmx.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (mmx.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(mmx.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) mmx.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(mmx.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = mmx.getClass().getName();
        return mmx;
    }
}

package X;

import Y.ACallableS112S0100000_9;
import Y.ARunnableS28S0200000_9;
import Y.AfS61S0100000_9;
import Y.AgS126S0100000_9;
import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.inbox.api.MultiApiManager;
import com.ss.android.ugc.aweme.inbox.cache.PreloadManager;
import com.ss.android.ugc.aweme.inbox.widget.multi.InboxEntrancePod;
import com.ss.android.ugc.aweme.inbox.widget.multi.MultiViewModel;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MMD extends AbstractC28801Bc<C3ML, RecyclerView.ViewHolder> {
    public final Fragment LJLIL;
    public final MLD<?> LJLILLLLZI;
    public final Context LJLJI;
    public final C62822Ol8 LJLJJI;
    public final SparseArray<C96533qb> LJLJJL;
    public final InterfaceC109664Sc LJLJJLL;
    public final List<MMN<?>> LJLJL;
    public RecyclerView LJLJLJ;
    public final C62822Ol8 LJLJLLL;
    public final C62822Ol8 LJLL;
    public MLG LJLLI;
    public boolean LJLLILLLL;
    public final C62822Ol8 LJLLJ;
    public final C62822Ol8 LJLLL;
    public final C62822Ol8 LJLLLL;
    public int LJLLLLLL;
    public InboxEntrancePod LJLZ;
    public int LJZ;
    public int LJZI;

    public MMD() {
        throw null;
    }

    public final MultiViewModel LJLZ() {
        return (MultiViewModel) this.LJLJJI.getValue();
    }

    public final void LJZI() {
        InboxEntrancePod inboxEntrancePod = this.LJLZ;
        if (inboxEntrancePod == null) {
            return;
        }
        C78999UzT.LJFF(MultiApiManager.LIZ().updateInboxEntrance(inboxEntrancePod.entranceCell.getCellId(), this.LJZ, inboxEntrancePod.entranceCell.getGroup(), inboxEntrancePod.entranceCell.getSystemNoticeType()).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS61S0100000_9(this, 41), new AfS61S0100000_9(this, 42)), (C73318Sq2) this.LJLJLLL.getValue());
    }

    public final void LJLLLLLL() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("delete item ");
        LIZ.append(this.LJLLLLLL);
        LIZ.append(' ');
        C221018lt.LJFF("MultiAdapter", X1D.LIZIZ(LIZ));
        InboxEntrancePod inboxEntrancePod = this.LJLZ;
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

    @Override // X.AbstractC029409q
    public final long getItemId(int i) {
        return getItem(i).hashCode();
    }

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        InboxEntrancePod inboxEntrancePod;
        C3ML item = getItem(i);
        int i2 = item.LJLJI;
        if (i2 == 21) {
            this.LJZI = i;
        }
        Object obj = item.LJLJJL;
        if ((obj instanceof InboxEntrancePod) && (inboxEntrancePod = (InboxEntrancePod) obj) != null) {
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
        this.LJLJLJ = recyclerView;
        Context context = recyclerView.getContext();
        o.LJIIIIZZ(context, "recyclerView.context");
        if (L2W.LIZIZ() && !C53339KwZ.LJ()) {
            C221018lt.LJFF("SkylightController", "start preloadVH");
            if (M9O.LIZ().LIZLLL()) {
                C221018lt.LJFF("SkylightController", "start preloadVH but initState = isEmpty");
            } else {
                WeakReference<InterfaceC56632MKm> weakReference = C56652MLg.LIZ;
                if (weakReference == null || weakReference.get() == null) {
                    C56652MLg.LIZ(context);
                }
                if (((Boolean) L2W.LIZJ.getValue()).booleanValue() || L2W.LIZJ()) {
                    C56348M9o block = C56348M9o.LJLIL;
                    MMM mainNext = MMM.LJLIL;
                    o.LJIIIZ(block, "block");
                    o.LJIIIZ(mainNext, "mainNext");
                    o.LJIIIIZZ(C10K.LIZIZ(new ACallableS112S0100000_9(block, 2), C10K.LJI, null).LJ(new AgS126S0100000_9(mainNext, 0), C10K.LJIIIIZZ, null), "block: () -> T?, mainNex… Task.UI_THREAD_EXECUTOR)");
                }
                if (((Boolean) L2W.LIZLLL.getValue()).booleanValue()) {
                    C56652MLg.LJ(M9O.LIZ().LIZJ());
                }
            }
        }
        if (this.LJLJJLL.LIZIZ() && this.LJLJJLL.LJ()) {
            recyclerView.setRecycledViewPool(new RecyclerView.RecycledViewPool() { // from class: X.4Tc
                public final java.util.Set<Integer> LIZ = new LinkedHashSet();

                @Override // androidx.recyclerview.widget.RecyclerView.RecycledViewPool
                public final void putRecycledView(RecyclerView.ViewHolder viewHolder) {
                    if ((viewHolder instanceof C96803r2) && !this.LIZ.contains(Integer.valueOf(viewHolder.getItemViewType()))) {
                        this.LIZ.add(Integer.valueOf(viewHolder.getItemViewType()));
                        setMaxRecycledViews(viewHolder.getItemViewType(), IMService.createIIMServicebyMonsterPlugin(false).getInboxAdapterService().LJI(C65352Pkq.LIZ(viewHolder.getClass())));
                    }
                    super.putRecycledView(viewHolder);
                }
            });
        }
    }

    @Override // X.AbstractC029409q
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        super.onDetachedFromRecyclerView(recyclerView);
        ((C73318Sq2) this.LJLJLLL.getValue()).LIZLLL();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC029409q
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder holder) {
        List<C3ML> currentList;
        o.LJIIIZ(holder, "holder");
        if ((holder instanceof C96803r2) && !this.LJLLILLLL) {
            MLG mlg = this.LJLLI;
            if (mlg != null) {
                mlg.LIZ();
            }
            this.LJLLILLLL = true;
        }
        if (holder instanceof MMX) {
            MMX mmx = (MMX) holder;
            mmx.U(mmx.LJJIIZI());
            return;
        }
        if (!(holder instanceof MMN)) {
            return;
        }
        ((MMN) holder).onAttach();
        ((ArrayList) this.LJLJL).add(holder);
        int layoutPosition = holder.getLayoutPosition();
        if (layoutPosition <= 0 || (currentList = getCurrentList()) == null || currentList.isEmpty() || getCurrentList().size() - layoutPosition > 20) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("perform load more when position ");
        LIZ.append(holder.getLayoutPosition());
        LIZ.append('/');
        LIZ.append(getCurrentList().size());
        C221018lt.LJFF("NoticeAndDMCombineAdapter", X1D.LIZIZ(LIZ));
        MLD<?> mld = this.LJLILLLLZI;
        if (mld == null) {
            return;
        }
        mld.LJIIJJI();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC029409q
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder holder) {
        o.LJIIIZ(holder, "holder");
        if (holder instanceof MMX) {
            MMX mmx = (MMX) holder;
            mmx.Y(mmx.LJJIIZI());
        } else {
            if (!(holder instanceof MMN)) {
                return;
            }
            ((MMN) holder).onDetach();
            ((ArrayList) this.LJLJL).remove(holder);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MMD(androidx.fragment.app.Fragment r4, X.MLD r5) {
        /*
            r3 = this;
            X.4Wu r1 = new X.4Wu
            r1.<init>()
            java.lang.String r0 = "fragment"
            kotlin.jvm.internal.o.LJIIIZ(r4, r0)
            r3.<init>(r1)
            r3.LJLIL = r4
            r3.LJLILLLLZI = r5
            android.content.Context r0 = r4.getContext()
            r3.LJLJI = r0
            r2 = 1
            r3.setHasStableIds(r2)
            kotlin.jvm.internal.AqS159S0100000_9 r1 = new kotlin.jvm.internal.AqS159S0100000_9
            r0 = 832(0x340, float:1.166E-42)
            r1.<init>(r3, r0)
            X.Ol8 r0 = X.C221108m2.LIZIZ(r1)
            r3.LJLJJI = r0
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r3.LJLJJL = r0
            r0 = 0
            com.ss.android.ugc.aweme.im.service.IIMService r0 = com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService.createIIMServicebyMonsterPlugin(r0)
            X.4Sc r0 = r0.getInboxAdapterService()
            r3.LJLJJLL = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.LJLJL = r0
            X.MMR r0 = X.MMR.LJLIL
            X.Ol8 r0 = X.C221108m2.LIZIZ(r0)
            r3.LJLJLLL = r0
            kotlin.jvm.internal.AqS159S0100000_9 r1 = new kotlin.jvm.internal.AqS159S0100000_9
            r0 = 831(0x33f, float:1.164E-42)
            r1.<init>(r3, r0)
            X.Ol8 r0 = X.C221108m2.LIZIZ(r1)
            r3.LJLL = r0
            r0 = 0
            X.C56652MLg.LIZ = r0
            X.LA9.LIZIZ = r0
            kotlin.jvm.internal.AqS159S0100000_9 r1 = new kotlin.jvm.internal.AqS159S0100000_9
            r0 = 826(0x33a, float:1.157E-42)
            r1.<init>(r3, r0)
            X.Ol8 r0 = X.C221108m2.LIZIZ(r1)
            r3.LJLLJ = r0
            kotlin.jvm.internal.AqS159S0100000_9 r1 = new kotlin.jvm.internal.AqS159S0100000_9
            r0 = 827(0x33b, float:1.159E-42)
            r1.<init>(r3, r0)
            X.Ol8 r0 = X.C221108m2.LIZIZ(r1)
            r3.LJLLL = r0
            kotlin.jvm.internal.AqS159S0100000_9 r1 = new kotlin.jvm.internal.AqS159S0100000_9
            r0 = 830(0x33e, float:1.163E-42)
            r1.<init>(r3, r0)
            X.Ol8 r0 = X.C221108m2.LIZIZ(r1)
            r3.LJLLLL = r0
            r3.LJZI = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MMD.<init>(androidx.fragment.app.Fragment, X.MLD):void");
    }

    public static final View LJZ(int i, ViewGroup viewGroup) {
        return C1FL.LIZIZ(viewGroup, i, viewGroup, false, "from(parent.context).inf…(layoutId, parent, false)");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i) {
        MMJ mmj;
        MMN mmn;
        MMX mmx;
        o.LJIIIZ(holder, "holder");
        if ((holder instanceof MMX) && (mmx = (MMX) holder) != null) {
            Object obj = getItem(i).LJLJJL;
            if ((obj instanceof AbstractC56676MMe) && obj != null) {
                mmx.L(obj);
            }
        }
        boolean z = holder instanceof MMN;
        if (z && (mmn = (MMN) holder) != null) {
            C3ML item = getItem(i);
            o.LJIIIIZZ(item, "getItem(position)");
            mmn.bind(item, i);
        }
        if (!PreloadManager.LIZ.get() || MMH.LIZJ.get() || MMH.LIZIZ != 1) {
            return;
        }
        if (holder instanceof InterfaceC56632MKm) {
            mmj = MMJ.SKYLIGHT_SHOW_TIME;
        } else if ((holder instanceof C56721MNx) || (holder instanceof MNT)) {
            mmj = MMJ.ENTRANCE_LIST_SHOW_TIME;
        } else if (!z) {
            return;
        } else {
            mmj = MMJ.DM_SHOW_TIME;
        }
        if (mmj == null || !mmj.getHasRecord().compareAndSet(false, true)) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(mmj.getEventKey());
        LIZ.append("  bind start");
        C221018lt.LJFF("PreloadStatics", X1D.LIZIZ(LIZ));
        View view = holder.itemView;
        o.LJIIIIZZ(view, "holder.itemView");
        ViewTreeObserverOnPreDrawListenerC16840lM.LIZ(view, new ARunnableS28S0200000_9(mmj, view, 66));
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x00fe, code lost:
    
        if (r2 == null) goto L45;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v18, types: [X.3X5] */
    /* JADX WARN: Type inference failed for: r2v9, types: [X.3r2] */
    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.recyclerview.widget.RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(android.view.ViewGroup r10, int r11) {
        /*
            Method dump skipped, instructions count: 598
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MMD.com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(android.view.ViewGroup, int):androidx.recyclerview.widget.RecyclerView$ViewHolder");
    }
}

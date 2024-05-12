package X;

import Y.AObserverS62S0300000_1;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.im.sdk.share.viewmodel.ShareDialogViewModel;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.ss.android.ugc.aweme.social.model.MAFIMUser;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.IDqS426S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.4N7, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4N7 extends C4N8<IMContact> {
    public final SharePackage LJLJJLL;
    public final ShareDialogViewModel LJLJL;
    public final boolean LJLJLJ;
    public final boolean LJLJLLL;
    public final InterfaceC107704Ko LJLL;
    public final LifecycleOwner LJLLI;
    public boolean LJLLILLLL;
    public boolean LJLLJ;
    public LinearLayoutManager LJLLL;
    public boolean LJLLLL;
    public final IDqS426S0100000_1 LJLLLLLL;

    public final boolean LJZ(IMContact item) {
        o.LJIIIZ(item, "item");
        if (!this.LJLLILLLL || (((item instanceof IMUser) && IMUser.isFriend(((IMUser) item).getFollowStatus())) || (item instanceof C108724Om))) {
            return false;
        }
        return true;
    }

    @Override // X.C4N8, X.C4II
    public final int getBasicItemViewType(int i) {
        List list = this.LJLIL.LJ;
        if (list == null) {
            list = Collections.emptyList();
            o.LJIIIIZZ(list, "emptyList()");
        }
        if (list.isEmpty() || i < LJLLLLLL()) {
            return super.getBasicItemViewType(i);
        }
        Integer valueOf = Integer.valueOf(i - LJLLLLLL());
        int intValue = valueOf.intValue();
        if (intValue >= 0 && intValue < list.size()) {
            if (!(ListProtector.get(list, valueOf.intValue()) instanceof C108724Om)) {
                return 0;
            }
            return 2;
        }
        return super.getBasicItemViewType(i);
    }

    @Override // X.MK7, X.AbstractC029409q
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        C0A2 layoutManager = recyclerView.getLayoutManager();
        o.LJII(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        this.LJLLL = (LinearLayoutManager) layoutManager;
    }

    @Override // X.MK7, X.AbstractC029409q
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder holder) {
        C107354Jf c107354Jf;
        IMUser iMUser;
        o.LJIIIZ(holder, "holder");
        super.onViewAttachedToWindow(holder);
        if ((holder instanceof C107354Jf) && (c107354Jf = (C107354Jf) holder) != null) {
            boolean z = this.LJLJLLL;
            SharePackage sharePackage = this.LJLJJLL;
            if (!c107354Jf.LJLLI.gv0()) {
                IMContact iMContact = c107354Jf.LJZL;
                if (iMContact instanceof MAFIMUser) {
                    IMUser iMUser2 = (IMUser) iMContact;
                    if (!((java.util.Set) c107354Jf.LJLLI.LJLJJI.getValue()).contains(iMUser2.getUid())) {
                        java.util.Set set = (java.util.Set) c107354Jf.LJLLI.LJLJJI.getValue();
                        String uid = iMUser2.getUid();
                        o.LJIIIIZZ(uid, "currentContact.uid");
                        set.add(uid);
                        C107234It.LJIIIIZZ(iMContact, c107354Jf.LL, "column", sharePackage, z);
                    }
                }
                IMContact iMContact2 = c107354Jf.LJZL;
                if ((iMContact2 instanceof IMUser) && (iMUser = (IMUser) iMContact2) != null) {
                    if (!((java.util.Set) c107354Jf.LJLLI.LJLJJI.getValue()).contains(iMUser.getUid())) {
                        C107234It.LJIIIIZZ(iMUser, c107354Jf.LL, "column", sharePackage, z);
                        java.util.Set set2 = (java.util.Set) c107354Jf.LJLLI.LJLJJI.getValue();
                        String uid2 = iMUser.getUid();
                        o.LJIIIIZZ(uid2, "it.uid");
                        set2.add(uid2);
                    }
                    C78949Uyf.LJJJ(c107354Jf, c107354Jf.LJZL, c107354Jf.LJLL, 1);
                }
            }
            AObserverS62S0300000_1 aObserverS62S0300000_1 = ((C107354Jf) holder).LLD;
            if (aObserverS62S0300000_1 != null) {
                this.LJLJL.LJLLL.observe(this.LJLLI, aObserverS62S0300000_1);
            }
        }
    }

    @Override // X.MK7, X.AbstractC029409q
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder holder) {
        C107354Jf c107354Jf;
        AObserverS62S0300000_1 aObserverS62S0300000_1;
        o.LJIIIZ(holder, "holder");
        super.onViewDetachedFromWindow(holder);
        if ((holder instanceof C107354Jf) && (c107354Jf = (C107354Jf) holder) != null && (aObserverS62S0300000_1 = c107354Jf.LLD) != null) {
            this.LJLJL.LJLLL.removeObserver(aObserverS62S0300000_1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x014c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJLZ(int r23, com.ss.android.ugc.aweme.im.service.model.IMContact r24) {
        /*
            Method dump skipped, instructions count: 492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4N7.LJLZ(int, com.ss.android.ugc.aweme.im.service.model.IMContact):void");
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i, List<Object> payloads) {
        Boolean bool;
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(payloads, "payloads");
        if (holder instanceof C107354Jf) {
            if (payloads.isEmpty()) {
                onBindViewHolder(holder, i);
                return;
            }
            Object LJLLJ = ORZ.LJLLJ(payloads);
            if ((LJLLJ instanceof Boolean) && (bool = (Boolean) LJLLJ) != null) {
                ((C4N9) holder).LJLJLJ.setChecked(bool.booleanValue());
                return;
            }
            return;
        }
        super.onBindViewHolder(holder, i, payloads);
    }

    public C4N7(SharePackage sharePackage, ShareDialogViewModel memberListViewModel, boolean z, IMUser iMUser, C4NG c4ng, ActivityC45651qj lifecycleOwner) {
        o.LJIIIZ(sharePackage, "sharePackage");
        o.LJIIIZ(memberListViewModel, "memberListViewModel");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.LJLJJLL = sharePackage;
        this.LJLJL = memberListViewModel;
        this.LJLJLJ = false;
        this.LJLJLLL = z;
        this.LJLL = c4ng;
        this.LJLLI = lifecycleOwner;
        this.LJLLLLLL = new IDqS426S0100000_1(this, 14);
    }
}

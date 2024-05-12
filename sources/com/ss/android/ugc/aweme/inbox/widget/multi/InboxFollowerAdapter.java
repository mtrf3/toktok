package com.ss.android.ugc.aweme.inbox.widget.multi;

import X.C06530Nl;
import X.C10K;
import X.C116724i4;
import X.C16880lQ;
import X.C1B3;
import X.C1FL;
import X.C221108m2;
import X.C223338pd;
import X.C245319jz;
import X.C252669vq;
import X.C2U8;
import X.C46465ILl;
import X.C46466ILm;
import X.C46597IQn;
import X.C47261Igj;
import X.C52342KgU;
import X.C56762MPm;
import X.C56775MPz;
import X.C56885MUf;
import X.C56916MVk;
import X.C59512Vf;
import X.C5H3;
import X.C61878OQg;
import X.C7MY;
import X.C8HS;
import X.C96533qb;
import X.EnumC56764MPo;
import X.EnumC56772MPw;
import X.EnumC56774MPy;
import X.EnumC56954MWw;
import X.IR4;
import X.IR5;
import X.InterfaceC56810MRi;
import X.L08;
import X.MQT;
import X.MR4;
import X.MR5;
import X.MSD;
import X.MSE;
import X.MVV;
import X.MVY;
import X.MVZ;
import X.MW5;
import X.MX5;
import X.ORZ;
import X.ViewOnClickListenerC56908MVc;
import Y.ACListenerS27S0101000_9;
import Y.ACListenerS28S0100000_8;
import Y.ARunnableS45S0100000_9;
import Y.AgS76S0300000_9;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.commercialize.log.LogHelperImpl;
import com.ss.android.ugc.aweme.inbox.InboxFollowerFragment;
import com.ss.android.ugc.aweme.inbox.vm.InboxFollowerVM;
import com.ss.android.ugc.aweme.notice.api.helper.LogHelper;
import com.ss.android.ugc.aweme.notice.repo.list.bean.FollowPageData;
import com.ss.android.ugc.aweme.notice.repo.list.bean.FollowRequestData;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notification.api.MusNotificationApiManager;
import com.ss.android.ugc.aweme.notification.followrequest.api.FollowRequestApiManager;
import com.ss.android.ugc.aweme.notification.followrequest.vh.FollowRequestViewHolderInFollower;
import com.ss.android.ugc.aweme.notification.perf.FollowerPreCacheManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class InboxFollowerAdapter extends C8HS<FollowPageData> implements InterfaceC56810MRi, MX5 {
    public final C5H3 COLLAPSE_TITLE$delegate;
    public final C5H3 DISPLAY_COUNT$delegate;
    public final C5H3 DISPLAY_RECENTLY$delegate;
    public final C5H3 FOLLOW_REQUEST_DESC$delegate;
    public boolean isRecommendConnect;
    public FollowPageData mCollapseItem;
    public List<FollowPageData> mCollapseLoadedNotice;
    public FollowPageData mEmptyItem;
    public final Fragment mFragment;
    public boolean mHasMore;
    public boolean mNeedCollapseNotice;
    public int mNeedCollapseNoticeCount;
    public final MW5 mobHelper;
    public C96533qb uiStyleConfig;
    public final InboxFollowerVM vm;

    public final void autoUnfoldNotice() {
        L08.LIZ(new C59512Vf(0L, "new_follower", "autoUnfoldNotice"));
        showEarlierNotice();
    }

    @Override // X.InterfaceC56810MRi
    public void onItemClick(int i) {
    }

    public void onRemove(String uid) {
        o.LJIIIZ(uid, "uid");
    }

    public final void showEarlierNotice() {
        InboxFollowerFragment inboxFollowerFragment;
        List<FollowPageData> list;
        this.mNeedCollapseNotice = false;
        List<FollowPageData> data = getData();
        if (data == null) {
            return;
        }
        int indexOf = data.indexOf(this.mCollapseItem);
        if (indexOf != -1 && (list = this.mCollapseLoadedNotice) != null) {
            ListProtector.remove(data, indexOf);
            data.addAll(indexOf, list);
            setShowFooter(this.mHasMore);
            notifyDataSetChanged();
        }
        Fragment fragment = this.mFragment;
        if ((fragment instanceof InboxFollowerFragment) && (inboxFollowerFragment = (InboxFollowerFragment) fragment) != null && this.mHasMore) {
            inboxFollowerFragment.LJLZ.post(new ARunnableS45S0100000_9(inboxFollowerFragment, 167));
        }
    }

    private final String getCOLLAPSE_TITLE() {
        Object value = this.COLLAPSE_TITLE$delegate.getValue();
        o.LJIIIIZZ(value, "<get-COLLAPSE_TITLE>(...)");
        return (String) value;
    }

    private final int getDISPLAY_COUNT() {
        return ((Number) this.DISPLAY_COUNT$delegate.getValue()).intValue();
    }

    private final long getDISPLAY_RECENTLY() {
        return ((Number) this.DISPLAY_RECENTLY$delegate.getValue()).longValue();
    }

    private final String getFOLLOW_REQUEST_DESC() {
        return (String) this.FOLLOW_REQUEST_DESC$delegate.getValue();
    }

    private final C96533qb getLargeAvatarStyle() {
        return new C96533qb(0, C7MY.LIZIZ(56), C7MY.LIZIZ(42), C7MY.LIZIZ(40), 0, 0, 0, 0, 0, 0, 0, 0, null, 32753);
    }

    public final void dismissDeleteActionSheet() {
        FragmentManager fragmentManager = this.mFragment.getFragmentManager();
        if (fragmentManager != null) {
            C1B3 c1b3 = new C1B3(fragmentManager);
            Fragment LJJJIL = fragmentManager.LJJJIL("DELETE_NOTICE_ACTION_SHEET_TAG");
            if (LJJJIL != null) {
                c1b3.LJJI(LJJJIL);
                c1b3.LJI();
            }
        }
    }

    public final void showEmpty() {
        List<FollowPageData> data = getData();
        if (data == null || data.isEmpty()) {
            setData(C47261Igj.LJJIJIL(this.mEmptyItem));
        } else {
            List<FollowPageData> data2 = getData();
            if (data2 != null) {
                data2.clear();
            }
            List<FollowPageData> data3 = getData();
            if (data3 != null) {
                data3.add(this.mEmptyItem);
            }
        }
        notifyDataSetChanged();
    }

    public final MW5 getMobHelper() {
        return this.mobHelper;
    }

    public final C96533qb getUiStyleConfig() {
        return this.uiStyleConfig;
    }

    public final InboxFollowerVM getVm() {
        return this.vm;
    }

    public final boolean isRecommendConnect() {
        return this.isRecommendConnect;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InboxFollowerAdapter(Fragment mFragment) {
        super(false);
        o.LJIIIZ(mFragment, "mFragment");
        this.mFragment = mFragment;
        this.FOLLOW_REQUEST_DESC$delegate = C221108m2.LIZIZ(C46465ILl.LJLIL);
        this.COLLAPSE_TITLE$delegate = C221108m2.LIZIZ(C46466ILm.LJLIL);
        this.DISPLAY_COUNT$delegate = C221108m2.LIZIZ(IR4.LJLIL);
        this.DISPLAY_RECENTLY$delegate = C221108m2.LIZIZ(IR5.LJLIL);
        this.mobHelper = new MW5();
        this.vm = (InboxFollowerVM) ViewModelProviders.of(mFragment).get(InboxFollowerVM.class);
        this.mEmptyItem = new FollowPageData(EnumC56774MPy.EMPTY.ordinal(), null, null, 0L, 0L, 30, null);
        this.mNeedCollapseNotice = true;
        this.mCollapseItem = new FollowPageData(EnumC56774MPy.COLLAPSE.ordinal(), null, null, 0L, 0L, 30, null);
        if (C52342KgU.LIZJ()) {
            this.uiStyleConfig = getLargeAvatarStyle();
        }
    }

    private final void showDeleteActionSheet(int i) {
        FragmentManager fragmentManager;
        if (this.mFragment.getContext() == null || (fragmentManager = this.mFragment.getFragmentManager()) == null) {
            return;
        }
        ACListenerS27S0101000_9 aCListenerS27S0101000_9 = new ACListenerS27S0101000_9(this, i, 1);
        C245319jz c245319jz = new C245319jz();
        C252669vq LIZIZ = C06530Nl.LIZIZ(R.string.efd);
        LIZIZ.LIZJ = 1;
        LIZIZ.LJ = aCListenerS27S0101000_9;
        c245319jz.LIZIZ(LIZIZ);
        c245319jz.LIZJ().show(fragmentManager, "DELETE_NOTICE_ACTION_SHEET_TAG");
    }

    @Override // X.C4II
    public int getBasicItemViewType(int i) {
        FollowPageData followPageData;
        List<FollowPageData> data = getData();
        if (data == null || (followPageData = (FollowPageData) ListProtector.get(data, i)) == null) {
            return -1;
        }
        MusNotice notice = followPageData.getNotice();
        if (notice != null && notice.templateNotice != null) {
            return EnumC56774MPy.TEMPLATE.ordinal();
        }
        if (followPageData.getNotice() != null) {
            return EnumC56774MPy.FOLLOWER.ordinal();
        }
        if (followPageData.getFollowRequest() != null) {
            return EnumC56774MPy.FOLLOW_REQUEST.ordinal();
        }
        return followPageData.getType();
    }

    public final void onDeleteItem(int i) {
        List<T> list;
        User user;
        Context context = this.mFragment.getContext();
        if (context == null || (list = this.mmItems) == 0) {
            return;
        }
        int size = list.size();
        if (size > 0 && i >= 0 && i < size) {
            FollowPageData followPageData = (FollowPageData) ListProtector.get(list, i);
            MusNotice notice = followPageData.getNotice();
            if (notice != null) {
                MusNotificationApiManager.LIZ(notice.nid).LJ(new AgS76S0300000_9(this, context, notice, 0), C10K.LJIIIIZZ, null);
                FollowerPreCacheManager.LIZ(notice.nid, null, 2);
            }
            FollowRequestData followRequest = followPageData.getFollowRequest();
            if (followRequest != null && (user = followRequest.getUser()) != null) {
                FollowRequestApiManager.LIZJ(new WeakHandler(MR5.LJLIL), user.getUid());
                LogHelper LJIIIIZZ = LogHelperImpl.LJIIIIZZ();
                String uid = user.getUid();
                o.LJIIIIZZ(uid, "it.uid");
                LJIIIIZZ.LJFF(user, "notification_page", uid);
                FollowerPreCacheManager.LIZ(null, user.getUid(), 1);
            }
            doDeleteItem(i, followPageData);
        }
        List<FollowPageData> data = getData();
        if (data == null || data.isEmpty()) {
            showEmpty();
        }
    }

    @Override // X.InterfaceC56810MRi
    public void onItemLongClick(int i) {
        List<FollowPageData> data = getData();
        if (data == null || i >= data.size()) {
            return;
        }
        FollowPageData followPageData = (FollowPageData) ListProtector.get(data, i);
        if (followPageData.getNotice() == null && followPageData.getFollowRequest() == null) {
            return;
        }
        showDeleteActionSheet(i);
    }

    @Override // X.MX5
    public void onRemove(int i) {
        List<FollowPageData> data = getData();
        if (data == null || i < 0 || i >= data.size()) {
            return;
        }
        ListProtector.remove(data, i);
        if (data.isEmpty()) {
            notifyDataSetChanged();
        } else {
            notifyItemRemoved(i);
        }
    }

    @Override // X.MK7, X.AbstractC029409q
    public void onViewAttachedToWindow(RecyclerView.ViewHolder holder) {
        o.LJIIIZ(holder, "holder");
        super.onViewAttachedToWindow(holder);
        ViewOnClickListenerC56908MVc viewOnClickListenerC56908MVc = null;
        if (holder instanceof ViewOnClickListenerC56908MVc) {
            viewOnClickListenerC56908MVc = (ViewOnClickListenerC56908MVc) holder;
        }
        if (viewOnClickListenerC56908MVc != null) {
            viewOnClickListenerC56908MVc.onAttached();
            if (C56762MPm.LIZIZ() && C56762MPm.LIZIZ.compareAndSet(false, true)) {
                EnumC56764MPo.LJLJLJ.LIZJ();
                C56762MPm.LIZ();
            }
        }
        if ((holder instanceof MSE) && holder != null && this.mmLoadMoreState.LIZ == 0) {
            View view = holder.itemView;
            o.LJII(view, "null cannot be cast to non-null type com.bytedance.tux.table.footer.TuxStatusFooter");
            MSD msd = (MSD) view;
            if (!((C223338pd) msd.findViewById(R.id.g85)).LJLJLJ) {
                msd.setVisibility(4);
                msd.LIZIZ();
                msd.setVisibility(0);
            }
        }
    }

    @Override // X.MK7, X.AbstractC029409q
    public void onViewDetachedFromWindow(RecyclerView.ViewHolder holder) {
        ViewOnClickListenerC56908MVc viewOnClickListenerC56908MVc;
        o.LJIIIZ(holder, "holder");
        super.onViewDetachedFromWindow(holder);
        if ((holder instanceof ViewOnClickListenerC56908MVc) && (viewOnClickListenerC56908MVc = (ViewOnClickListenerC56908MVc) holder) != null) {
            viewOnClickListenerC56908MVc.onDetached();
        }
    }

    public final void setRecommendConnect(boolean z) {
        this.isRecommendConnect = z;
    }

    public final void setUiStyleConfig(C96533qb c96533qb) {
        this.uiStyleConfig = c96533qb;
    }

    private final void divideData(List<FollowPageData> list, List<FollowPageData> list2) {
        MusNotice notice;
        FollowRequestData followRequest;
        int size = list.size() - 1;
        long currentTimeMillis = System.currentTimeMillis();
        int i = -1;
        int i2 = 0;
        for (FollowPageData followPageData : list) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                FollowPageData followPageData2 = followPageData;
                if (currentTimeMillis - (followPageData2.getCreateTime() * 1000) <= getDISPLAY_RECENTLY() || (C56775MPz.LIZJ() && (((notice = followPageData2.getNotice()) != null && !notice.hasRead) || ((followRequest = followPageData2.getFollowRequest()) != null && !followRequest.getHasRead())))) {
                    i = i3;
                }
                i2 = i3;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        if (i < 0) {
            i = getDISPLAY_COUNT();
        }
        if (C56775MPz.LIZJ() && i < getDISPLAY_COUNT()) {
            i = getDISPLAY_COUNT();
        }
        if (i >= size) {
            this.mCollapseLoadedNotice = null;
            L08.LIZ(new C59512Vf(0L, "new_follower", "collapseLoadedNotice"));
            return;
        }
        List<FollowPageData> LLJILJILJ = ORZ.LLJILJILJ(list.subList(i, size));
        this.mCollapseLoadedNotice = LLJILJILJ;
        this.mNeedCollapseNoticeCount = ((ArrayList) LLJILJILJ).size();
        list2.clear();
        list2.addAll(list.subList(0, i));
        if (this.mNeedCollapseNoticeCount == 0) {
            L08.LIZ(new C59512Vf(0L, "new_follower", "collapseNoticeCount"));
        }
    }

    private final void doDeleteItem(int i, FollowPageData followPageData) {
        String str;
        MusNotice notice;
        List<T> list = this.mmItems;
        if (list != 0) {
            ListProtector.remove(list, i);
            notifyItemRemoved(i);
            if (followPageData == null || (notice = followPageData.getNotice()) == null || (str = notice.nid) == null) {
                str = "";
            }
            C2U8.LIZ(new MR4(str));
        }
    }

    @Override // X.C4II
    public void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        MusNotice notice;
        MVV mvv;
        List<FollowPageData> data = getData();
        if (data == null) {
            return;
        }
        FollowPageData followPageData = (FollowPageData) ListProtector.get(data, i);
        if (followPageData != null && (notice = followPageData.getNotice()) != null && (viewHolder instanceof MVV) && (mvv = (MVV) viewHolder) != null) {
            mvv.bindNotice(notice, i);
        }
        if (viewHolder instanceof MVZ) {
            MusNotice notice2 = ((FollowPageData) ListProtector.get(data, i)).getNotice();
            if (notice2 != null) {
                MVZ.M((MVZ) viewHolder, notice2, i, "", "", "notification_page", false, C61878OQg.INSTANCE, false, false, null, 896);
                return;
            }
            return;
        }
        if (viewHolder instanceof C56916MVk) {
            MusNotice notice3 = ((FollowPageData) ListProtector.get(data, i)).getNotice();
            if (notice3 == null) {
                return;
            }
            ((C56916MVk) viewHolder).M(notice3, "", "notification_page", false);
            return;
        }
        if (viewHolder instanceof FollowRequestViewHolderInFollower) {
            FollowRequestData followRequest = ((FollowPageData) ListProtector.get(data, i)).getFollowRequest();
            if (followRequest == null || followRequest.getUser() == null) {
                return;
            }
            followRequest.getUser().setFollowFrom(29);
            User user = followRequest.getUser();
            C116724i4 c116724i4 = new C116724i4();
            c116724i4.LIZLLL(getFOLLOW_REQUEST_DESC());
            FollowRequestViewHolderInFollower followRequestViewHolderInFollower = (FollowRequestViewHolderInFollower) viewHolder;
            String noticeCreateTimeDesc = MVV.getNoticeCreateTimeDesc(followRequest.getCreateTime(), followRequestViewHolderInFollower.mContext);
            o.LJIIIIZZ(noticeCreateTimeDesc, "getNoticeCreateTimeDesc(…                        )");
            c116724i4.LIZIZ(noticeCreateTimeDesc);
            user.setFollowFromMsg(c116724i4.LIZ.toString());
            followRequestViewHolderInFollower.onBind(followRequest.getUser(), followRequest.getCreateTime(), i, "notification_page");
            return;
        }
        if (!(viewHolder instanceof MQT)) {
            return;
        }
        MQT mqt = (MQT) viewHolder;
        String collapseText = getCOLLAPSE_TITLE();
        mqt.getClass();
        o.LJIIIZ(collapseText, "collapseText");
        mqt.LJLIL.setText(collapseText);
        C16880lQ.LJIIJ(new ACListenerS28S0100000_8(this, 14), mqt.itemView);
    }

    @Override // X.C4II
    public RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup parent, int i) {
        ViewOnClickListenerC56908MVc c56885MUf;
        MVV mvv;
        o.LJIIIZ(parent, "parent");
        if (i == EnumC56774MPy.FOLLOW_REQUEST.ordinal()) {
            c56885MUf = new FollowRequestViewHolderInFollower(inflateView(R.layout.sd, parent, false), this, this.mobHelper);
            c56885MUf.setItemClickListener(this);
        } else if (i == EnumC56774MPy.TEMPLATE.ordinal()) {
            c56885MUf = new MVZ(inflateView(R.layout.tf, parent, false), new AqS175S0100000_9(this, 106));
            c56885MUf.setItemClickListener(this);
        } else if (i == EnumC56774MPy.FOLLOWER.ordinal()) {
            c56885MUf = new C56916MVk(inflateView(R.layout.t7, parent, false));
            c56885MUf.setItemClickListener(this);
        } else if (i == EnumC56774MPy.EMPTY.ordinal()) {
            c56885MUf = new ViewOnClickListenerC56908MVc(inflateView(R.layout.s5, parent, false));
        } else if (i == EnumC56774MPy.COLLAPSE.ordinal()) {
            c56885MUf = new MQT(inflateView(R.layout.sh, parent, false));
        } else {
            c56885MUf = new C56885MUf(inflateView(R.layout.tn, parent, false));
        }
        c56885MUf.vm = this.vm;
        if (c56885MUf instanceof MVY) {
            ((MVY) c56885MUf).setLogScene(EnumC56954MWw.INBOX);
        }
        C96533qb c96533qb = this.uiStyleConfig;
        if (c96533qb != null && (c56885MUf instanceof MVV) && (mvv = (MVV) c56885MUf) != null) {
            mvv.applyNewStyle(c96533qb);
        }
        return c56885MUf;
    }

    public final void tryUpdateFollowStatus(String uid, int i) {
        User user;
        o.LJIIIZ(uid, "uid");
        List<T> list = this.mmItems;
        if (list != 0) {
            int i2 = 0;
            for (Object obj : list) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    FollowRequestData followRequest = ((FollowPageData) obj).getFollowRequest();
                    if (followRequest == null || (user = followRequest.getUser()) == null || !o.LJ(user.getUid(), uid) || user.getFollowStatus() == i) {
                        i2 = i3;
                    } else {
                        user.setFollowStatus(i);
                        notifyItemChanged(i2);
                        return;
                    }
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
        }
    }

    private final boolean handleCollapse(List<FollowPageData> list, List<FollowPageData> list2, EnumC56772MPw enumC56772MPw) {
        if (!this.mNeedCollapseNotice) {
            return false;
        }
        if (enumC56772MPw == EnumC56772MPw.EMPTY) {
            this.mNeedCollapseNotice = false;
            L08.LIZ(new C59512Vf(0L, "new_follower", "recommendEmpty"));
            return false;
        }
        if (!C56775MPz.LIZJ() && !((Boolean) C46597IQn.LIZ.getValue()).booleanValue()) {
            this.mNeedCollapseNotice = false;
            L08.LIZ(new C59512Vf(0L, "new_follower", "controller"));
            return false;
        }
        divideData(list, list2);
        if ((enumC56772MPw == EnumC56772MPw.SOME || enumC56772MPw == EnumC56772MPw.LOADING) && this.mNeedCollapseNoticeCount > 0) {
            list2.add(this.mCollapseItem);
            return true;
        }
        L08.LIZ(new C59512Vf(0L, "new_follower", "default"));
        return false;
    }

    private final View inflateView(int i, ViewGroup viewGroup, boolean z) {
        return C1FL.LIZIZ(viewGroup, i, viewGroup, z, "from(parent.context).inf…, parent, attachToParent)");
    }

    public final boolean setData(List<FollowPageData> list, boolean z, EnumC56772MPw recommendDataStatus) {
        boolean z2;
        o.LJIIIZ(recommendDataStatus, "recommendDataStatus");
        this.mHasMore = z;
        ArrayList arrayList = new ArrayList();
        boolean z3 = true;
        if (list != null) {
            arrayList.addAll(list);
            boolean handleCollapse = handleCollapse(list, arrayList, recommendDataStatus);
            boolean z4 = this.mHasMore;
            if (z4 && !handleCollapse) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.mShowFooter = z2;
            if (!handleCollapse) {
                z3 = !z4;
            }
        }
        super.setData(arrayList);
        return z3;
    }

    public static /* synthetic */ boolean setData$default(InboxFollowerAdapter inboxFollowerAdapter, List list, boolean z, EnumC56772MPw enumC56772MPw, int i, Object obj) {
        if ((i & 4) != 0) {
            enumC56772MPw = EnumC56772MPw.UNKNOWN;
        }
        return inboxFollowerAdapter.setData(list, z, enumC56772MPw);
    }
}

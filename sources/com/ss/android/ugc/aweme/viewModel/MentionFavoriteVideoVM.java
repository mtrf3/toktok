package com.ss.android.ugc.aweme.viewmodel;

import X.A2G;
import X.C33Q;
import X.C42256GiC;
import X.C6ZT;
import X.C8HZ;
import X.C9QW;
import X.HG3;
import X.InterfaceC67352kd;
import X.RBX;
import X.SRI;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.fragments.MentionVideoListFragment;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.ImageItem;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class MentionFavoriteVideoVM extends BaseVideoListVM<SRI, C9QW, Long> {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new SRI(0);
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel, com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void manualListRefresh() {
        withState(new AqS178S0100000_12(this, 430));
        super.manualListRefresh();
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C8HZ<C9QW> newListState) {
        o.LJIIIZ(newListState, "newListState");
        setState(new AqS178S0100000_12(newListState, (C8HZ<ImageItem>) 304));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC67352kd<? super A2G<Long>> interfaceC67352kd) {
        this.LJLJJLL = true;
        return lv0(0L, interfaceC67352kd);
    }

    public final void kv0(View view, Aweme aweme) {
        Fragment fragment;
        if (C6ZT.LIZ(view) || aweme == null || (fragment = this.LJLJI) == null || fragment.mo49getActivity() == null || !BaseVideoListVM.gv0(this.LJLJI)) {
            return;
        }
        Fragment fragment2 = this.LJLJI;
        if ((fragment2 instanceof MentionVideoListFragment) && fragment2 != null) {
            MentionVideoListFragment.LJLLI = new C42256GiC(this.LJLIL, aweme);
        }
        Bundle bundle = new Bundle();
        bundle.putString("id", aweme.getAid());
        bundle.putString("video_from", "from_publish_add_video");
        bundle.putString("userid", ((RBX) HG3.LJIILL()).getCurUserId());
        bundle.putString("sec_userid", ((RBX) HG3.LJIILL()).getCurSecUserId());
        bundle.putString("refer", "collection_video");
        bundle.putInt("video_type", 4);
        bundle.putString("mention_video_author_uid", aweme.getAuthorUid());
        SmartRoute buildFragmentRoute = SmartRouter.buildFragmentRoute(this.LJLJI, "aweme://aweme/detail/");
        buildFragmentRoute.withParam(bundle);
        buildFragmentRoute.withParam("activity_has_activity_options", true);
        buildFragmentRoute.open(9);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a7 A[Catch: Exception -> 0x011f, TryCatch #0 {Exception -> 0x011f, blocks: (B:12:0x009e, B:13:0x00a1, B:15:0x00a7, B:19:0x00b1, B:22:0x00b8, B:23:0x00bc, B:25:0x00c2, B:28:0x00ce, B:31:0x00d4, B:37:0x00dd, B:39:0x00e3, B:41:0x00e7, B:42:0x00f1, B:44:0x00f7, B:47:0x0101, B:49:0x0107, B:51:0x0110, B:56:0x0071, B:57:0x0074), top: B:7:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c2 A[Catch: Exception -> 0x011f, TryCatch #0 {Exception -> 0x011f, blocks: (B:12:0x009e, B:13:0x00a1, B:15:0x00a7, B:19:0x00b1, B:22:0x00b8, B:23:0x00bc, B:25:0x00c2, B:28:0x00ce, B:31:0x00d4, B:37:0x00dd, B:39:0x00e3, B:41:0x00e7, B:42:0x00f1, B:44:0x00f7, B:47:0x0101, B:49:0x0107, B:51:0x0110, B:56:0x0071, B:57:0x0074), top: B:7:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e3 A[Catch: Exception -> 0x011f, TryCatch #0 {Exception -> 0x011f, blocks: (B:12:0x009e, B:13:0x00a1, B:15:0x00a7, B:19:0x00b1, B:22:0x00b8, B:23:0x00bc, B:25:0x00c2, B:28:0x00ce, B:31:0x00d4, B:37:0x00dd, B:39:0x00e3, B:41:0x00e7, B:42:0x00f1, B:44:0x00f7, B:47:0x0101, B:49:0x0107, B:51:0x0110, B:56:0x0071, B:57:0x0074), top: B:7:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0101 A[Catch: Exception -> 0x011f, TryCatch #0 {Exception -> 0x011f, blocks: (B:12:0x009e, B:13:0x00a1, B:15:0x00a7, B:19:0x00b1, B:22:0x00b8, B:23:0x00bc, B:25:0x00c2, B:28:0x00ce, B:31:0x00d4, B:37:0x00dd, B:39:0x00e3, B:41:0x00e7, B:42:0x00f1, B:44:0x00f7, B:47:0x0101, B:49:0x0107, B:51:0x0110, B:56:0x0071, B:57:0x0074), top: B:7:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.2kd] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object lv0(long r14, X.InterfaceC67352kd<? super X.A2G<java.lang.Long>> r16) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.viewmodel.MentionFavoriteVideoVM.lv0(long, X.2kd):java.lang.Object");
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(Object obj, InterfaceC67352kd interfaceC67352kd) {
        return lv0(((Number) obj).longValue(), interfaceC67352kd);
    }
}

package com.ss.android.ugc.aweme.notification.creator;

import X.C2L4;
import X.C76965UIn;
import X.C8VV;
import X.MT8;
import X.MTK;
import android.os.Bundle;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.notification.creator.model.response.NoticeTabModel;
import com.ss.android.ugc.aweme.notification.creator.power.CreatorAllTabFragmentData;
import com.ss.android.ugc.aweme.notification.creator.vm.CreatorNoticeResultVM;
import com.ss.android.ugc.aweme.notification.creator.vscope.CreatorNoticeTabScope;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS175S0100000_9;

/* loaded from: classes10.dex */
public final class CreatorNoticeAllTabResultFragment extends CreatorNoticeResultFragment implements C2L4 {
    public final Map<Integer, View> LJLJJI = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.notification.creator.CreatorNoticeResultFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJI).clear();
    }

    @Override // com.ss.android.ugc.aweme.notification.creator.CreatorNoticeResultFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // X.C2L4
    public final List<Class<Object>> getScopeDefine() {
        return C76965UIn.LIZ(CreatorNoticeTabScope.class);
    }

    @Override // com.ss.android.ugc.aweme.notification.creator.CreatorNoticeResultFragment
    public final void wl() {
        C8VV.LIZ(this, false, new AqS175S0100000_9(this, 149));
    }

    @Override // com.ss.android.ugc.aweme.notification.creator.CreatorNoticeResultFragment
    public final void xl() {
        CreatorAllTabFragmentData creatorAllTabFragmentData;
        MTK LIZ;
        List<NoticeTabModel> list;
        NoticeTabModel noticeTabModel;
        Bundle arguments = getArguments();
        if (arguments != null && (creatorAllTabFragmentData = (CreatorAllTabFragmentData) arguments.getParcelable("power_viewpager_default_key")) != null && (LIZ = ((MT8) ((AssemViewModel) this.LJLILLLLZI.getValue()).getState()).LJLJI.LIZ()) != null && (list = LIZ.LIZJ) != null && creatorAllTabFragmentData.index < list.size() && (noticeTabModel = (NoticeTabModel) ListProtector.get(list, creatorAllTabFragmentData.index)) != null) {
            CreatorNoticeResultVM vl = vl();
            vl.getClass();
            vl.setState(new AqS175S0100000_9(noticeTabModel, 535));
        }
    }
}

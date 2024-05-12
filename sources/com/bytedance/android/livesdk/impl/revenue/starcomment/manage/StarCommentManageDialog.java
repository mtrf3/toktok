package com.bytedance.android.livesdk.impl.revenue.starcomment.manage;

import X.BCG;
import X.BCW;
import X.BZI;
import X.C16880lQ;
import X.C28787BRn;
import X.C29306Beo;
import X.C31415CUp;
import X.C73009Sl3;
import X.C76800UCe;
import X.CCJ;
import X.CV2;
import X.CVB;
import X.CVC;
import X.CVI;
import X.CZZ;
import X.InterfaceC88472Yns;
import Y.ACListenerS25S0100000_5;
import Y.AObserverS69S0200000_5;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.impl.revenue.starcomment.datacenter.StarCommentViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public abstract class StarCommentManageDialog extends DarkDialogFragment {
    public final Map<Integer, View> LJLJI = new LinkedHashMap();
    public String LJLILLLLZI = "";

    @Override // com.bytedance.android.livesdk.impl.revenue.starcomment.manage.DarkDialogFragment, com.bytedance.android.livesdk.LiveDialogFragment
    public void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJI).clear();
    }

    @Override // com.bytedance.android.livesdk.impl.revenue.starcomment.manage.DarkDialogFragment, com.bytedance.android.livesdk.LiveDialogFragment
    public View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJI;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public abstract void vl(boolean z);

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Boolean bool;
        CZZ czz;
        StarCommentViewModel LIZIZ;
        MutableLiveData<List<CVC>> mutableLiveData;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            bool = (Boolean) dataChannel.kv0(BCW.class);
        } else {
            bool = null;
        }
        if (C29306Beo.LJJ(bool)) {
            _$_findCachedViewById(R.id.afd).setBackgroundResource(R.drawable.clr);
        } else if (!CCJ.LIZ(getContext())) {
            _$_findCachedViewById(R.id.afd).setBackgroundResource(R.drawable.cls);
        } else {
            _$_findCachedViewById(R.id.afd).setBackgroundResource(R.drawable.clt);
        }
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.isn);
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(R.id.isn);
        C31415CUp c31415CUp = new C31415CUp();
        c31415CUp.LJLJI.LJLZ(CVC.class, new CVB(this.dataChannel, true ^ (this instanceof AudienceStarCommentManageDialog)));
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null && (czz = (CZZ) dataChannel2.kv0(CV2.class)) != null && (LIZIZ = czz.LIZIZ()) != null && (mutableLiveData = LIZIZ.LJLJI) != null) {
            mutableLiveData.observe(getViewLifecycleOwner(), new AObserverS69S0200000_5((Object) c31415CUp, (User) this, (InterfaceC88472Yns<? super User, C76800UCe>) 42));
        }
        recyclerView2.setAdapter(c31415CUp);
        ((RecyclerView) _$_findCachedViewById(R.id.isn)).LJII(new C73009Sl3(), -1);
        C16880lQ.LJJII((LiveIconView) _$_findCachedViewById(R.id.d4t), new BCG(new ACListenerS25S0100000_5(this, 394)));
        DataChannel dataChannel3 = this.dataChannel;
        if (dataChannel3 != null) {
            String from = this.LJLILLLLZI;
            o.LJIIIZ(from, "from");
            BZI LIZ = C28787BRn.LIZ("livesdk_star_comment_list_show");
            CVI.LIZLLL(LIZ, dataChannel3);
            LIZ.LJIJJ(from, "list_position");
            LIZ.LJJIIJZLJL();
        }
    }
}

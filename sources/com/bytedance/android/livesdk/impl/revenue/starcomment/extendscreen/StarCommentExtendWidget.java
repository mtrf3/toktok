package com.bytedance.android.livesdk.impl.revenue.starcomment.extendscreen;

import X.BCG;
import X.C16880lQ;
import X.C31256COm;
import X.C31415CUp;
import X.C76800UCe;
import X.CV2;
import X.CVA;
import X.CVC;
import X.CVG;
import X.CZZ;
import X.InterfaceC88472Yns;
import Y.ACListenerS25S0100000_5;
import Y.AObserverS69S0200000_5;
import Y.IDrS45S0100000_5;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.impl.revenue.starcomment.datacenter.StarCommentViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.zhiliaoapp.musically.R;

/* loaded from: classes6.dex */
public final class StarCommentExtendWidget extends LiveWidget {
    public TextView LJLIL;
    public C31256COm LJLILLLLZI;
    public View LJLJI;
    public boolean LJLJJI;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.d35;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        CZZ czz;
        StarCommentViewModel LIZIZ;
        MutableLiveData<CVG> mutableLiveData;
        super.onCreate();
        View findViewById = findViewById(R.id.jch);
        this.LJLJI = findViewById;
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
        View view = this.LJLJI;
        if (view != null) {
            C16880lQ.LJIIJ(new BCG(new ACListenerS25S0100000_5(this, 373)), view);
        }
        this.LJLIL = (TextView) findViewById(R.id.cc9);
        C31256COm c31256COm = (C31256COm) findViewById(R.id.cc8);
        this.LJLILLLLZI = c31256COm;
        if (c31256COm != null) {
            c31256COm.setHasFixedSize(true);
        }
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1, false);
        linearLayoutManager.LLJJIJIIJIL(true);
        C31256COm c31256COm2 = this.LJLILLLLZI;
        if (c31256COm2 != null) {
            c31256COm2.setLayoutManager(linearLayoutManager);
        }
        C31256COm c31256COm3 = this.LJLILLLLZI;
        if (c31256COm3 != null) {
            c31256COm3.LJIIJJI(new IDrS45S0100000_5(this, 7));
        }
        C31256COm c31256COm4 = this.LJLILLLLZI;
        if (c31256COm4 == null) {
            return;
        }
        C31415CUp c31415CUp = new C31415CUp();
        c31415CUp.LJLJI.LJLZ(CVC.class, new CVA(this.dataChannel));
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (czz = (CZZ) dataChannel.kv0(CV2.class)) != null && (LIZIZ = czz.LIZIZ()) != null && (mutableLiveData = LIZIZ.LJLIL) != null) {
            mutableLiveData.observe(this, new AObserverS69S0200000_5((Object) this, (User) c31415CUp, (InterfaceC88472Yns<? super User, C76800UCe>) 41));
        }
        c31256COm4.setAdapter(c31415CUp);
    }
}

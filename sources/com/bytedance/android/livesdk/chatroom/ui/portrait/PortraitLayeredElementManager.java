package com.bytedance.android.livesdk.chatroom.ui.portrait;

import X.C1O4;
import X.C74295TDv;
import X.C76994UJq;
import X.C77005UKb;
import X.CN1;
import X.UJZ;
import X.UK1;
import X.UKL;
import X.UKU;
import X.UL9;
import X.ULA;
import X.ULB;
import X.ULE;
import X.ULG;
import android.content.Context;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.layer.BaseLayeredElementManager;
import com.bytedance.android.live.layer.ILayerService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LayeredConstraintLayout;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import com.zhiliaoapp.musically.R;

/* loaded from: classes14.dex */
public class PortraitLayeredElementManager extends BaseLayeredElementManager {
    @Override // com.bytedance.android.live.layer.BaseLayeredElementManager, com.bytedance.ies.sdk.widgets.LayeredElementManager, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LayeredElementManager
    public final LayeredElementContext onCreateLayeredElementContext(Context context, ViewGroup viewGroup, DataChannel dataChannel) {
        return new ULA(context, viewGroup, dataChannel, this);
    }

    public PortraitLayeredElementManager(Context context, Fragment fragment, LayeredConstraintLayout layeredConstraintLayout, DataChannel dataChannel) {
        super(context, fragment, layeredConstraintLayout, dataChannel);
        UJZ nq = ((ILayerService) CN1.LIZ(ILayerService.class)).nq((C1O4) getLayeredElementContext());
        registerGroups(new ULG((C1O4) getLayeredElementContext()));
        registerGroups(new C77005UKb((C1O4) getLayeredElementContext()));
        if (nq != null) {
            registerLayer(nq);
        }
        registerLayer(new UL9((C1O4) getLayeredElementContext()));
        registerLayer(new C76994UJq((C1O4) getLayeredElementContext()));
        registerLayer(new UKL((ULA) getLayeredElementContext()));
        registerLayer(new UK1((C1O4) getLayeredElementContext()));
        registerLayer(new ULB(getLayeredElementContext()));
        registerLayer(new UKU((C1O4) getLayeredElementContext()));
        registerLayer(new ULE(getLayeredElementContext()));
        registerHorizontalChain(R.id.kcx, R.id.d1t, 2, ((C1O4) getLayeredElementContext()).LIZLLL, R.id.j6m, R.id.e2q, R.id.img, R.id.imh);
        registerSpacingResolver(R.id.kcx, R.id.cwg, R.id.jz4, R.id.nji, R.id.lfv);
        if (layeredConstraintLayout != null) {
            C74295TDv.fixReferencedIds(layeredConstraintLayout, R.id.aqb, R.id.fpq, R.id.aq_, R.id.aq9, R.id.aqa);
            C74295TDv.fixReferencedIds(layeredConstraintLayout, R.id.eqi, R.id.dn8, R.id.ar1, R.id.h3b, R.id.i_x, R.id.krk);
            C74295TDv.fixReferencedIds(layeredConstraintLayout, R.id.eqh, R.id.fwp, R.id.dn0, R.id.ijo, R.id.c22, R.id.c2q, R.id.knz, R.id.dq9, R.id.hpi);
            C74295TDv.fixReferencedIds(layeredConstraintLayout, R.id.eq9, R.id.ikl, R.id.jm1, R.id.jl9);
            C74295TDv.fixReferencedIds(layeredConstraintLayout, R.id.if3, R.id.eqe, R.id.eq_);
            C74295TDv.fixReferencedIds(layeredConstraintLayout, R.id.hwh, R.id.fxi, R.id.fwx, R.id.ch8, R.id.bjy);
            C74295TDv.fixReferencedIds(layeredConstraintLayout, R.id.d1t, R.id.cwg, R.id.chg);
            C74295TDv.fixReferencedIds(layeredConstraintLayout, R.id.d1q, R.id.gis, R.id.j6m, R.id.e2q, R.id.img, R.id.imh, R.id.chf, R.id.ia7);
            C74295TDv.fixReferencedIds(layeredConstraintLayout, R.id.d0d, R.id.lfv, R.id.nji, R.id.jz4);
            C74295TDv.fixReferencedIds(layeredConstraintLayout, R.id.ia6, R.id.ia5, R.id.gwi);
            C74295TDv.fixReferencedIds(layeredConstraintLayout, R.id.ape, R.id.aq0);
            C74295TDv.fixReferencedIds(layeredConstraintLayout, R.id.eqa, R.id.eqd, R.id.eqb);
        }
        finishRegistration();
    }
}

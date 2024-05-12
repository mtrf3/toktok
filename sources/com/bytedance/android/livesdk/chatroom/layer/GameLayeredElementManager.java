package com.bytedance.android.livesdk.chatroom.layer;

import X.C1O4;
import X.C42311lL;
import X.C51321zs;
import X.C74295TDv;
import X.C77064UMi;
import X.CN1;
import X.UJZ;
import X.UM5;
import X.UM6;
import X.UMI;
import X.UN8;
import android.content.Context;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.layer.ILayerService;
import com.bytedance.android.live.layer.broadcast.BroadcastLayeredElementManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LayeredConstraintLayout;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class GameLayeredElementManager extends BroadcastLayeredElementManager {
    @Override // com.bytedance.android.live.layer.broadcast.BroadcastLayeredElementManager, com.bytedance.android.live.layer.BaseLayeredElementManager, com.bytedance.ies.sdk.widgets.LayeredElementManager, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.layer.broadcast.BroadcastLayeredElementManager
    /* renamed from: LIZLLL */
    public final C42311lL onCreateLayeredElementContext(Context context, ViewGroup container, DataChannel dataChannel) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(container, "container");
        o.LJIIIZ(dataChannel, "dataChannel");
        return new C42311lL(context, container, dataChannel, this);
    }

    @Override // com.bytedance.android.live.layer.broadcast.BroadcastLayeredElementManager, com.bytedance.ies.sdk.widgets.LayeredElementManager
    public final /* bridge */ /* synthetic */ LayeredElementContext onCreateLayeredElementContext(Context context, ViewGroup viewGroup, DataChannel dataChannel) {
        return onCreateLayeredElementContext(context, viewGroup, dataChannel);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameLayeredElementManager(Context context, Fragment fragment, LayeredConstraintLayout layeredConstraintLayout, DataChannel dataChannel) {
        super(context, fragment, layeredConstraintLayout, dataChannel);
        o.LJIIIZ(fragment, "fragment");
        ILayerService iLayerService = (ILayerService) CN1.LIZ(ILayerService.class);
        LayeredElementContext layeredElementContext = getLayeredElementContext();
        o.LJIIIIZZ(layeredElementContext, "layeredElementContext");
        UJZ nq = iLayerService.nq((C1O4) layeredElementContext);
        if (nq != null) {
            registerLayer(nq);
        }
        LayeredElementContext layeredElementContext2 = getLayeredElementContext();
        o.LJIIIIZZ(layeredElementContext2, "layeredElementContext");
        registerGroups(new UN8((C1O4) layeredElementContext2));
        LayeredElementContext layeredElementContext3 = getLayeredElementContext();
        o.LJIIIIZZ(layeredElementContext3, "layeredElementContext");
        registerLayer(new C77064UMi(layeredElementContext3));
        LayeredElementContext layeredElementContext4 = getLayeredElementContext();
        o.LJIIIIZZ(layeredElementContext4, "layeredElementContext");
        registerLayer(new UM6((C1O4) layeredElementContext4));
        LayeredElementContext layeredElementContext5 = getLayeredElementContext();
        o.LJIIIIZZ(layeredElementContext5, "layeredElementContext");
        registerLayer(new UMI((C1O4) layeredElementContext5));
        LayeredElementContext layeredElementContext6 = getLayeredElementContext();
        o.LJIIIIZZ(layeredElementContext6, "layeredElementContext");
        registerLayer(new UM5(layeredElementContext6));
        LayeredElementContext layeredElementContext7 = getLayeredElementContext();
        o.LJIIIIZZ(layeredElementContext7, "layeredElementContext");
        registerLayer(new C51321zs(layeredElementContext7));
        registerHorizontalChain(R.id.kcx, R.id.d1t, 2, ((C1O4) getLayeredElementContext()).LIZLLL, R.id.j6m, R.id.e2q, R.id.img, R.id.imh);
        registerSpacingResolver(R.id.kcx, R.id.cwg, R.id.jz4, R.id.nji, R.id.lfv);
        C74295TDv.fixReferencedIds(layeredConstraintLayout, R.id.gwh, R.id.gwi, R.id.mz0);
        C74295TDv.fixReferencedIds(layeredConstraintLayout, R.id.d1t, R.id.cwg, R.id.gyp);
        C74295TDv.fixReferencedIds(layeredConstraintLayout, R.id.gyo, R.id.gyq, R.id.fvk);
        C74295TDv.fixReferencedIds(layeredConstraintLayout, R.id.d1q, R.id.j6m, R.id.e2q, R.id.img, R.id.imh, R.id.gyq, R.id.fvk);
        C74295TDv.fixReferencedIds(layeredConstraintLayout, R.id.d0d, R.id.lfv, R.id.nji, R.id.jz4);
        C74295TDv.fixReferencedIds(layeredConstraintLayout, R.id.eqh, R.id.dn0, R.id.c22, R.id.c2q, R.id.knz);
        C74295TDv.fixReferencedIds(layeredConstraintLayout, R.id.eqi, R.id.dn8, R.id.h3b);
        C74295TDv.fixReferencedIds(layeredConstraintLayout, R.id.ape, R.id.aq0);
        C74295TDv.fixReferencedIds(layeredConstraintLayout, R.id.eqa, R.id.eqd, R.id.eqb);
        finishRegistration();
    }
}

package com.bytedance.android.livesdk.chatroom.ui.landscape;

import X.C74295TDv;
import X.C77002UJy;
import X.C77013UKj;
import X.C77017UKn;
import X.C77025UKv;
import X.C77033ULd;
import X.UL0;
import X.UL8;
import android.content.Context;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.layer.BaseLayeredElementManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LayeredConstraintLayout;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import com.zhiliaoapp.musically.R;

/* loaded from: classes14.dex */
public class LandscapeLayeredElementManager extends BaseLayeredElementManager {
    @Override // com.bytedance.android.live.layer.BaseLayeredElementManager, com.bytedance.ies.sdk.widgets.LayeredElementManager, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LayeredElementManager
    public final LayeredElementContext onCreateLayeredElementContext(Context context, ViewGroup viewGroup, DataChannel dataChannel) {
        return new UL8(context, viewGroup, dataChannel, this);
    }

    public LandscapeLayeredElementManager(Context context, Fragment fragment, LayeredConstraintLayout layeredConstraintLayout, DataChannel dataChannel) {
        super(context, fragment, layeredConstraintLayout, dataChannel);
        registerGroups(new C77025UKv((UL8) getLayeredElementContext()));
        registerLayer(new C77033ULd((UL8) getLayeredElementContext()));
        registerLayer(new UL0((UL8) getLayeredElementContext()));
        registerLayer(new C77017UKn((UL8) getLayeredElementContext()));
        registerLayer(new C77013UKj((UL8) getLayeredElementContext()));
        registerLayer(new C77002UJy(getLayeredElementContext()));
        C74295TDv.fixReferencedIds(layeredConstraintLayout, R.id.gwh, R.id.gwi, R.id.mz0, R.id.b97, R.id.aep, R.id.kxc, R.id.jto);
        C74295TDv.fixReferencedIds(layeredConstraintLayout, R.id.d1q, R.id.d1y, R.id.gis, R.id.a9s, R.id.img, R.id.imh, R.id.d1s, R.id.e2q, R.id.jz4, R.id.ia7);
        C74295TDv.fixReferencedIds(layeredConstraintLayout, R.id.ia6, R.id.ia5, R.id.gwi);
        finishRegistration();
    }
}

package com.bytedance.android.live.liveinteract.linkroom.widget;

import X.BNK;
import X.C15380j0;
import X.C15400j2;
import X.C1Q4;
import X.C30079BrH;
import X.U4F;
import X.U4G;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.room.MultiLiveUIChangeEvent;
import com.bytedance.android.livesdk.dataChannel.ShowAudienceBottomLeftLinkWidgetChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class AudienceBottomLeftLinkWidget extends LiveRecyclableWidget {
    public boolean LJLIL;
    public LiveIconView LJLILLLLZI;

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
    }

    public final void LJLZ() {
        int i;
        Drawable drawable;
        LiveIconView liveIconView = this.LJLILLLLZI;
        if (liveIconView != null) {
            if (this.LJLIL) {
                i = R.drawable.cx3;
            } else {
                i = R.drawable.cx1;
            }
            Drawable LIZ = C15400j2.LIZ(i);
            if (LIZ != null && (drawable = LIZ.mutate()) != null) {
                drawable.setAlpha(255);
            } else {
                drawable = null;
            }
            liveIconView.setImageDrawable(new C1Q4(drawable));
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        boolean z;
        Boolean bool;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (bool = (Boolean) dataChannel.kv0(BNK.class)) != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        this.LJLIL = z;
        if (z) {
            return R.layout.djm;
        }
        return R.layout.djl;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        if (this.LJLIL) {
            ((TextView) findViewById(R.id.ldm)).setText(C15380j0.LJIILJJIL(R.string.mri));
        }
        this.LJLILLLLZI = (LiveIconView) findViewById(R.id.ecz);
        LJLZ();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        Object obj;
        hide();
        this.dataChannel.ov0(this, ShowAudienceBottomLeftLinkWidgetChannel.class, new U4G(this));
        this.dataChannel.ov0(this, MultiLiveUIChangeEvent.class, new U4F(this));
        if (objArr != null) {
            for (Object obj2 : objArr) {
                if ((obj2 instanceof C30079BrH) && ((obj = ((C30079BrH) obj2).LIZ) == null || (obj instanceof Boolean))) {
                    o.LJII(obj, "null cannot be cast to non-null type kotlin.Boolean");
                    if (((Boolean) obj).booleanValue()) {
                        show();
                    } else {
                        hide();
                    }
                }
            }
        }
    }
}

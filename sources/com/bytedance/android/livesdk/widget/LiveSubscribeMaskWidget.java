package com.bytedance.android.livesdk.widget;

import X.BZI;
import X.C05170If;
import X.C15380j0;
import X.C16880lQ;
import X.C28787BRn;
import X.C2A7;
import X.KL2;
import Y.ACListenerS25S0100000_5;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.gift.GiftDialogVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.SubOnlyLiveAudienceStatusChannel;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveSubscribeMaskWidget extends LiveWidget {
    public Room LJLIL;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dqj;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        User user;
        super.onCreate();
        show();
        this.LJLIL = (Room) this.dataChannel.kv0(RoomChannel.class);
        TextView textView = (TextView) findViewById(R.id.kq6);
        boolean z = false;
        if (textView != null) {
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            int LJIIIZ = ((int) (KL2.LJIIIZ(this.context) * 0.3d)) - KL2.LJIIL(this.context);
            int LIZ = C15380j0.LIZ(40.0f);
            ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(LIZ, LJIIIZ, LIZ, 0);
        }
        Room room = this.LJLIL;
        if (room != null && room.disablePreviewSubOnly == 1 && textView != null) {
            Object[] objArr = new Object[1];
            if (room != null) {
                user = room.getOwner();
            } else {
                user = null;
            }
            objArr[0] = C05170If.LIZ(user);
            textView.setText(C15380j0.LJIILL(R.string.o9u, objArr));
        }
        BZI LIZ2 = C28787BRn.LIZ("livesdk_subscribe_icon_show");
        LIZ2.LJIILLIIL(this.dataChannel);
        LIZ2.LJIJJ("sub_only_preview_end_page", "show_entrance");
        if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(LIZ2.LJIILL())) {
            LIZ2.LJJIIJZLJL();
        } else {
            LIZ2.LJJIJ();
            LIZ2.LJJIIZ();
            LIZ2.LJJIIZI();
        }
        View findViewById = findViewById(R.id.kpr);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.subscribe_btn)");
        C16880lQ.LJJIII((C2A7) findViewById, new ACListenerS25S0100000_5(this, 255));
        this.dataChannel.lv0(this, SubOnlyLiveAudienceStatusChannel.class, new AqS171S0100000_5(this, 501));
        AqS171S0100000_5 aqS171S0100000_5 = new AqS171S0100000_5(this, 502);
        Boolean bool = (Boolean) this.dataChannel.kv0(GiftDialogVisibilityChannel.class);
        if (bool != null) {
            z = bool.booleanValue();
        }
        aqS171S0100000_5.invoke(Boolean.valueOf(z));
        this.dataChannel.lv0(this, GiftDialogVisibilityChannel.class, aqS171S0100000_5);
    }
}

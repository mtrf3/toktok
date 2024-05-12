package com.bytedance.android.livesdk.widget;

import X.B35;
import X.BTB;
import X.BZI;
import X.C15380j0;
import X.C15650jR;
import X.C16880lQ;
import X.C28787BRn;
import X.C29306Beo;
import X.C47061t0;
import X.C47121t6;
import X.C73943T0h;
import X.C78720Uuy;
import X.C78739UvH;
import X.C81705W4v;
import X.C86881Y7x;
import X.CXJ;
import X.InterfaceC28159B3j;
import X.UC0;
import X.W5I;
import X.W5P;
import Y.AfS36S0101000_5;
import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.model.MaskLayer;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.zhiliaoapp.musically.R;
import defpackage.g0;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class LiveMaskLayerWidget extends LiveWidget implements View.OnClickListener {
    public InterfaceC28159B3j LJLIL;
    public Room LJLILLLLZI;
    public MaskLayer LJLJI;
    public B35 LJLJJI;
    public EnterRoomConfig LJLJJL;
    public C47121t6 LJLJJLL;
    public C47121t6 LJLJL;
    public C47061t0 LJLJLJ;
    public LiveIconView LJLJLLL;
    public boolean LJLL;

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [X.W5O, REQUEST] */
    public final void LJLZ() {
        LiveIconView liveIconView = this.LJLJLLL;
        if (liveIconView == null || this.LJLJJLL == null || this.LJLJL == null || this.LJLJLJ == null) {
            return;
        }
        liveIconView.setIconAttr(R.attr.ata);
        this.LJLJLLL.setIconWidthRatio(0.67f);
        this.LJLJLLL.setIconHeightRatio(0.67f);
        LJZ(this.LJLJJLL, this.LJLJI.title);
        LJZ(this.LJLJL, this.LJLJI.subTitle);
        float LJIIL = C15380j0.LJIIL() / C15380j0.LJIIJJI();
        C78739UvH c78739UvH = new C78739UvH(5, LJIIL);
        User owner = this.LJLILLLLZI.getOwner();
        if (owner != null && owner.getAvatarThumb() != null) {
            C78720Uuy LIZ = C15650jR.LIZ().LIZ(owner.getAvatarThumb().getUrls());
            LIZ.LIZIZ(LJIIL);
            LIZ.LJIIJJI(this.LJLJLJ);
            return;
        }
        C47061t0 c47061t0 = this.LJLJLJ;
        C81705W4v LIZJ = W5I.LIZJ();
        W5P LIZJ2 = W5P.LIZJ(R.drawable.cqu);
        LIZJ2.LJIIJ = c78739UvH;
        LIZJ.LIZLLL = LIZJ2.LIZ();
        LIZJ.LJIIL = this.LJLJLJ.getController();
        c47061t0.setController(LIZJ.LIZ());
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        Activity LJIILJJIL = g0.LJIILJJIL(getContext());
        if (LJIILJJIL != null && C29306Beo.LJIIZILJ(LJIILJJIL.getRequestedOrientation())) {
            return R.layout.dpf;
        }
        return R.layout.dpe;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void hide() {
        super.hide();
        B35 b35 = this.LJLJJI;
        if (b35 != null) {
            b35.start();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        this.LJLJJLL = (C47121t6) findViewById(R.id.geu);
        this.LJLJL = (C47121t6) findViewById(R.id.ges);
        C16880lQ.LJIIJ(this, findViewById(R.id.gev));
        C16880lQ.LJIIJ(this, findViewById(R.id.ger));
        this.LJLJLJ = (C47061t0) findViewById(R.id.e67);
        this.LJLJLLL = (LiveIconView) findViewById(R.id.get);
        C73943T0h.LIZ().LJ(BTB.class).LJJJJZI(new AfS36S0101000_5(1, this, 2));
        LJLZ();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        super.show();
        B35 b35 = this.LJLJJI;
        if (b35 != null) {
            b35.stop(false);
        }
        if (!this.LJLL) {
            if (this.LJLJI.isR2OrUnknownMask()) {
                DataChannel dataChannel = provideDataChannel();
                o.LJIIIZ(dataChannel, "dataChannel");
                BZI LIZ = C28787BRn.LIZ("livesdk_mask_layer_show");
                LIZ.LIZJ("show");
                LIZ.LJIILLIIL(dataChannel);
                LIZ.LJJIIJZLJL();
            }
            this.LJLL = true;
            UC0.LJJJJZI("show", this.LJLJI.punishInfo, Long.valueOf(this.LJLJJL.mRoomsData.roomId));
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int id = view.getId();
        if (id == R.id.gev) {
            hide();
            this.LJLIL.U7();
            if (this.LJLJI.isR2OrUnknownMask()) {
                UC0.LJJJJZ("click", "watch");
            }
            UC0.LJJJJZI("watch_live", this.LJLJI.punishInfo, Long.valueOf(this.LJLJJL.mRoomsData.roomId));
            return;
        }
        if (id != R.id.ger) {
            return;
        }
        this.LJLIL.Vi();
        if (this.LJLJI.isR2OrUnknownMask()) {
            UC0.LJJJJZ("click", "skip");
        }
        UC0.LJJJJZI("skip", this.LJLJI.punishInfo, Long.valueOf(this.LJLJJL.mRoomsData.roomId));
    }

    public final void LJZ(TextView textView, Text text) {
        String str;
        if (textView == null || text == null) {
            return;
        }
        String str2 = text.defaultPattern;
        if (!TextUtils.isEmpty(text.key)) {
            str = C86881Y7x.LIZIZ().LIZ(text.key);
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            str2 = str;
        }
        textView.setText(CXJ.LJI(str2, text, null));
    }

    public LiveMaskLayerWidget(Room room, MaskLayer maskLayer, B35 b35, InterfaceC28159B3j interfaceC28159B3j, EnterRoomConfig enterRoomConfig) {
        this.LJLILLLLZI = room;
        this.LJLJI = maskLayer;
        this.LJLJJI = b35;
        this.LJLIL = interfaceC28159B3j;
        this.LJLJJL = enterRoomConfig;
    }
}

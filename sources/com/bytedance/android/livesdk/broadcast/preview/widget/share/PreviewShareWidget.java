package com.bytedance.android.livesdk.broadcast.preview.widget.share;

import X.ActivityC45651qj;
import X.B83;
import X.BNE;
import X.BZI;
import X.C05170If;
import X.C05200Ii;
import X.C28509BGv;
import X.C28787BRn;
import X.C29306Beo;
import X.C29374Bfu;
import X.C29929Bor;
import X.C29930Bos;
import X.C30868C9o;
import X.C7N;
import X.C86793Y4n;
import X.CN1;
import X.InterfaceC05190Ih;
import X.InterfaceC29074Bb4;
import X.X1D;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.LiveModeChannel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget;
import com.bytedance.android.livesdk.dataChannel.PreviewSubOnlyLiveSwitchChannel;
import com.bytedance.android.livesdk.livesetting.performance.UnusedLogOfflineSetting;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.host.IHostSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class PreviewShareWidget extends PreviewToolBaseWidget {
    public final int LJLJI = R.string.t13;
    public final int LJLJJI = R.drawable.cz3;
    public boolean LJLJJL;

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void LLIIIILZ() {
        LiveMode liveMode;
        if (!UnusedLogOfflineSetting.INSTANCE.isEnable("livesdk_live_takepage_share_show")) {
            return;
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_live_takepage_share_show");
        LIZ.LJIILLIIL(this.dataChannel);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel == null || (liveMode = (LiveMode) dataChannel.kv0(LiveModeChannel.class)) == null) {
            liveMode = LiveMode.VIDEO;
        }
        LIZ.LJIJJ(C28509BGv.LIZ(liveMode), "live_type");
        LIZ.LJIJJ(Integer.valueOf(C29306Beo.LJJIFFI(Boolean.valueOf(LLFZ())) ? 1 : 0), "have_red_dot");
        LIZ.LJJIIJZLJL();
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void LJZ() {
        super.LJZ();
        if (C29306Beo.LJJIIJ(getView())) {
            LLIIIILZ();
        }
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void LJZL() {
        super.LJZL();
        DataChannelGlobal.LJLJJI.nv0(this, this, PreviewSubOnlyLiveSwitchChannel.class, new AqS171S0100000_5(this, 235));
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        InterfaceC05190Ih currentUser = ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUser();
        if ((currentUser instanceof User) && currentUser != null) {
            super.show();
        }
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final int LLFFF() {
        return this.LJLJJI;
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final int LLFII() {
        return this.LJLJI;
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void onShow() {
        LLIIIILZ();
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final void onClick(View view) {
        User user;
        String str;
        o.LJIIIZ(view, "view");
        InterfaceC05190Ih currentUser = ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUser();
        if (!(currentUser instanceof User) || (user = (User) currentUser) == null || this.context == null) {
            return;
        }
        if (((IHostSetting) CN1.LIZ(IHostSetting.class)).Zi()) {
            C30868C9o.LIZJ(R.string.o2m);
            return;
        }
        if (C86793Y4n.LJLIL == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        if (C7N.LJIIL().isInMusicallyRegion()) {
            str = "h5_m";
        } else {
            str = "h5_t";
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("www.tiktok.com/@");
        LIZ.append(C05170If.LJ(user));
        LIZ.append("/live?prepare=1&source=");
        LIZ.append(str);
        LIZ.append("&_r=1");
        StringBuilder sb = new StringBuilder(X1D.LIZIZ(LIZ));
        String idStr = user.getIdStr();
        o.LJIIIIZZ(idStr, "user.idStr");
        BZI LIZ2 = C28787BRn.LIZ("anchor_share_click");
        LIZ2.LJIILLIIL(this.dataChannel);
        LIZ2.LJIJJ("live_take", "request_page");
        LIZ2.LJIJJ(idStr, "anchor_id");
        LIZ2.LJIJJ(Integer.valueOf(C29306Beo.LJJIFFI(Boolean.valueOf(LLFZ())) ? 1 : 0), "have_red_dot");
        LIZ2.LJIJJ(Integer.valueOf(PreviewToolBaseWidget.LL(getView())), "index");
        LIZ2.LJJIIJZLJL();
        C29929Bor c29929Bor = new C29929Bor(C05200Ii.LIZIZ());
        c29929Bor.LIZIZ = -1L;
        InterfaceC29074Bb4 interfaceC29074Bb4 = C86793Y4n.LJLIL;
        ActivityC45651qj LIZIZ = C29306Beo.LIZIZ(this.context);
        c29929Bor.LIZLLL = user.getId();
        c29929Bor.LJIILJJIL = true;
        c29929Bor.LJIJI = user.getSecUid();
        c29929Bor.LJJIIJZLJL = this.LJLJJL;
        c29929Bor.LJIIJ = sb.toString();
        c29929Bor.LJIJJLI = hashMap;
        interfaceC29074Bb4.LIZ(LIZIZ, new C29930Bos(c29929Bor), new BNE(this, user));
    }
}

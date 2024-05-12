package com.bytedance.android.livesdk.broadcast.preview.widget.partnership;

import X.C113554cx;
import X.C199097rd;
import X.C24150x9;
import X.C29306Beo;
import X.C30588BzU;
import X.C48459J0d;
import X.C72818Shy;
import X.CN1;
import X.InterfaceC30442Bx8;
import X.InterfaceC72822Si2;
import X.OSZ;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import au3.IDdS56S0100000_5;
import com.bytedance.android.livesdk.broadcast.CommentFeatureChannel;
import com.bytedance.android.livesdk.broadcast.PartnershipDropsEntranceChannel;
import com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget;
import com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService;
import com.bytedance.android.livesdk.dataChannel.HashtagChangedChannel;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class PreviewGameDropsWidget extends PreviewToolBaseWidget implements InterfaceC72822Si2 {
    public boolean LJLJI;
    public boolean LJLJJI;
    public int LJLJJL;
    public final int LJLJJLL = R.string.lal;
    public final int LJLJL = R.drawable.d4i;
    public final IDdS56S0100000_5 LJLJLJ = new IDdS56S0100000_5(this, 0);

    public final Map<String, String> LLIIIJ() {
        long j;
        String str;
        Hashtag hashtag;
        Long l;
        OSZ[] oszArr = new OSZ[4];
        oszArr[0] = new OSZ("entrance_page", "live_take_page");
        oszArr[1] = new OSZ("icon_type", LLIIIILZ());
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (hashtag = (Hashtag) dataChannel.kv0(HashtagChangedChannel.class)) != null && (l = hashtag.id) != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        oszArr[2] = new OSZ("game_tag_id", String.valueOf(j));
        if (o.LJ(this.dataChannel.kv0(CommentFeatureChannel.class), Boolean.TRUE)) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        oszArr[3] = new OSZ("allow_comments", str);
        return C113554cx.LJJL(oszArr);
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final String LLIIIILZ() {
        String str;
        if (this.LJLJJL != 2) {
            str = "normal";
        } else {
            str = "new_task";
        }
        if (o.LJ(str, "normal") && LLFZ()) {
            return "red_dot";
        }
        return str;
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void onShow() {
        if (this.LJLJJI && this.LJLJJL == 0) {
            C48459J0d<Boolean> c48459J0d = InterfaceC30442Bx8.LJJLIIIJILLIZJL;
            if (C29306Beo.LJIILLIIL(c48459J0d.LIZJ())) {
                LLII();
                c48459J0d.LIZ(Boolean.TRUE);
            }
            C30588BzU.LIZLLL(this.dataChannel, "live_take_page", LLIIIILZ());
        }
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        if (!this.LJLJJI) {
            return;
        }
        super.show();
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void LJZL() {
        super.LJZL();
        this.dataChannel.ov0(this, PartnershipDropsEntranceChannel.class, new AqS171S0100000_5(this, 218));
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        C72818Shy.LJII("signInPartnershipDropsEvent", this);
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final int LLFFF() {
        return this.LJLJL;
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final int LLFII() {
        return this.LJLJJLL;
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final void onClick(View view) {
        o.LJIIIZ(view, "view");
        ((IGamePartnershipService) CN1.LIZ(IGamePartnershipService.class)).Ka0();
        if (this.LJLJI || o.LJ(InterfaceC30442Bx8.LJJLIIIJJI.LIZ(), Boolean.TRUE)) {
            Context context = this.context;
            o.LJIIIIZZ(context, "context");
            C24150x9.LJ(context, LLIIIJ());
        } else {
            Context context2 = this.context;
            o.LJIIIIZZ(context2, "context");
            C24150x9.LIZJ(context2, LLIIIJ());
        }
        LLIIIILZ();
        C30588BzU.LIZJ(this.dataChannel, "live_take_page", LLIIIILZ());
        LLF();
    }

    @Override // X.InterfaceC72822Si2
    public final void onReceiveJsEvent(C199097rd c199097rd) {
        if (o.LJ(c199097rd.LJLIL, "signInPartnershipDropsEvent")) {
            InterfaceC30442Bx8.LJJLIIIJJI.LIZJ(Boolean.TRUE);
        }
    }
}

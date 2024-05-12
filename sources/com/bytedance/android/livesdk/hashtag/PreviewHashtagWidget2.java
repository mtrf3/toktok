package com.bytedance.android.livesdk.hashtag;

import X.BCX;
import X.BHW;
import X.BHZ;
import X.C15380j0;
import X.C16880lQ;
import X.C78977Uz7;
import X.CN1;
import X.X1D;
import Y.ACListenerS25S0100000_5;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.api.HashTagResp;
import com.bytedance.android.live.broadcast.model.RoomCreateInfo;
import com.bytedance.android.live.broadcast.preview.PreviewWidget;
import com.bytedance.android.live.game.IGameTopicService;
import com.bytedance.android.livesdk.dataChannel.HashtagChangedChannel;
import com.bytedance.android.livesdk.dataChannel.PreviewPagerSelectedGameItem;
import com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel;
import com.bytedance.android.livesdk.livesetting.other.subscribe.SubscriptionIconHideTextMinimumDimensionSetting;
import com.bytedance.android.livesdk.model.GameTag;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class PreviewHashtagWidget2 extends PreviewWidget {
    public TextView LJLJI;
    public String LJLJJI = C15380j0.LJIILJJIL(R.string.mnp);
    public LiveMode LJLJJL;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dgl;
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void LL() {
        String LJIILJJIL;
        DataChannel dataChannel;
        DataChannel dataChannel2;
        LiveMode liveMode = this.LJLJJL;
        if (liveMode == null) {
            return;
        }
        BHZ.Companion.getClass();
        BHZ LIZ = BHW.LIZ(liveMode);
        if (LIZ != null) {
            Hashtag hashtag = LIZ.getHashtag();
            GameTag gameTag = LIZ.getGameTag();
            StringBuffer stringBuffer = new StringBuffer();
            if (hashtag != null && C78977Uz7.LJJJLL(hashtag)) {
                LJIILJJIL = hashtag.title;
            } else {
                LJIILJJIL = C15380j0.LJIILJJIL(R.string.mnp);
            }
            stringBuffer.append(LJIILJJIL);
            if (gameTag != null) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(" | ");
                LIZ2.append(gameTag.showName);
                stringBuffer.append(X1D.LIZIZ(LIZ2));
            }
            if (this.hasAttached) {
                TextView textView = this.LJLJI;
                if (textView != null) {
                    textView.setText(stringBuffer);
                } else {
                    o.LJIJI("tagName");
                    throw null;
                }
            } else {
                this.LJLJJI = stringBuffer.toString();
            }
            Hashtag hashtag2 = LIZ.getHashtag();
            if (hashtag2 != null && (dataChannel2 = this.dataChannel) != null) {
                dataChannel2.rv0(HashtagChangedChannel.class, hashtag2);
            }
            IGameTopicService iGameTopicService = (IGameTopicService) CN1.LIZ(IGameTopicService.class);
            LiveMode liveMode2 = this.LJLJJL;
            o.LJI(liveMode2);
            GameTag re = iGameTopicService.re(liveMode2);
            if (re != null && (dataChannel = this.dataChannel) != null) {
                dataChannel.rv0(PreviewPagerSelectedGameItem.class, re);
            }
        }
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        Long l;
        RoomCreateInfo roomCreateInfo = (RoomCreateInfo) this.dataChannel.kv0(RoomCreateInfoChannel.class);
        if (roomCreateInfo == null || (l = roomCreateInfo.live_house_status) == null || l.longValue() != 4) {
            super.show();
        }
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void LJZ() {
        super.LJZ();
        this.LJLJJL = (LiveMode) this.dataChannel.kv0(BCX.class);
        LL();
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void LJZL() {
        super.LJZL();
        View findViewById = findViewById(R.id.l07);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.tag_name)");
        TextView textView = (TextView) findViewById;
        this.LJLJI = textView;
        textView.setText(this.LJLJJI);
        DataChannel dataChannel = this.dataChannel;
        dataChannel.lv0(this, RoomCreateInfoChannel.class, new AqS171S0100000_5(this, 389));
        dataChannel.lv0(this, HashTagResp.class, new AqS171S0100000_5(this, SubscriptionIconHideTextMinimumDimensionSetting.DEFAULT));
        View view = getView();
        if (view != null) {
            C16880lQ.LJIIJ(new ACListenerS25S0100000_5(this, 163), view);
        }
    }
}

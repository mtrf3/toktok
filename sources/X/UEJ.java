package X;

import Y.ACListenerS33S0100000_13;
import Y.ARunnableS49S0100000_13;
import Y.AfS65S0100000_13;
import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.broadcast.interaction.widget.livecenter.LiveCenterApi;
import com.bytedance.android.livesdk.dataChannel.LiveCenterNativeShowEvent;
import com.bytedance.android.livesdk.dataChannel.LiveCenterStatusChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterNativeViewDelayLoadSetting;
import com.bytedance.android.livesdk.model.Creator;
import com.bytedance.android.livesdk.model.message.RealtimeLiveCenterMethod;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import tikcast.api.anchor_data.RealtimeLiveCenterDetailData;
import tikcast.api.anchor_data.RealtimeLiveCenterLayoutTab;
import webcast.data.RealtimeLiveCenterBaseData;

/* loaded from: classes14.dex */
public final class UEJ extends FrameLayout implements OnMessageListener, InterfaceC10970bt {
    public DataChannel LJLIL;
    public UEF LJLILLLLZI;
    public final int LJLJI;
    public final C5H3 LJLJJI;
    public boolean LJLJJL;
    public boolean LJLJJLL;
    public final List<String> LJLJL;
    public List<RealtimeLiveCenterLayoutTab> LJLJLJ;
    public RealtimeLiveCenterDetailData LJLJLLL;
    public List<RealtimeLiveCenterLayoutTab> LJLL;
    public RealtimeLiveCenterDetailData LJLLI;
    public boolean LJLLILLLL;
    public boolean LJLLJ;
    public UEQ LJLLL;
    public boolean LJLLLL;
    public boolean LJLLLLLL;
    public long LJLZ;
    public final boolean LJZ;
    public final ARunnableS49S0100000_13 LJZI;
    public final ARunnableS49S0100000_13 LJZL;
    public final java.util.Map<Integer, View> LL;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UEJ(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        o.LJIIIZ(context, "context");
    }

    public final View LIZIZ(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    private final void getExtendFunctions() {
        if (this.LJLJJL) {
            return;
        }
        this.LJLJJL = true;
        BP4 LIZ = C28718BOw.LIZ();
        LIZ.getClass();
        C1EW.LIZ(((LiveCenterApi) LIZ.LIZIZ(LiveCenterApi.class)).getOverview(getRoomId(), 1, 1)).LJJJLIIL(new AfS65S0100000_13(this, 71), new AfS65S0100000_13(this, 72));
    }

    private final String getRoomId() {
        return (String) this.LJLJJI.getValue();
    }

    public final void LIZJ() {
        IMessageManager iMessageManager;
        AbstractC28931Bp abstractC28931Bp;
        if (this.LJLLJ) {
            return;
        }
        this.LJLLJ = true;
        C20910rv.LJI(R.layout.dbf, this, true, 8);
        C16880lQ.LJIILJJIL((FrameLayout) LIZIZ(R.id.aeg), new ACListenerS33S0100000_13(this, 62));
        this.LJLILLLLZI = new UEF(this);
        ((RecyclerView) LIZIZ(R.id.isn)).setAdapter(this.LJLILLLLZI);
        RecyclerView recyclerView = (RecyclerView) LIZIZ(R.id.isn);
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        AbstractC030109x itemAnimator = ((RecyclerView) LIZIZ(R.id.isn)).getItemAnimator();
        if ((itemAnimator instanceof C40171ht) && (abstractC28931Bp = (AbstractC28931Bp) itemAnimator) != null) {
            abstractC28931Bp.LJI = false;
        }
        DataChannel dataChannel = this.LJLIL;
        if (dataChannel != null && (iMessageManager = (IMessageManager) dataChannel.kv0(C29927Bop.class)) != null) {
            iMessageManager.addMessageListener(EnumC31509CYf.REALTIME_LIVE_CENTER_METHOD.getIntType(), this);
        }
    }

    public final void LIZLLL() {
        if (!this.LJLLILLLL) {
            return;
        }
        if (this.LJZ && !this.LJLLJ) {
            LIZJ();
        }
        C15610jN.LIZ().removeCallbacks(this.LJZL);
        this.LJLLLL = true;
        this.LJLJJLL = true;
        getExtendFunctions();
        LJ(true);
    }

    public final long getBroadcastDuration() {
        RealtimeLiveCenterBaseData realtimeLiveCenterBaseData;
        RealtimeLiveCenterDetailData realtimeLiveCenterDetailData = this.LJLJLLL;
        if (realtimeLiveCenterDetailData != null && (realtimeLiveCenterBaseData = realtimeLiveCenterDetailData.baseInfo) != null) {
            return realtimeLiveCenterBaseData.liveEndTime - realtimeLiveCenterBaseData.liveStartTime;
        }
        return 0L;
    }

    @Override // X.InterfaceC10970bt
    public final void onDestroy() {
        Handler handler;
        IMessageManager iMessageManager;
        if (!this.LJLLILLLL) {
            return;
        }
        if (this.LJLLJ) {
            DataChannel dataChannel = this.LJLIL;
            if (dataChannel != null && (iMessageManager = (IMessageManager) dataChannel.kv0(C29927Bop.class)) != null) {
                iMessageManager.removeMessageListener(this);
            }
            UEQ ueq = this.LJLLL;
            if (ueq != null && (handler = ueq.LJLJJL) != null) {
                handler.removeCallbacksAndMessages(null);
                return;
            }
            return;
        }
        C15610jN.LIZ().removeCallbacks(this.LJZI);
    }

    @Override // X.InterfaceC10970bt
    public final void LIZ(DataChannel dataChannel) {
        Creator creator;
        Integer num;
        if (!this.LJZ || this.LJLLILLLL || dataChannel == null) {
            return;
        }
        this.LJLLILLLL = true;
        this.LJLIL = dataChannel;
        dataChannel.ov0(null, LiveCenterStatusChannel.class, new AqS171S0100000_5(this, 143));
        dataChannel.lv0(null, LiveCenterNativeShowEvent.class, new AqS179S0100000_13(this, 275));
        Room LJJIJLIJ = C29306Beo.LJJIJLIJ(this.LJLIL);
        if (LJJIJLIJ == null || (creator = LJJIJLIJ.creator) == null || (num = creator.roomContinue) == null || num.intValue() != 0) {
            this.LJLLLLLL = true;
            LJ(false);
        }
        C15610jN.LIZJ(this.LJZI, LiveCenterNativeViewDelayLoadSetting.INSTANCE.delayTime());
    }

    public final void LJ(boolean z) {
        int i;
        if (z == this.LJLLLLLL) {
            return;
        }
        if (!z && this.LJLLLL) {
            return;
        }
        this.LJLLLLLL = z;
        BP4 LIZ = C28718BOw.LIZ();
        LIZ.getClass();
        LiveCenterApi liveCenterApi = (LiveCenterApi) LIZ.LIZIZ(LiveCenterApi.class);
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        C1EW.LIZ(liveCenterApi.switchImMessage(i, this.LJLJI, getRoomId())).LJJJLIIL(UEM.LJLIL, UEN.LJLIL);
        long currentTimeMillis = System.currentTimeMillis();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("should_refresh", String.valueOf(C29306Beo.LJJIFFI(Boolean.valueOf(z)) ? 1 : 0));
        C01R.LIZIZ(currentTimeMillis, new C78528Urs(jSONObject), "live_anchor_center_refresh_data");
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        Boolean bool;
        UEF uef;
        if (!this.LJLLILLLL || !this.LJLLJ || !this.LJLLLLLL || !(iMessage instanceof RealtimeLiveCenterMethod)) {
            return;
        }
        RealtimeLiveCenterMethod realtimeLiveCenterMethod = (RealtimeLiveCenterMethod) iMessage;
        if (realtimeLiveCenterMethod.timestamp < this.LJLZ) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) LIZIZ(R.id.isn);
        if (recyclerView != null) {
            bool = Boolean.valueOf(recyclerView.LJJJLL());
        } else {
            bool = null;
        }
        if (C29306Beo.LJJ(bool)) {
            return;
        }
        long j = realtimeLiveCenterMethod.timestamp;
        if (j - this.LJLZ < 3000) {
            return;
        }
        this.LJLZ = j;
        if (this.LJLJLLL == null) {
            this.LJLJLLL = new RealtimeLiveCenterDetailData();
        }
        RealtimeLiveCenterDetailData realtimeLiveCenterDetailData = this.LJLJLLL;
        if (realtimeLiveCenterDetailData != null) {
            realtimeLiveCenterDetailData.baseInfo = realtimeLiveCenterMethod.baseInfo;
            realtimeLiveCenterDetailData.tipsInfo = realtimeLiveCenterMethod.tipsInfo;
            realtimeLiveCenterDetailData.shopInfo = realtimeLiveCenterMethod.shopInfo;
        }
        if (!this.LJLLLL || (uef = this.LJLILLLLZI) == null) {
            return;
        }
        uef.notifyItemRangeChanged(1, 3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public UEJ(android.content.Context r3, android.util.AttributeSet r4, int r5) {
        /*
            r2 = this;
            r0 = r5 & 2
            if (r0 == 0) goto L5
            r4 = 0
        L5:
            java.lang.String r0 = "context"
            java.util.LinkedHashMap r0 = X.C62850Ola.LJFF(r3, r0)
            r2.LL = r0
            r0 = 0
            r2.<init>(r3, r4, r0)
            com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterMessageIntervalSetting r0 = com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterMessageIntervalSetting.INSTANCE
            int r0 = r0.getValue()
            r2.LJLJI = r0
            kotlin.jvm.internal.AqS163S0100000_13 r1 = new kotlin.jvm.internal.AqS163S0100000_13
            r0 = 197(0xc5, float:2.76E-43)
            r1.<init>(r2, r0)
            X.5H3 r0 = X.C78996UzQ.LJJIJIIJI(r1)
            r2.LJLJJI = r0
            java.lang.String r0 = "punish_records"
            java.util.List r0 = X.C47261Igj.LJJIJ(r0)
            r2.LJLJL = r0
            com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterNativeSetting r0 = com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterNativeSetting.INSTANCE
            boolean r0 = r0.useNative()
            r2.LJZ = r0
            Y.ARunnableS49S0100000_13 r1 = new Y.ARunnableS49S0100000_13
            r0 = 64
            r1.<init>(r2, r0)
            r2.LJZI = r1
            Y.ARunnableS49S0100000_13 r1 = new Y.ARunnableS49S0100000_13
            r0 = 63
            r1.<init>(r2, r0)
            r2.LJZL = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UEJ.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}

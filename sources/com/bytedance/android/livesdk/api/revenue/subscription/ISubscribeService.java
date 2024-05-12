package com.bytedance.android.livesdk.api.revenue.subscription;

import X.BTL;
import X.C30841C8n;
import X.C30924CBs;
import X.C31058CGw;
import X.InterfaceC06390Mx;
import X.UDV;
import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.chatroom.api.LiveSubOnlyConfig;
import com.bytedance.android.livesdk.impl.revenue.subscription.emoji.LiveSubscribeEmojiInputDialog;
import com.bytedance.android.livesdk.impl.revenue.subscription.ui.PreviewSubscriptionSettingDialog;
import com.bytedance.android.livesdk.impl.revenue.subscription.ui.SubOnlyLiveSettingFragment;
import com.bytedance.android.livesdk.impl.revenue.subscription.ui.SubOnlyVideoListFragment;
import com.bytedance.android.livesdk.impl.revenue.subscription.ui.SubscribeInfoListFragment;
import com.bytedance.android.livesdk.impl.revenue.subscription.ui.setting.SubscriptionSettingFragmentNew;
import com.bytedance.android.livesdk.impl.revenue.subscription.ui.vspotlight.SubscriptionSpotlightFragment;
import com.bytedance.android.livesdk.impl.revenue.subscription.widget.SubscriptionWidget;
import com.bytedance.android.livesdk.subscribe.model.GetSubInfoResponse;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AqS67S0400000_7;

/* loaded from: classes6.dex */
public interface ISubscribeService extends InterfaceC06390Mx {
    void BM();

    void CF(Context context, Room room, DataChannel dataChannel);

    C30924CBs CH();

    C31058CGw DP();

    void Dr0();

    void EP(DataChannel dataChannel, String str);

    void Ee(Context context, Room room, String str);

    SubOnlyLiveSettingFragment F6(String str, GetSubInfoResponse getSubInfoResponse);

    void H8(UDV udv);

    SubscriptionWidget Nt();

    SubscribeInfoListFragment O3(Context context);

    void Pv(DataChannel dataChannel, LiveSubOnlyConfig liveSubOnlyConfig);

    Class<? extends LiveRecyclableWidget> Qh0(boolean z);

    void Re(FragmentManager fragmentManager, String str, String str2, boolean z, BTL btl);

    void Rl0();

    void Rv();

    SubOnlyVideoListFragment T5(long j, String str, String str2, boolean z);

    void Up(Context context, Room room, String str, String str2, Map<String, String> map, String str3);

    void Vu0(Context context, String str, Map map);

    C30841C8n X60(String str);

    void XG(DataChannel dataChannel);

    void Xo(String str, AqS67S0400000_7 aqS67S0400000_7);

    PreviewSubscriptionSettingDialog Xr0(int i, String str, String str2);

    void Yl(Context context, Room room, String str);

    void Ze(Context context, boolean z, String str, String str2, String str3);

    LiveSubscribeEmojiInputDialog ak0(Activity activity);

    boolean bv();

    SubscriptionSpotlightFragment c2();

    void cH(DataChannel dataChannel);

    void cI();

    Class<? extends LiveRecyclableWidget> dV();

    void dc(Context context, Room room, String str, Map<String, String> map, String str2);

    Class<? extends LiveRecyclableWidget> dl0();

    void dq(DataChannel dataChannel);

    void dw(DataChannel dataChannel);

    void hB(Context context, LifecycleOwner lifecycleOwner, DataChannel dataChannel);

    void initPublicScreenConfiguration();

    void kU();

    void kg0(Context context, Room room, String str, String str2);

    void nI();

    void onLocaleChanged(Locale locale);

    Class<? extends LiveRecyclableWidget> pI();

    SubscriptionSettingFragmentNew pa(String str);

    void pc0(Room room, DataChannel dataChannel, LifecycleOwner lifecycleOwner);

    Class<? extends LiveRecyclableWidget> s80();

    void ui0(Context context, Room room, String str, Map<String, String> map);

    Class<? extends LiveRecyclableWidget> wa();

    void wr0(DataChannel dataChannel, String str);

    void xg0();

    void z00(DataChannel dataChannel);

    GetSubInfoResponse ze0();
}

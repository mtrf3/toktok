package com.bytedance.android.livesdk.rank.api;

import X.C28571BJf;
import X.C29684Bku;
import X.C37946Eus;
import X.CYY;
import X.InterfaceC06390Mx;
import X.InterfaceC31506CYc;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.rank.impl.setting.BaseRankSettingFragment;
import com.bytedance.android.live.rank.impl.setting.NewRankSettingDialog;
import com.bytedance.android.live.rank.impl.setting.PreviewRankingSettingFragmentSheet;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.Layer2PriorityManager;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;

/* loaded from: classes6.dex */
public interface IRankService extends InterfaceC06390Mx {
    Class<? extends LiveRecyclableWidget> B40();

    C37946Eus Co0(Context context, DataChannel dataChannel);

    PreviewRankingSettingFragmentSheet JY(int i, int i2);

    void QV(long j, long j2, int i, int i2, Fragment fragment, C29684Bku c29684Bku);

    CYY Rf0(Fragment fragment, DataChannel dataChannel, InterfaceC31506CYc interfaceC31506CYc, Layer2PriorityManager layer2PriorityManager);

    void W0();

    NewRankSettingDialog Xe0();

    int dK();

    C28571BJf fp0();

    Class<? extends LiveRecyclableWidget> kj(boolean z);

    void onPlayFragmentCreate();

    void uh(long j, long j2);

    void vy(long j, long j2, Throwable th);

    BaseRankSettingFragment wq(int i, int i2, int i3);

    int xh0();

    void yE();
}

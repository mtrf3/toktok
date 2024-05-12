package com.bytedance.android.live.adminsetting;

import X.BBP;
import X.C05490Jl;
import X.InterfaceC06390Mx;
import X.InterfaceC88472Yns;
import Y.AObjectS81S0300000_5;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.livesdk.adminsetting.LiveAdminSettingDialog;
import com.bytedance.android.livesdk.adminsetting.LiveBlockKeywordsFullScreenFragment;
import com.bytedance.android.livesdk.adminsetting.LiveCommentBlockKeywordsFragment;
import com.bytedance.android.livesdk.adminsetting.LiveCommentSettingFragment;
import com.bytedance.android.livesdk.adminsetting.LiveCommentSettingFragmentSheet;
import com.bytedance.android.livesdk.adminsetting.LiveCommercialContentToggleFragmentSheet;
import com.bytedance.android.livesdk.adminsetting.LiveFilterCommentSettingFragment;
import com.bytedance.android.livesdk.adminsetting.LiveMuteDurationSettingFragment;
import com.bytedance.android.livesdk.adminsetting.MuteConfirmDialogFragment;
import com.bytedance.android.livesdk.model.message.ChatMessage;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import kotlin.jvm.internal.AqS171S0100000_5;

/* loaded from: classes.dex */
public interface IAdminSettingService extends InterfaceC06390Mx {
    LiveFilterCommentSettingFragment G50(String str);

    void GZ(FragmentManager fragmentManager, ChatMessage chatMessage, AObjectS81S0300000_5 aObjectS81S0300000_5);

    MuteConfirmDialogFragment Hr(InterfaceC88472Yns interfaceC88472Yns);

    LiveMuteDurationSettingFragment J90(View.OnClickListener onClickListener, InterfaceC88472Yns interfaceC88472Yns);

    LiveAdminSettingDialog Kd0(boolean z);

    LiveAdminSettingDialog OG(BBP bbp, String str);

    LiveCommentSettingFragmentSheet S90(boolean z, AqS171S0100000_5 aqS171S0100000_5);

    LiveBlockKeywordsFullScreenFragment SK();

    void ap0(String str, C05490Jl c05490Jl, String str2, long j, Long l);

    LiveCommentSettingFragment cd0(AqS171S0100000_5 aqS171S0100000_5);

    LiveCommercialContentToggleFragmentSheet e80(LiveMode liveMode, boolean z, boolean z2, boolean z3);

    LiveCommentBlockKeywordsFragment er0();

    void jE(long j, String str, FragmentManager fragmentManager, int i);

    Class<? extends LiveSheetFragment> mo();
}

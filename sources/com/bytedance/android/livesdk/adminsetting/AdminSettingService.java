package com.bytedance.android.livesdk.adminsetting;

import X.BBP;
import X.BZI;
import X.C05490Jl;
import X.C07250Qf;
import X.C1A;
import X.C1EW;
import X.C28360BBc;
import X.C28787BRn;
import X.InterfaceC64592gB;
import X.InterfaceC88472Yns;
import Y.AObjectS81S0300000_5;
import Y.AfS20S1100000_5;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.adminsetting.IAdminSettingService;
import com.bytedance.android.live.broadcast.api.blockword.BlockWordApi;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.livesdk.model.message.ChatMessage;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class AdminSettingService implements IAdminSettingService {
    @Override // com.bytedance.android.live.adminsetting.IAdminSettingService
    public final Class<? extends LiveSheetFragment> mo() {
        return LiveCommercialContentToggleFragmentSheet.class;
    }

    @Override // X.InterfaceC06390Mx
    public final /* synthetic */ void onInit() {
    }

    @Override // com.bytedance.android.live.adminsetting.IAdminSettingService
    public final LiveBlockKeywordsFullScreenFragment SK() {
        return new LiveBlockKeywordsFullScreenFragment();
    }

    @Override // com.bytedance.android.live.adminsetting.IAdminSettingService
    public final LiveCommentBlockKeywordsFragment er0() {
        return new LiveCommentBlockKeywordsFragment();
    }

    @Override // com.bytedance.android.live.adminsetting.IAdminSettingService
    public final LiveFilterCommentSettingFragment G50(String str) {
        LiveFilterCommentSettingFragment liveFilterCommentSettingFragment = new LiveFilterCommentSettingFragment();
        liveFilterCommentSettingFragment.LJLLILLLL = str;
        return liveFilterCommentSettingFragment;
    }

    @Override // com.bytedance.android.live.adminsetting.IAdminSettingService
    public final MuteConfirmDialogFragment Hr(InterfaceC88472Yns interfaceC88472Yns) {
        MuteConfirmDialogFragment muteConfirmDialogFragment = new MuteConfirmDialogFragment();
        muteConfirmDialogFragment.LJLIL = interfaceC88472Yns;
        return muteConfirmDialogFragment;
    }

    @Override // com.bytedance.android.live.adminsetting.IAdminSettingService
    public final LiveAdminSettingDialog Kd0(boolean z) {
        return C28360BBc.LIZ(BBP.GUIDE, null, z);
    }

    @Override // com.bytedance.android.live.adminsetting.IAdminSettingService
    public final LiveCommentSettingFragment cd0(AqS171S0100000_5 aqS171S0100000_5) {
        LiveCommentSettingFragment liveCommentSettingFragment = new LiveCommentSettingFragment();
        liveCommentSettingFragment.LJLJI = aqS171S0100000_5;
        liveCommentSettingFragment.LJLJJI = "from_page_preview";
        return liveCommentSettingFragment;
    }

    @Override // com.bytedance.android.live.adminsetting.IAdminSettingService
    public final LiveMuteDurationSettingFragment J90(View.OnClickListener onClickListener, InterfaceC88472Yns onDefMuteDurationChange) {
        o.LJIIIZ(onDefMuteDurationChange, "onDefMuteDurationChange");
        LiveMuteDurationSettingFragment liveMuteDurationSettingFragment = new LiveMuteDurationSettingFragment();
        liveMuteDurationSettingFragment.LJLILLLLZI = onClickListener;
        liveMuteDurationSettingFragment.LJLJI = onDefMuteDurationChange;
        return liveMuteDurationSettingFragment;
    }

    @Override // com.bytedance.android.live.adminsetting.IAdminSettingService
    public final LiveAdminSettingDialog OG(BBP initialPage, String str) {
        o.LJIIIZ(initialPage, "initialPage");
        return C28360BBc.LIZ(initialPage, str, false);
    }

    @Override // com.bytedance.android.live.adminsetting.IAdminSettingService
    public final LiveCommentSettingFragmentSheet S90(boolean z, AqS171S0100000_5 aqS171S0100000_5) {
        LiveCommentSettingFragmentSheet liveCommentSettingFragmentSheet = new LiveCommentSettingFragmentSheet();
        liveCommentSettingFragmentSheet.LLFF = aqS171S0100000_5;
        liveCommentSettingFragmentSheet.LLFFF = "from_page_preview";
        liveCommentSettingFragmentSheet.LLFII = z;
        return liveCommentSettingFragmentSheet;
    }

    @Override // com.bytedance.android.live.adminsetting.IAdminSettingService
    public final void GZ(FragmentManager fragmentManager, ChatMessage chatMessage, AObjectS81S0300000_5 aObjectS81S0300000_5) {
        o.LJIIIZ(chatMessage, "chatMessage");
        if (fragmentManager != null) {
            LiveFilterCommentApproveDialog liveFilterCommentApproveDialog = new LiveFilterCommentApproveDialog();
            liveFilterCommentApproveDialog.LJLJI = aObjectS81S0300000_5;
            liveFilterCommentApproveDialog.LJLJJI = chatMessage;
            liveFilterCommentApproveDialog.show(fragmentManager, "");
        }
    }

    @Override // com.bytedance.android.live.adminsetting.IAdminSettingService
    public final LiveCommercialContentToggleFragmentSheet e80(LiveMode liveMode, boolean z, boolean z2, boolean z3) {
        LiveCommercialContentToggleFragmentSheet liveCommercialContentToggleFragmentSheet = new LiveCommercialContentToggleFragmentSheet();
        liveCommercialContentToggleFragmentSheet.LLF = true;
        liveCommercialContentToggleFragmentSheet.LLFII = liveMode;
        liveCommercialContentToggleFragmentSheet.LLFFF = z;
        liveCommercialContentToggleFragmentSheet.LLFZ = z2;
        liveCommercialContentToggleFragmentSheet.LLFF = z3;
        return liveCommercialContentToggleFragmentSheet;
    }

    @Override // com.bytedance.android.live.adminsetting.IAdminSettingService
    public final void jE(long j, String content, FragmentManager fragmentManager, int i) {
        o.LJIIIZ(content, "content");
        C1EW.LIZ(((BlockWordApi) C1A.LIZJ(BlockWordApi.class)).recommendBlockWord(content, j, i)).LJJJLIIL(new AfS20S1100000_5(fragmentManager, 8), new InterfaceC64592gB() { // from class: X.9Cu
            @Override // X.InterfaceC64592gB
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        });
    }

    @Override // com.bytedance.android.live.adminsetting.IAdminSettingService
    public final void ap0(String str, C05490Jl duration, String str2, long j, Long l) {
        o.LJIIIZ(duration, "duration");
        BZI LIZ = C28787BRn.LIZ("livesdk_mute_default_select");
        LIZ.LJIJJ(str, "admin_type");
        C07250Qf.LIZJ(duration.LIZ, LIZ, "default_mute_set", str2, "event_page");
        LIZ.LJIJJ(Long.valueOf(j), "anchor_id");
        if (l != null) {
            LIZ.LJIJJ(l, "room_id");
        }
        LIZ.LJJIIJZLJL();
    }
}

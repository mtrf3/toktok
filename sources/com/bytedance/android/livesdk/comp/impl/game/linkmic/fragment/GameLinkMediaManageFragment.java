package com.bytedance.android.livesdk.comp.impl.game.linkmic.fragment;

import X.ActivityC45651qj;
import X.B83;
import X.C0NB;
import X.C10A;
import X.C141335gf;
import X.C15380j0;
import X.C15510jD;
import X.C15580jK;
import X.C16880lQ;
import X.C29044Baa;
import X.C29374Bfu;
import X.C29S;
import X.C2A4;
import X.C2A7;
import X.C31665Cbl;
import X.C3C5;
import X.C47061t0;
import X.C73318Sq2;
import X.C74674TSk;
import X.C76633U5t;
import X.C76800UCe;
import X.C78739UvH;
import X.C90903hW;
import X.CFX;
import X.FT5;
import X.OSZ;
import X.TTC;
import X.TTR;
import X.TTV;
import X.TVD;
import X.TWL;
import X.ViewOnClickListenerC13880ga;
import X.X1D;
import Y.AObjectS42S0101000_5;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.liveinteract.multiguestv3.MultiGuestAudioVolumeEvent;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.model.GameLinkGuestMuteAudioEvent;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.model.ShowGuestDisconnectDialogEvent;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.utils.GameLinkPreviewPanelCloseEvent;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public class GameLinkMediaManageFragment extends BaseFragment implements View.OnClickListener {
    public C47061t0 LJLIL;
    public C2A4 LJLILLLLZI;
    public ViewGroup LJLJI;
    public ViewGroup LJLJJI;
    public ImageView LJLJJL;
    public View LJLJJLL;
    public View LJLJL;
    public C2A7 LJLJLJ;
    public FrameLayout LJLJLLL;
    public View LJLL;
    public C76633U5t LJLLI;
    public LiveDialogFragment LJLLILLLL;
    public boolean LJLLJ;
    public DataChannel LJLLL;
    public final C73318Sq2 LJLLLL = new C73318Sq2();
    public final Handler LJLLLLLL = new Handler(C16880lQ.LLJJJJ());
    public final TVD LJLZ = TTV.LIZ();
    public boolean LJZ = false;
    public boolean LJZI = false;
    public boolean LJZL = false;
    public String LL = "";
    public String LLD = "";
    public String LLF = "outside";
    public final Long LLFF = Long.valueOf(System.currentTimeMillis());
    public TTR LLFFF = null;
    public final TTC LLFII = new TTC(this);

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        C0NB.LJIIIZ("GameLinkMediaManageFragment", "onDestroy");
        super.onDestroy();
        C2A4 c2a4 = this.LJLILLLLZI;
        if (c2a4 != null) {
            c2a4.LJ();
        }
        this.LJLLLL.LIZLLL();
        this.LLFFF.X3(this.LLFII);
        this.LJLLLLLL.removeCallbacksAndMessages(null);
        C0NB.LJIIIZ("GameLinkMediaManageFragment", "dispose");
        if (!this.LJLLLL.LJLILLLLZI) {
            this.LJLLLL.dispose();
        }
        this.LJZI = false;
        this.LJZL = false;
        DataChannel dataChannel = this.LJLLL;
        if (dataChannel != null) {
            dataChannel.pv0(GameLinkPreviewPanelCloseEvent.class);
        }
        if (this.LJLZ == null) {
            return;
        }
        TWL.LIZ.LJIIZILJ(null, 2L, !r0.LJIIIIZZ, this.LLF, System.currentTimeMillis() - this.LLFF.longValue(), true, 0, this.LL);
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        C0NB.LJIIIZ("GameLinkMediaManageFragment", "onPause");
        super.onPause();
        if (this.LJZ) {
            return;
        }
        this.LJZI = true;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        C0NB.LJIIIZ("GameLinkMediaManageFragment", "onResume");
        super.onResume();
        this.LJZ = false;
        if (this.LJZI && this.LJZL) {
            this.LJZI = false;
            this.LJZL = false;
            C0NB.LJIIIZ("GameLinkMediaManageFragment", "dispose");
            if (!this.LJLLLL.LJLILLLLZI) {
                this.LJLLLL.dispose();
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        LiveDialogFragment liveDialogFragment;
        C0NB.LJIIIZ("GameLinkMediaManageFragment", C16880lQ.LLLZ("onClick v=%s", new Object[]{Integer.valueOf(view.getId())}));
        int id = view.getId();
        if (id == R.id.fhw) {
            C0NB.LJIIIZ("GameLinkMediaManageFragment", "showDisconnectDialog");
            TTR ttr = this.LLFFF;
            if (ttr != null && ttr.R6() != null && this.LLFFF.R6().LLLLLJIL() != null) {
                TWL.LIZ.LJIIIIZZ(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId(), "go_live_panel", this.LLD, this.LLFFF.R6().LLLLLJIL().getLinkMicId());
            }
            Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
            if (room == null || room.getOwner() == null) {
                return;
            }
            LiveDialogFragment liveDialogFragment2 = this.LJLLILLLL;
            if (liveDialogFragment2 != null) {
                liveDialogFragment2.dismiss();
            }
            if (this.LJLLL == null) {
                return;
            }
            this.LJLLL.qv0(ShowGuestDisconnectDialogEvent.class, new OSZ("setting_panel", 10002));
            return;
        }
        if (id == R.id.giw) {
            TVD tvd = this.LJLZ;
            if (tvd == null) {
                return;
            }
            int i = tvd.LJIIZILJ;
            if (i != 2 && i != 3) {
                return;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onClickMicBtn setAudioEnable from ");
            LIZ.append(this.LJLZ.LJIIIIZZ);
            LIZ.append(" to ");
            FT5.LJ(LIZ, !this.LJLZ.LJIIIIZZ, LIZ, "GameLinkMediaManageFragment");
            TVD tvd2 = this.LJLZ;
            boolean z = !tvd2.LJIIIIZZ;
            tvd2.LJIIIIZZ = z;
            TWL.LIZ.LJIIJ(0, tvd2.LJJ, "guest_connection_panel", true ^ z);
            DataChannel dataChannel = this.LJLLL;
            if (dataChannel == null) {
                return;
            }
            dataChannel.qv0(GameLinkGuestMuteAudioEvent.class, new C74674TSk(this.LJLZ.LJIIIIZZ, "business_mute_manage_panel"));
            return;
        }
        if (id != R.id.ayr || (liveDialogFragment = this.LJLLILLLL) == null) {
            return;
        }
        this.LLF = "confirm_icon";
        liveDialogFragment.dismiss();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        mo49getActivity();
        return onGetLayoutInflater;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        C29S c29s;
        o.LJIIIZ(inflater, "inflater");
        C0NB.LJIIIZ("GameLinkMediaManageFragment", C16880lQ.LLLZ("onCreateView: onCreateView=%s, container=%s, savedInstanceState=%s", new Object[]{inflater, viewGroup, bundle}));
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.d48, viewGroup, false);
        C0NB.LJIIIZ("GameLinkMediaManageFragment", C16880lQ.LLLZ("findViewByID mRootView=%s", new Object[]{LLLLIILL}));
        LLLLIILL.findViewById(R.id.i2w);
        this.LJLJLLL = (FrameLayout) LLLLIILL.findViewById(R.id.i2k);
        this.LJLIL = (C47061t0) LLLLIILL.findViewById(R.id.abo);
        this.LJLILLLLZI = (C2A4) LLLLIILL.findViewById(R.id.a_5);
        this.LJLJJL = (ImageView) LLLLIILL.findViewById(R.id.abh);
        this.LJLJJLL = LLLLIILL.findViewById(R.id.a_6);
        this.LJLJLJ = (C2A7) LLLLIILL.findViewById(R.id.ayr);
        this.LJLJL = LLLLIILL.findViewById(R.id.n99);
        this.LJLL = LLLLIILL.findViewById(R.id.fhw);
        this.LJLLI = (C76633U5t) LLLLIILL.findViewById(R.id.giw);
        this.LJLJI = (ViewGroup) LLLLIILL.findViewById(R.id.ap_);
        LLLLIILL.findViewById(R.id.gjg);
        this.LJLJJI = (ViewGroup) LLLLIILL.findViewById(R.id.fn0);
        C15580jK.LIZIZ(C15380j0.LIZ(8.0f), this.LJLJLLL);
        C15580jK.LIZIZ(C15380j0.LIZ(8.0f), this.LJLIL);
        C15580jK.LIZIZ(C15380j0.LIZ(8.0f), this.LJLJL);
        this.LJLL.setVisibility(0);
        this.LJLJLJ.setVisibility(0);
        this.LJZL = true;
        C16880lQ.LJIIJ(this, this.LJLL);
        C16880lQ.LJJIII(this.LJLJLJ, this);
        this.LJLILLLLZI.LJIIIIZZ(C15510jD.LJIIIZ(CFX.LIZ("tiktok_live_interaction_resource", "tiktok_live_interaction_demand_1"), "audio_interact_effect.webp"));
        C47061t0 c47061t0 = this.LJLIL;
        if (c47061t0 != null) {
            c47061t0.setVisibility(0);
        }
        C2A4 c2a4 = this.LJLILLLLZI;
        if (c2a4 != null) {
            c2a4.setVisibility(0);
            this.LJLILLLLZI.LJII();
        }
        if (!this.LJLLJ) {
            ImageModel avatarThumb = ((C29374Bfu) B83.LIZ().LIZIZ()).LIZIZ.getAvatarThumb();
            C31665Cbl.LJFF(this.LJLIL, avatarThumb, new C78739UvH(0.74698794f));
            ImageView imageView = this.LJLJJL;
            C31665Cbl.LJIIJ(imageView, avatarThumb, imageView.getWidth(), this.LJLJJL.getHeight(), R.drawable.cuk);
            this.LJLLJ = true;
        }
        ImageView imageView2 = this.LJLJJL;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        View view = this.LJLJJLL;
        if (view != null) {
            view.setVisibility(0);
        }
        this.LJLLJ = false;
        DataChannel dataChannel = this.LJLLL;
        if (dataChannel != null) {
            dataChannel.ov0(this, GameLinkGuestMuteAudioEvent.class, new AObjectS42S0101000_5(3, this, 56));
            dataChannel.ov0(this, MultiGuestAudioVolumeEvent.class, new AObjectS42S0101000_5(3, this, 57));
        }
        this.LJLLI.setOnClickListener(new ViewOnClickListenerC13880ga(this));
        if (this.LJLZ != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(" onCreateView isAudioEnable = ");
            FT5.LJ(LIZ, this.LJLZ.LJIIIIZZ, LIZ, "GameLinkMediaManageFragment");
        }
        TTR ttr = this.LLFFF;
        if (ttr != null) {
            ttr.e3(this.LLFII);
        }
        try {
            ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
            C10A.LIZIZ(LLLLIILL, this);
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity instanceof C29S) {
                c29s = (C29S) mo49getActivity;
            } else {
                c29s = null;
            }
            C90903hW.LIZ(c29s);
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        return LLLLIILL;
    }

    public static GameLinkMediaManageFragment vl(GameLinkMediaManagePanel gameLinkMediaManagePanel, DataChannel dataChannel, String str, String str2, TTR ttr) {
        C0NB.LJIIIZ("GameLinkMediaManageFragment", C16880lQ.LLLZ("newInstance: dialog=%s,dataChannel=%s,openSource=%sguestInviteType=%s", new Object[]{gameLinkMediaManagePanel, dataChannel, str, str2}));
        GameLinkMediaManageFragment gameLinkMediaManageFragment = new GameLinkMediaManageFragment();
        gameLinkMediaManageFragment.LJLLILLLL = gameLinkMediaManagePanel;
        gameLinkMediaManageFragment.LJLLL = dataChannel;
        gameLinkMediaManageFragment.LL = str;
        gameLinkMediaManageFragment.LLD = str2;
        gameLinkMediaManageFragment.LLFFF = ttr;
        return gameLinkMediaManageFragment;
    }
}

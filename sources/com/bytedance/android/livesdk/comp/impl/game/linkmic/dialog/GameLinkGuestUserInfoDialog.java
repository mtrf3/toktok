package com.bytedance.android.livesdk.comp.impl.game.linkmic.dialog;

import X.B83;
import X.C16880lQ;
import X.C1B3;
import X.C1B6;
import X.C221108m2;
import X.C28507BGt;
import X.C29044Baa;
import X.C29374Bfu;
import X.C62822Ol8;
import X.C64504PTg;
import X.C74740TUy;
import X.C74748TVg;
import X.C74882TaA;
import X.TT0;
import X.TTR;
import X.TTV;
import X.TVD;
import X.TWA;
import X.TWL;
import X.TWQ;
import X.TY3;
import Y.ACListenerS33S0100000_13;
import Y.ARunnableS49S0100000_13;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.fragment.GameLinkPreviewFragment;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.fragment.GameLinkUserInfoFragment;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.model.AnchorPermitGuestEvent;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.model.DialogPageChannel;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.model.GuestJoinChannelWhenAnchorPermitEvent;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.model.GuestRejectAnchorEvent;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.model.GuestReplyAnchorEvent;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.presenter.GameLinkGuestPresenter;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import defpackage.t1;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class GameLinkGuestUserInfoDialog extends LiveDialogFragment {
    public static final /* synthetic */ int LJLLL = 0;
    public TY3 LJLIL;
    public TTR LJLILLLLZI;
    public TT0 LJLJI;
    public WeakReference<GameLinkGuestPresenter> LJLJJI;
    public TWA LJLJJL;
    public TWQ LJLJJLL;
    public BaseFragment LJLJL;
    public C74748TVg LJLJLJ;
    public final Map<Integer, View> LJLLJ = new LinkedHashMap();
    public String LJLJLLL = "anchor_permit";
    public final C62822Ol8 LJLL = C221108m2.LIZIZ(new AqS163S0100000_13(this, 203));
    public final C62822Ol8 LJLLI = C221108m2.LIZIZ(new AqS163S0100000_13(this, 202));
    public final long LJLLILLLL = System.currentTimeMillis();

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLJ).clear();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLJ;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C28507BGt createParams() {
        C28507BGt c28507BGt = new C28507BGt(R.layout.cx5);
        c28507BGt.LIZJ = R.style.aap;
        boolean z = false;
        c28507BGt.LJIIL = new ColorDrawable(0);
        c28507BGt.LJII = 80;
        c28507BGt.LJIIJ = -1;
        if (this.LJLJJL == TWA.GO_LIVE) {
            z = true;
        }
        c28507BGt.LJ = !z;
        return c28507BGt;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment
    public final void dismiss() {
        String str;
        BaseFragment baseFragment = this.LJLJL;
        if (baseFragment instanceof GameLinkPreviewFragment) {
            o.LJII(baseFragment, "null cannot be cast to non-null type com.bytedance.android.livesdk.comp.impl.game.linkmic.fragment.GameLinkPreviewFragment");
            ((GameLinkPreviewFragment) baseFragment).LLIIIL = true;
            BaseFragment baseFragment2 = this.LJLJL;
            o.LJII(baseFragment2, "null cannot be cast to non-null type com.bytedance.android.livesdk.comp.impl.game.linkmic.fragment.GameLinkPreviewFragment");
            FrameLayout frameLayout = ((GameLinkPreviewFragment) baseFragment2).LJLLL;
            if (frameLayout != null) {
                frameLayout.post(new ARunnableS49S0100000_13(this, 65));
            }
        } else {
            super.dismiss();
        }
        TTR ttr = this.LJLILLLLZI;
        if (ttr == null || ttr.LIZIZ() != 5 || this.LJLJJL == TWA.GO_LIVE) {
            return;
        }
        TVD LIZ = TTV.LIZ();
        TWL twl = TWL.LIZ;
        LiveEffect liveEffect = C74740TUy.LIZLLL().LJFF;
        long j = C74740TUy.LIZLLL().LJ;
        boolean z = !LIZ.LJIIIIZZ;
        BaseFragment baseFragment3 = this.LJLJL;
        if (baseFragment3 instanceof GameLinkPreviewFragment) {
            o.LJII(baseFragment3, "null cannot be cast to non-null type com.bytedance.android.livesdk.comp.impl.game.linkmic.fragment.GameLinkPreviewFragment");
            str = ((GameLinkPreviewFragment) baseFragment3).LLIILII;
        } else if (baseFragment3 instanceof GameLinkUserInfoFragment) {
            o.LJII(baseFragment3, "null cannot be cast to non-null type com.bytedance.android.livesdk.comp.impl.game.linkmic.fragment.GameLinkUserInfoFragment");
            str = ((GameLinkUserInfoFragment) baseFragment3).LLFF;
        } else {
            str = "";
        }
        o.LJIIIIZZ(str, "when (currentFragment) {…                        }");
        twl.LJIIZILJ(liveEffect, j, z, str, System.currentTimeMillis() - this.LJLLILLLL, false, 0, "guest_icon");
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final boolean onBackPressed() {
        if (((BaseFragment) this.LJLLI.getValue()).mStatusActive) {
            ((GameLinkPreviewFragment) this.LJLLI.getValue()).onBackPressed();
            return true;
        }
        return super.onBackPressed();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        mo49getActivity();
        o.LJIIIIZZ(onGetLayoutInflater, "getLayoutInflater(\n     …      activity,\n        )");
        return onGetLayoutInflater;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        BaseFragment previewFragment;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        getDialogParams().LJI = 0.0f;
        C16880lQ.LJIIJ(new ACListenerS33S0100000_13(this, 70), _$_findCachedViewById(R.id.hej));
        if (this.LJLJJL == TWA.GO_LIVE) {
            previewFragment = (GameLinkPreviewFragment) this.LJLLI.getValue();
            o.LJIIIIZZ(previewFragment, "previewFragment");
        } else {
            previewFragment = (GameLinkUserInfoFragment) this.LJLL.getValue();
        }
        this.LJLJL = previewFragment;
        if (previewFragment instanceof GameLinkUserInfoFragment) {
            GameLinkUserInfoFragment gameLinkUserInfoFragment = (GameLinkUserInfoFragment) previewFragment;
            TWA twa = this.LJLJJL;
            TWQ twq = this.LJLJJLL;
            gameLinkUserInfoFragment.LJLLILLLL = twa;
            gameLinkUserInfoFragment.LJLZ = twq;
        }
        FragmentManager childFragmentManager = getChildFragmentManager();
        C1B3 LIZ = C1B6.LIZ(childFragmentManager, childFragmentManager);
        LIZ.LJIIIIZZ(R.id.dqg, 1, previewFragment, null);
        LIZ.LJIILJJIL();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.lv0(this, DialogPageChannel.class, new C74882TaA(this));
            dataChannel.lv0(this, AnchorPermitGuestEvent.class, new AqS179S0100000_13(this, 279));
            dataChannel.lv0(this, GuestReplyAnchorEvent.class, new AqS179S0100000_13(this, 280));
            dataChannel.lv0(this, GuestRejectAnchorEvent.class, new AqS179S0100000_13(this, 281));
            dataChannel.lv0(this, GuestJoinChannelWhenAnchorPermitEvent.class, new AqS179S0100000_13(this, 282));
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment
    public final void show(FragmentManager manager, String str) {
        Fragment previewFragment;
        long j;
        o.LJIIIZ(manager, "manager");
        if (this.LJLJJL == TWA.GO_LIVE) {
            previewFragment = (Fragment) this.LJLLI.getValue();
            o.LJIIIIZZ(previewFragment, "previewFragment");
        } else {
            previewFragment = (Fragment) this.LJLL.getValue();
        }
        if (!previewFragment.isAdded()) {
            try {
                super.show(manager, str);
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        TTR ttr = this.LJLILLLLZI;
        if (ttr == null || ttr.LIZIZ() != 5 || this.LJLJJL == TWA.GO_LIVE) {
            return;
        }
        TVD LIZ = TTV.LIZ();
        TWL twl = TWL.LIZ;
        String str2 = TTV.LIZ().LJJ;
        if (str2 == null) {
            str2 = "";
        }
        LiveEffect liveEffect = C74740TUy.LIZLLL().LJFF;
        long j2 = C74740TUy.LIZLLL().LJ;
        int i = !LIZ.LJIIIIZZ ? 1 : 0;
        HashMap hashMap = new HashMap();
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null) {
            String idStr = room.getIdStr();
            o.LJIIIIZZ(idStr, "room.idStr");
            hashMap.put("room_id", idStr);
            hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            t1.LJ((C29374Bfu) B83.LIZ().LIZIZ(), hashMap, "guest_id");
        }
        int hashCode = str2.hashCode();
        if (hashCode != -1183699191) {
            if (hashCode != 93029230) {
                if (hashCode == 1466857630 && str2.equals("join_direct")) {
                    hashMap.put("guest_invite_type", "guest_apply_anchor");
                }
            } else if (str2.equals("apply")) {
                hashMap.put("guest_invite_type", "guest_apply_anchor");
            }
        } else if (str2.equals("invite")) {
            hashMap.put("guest_invite_type", "anchor_invite_guest");
        }
        hashMap.put("request_page", "guest_icon");
        hashMap.put("tab", "");
        if (liveEffect != null) {
            j = liveEffect.effectId;
        } else {
            j = 0;
        }
        C64504PTg.LIZJ(j, hashMap, "props_id", j2, "enhance_level");
        hashMap.put("mic_status", String.valueOf(i ^ 1));
        hashMap.put("camera_status", String.valueOf(0));
        hashMap.put("camera_type", "off");
        TWL.LIZLLL(twl, hashMap);
        TWL.LJIL("livesdk_guest_connection_setting_panel_show", hashMap);
    }
}

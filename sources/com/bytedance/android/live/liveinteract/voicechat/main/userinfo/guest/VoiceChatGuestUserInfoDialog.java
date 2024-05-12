package com.bytedance.android.live.liveinteract.voicechat.main.userinfo.guest;

import X.AbstractC74908Taa;
import X.C0NB;
import X.C162476Zf;
import X.C16880lQ;
import X.C19680pw;
import X.C19N;
import X.C1B3;
import X.C1B6;
import X.C221108m2;
import X.C28507BGt;
import X.C62822Ol8;
import X.C74740TUy;
import X.C74824TYe;
import X.C74918Tak;
import X.C74920Tam;
import X.C75559Tl5;
import X.C78886Uxe;
import X.C87277YNd;
import X.C8E;
import X.EnumC74914Tag;
import X.TQV;
import X.TWR;
import X.TXF;
import X.X1D;
import Y.ACListenerS33S0100000_13;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.AnchorPermitGuestEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.DialogPageChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.GuestJoinChannelWhenAnchorPermitEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.GuestRejectAnchorEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.GuestReplyAnchorEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.distribute.LiveBaseFragment;
import com.bytedance.android.live.liveinteract.voicechat.main.userinfo.common.VoiceChatUserInfoFragment;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.dataChannel.MultiGuestSelectedStickerEvent;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestV3GuestPreviewBugSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestV3LayoutQueryOptSetting;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class VoiceChatGuestUserInfoDialog extends LiveDialogFragment {
    public static final /* synthetic */ int LJLLI = 0;
    public AbstractC74908Taa LJLIL;
    public WeakReference<TQV> LJLILLLLZI;
    public TXF LJLJI;
    public TWR LJLJJI;
    public LiveBaseFragment LJLJJL;
    public View LJLJJLL;
    public final Map<Integer, View> LJLL = new LinkedHashMap();
    public final C62822Ol8 LJLJL = C221108m2.LIZIZ(new AqS163S0100000_13(this, 169));
    public final C62822Ol8 LJLJLJ = C221108m2.LIZIZ(new AqS163S0100000_13(this, 168));
    public final long LJLJLLL = System.currentTimeMillis();

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLL).clear();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLL;
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
        int i;
        if (wl()) {
            i = R.layout.czf;
        } else {
            i = R.layout.cze;
        }
        C28507BGt c28507BGt = new C28507BGt(i);
        c28507BGt.LIZJ = R.style.aap;
        if (wl()) {
            c28507BGt.LJFF = true;
        } else {
            boolean z = false;
            c28507BGt.LJIIL = new ColorDrawable(0);
            c28507BGt.LJII = 80;
            if (this.LJLJI == TXF.GO_LIVE) {
                z = true;
            }
            c28507BGt.LJ = !z;
        }
        c28507BGt.LJIIJ = -1;
        return c28507BGt;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final boolean onBackPressed() {
        LiveBaseFragment liveBaseFragment = this.LJLJJL;
        if ((liveBaseFragment instanceof LiveBaseFragment) && liveBaseFragment.onBackPressed()) {
            return true;
        }
        boolean onBackPressed = super.onBackPressed();
        if (!onBackPressed && !getDialogParams().LJFF) {
            dismissAllowingStateLoss();
        }
        return onBackPressed;
    }

    public final VoiceChatUserInfoFragment vl() {
        return (VoiceChatUserInfoFragment) this.LJLJL.getValue();
    }

    public final boolean wl() {
        if (!MultiGuestV3GuestPreviewBugSetting.INSTANCE.isEnable() || this.LJLJI != TXF.GO_LIVE) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment
    public final void dismiss() {
        MultiGuestDataHolder multiGuestDataHolder;
        boolean z;
        super.dismiss();
        if (!C19N.LIZLLL() || C78886Uxe.LJJJJZ(C8E.LJ()) != 5 || this.LJLJI == TXF.GO_LIVE) {
            return;
        }
        Object obj = C75559Tl5.LIZIZ.LIZJ().get("MULTI_GUEST_DATA_HOLDER");
        if (!(obj instanceof MultiGuestDataHolder) || (multiGuestDataHolder = (MultiGuestDataHolder) obj) == null) {
            return;
        }
        if (C74740TUy.LIZLLL().LJFF != null) {
            z = true;
        } else {
            z = false;
        }
        String str = "";
        if (z) {
            C19680pw c19680pw = new C19680pw(C74740TUy.LIZLLL().LJFF, "liveinteract", "", false);
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null) {
                dataChannel.qv0(MultiGuestSelectedStickerEvent.class, c19680pw);
            }
        }
        LiveEffect liveEffect = C74740TUy.LIZLLL().LJFF;
        long j = C74740TUy.LIZLLL().LJ;
        boolean z2 = !multiGuestDataHolder.LIZLLL;
        boolean z3 = !multiGuestDataHolder.LJ;
        boolean z4 = multiGuestDataHolder.LJIIIIZZ;
        LiveBaseFragment liveBaseFragment = this.LJLJJL;
        if (liveBaseFragment instanceof VoiceChatUserInfoFragment) {
            o.LJII(liveBaseFragment, "null cannot be cast to non-null type com.bytedance.android.live.liveinteract.voicechat.main.userinfo.common.VoiceChatUserInfoFragment");
            str = ((VoiceChatUserInfoFragment) liveBaseFragment).LLFFF;
        }
        C74824TYe.LIZ.LJJJJZI(liveEffect, j, z2, z3, z4, str, System.currentTimeMillis() - this.LJLJLLL, false, 0, "guest_icon");
    }

    public final void xl(EnumC74914Tag enumC74914Tag) {
        LiveBaseFragment vl;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("switchPage page = ");
        LIZ.append(enumC74914Tag);
        C0NB.LIZIZ("VoiceChatGuestUserInfoDialog", X1D.LIZIZ(LIZ));
        LiveBaseFragment liveBaseFragment = this.LJLJJL;
        int i = C74920Tam.LIZ[enumC74914Tag.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    vl = vl();
                } else {
                    throw new C162476Zf();
                }
            } else {
                vl = (LiveBaseFragment) this.LJLJLJ.getValue();
            }
        } else {
            TWR twr = this.LJLJJI;
            if (twr != null) {
                twr.LJFF = false;
            }
            VoiceChatUserInfoFragment vl2 = vl();
            TXF txf = this.LJLJI;
            TWR twr2 = this.LJLJJI;
            vl2.LJLLL = txf;
            vl2.LJLZ = twr2;
            MultiGuestV3LayoutQueryOptSetting.INSTANCE.isEnable();
            vl = vl();
        }
        if (vl != null && !o.LJ(liveBaseFragment, vl)) {
            FragmentManager childFragmentManager = getChildFragmentManager();
            C1B3 LIZ2 = C1B6.LIZ(childFragmentManager, childFragmentManager);
            LIZ2.LJIIJJI(R.anim.h6, R.anim.ha, 0, 0);
            if (liveBaseFragment != null) {
                LIZ2.LJIIIZ(liveBaseFragment);
            }
            if (vl.isAdded()) {
                LIZ2.LJIIL(vl);
            } else {
                LIZ2.LJIIIIZZ(R.id.dm7, 1, vl, null);
            }
            LIZ2.LJI();
        }
        this.LJLJJL = vl;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        getDialogParams().LJI = 0.0f;
        if (!wl()) {
            View findViewById = view.findViewById(R.id.hej);
            o.LJIIIIZZ(findViewById, "view.findViewById(R.id.outer_view)");
            this.LJLJJLL = findViewById;
            C87277YNd.LJJIIZ(findViewById);
            View view2 = this.LJLJJLL;
            if (view2 != null) {
                C87277YNd.LJJIJ(view2);
                View view3 = this.LJLJJLL;
                if (view3 != null) {
                    C16880lQ.LJIIJ(new ACListenerS33S0100000_13(this, 59), view3);
                } else {
                    o.LJIJI("outerView");
                    throw null;
                }
            } else {
                o.LJIJI("outerView");
                throw null;
            }
        }
        VoiceChatUserInfoFragment vl = vl();
        this.LJLJJL = vl;
        if (vl instanceof VoiceChatUserInfoFragment) {
            TXF txf = this.LJLJI;
            TWR twr = this.LJLJJI;
            vl.LJLLL = txf;
            vl.LJLZ = twr;
            MultiGuestV3LayoutQueryOptSetting.INSTANCE.isEnable();
        }
        FragmentManager childFragmentManager = getChildFragmentManager();
        C1B3 LIZ = C1B6.LIZ(childFragmentManager, childFragmentManager);
        LIZ.LJIIIIZZ(R.id.dm7, 1, vl, null);
        LIZ.LJIILJJIL();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.lv0(this, DialogPageChannel.class, new C74918Tak(this));
            dataChannel.lv0(this, AnchorPermitGuestEvent.class, new AqS179S0100000_13(this, 258));
            dataChannel.lv0(this, GuestReplyAnchorEvent.class, new AqS179S0100000_13(this, 259));
            dataChannel.lv0(this, GuestRejectAnchorEvent.class, new AqS179S0100000_13(this, 260));
            dataChannel.lv0(this, GuestJoinChannelWhenAnchorPermitEvent.class, new AqS179S0100000_13(this, 261));
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment
    public final void show(FragmentManager manager, String str) {
        MultiGuestDataHolder multiGuestDataHolder;
        String str2;
        MultiGuestDataHolder multiGuestDataHolder2;
        o.LJIIIZ(manager, "manager");
        if (!vl().isAdded()) {
            try {
                super.show(manager, str);
            } catch (Exception unused) {
            }
        }
        if (!C19N.LIZLLL() || C78886Uxe.LJJJJZ(C8E.LJ()) != 5 || this.LJLJI == TXF.GO_LIVE) {
            return;
        }
        C75559Tl5 c75559Tl5 = C75559Tl5.LIZIZ;
        Object obj = c75559Tl5.LIZJ().get("MULTI_GUEST_DATA_HOLDER");
        if (!(obj instanceof MultiGuestDataHolder) || (multiGuestDataHolder = (MultiGuestDataHolder) obj) == null) {
            return;
        }
        Object obj2 = c75559Tl5.LIZJ().get("MULTI_GUEST_DATA_HOLDER");
        if (!(obj2 instanceof MultiGuestDataHolder) || (multiGuestDataHolder2 = (MultiGuestDataHolder) obj2) == null || (str2 = multiGuestDataHolder2.LJJJJI) == null) {
            str2 = "";
        }
        C74824TYe.LIZ.LJJJLL(str2, "guest_icon", "", C74740TUy.LIZLLL().LJFF, C74740TUy.LIZLLL().LJ, !multiGuestDataHolder.LIZLLL, !multiGuestDataHolder.LJ, multiGuestDataHolder.LJIIIIZZ, false, 0);
    }
}

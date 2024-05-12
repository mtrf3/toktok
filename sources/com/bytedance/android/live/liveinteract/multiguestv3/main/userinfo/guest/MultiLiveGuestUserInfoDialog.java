package com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.guest;

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
import X.C29306Beo;
import X.C62822Ol8;
import X.C74740TUy;
import X.C74749TVh;
import X.C74824TYe;
import X.C74917Taj;
import X.C74919Tal;
import X.C75559Tl5;
import X.C78886Uxe;
import X.C87277YNd;
import X.C8E;
import X.EnumC74914Tag;
import X.TQM;
import X.TWR;
import X.TXF;
import X.TXL;
import X.TY2;
import X.X1D;
import Y.ACListenerS33S0100000_13;
import Y.ARunnableS49S0100000_13;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.AnchorPermitGuestEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.DialogPageChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.GuestJoinChannelWhenAnchorPermitEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.GuestRejectAnchorEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.GuestReplyAnchorEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.distribute.LiveBaseFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.distribute.MultiGuestConnectDistributeParentFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv1.MultiGuestPreviewFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv1.PreviewDialogFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.common.MultiGuestUserInfoFragment;
import com.bytedance.android.livesdk.dataChannel.MultiGuestSelectedStickerEvent;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestLeakOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestUserInfoDialogAnimationOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestV3GuestPreviewBugSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestV3LayoutQueryOptSetting;
import com.bytedance.android.livesdk.ui.BaseFragment;
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
public final class MultiLiveGuestUserInfoDialog extends PreviewDialogFragment {
    public static final /* synthetic */ int LJLLLLLL = 0;
    public AbstractC74908Taa LJLILLLLZI;
    public WeakReference<TQM> LJLJI;
    public TXF LJLJJI;
    public TWR LJLJJL;
    public LiveBaseFragment LJLJJLL;
    public C74749TVh LJLJL;
    public View LJLJLJ;
    public int LJLJLLL;
    public final Map<Integer, View> LJLLLL = new LinkedHashMap();
    public String LJLL = "permit";
    public final C62822Ol8 LJLLI = C221108m2.LIZIZ(new AqS163S0100000_13(this, 114));
    public final C62822Ol8 LJLLILLLL = C221108m2.LIZIZ(new AqS163S0100000_13(this, 113));
    public final C62822Ol8 LJLLJ = C221108m2.LIZIZ(new AqS163S0100000_13(this, 112));
    public final long LJLLL = System.currentTimeMillis();

    static {
        new TXL();
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv1.PreviewDialogFragment, com.bytedance.android.livesdk.LiveDialogFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLLL).clear();
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv1.PreviewDialogFragment, com.bytedance.android.livesdk.LiveDialogFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLLL;
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

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv1.PreviewDialogFragment, com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C28507BGt createParams() {
        int i;
        if (xl()) {
            i = R.layout.czf;
        } else {
            i = R.layout.cze;
        }
        C28507BGt c28507BGt = new C28507BGt(i);
        c28507BGt.LIZJ = R.style.aap;
        if (xl()) {
            c28507BGt.LJFF = true;
        } else {
            boolean z = false;
            c28507BGt.LJIIL = new ColorDrawable(0);
            c28507BGt.LJII = 80;
            if (this.LJLJJI == TXF.GO_LIVE) {
                z = true;
            }
            c28507BGt.LJ = !z;
        }
        c28507BGt.LJIIJ = -1;
        return c28507BGt;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment
    public final void dismiss() {
        MultiGuestDataHolder multiGuestDataHolder;
        boolean z;
        LiveBaseFragment liveBaseFragment = this.LJLJJLL;
        if (liveBaseFragment instanceof MultiGuestPreviewFragment) {
            o.LJII(liveBaseFragment, "null cannot be cast to non-null type com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv1.MultiGuestPreviewFragment");
            MultiGuestPreviewFragment multiGuestPreviewFragment = (MultiGuestPreviewFragment) liveBaseFragment;
            View view = multiGuestPreviewFragment.LJLJJLL;
            if (view != null) {
                view.setVisibility(0);
            }
            multiGuestPreviewFragment.Dl();
            multiGuestPreviewFragment.LLJILJIL = true;
            LiveBaseFragment liveBaseFragment2 = this.LJLJJLL;
            o.LJII(liveBaseFragment2, "null cannot be cast to non-null type com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv1.MultiGuestPreviewFragment");
            View view2 = ((MultiGuestPreviewFragment) liveBaseFragment2).LJLJJLL;
            if (view2 != null) {
                view2.post(new ARunnableS49S0100000_13(this, 46));
            }
        } else {
            super.dismiss();
        }
        if (C19N.LIZLLL() && C78886Uxe.LJJJJZ(C8E.LJ()) == 5 && this.LJLJJI != TXF.GO_LIVE) {
            Object obj = C75559Tl5.LIZIZ.LIZJ().get("MULTI_GUEST_DATA_HOLDER");
            if ((obj instanceof MultiGuestDataHolder) && (multiGuestDataHolder = (MultiGuestDataHolder) obj) != null) {
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
                LiveBaseFragment liveBaseFragment3 = this.LJLJJLL;
                if (liveBaseFragment3 instanceof MultiGuestPreviewFragment) {
                    o.LJII(liveBaseFragment3, "null cannot be cast to non-null type com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv1.MultiGuestPreviewFragment");
                    str = ((MultiGuestPreviewFragment) liveBaseFragment3).LLJJJ;
                } else if (liveBaseFragment3 instanceof MultiGuestUserInfoFragment) {
                    o.LJII(liveBaseFragment3, "null cannot be cast to non-null type com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.common.MultiGuestUserInfoFragment");
                    str = ((MultiGuestUserInfoFragment) liveBaseFragment3).LLILZ;
                }
                o.LJIIIIZZ(str, "when (mCurrentFragment) …                        }");
                C74824TYe.LIZ.LJJJJZI(liveEffect, j, z2, z3, z4, str, System.currentTimeMillis() - this.LJLLL, false, 0, "guest_icon");
            }
        }
        if (LiveSdkMultiGuestLeakOptSetting.INSTANCE.isEnable()) {
            this.LJLILLLLZI = null;
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final boolean onBackPressed() {
        C28507BGt dialogParams;
        LiveBaseFragment liveBaseFragment = this.LJLJJLL;
        if ((liveBaseFragment instanceof LiveBaseFragment) && liveBaseFragment.onBackPressed()) {
            return true;
        }
        if (((BaseFragment) this.LJLLILLLL.getValue()).mStatusActive) {
            ((MultiGuestPreviewFragment) this.LJLLILLLL.getValue()).Al();
            return true;
        }
        boolean onBackPressed = super.onBackPressed();
        if (!onBackPressed && (dialogParams = getDialogParams()) != null && !dialogParams.LJFF) {
            dismissAllowingStateLoss();
        }
        return onBackPressed;
    }

    public final Fragment wl() {
        if (this.LJLJJI == TXF.GO_LIVE) {
            Fragment mPreviewFragment = (Fragment) this.LJLLILLLL.getValue();
            o.LJIIIIZZ(mPreviewFragment, "mPreviewFragment");
            return mPreviewFragment;
        }
        return (Fragment) this.LJLLI.getValue();
    }

    public final boolean xl() {
        if (!MultiGuestV3GuestPreviewBugSetting.INSTANCE.isEnable() || this.LJLJJI != TXF.GO_LIVE) {
            return true;
        }
        return false;
    }

    public static final /* synthetic */ void vl(MultiLiveGuestUserInfoDialog multiLiveGuestUserInfoDialog) {
        super.dismiss();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v7, types: [com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv1.MultiGuestPreviewFragment] */
    /* JADX WARN: Type inference failed for: r2v9, types: [com.bytedance.android.live.liveinteract.multiguestv3.main.guest.distribute.MultiGuestConnectDistributeParentFragment] */
    public final void Al(EnumC74914Tag enumC74914Tag) {
        MultiGuestUserInfoFragment multiGuestUserInfoFragment;
        MultiGuestUserInfoFragment multiGuestUserInfoFragment2;
        AbstractC74908Taa abstractC74908Taa;
        AbstractC74908Taa abstractC74908Taa2;
        if (C29306Beo.LJIJJLI(enumC74914Tag.getSource())) {
            this.LJLL = enumC74914Tag.getSource();
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("switchPage page = ");
        LIZ.append(enumC74914Tag);
        C0NB.LIZIZ("MultiLiveGuestUserInfoDialog", X1D.LIZIZ(LIZ));
        LiveBaseFragment liveBaseFragment = this.LJLJJLL;
        int i = C74919Tal.LIZ[enumC74914Tag.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    multiGuestUserInfoFragment = (MultiGuestConnectDistributeParentFragment) this.LJLLJ.getValue();
                } else {
                    throw new C162476Zf();
                }
            } else {
                multiGuestUserInfoFragment = (MultiGuestPreviewFragment) this.LJLLILLLL.getValue();
            }
        } else {
            TWR twr = this.LJLJJL;
            if (twr != null) {
                twr.LJFF = false;
            }
            MultiGuestUserInfoFragment multiGuestUserInfoFragment3 = (MultiGuestUserInfoFragment) this.LJLLI.getValue();
            TXF txf = this.LJLJJI;
            TWR twr2 = this.LJLJJL;
            multiGuestUserInfoFragment3.LLFII = txf;
            multiGuestUserInfoFragment3.LLIFFJFJJ = twr2;
            if (MultiGuestV3LayoutQueryOptSetting.INSTANCE.isEnable()) {
                multiGuestUserInfoFragment3.Zl();
            }
            multiGuestUserInfoFragment = (MultiGuestUserInfoFragment) this.LJLLI.getValue();
        }
        if (!LiveSdkMultiGuestUserInfoDialogAnimationOptSetting.INSTANCE.isEnable()) {
            if (multiGuestUserInfoFragment != null && !o.LJ(liveBaseFragment, multiGuestUserInfoFragment)) {
                FragmentManager childFragmentManager = getChildFragmentManager();
                C1B3 LIZ2 = C1B6.LIZ(childFragmentManager, childFragmentManager);
                LIZ2.LJIIJJI(R.anim.h6, R.anim.ha, 0, 0);
                if (liveBaseFragment != null) {
                    LIZ2.LJIIIZ(liveBaseFragment);
                }
                if (multiGuestUserInfoFragment.isAdded()) {
                    LIZ2.LJIIL(multiGuestUserInfoFragment);
                } else {
                    LIZ2.LJIIIIZZ(R.id.dm7, 1, multiGuestUserInfoFragment, null);
                }
                LIZ2.LJI();
            }
        } else {
            FragmentManager childFragmentManager2 = getChildFragmentManager();
            C1B3 LIZ3 = C1B6.LIZ(childFragmentManager2, childFragmentManager2);
            LIZ3.LJIIJJI(R.anim.h6, R.anim.ha, 0, 0);
            if (multiGuestUserInfoFragment == null) {
                return;
            }
            LIZ3.LJIIJ(multiGuestUserInfoFragment, null, R.id.dm7);
            LIZ3.LJI();
        }
        if (LiveSdkMultiGuestLeakOptSetting.INSTANCE.isEnable() && (abstractC74908Taa2 = this.LJLILLLLZI) != null) {
            abstractC74908Taa2.LIZJ();
        }
        this.LJLJJLL = multiGuestUserInfoFragment;
        if ((multiGuestUserInfoFragment instanceof TY2) && (multiGuestUserInfoFragment2 = multiGuestUserInfoFragment) != null && (abstractC74908Taa = this.LJLILLLLZI) != null) {
            abstractC74908Taa.LIZ(multiGuestUserInfoFragment2);
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        getDialogParams().LJI = 0.0f;
        if (!xl()) {
            View findViewById = view.findViewById(R.id.hej);
            o.LJIIIIZZ(findViewById, "view.findViewById(R.id.outer_view)");
            this.LJLJLJ = findViewById;
            C87277YNd.LJJIIZ(findViewById);
            View view2 = this.LJLJLJ;
            if (view2 != null) {
                C87277YNd.LJJIJ(view2);
                View view3 = this.LJLJLJ;
                if (view3 != null) {
                    C16880lQ.LJIIJ(new ACListenerS33S0100000_13(this, 41), view3);
                } else {
                    o.LJIJI("outerView");
                    throw null;
                }
            } else {
                o.LJIJI("outerView");
                throw null;
            }
        }
        Fragment wl = wl();
        this.LJLJJLL = (LiveBaseFragment) wl;
        if (wl instanceof MultiGuestUserInfoFragment) {
            MultiGuestUserInfoFragment multiGuestUserInfoFragment = (MultiGuestUserInfoFragment) wl;
            TXF txf = this.LJLJJI;
            TWR twr = this.LJLJJL;
            multiGuestUserInfoFragment.LLFII = txf;
            multiGuestUserInfoFragment.LLIFFJFJJ = twr;
            if (MultiGuestV3LayoutQueryOptSetting.INSTANCE.isEnable()) {
                multiGuestUserInfoFragment.Zl();
            }
        }
        FragmentManager childFragmentManager = getChildFragmentManager();
        C1B3 LIZ = C1B6.LIZ(childFragmentManager, childFragmentManager);
        LIZ.LJIIIIZZ(R.id.dm7, 1, wl, null);
        LIZ.LJIILJJIL();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.lv0(this, DialogPageChannel.class, new C74917Taj(this));
            dataChannel.lv0(this, AnchorPermitGuestEvent.class, new AqS179S0100000_13(this, 194));
            dataChannel.lv0(this, GuestReplyAnchorEvent.class, new AqS179S0100000_13(this, 195));
            dataChannel.lv0(this, GuestRejectAnchorEvent.class, new AqS179S0100000_13(this, 196));
            dataChannel.lv0(this, GuestJoinChannelWhenAnchorPermitEvent.class, new AqS179S0100000_13(this, 197));
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment
    public final void show(FragmentManager manager, String str) {
        MultiGuestDataHolder multiGuestDataHolder;
        String str2;
        MultiGuestDataHolder multiGuestDataHolder2;
        o.LJIIIZ(manager, "manager");
        if (!wl().isAdded()) {
            try {
                super.show(manager, str);
            } catch (Exception unused) {
            }
        }
        if (!C19N.LIZLLL() || C78886Uxe.LJJJJZ(C8E.LJ()) != 5 || this.LJLJJI == TXF.GO_LIVE) {
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

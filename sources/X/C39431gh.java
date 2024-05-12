package X;

import com.bytedance.android.live.copyrightreview.helper.CopyrightViolationHelper;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv1.MultiGuestPreviewFragment;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestV3GuestGoLivePreviewPanelOpt;
import com.zhiliaoapp.musically.R;

/* renamed from: X.1gh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C39431gh implements InterfaceC64592gB {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ Object LJLILLLLZI;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.LJLIL) {
            case 0:
                CopyrightViolationHelper copyrightViolationHelper = (CopyrightViolationHelper) this.LJLILLLLZI;
                copyrightViolationHelper.LJLJJLL = false;
                copyrightViolationHelper.LJ(2);
                return;
            default:
                MultiGuestPreviewFragment multiGuestPreviewFragment = (MultiGuestPreviewFragment) this.LJLILLLLZI;
                int longValue = (int) (multiGuestPreviewFragment.LLJ - ((Long) obj).longValue());
                if (multiGuestPreviewFragment.getContext() == null) {
                    return;
                }
                if (multiGuestPreviewFragment.LLJJJJJIL != null && MultiGuestV3GuestGoLivePreviewPanelOpt.INSTANCE.isSupportPauseGoLiveInPreviewPanel()) {
                    multiGuestPreviewFragment.LLD.setText(BML.LIZ(C15380j0.LJIILJJIL(R.string.n99), Integer.valueOf(longValue)));
                } else {
                    multiGuestPreviewFragment.LLD.setText(multiGuestPreviewFragment.getContext().getResources().getQuantityString(R.plurals.m0, longValue, Integer.valueOf(longValue)));
                }
                if (longValue != 0) {
                    return;
                }
                multiGuestPreviewFragment.LLJJJIL = "timeout";
                multiGuestPreviewFragment.LLJJJ = "others";
                multiGuestPreviewFragment.em();
                multiGuestPreviewFragment.LLJJIJIIJIL = false;
                multiGuestPreviewFragment.Hl();
                return;
        }
    }

    public /* synthetic */ C39431gh(int i, Object obj) {
        this.LJLIL = i;
        this.LJLILLLLZI = obj;
    }
}

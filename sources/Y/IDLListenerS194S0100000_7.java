package Y;

import X.AnonymousClass377;
import X.C165706es;
import X.C16880lQ;
import X.C26338AVi;
import X.C41051G9f;
import X.C41315GJj;
import X.C61410O8g;
import X.C73098SmU;
import X.G9X;
import X.G9Y;
import X.GQ5;
import X.I37;
import X.IAZ;
import X.InterfaceC82683Wch;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.RelativeLayout;
import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.ftc.FTCVideoRecordNewActivity;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.ExteriorVideoRecordScene;
import com.ss.android.ugc.aweme.ttep.TTEPEffectPreviewActivity;
import com.ss.android.ugc.aweme.utils.KeyBoardMonitor;
import com.ss.android.ugc.aweme.video.hashtag.feedback.HashtagFeedbackFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class IDLListenerS194S0100000_7 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int $t;
    public Object l0;

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.$t) {
            case 0:
                onGlobalLayout$0(this);
                return;
            case 1:
                onGlobalLayout$1(this);
                return;
            case 2:
                onGlobalLayout$2(this);
                return;
            case 3:
                onGlobalLayout$3(this);
                return;
            case 4:
                onGlobalLayout$4(this);
                return;
            case 5:
                onGlobalLayout$5(this);
                return;
            default:
                return;
        }
    }

    public static final void onGlobalLayout$0(IDLListenerS194S0100000_7 iDLListenerS194S0100000_7) {
        C41051G9f c41051G9f = (C41051G9f) iDLListenerS194S0100000_7.l0;
        if (c41051G9f.LJLJJLL == null) {
            c41051G9f.LJLJJLL = View.inflate(c41051G9f.mActivity, R.layout.blq, null);
            C41051G9f c41051G9f2 = (C41051G9f) iDLListenerS194S0100000_7.l0;
            RelativeLayout relativeLayout = c41051G9f2.LJLJJL;
            if (relativeLayout != null) {
                View view = c41051G9f2.LJLJJLL;
                int width = relativeLayout.getWidth();
                IAZ iaz = ((C41051G9f) iDLListenerS194S0100000_7.l0).LJLLLLLL;
                if (iaz != null) {
                    int height = iaz.getHeight();
                    AnonymousClass377 anonymousClass377 = ((C41051G9f) iDLListenerS194S0100000_7.l0).LJLZ;
                    if (anonymousClass377 != null) {
                        relativeLayout.addView(view, width, height - anonymousClass377.getHeight());
                        View view2 = ((C41051G9f) iDLListenerS194S0100000_7.l0).LJLJJLL;
                        if (view2 != null) {
                            view2.setAlpha(0.196f);
                        }
                        View view3 = ((C41051G9f) iDLListenerS194S0100000_7.l0).LJLJJLL;
                        if (view3 != null) {
                            C16880lQ.LJIIJ(G9Y.LJLIL, view3);
                        }
                        View view4 = ((C41051G9f) iDLListenerS194S0100000_7.l0).LJLJJLL;
                        if (view4 != null) {
                            C41315GJj.LIZ(view4);
                            C41051G9f c41051G9f3 = (C41051G9f) iDLListenerS194S0100000_7.l0;
                            GQ5 gq5 = c41051G9f3.LJLILLLLZI;
                            if (gq5 != null) {
                                new KeyBoardMonitor(gq5.LIZ.getLifeCycleOwner()).LIZ(gq5.LIZIZ, new G9X(c41051G9f3));
                                return;
                            } else {
                                o.LJIJI("titleModule");
                                throw null;
                            }
                        }
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    o.LJIJI("editContainerParent");
                    throw null;
                }
                o.LJIJI("viewParent");
                throw null;
            }
            o.LJIJI("publishBottomSettingsContainer");
            throw null;
        }
    }

    public static final void onGlobalLayout$1(IDLListenerS194S0100000_7 iDLListenerS194S0100000_7) {
        I37 i37 = (I37) ((ExteriorVideoRecordScene) iDLListenerS194S0100000_7.l0).LJLLLLLL.LJIIIIZZ(null, I37.class);
        if (i37 != null) {
            i37.R50(true);
        }
        ExteriorVideoRecordScene exteriorVideoRecordScene = (ExteriorVideoRecordScene) iDLListenerS194S0100000_7.l0;
        exteriorVideoRecordScene.getClass();
        ((ShortVideoContextViewModel) C165706es.LJIIIIZZ(exteriorVideoRecordScene, null, null, 6).get(ShortVideoContextViewModel.class)).iv0();
        ((ExteriorVideoRecordScene) iDLListenerS194S0100000_7.l0).getWindow().getDecorView().getViewTreeObserver().removeOnGlobalLayoutListener(iDLListenerS194S0100000_7);
    }

    public static final void onGlobalLayout$2(IDLListenerS194S0100000_7 iDLListenerS194S0100000_7) {
        ((InterfaceC82683Wch) iDLListenerS194S0100000_7.l0).LIZLLL();
    }

    public static final void onGlobalLayout$3(IDLListenerS194S0100000_7 iDLListenerS194S0100000_7) {
        View view;
        boolean z;
        HashtagFeedbackFragment hashtagFeedbackFragment = (HashtagFeedbackFragment) iDLListenerS194S0100000_7.l0;
        if (hashtagFeedbackFragment.getContext() == null || (view = hashtagFeedbackFragment.LJLJI) == null) {
            return;
        }
        int LIZ = C61410O8g.LIZ(hashtagFeedbackFragment.getContext());
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        Rect LIZJ = C73098SmU.LIZJ(view);
        int i = rect.bottom;
        int i2 = LIZ - i;
        if (i2 > 0) {
            z = true;
        } else {
            z = false;
        }
        if (i2 != hashtagFeedbackFragment.LJLJJL) {
            if (z) {
                if (i != LIZJ.bottom) {
                    C26338AVi.LJI(view, null, null, null, Integer.valueOf(i2), false, 23);
                }
            } else {
                C26338AVi.LJI(view, null, null, null, 0, false, 23);
            }
            view.requestLayout();
        }
        hashtagFeedbackFragment.LJLJJL = i2;
    }

    public static final void onGlobalLayout$4(IDLListenerS194S0100000_7 iDLListenerS194S0100000_7) {
        I37 i37 = (I37) ((TTEPEffectPreviewActivity) iDLListenerS194S0100000_7.l0).LJLL.LJIIIIZZ(null, I37.class);
        if (i37 != null) {
            i37.R50(true);
        }
        TTEPEffectPreviewActivity tTEPEffectPreviewActivity = (TTEPEffectPreviewActivity) iDLListenerS194S0100000_7.l0;
        tTEPEffectPreviewActivity.getClass();
        ((ShortVideoContextViewModel) ViewModelProviders.of(tTEPEffectPreviewActivity).get(ShortVideoContextViewModel.class)).iv0();
        ((TTEPEffectPreviewActivity) iDLListenerS194S0100000_7.l0).getWindow().getDecorView().getViewTreeObserver().removeOnGlobalLayoutListener(iDLListenerS194S0100000_7);
    }

    public static final void onGlobalLayout$5(IDLListenerS194S0100000_7 iDLListenerS194S0100000_7) {
        I37 i37 = (I37) ((FTCVideoRecordNewActivity) iDLListenerS194S0100000_7.l0).LJLLI.LJIIIIZZ(null, I37.class);
        if (i37 != null) {
            i37.R50(true);
        }
        FTCVideoRecordNewActivity fTCVideoRecordNewActivity = (FTCVideoRecordNewActivity) iDLListenerS194S0100000_7.l0;
        fTCVideoRecordNewActivity.getClass();
        ((ShortVideoContextViewModel) ViewModelProviders.of(fTCVideoRecordNewActivity).get(ShortVideoContextViewModel.class)).iv0();
        ((FTCVideoRecordNewActivity) iDLListenerS194S0100000_7.l0).getWindow().getDecorView().getViewTreeObserver().removeOnGlobalLayoutListener(iDLListenerS194S0100000_7);
    }

    public IDLListenerS194S0100000_7(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}

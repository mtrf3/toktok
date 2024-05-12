package Y;

import X.C145995oB;
import X.C165706es;
import X.C45628HvU;
import X.C47959Irz;
import X.C5QW;
import X.C61410O8g;
import X.C76800UCe;
import X.FMX;
import X.I37;
import X.InterfaceC65784Pro;
import X.OSZ;
import X.ViewTreeObserverOnGlobalLayoutListenerC45629HvV;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.search.pages.result.bot.ui.feedback.TakoFeedbackSheetFragment;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.PreviewVideoScene;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewScene;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class IDLListenerS59S0200000_7 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int $t;
    public Object l0;
    public Object l1;

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
            default:
                return;
        }
    }

    public static final void onGlobalLayout$0(IDLListenerS59S0200000_7 iDLListenerS59S0200000_7) {
        boolean z;
        TakoFeedbackSheetFragment takoFeedbackSheetFragment = (TakoFeedbackSheetFragment) iDLListenerS59S0200000_7.l0;
        View view = (View) iDLListenerS59S0200000_7.l1;
        if (takoFeedbackSheetFragment.getContext() == null) {
            return;
        }
        int LIZ = C61410O8g.LIZ(takoFeedbackSheetFragment.getContext());
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        view.getGlobalVisibleRect(new Rect());
        int i = LIZ - rect.bottom;
        int i2 = 0;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        View view2 = (View) view.getParent();
        if (view2 != null) {
            view2.getHeight();
        }
        view.getLayoutParams();
        if (i != takoFeedbackSheetFragment.LJLJJL) {
            int paddingLeft = view.getPaddingLeft();
            int paddingTop = view.getPaddingTop();
            int paddingRight = view.getPaddingRight();
            if (z) {
                i2 = C47959Irz.LIZJ(12, i);
            }
            view.setPadding(paddingLeft, paddingTop, paddingRight, i2);
            view.requestLayout();
        }
        takoFeedbackSheetFragment.LJLJJL = i;
    }

    public static final void onGlobalLayout$1(IDLListenerS59S0200000_7 iDLListenerS59S0200000_7) {
        C45628HvU c45628HvU = (C45628HvU) iDLListenerS59S0200000_7.l0;
        float f = ((float) c45628HvU.LLILZIL) / ((float) c45628HvU.LLILZ);
        if (c45628HvU.LJLLLL != null) {
            float scrollRange = f * r0.getScrollRange();
            C45628HvU c45628HvU2 = (C45628HvU) iDLListenerS59S0200000_7.l0;
            float f2 = c45628HvU2.LLILLL;
            MediaModel mediaModel = c45628HvU2.LLILLIZIL;
            if (mediaModel != null) {
                float f3 = f2 / ((float) mediaModel.duration);
                if (c45628HvU2.LJLLLL != null) {
                    int scrollRange2 = (int) (f3 * r0.getScrollRange());
                    ViewTreeObserverOnGlobalLayoutListenerC45629HvV viewTreeObserverOnGlobalLayoutListenerC45629HvV = ((C45628HvU) iDLListenerS59S0200000_7.l0).LJLLLL;
                    if (viewTreeObserverOnGlobalLayoutListenerC45629HvV != null) {
                        viewTreeObserverOnGlobalLayoutListenerC45629HvV.LIZIZ((int) scrollRange, scrollRange2);
                        if (((MyMediaModel) iDLListenerS59S0200000_7.l1).selectIndex >= 0 || ((C45628HvU) iDLListenerS59S0200000_7.l0).LLIIIL.isEditorProReplace) {
                            PreviewVideoScene LLJJI = ((C45628HvU) iDLListenerS59S0200000_7.l0).LLJJI();
                            if (LLJJI != null) {
                                LLJJI.LLJLIL(new OSZ<>(Integer.valueOf(((MyMediaModel) iDLListenerS59S0200000_7.l1).startTime), Integer.valueOf((int) (((MyMediaModel) iDLListenerS59S0200000_7.l1).startTime + ((C45628HvU) iDLListenerS59S0200000_7.l0).LLILZIL))));
                            }
                            PreviewVideoScene LLJJI2 = ((C45628HvU) iDLListenerS59S0200000_7.l0).LLJJI();
                            if (LLJJI2 != null) {
                                LLJJI2.LLJJLIIIJLLLLLLLZ();
                            }
                            ((C45628HvU) iDLListenerS59S0200000_7.l0).LLJJJ();
                        }
                        ViewTreeObserverOnGlobalLayoutListenerC45629HvV viewTreeObserverOnGlobalLayoutListenerC45629HvV2 = ((C45628HvU) iDLListenerS59S0200000_7.l0).LJLLLL;
                        if (viewTreeObserverOnGlobalLayoutListenerC45629HvV2 != null) {
                            viewTreeObserverOnGlobalLayoutListenerC45629HvV2.getViewTreeObserver().removeOnGlobalLayoutListener(iDLListenerS59S0200000_7);
                            C45628HvU c45628HvU3 = (C45628HvU) iDLListenerS59S0200000_7.l0;
                            if (c45628HvU3.LLIIIL.isEditorProReplace && !c45628HvU3.LLIZLLLIL) {
                                C145995oB LJI = C5QW.LJI((Bundle) c45628HvU3.LLJI.getValue(), String.valueOf(((C45628HvU) iDLListenerS59S0200000_7.l0).LLILZIL));
                                if (LJI != null) {
                                    FMX.LJIIL("choose_longer_video_replace_preview", LJI.LIZ);
                                }
                                ((C45628HvU) iDLListenerS59S0200000_7.l0).LLIZLLLIL = true;
                                return;
                            }
                            return;
                        }
                        o.LJIJI("timeSelectView");
                        throw null;
                    }
                    o.LJIJI("timeSelectView");
                    throw null;
                }
                o.LJIJI("timeSelectView");
                throw null;
            }
            o.LJIJI("currentMediaModel");
            throw null;
        }
        o.LJIJI("timeSelectView");
        throw null;
    }

    public static final void onGlobalLayout$2(IDLListenerS59S0200000_7 iDLListenerS59S0200000_7) {
        VideoRecordNewScene videoRecordNewScene = (VideoRecordNewScene) iDLListenerS59S0200000_7.l1;
        if (videoRecordNewScene.mActivity == null) {
            ((Window) iDLListenerS59S0200000_7.l0).getDecorView().getViewTreeObserver().removeOnGlobalLayoutListener(iDLListenerS59S0200000_7);
            return;
        }
        I37 i37 = (I37) videoRecordNewScene.LJLLLLLL.LJIIIIZZ(null, I37.class);
        if (i37 != null) {
            i37.R50(true);
        }
        VideoRecordNewScene videoRecordNewScene2 = (VideoRecordNewScene) iDLListenerS59S0200000_7.l1;
        videoRecordNewScene2.getClass();
        ((ShortVideoContextViewModel) C165706es.LJIIIIZZ(videoRecordNewScene2, null, null, 6).get(ShortVideoContextViewModel.class)).iv0();
        ((Window) iDLListenerS59S0200000_7.l0).getDecorView().getViewTreeObserver().removeOnGlobalLayoutListener(iDLListenerS59S0200000_7);
    }

    public static final void onGlobalLayout$3(IDLListenerS59S0200000_7 iDLListenerS59S0200000_7) {
        ((View) iDLListenerS59S0200000_7.l0).getViewTreeObserver().removeOnGlobalLayoutListener(iDLListenerS59S0200000_7);
        ((InterfaceC65784Pro) iDLListenerS59S0200000_7.l1).invoke();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public IDLListenerS59S0200000_7(Object obj, View view, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        this.$t = interfaceC65784Pro;
        this.l0 = obj;
        this.l1 = view;
    }
}

package X;

import android.view.ViewGroup;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.PreviewVideoScene;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.HvX, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45631HvX implements InterfaceC45875HzT {
    public final /* synthetic */ C45628HvU LIZ;
    public final /* synthetic */ MyMediaModel LIZIZ;

    @Override // X.InterfaceC45875HzT
    public final void LIZ() {
        C45628HvU c45628HvU = this.LIZ;
        c45628HvU.LLILLJJLI = true;
        PreviewVideoScene LLJJI = c45628HvU.LLJJI();
        if (LLJJI != null) {
            LLJJI.LLJJJIL();
        }
    }

    @Override // X.InterfaceC45875HzT
    public final void LIZJ() {
        String str;
        String str2;
        C45628HvU c45628HvU = this.LIZ;
        c45628HvU.LLILLJJLI = false;
        MyMediaModel myMediaModel = this.LIZIZ;
        int i = c45628HvU.LLILLL;
        myMediaModel.startTime = i;
        myMediaModel.endTime = (int) (i + c45628HvU.LLILZIL);
        PreviewVideoScene LLJJI = c45628HvU.LLJJI();
        if (LLJJI != null) {
            LLJJI.LLJLIL(new OSZ<>(Integer.valueOf(this.LIZIZ.startTime), Integer.valueOf(this.LIZIZ.endTime)));
        }
        PreviewVideoScene LLJJI2 = this.LIZ.LLJJI();
        if (LLJJI2 != null) {
            LLJJI2.LLJJLIIIJLLLLLLLZ();
        }
        C188727au c188727au = new C188727au();
        ShortVideoContext shortVideoContext = this.LIZ.LLIIII;
        String str3 = null;
        if (shortVideoContext != null) {
            str = shortVideoContext.LJI();
        } else {
            str = null;
        }
        c188727au.LJIIIZ("creation_id", str);
        ShortVideoContext shortVideoContext2 = this.LIZ.LLIIII;
        if (shortVideoContext2 != null) {
            str2 = shortVideoContext2.shootWay;
        } else {
            str2 = null;
        }
        c188727au.LJIIIZ("shoot_way", str2);
        ShortVideoContext shortVideoContext3 = this.LIZ.LLIIII;
        if (shortVideoContext3 != null) {
            str3 = shortVideoContext3.enterFrom;
        }
        c188727au.LJIIIZ("enter_from", str3);
        c188727au.LJIIIZ("is_ugc_template", "1");
        FMX.LJIIL("adjust_clip_previewpage", c188727au.LIZ);
    }

    public C45631HvX(C45628HvU c45628HvU, MyMediaModel myMediaModel) {
        this.LIZ = c45628HvU;
        this.LIZIZ = myMediaModel;
    }

    @Override // X.InterfaceC45875HzT
    public final void LIZIZ(int i, int i2, int i3) {
        int i4;
        float scrollRange;
        int i5 = i3;
        ViewTreeObserverOnGlobalLayoutListenerC45629HvV viewTreeObserverOnGlobalLayoutListenerC45629HvV = this.LIZ.LJLLLL;
        if (viewTreeObserverOnGlobalLayoutListenerC45629HvV != null) {
            boolean LIZLLL = C26338AVi.LIZLLL(viewTreeObserverOnGlobalLayoutListenerC45629HvV);
            ViewTreeObserverOnGlobalLayoutListenerC45629HvV viewTreeObserverOnGlobalLayoutListenerC45629HvV2 = this.LIZ.LJLLLL;
            if (viewTreeObserverOnGlobalLayoutListenerC45629HvV2 != null) {
                if (LIZLLL) {
                    i4 = -i5;
                } else {
                    i4 = i5;
                }
                if (viewTreeObserverOnGlobalLayoutListenerC45629HvV2.LJLIL) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = viewTreeObserverOnGlobalLayoutListenerC45629HvV2.LJLJI;
                    if (marginLayoutParams != null) {
                        marginLayoutParams.setMarginStart(marginLayoutParams.getMarginStart() + i4);
                    }
                    viewTreeObserverOnGlobalLayoutListenerC45629HvV2.LIZ(R.id.ip6).setLayoutParams(viewTreeObserverOnGlobalLayoutListenerC45629HvV2.LJLJI);
                    viewTreeObserverOnGlobalLayoutListenerC45629HvV2.requestLayout();
                }
                if (LIZLLL) {
                    C45628HvU c45628HvU = this.LIZ;
                    MediaModel mediaModel = c45628HvU.LLILLIZIL;
                    if (mediaModel != null) {
                        float f = (float) mediaModel.duration;
                        ViewTreeObserverOnGlobalLayoutListenerC45629HvV viewTreeObserverOnGlobalLayoutListenerC45629HvV3 = c45628HvU.LJLLLL;
                        if (viewTreeObserverOnGlobalLayoutListenerC45629HvV3 != null) {
                            float scrollRange2 = viewTreeObserverOnGlobalLayoutListenerC45629HvV3.getScrollRange() - i2;
                            if (this.LIZ.LJLLLL != null) {
                                scrollRange = (scrollRange2 / r0.getScrollRange()) * f;
                            } else {
                                o.LJIJI("timeSelectView");
                                throw null;
                            }
                        } else {
                            o.LJIJI("timeSelectView");
                            throw null;
                        }
                    } else {
                        o.LJIJI("currentMediaModel");
                        throw null;
                    }
                } else {
                    C45628HvU c45628HvU2 = this.LIZ;
                    MediaModel mediaModel2 = c45628HvU2.LLILLIZIL;
                    if (mediaModel2 != null) {
                        float f2 = (float) mediaModel2.duration;
                        float f3 = i;
                        if (c45628HvU2.LJLLLL != null) {
                            scrollRange = (f3 / r0.getScrollRange()) * f2;
                        } else {
                            o.LJIJI("timeSelectView");
                            throw null;
                        }
                    } else {
                        o.LJIJI("currentMediaModel");
                        throw null;
                    }
                }
                C45628HvU c45628HvU3 = this.LIZ;
                int i6 = (int) scrollRange;
                c45628HvU3.LLILLL = i6;
                long j = i6;
                MediaModel mediaModel3 = c45628HvU3.LLILLIZIL;
                if (mediaModel3 != null) {
                    long j2 = mediaModel3.duration;
                    long j3 = c45628HvU3.LLILZIL;
                    if (j >= j2 - j3) {
                        c45628HvU3.LLILLL = (int) (j2 - j3);
                    }
                    ViewTreeObserverOnGlobalLayoutListenerC45629HvV viewTreeObserverOnGlobalLayoutListenerC45629HvV4 = c45628HvU3.LJLLLL;
                    if (viewTreeObserverOnGlobalLayoutListenerC45629HvV4 != null) {
                        if (LIZLLL) {
                            i5 = -i5;
                        }
                        if (viewTreeObserverOnGlobalLayoutListenerC45629HvV4.LJLIL) {
                            ViewGroup.MarginLayoutParams marginLayoutParams2 = viewTreeObserverOnGlobalLayoutListenerC45629HvV4.LJLILLLLZI;
                            if (marginLayoutParams2 != null) {
                                marginLayoutParams2.setMarginStart(marginLayoutParams2.getMarginStart() + i5);
                            }
                            viewTreeObserverOnGlobalLayoutListenerC45629HvV4.LIZ(R.id.ewo).setLayoutParams(viewTreeObserverOnGlobalLayoutListenerC45629HvV4.LJLILLLLZI);
                            viewTreeObserverOnGlobalLayoutListenerC45629HvV4.requestLayout();
                            return;
                        }
                        return;
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
        o.LJIJI("timeSelectView");
        throw null;
    }
}

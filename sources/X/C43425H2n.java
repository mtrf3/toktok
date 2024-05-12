package X;

import Y.ACallableS110S0100000_7;
import Y.ARunnableS43S0100000_7;
import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.sticker.data.CaptionStruct;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.Utterance;
import com.ss.android.vesdk.VEWatermarkParam;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.H2n, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43425H2n implements InterfaceC133905Ni {
    public final /* synthetic */ C43422H2k LJLIL;
    public final /* synthetic */ InterfaceC153045zY LJLILLLLZI;
    public final /* synthetic */ VideoPublishEditModel LJLJI;
    public final /* synthetic */ SynthetiseResult LJLJJI;

    public C43425H2n(InterfaceC153045zY interfaceC153045zY, SynthetiseResult synthetiseResult, VideoPublishEditModel videoPublishEditModel, C43422H2k c43422H2k) {
        this.LJLIL = c43422H2k;
        this.LJLILLLLZI = interfaceC153045zY;
        this.LJLJI = videoPublishEditModel;
        this.LJLJJI = synthetiseResult;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v2, types: [X.6YU] */
    @Override // X.InterfaceC133905Ni
    public final void LIZ(int i, int i2, float f, String str) {
        String str2;
        int i3;
        Integer videoWidth;
        int i4;
        String str3 = null;
        if (i != 4103) {
            if (i != 4105) {
                if (i != 4116) {
                    return;
                }
                C67996QmO c67996QmO = this.LJLIL.LJIILJJIL;
                if (c67996QmO != null) {
                    c67996QmO.LIZIZ(new C43393H1h("CompileWithCaptionTask", "SerialPublishWithWatermarkFuture onCallback: serial compile watermark video prepared"), EnumC43531H6p.OUTER);
                    final C43422H2k c43422H2k = this.LJLIL;
                    InterfaceC153045zY interfaceC153045zY = this.LJLILLLLZI;
                    Application application = C44172HVg.LIZ;
                    o.LJIIIIZZ(application, "application");
                    final VideoPublishEditModel videoPublishEditModel = this.LJLJI;
                    c43422H2k.getClass();
                    final WeakReference weakReference = new WeakReference(application);
                    List<InteractStickerStruct> LJI = C164826dS.LJI(videoPublishEditModel.getMainBusinessContext(), 11, EnumC164816dR.TRACK_PAGE_EDIT);
                    if (LJI != null && LJI.size() > 0) {
                        videoPublishEditModel.captionStruct = ((InteractStickerStruct) ListProtector.get(LJI, 0)).getCaptionStruct();
                    }
                    int[] LIZJ = C44526Hdi.LIZJ(videoPublishEditModel);
                    int i5 = LIZJ[1];
                    if (i5 != 0 && (i4 = LIZJ[0]) != 0) {
                        i3 = (int) (((i5 * 1.0f) / i4) * 720);
                    } else {
                        i3 = 1280;
                    }
                    float f2 = (i3 * 1.0f) / 720;
                    final C76732zl c76732zl = new C76732zl();
                    c76732zl.element = C81184Vtc.LJ(application);
                    final C76732zl c76732zl2 = new C76732zl();
                    c76732zl2.element = (int) (c76732zl.element * f2);
                    final C76732zl c76732zl3 = new C76732zl();
                    c76732zl3.element = C156436Bz.LLILZ;
                    final C76732zl c76732zl4 = new C76732zl();
                    c76732zl4.element = C156436Bz.LLILLL;
                    final C76732zl c76732zl5 = new C76732zl();
                    c76732zl5.element = C156436Bz.LLILLJJLI;
                    CaptionStruct captionStruct = videoPublishEditModel.captionStruct;
                    if (captionStruct != null && captionStruct.getVideoWidth() != null && ((videoWidth = captionStruct.getVideoWidth()) == null || videoWidth.intValue() != 0)) {
                        Integer marginStart = captionStruct.getMarginStart();
                        o.LJI(marginStart);
                        c76732zl3.element = marginStart.intValue();
                        Integer videoWidth2 = captionStruct.getVideoWidth();
                        o.LJI(videoWidth2);
                        int intValue = videoWidth2.intValue();
                        c76732zl.element = intValue;
                        c76732zl2.element = (int) (intValue * f2);
                        Integer marginTop = captionStruct.getMarginTop();
                        o.LJI(marginTop);
                        c76732zl4.element = marginTop.intValue();
                        Integer marginBottom = captionStruct.getMarginBottom();
                        o.LJI(marginBottom);
                        c76732zl5.element = marginBottom.intValue();
                    }
                    final C122034qd LJJI = C17N.LJJI(interfaceC153045zY);
                    if (LJJI != null) {
                        final int i6 = i3;
                        LJJI.LJIIIIZZ().LIZ().LIZ(new C5JM() { // from class: X.6YU
                            @Override // X.C5JM
                            public final Bitmap LIZ(String slotUUid) {
                                String str4;
                                float measuredHeight;
                                int i7;
                                float measuredWidth;
                                int i8;
                                Utterance utterance;
                                Context context = weakReference.get();
                                if (context == null) {
                                    return Bitmap.createBitmap(1, 1, Bitmap.Config.RGB_565);
                                }
                                List<Utterance> utterances = videoPublishEditModel.captionStruct.getUtterances();
                                AttributeSet attributeSet = null;
                                if (utterances != null && (utterance = (Utterance) ORZ.LJLLLLLL(((List) c43422H2k.LJJI.getValue()).indexOf(slotUUid), utterances)) != null) {
                                    str4 = utterance.getText();
                                } else {
                                    str4 = null;
                                }
                                if (TextUtils.isEmpty(str4)) {
                                    return Bitmap.createBitmap(1, 1, Bitmap.Config.RGB_565);
                                }
                                TuxTextView tuxTextView = new TuxTextView(context, attributeSet, 6, 0);
                                tuxTextView.setTuxFont(32);
                                tuxTextView.setText(str4);
                                tuxTextView.setTextColor(C44172HVg.LIZ.getResources().getColor(R.color.ar));
                                int LIZIZ = (int) C74275TDb.LIZIZ(context, 8.0f);
                                tuxTextView.setPadding(LIZIZ, LIZIZ, LIZIZ, LIZIZ);
                                tuxTextView.setBackground(C04270Et.LIZIZ(context, R.drawable.rf));
                                tuxTextView.measure(View.MeasureSpec.makeMeasureSpec(C156436Bz.LLILZLL, LiveLayoutPreloadThreadPriority.DEFAULT), View.MeasureSpec.makeMeasureSpec(0, 0));
                                if (videoPublishEditModel.captionStruct.getLocation() == EnumC1551166x.LEFT_TOP.getValue()) {
                                    measuredHeight = ((tuxTextView.getMeasuredHeight() / 2) + c76732zl4.element) * 1.0f;
                                    i7 = c76732zl2.element;
                                } else {
                                    measuredHeight = ((c76732zl2.element - c76732zl5.element) - (tuxTextView.getMeasuredHeight() / 2)) * 1.0f;
                                    i7 = c76732zl2.element;
                                }
                                float f3 = measuredHeight / i7;
                                if (C90193gN.LIZ()) {
                                    measuredWidth = ((c76732zl.element - c76732zl3.element) - (tuxTextView.getMeasuredWidth() / 2)) * 1.0f;
                                    i8 = c76732zl.element;
                                } else {
                                    measuredWidth = ((tuxTextView.getMeasuredWidth() / 2) + c76732zl3.element) * 1.0f;
                                    i8 = c76732zl.element;
                                }
                                float f4 = measuredWidth / i8;
                                float f5 = 720;
                                float f6 = (1.0f * f5) / c76732zl.element;
                                C67996QmO c67996QmO2 = c43422H2k.LJIILJJIL;
                                if (c67996QmO2 != null) {
                                    c67996QmO2.LIZIZ(new C43393H1h("CompileWithCaptionTask", "CompileWithCaptionTask get buffer index " + slotUUid + " text " + str4 + " posX " + f4 + " posY " + f3 + "  width " + tuxTextView.getMeasuredWidth() + " height " + tuxTextView.getMeasuredHeight() + " videoWidth 720 videoHeight " + i6 + " startMargin " + c76732zl3.element + " savedVideoWidth " + c76732zl.element + " savedVideoHeight " + c76732zl2.element + " finalMargin " + ((f5 * f4) - ((tuxTextView.getMeasuredWidth() * f6) / 2))), EnumC43531H6p.OUTER);
                                    C5WG LJIIIIZZ = LJJI.LJIIIIZZ();
                                    o.LJIIIIZZ(slotUUid, "slotUUid");
                                    LJIIIIZZ.LJIIL(Float.valueOf(f4), Float.valueOf(f3), slotUUid);
                                    Bitmap createBitmap = Bitmap.createBitmap(tuxTextView.getMeasuredWidth(), tuxTextView.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                                    Canvas canvas = new Canvas(createBitmap);
                                    tuxTextView.layout(0, 0, tuxTextView.getMeasuredWidth(), tuxTextView.getMeasuredHeight());
                                    C37203Eit.LIZJ.getClass();
                                    C39214FaE.LIZ(tuxTextView, canvas);
                                    return C163246au.LIZJ(createBitmap, (int) (tuxTextView.getMeasuredWidth() * f6), (int) (tuxTextView.getMeasuredHeight() * f6));
                                }
                                o.LJIJI("nodeCallback");
                                throw null;
                            }
                        });
                        return;
                    } else {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                }
                o.LJIJI("nodeCallback");
                throw null;
            }
            this.LJLIL.LJIILIIL(100 * f);
            return;
        }
        C67996QmO c67996QmO2 = this.LJLIL.LJIILJJIL;
        if (c67996QmO2 != null) {
            c67996QmO2.LIZIZ(new C43393H1h("CompileWithCaptionTask", "CompileWithCaptionTask compile watermark video with captions done"), EnumC43531H6p.OUTER);
            C43422H2k c43422H2k2 = this.LJLIL;
            InterfaceC153045zY interfaceC153045zY2 = this.LJLILLLLZI;
            if (interfaceC153045zY2 == null) {
                interfaceC153045zY2 = c43422H2k2.LJIILL;
            }
            c43422H2k2.LJII().LIZLLL().LIZJ();
            C10K.LIZJ(new ACallableS110S0100000_7((Runnable) new ARunnableS43S0100000_7(interfaceC153045zY2, 100), 37));
            C43422H2k c43422H2k3 = this.LJLIL;
            SynthetiseResult synthetiseResult = this.LJLJJI;
            C67996QmO c67996QmO3 = c43422H2k3.LJIILJJIL;
            if (c67996QmO3 != null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("onBiChannelSynthesisFinished result ");
                LIZ.append(synthetiseResult);
                c67996QmO3.LIZIZ(new C43393H1h("CompileWithCaptionTask", X1D.LIZIZ(LIZ)), EnumC43531H6p.OUTER);
                VEWatermarkParam vEWatermarkParam = c43422H2k3.LJII;
                if (vEWatermarkParam != null) {
                    str2 = vEWatermarkParam.extFile;
                } else {
                    str2 = null;
                }
                C43403H1r c43403H1r = c43422H2k3.LJIIJ;
                if (c43403H1r != null) {
                    C39579Fg7.LIZLLL(str2, c43403H1r.LIZ.getLocalTempPath());
                    VEWatermarkParam vEWatermarkParam2 = c43422H2k3.LJII;
                    if (vEWatermarkParam2 != null) {
                        str3 = vEWatermarkParam2.extFile;
                    }
                    C39579Fg7.LJIL(str3);
                    c43422H2k3.LJIJJLI = H3D.EndingWatermarkSynthesis;
                    c43422H2k3.LJIILL(synthetiseResult, false);
                    return;
                }
                o.LJIJI("editModelContainer");
                throw null;
            }
            o.LJIJI("nodeCallback");
            throw null;
        }
        o.LJIJI("nodeCallback");
        throw null;
    }
}

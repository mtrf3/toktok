package Y;

import X.AbstractC07850Sn;
import X.ActivityC45651qj;
import X.C122034qd;
import X.C126354xb;
import X.C133765Mu;
import X.C135215Sj;
import X.C140475fH;
import X.C163186ao;
import X.C163246au;
import X.C16880lQ;
import X.C17N;
import X.C32151Nz;
import X.C38346F3e;
import X.C44172HVg;
import X.C44729Hgz;
import X.C6BI;
import X.C6Q1;
import X.C6Q3;
import X.C6QK;
import X.C76732zl;
import X.C78983UzD;
import X.C7MY;
import X.EnumC122254qz;
import X.EnumC159956Pn;
import X.H78;
import X.HRJ;
import X.InterfaceC1278950f;
import X.InterfaceC162316Yp;
import X.InterfaceC163256av;
import X.InterfaceC88471Ynr;
import X.KL2;
import X.P5A;
import X.W5G;
import X.X1D;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.Pair;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.publish.PublishPreviewModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.shortvideo.ui.VEVideoPublishPreviewActivity;
import com.ss.android.ugc.aweme.shortvideo.ui.VEVideoPublishPreviewScene;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.ss.android.ugc.gamora.editorpro.EditorProScene;
import com.ss.android.ugc.gamora.editorpro.bottom.panel.TTResourcePanelFragment;
import com.ss.android.vesdk.VERecordData;
import com.ss.android.vesdk.VEUtils;
import com.ss.android.vesdk.filterparam.VEAudioSamiFilterParam;
import com.zhiliaoapp.musically.R;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public class ARunnableS6S0400000_2 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            case 5:
                run$5(this);
                return;
            case 6:
                run$6(this);
                return;
            case 7:
                run$7(this);
                return;
            case 8:
                run$8(this);
                return;
            case 9:
                run$9(this);
                return;
            case 10:
                run$10(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        ((W5G) this.l0).setImageDrawable((AbstractC07850Sn) this.l1);
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = ((VideoPublishEditModel) this.l2).multiEditVideoRecordData;
        if (multiEditVideoStatusRecordData != null) {
            if (TextUtils.isEmpty(multiEditVideoStatusRecordData.coverImagePath)) {
                VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) this.l2;
                MultiEditVideoStatusRecordData multiEditVideoStatusRecordData2 = videoPublishEditModel.multiEditVideoRecordData;
                CreativeInfo creativeInfo = videoPublishEditModel.creativeInfo;
                o.LJIIIIZZ(creativeInfo, "model.creativeInfo");
                multiEditVideoStatusRecordData2.coverImagePath = C6BI.LIZJ(creativeInfo);
            }
            Bitmap bitmap = (Bitmap) this.l3;
            String str = ((VideoPublishEditModel) this.l2).multiEditVideoRecordData.coverImagePath;
            o.LJIIIIZZ(str, "model.multiEditVideoRecordData.coverImagePath");
            C6BI.LIZLLL(bitmap, str, null);
            VideoPublishEditModel videoPublishEditModel2 = (VideoPublishEditModel) this.l2;
            PublishPreviewModel publishPreviewModel = videoPublishEditModel2.creativeModel.publishPreviewModel;
            String str2 = videoPublishEditModel2.multiEditVideoRecordData.coverImagePath;
            o.LJIIIIZZ(str2, "model.multiEditVideoRecordData.coverImagePath");
            publishPreviewModel.getClass();
            publishPreviewModel.firstFramePath = str2;
        }
    }

    public final void LIZ$1() {
        int i;
        SurfaceView Jq;
        if (((EditorProScene) this.l0).getDyPreviewContainer().getParent() != null) {
            C76732zl c76732zl = (C76732zl) this.l1;
            InterfaceC1278950f interfaceC1278950f = ((EditorProScene) this.l0).previewPanel;
            if (interfaceC1278950f != null && (Jq = interfaceC1278950f.Jq()) != null) {
                i = Jq.getWidth();
            } else {
                i = 0;
            }
            c76732zl.element = i;
            ((C76732zl) this.l2).element = ((EditorProScene) this.l0).getDyPreviewContainer().getHeight();
            ((InterfaceC88471Ynr) this.l3).invoke(Integer.valueOf(((C76732zl) this.l1).element), Integer.valueOf(((C76732zl) this.l2).element));
        }
    }

    public final void LIZ$2() {
        Bitmap createBitmap;
        float min = (Math.min(((Bitmap) this.l0).getWidth(), ((Bitmap) this.l0).getHeight()) * 1.0f) / 1920.0f;
        float width = ((Bitmap) this.l1).getWidth() * min;
        float height = ((Bitmap) this.l1).getHeight() * min;
        int i = (int) width;
        int width2 = (((Bitmap) this.l0).getWidth() - ((int) KL2.LIZJ(C44172HVg.LIZ, 11.0f))) - i;
        int i2 = (int) height;
        int height2 = (((Bitmap) this.l0).getHeight() - ((int) KL2.LIZJ(C44172HVg.LIZ, 10.5f))) - i2;
        try {
            createBitmap = C163246au.LIZJ((Bitmap) this.l1, i, i2);
        } catch (IllegalArgumentException unused) {
            String LLLZI = C16880lQ.LLLZI(Locale.US, "%s width:%d height:%d waterMaskScaledWidth:%f waterMaskScaledHeight:%f", new Object[]{"ResizeBitmapException", Integer.valueOf(((Bitmap) this.l1).getWidth()), Integer.valueOf(((Bitmap) this.l1).getHeight()), Float.valueOf(width), Float.valueOf(height)});
            C78983UzD.LJIJ((Exception) this.l2, LLLZI);
            H78.LJI(LLLZI);
            try {
                Bitmap bitmap = (Bitmap) this.l1;
                int width3 = bitmap.getWidth();
                int height3 = bitmap.getHeight();
                Matrix matrix = new Matrix();
                matrix.postScale(width / width3, height / height3);
                createBitmap = Bitmap.createBitmap(bitmap, 0, 0, width3, height3, matrix, true);
                bitmap.recycle();
            } catch (IllegalArgumentException unused2) {
                InterfaceC163256av interfaceC163256av = (InterfaceC163256av) this.l3;
                if (interfaceC163256av != null) {
                    interfaceC163256av.getClass();
                    return;
                }
                return;
            }
        }
        Bitmap bitmap2 = (Bitmap) this.l0;
        Bitmap bitmap3 = null;
        if (C163246au.LIZIZ(bitmap2) && C163246au.LIZIZ(createBitmap)) {
            Bitmap createBitmap2 = Bitmap.createBitmap(bitmap2.getWidth(), bitmap2.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap2);
            canvas.drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
            canvas.drawBitmap(createBitmap, width2, height2, (Paint) null);
            canvas.save();
            canvas.restore();
            bitmap3 = createBitmap2;
        }
        ((Bitmap) this.l0).recycle();
        if (C163246au.LIZIZ(createBitmap)) {
            createBitmap.recycle();
        }
        HRJ.LIZ(new ARunnableS21S0200000_2(this, bitmap3, 45));
    }

    public final void LIZ$3() {
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) this.l0;
        int i = (int) (videoPublishEditModel.mVideoCoverStartTm * 1000);
        if (videoPublishEditModel.isUseTimeReverseEffect()) {
            int intValue = ((Number) ((Pair) this.l1).second).intValue();
            Object obj = ((Pair) this.l1).first;
            o.LJIIIIZZ(obj, "playPair.first");
            i = (intValue - ((Number) obj).intValue()) - i;
        }
        int width = ((C163186ao) this.l2).LLJILJIL().getWidth();
        VERecordData vERecordData = (VERecordData) this.l3;
        final C163186ao c163186ao = (C163186ao) this.l2;
        final VideoPublishEditModel videoPublishEditModel2 = (VideoPublishEditModel) this.l0;
        VEUtils.getVideoThumb(vERecordData, i, width, (int) (width / ((((VideoPublishEditModel) this.l0).videoWidth() * 1.0f) / ((VideoPublishEditModel) this.l0).videoHeight())), false, new P5A() { // from class: X.6ZE
            @Override // X.P5A
            public final boolean processFrame(ByteBuffer frame, int i2, int i3, int i4) {
                o.LJIIIZ(frame, "frame");
                Activity activity = C163186ao.this.mActivity;
                if (activity == null) {
                    return false;
                }
                Bitmap createBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
                createBitmap.copyPixelsFromBuffer(frame.position(0));
                Bitmap LIZJ = OUR.LIZJ(videoPublishEditModel2, createBitmap);
                C163186ao.this.LLJILJIL().setImageDrawable(new C1M5(activity.getResources(), LIZJ));
                if (TextUtils.isEmpty(videoPublishEditModel2.multiEditVideoRecordData.coverImagePath)) {
                    VideoPublishEditModel videoPublishEditModel3 = videoPublishEditModel2;
                    MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = videoPublishEditModel3.multiEditVideoRecordData;
                    CreativeInfo creativeInfo = videoPublishEditModel3.creativeInfo;
                    o.LJIIIIZZ(creativeInfo, "mModel.creativeInfo");
                    multiEditVideoStatusRecordData.coverImagePath = C6BI.LIZJ(creativeInfo);
                }
                String str = videoPublishEditModel2.multiEditVideoRecordData.coverImagePath;
                o.LJIIIIZZ(str, "mModel.multiEditVideoRecordData.coverImagePath");
                C6BI.LIZLLL(LIZJ, str, null);
                return false;
            }
        });
    }

    public final void LIZ$4() {
        float measuredWidth;
        float LIZIZ;
        int i = C6Q1.LIZ[((EnumC159956Pn) this.l0).ordinal()];
        if (i != 1) {
            if (i != 2) {
                measuredWidth = 0.0f;
                LIZIZ = 0.0f;
            } else {
                PointF pointF = new PointF(((RectF) this.l1).centerX(), ((RectF) this.l1).top);
                measuredWidth = pointF.x - (((C6QK) this.l2).LJ.getMeasuredWidth() / 2);
                LIZIZ = (pointF.y - ((C6QK) this.l2).LJ.getMeasuredHeight()) - C7MY.LIZIZ(8);
            }
        } else {
            PointF pointF2 = new PointF(((RectF) this.l1).centerX(), ((RectF) this.l1).bottom);
            measuredWidth = pointF2.x - (((C6QK) this.l2).LJ.getMeasuredWidth() / 2);
            LIZIZ = pointF2.y + C7MY.LIZIZ(8);
        }
        ((C6QK) this.l2).LJJII(measuredWidth, LIZIZ, (Integer) this.l3);
    }

    public final void LIZ$5() {
        float measuredWidth;
        float LJIIZILJ;
        int i = C6Q3.LIZ[((EnumC159956Pn) this.l0).ordinal()];
        if (i != 1) {
            if (i != 2) {
                measuredWidth = 0.0f;
                LJIIZILJ = 0.0f;
            } else {
                measuredWidth = ((((View) this.l2).getMeasuredWidth() / 2.0f) + ((int[]) this.l1)[0]) - (((C6QK) this.l3).LJ.getMeasuredWidth() / 2);
                LJIIZILJ = (((int[]) this.l1)[1] - ((C6QK) this.l3).LJ.getMeasuredHeight()) - C32151Nz.LJIIZILJ(8);
            }
        } else {
            measuredWidth = ((((View) this.l2).getMeasuredWidth() / 2.0f) + ((int[]) this.l1)[0]) - (((C6QK) this.l3).LJ.getMeasuredWidth() / 2);
            LJIIZILJ = C32151Nz.LJIIZILJ(8) + ((View) this.l2).getMeasuredHeight() + ((int[]) this.l1)[1];
        }
        ((C6QK) this.l3).LJJII(measuredWidth, LJIIZILJ, null);
    }

    public static final void run$0(ARunnableS6S0400000_2 aRunnableS6S0400000_2) {
        boolean LIZ;
        try {
            aRunnableS6S0400000_2.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS6S0400000_2 aRunnableS6S0400000_2) {
        boolean LIZ;
        try {
            W5G w5g = (W5G) aRunnableS6S0400000_2.l0;
            if (w5g != null) {
                C44729Hgz.LJJJ((ActivityC45651qj) aRunnableS6S0400000_2.l2, w5g, (VideoPublishEditModel) aRunnableS6S0400000_2.l1, (InterfaceC162316Yp) aRunnableS6S0400000_2.l3);
            } else {
                KL2.LIZLLL(R.string.jei, C44172HVg.LIZ);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$10(ARunnableS6S0400000_2 aRunnableS6S0400000_2) {
        boolean LIZ;
        try {
            if (((View) aRunnableS6S0400000_2.l0).getMeasuredHeight() != 0 && ((View) aRunnableS6S0400000_2.l1).getMeasuredHeight() != 0 && ((View) aRunnableS6S0400000_2.l2).getMeasuredHeight() != 0) {
                ((TTResourcePanelFragment) aRunnableS6S0400000_2.l3).hm(((View) aRunnableS6S0400000_2.l2).getMeasuredHeight() + ((View) aRunnableS6S0400000_2.l1).getMeasuredHeight() + ((View) aRunnableS6S0400000_2.l0).getMeasuredHeight());
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS6S0400000_2 aRunnableS6S0400000_2) {
        VEVideoPublishPreviewActivity vEVideoPublishPreviewActivity = (VEVideoPublishPreviewActivity) aRunnableS6S0400000_2.l0;
        NormalTrackTimeStamp normalTrackTimeStamp = (NormalTrackTimeStamp) aRunnableS6S0400000_2.l1;
        View view = (View) aRunnableS6S0400000_2.l2;
        View view2 = (View) aRunnableS6S0400000_2.l3;
        if (vEVideoPublishPreviewActivity.LJLLILLLL == null) {
            return;
        }
        Point LLJILJILJ = vEVideoPublishPreviewActivity.LLJILJILJ(new PointF(normalTrackTimeStamp.getX(), normalTrackTimeStamp.getY()));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) vEVideoPublishPreviewActivity.LJLLILLLL.getLayoutParams();
        view.setX((LLJILJILJ.x + layoutParams.leftMargin) - (view.getWidth() / 2.0f));
        view.setY((LLJILJILJ.y + layoutParams.topMargin) - (view.getHeight() / 2.0f));
        view.setRotation(normalTrackTimeStamp.getRotation());
        float floatValue = vEVideoPublishPreviewActivity.LLJILJILJ(new PointF(normalTrackTimeStamp.getWidth(), normalTrackTimeStamp.getHeight())).x / (normalTrackTimeStamp.getScale().floatValue() * view.getWidth());
        view.setScaleX(normalTrackTimeStamp.getScale().floatValue() * floatValue);
        view.setScaleY(normalTrackTimeStamp.getScale().floatValue() * floatValue);
        view.bringToFront();
        view2.bringToFront();
        vEVideoPublishPreviewActivity.LLILIL();
    }

    public static final void run$3(ARunnableS6S0400000_2 aRunnableS6S0400000_2) {
        VEVideoPublishPreviewScene vEVideoPublishPreviewScene = (VEVideoPublishPreviewScene) aRunnableS6S0400000_2.l0;
        NormalTrackTimeStamp normalTrackTimeStamp = (NormalTrackTimeStamp) aRunnableS6S0400000_2.l1;
        View view = (View) aRunnableS6S0400000_2.l2;
        View view2 = (View) aRunnableS6S0400000_2.l3;
        vEVideoPublishPreviewScene.getClass();
        Point LLLJL = vEVideoPublishPreviewScene.LLLJL(new PointF(normalTrackTimeStamp.getX(), normalTrackTimeStamp.getY()));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) vEVideoPublishPreviewScene.LJLLLL.getLayoutParams();
        view.setX((LLLJL.x + layoutParams.leftMargin) - (view.getMeasuredWidth() / 2.0f));
        view.setY((LLLJL.y + layoutParams.topMargin) - (view.getMeasuredHeight() / 2.0f));
        view.setRotation(normalTrackTimeStamp.getRotation());
        float floatValue = vEVideoPublishPreviewScene.LLLJL(new PointF(normalTrackTimeStamp.getWidth(), normalTrackTimeStamp.getHeight())).x / (normalTrackTimeStamp.getScale().floatValue() * view.getMeasuredWidth());
        view.setScaleX(normalTrackTimeStamp.getScale().floatValue() * floatValue);
        view.setScaleY(normalTrackTimeStamp.getScale().floatValue() * floatValue);
        view.bringToFront();
        view2.bringToFront();
        view.setVisibility(0);
        vEVideoPublishPreviewScene.LLLIIII();
    }

    public static final void run$4(ARunnableS6S0400000_2 aRunnableS6S0400000_2) {
        boolean LIZ;
        try {
            aRunnableS6S0400000_2.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$5(ARunnableS6S0400000_2 aRunnableS6S0400000_2) {
        boolean LIZ;
        try {
            aRunnableS6S0400000_2.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$6(ARunnableS6S0400000_2 aRunnableS6S0400000_2) {
        C140475fH c140475fH = (C140475fH) aRunnableS6S0400000_2.l0;
        VideoPublishEditModel model = (VideoPublishEditModel) aRunnableS6S0400000_2.l1;
        C133765Mu editor = (C133765Mu) aRunnableS6S0400000_2.l2;
        Intent intent = (Intent) aRunnableS6S0400000_2.l3;
        c140475fH.getClass();
        H78.LJI("DraftEditHelper NLEDraftBuilder fetch audio enhance model success");
        o.LJIIIZ(model, "model");
        o.LJIIIZ(editor, "editor");
        VEAudioSamiFilterParam vEAudioSamiFilterParam = new VEAudioSamiFilterParam();
        vEAudioSamiFilterParam.samiType = 2;
        vEAudioSamiFilterParam.samiModelPath = C126354xb.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("\n            {\n                \"name\":\"denoise_v2\",\n                \"version\":\"1.0\",\n                \"config\":{\n                    \"denoisemode\":");
        SettingsManager.LIZLLL().getClass();
        LIZ.append(SettingsManager.LJ("sami_ftgru_denoise_mode", 1));
        LIZ.append(",\n                    \"denoiserate\":1.0\n                }\n            }\n            ");
        vEAudioSamiFilterParam.samiParam = C38346F3e.LJJIJIIJIL(X1D.LIZIZ(LIZ));
        C122034qd LJJI = C17N.LJJI(editor);
        if (LJJI != null) {
            String str = "";
            if (model.audioEnhanceParam.getEnableOriginEnhance()) {
                if (model.isFastImport) {
                    String uuid = LJJI.LJIIJ.LJ().getMainTrack().getUUID();
                    o.LJIIIIZZ(uuid, "editorPro.editor.model.mainTrack.uuid");
                    C135215Sj.LIZ(uuid, LJJI, vEAudioSamiFilterParam);
                } else {
                    Iterator<NLETrack> it = LJJI.LJIIJ.LJ().getTracks().iterator();
                    String str2 = "";
                    while (it.hasNext()) {
                        NLETrack next = it.next();
                        if (o.LJ(next.getExtra("AudioTrackType"), EnumC122254qz.ORIGIN.name())) {
                            str2 = next.getUUID();
                            o.LJIIIIZZ(str2, "track.uuid");
                        }
                    }
                    if (str2.length() > 0) {
                        C135215Sj.LIZ(str2, LJJI, vEAudioSamiFilterParam);
                    }
                }
            }
            if (model.audioEnhanceParam.getEnableMusicEnhance()) {
                Iterator<NLETrack> it2 = LJJI.LJIIJ.LJ().getTracks().iterator();
                while (it2.hasNext()) {
                    NLETrack next2 = it2.next();
                    if (o.LJ(next2.getExtra("AudioTrackType"), EnumC122254qz.BGM.name())) {
                        str = next2.getUUID();
                        o.LJIIIIZZ(str, "track.uuid");
                    }
                }
                if (str.length() > 0) {
                    C135215Sj.LIZ(str, LJJI, vEAudioSamiFilterParam);
                }
            }
            c140475fH.LIZ(intent);
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public static final void run$7(ARunnableS6S0400000_2 aRunnableS6S0400000_2) {
        boolean LIZ;
        try {
            aRunnableS6S0400000_2.LIZ$3();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$8(ARunnableS6S0400000_2 aRunnableS6S0400000_2) {
        boolean LIZ;
        try {
            aRunnableS6S0400000_2.LIZ$4();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$9(ARunnableS6S0400000_2 aRunnableS6S0400000_2) {
        boolean LIZ;
        try {
            aRunnableS6S0400000_2.LIZ$5();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS6S0400000_2(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
    }

    public ARunnableS6S0400000_2(C140475fH c140475fH, VideoPublishEditModel videoPublishEditModel, C133765Mu c133765Mu, Context context, Intent intent, int i) {
        this.$t = i;
        this.l0 = c140475fH;
        this.l1 = videoPublishEditModel;
        this.l2 = c133765Mu;
        this.l3 = intent;
    }
}

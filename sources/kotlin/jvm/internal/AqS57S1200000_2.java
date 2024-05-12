package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.ActivityC45651qj;
import X.C131135Cr;
import X.C131935Ft;
import X.C137805ay;
import X.C139825eE;
import X.C145995oB;
import X.C43045Guv;
import X.C47918IrK;
import X.C55O;
import X.C5DY;
import X.C5QW;
import X.C60903NvH;
import X.C76800UCe;
import X.C78915Uy7;
import X.C78920UyC;
import X.FMX;
import X.InterfaceC173266r4;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import X.ProgressDialogC43239Gy3;
import X.WHL;
import X.X1D;
import X.XA5;
import X.XKX;
import android.app.Activity;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.tools.music.music.vertical.VerticalMusicView;
import com.ss.ugc.android.editor.core.EditorProContext;
import com.zhiliaoapp.musically.R;

/* loaded from: classes3.dex */
public class AqS57S1200000_2 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS57S1200000_2 aqS57S1200000_2) {
        C43045Guv.LIZLLL(new AqS68S1200000_15((MusicModel) aqS57S1200000_2.l1, (VerticalMusicView) aqS57S1200000_2.l2, aqS57S1200000_2.s0, 0), 0L);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS57S1200000_2 aqS57S1200000_2) {
        if (!((C137805ay) aqS57S1200000_2.l1).LJLJL) {
            ((InterfaceC88472Yns) aqS57S1200000_2.l2).invoke(Boolean.FALSE);
            if (!C47918IrK.LIZ(C60903NvH.LJ)) {
                ActivityC45651qj activityC45651qj = ((C137805ay) aqS57S1200000_2.l1).LJLIL;
                if (activityC45651qj != null) {
                    C78920UyC.LIZLLL(R.string.e45, activityC45651qj, 6001);
                }
            } else {
                CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                String str = aqS57S1200000_2.s0;
                if (str == null || TextUtils.isEmpty(str)) {
                    creativeToastBuilder.messageRes(R.string.s6k);
                } else {
                    creativeToastBuilder.message(aqS57S1200000_2.s0);
                }
                ActivityC45651qj activityC45651qj2 = ((C137805ay) aqS57S1200000_2.l1).LJLIL;
                if (activityC45651qj2 != null) {
                    C78915Uy7.LJJIIZI(activityC45651qj2, 1041, creativeToastBuilder);
                }
            }
            ProgressDialogC43239Gy3 progressDialogC43239Gy3 = ((C137805ay) aqS57S1200000_2.l1).LJLJJL;
            if (progressDialogC43239Gy3 != null) {
                progressDialogC43239Gy3.dismiss();
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS57S1200000_2 aqS57S1200000_2) {
        C139825eE c139825eE = new C139825eE((Activity) aqS57S1200000_2.l1);
        c139825eE.LIZIZ((View) aqS57S1200000_2.l2);
        c139825eE.LJI(WHL.START);
        c139825eE.LIZ.LJII = 3000L;
        c139825eE.LJIIL(aqS57S1200000_2.s0);
        c139825eE.LIZJ().show();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS57S1200000_2 aqS57S1200000_2) {
        C55O c55o = (C55O) aqS57S1200000_2.l1;
        String path = aqS57S1200000_2.s0;
        InterfaceC88472Yns callback = (InterfaceC88472Yns) aqS57S1200000_2.l2;
        c55o.getClass();
        o.LJIIIZ(path, "path");
        o.LJIIIZ(callback, "callback");
        XKX.LIZLLL(c55o.LIZIZ, null, null, new C131135Cr(path, c55o, callback, null), 3);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [X.6r0] */
    public static final Object invoke$4(AqS57S1200000_2 aqS57S1200000_2) {
        try {
            String str = aqS57S1200000_2.s0;
            final Bitmap bitmap = (Bitmap) aqS57S1200000_2.l2;
            XA5.LIZIZ(str, new InterfaceC173266r4() { // from class: X.6r0
                /* JADX WARN: Code restructure failed: missing block: B:28:0x003d, code lost:
                
                    if (0 != 0) goto L23;
                 */
                @Override // X.InterfaceC173266r4
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final boolean LIZ(java.io.File r5) {
                    /*
                        r4 = this;
                        java.lang.String r0 = "file"
                        kotlin.jvm.internal.o.LJIIIZ(r5, r0)
                        android.graphics.Bitmap r3 = r1
                        android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.JPEG
                        java.lang.String r0 = "format"
                        kotlin.jvm.internal.o.LJIIIZ(r2, r0)
                        if (r3 == 0) goto L42
                        java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
                        r1.<init>()
                        r0 = 100
                        r3.compress(r2, r0, r1)
                        byte[] r2 = r1.toByteArray()
                        java.lang.String r0 = "baos.toByteArray()"
                        kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)
                        r0 = 0
                        java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3d
                        r1.<init>(r5)     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3d
                        r1.write(r2)     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L39
                        r1.flush()     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L39
                        r1.close()     // Catch: java.io.IOException -> L44
                        goto L44
                    L34:
                        r0 = move-exception
                        r1.close()     // Catch: java.io.IOException -> L3c
                        goto L3c
                    L39:
                        r0 = r1
                        goto L3f
                    L3b:
                        r0 = move-exception
                    L3c:
                        throw r0
                    L3d:
                        if (r0 == 0) goto L42
                    L3f:
                        r0.close()     // Catch: java.io.IOException -> L42
                    L42:
                        r0 = 0
                        goto L45
                    L44:
                        r0 = 1
                    L45:
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C173226r0.LIZ(java.io.File):boolean");
                }
            });
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("success to obtain bitmap with ");
            LIZ.append((C5DY) aqS57S1200000_2.l1);
            C131935Ft.LIZIZ("VideoFrameCache", X1D.LIZIZ(LIZ));
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("Disk cache exception ");
            LIZ2.append(e.getMessage());
            C131935Ft.LIZLLL("VideoFrameCache", X1D.LIZIZ(LIZ2));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(AqS57S1200000_2 aqS57S1200000_2) {
        C145995oB LJFF = C5QW.LJFF((VideoPublishEditModel) aqS57S1200000_2.l1, (EditorProContext) aqS57S1200000_2.l2);
        LJFF.LJI("crop_type", aqS57S1200000_2.s0);
        FMX.LJIIL("click_crop_video_change", LJFF.LIZ);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(AqS57S1200000_2 aqS57S1200000_2) {
        C145995oB LJFF = C5QW.LJFF((VideoPublishEditModel) aqS57S1200000_2.l1, (EditorProContext) aqS57S1200000_2.l2);
        LJFF.LJI("click_type", aqS57S1200000_2.s0);
        FMX.LJIIL("switch_button_click", LJFF.LIZ);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS57S1200000_2(C55O c55o, C55O c55o2, String str, InterfaceC88472Yns<? super Bitmap, C76800UCe> interfaceC88472Yns) {
        super(0);
        this.$t = interfaceC88472Yns;
        this.l1 = c55o;
        this.s0 = c55o2;
        this.l2 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS57S1200000_2(C137805ay c137805ay, C137805ay c137805ay2, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns, String str) {
        super(0);
        this.$t = str;
        this.l1 = c137805ay;
        this.l2 = c137805ay2;
        this.s0 = interfaceC88472Yns;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS57S1200000_2(Activity activity, View view, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = activity;
        this.l2 = view;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS57S1200000_2(VideoPublishEditModel videoPublishEditModel, EditorProContext editorProContext, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = videoPublishEditModel;
        this.l2 = editorProContext;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS57S1200000_2(MusicModel musicModel, VerticalMusicView verticalMusicView, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = musicModel;
        this.l2 = verticalMusicView;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS57S1200000_2(String str, C5DY c5dy, Bitmap bitmap, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = c5dy;
        this.l2 = bitmap;
    }
}

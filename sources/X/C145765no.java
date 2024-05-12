package X;

import android.content.Context;
import android.os.HandlerThread;
import com.bytedance.ies.cutsame.prepare.VEConfig;
import com.bytedance.ies.cutsame.util.MediaUtil;
import com.ss.android.vesdk.VEEditor;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import java.io.File;
import kotlin.jvm.internal.o;

/* renamed from: X.5no, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C145765no {
    public static VEEditor LIZ;
    public static final HandlerThread LIZIZ;

    static {
        HandlerThread handlerThread = new HandlerThread("ve-async-utils");
        handlerThread.start();
        LIZIZ = handlerThread;
    }

    public static void LIZ(Context context, String inputPath, int i, int i2, C5KT c5kt, String outputPath) {
        String str;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(inputPath, "inputPath");
        o.LJIIIZ(outputPath, "outputPath");
        if (c5kt != null) {
            c5kt.LJI(new C5KU(inputPath, outputPath, c5kt, null));
            c5kt.onProgress(C78841Uwv.LIZ(System.currentTimeMillis()).nextInt(90) / 100.0f);
        }
        try {
            OSZ LIZ2 = C45272Hpk.LIZ(context, inputPath, Math.max(i, i2), outputPath);
            if (c5kt != null) {
                if (((Number) LIZ2.getFirst()).intValue() > 0 && ((Number) LIZ2.getSecond()).intValue() > 0) {
                    str = outputPath;
                    c5kt.LJFF(inputPath, str);
                }
                str = inputPath;
                c5kt.LJFF(inputPath, str);
            }
        } catch (Throwable th) {
            if (c5kt == null) {
                return;
            }
            c5kt.LIZ(inputPath, outputPath, String.valueOf(th.getMessage()));
        }
    }

    public static void LIZIZ(int i, int i2, Context context, C5KT c5kt, String inputPath, String outputPath, String workSpacePath, int[] iArr, int[] iArr2) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(inputPath, "inputPath");
        o.LJIIIZ(outputPath, "outputPath");
        o.LJIIIZ(workSpacePath, "workSpacePath");
        XKX.LIZLLL(C780334l.LJLIL, C78613UtF.LIZJ, null, new C5KP(context, inputPath, i, i2, c5kt, outputPath, workSpacePath, null, iArr, iArr2, null), 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static VEEditor LIZJ(int i, int i2, Context context, final C5KT c5kt, Integer num, final String inputPath, final String outputPath, String workSpacePath, int[] iArr, int[] iArr2) {
        int i3;
        int i4;
        int intValue;
        C87278YNe c87278YNe;
        VEEditor vEEditor;
        int[] iArr3 = iArr2;
        int[] iArr4 = iArr;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(inputPath, "inputPath");
        o.LJIIIZ(outputPath, "outputPath");
        o.LJIIIZ(workSpacePath, "workSpacePath");
        final VEEditor vEEditor2 = new VEEditor(workSpacePath);
        MediaUtil mediaUtil = MediaUtil.LIZ;
        C145725nk LIZ2 = mediaUtil.LIZ(context, inputPath);
        if (LIZ2.LJLJJI % 180 != 0) {
            i3 = LIZ2.LJLJI;
            i4 = LIZ2.LJLILLLLZI;
        } else {
            i3 = LIZ2.LJLILLLLZI;
            i4 = LIZ2.LJLJI;
        }
        float f = i3;
        float f2 = i / f;
        float f3 = i4;
        float f4 = i2 / f3;
        if (f2 > f4) {
            f2 = f4;
        }
        int i5 = (int) (f * f2);
        int i6 = (int) (f3 * f2);
        String[] strArr = {inputPath};
        if (iArr4 == null) {
            iArr4 = new int[]{0};
        }
        if (iArr3 == null) {
            iArr3 = new int[]{-1};
        }
        int LJJII = vEEditor2.LJJII(strArr, iArr4, iArr3, null, null, null, null, null, null, null, C5NI.VIDEO_OUT_RATIO_ORIGINAL);
        if (LJJII != 0) {
            vEEditor2.LJIILIIL();
            if (c5kt != null) {
                c5kt.LIZ(inputPath, "", o.LJIILLIIL(Integer.valueOf(LJJII), "init ve fail code is "));
            }
            return vEEditor2;
        }
        final C5KU c5ku = new C5KU(inputPath, outputPath, c5kt, vEEditor2);
        if (c5kt != null) {
            c5kt.LJI(c5ku);
        }
        VEConfig vEConfig = C44618HfC.LIZ;
        int i7 = mediaUtil.LIZ(context, inputPath).LJLJJLL;
        if (num == null) {
            intValue = vEConfig.bpsGenerator.invoke(1).intValue();
        } else {
            intValue = num.intValue();
        }
        if (i7 <= intValue) {
            i7 = intValue;
        }
        if (vEConfig.hardware) {
            c87278YNe = new C87278YNe(2);
            c87278YNe.LIZIZ.isSupportHWEncoder = true;
            c87278YNe.LJII(vEConfig.fps);
            int i8 = vEConfig.gopSize;
            VEVideoEncodeSettings vEVideoEncodeSettings = c87278YNe.LIZIZ;
            vEVideoEncodeSettings.gopSize = i8;
            vEVideoEncodeSettings.bitrateMode = VEVideoEncodeSettings.ENCODE_BITRATE_MODE.ENCODE_BITRATE_ABR;
            vEVideoEncodeSettings.bps = i7;
            c87278YNe.LJI(C44618HfC.LIZ());
            vEEditor = vEVideoEncodeSettings;
            vEEditor = vEVideoEncodeSettings;
            if (i5 != 0 && i6 != 0) {
                c87278YNe.LJIIJ(i5, i6);
                vEEditor = vEVideoEncodeSettings;
            }
        } else {
            c87278YNe = new C87278YNe(2);
            c87278YNe.LIZIZ.isSupportHWEncoder = false;
            c87278YNe.LJII(vEConfig.fps);
            c87278YNe.LIZIZ.gopSize = vEConfig.gopSize;
            c87278YNe.LJIIIIZZ(15);
            VEVideoEncodeSettings vEVideoEncodeSettings2 = c87278YNe.LIZIZ;
            vEVideoEncodeSettings2.enableRemuxVideo = false;
            c87278YNe.LJI(C44618HfC.LIZ());
            vEEditor = vEVideoEncodeSettings2;
            vEEditor = vEVideoEncodeSettings2;
            if (i5 != 0 && i6 != 0) {
                c87278YNe.LJIIJ(i5, i6);
                vEEditor = vEVideoEncodeSettings2;
            }
        }
        vEEditor2.LJJIJLIJ(LIZIZ.getLooper());
        synchronized (vEEditor2) {
            try {
                try {
                    if (!c5ku.LJ) {
                        final String LJIILLIIL = o.LJIILLIIL(".tmp", outputPath);
                        boolean LJIIJ = vEEditor2.LJIIJ(LJIILLIIL, null, c87278YNe.LIZ(), new InterfaceC134045Nw() { // from class: X.5KS
                            @Override // X.InterfaceC134045Nw
                            public final void onCompileDone() {
                                if (c5ku.LJ) {
                                    C152275yJ c152275yJ = C152275yJ.LIZ;
                                    File file = new File(LJIILLIIL);
                                    c152275yJ.getClass();
                                    C152275yJ.LJIIIIZZ(file);
                                } else {
                                    new File(LJIILLIIL).renameTo(new File(outputPath));
                                    C5KT c5kt2 = C5KT.this;
                                    if (c5kt2 != null) {
                                        c5kt2.LJFF(inputPath, outputPath);
                                    }
                                    vEEditor2.LJJIJLIJ(null);
                                }
                                XKX.LIZLLL(C780334l.LJLIL, C78613UtF.LIZJ, null, new C5KR(vEEditor2, null), 2);
                            }

                            @Override // X.InterfaceC134045Nw
                            public final void onCompileProgress(float f5) {
                                C5KT c5kt2 = C5KT.this;
                                if (c5kt2 == null) {
                                    return;
                                }
                                c5kt2.onProgress(f5);
                            }

                            @Override // X.InterfaceC134045Nw
                            public final void onCompileError(int i9, int i10, float f5, String str) {
                                C152275yJ c152275yJ = C152275yJ.LIZ;
                                File file = new File(LJIILLIIL);
                                c152275yJ.getClass();
                                C152275yJ.LJIIIIZZ(file);
                                C5KT c5kt2 = C5KT.this;
                                if (c5kt2 != null) {
                                    String str2 = inputPath;
                                    String str3 = outputPath;
                                    StringBuilder LIZ3 = X1D.LIZ();
                                    LIZ3.append(i9);
                                    LIZ3.append('_');
                                    LIZ3.append(i10);
                                    c5kt2.LIZ(str2, str3, X1D.LIZIZ(LIZ3));
                                }
                                vEEditor2.LJJIJLIJ(null);
                                XKX.LIZLLL(C780334l.LJLIL, C78613UtF.LIZJ, null, new C5KQ(vEEditor2, null), 2);
                            }
                        });
                        if (!LJIIJ) {
                            if (c5kt != null) {
                                c5kt.LIZ(inputPath, outputPath, "-1");
                            }
                            vEEditor2.LJJIJLIJ(null);
                            vEEditor2.LJIILIIL();
                        }
                        return vEEditor2;
                    }
                    vEEditor2.LJIILIIL();
                    return vEEditor2;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                vEEditor = vEEditor2;
            }
        }
    }
}

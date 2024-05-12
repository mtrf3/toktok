package X;

import com.ss.android.ugc.aweme.property.bytebench.NowVQByteBenchStrategy;

/* renamed from: X.HhA, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44740HhA implements InterfaceC44798Hi6 {
    public static final /* synthetic */ C44740HhA LJIILJJIL = new C44740HhA();
    public static final NowVQByteBenchStrategy LJIILL;

    static {
        NowVQByteBenchStrategy nowVQByteBenchStrategy;
        InterfaceC09240Xw LIZIZ = C09580Ze.LIZJ().LIZIZ(EF7.LJIIIZ);
        if (LIZIZ != null) {
            nowVQByteBenchStrategy = (NowVQByteBenchStrategy) LIZIZ.LJIILJJIL(NowVQByteBenchStrategy.class);
        } else {
            nowVQByteBenchStrategy = null;
        }
        LJIILL = nowVQByteBenchStrategy;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.vesdk.VESize LIZ() {
        /*
            com.ss.android.ugc.aweme.property.bytebench.NowVQByteBenchStrategy r0 = X.C44740HhA.LJIILL
            r3 = 0
            if (r0 == 0) goto L65
            java.lang.String r1 = r0.getNowTakePictureSize()
            if (r1 == 0) goto L65
            boolean r0 = X.C79234V7u.LJJI(r1)
            if (r0 == 0) goto L65
            X.HhA r0 = X.C44740HhA.LJIILJJIL
            boolean r0 = r0.enableSplitConfig()
            if (r0 == 0) goto L65
        L19:
            int r0 = r1.length()
            if (r0 != 0) goto L42
        L1f:
            r0 = r3
        L20:
            com.ss.android.vesdk.VESize r0 = (com.ss.android.vesdk.VESize) r0
            if (r0 == 0) goto L30
            com.ss.android.vesdk.VESize r3 = new com.ss.android.vesdk.VESize
            int r2 = r0.width
            float r1 = (float) r2
            r0 = 1061158912(0x3f400000, float:0.75)
            float r1 = r1 / r0
            int r0 = (int) r1
            r3.<init>(r2, r0)
        L30:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "NowVQByteBenchApi ; picture_size : "
            r1.<init>(r0)
            r1.append(r3)
            java.lang.String r0 = r1.toString()
            X.C5Z5.LIZIZ(r0)
            return r3
        L42:
            X.HEe r0 = X.C60903NvH.LJIIJJI()     // Catch: java.lang.Exception -> L51
            com.google.gson.Gson r2 = r0.LIZ()     // Catch: java.lang.Exception -> L51
            java.lang.Class<com.ss.android.vesdk.VESize> r0 = com.ss.android.vesdk.VESize.class
            java.lang.Object r0 = r2.LJI(r1, r0)     // Catch: java.lang.Exception -> L51
            goto L20
        L51:
            java.lang.StringBuilder r2 = X.X1D.LIZ()
            java.lang.String r0 = "Json AB ConfigError， Config:"
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = X.X1D.LIZIZ(r2)
            X.H78.LIZJ(r0)
            goto L1f
        L65:
            java.lang.StringBuilder r2 = X.X1D.LIZ()
            java.lang.String r0 = "NowVQByteBenchApi ; now_ve_take_picture_size : "
            r2.append(r0)
            java.lang.String r1 = ""
            r2.append(r1)
            java.lang.String r0 = X.X1D.LIZIZ(r2)
            X.C5Z5.LIZIZ(r0)
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C44740HhA.LIZ():com.ss.android.vesdk.VESize");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0082, code lost:
    
        if (r3 != null) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.asve.context.PreviewSize LIZIZ() {
        /*
            com.ss.android.ugc.aweme.property.bytebench.NowVQByteBenchStrategy r0 = X.C44740HhA.LJIILL
            r2 = 0
            if (r0 == 0) goto L6b
            java.lang.String r3 = r0.sourcePreviewSize()
            if (r3 == 0) goto L6b
            boolean r0 = X.C79234V7u.LJJI(r3)
            if (r0 == 0) goto L6b
            X.HhA r0 = X.C44740HhA.LJIILJJIL
            boolean r0 = r0.enableSplitConfig()
            if (r0 == 0) goto L6b
        L19:
            int r0 = r3.length()
            if (r0 != 0) goto L48
        L1f:
            r0 = r2
        L20:
            com.ss.android.ugc.asve.context.PreviewSize r0 = (com.ss.android.ugc.asve.context.PreviewSize) r0
            if (r0 == 0) goto L36
            com.ss.android.ugc.asve.context.PreviewSize r2 = new com.ss.android.ugc.asve.context.PreviewSize
            int r3 = r0.getWidth()
            int r0 = r0.getWidth()
            float r1 = (float) r0
            r0 = 1061158912(0x3f400000, float:0.75)
            float r1 = r1 / r0
            int r0 = (int) r1
            r2.<init>(r3, r0)
        L36:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "NowVQByteBenchApi ; previewSize : "
            r1.<init>(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            X.C5Z5.LIZIZ(r0)
            return r2
        L48:
            X.HEe r0 = X.C60903NvH.LJIIJJI()     // Catch: java.lang.Exception -> L57
            com.google.gson.Gson r1 = r0.LIZ()     // Catch: java.lang.Exception -> L57
            java.lang.Class<com.ss.android.ugc.asve.context.PreviewSize> r0 = com.ss.android.ugc.asve.context.PreviewSize.class
            java.lang.Object r0 = r1.LJI(r3, r0)     // Catch: java.lang.Exception -> L57
            goto L20
        L57:
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "Json AB ConfigError， Config:"
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.H78.LIZJ(r0)
            goto L1f
        L6b:
            java.lang.String r3 = X.C44744HhE.LIZ()
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "NowVQByteBenchApi ; now_ve_camera_preview_size : "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.C5Z5.LIZIZ(r0)
            if (r3 == 0) goto L1f
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C44740HhA.LIZIZ():com.ss.android.ugc.asve.context.PreviewSize");
    }

    public final String compileExternalSetting() {
        String compileExternalSetting;
        NowVQByteBenchStrategy nowVQByteBenchStrategy = LJIILL;
        if (nowVQByteBenchStrategy != null && (compileExternalSetting = nowVQByteBenchStrategy.compileExternalSetting()) != null && C79234V7u.LJJI(compileExternalSetting) && LJIILJJIL.enableSplitConfig()) {
            return compileExternalSetting;
        }
        String LIZ = C44754HhO.LIZ();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("NowVQByteBenchApi ; now_ve_synthesis_settings : ");
        LIZ2.append(LIZ);
        C5Z5.LIZIZ(X1D.LIZIZ(LIZ2));
        return LIZ;
    }

    public final int compileVideoSizeIndex() {
        NowVQByteBenchStrategy nowVQByteBenchStrategy = LJIILL;
        if (nowVQByteBenchStrategy != null) {
            Integer valueOf = Integer.valueOf(nowVQByteBenchStrategy.compileVideoSizeIndex());
            if (C79234V7u.LJJI(Integer.valueOf(valueOf.intValue())) && LJIILJJIL.enableSplitConfig()) {
                return valueOf.intValue();
            }
        }
        Integer valueOf2 = Integer.valueOf(C44743HhD.LIZ());
        int intValue = valueOf2.intValue();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NowVQByteBenchApi ; now_compile_video_size_index : ");
        LIZ.append(intValue);
        C5Z5.LIZIZ(X1D.LIZIZ(LIZ));
        return valueOf2.intValue();
    }

    public final boolean enableSplitConfig() {
        NowVQByteBenchStrategy nowVQByteBenchStrategy = LJIILL;
        if (nowVQByteBenchStrategy != null) {
            return nowVQByteBenchStrategy.enableSplitConfig();
        }
        return false;
    }

    public final int recordVideoEncodeSizeIndex() {
        NowVQByteBenchStrategy nowVQByteBenchStrategy = LJIILL;
        C44740HhA c44740HhA = LJIILJJIL;
        if (nowVQByteBenchStrategy != null) {
            Integer valueOf = Integer.valueOf(nowVQByteBenchStrategy.recordVideoEncodeSizeIndex());
            if (C79234V7u.LJJI(Integer.valueOf(valueOf.intValue())) && c44740HhA.enableSplitConfig()) {
                return valueOf.intValue();
            }
        }
        Integer valueOf2 = Integer.valueOf(c44740HhA.sourceVideoSizeIndex());
        int intValue = valueOf2.intValue();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NowVQByteBenchApi ; now_video_encode_size_index : ");
        LIZ.append(intValue);
        C5Z5.LIZIZ(X1D.LIZIZ(LIZ));
        return valueOf2.intValue();
    }

    public final int shotScreenEncodeSizeIndex() {
        NowVQByteBenchStrategy nowVQByteBenchStrategy = LJIILL;
        C44740HhA c44740HhA = LJIILJJIL;
        if (nowVQByteBenchStrategy != null) {
            Integer valueOf = Integer.valueOf(nowVQByteBenchStrategy.shotScreenEncodeSizeIndex());
            if (C79234V7u.LJJI(Integer.valueOf(valueOf.intValue())) && c44740HhA.enableSplitConfig()) {
                return valueOf.intValue();
            }
        }
        Integer valueOf2 = Integer.valueOf(c44740HhA.recordVideoEncodeSizeIndex());
        int intValue = valueOf2.intValue();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NowVQByteBenchApi ; now_shot_screen_encode_size_index : ");
        LIZ.append(intValue);
        C5Z5.LIZIZ(X1D.LIZIZ(LIZ));
        return valueOf2.intValue();
    }

    public final float sourceBitrateFactor() {
        NowVQByteBenchStrategy nowVQByteBenchStrategy = LJIILL;
        if (nowVQByteBenchStrategy != null) {
            Float valueOf = Float.valueOf(nowVQByteBenchStrategy.sourceBitrateFactor());
            if (C79234V7u.LJJI(Float.valueOf(valueOf.floatValue())) && LJIILJJIL.enableSplitConfig()) {
                return valueOf.floatValue();
            }
        }
        Float valueOf2 = Float.valueOf(C44748HhI.LIZ());
        float floatValue = valueOf2.floatValue();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NowVQByteBenchApi ; now_video_bitrate : ");
        LIZ.append(floatValue);
        C5Z5.LIZIZ(X1D.LIZIZ(LIZ));
        return valueOf2.floatValue();
    }

    public final int sourceVideoSizeIndex() {
        NowVQByteBenchStrategy nowVQByteBenchStrategy = LJIILL;
        if (nowVQByteBenchStrategy != null) {
            Integer valueOf = Integer.valueOf(nowVQByteBenchStrategy.sourceVideoSizeIndex());
            if (C79234V7u.LJJI(Integer.valueOf(valueOf.intValue())) && LJIILJJIL.enableSplitConfig()) {
                return valueOf.intValue();
            }
        }
        Integer valueOf2 = Integer.valueOf(C44742HhC.LIZ());
        int intValue = valueOf2.intValue();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NowVQByteBenchApi ; now_video_size_index : ");
        LIZ.append(intValue);
        C5Z5.LIZIZ(X1D.LIZIZ(LIZ));
        return valueOf2.intValue();
    }
}

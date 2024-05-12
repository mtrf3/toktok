package X;

import com.ss.android.ugc.aweme.plugin.IPluginService;

/* renamed from: X.E4n, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35833E4n implements E4G {
    public static final /* synthetic */ int LIZLLL = 0;
    public final EnumC35839E4t LIZ;
    public final IPluginService.PluginData LIZIZ;
    public final C62822Ol8 LIZJ = C221108m2.LIZIZ(C35834E4o.LJLIL);

    @Override // X.E4G
    public final int LIZ() {
        Integer num = this.LIZIZ.instanceId;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0079, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L24;
     */
    @Override // X.E4G
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.plugin.IPluginService.PluginDataWrapper getValue() {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.plugin.IPluginService$PluginData r0 = r4.LIZIZ
            com.ss.android.ugc.aweme.plugin.IPluginService$AutoExposureConfig r0 = r0.autoExposureConfig
            if (r0 == 0) goto La
            com.ss.android.ugc.aweme.plugin.IPluginService$AutoExposureConfig$ExposureType r0 = r0.exposureType
            if (r0 != 0) goto Lf
        La:
            com.ss.android.ugc.aweme.plugin.IPluginService$PluginData r0 = r4.LIZIZ
            com.ss.android.ugc.aweme.plugin.IPluginService$PluginDataWrapper r0 = r0.configData
            return r0
        Lf:
            int[] r1 = X.C35835E4p.LIZ
            int r0 = r0.ordinal()
            r1 = r1[r0]
            r3 = 1
            if (r1 == r3) goto L1e
            r0 = 2
            if (r1 == r0) goto L1e
            goto La
        L1e:
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            com.ss.android.ugc.aweme.plugin.IPluginService$PluginData r0 = r4.LIZIZ
            int r0 = r0.id
            r1.append(r0)
            r0 = 58
            r1.append(r0)
            com.ss.android.ugc.aweme.plugin.IPluginService$PluginData r0 = r4.LIZIZ
            java.lang.Integer r0 = r0.instanceId
            r1.append(r0)
            java.lang.String r2 = X.X1D.LIZIZ(r1)
            X.Ol8 r0 = r4.LIZJ
            java.lang.Object r1 = r0.getValue()
            com.bytedance.keva.Keva r1 = (com.bytedance.keva.Keva) r1
            r0 = 0
            boolean r0 = r1.getBoolean(r2, r0)
            if (r0 != 0) goto La
            X.Ol8 r0 = r4.LIZJ
            java.lang.Object r0 = r0.getValue()
            com.bytedance.keva.Keva r0 = (com.bytedance.keva.Keva) r0
            r0.storeBoolean(r2, r3)
            com.ss.android.ugc.aweme.plugin.IPluginService$PluginData r0 = r4.LIZIZ
            java.lang.String r1 = r0.abExposeVid
            if (r1 == 0) goto L63
            X.FH5 r0 = X.FH5.LIZIZ()
            r0.getClass()
            X.FH5.LIZ(r1)
        L63:
            com.ss.android.ugc.aweme.plugin.IPluginService$PluginData r0 = r4.LIZIZ
            com.ss.android.ugc.aweme.plugin.IPluginService$AutoExposureConfig r0 = r0.autoExposureConfig
            if (r0 == 0) goto L7b
            java.lang.String r1 = r0.preciseExposureVid
            if (r1 == 0) goto L7b
            X.FH5 r0 = X.FH5.LIZIZ()
            r0.getClass()
            X.FH5.LIZ(r1)
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != 0) goto La
        L7b:
            X.7au r2 = new X.7au
            r2.<init>()
            com.ss.android.ugc.aweme.plugin.IPluginService$PluginData r0 = r4.LIZIZ
            int r1 = r0.id
            java.lang.String r0 = "id"
            r2.LIZLLL(r1, r0)
            com.ss.android.ugc.aweme.plugin.IPluginService$PluginData r0 = r4.LIZIZ
            java.lang.Integer r1 = r0.instanceId
            java.lang.String r0 = "instance"
            r2.LJFF(r1, r0)
            java.util.Map<java.lang.String, java.lang.String> r1 = r2.LIZ
            java.lang.String r0 = "autoexpose_error"
            X.FMX.LJIIL(r0, r1)
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35833E4n.getValue():com.ss.android.ugc.aweme.plugin.IPluginService$PluginDataWrapper");
    }

    @Override // X.E4G
    public final EnumC35839E4t getType() {
        return this.LIZ;
    }

    public C35833E4n(EnumC35839E4t enumC35839E4t, IPluginService.PluginData pluginData) {
        this.LIZ = enumC35839E4t;
        this.LIZIZ = pluginData;
    }
}

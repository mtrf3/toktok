package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.creative.compileConfig.VEVideoEncodeConfigParams;
import kotlin.jvm.internal.o;

/* renamed from: X.HeH, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44561HeH extends AbstractC44652Hfk<VEVideoEncodeConfigParams> {
    public final C44537Hdt LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final int LJ;

    @Override // X.InterfaceC44653Hfl
    public final String LIZ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC44653Hfl
    public final String getName() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC44653Hfl
    public final int getPriority() {
        return this.LJ;
    }

    @Override // X.AbstractC44652Hfk
    public final void LIZIZ(VEVideoEncodeConfigParams vEVideoEncodeConfigParams) {
        String LIZ;
        VEVideoEncodeConfigParams vEVideoEncodeConfigParams2 = vEVideoEncodeConfigParams;
        C44537Hdt c44537Hdt = this.LIZIZ;
        C44560HeG c44560HeG = c44537Hdt.LIZIZ.LJ;
        o.LJIIIZ(c44537Hdt.LIZ, "<this>");
        c44560HeG.LIZ = C44758HhS.LIZ();
        SettingsManager.LIZLLL().getClass();
        vEVideoEncodeConfigParams2.setGopSize(SettingsManager.LJ("synthetic_video_gop", 35));
        if (C44756HhQ.LIZ() && C44755HhP.LIZ().length() > 0) {
            LIZ = C44755HhP.LIZ();
        } else {
            LIZ = C44568HeO.LIZ();
        }
        if (C44758HhS.LIZ() && !this.LIZIZ.LIZ()) {
            LIZ = C44568HeO.LIZ();
        }
        if (this.LIZIZ.LIZ.isPhotoMvMode && LIZ.length() > 0) {
            this.LIZIZ.LIZIZ.LJ.LJI = false;
        } else if (H7R.LJJJLL(this.LIZIZ.LIZ)) {
            int[] LJJJJZI = C44729Hgz.LJJJJZI(this.LIZIZ.LIZ);
            if (Math.min(LJJJJZI[0], LJJJJZI[1]) >= 1080 && !C79004UzY.LJJIJL(this.LIZIZ.LIZ.canvasVideoData)) {
                LIZ = H7R.LJIILJJIL(this.LIZIZ.LIZ);
                if (LIZ.length() <= 0) {
                    LIZ = H7R.LJJI(this.LIZIZ.LIZ);
                }
            } else {
                LIZ = H7R.LJJI(this.LIZIZ.LIZ);
            }
        } else if (this.LIZIZ.LIZ()) {
            LIZ = H7R.LJIILJJIL(this.LIZIZ.LIZ);
        } else {
            LIZ = H7R.LJJI(this.LIZIZ.LIZ);
        }
        vEVideoEncodeConfigParams2.setExternalSettingsJsonStr(LIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44561HeH(InterfaceC44653Hfl strategy, C44537Hdt initParams) {
        super(strategy);
        C44578HeY c44578HeY = C44578HeY.LIZ;
        String name = c44578HeY.key;
        int i = c44578HeY.priority;
        o.LJIIIZ(strategy, "strategy");
        o.LJIIIZ(initParams, "initParams");
        o.LJIIIZ(name, "name");
        this.LIZIZ = initParams;
        this.LIZJ = "upload";
        this.LIZLLL = name;
        this.LJ = i;
    }
}

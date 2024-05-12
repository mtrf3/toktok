package X;

import android.os.Message;
import com.ss.android.vesdk.VEDuetSettings;
import com.ss.android.vesdk.VEInfo;
import com.ss.android.vesdk.VESize;
import com.ss.android.vesdk.filterparam.VEVideoEffectStreamFilterParam;
import com.ss.android.vesdk.filterparam.VEVideoTransformFilterParam;

/* renamed from: X.WzV, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C84097WzV extends C84091WzP {
    public final VESize LJIIL;

    @Override // X.C84091WzP
    public final void LJIIL() {
        VEVideoTransformFilterParam vEVideoTransformFilterParam = new VEVideoTransformFilterParam();
        vEVideoTransformFilterParam.filterName = "canvas blend";
        vEVideoTransformFilterParam.scaleFactor = 1.0f;
        vEVideoTransformFilterParam.transX = 0.0f;
        vEVideoTransformFilterParam.alpha = 1.0f;
        int i = this.LJIIIZ;
        if (i >= 0) {
            this.LIZIZ.LIZ.updateTrackFilterParam(i, vEVideoTransformFilterParam);
        } else {
            this.LJIIIZ = this.LIZIZ.LIZ.addTrackFilter(0, 0, vEVideoTransformFilterParam, -1, -1);
        }
    }

    @Override // X.C84091WzP, X.X02
    public final synchronized void onDestroy() {
        super.onDestroy();
    }

    @Override // X.C84091WzP
    public final void LJIIIZ(Message message) {
        super.LJIIIZ(message);
        int i = message.what;
        int i2 = message.arg2;
        if (i == VEInfo.TE_INFO_DUET_DST_SIZE) {
            VESize vESize = this.LJIIL;
            int i3 = (i2 >> 15) & 65535;
            vESize.width = i3;
            int i4 = i2 & 65535;
            vESize.height = i4;
            if (i3 <= 0 || i4 <= 0) {
                return;
            }
            C84092WzQ c84092WzQ = this.LIZIZ;
            if (c84092WzQ == null) {
                P4Q.LIZJ("TEDuetV2Proxy", "TERecorder is null.");
                return;
            }
            c84092WzQ.changeVideoOutputSize(i3, i4);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("changeVideoOutputSize ");
            LIZ.append(this.LJIIL.width);
            LIZ.append(", ");
            C01R.LIZJ(LIZ, this.LJIIL.height, LIZ, "TEDuetV2Proxy");
        }
    }

    @Override // X.C84091WzP
    public final void LJIILIIL(int i) {
        int i2 = this.LJIIJ;
        if (i2 >= 0) {
            this.LIZIZ.LIZ.removeTrackFilter(i2);
            this.LJIIJ = -1;
        }
        VEVideoEffectStreamFilterParam vEVideoEffectStreamFilterParam = new VEVideoEffectStreamFilterParam();
        vEVideoEffectStreamFilterParam.streamFlags = 1;
        this.LIZIZ.LIZ.addTrackFilter(0, i, vEVideoEffectStreamFilterParam, -1, -1);
    }

    @Override // X.C84091WzP
    public final void LJIILLIIL(EnumC62342cY enumC62342cY) {
        C84092WzQ c84092WzQ = this.LIZIZ;
        if (c84092WzQ == null) {
            P4Q.LIZJ("TEDuetV2Proxy", "TERecorder is null.");
        } else {
            c84092WzQ.updateDuetLayout(enumC62342cY);
        }
    }

    public C84097WzV(C84092WzQ c84092WzQ, VEDuetSettings vEDuetSettings, VESize vESize) {
        super(c84092WzQ, vEDuetSettings, vESize);
        this.LJIIL = new VESize(0, 0);
    }
}

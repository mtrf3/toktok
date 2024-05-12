package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.geckox.statistic.model.SyncEventModel;
import com.bytedance.geckox.sync.model.SyncMsgModel;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OFW implements InterfaceC61581OEv {
    public Object LIZ;

    public final void LJIIL() {
        double[] dArr = (double[]) this.LIZ;
        dArr[7] = 0.0d;
        dArr[6] = 0.0d;
        dArr[5] = 0.0d;
        dArr[3] = 0.0d;
        dArr[2] = 0.0d;
        dArr[1] = 0.0d;
        dArr[8] = 1.0d;
        dArr[4] = 1.0d;
        dArr[0] = 1.0d;
    }

    public final OFW LJIILJJIL() {
        OFW ofw = new OFW();
        Object obj = this.LIZ;
        double d = ((double[]) obj)[1];
        double d2 = ((double[]) obj)[2];
        double d3 = ((double[]) obj)[5];
        Object obj2 = ofw.LIZ;
        ((double[]) obj2)[0] = ((double[]) obj)[0];
        ((double[]) obj2)[1] = ((double[]) obj)[3];
        ((double[]) obj2)[2] = ((double[]) obj)[6];
        ((double[]) obj2)[3] = d;
        ((double[]) obj2)[4] = ((double[]) obj)[4];
        ((double[]) obj2)[5] = ((double[]) obj)[7];
        ((double[]) obj2)[6] = d2;
        ((double[]) obj2)[7] = d3;
        ((double[]) obj2)[8] = ((double[]) obj)[8];
        return ofw;
    }

    public /* synthetic */ OFW() {
        this.LIZ = new double[9];
    }

    public /* synthetic */ OFW(Comparable init) {
        o.LJIIIZ(init, "init");
        this.LIZ = init;
    }

    public static OFW LJIIIZ(C87400YRw c87400YRw) {
        double d = c87400YRw.LIZ;
        double d2 = d * d;
        double d3 = c87400YRw.LIZIZ;
        double d4 = d3 * d3;
        double d5 = c87400YRw.LIZJ;
        double d6 = d5 * d5;
        double d7 = c87400YRw.LIZLLL;
        double d8 = d7 * d7;
        double d9 = d * d5;
        double d10 = d3 * d5;
        double d11 = d * d3 * 2.0d;
        double d12 = d5 * d7 * 2.0d;
        double d13 = d9 * 2.0d;
        double d14 = d3 * d7 * 2.0d;
        double d15 = d11 + d12;
        double d16 = -d2;
        double d17 = d10 * 2.0d;
        double d18 = d * d7 * 2.0d;
        return new OFW(((d2 - d4) - d6) + d8, d11 - d12, d13 + d14, d15, ((d16 + d4) - d6) + d8, d17 - d18, d13 - d14, d17 + d18, (d16 - d4) + d6 + d8);
    }

    @Override // X.InterfaceC61581OEv
    public final void LIZ(SyncMsgModel syncMsgModel) {
        C61555ODv c61555ODv = C61573OEn.LIZ;
        int syncTaskId = syncMsgModel.getSyncTaskId();
        int msgType = syncMsgModel.getMsgType();
        c61555ODv.getClass();
        SyncEventModel syncEventModel = new SyncEventModel(c61555ODv.LIZ);
        syncEventModel.setSyncTaskId(syncTaskId);
        syncEventModel.setSyncTaskType(msgType);
        syncEventModel.setSyncStatsType(2);
        OD6.LJIIJJI(syncEventModel);
    }

    public final void LIZLLL(OFW ofw) {
        double LIZJ = (((LIZJ(2, 1) * LIZJ(1, 0)) - (LIZJ(2, 0) * LIZJ(1, 1))) * LIZJ(0, 2)) + ((((LIZJ(2, 2) * LIZJ(1, 1)) - (LIZJ(1, 2) * LIZJ(2, 1))) * LIZJ(0, 0)) - (((LIZJ(2, 2) * LIZJ(1, 0)) - (LIZJ(2, 0) * LIZJ(1, 2))) * LIZJ(0, 1)));
        if (LIZJ == LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
            return;
        }
        double d = 1.0d / LIZJ;
        double[] dArr = (double[]) this.LIZ;
        double d2 = dArr[4];
        double d3 = dArr[8];
        double d4 = dArr[7];
        double d5 = dArr[5];
        double d6 = dArr[1];
        double d7 = dArr[2];
        double d8 = dArr[3];
        double d9 = dArr[6];
        double d10 = dArr[0];
        ofw.LJIIJJI(((d2 * d3) - (d4 * d5)) * d, (-((d6 * d3) - (d7 * d4))) * d, ((d6 * d5) - (d7 * d2)) * d, (-((d8 * d3) - (d5 * d9))) * d, ((d3 * d10) - (d7 * d9)) * d, (-((d5 * d10) - (d7 * d8))) * d, ((d8 * d4) - (d9 * d2)) * d, (-((d10 * d4) - (d9 * d6))) * d, ((d10 * d2) - (d8 * d6)) * d);
    }

    public final void LJ(OFW ofw) {
        double[] dArr = (double[]) this.LIZ;
        double d = dArr[0];
        double[] dArr2 = (double[]) ofw.LIZ;
        dArr[0] = d - dArr2[0];
        dArr[1] = dArr[1] - dArr2[1];
        dArr[2] = dArr[2] - dArr2[2];
        dArr[3] = dArr[3] - dArr2[3];
        dArr[4] = dArr[4] - dArr2[4];
        dArr[5] = dArr[5] - dArr2[5];
        dArr[6] = dArr[6] - dArr2[6];
        dArr[7] = dArr[7] - dArr2[7];
        dArr[8] = dArr[8] - dArr2[8];
    }

    public final void LJIIIIZZ(OFW ofw) {
        double[] dArr = (double[]) this.LIZ;
        double d = dArr[0];
        double[] dArr2 = (double[]) ofw.LIZ;
        dArr[0] = d + dArr2[0];
        dArr[1] = dArr[1] + dArr2[1];
        dArr[2] = dArr[2] + dArr2[2];
        dArr[3] = dArr[3] + dArr2[3];
        dArr[4] = dArr[4] + dArr2[4];
        dArr[5] = dArr[5] + dArr2[5];
        dArr[6] = dArr[6] + dArr2[6];
        dArr[7] = dArr[7] + dArr2[7];
        dArr[8] = dArr[8] + dArr2[8];
    }

    public final void LJIIJ(double d) {
        Object obj = this.LIZ;
        double[] dArr = (double[]) obj;
        dArr[0] = dArr[0] * d;
        double[] dArr2 = (double[]) obj;
        dArr2[1] = dArr2[1] * d;
        double[] dArr3 = (double[]) obj;
        dArr3[2] = dArr3[2] * d;
        double[] dArr4 = (double[]) obj;
        dArr4[3] = dArr4[3] * d;
        double[] dArr5 = (double[]) obj;
        dArr5[4] = dArr5[4] * d;
        double[] dArr6 = (double[]) obj;
        dArr6[5] = dArr6[5] * d;
        double[] dArr7 = (double[]) obj;
        dArr7[6] = dArr7[6] * d;
        double[] dArr8 = (double[]) obj;
        dArr8[7] = dArr8[7] * d;
        double[] dArr9 = (double[]) obj;
        dArr9[8] = dArr9[8] * d;
    }

    public final void LJIILIIL(Comparable v) {
        o.LJIIIZ(v, "v");
        if (v.compareTo(this.LIZ) > 0) {
            this.LIZ = v;
        }
    }

    public /* synthetic */ OFW(List diamondIdList) {
        o.LJIIIZ(diamondIdList, "diamondIdList");
        this.LIZ = diamondIdList;
    }

    public /* synthetic */ OFW(Object obj) {
        this.LIZ = obj;
    }

    public static OFW LJFF(OFW ofw, OFW ofw2) {
        double[] dArr = (double[]) ofw.LIZ;
        double d = dArr[0];
        double[] dArr2 = (double[]) ofw2.LIZ;
        double d2 = dArr2[0];
        double d3 = dArr[1];
        double d4 = dArr2[3];
        double d5 = dArr[2];
        double d6 = dArr2[6];
        double d7 = d5 * d6;
        double d8 = d7 + (d3 * d4) + (d * d2);
        double d9 = dArr2[1];
        double d10 = dArr2[4];
        double d11 = dArr2[7];
        double d12 = d5 * d11;
        double d13 = d12 + (d3 * d10) + (d * d9);
        double d14 = dArr2[2];
        double d15 = dArr2[5];
        double d16 = (d3 * d15) + (d * d14);
        double d17 = dArr2[8];
        double d18 = dArr[3];
        double d19 = dArr[4];
        double d20 = dArr[5];
        double d21 = d20 * d6;
        double d22 = d21 + (d19 * d4) + (d18 * d2);
        double d23 = d19 * d10;
        double d24 = d20 * d11;
        double d25 = d19 * d15;
        double d26 = d20 * d17;
        double d27 = dArr[6];
        double d28 = dArr[7];
        double d29 = d4 * d28;
        double d30 = dArr[8];
        return new OFW(d8, d13, (d5 * d17) + d16, d22, d24 + d23 + (d18 * d9), d26 + d25 + (d18 * d14), (d6 * d30) + d29 + (d2 * d27), (d11 * d30) + (d10 * d28) + (d9 * d27), (d30 * d17) + (d28 * d15) + (d27 * d14));
    }

    public final double LIZJ(int i, int i2) {
        return ((double[]) this.LIZ)[(i * 3) + i2];
    }

    public static void LIZIZ(OFW ofw, OFW ofw2, OFW ofw3) {
        Object obj = ofw3.LIZ;
        Object obj2 = ofw.LIZ;
        double d = ((double[]) obj2)[0];
        Object obj3 = ofw2.LIZ;
        ((double[]) obj)[0] = d + ((double[]) obj3)[0];
        ((double[]) obj)[1] = ((double[]) obj2)[1] + ((double[]) obj3)[1];
        ((double[]) obj)[2] = ((double[]) obj2)[2] + ((double[]) obj3)[2];
        ((double[]) obj)[3] = ((double[]) obj2)[3] + ((double[]) obj3)[3];
        ((double[]) obj)[4] = ((double[]) obj2)[4] + ((double[]) obj3)[4];
        ((double[]) obj)[5] = ((double[]) obj2)[5] + ((double[]) obj3)[5];
        ((double[]) obj)[6] = ((double[]) obj2)[6] + ((double[]) obj3)[6];
        ((double[]) obj)[7] = ((double[]) obj2)[7] + ((double[]) obj3)[7];
        ((double[]) obj)[8] = ((double[]) obj2)[8] + ((double[]) obj3)[8];
    }

    public static void LJI(OFW ofw, OFW ofw2, OFW ofw3) {
        Object obj = ofw.LIZ;
        double d = ((double[]) obj)[0];
        Object obj2 = ofw2.LIZ;
        ofw3.LJIIJJI((((double[]) obj)[2] * ((double[]) obj2)[6]) + (((double[]) obj)[1] * ((double[]) obj2)[3]) + (d * ((double[]) obj2)[0]), (((double[]) obj)[2] * ((double[]) obj2)[7]) + (((double[]) obj)[1] * ((double[]) obj2)[4]) + (((double[]) obj)[0] * ((double[]) obj2)[1]), (((double[]) obj)[2] * ((double[]) obj2)[8]) + (((double[]) obj)[1] * ((double[]) obj2)[5]) + (((double[]) obj)[0] * ((double[]) obj2)[2]), (((double[]) obj)[5] * ((double[]) obj2)[6]) + (((double[]) obj)[4] * ((double[]) obj2)[3]) + (((double[]) obj)[3] * ((double[]) obj2)[0]), (((double[]) obj)[5] * ((double[]) obj2)[7]) + (((double[]) obj)[4] * ((double[]) obj2)[4]) + (((double[]) obj)[3] * ((double[]) obj2)[1]), (((double[]) obj)[5] * ((double[]) obj2)[8]) + (((double[]) obj)[4] * ((double[]) obj2)[5]) + (((double[]) obj)[3] * ((double[]) obj2)[2]), (((double[]) obj)[8] * ((double[]) obj2)[6]) + (((double[]) obj)[7] * ((double[]) obj2)[3]) + (((double[]) obj)[6] * ((double[]) obj2)[0]), (((double[]) obj)[8] * ((double[]) obj2)[7]) + (((double[]) obj)[7] * ((double[]) obj2)[4]) + (((double[]) obj)[6] * ((double[]) obj2)[1]), (((double[]) obj)[8] * ((double[]) obj2)[8]) + (((double[]) obj)[7] * ((double[]) obj2)[5]) + (((double[]) obj)[6] * ((double[]) obj2)[2]));
    }

    public static void LJII(OFW ofw, C87401YRx c87401YRx, C87401YRx c87401YRx2) {
        double[] dArr = (double[]) ofw.LIZ;
        double d = dArr[0];
        double d2 = c87401YRx.LIZ;
        double d3 = dArr[1];
        double d4 = c87401YRx.LIZIZ;
        double d5 = dArr[2];
        double d6 = c87401YRx.LIZJ;
        double d7 = d5 * d6;
        double d8 = d7 + (d3 * d4) + (d * d2);
        double d9 = (dArr[5] * d6) + (dArr[4] * d4) + (dArr[3] * d2);
        double d10 = (dArr[8] * d6) + (dArr[7] * d4) + (dArr[6] * d2);
        c87401YRx2.LIZ = d8;
        c87401YRx2.LIZIZ = d9;
        c87401YRx2.LIZJ = d10;
    }

    public /* synthetic */ OFW(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        this.LIZ = r0;
        double[] dArr = {d, d2, d3, d4, d5, d6, d7, d8, d9};
    }

    public final void LJIIJJI(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        Object obj = this.LIZ;
        ((double[]) obj)[0] = d;
        ((double[]) obj)[1] = d2;
        ((double[]) obj)[2] = d3;
        ((double[]) obj)[3] = d4;
        ((double[]) obj)[4] = d5;
        ((double[]) obj)[5] = d6;
        ((double[]) obj)[6] = d7;
        ((double[]) obj)[7] = d8;
        ((double[]) obj)[8] = d9;
    }
}

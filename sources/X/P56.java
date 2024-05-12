package X;

import java.nio.ByteBuffer;

/* loaded from: classes12.dex */
public final class P56 implements P5A {
    public final /* synthetic */ long[] LIZ;
    public final /* synthetic */ ByteBuffer[] LIZIZ;
    public final /* synthetic */ float[] LIZJ;
    public final /* synthetic */ P51 LIZLLL;

    public P56(P51 p51, long[] jArr, ByteBuffer[] byteBufferArr, float[] fArr) {
        this.LIZLLL = p51;
        this.LIZ = jArr;
        this.LIZIZ = byteBufferArr;
        this.LIZJ = fArr;
    }

    @Override // X.P5A
    public final boolean processFrame(ByteBuffer byteBuffer, int i, int i2, int i3) {
        String str;
        long currentTimeMillis = System.currentTimeMillis() - this.LIZ[0];
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("frameProcessHW");
        LIZ.append(this.LIZLLL.LJLJJLL);
        LIZ.append("_");
        LIZ.append(this.LIZLLL.LJLJL);
        String LIZIZ = X1D.LIZIZ(LIZ);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(" cost time :");
        LIZ2.append(currentTimeMillis);
        LIZ2.append(" ptsMs: ");
        LIZ2.append(i3);
        LIZ2.append(" frame is ");
        if (byteBuffer == null) {
            str = "null";
        } else {
            str = "not null";
        }
        LIZ2.append(str);
        P4Q.LJFF(LIZIZ, X1D.LIZIZ(LIZ2));
        this.LIZ[0] = System.currentTimeMillis();
        if (byteBuffer == null) {
            this.LIZIZ[0] = null;
            P51 p51 = this.LIZLLL;
            p51.LJLLILLLL.progressBack(p51.LJLJLJ, p51.LJLJLLL, p51.LJLJJLL, p51.LJLL, p51.LJLLI);
            P51 p512 = this.LIZLLL;
            return p512.LJLLILLLL.genFrameMap.get(Integer.valueOf(p512.LJLJJLL)).booleanValue();
        }
        ByteBuffer[] byteBufferArr = this.LIZIZ;
        ByteBuffer byteBuffer2 = byteBufferArr[0];
        if (byteBuffer2 == null) {
            byteBufferArr[0] = byteBuffer;
            this.LIZJ[0] = i3;
            P51 p513 = this.LIZLLL;
            return p513.LJLLILLLL.genFrameMap.get(Integer.valueOf(p513.LJLJJLL)).booleanValue();
        }
        P51 p514 = this.LIZLLL;
        p514.LJLLILLLL.mNativeBingoHandler.processBingoFrames(byteBuffer2, byteBuffer, i, i2, this.LIZJ[0], p514.LJLIL);
        this.LIZIZ[0] = null;
        this.LIZJ[0] = 0.0f;
        P51 p515 = this.LIZLLL;
        p515.LJLLILLLL.progressBack(p515.LJLJLJ, p515.LJLJLLL, p515.LJLJJLL, p515.LJLL, p515.LJLLI);
        P51 p516 = this.LIZLLL;
        return p516.LJLLILLLL.genFrameMap.get(Integer.valueOf(p516.LJLJJLL)).booleanValue();
    }
}

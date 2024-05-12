package X;

import java.nio.ByteBuffer;

/* loaded from: classes12.dex */
public final class P5B implements P5A {
    public final /* synthetic */ ByteBuffer[] LIZ;
    public final /* synthetic */ float[] LIZIZ;
    public final /* synthetic */ P5C LIZJ;

    public P5B(P5C p5c, ByteBuffer[] byteBufferArr, float[] fArr) {
        this.LIZJ = p5c;
        this.LIZ = byteBufferArr;
        this.LIZIZ = fArr;
    }

    @Override // X.P5A
    public final boolean processFrame(ByteBuffer byteBuffer, int i, int i2, int i3) {
        long currentTimeMillis = System.currentTimeMillis() - this.LIZJ.LJLIL[0];
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("frameProcessSoft");
        LIZ.append(this.LIZJ.LJLILLLLZI);
        String LIZIZ = X1D.LIZIZ(LIZ);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(" cost time :");
        LIZ2.append(currentTimeMillis);
        LIZ2.append(" ptsMs: ");
        LIZ2.append(i3);
        P4Q.LJFF(LIZIZ, X1D.LIZIZ(LIZ2));
        this.LIZJ.LJLIL[0] = System.currentTimeMillis();
        ByteBuffer[] byteBufferArr = this.LIZ;
        ByteBuffer byteBuffer2 = byteBufferArr[0];
        if (byteBuffer2 == null) {
            byteBufferArr[0] = byteBuffer;
            this.LIZIZ[0] = i3;
            P5C p5c = this.LIZJ;
            return p5c.LJLLI.genFrameMap.get(Integer.valueOf(p5c.LJLILLLLZI)).booleanValue();
        }
        P5C p5c2 = this.LIZJ;
        p5c2.LJLLI.mNativeBingoHandler.processBingoFrames(byteBuffer2, byteBuffer, i, i2, this.LIZIZ[0], p5c2.LJLJI);
        this.LIZ[0] = null;
        this.LIZIZ[0] = 0.0f;
        P5C p5c3 = this.LIZJ;
        p5c3.LJLLI.progressBack(p5c3.LJLJJI, p5c3.LJLJJL, p5c3.LJLILLLLZI, p5c3.LJLJJLL, p5c3.LJLJL);
        P5C p5c4 = this.LIZJ;
        return p5c4.LJLLI.genFrameMap.get(Integer.valueOf(p5c4.LJLILLLLZI)).booleanValue();
    }
}

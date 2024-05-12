package X;

/* loaded from: classes15.dex */
public class VXA implements VXF {
    public final /* synthetic */ VX7 LIZ;

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.listener.AlphaPlayerAction
    public final void endAction() {
        VX7 vx7 = this.LIZ;
        InterfaceC78208Umi interfaceC78208Umi = vx7.LIZLLL;
        if (interfaceC78208Umi != null) {
            interfaceC78208Umi.LIZIZ(new C60382Yo(vx7.LJI.LLFF));
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.listener.AlphaPlayerAction
    public final void startAction() {
        InterfaceC78208Umi interfaceC78208Umi = this.LIZ.LIZLLL;
        if (interfaceC78208Umi != null) {
            interfaceC78208Umi.onStart();
        }
    }

    public VXA(VX7 vx7) {
        this.LIZ = vx7;
    }

    @Override // X.VXF
    public final void LIZ(C78163Ulz c78163Ulz) {
        InterfaceC78208Umi interfaceC78208Umi = this.LIZ.LIZLLL;
        if (interfaceC78208Umi != null) {
            interfaceC78208Umi.LIZ(c78163Ulz);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005a, code lost:
    
        if (r9 > r8) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x005f, code lost:
    
        if (r9 > r8) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0070, code lost:
    
        if (r9 > r8) goto L43;
     */
    @Override // com.ss.android.ugc.aweme.live.alphaplayer.listener.AlphaPlayerAction
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onVideoSizeChange(int r11, int r12, com.ss.android.ugc.aweme.live.alphaplayer.model.DataSource.ScaleType r13) {
        /*
            r10 = this;
            X.VX7 r1 = r10.LIZ
            X.Umi r0 = r1.LIZLLL
            if (r0 == 0) goto L57
            com.bytedance.gift.render.engine.alphaplayer.controller.LocalPlayerController r0 = r1.LJI
            if (r0 == 0) goto L57
            android.view.View r0 = r0.getView()
            int r1 = r0.getMeasuredWidth()
            int r0 = r0.getMeasuredHeight()
            X.VX7 r2 = r10.LIZ
            float r5 = (float) r1
            float r1 = (float) r0
            float r8 = (float) r11
            float r0 = (float) r12
            r2.getClass()
            float r9 = r5 / r1
            float r8 = r8 / r0
            com.ss.android.ugc.aweme.live.alphaplayer.model.DataSource$ScaleType r0 = com.ss.android.ugc.aweme.live.alphaplayer.model.DataSource.ScaleType.ScaleAspectFill
            if (r13 == r0) goto L36
            com.ss.android.ugc.aweme.live.alphaplayer.model.DataSource$ScaleType r0 = com.ss.android.ugc.aweme.live.alphaplayer.model.DataSource.ScaleType.TopFill
            if (r13 == r0) goto L36
            com.ss.android.ugc.aweme.live.alphaplayer.model.DataSource$ScaleType r0 = com.ss.android.ugc.aweme.live.alphaplayer.model.DataSource.ScaleType.BottomFill
            if (r13 == r0) goto L36
            com.ss.android.ugc.aweme.live.alphaplayer.model.DataSource$ScaleType r0 = com.ss.android.ugc.aweme.live.alphaplayer.model.DataSource.ScaleType.RightFill
            if (r13 == r0) goto L36
            com.ss.android.ugc.aweme.live.alphaplayer.model.DataSource$ScaleType r0 = com.ss.android.ugc.aweme.live.alphaplayer.model.DataSource.ScaleType.LeftFill
            if (r13 != r0) goto L9d
        L36:
            int r0 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r0 <= 0) goto La1
        L3a:
            float r3 = r5 / r8
            r7 = r5
        L3d:
            int[] r4 = X.VXJ.LIZ
            int r0 = r13.ordinal()
            r0 = r4[r0]
            r4 = 0
            r6 = 1073741824(0x40000000, float:2.0)
            switch(r0) {
                case 1: goto L95;
                case 2: goto L58;
                case 3: goto L5d;
                case 4: goto L62;
                case 5: goto L6e;
                case 6: goto L73;
                case 7: goto L80;
                case 8: goto L8c;
                case 9: goto L8f;
                case 10: goto L93;
                case 11: goto L98;
                default: goto L4b;
            }
        L4b:
            r4 = 0
        L4c:
            r1 = r3
        L4d:
            r3 = r1
            r1 = 0
            r5 = r7
        L50:
            X.Umi r0 = r2.LIZLLL
            if (r0 == 0) goto L57
            r0.LIZJ(r5, r3, r4, r1)
        L57:
            return
        L58:
            int r0 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r0 <= 0) goto L6a
            goto L77
        L5d:
            int r0 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r0 <= 0) goto L6a
            goto L4b
        L62:
            int r0 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r0 <= 0) goto L6a
            float r0 = r3 - r1
            float r1 = -r0
            goto L8a
        L6a:
            float r0 = r7 - r5
            float r5 = -r0
            goto L85
        L6e:
            int r0 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r0 <= 0) goto L4b
            goto L77
        L73:
            int r0 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r0 <= 0) goto L7c
        L77:
            float r0 = r3 - r1
            float r1 = -r0
            float r1 = r1 / r6
            goto L8a
        L7c:
            float r0 = r7 - r5
            float r5 = -r0
            goto L86
        L80:
            int r0 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r0 <= 0) goto L88
            float r5 = r5 - r7
        L85:
            float r5 = r5 / r6
        L86:
            r4 = r5
            goto L4c
        L88:
            float r1 = r1 - r3
            float r1 = r1 / r6
        L8a:
            r5 = r7
            goto L50
        L8c:
            float r1 = r5 / r8
            goto L95
        L8f:
            float r3 = r5 / r8
            float r1 = r1 - r3
            goto L50
        L93:
            float r5 = r1 * r8
        L95:
            r7 = r5
            r4 = 0
            goto L4d
        L98:
            float r7 = r8 * r1
            float r4 = r5 - r7
            goto L4d
        L9d:
            int r0 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r0 <= 0) goto L3a
        La1:
            float r7 = r1 * r8
            r3 = r1
            goto L3d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.VXA.onVideoSizeChange(int, int, com.ss.android.ugc.aweme.live.alphaplayer.model.DataSource$ScaleType):void");
    }
}

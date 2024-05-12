package com.bytedance.lynx.hybrid;

import com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter;

/* loaded from: classes11.dex */
public class LynxSkeletonUI$$PropsSetter extends LynxUI$$PropsSetter {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        if (r6.equals("hasanimation") == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0035, code lost:
    
        if (r6.equals("src") == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0018, code lost:
    
        if (r6.equals("duration") == false) goto L4;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000b. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0047  */
    @Override // com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(com.lynx.tasm.behavior.ui.LynxBaseUI r5, java.lang.String r6, X.VPA r7) {
        /*
            r4 = this;
            r2 = r5
            com.bytedance.lynx.hybrid.LynxSkeletonUI r2 = (com.bytedance.lynx.hybrid.LynxSkeletonUI) r2
            r6.getClass()
            int r0 = r6.hashCode()
            r3 = 0
            switch(r0) {
                case -1992012396: goto L12;
                case -1971595734: goto L1b;
                case -1153009725: goto L24;
                case 114148: goto L2f;
                case 82301940: goto L38;
                default: goto Le;
            }
        Le:
            super.LIZ(r5, r6, r7)
            return
        L12:
            java.lang.String r0 = "duration"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L47
            goto Le
        L1b:
            java.lang.String r0 = "hasanimation"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L4f
            goto Le
        L24:
            java.lang.String r0 = "toalpha"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L2d
            goto Le
        L2d:
            r1 = 2
            goto L42
        L2f:
            java.lang.String r0 = "src"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L5f
            goto Le
        L38:
            java.lang.String r0 = "fromalpha"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L41
            goto Le
        L41:
            r1 = 4
        L42:
            r0 = 0
            switch(r1) {
                case 0: goto L47;
                case 1: goto L4f;
                case 2: goto L57;
                case 3: goto L5f;
                case 4: goto L67;
                default: goto L46;
            }
        L46:
            goto Le
        L47:
            int r0 = r7.LJFF(r6, r3)
            r2.setDuration(r0)
            return
        L4f:
            boolean r0 = r7.LIZIZ(r6, r3)
            r2.setHasAnimation(r0)
            return
        L57:
            float r0 = r7.LJ(r6, r0)
            r2.setToAlpha(r0)
            return
        L5f:
            java.lang.String r0 = r7.LJII(r6)
            r2.setSrc(r0)
            return
        L67:
            float r0 = r7.LJ(r6, r0)
            r2.setFromAlpha(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.lynx.hybrid.LynxSkeletonUI$$PropsSetter.LIZ(com.lynx.tasm.behavior.ui.LynxBaseUI, java.lang.String, X.VPA):void");
    }
}

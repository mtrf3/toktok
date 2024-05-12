package com.lynx.tasm.behavior.ui.swiper;

import com.lynx.tasm.behavior.shadow.CustomLayoutShadowNode$$PropsSetter;

/* loaded from: classes15.dex */
public class SwiperShadowNode$$PropsSetter extends CustomLayoutShadowNode$$PropsSetter {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x002c, code lost:
    
        if (r7.equals("next-margin") == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0035, code lost:
    
        if (r7.equals("mode") == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x003e, code lost:
    
        if (r7.equals("previous-margin") == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0057, code lost:
    
        if (r7.equals("page-margin") == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0018, code lost:
    
        if (r7.equals("vertical") == false) goto L4;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000b. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x005a  */
    @Override // com.lynx.tasm.behavior.shadow.CustomLayoutShadowNode$$PropsSetter, com.lynx.tasm.behavior.shadow.ShadowNode$$PropsSetter, com.lynx.tasm.behavior.utils.ShadowNodeSetter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(com.lynx.tasm.behavior.shadow.ShadowNode r6, java.lang.String r7, X.VPA r8) {
        /*
            r5 = this;
            r2 = r6
            com.lynx.tasm.behavior.ui.swiper.SwiperShadowNode r2 = (com.lynx.tasm.behavior.ui.swiper.SwiperShadowNode) r2
            r7.getClass()
            int r0 = r7.hashCode()
            r4 = 0
            switch(r0) {
                case -1984141450: goto L12;
                case -686438324: goto L1b;
                case -111166008: goto L26;
                case 3357091: goto L2f;
                case 24002884: goto L38;
                case 201065357: goto L41;
                case 1665556140: goto L51;
                default: goto Le;
            }
        Le:
            super.LIZIZ(r6, r7, r8)
            return
        L12:
            java.lang.String r0 = "vertical"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L5a
            goto Le
        L1b:
            java.lang.String r0 = "max-x-scale"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L24
            goto Le
        L24:
            r3 = 1
            goto L4b
        L26:
            java.lang.String r0 = "next-margin"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L6a
            goto Le
        L2f:
            java.lang.String r0 = "mode"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L72
            goto Le
        L38:
            java.lang.String r0 = "previous-margin"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L7a
            goto Le
        L41:
            java.lang.String r0 = "max-y-scale"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L4a
            goto Le
        L4a:
            r3 = 5
        L4b:
            r0 = 0
            switch(r3) {
                case 0: goto L5a;
                case 1: goto L62;
                case 2: goto L6a;
                case 3: goto L72;
                case 4: goto L7a;
                case 5: goto L82;
                case 6: goto L8a;
                default: goto L50;
            }
        L50:
            goto Le
        L51:
            java.lang.String r0 = "page-margin"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L8a
            goto Le
        L5a:
            boolean r0 = r8.LIZIZ(r7, r4)
            r2.setVertical(r0)
            return
        L62:
            double r0 = r8.LIZJ(r7, r0)
            r2.setMaxXScale(r0)
            return
        L6a:
            X.F5B r0 = r8.LIZLLL(r7)
            r2.setNextMargin(r0)
            return
        L72:
            java.lang.String r0 = r8.LJII(r7)
            r2.setMode(r0)
            return
        L7a:
            X.F5B r0 = r8.LIZLLL(r7)
            r2.setPreviousMargin(r0)
            return
        L82:
            double r0 = r8.LIZJ(r7, r0)
            r2.setMaxYScale(r0)
            return
        L8a:
            X.F5B r0 = r8.LIZLLL(r7)
            r2.setPageMargin(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.ui.swiper.SwiperShadowNode$$PropsSetter.LIZIZ(com.lynx.tasm.behavior.shadow.ShadowNode, java.lang.String, X.VPA):void");
    }
}

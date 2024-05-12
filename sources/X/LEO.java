package X;

import android.app.Activity;
import android.content.res.Configuration;
import com.ss.android.ugc.aweme.tablet.impl.settings.TabletCommentSplitSettings;

/* loaded from: classes10.dex */
public final class LEO {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZJ() {
        LFE.LIZIZ("commentSplit", "isOptSplitContainer");
        if (!LEP.LIZ(null)) {
            LFE.LIZIZ("commentSplit", "isOptSplitContainer LandscapeExperiment no");
            return false;
        }
        boolean LIZLLL = LIZLLL();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("isOptSplitContainer CommentSplitExperiment support：");
        LIZ2.append(LIZLLL);
        LFE.LIZIZ("commentSplit", X1D.LIZIZ(LIZ2));
        return LIZLLL;
    }

    public static boolean LIZLLL() {
        if (C54964Lhg.LIZ) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append((String) null);
            LIZ2.append(" supportCommentSplit: true, r: is super device");
            LFE.LIZIZ("commentSplit", X1D.LIZIZ(LIZ2));
        } else if (!LEQ.LIZJ()) {
            if (LEQ.LIZIZ(null)) {
                if (C52436Ki0.LIZ() == 0) {
                    return false;
                }
            } else {
                if (LEQ.LIZLLL(null)) {
                    if (C52438Ki2.LIZ() != 0) {
                    }
                } else {
                    LFE.LIZIZ("commentSplit", "not support navrail&comment split");
                }
                return false;
            }
        }
        return true;
    }

    public static boolean LIZ(Activity activity, Configuration configuration) {
        LFE.LIZIZ("commentSplit", "isOptCommentSplit");
        String str = null;
        boolean z = true;
        if (C54964Lhg.LIZ && C53946LFe.LIZJ(activity, null).LJFF) {
            if (C54966Lhi.LIZJ() && !TabletCommentSplitSettings.LIZ(activity, configuration)) {
                z = false;
            }
            StringBuilder LIZ2 = X1D.LIZ();
            if (activity != null) {
                str = C16880lQ.LJLLJ(activity.getClass());
            }
            LIZ2.append(str);
            LIZ2.append(" useCommentSplit: ");
            LIZ2.append(z);
            LIZ2.append(", r: is super device");
            LFE.LIZIZ("commentSplit", X1D.LIZIZ(LIZ2));
            return z;
        }
        if (!LF2.LIZIZ(activity)) {
            LFE.LIZIZ("commentSplit", "isOptCommentSplit TabletUtils.isSupportLandscape no");
            return false;
        }
        if (activity != null && (C78886Uxe.LJJIJIIJIL(activity) || C78886Uxe.LJJIJIL(activity))) {
            LFE.LIZIZ("commentSplit", "isOptCommentSplit is in multi window no");
            return false;
        }
        if (!LEP.LIZ(null)) {
            LFE.LIZIZ("commentSplit", "isOptCommentSplit LandscapeExperiment no");
            return false;
        }
        if (!TabletCommentSplitSettings.LIZ(activity, configuration)) {
            LFE.LIZIZ("commentSplit", "isOptCommentSplit canCommentSplit no");
            return false;
        }
        boolean LJ = LJ(activity, configuration);
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("isOptCommentSplit CommentSplitExperiment canSplit：");
        LIZ3.append(LJ);
        LFE.LIZIZ("commentSplit", X1D.LIZIZ(LIZ3));
        return LJ;
    }

    public static boolean LJ(Activity activity, Configuration configuration) {
        String str;
        if (LEQ.LIZJ()) {
            return C53946LFe.LIZJ(activity, configuration).LJFF;
        }
        if (LEQ.LIZIZ(activity)) {
            StringBuilder LJI = JBR.LJI("LargeTabletNavRailCommentCombineAB useNavRailComment isLandscape: ", C53946LFe.LIZJ(activity, configuration).LJFF, ", expVal: ");
            LJI.append(C52436Ki0.LIZ());
            LFE.LIZIZ("commentSplit", X1D.LIZIZ(LJI));
            int LIZ2 = C52436Ki0.LIZ();
            if (LIZ2 != 1) {
                if (LIZ2 == 2 || LIZ2 == 3 || LIZ2 == 4) {
                    return C53946LFe.LIZJ(activity, configuration).LJFF;
                }
                return false;
            }
            return true;
        }
        if (LEQ.LIZLLL(activity)) {
            StringBuilder LJI2 = JBR.LJI("SmallTabletNavRailCommentCombineAB useNavRailComment isLandscape: ", C53946LFe.LIZJ(activity, configuration).LJFF, ", expVal: ");
            LJI2.append(C52438Ki2.LIZ());
            LFE.LIZIZ("commentSplit", X1D.LIZIZ(LJI2));
            int LIZ3 = C52438Ki2.LIZ();
            if (LIZ3 != 1) {
                if (LIZ3 == 2 || LIZ3 == 3 || LIZ3 == 4) {
                    return C53946LFe.LIZJ(activity, configuration).LJFF;
                }
            }
            return true;
        }
        StringBuilder LIZ4 = X1D.LIZ();
        if (activity != null) {
            str = C16880lQ.LJLLJ(activity.getClass());
        } else {
            str = null;
        }
        LIZ4.append(str);
        LIZ4.append(" useNavRailComment false: sLastABGroup else");
        LFE.LIZIZ("commentSplit", X1D.LIZIZ(LIZ4));
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005f, code lost:
    
        if (X.C53946LFe.LIZJ(r7, r8).LJFF != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0071, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006f, code lost:
    
        if (r9 == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a0, code lost:
    
        if (X.C53946LFe.LIZJ(r7, r8).LJFF != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b0, code lost:
    
        if (r9 == false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZIZ(android.app.Activity r7, android.content.res.Configuration r8, boolean r9) {
        /*
            java.lang.String r3 = "commentSplit"
            java.lang.String r0 = "isOptCommentSplitWithOpenDefault"
            X.LFE.LIZIZ(r3, r0)
            boolean r0 = LIZ(r7, r8)
            r2 = 0
            if (r0 != 0) goto L14
            java.lang.String r0 = "isOptCommentSplitWithOpenDefault isOptCommentSplit no"
            X.LFE.LIZIZ(r3, r0)
            return r2
        L14:
            boolean r0 = X.LEQ.LIZJ()
            if (r0 == 0) goto L2e
        L1a:
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "isOptCommentSplitWithOpenDefault experiment on: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.LFE.LIZIZ(r3, r0)
            return r2
        L2e:
            boolean r0 = X.LEQ.LIZIZ(r7)
            r4 = 3
            r5 = 4
            java.lang.String r6 = ", expVal: "
            if (r0 == 0) goto L73
        L39:
            X.LFg r0 = X.C53946LFe.LIZJ(r7, r8)
            boolean r1 = r0.LJFF
            java.lang.String r0 = "LargeTabletNavRailCommentCombineAB isCommentOpenDefault isLandscape: "
            java.lang.StringBuilder r1 = X.JBR.LJI(r0, r1, r6)
            int r0 = X.C52436Ki0.LIZ()
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.LFE.LIZIZ(r3, r0)
            int r0 = X.C52436Ki0.LIZ()
            if (r0 != r5) goto L61
            X.LFg r0 = X.C53946LFe.LIZJ(r7, r8)
            boolean r0 = r0.LJFF
            if (r0 != 0) goto L71
        L61:
            int r0 = X.C52436Ki0.LIZ()
            if (r0 != r4) goto L1a
            X.LFg r0 = X.C53946LFe.LIZJ(r7, r8)
            boolean r0 = r0.LJFF
            if (r0 == 0) goto L1a
            if (r9 != 0) goto L1a
        L71:
            r2 = 1
            goto L1a
        L73:
            boolean r0 = X.LEQ.LIZLLL(r7)
            if (r0 == 0) goto Lb3
        L7a:
            X.LFg r0 = X.C53946LFe.LIZJ(r7, r8)
            boolean r1 = r0.LJFF
            java.lang.String r0 = "SmallTabletNavRailCommentCombineAB isCommentOpenDefault isLandscape: "
            java.lang.StringBuilder r1 = X.JBR.LJI(r0, r1, r6)
            int r0 = X.C52438Ki2.LIZ()
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.LFE.LIZIZ(r3, r0)
            int r0 = X.C52438Ki2.LIZ()
            if (r0 != r5) goto La2
            X.LFg r0 = X.C53946LFe.LIZJ(r7, r8)
            boolean r0 = r0.LJFF
            if (r0 != 0) goto L71
        La2:
            int r0 = X.C52438Ki2.LIZ()
            if (r0 != r4) goto L1a
            X.LFg r0 = X.C53946LFe.LIZJ(r7, r8)
            boolean r0 = r0.LJFF
            if (r0 == 0) goto L1a
            if (r9 != 0) goto L1a
            goto L71
        Lb3:
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            if (r7 == 0) goto Ld2
            java.lang.Class r0 = r7.getClass()
            java.lang.String r0 = X.C16880lQ.LJLLJ(r0)
        Lc1:
            r1.append(r0)
            java.lang.String r0 = " isCommentOpenDefault false: sLastABGroup else"
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.LFE.LIZIZ(r3, r0)
            goto L1a
        Ld2:
            r0 = 0
            goto Lc1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LEO.LIZIZ(android.app.Activity, android.content.res.Configuration, boolean):boolean");
    }
}

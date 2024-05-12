package com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor;

import X.C0RN;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import java.util.List;

/* loaded from: classes4.dex */
public final class CommentRefactorPreloadTask implements EE1 {
    public static volatile boolean LJLIL;

    @Override // X.EEY
    public final String key() {
        return "CommentRefactorPreloadTask";
    }

    @Override // X.EEY
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.EEY
    public final /* synthetic */ String prefix() {
        return "task_";
    }

    @Override // X.EE1
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.EEY
    public final int targetProcess() {
        return 1;
    }

    @Override // X.EEY
    public final /* synthetic */ List triggerOtherLegoComponents() {
        return null;
    }

    @Override // X.EEY
    public final /* synthetic */ EnumC36103EEx triggerType() {
        return C0RN.LIZIZ(this);
    }

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.EE1
    public final EFK type() {
        return EFK.BACKGROUND;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x007d, code lost:
    
        if (r5.isFinishing() == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x007f, code lost:
    
        X.C16970lZ.LJ(r1[r3], r5);
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0086, code lost:
    
        if (r3 >= 5) goto L22;
     */
    @Override // X.EEY
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run(android.content.Context r9) {
        /*
            r8 = this;
            boolean r0 = com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.CommentRefactorPreloadTask.LJLIL
            if (r0 == 0) goto L5
        L4:
            return
        L5:
            r1 = 1
            com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.CommentRefactorPreloadTask.LJLIL = r1
            java.lang.String r0 = "preload onBoot start"
            java.lang.String r4 = "PreloadRefactorTask"
            X.C71Y.LIZLLL(r4, r0)
            long r6 = android.os.SystemClock.uptimeMillis()
            r0 = 0
            r5 = 0
            boolean r0 = com.ss.android.ugc.aweme.experiment.CommentSampleRateSetting.LIZ(r0, r5)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            X.C71H.LIZ(r0)
            X.71J r0 = com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.RefactorKeyboardPanelV2.LJLLJ
            X.C71H.LIZ(r0)
            X.6yU r0 = com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.KeyboardVMV2.LJLIL
            X.C71H.LIZ(r0)
            X.6xv r0 = com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.KeyboardInputV2Assem.LLII
            X.C71H.LIZ(r0)
            X.71I r0 = com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.CommentEmojiPanelAssem.LJLL
            X.C71H.LIZ(r0)
            X.71F r0 = com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.CommentKeyboardMultiPanelAssem.LJLLL
            X.C71H.LIZ(r0)
            X.6yP r0 = com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.HorizontalEmojiMiniPanelAssem.LJLLILLLL
            X.C71H.LIZ(r0)
            X.4Zi r0 = X.C111534Zh.LJLLLL
            X.C71H.LIZ(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            X.C71H.LIZ(r0)
            X.6xT r0 = com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.CommentRepostCardAssem.LJLJL
            X.C71H.LIZ(r0)
            X.6xd r0 = new X.6xd
            r0.<init>()
            X.C71H.LIZ(r0)
            X.6y5 r0 = new X.6y5
            r3 = 0
            r0.<init>(r3)
            X.C71H.LIZ(r0)
            android.app.Activity r1 = X.C84763XOl.LJIIIIZZ()
            boolean r0 = r1 instanceof X.InterfaceC55058LjC
            if (r0 == 0) goto L89
            X.LjC r1 = (X.InterfaceC55058LjC) r1
        L6a:
            boolean r0 = r1 instanceof X.ActivityC45651qj
            if (r0 == 0) goto L71
            r5 = r1
            android.app.Activity r5 = (android.app.Activity) r5
        L71:
            r2 = 5
            int[] r1 = new int[r2]
            r1 = {x00b0: FILL_ARRAY_DATA , data: [2131558947, 2131558913, 2131558914, 2131558931, 2131558929} // fill-array
            if (r5 == 0) goto L8b
            boolean r0 = r5.isFinishing()
            if (r0 != 0) goto L8b
        L7f:
            r0 = r1[r3]
            X.C16970lZ.LJ(r0, r5)
            int r3 = r3 + 1
            if (r3 >= r2) goto L8b
            goto L7f
        L89:
            r1 = r5
            goto L6a
        L8b:
            java.lang.StringBuilder r2 = X.X1D.LIZ()
            java.lang.String r0 = "preload onBoot finish cost="
            r2.append(r0)
            long r0 = android.os.SystemClock.uptimeMillis()
            long r0 = r0 - r6
            r2.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r2)
            X.C71Y.LIZLLL(r4, r0)
            android.app.Activity r1 = X.C84763XOl.LJIIIIZZ()
            if (r1 == 0) goto L4
            X.4Zj r0 = new java.lang.Runnable() { // from class: X.4Zj
                static {
                    /*
                        X.4Zj r0 = new X.4Zj
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:X.4Zj) X.4Zj.LJLIL X.4Zj
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.RunnableC111554Zj.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.RunnableC111554Zj.<init>():void");
                }

                @Override // java.lang.Runnable
                public final void run() {
                    /*
                        r2 = this;
                        X.C4VN.LIZ()     // Catch: java.lang.Throwable -> L8
                        r0 = 2
                        X.C110154Tz.LIZIZ(r0)     // Catch: java.lang.Throwable -> L8
                        goto Lf
                    L8:
                        r1 = move-exception
                        boolean r0 = X.C39223FaN.LIZ(r1)
                        if (r0 == 0) goto L10
                    Lf:
                        return
                    L10:
                        throw r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.RunnableC111554Zj.run():void");
                }
            }
            r1.runOnUiThread(r0)
            goto L4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.CommentRefactorPreloadTask.run(android.content.Context):void");
    }
}

package com.ss.android.ugc.aweme.emoji.systembigemoji;

import X.C0RN;
import X.C105734Cz;
import X.C221108m2;
import X.C4FD;
import X.C62822Ol8;
import X.C73411SrX;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import Y.ARunnableS37S0100000_1;
import com.ss.android.ugc.aweme.emoji.emojichoose.model.Resources;
import com.ss.android.ugc.aweme.emoji.model.Emoji;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class PreloadBigEmojiTask implements EE1 {
    public final C105734Cz LJLIL;
    public boolean LJLILLLLZI;
    public C73411SrX LJLJJI;
    public final ARunnableS37S0100000_1 LJLJI = new ARunnableS37S0100000_1(this, 24);
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 55));
    public final C62822Ol8 LJLJJLL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 56));

    @Override // X.EEY
    public final String key() {
        return "PreloadBigEmojiTask";
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

    public final void LIZLLL() {
        LinkedHashMap<Resources, List<Emoji>> linkedHashMap = this.LJLIL.LIZIZ;
        if (linkedHashMap == null || linkedHashMap.isEmpty()) {
            return;
        }
        for (Map.Entry<Resources, List<Emoji>> entry : this.LJLIL.LIZIZ.entrySet()) {
            Resources resources = entry.getKey();
            List<Emoji> value = entry.getValue();
            if (value == null || value.isEmpty()) {
                o.LJIIIZ(resources, "resources");
                C4FD.LJLIL.LJ(resources);
            }
        }
    }

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.EE1
    public final EFK type() {
        return EFK.BOOT_FINISH;
    }

    public PreloadBigEmojiTask(C105734Cz c105734Cz) {
        this.LJLIL = c105734Cz;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00bf, code lost:
    
        if (((java.lang.Number) r2.getValue()).floatValue() > 6.0f) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000c, code lost:
    
        if (X.C35478DwA.LIZIZ() != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000e, code lost:
    
        r2 = 3;
     */
    @Override // X.EEY
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run(android.content.Context r9) {
        /*
            r8 = this;
            boolean r0 = X.DPI.LIZ()
            r4 = 1
            if (r0 == 0) goto L9c
            boolean r0 = X.C35478DwA.LIZIZ()
            if (r0 == 0) goto Lae
        Le:
            r2 = 3
        Lf:
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "PreloadBigEmojiTask begin preloadBigEmoji,abType="
            r1.append(r0)
            r1.append(r2)
            java.lang.String r1 = X.X1D.LIZIZ(r1)
            java.lang.String r0 = "PreloadBigEmojiTask"
            X.C34B.LJI(r0, r1)
            if (r2 != 0) goto L2a
            r8.LIZLLL()
        L29:
            return
        L2a:
            X.4hp<T> r3 = new X.InterfaceC64592gB() { // from class: X.4hp
                static {
                    /*
                        X.4hp r0 = new X.4hp
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:X.4hp<T>) X.4hp.LJLIL X.4hp
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C116574hp.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C116574hp.<init>():void");
                }

                @Override // X.InterfaceC64592gB
                public final void accept(java.lang.Object r3) {
                    /*
                        r2 = this;
                        java.lang.Throwable r3 = (java.lang.Throwable) r3
                        java.lang.String r0 = "throwable"
                        kotlin.jvm.internal.o.LJIIIZ(r3, r0)
                        java.lang.String r1 = "PreloadBigEmojiTask"
                        java.lang.String r0 = "preloadWhenBackground，onError:"
                        X.C34B.LIZLLL(r1, r0, r3)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C116574hp.accept(java.lang.Object):void");
                }
            }
            if (r2 != r4) goto L85
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.DAYS
            r0 = 7
            long r6 = r2.toMillis(r0)
            long r4 = java.lang.System.currentTimeMillis()
            X.Ol8 r0 = r8.LJLJJL
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            long r4 = r4 - r0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 <= 0) goto L60
            long r4 = java.lang.System.currentTimeMillis()
            X.Ol8 r0 = r8.LJLJJLL
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            long r4 = r4 - r0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 > 0) goto L7f
        L60:
            r1 = 1
        L61:
            java.lang.String r0 = "isFirstInstallAndFirstLaunch()"
            boolean r0 = defpackage.s1.LIZLLL(r0)
            if (r0 != 0) goto L6b
            if (r1 == 0) goto L81
        L6b:
            X.T06 r2 = X.C84763XOl.LJI()
            Y.AfS53S0100000_1 r1 = new Y.AfS53S0100000_1
            r0 = 67
            r1.<init>(r8, r0)
            X.3kP r0 = r2.LJJJLIIL(r1, r3)
            X.SrX r0 = (X.C73411SrX) r0
            r8.LJLJJI = r0
            goto L29
        L7f:
            r1 = 0
            goto L61
        L81:
            r8.LIZLLL()
            goto L29
        L85:
            r0 = 2
            if (r2 != r0) goto L29
            X.T06 r2 = X.C84763XOl.LJI()
            Y.AfS53S0100000_1 r1 = new Y.AfS53S0100000_1
            r0 = 67
            r1.<init>(r8, r0)
            X.3kP r0 = r2.LJJJLIIL(r1, r3)
            X.SrX r0 = (X.C73411SrX) r0
            r8.LJLJJI = r0
            goto L29
        L9c:
            X.Ol8 r2 = X.C116584hq.LIZ
            java.lang.Object r0 = r2.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            float r1 = r0.floatValue()
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto Lb1
        Lae:
            r2 = 0
            goto Lf
        Lb1:
            java.lang.Object r0 = r2.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            float r1 = r0.floatValue()
            r0 = 1086324736(0x40c00000, float:6.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto Lae
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.emoji.systembigemoji.PreloadBigEmojiTask.run(android.content.Context):void");
    }
}

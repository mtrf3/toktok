package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* renamed from: X.5Os, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C134265Os implements T4O {
    public final InterfaceC88475Ynv<Long, Long, String, Effect, Boolean, Integer> LIZ;

    @Override // X.T4O
    public final int LIZIZ() {
        return LIZJ(null, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C134265Os(InterfaceC88475Ynv<? super Long, ? super Long, ? super String, ? super Effect, ? super Boolean, Integer> interfaceC88475Ynv) {
        this.LIZ = interfaceC88475Ynv;
    }

    @Override // X.T4O
    public final int LIZ(Effect sticker, boolean z) {
        o.LJIIIZ(sticker, "sticker");
        return LIZJ(sticker, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        if (r8 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
    
        if (r12 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        r0 = r12.getEffectId();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003e, code lost:
    
        if (r0 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0040, code lost:
    
        r0 = X.C38350F3i.LJJIZ(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0044, code lost:
    
        if (r0 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0046, code lost:
    
        r3 = r0.longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0062, code lost:
    
        return r11.LIZ.invoke(java.lang.Long.valueOf(r1), java.lang.Long.valueOf(r3), r8, r12, java.lang.Boolean.valueOf(r13)).intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0068, code lost:
    
        r8 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0065, code lost:
    
        if (r12 != null) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LIZJ(com.ss.android.ugc.effectmanager.effect.model.Effect r12, boolean r13) {
        /*
            r11 = this;
            X.5NP r2 = X.C82891Wg3.LIZLLL()
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "EffectStickerLoader#setSticker:effectId:"
            r1.append(r0)
            r9 = r12
            if (r9 == 0) goto L6b
            java.lang.String r0 = r9.getEffectId()
        L14:
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            r2.i(r0)
            r3 = 0
            if (r9 == 0) goto L63
            java.lang.String r0 = r9.getEffectId()
            if (r0 == 0) goto L63
            java.lang.Long r0 = X.C38350F3i.LJJIZ(r0)
            if (r0 == 0) goto L63
            long r1 = r0.longValue()
        L32:
            java.lang.String r8 = r9.getUnzipPath()
            if (r8 == 0) goto L68
        L38:
            if (r9 == 0) goto L4a
            java.lang.String r0 = r9.getEffectId()
            if (r0 == 0) goto L4a
            java.lang.Long r0 = X.C38350F3i.LJJIZ(r0)
            if (r0 == 0) goto L4a
            long r3 = r0.longValue()
        L4a:
            X.Ynv<java.lang.Long, java.lang.Long, java.lang.String, com.ss.android.ugc.effectmanager.effect.model.Effect, java.lang.Boolean, java.lang.Integer> r5 = r11.LIZ
            java.lang.Long r6 = java.lang.Long.valueOf(r1)
            java.lang.Long r7 = java.lang.Long.valueOf(r3)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r13)
            java.lang.Object r0 = r5.invoke(r6, r7, r8, r9, r10)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            return r0
        L63:
            r1 = 0
            if (r9 == 0) goto L68
            goto L32
        L68:
            java.lang.String r8 = ""
            goto L38
        L6b:
            r0 = 0
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C134265Os.LIZJ(com.ss.android.ugc.effectmanager.effect.model.Effect, boolean):int");
    }
}

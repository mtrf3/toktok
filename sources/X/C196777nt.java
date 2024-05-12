package X;

import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.profile.model.User;

/* renamed from: X.7nt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C196777nt implements LEA {
    public static final C196777nt LJLIL;
    public static final MutableLiveData<Boolean> LJLILLLLZI;
    public static boolean LJLJI;
    public static final C62822Ol8 LJLJJI;
    public static CME LJLJJL;

    static {
        C196777nt c196777nt = new C196777nt();
        LJLIL = c196777nt;
        LJLILLLLZI = new MutableLiveData<>(Boolean.FALSE);
        LJLJJI = C221108m2.LIZIZ(C197077oN.INSTANCE);
        HG3.LJIIL();
        HG3.LJLJL.LJIILJJIL(c196777nt);
        LIZ();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x002c, code lost:
    
        if (r3 <= 0) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ() {
        /*
            X.Ol8 r0 = X.C196777nt.LJLJJI     // Catch: java.lang.Throwable -> L3d
            java.lang.Object r1 = r0.getValue()     // Catch: java.lang.Throwable -> L3d
            android.media.AudioManager r1 = (android.media.AudioManager) r1     // Catch: java.lang.Throwable -> L3d
            if (r1 == 0) goto L27
            r0 = 3
            int r3 = r1.getStreamVolume(r0)     // Catch: java.lang.Throwable -> L3d
        Lf:
            androidx.lifecycle.MutableLiveData<java.lang.Boolean> r2 = X.C196777nt.LJLILLLLZI     // Catch: java.lang.Throwable -> L3d
            java.lang.Object r1 = r2.getValue()     // Catch: java.lang.Throwable -> L3d
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L3d
            if (r1 != 0) goto L1b
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L3d
        L1b:
            java.lang.String r0 = "muteState.value ?: false"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)     // Catch: java.lang.Throwable -> L3d
            boolean r0 = r1.booleanValue()     // Catch: java.lang.Throwable -> L3d
            if (r0 == 0) goto L2c
            goto L29
        L27:
            r3 = 0
            goto Lf
        L29:
            if (r3 > 0) goto L2e
            goto L37
        L2c:
            if (r3 > 0) goto L37
        L2e:
            r0 = r0 ^ 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L3d
            r2.setValue(r0)     // Catch: java.lang.Throwable -> L3d
        L37:
            X.UCe r0 = X.C76800UCe.LIZ     // Catch: java.lang.Throwable -> L3d
            X.C3C5.m7constructorimpl(r0)     // Catch: java.lang.Throwable -> L3d
            goto L45
        L3d:
            r0 = move-exception
            X.3C4 r0 = X.C141335gf.LIZ(r0)
            X.C3C5.m7constructorimpl(r0)
        L45:
            X.C3C5.m10exceptionOrNullimpl(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C196777nt.LIZ():void");
    }

    @Override // X.LEA
    public final void onAccountResult(int i, boolean z, int i2, User user) {
        LJLILLLLZI.setValue(Boolean.FALSE);
    }
}

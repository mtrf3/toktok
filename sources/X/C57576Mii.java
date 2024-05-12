package X;

import com.bytedance.mt.protector.impl.PatternProtector;
import kotlin.jvm.internal.o;

/* renamed from: X.Mii, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57576Mii implements InterfaceC57579Mil {
    public static boolean LIZJ;
    public static final C57576Mii LIZ = new C57576Mii();
    public static AbstractC72932td<? extends java.util.Map<String, EMX>> LIZIZ = C33X.LIZ;
    public static String LIZLLL = "find_friends";

    public static final void LIZJ(InterfaceC237529Tw repository) {
        o.LJIIIZ(repository, "repository");
        if (!EnumC58046MqI.CONTACT.isGrant() || !(LIZIZ instanceof C33X) || LIZJ) {
            return;
        }
        LIZJ = true;
        C10K.LIZJ(LTS.LJLIL);
    }

    @Override // X.InterfaceC57579Mil
    public final String LIZ(String hashPhoneNum) {
        String str;
        boolean z;
        int length;
        EMX emx;
        o.LJIIIZ(hashPhoneNum, "hashPhoneNum");
        if (C77266UUc.LIZIZ.LJIILLIIL().LJ()) {
            AbstractC72932td<? extends java.util.Map<String, EMX>> abstractC72932td = LIZIZ;
            if (!(abstractC72932td instanceof C33X) && !(abstractC72932td instanceof C72922tc)) {
                java.util.Map<String, EMX> LIZ2 = abstractC72932td.LIZ();
                if (LIZ2 == null || (emx = LIZ2.get(hashPhoneNum)) == null || (str = emx.getContactName()) == null) {
                    str = "";
                }
                String LIZ3 = C27484AqW.LIZ(str);
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("get ");
                LIZ4.append(hashPhoneNum);
                LIZ4.append(" -> ");
                LIZ4.append(LIZ3);
                C221018lt.LIZ("[UserCard]", X1D.LIZIZ(LIZ4));
                if (LIZ3.length() == 0) {
                    throw new C57578Mik(EnumC57577Mij.NOT_FOUND);
                }
                if (LIZ3.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    String LJJJJZ = ujb.o.LJJJJZ(LIZ3, " ", "", false);
                    if (LJJJJZ.charAt(0) != '+' ? !(2 > (length = LJJJJZ.length()) || length >= 18 || !new OJD("[0-9.-]+").matches(LJJJJZ)) : C66513Q8n.LIZJ().LJII(LJJJJZ)) {
                        throw new C57578Mik(EnumC57577Mij.PHONE_FILTER);
                    }
                }
                if (LIZ3.length() == 0 || !PatternProtector.compile("(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])", 2).matcher(ujb.o.LJJJJZ(LIZ3, " ", "", false)).matches()) {
                    return LIZ3;
                }
                throw new C57578Mik(EnumC57577Mij.EMAIL);
            }
            LIZJ(UTK.LIZIZ.LIZJ());
            throw new C57578Mik(EnumC57577Mij.ON_PROCESSING);
        }
        throw new C57578Mik(EnumC57577Mij.NO_GRANT);
    }

    @Override // X.InterfaceC57579Mil
    public final Object LIZIZ(InterfaceC237529Tw interfaceC237529Tw, String str, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        if (!EnumC58046MqI.CONTACT.isGrant() || !(LIZIZ instanceof C33X)) {
            return C76800UCe.LIZ;
        }
        C221018lt.LIZ("[UserCard]", "trigger read for scene");
        LIZLLL = str;
        Object LIZLLL2 = LIZLLL(interfaceC237529Tw, str, interfaceC67352kd);
        if (LIZLLL2 == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return LIZLLL2;
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:1|(2:3|(11:5|6|7|(1:(1:13)(2:10|11))(3:24|25|(1:27))|14|15|(1:17)|18|(1:20)|21|22))|30|6|7|(0)(0)|14|15|(0)|18|(0)|21|22) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0054, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0055, code lost:
    
        r4 = X.C141335gf.LIZ(r0);
        X.C3C5.m7constructorimpl(r4);
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(X.InterfaceC237529Tw r7, java.lang.String r8, X.InterfaceC67352kd<? super X.C76800UCe> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof X.C54348LUq
            if (r0 == 0) goto L1e
            r5 = r9
            X.LUq r5 = (X.C54348LUq) r5
            int r2 = r5.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L1e
            int r2 = r2 - r1
            r5.LJLJI = r2
        L12:
            java.lang.Object r4 = r5.LJLIL
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLJI
            r2 = 1
            if (r0 == 0) goto L2c
            if (r0 != r2) goto L24
            goto L4b
        L1e:
            X.LUq r5 = new X.LUq
            r5.<init>(r6, r9)
            goto L12
        L24:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2c:
            X.C141335gf.LIZJ(r4)
            X.2tc r0 = new X.2tc
            r0.<init>()
            X.C57576Mii.LIZIZ = r0
            X.Mqv r1 = X.C58084Mqu.LIZ(r8)     // Catch: java.lang.Throwable -> L54
            r0 = 2
            X.C58084Mqu.LIZIZ(r1, r0)     // Catch: java.lang.Throwable -> L54
            X.Mqv r0 = X.C58084Mqu.LIZ(r8)     // Catch: java.lang.Throwable -> L54
            r5.LJLJI = r2     // Catch: java.lang.Throwable -> L54
            java.lang.Object r4 = r7.LIZJ(r0, r5)     // Catch: java.lang.Throwable -> L54
            if (r4 != r3) goto L4e
            return r3
        L4b:
            X.C141335gf.LIZJ(r4)     // Catch: java.lang.Throwable -> L54
        L4e:
            X.9U5 r4 = (X.C9U5) r4     // Catch: java.lang.Throwable -> L54
            X.C3C5.m7constructorimpl(r4)     // Catch: java.lang.Throwable -> L54
            goto L5c
        L54:
            r0 = move-exception
            X.3C4 r4 = X.C141335gf.LIZ(r0)
            X.C3C5.m7constructorimpl(r4)
        L5c:
            boolean r0 = X.C3C5.m13isSuccessimpl(r4)
            java.lang.String r2 = "[UserCard]"
            if (r0 == 0) goto L77
            r0 = r4
            X.9U5 r0 = (X.C9U5) r0
            X.2tb r1 = new X.2tb
            java.util.Map r0 = r0.getHashNationalNumberMap()
            r1.<init>(r0)
            X.C57576Mii.LIZIZ = r1
            java.lang.String r0 = "setup contact state success!"
            X.C221018lt.LJFF(r2, r0)
        L77:
            java.lang.Throwable r1 = X.C3C5.m10exceptionOrNullimpl(r4)
            if (r1 == 0) goto L89
            X.3C1 r0 = new X.3C1
            r0.<init>(r1)
            X.C57576Mii.LIZIZ = r0
            java.lang.String r0 = "setup contact state fail!"
            X.C221018lt.LIZJ(r2, r0, r1)
        L89:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57576Mii.LIZLLL(X.9Tw, java.lang.String, X.2kd):java.lang.Object");
    }
}

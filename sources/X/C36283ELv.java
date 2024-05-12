package X;

import com.bytedance.pns.psi.PsiEncrypt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS153S0200000_6;
import kotlin.jvm.internal.o;

/* renamed from: X.ELv, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36283ELv {
    public final C36284ELw LIZ;
    public final EM2 LIZIZ;
    public final C62822Ol8 LIZJ;

    public C36283ELv(C36284ELw contactUploader, EM2 monitor) {
        o.LJIIIZ(contactUploader, "contactUploader");
        o.LJIIIZ(monitor, "monitor");
        this.LIZ = contactUploader;
        this.LIZIZ = monitor;
        this.LIZJ = C221108m2.LIZIZ(C36285ELx.LJLIL);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(X.C36281ELt r18, X.InterfaceC67352kd<? super com.ss.android.ugc.aweme.relation.auth.model.PsiUploadEncryptContactResponseV2> r19) {
        /*
            Method dump skipped, instructions count: 504
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36283ELv.LJ(X.ELt, X.2kd):java.lang.Object");
    }

    public static void LIZ(C36283ELv c36283ELv, List list, byte[] bArr) {
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new AqS153S0200000_6((C36286ELy) it.next(), bArr, 14));
        }
        C78977Uz7.LJJLIIIJLJLI(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x013d A[LOOP:1: B:24:0x0137->B:26:0x013d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x018f A[LOOP:3: B:40:0x0189->B:42:0x018f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0122 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(java.util.Set<java.lang.String> r14, java.util.Set<java.lang.String> r15, X.InterfaceC67352kd<? super X.OSZ<? extends java.util.HashSet<java.lang.String>, ? extends java.util.HashSet<java.lang.String>>> r16) {
        /*
            Method dump skipped, instructions count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36283ELv.LIZLLL(java.util.Set, java.util.Set, X.2kd):java.lang.Object");
    }

    public static final void LIZIZ(long j, long j2, C36286ELy c36286ELy, byte[] bArr, byte[] bArr2) {
        Boolean valueOf;
        PsiEncrypt.Companion companion = PsiEncrypt.LIZ;
        byte[] bArr3 = c36286ELy.LIZLLL;
        if (bArr3 != null) {
            byte[] target = companion.unBlind(bArr3, bArr);
            boolean z = false;
            if (bArr2.length == 0) {
                valueOf = Boolean.FALSE;
            } else {
                o.LJIIIZ(target, "target");
                ArrayList arrayList = new ArrayList();
                Iterator<Integer> it = new C40517FvF(0, (int) Math.max(j2 - 1, 0L)).iterator();
                while (((C118234kV) it).hasNext()) {
                    int nextInt = ((AbstractC118224kU) it).nextInt();
                    PsiEncrypt.Companion companion2 = PsiEncrypt.LIZ;
                    byte b = (byte) nextInt;
                    int length = target.length;
                    Arrays.copyOf(target, length + 1)[length] = b;
                    arrayList.add(Integer.valueOf((int) ((((int) companion2.murmur3_32(r0)) & 4294967295L) % (((int) j) & 4294967295L))));
                }
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        int intValue = ((Number) it2.next()).intValue();
                        int i = intValue % 8;
                        if (((1 << (7 - (i + ((((i ^ 8) & ((-i) | i)) >> 31) & 8)))) & bArr2[intValue / 8]) == 0) {
                            break;
                        }
                    } else {
                        z = true;
                        break;
                    }
                }
                valueOf = Boolean.valueOf(z);
            }
            c36286ELy.LJ = valueOf;
            return;
        }
        o.LJIJI("blind");
        throw null;
    }

    public static void LIZJ(C36283ELv c36283ELv, List list, byte[] bArr, long j, long j2, byte[] bArr2) {
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            bArr = bArr;
            arrayList.add(new C36287ELz(j, j2, (C36286ELy) it.next(), bArr2, bArr));
        }
        C78977Uz7.LJJLIIIJLJLI(arrayList);
    }
}

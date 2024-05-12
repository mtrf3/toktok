package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.LTf, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54311LTf implements InterfaceC54240LQm {
    public static final C54311LTf LIZ = new C54311LTf();
    public static final C62822Ol8 LIZIZ;

    static {
        C221108m2.LIZIZ(C54314LTi.LJLIL);
        LIZIZ = C221108m2.LIZIZ(C54312LTg.LJLIL);
    }

    public static boolean LJFF() {
        int intValue = ((Number) C52756KnA.LIZ.getValue()).intValue();
        if (intValue == 1 || intValue == 2) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC54240LQm
    public final int LIZ() {
        if (C53405Kxd.LIZJ()) {
            return 0;
        }
        return C54362LVe.LJIILJJIL(99);
    }

    @Override // X.InterfaceC54240LQm
    public final boolean LIZIZ() {
        int i;
        List LLJILJILJ = ORZ.LLJILJILJ(LVB.LIZJ());
        if (LJFF()) {
            ArrayList arrayList = new ArrayList();
            Iterator it = ((ArrayList) LLJILJILJ).iterator();
            while (it.hasNext()) {
                Object next = it.next();
                int intValue = ((Number) next).intValue();
                if (intValue != 210 && intValue != 214) {
                    arrayList.add(next);
                }
            }
            LLJILJILJ = ORZ.LLJILJILJ(arrayList);
        }
        C53405Kxd.LIZ(LLJILJILJ);
        C54313LTh c54313LTh = new C54313LTh();
        int[] LLJ = ORZ.LLJ(LLJILJILJ);
        int[][] iArr = c54313LTh.LIZIZ;
        int i2 = c54313LTh.LIZ;
        int i3 = i2 + 1;
        iArr[i2] = LLJ;
        int[] iArr2 = c54313LTh.LIZJ;
        c54313LTh.LIZ = i3 + 1;
        iArr2[i3] = 1000;
        C118234kV it2 = new C40517FvF(0, 1).iterator();
        int i4 = 0;
        while (it2.LJLJI) {
            int[] iArr3 = c54313LTh.LIZIZ[it2.nextInt()];
            if (iArr3 != null) {
                i = iArr3.length;
            } else {
                i = 1;
            }
            i4 += i;
        }
        int[] iArr4 = new int[i4];
        C118234kV it3 = new C40517FvF(0, 1).iterator();
        int i5 = 0;
        int i6 = 0;
        while (it3.LJLJI) {
            int nextInt = it3.nextInt();
            int[] iArr5 = c54313LTh.LIZIZ[nextInt];
            if (iArr5 != null) {
                if (i5 < nextInt) {
                    int i7 = nextInt - i5;
                    System.arraycopy(iArr2, i5, iArr4, i6, i7);
                    i6 += i7;
                }
                int length = iArr5.length;
                System.arraycopy(iArr5, 0, iArr4, i6, length);
                i6 += length;
                i5 = nextInt + 1;
            }
        }
        if (i5 < 2) {
            System.arraycopy(iArr2, i5, iArr4, i6, 2 - i5);
        }
        if (!C54362LVe.LJIIZILJ(iArr4) && (!C54362LVe.LJIIZILJ(101) || C53405Kxd.LIZJ())) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC54240LQm
    public final int LIZJ() {
        List LLJILJILJ;
        int LIZ2 = LIZ();
        if (LJFF()) {
            List LIZLLL = LVB.LIZLLL();
            ArrayList arrayList = new ArrayList();
            for (Object obj : LIZLLL) {
                int intValue = ((Number) obj).intValue();
                if (intValue != 210 && intValue != 214) {
                    arrayList.add(obj);
                }
            }
            LLJILJILJ = ORZ.LLJILJILJ(arrayList);
        } else {
            LLJILJILJ = ORZ.LLJILJILJ(LVB.LIZLLL());
        }
        C53405Kxd.LIZ(LLJILJILJ);
        int[] LLJ = ORZ.LLJ(LLJILJILJ);
        return C54362LVe.LJIILIIL(Arrays.copyOf(LLJ, LLJ.length)) + LIZ2;
    }

    @Override // X.InterfaceC54240LQm
    public final int LJ() {
        int LIZ2 = LIZ();
        int[] iArr = (int[]) LIZIZ.getValue();
        return C54362LVe.LJIILJJIL(Arrays.copyOf(iArr, iArr.length)) + LIZ2;
    }

    @Override // X.InterfaceC54240LQm
    public final boolean LIZLLL() {
        return C54316LTk.LIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0050, code lost:
    
        if (((java.util.List) com.ss.android.ugc.aweme.inbox.ab.ReverseInboxNotifyMetaSetting.LIZLLL.getValue()).contains(java.lang.Integer.valueOf(r4)) != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0032, code lost:
    
        if (r1.groups.contains(java.lang.Integer.valueOf(r4)) == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJI(int r4) {
        /*
            int r0 = X.C53405Kxd.LIZIZ()
            r2 = 1
            r3 = 0
            if (r0 == r2) goto L52
            int r1 = X.C53405Kxd.LIZIZ()
            r0 = 4
            if (r1 == r0) goto L52
            int r1 = X.C53405Kxd.LIZIZ()
            r0 = 3
            if (r1 != r0) goto L34
            com.ss.android.ugc.aweme.inbox.ab.ReverseInboxNotifyMetaSetting r0 = com.ss.android.ugc.aweme.inbox.ab.ReverseInboxNotifyMetaSetting.LIZ
            r0.getClass()
            X.Ol8 r0 = com.ss.android.ugc.aweme.inbox.ab.ReverseInboxNotifyMetaSetting.LIZJ
            java.lang.Object r1 = r0.getValue()
            com.ss.android.ugc.aweme.inbox.ab.ReverseInboxNotifyMetaSetting$Meta r1 = (com.ss.android.ugc.aweme.inbox.ab.ReverseInboxNotifyMetaSetting.Meta) r1
            java.lang.String r0 = "ReverseInboxNotifyMetaSetting.value"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            java.util.List<java.lang.Integer> r1 = r1.groups
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L52
        L34:
            int r1 = X.C53405Kxd.LIZIZ()
            r0 = 2
            if (r1 != r0) goto L53
            com.ss.android.ugc.aweme.inbox.ab.ReverseInboxNotifyMetaSetting r0 = com.ss.android.ugc.aweme.inbox.ab.ReverseInboxNotifyMetaSetting.LIZ
            r0.getClass()
            X.Ol8 r0 = com.ss.android.ugc.aweme.inbox.ab.ReverseInboxNotifyMetaSetting.LIZLLL
            java.lang.Object r1 = r0.getValue()
            java.util.List r1 = (java.util.List) r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L53
        L52:
            return r3
        L53:
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, com.ss.android.ugc.aweme.notice.api.bean.NoticeGroupAttrs> r1 = X.LVB.LIZIZ
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            java.lang.Object r0 = r1.get(r0)
            com.ss.android.ugc.aweme.notice.api.bean.NoticeGroupAttrs r0 = (com.ss.android.ugc.aweme.notice.api.bean.NoticeGroupAttrs) r0
            if (r0 == 0) goto L6f
            X.LSw r1 = r0.showType
        L63:
            X.LSw r0 = X.EnumC54302LSw.ShowNum
            if (r1 != r0) goto L68
        L67:
            return r2
        L68:
            r0 = 99
            if (r4 != r0) goto L6d
            goto L67
        L6d:
            r2 = 0
            goto L67
        L6f:
            r1 = 0
            goto L63
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54311LTf.LJI(int):boolean");
    }
}

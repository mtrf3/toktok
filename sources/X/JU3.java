package X;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public final class JU3 {
    public JU2 LIZ;
    public JU4 LIZIZ;
    public JUA LIZJ;

    public JU3() {
        int i = 0;
        this.LIZ = new JU2(i);
        this.LIZIZ = new JU4(i);
    }

    public final void LIZ(JUC juc) {
        boolean z;
        Object ju2;
        List<InterfaceC49220JTk> list;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(hashCode());
        LIZ.append(" receive intent ");
        LIZ.append(juc);
        X1D.LIZIZ(LIZ);
        if (juc instanceof JU6) {
            JU4 ju4 = this.LIZIZ;
            JU6 ju6 = (JU6) juc;
            List<InterfaceC49148JQq> list2 = ju6.LIZ;
            boolean z2 = ju6.LIZIZ;
            ju4.getClass();
            ju2 = new JU4(list2, z2);
        } else if (juc instanceof JU5) {
            JU2 ju22 = this.LIZ;
            JU5 ju5 = (JU5) juc;
            if (ju5.LIZ == 1) {
                z = true;
            } else {
                z = false;
            }
            List<InterfaceC49220JTk> list3 = ju5.LIZIZ;
            if (list3 == null) {
                list3 = ju22.LIZIZ;
            }
            ju22.getClass();
            ju2 = new JU2(z, list3);
        } else {
            throw new C162476Zf();
        }
        if (ju2 instanceof JU2) {
            JU2 ju23 = (JU2) ju2;
            this.LIZ = ju23;
            if (!ju23.LIZ) {
                JUA jua = this.LIZJ;
                if (jua != null) {
                    jua.pause();
                    return;
                }
                return;
            }
            List<InterfaceC49220JTk> list4 = ju23.LIZIZ;
            if (list4 != null) {
                for (InterfaceC49220JTk interfaceC49220JTk : list4) {
                    if (!interfaceC49220JTk.isEnable()) {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append(interfaceC49220JTk);
                        LIZ2.append(" status is not ok so return");
                        X1D.LIZIZ(LIZ2);
                        JUA jua2 = this.LIZJ;
                        if (jua2 == null) {
                            return;
                        }
                        jua2.pause();
                        return;
                    }
                }
            }
            JUA jua3 = this.LIZJ;
            if (jua3 == null) {
                return;
            }
            jua3.resume();
            return;
        }
        if (!(ju2 instanceof JU4)) {
            return;
        }
        JU4 ju42 = (JU4) ju2;
        InterfaceC49220JTk interfaceC49220JTk2 = null;
        if (!ju42.LIZIZ && (list = this.LIZ.LIZIZ) != null) {
            Iterator<InterfaceC49220JTk> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                InterfaceC49220JTk next = it.next();
                if (!next.isEnable()) {
                    interfaceC49220JTk2 = next;
                    break;
                }
            }
        }
        this.LIZIZ = ju42;
        List<InterfaceC49148JQq> list5 = ju42.LIZ;
        if (interfaceC49220JTk2 != null) {
            if (list5 != null) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("has no ready state is ");
                LIZ3.append(interfaceC49220JTk2);
                X1D.LIZIZ(LIZ3);
                JUA jua4 = this.LIZJ;
                if (jua4 == null) {
                    return;
                }
                jua4.LIZ(list5);
                return;
            }
        } else if (list5 != null && !list5.isEmpty()) {
            JUA jua5 = this.LIZJ;
            if (jua5 == null) {
                return;
            }
            jua5.y0(list5);
            return;
        }
        JUA jua6 = this.LIZJ;
        if (jua6 != null) {
            jua6.pause();
        }
        JUA jua7 = this.LIZJ;
        if (jua7 == null) {
            return;
        }
        jua7.LIZIZ();
    }
}

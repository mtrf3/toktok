package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.g;
import com.google.gson.internal.b;
import com.google.gson.j;
import com.google.gson.m;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.EAj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35985EAj implements InterfaceC35988EAm {
    public static final C35985EAj LIZ = new C35985EAj();

    @Override // X.InterfaceC35988EAm
    public final List<Integer> LIZ() {
        return C47261Igj.LJJIJIIJI(102600, 102601, 102605);
    }

    @Override // X.InterfaceC35988EAm
    public final boolean LIZJ() {
        return true;
    }

    @Override // X.InterfaceC35988EAm
    public final boolean LIZLLL(List<? extends Object> list) {
        Object obj;
        Object obj2;
        if (list != null && list.size() == 3 && !(!o.LJ(String.valueOf(ListProtector.get(list, 0)), OHQ.LIZIZ)) && (obj = ListProtector.get(list, 1)) != null && (obj instanceof Object[])) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length != 0 && (obj2 = objArr[0]) != null && (obj2 instanceof Object[])) {
                Object obj3 = ListProtector.get(list, 2);
                if (obj3 != null) {
                    java.util.Set other = ORZ.LLJJ((Iterable) obj3);
                    o.LJIIIZ(other, "other");
                    java.util.Set LJLIIL = ORY.LJLIIL((Object[]) obj2);
                    C65777Prh.LIZ(LJLIIL).retainAll(b.LJII(other, LJLIIL));
                    return !LJLIIL.isEmpty();
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
            }
        }
        return false;
    }

    @Override // X.InterfaceC35988EAm
    public final java.util.Map<String, Object> LJ(Object[] objArr) {
        Object obj;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (objArr != null && objArr.length != 0 && (obj = objArr[0]) != null && (obj instanceof Object[])) {
            linkedHashMap.put(OHQ.LIZIZ, ORY.LJJZZIII((Object[]) obj));
        }
        return linkedHashMap;
    }

    @Override // X.InterfaceC35988EAm
    public final boolean LIZIZ(Object[] objArr, m mVar) {
        m mVar2;
        j LJJIJ;
        boolean z = false;
        if (objArr == null || objArr.length == 0) {
            return false;
        }
        j LJJIJ2 = mVar.LJJIJ("fuse_result");
        g gVar = null;
        if (LJJIJ2 != null) {
            mVar2 = LJJIJ2.LJIIZILJ();
        } else {
            mVar2 = null;
        }
        Object obj = objArr[0];
        if (mVar2 != null && (LJJIJ = mVar2.LJJIJ(OHQ.LIZIZ)) != null) {
            gVar = LJJIJ.LJIILLIIL();
        }
        if (obj != null && gVar != null && (obj instanceof Object[])) {
            Object[] objArr2 = (Object[]) obj;
            int size = gVar.size();
            z = false;
            for (int i = 0; i < size; i++) {
                j LJJIIZ = gVar.LJJIIZ(i);
                o.LJIIIIZZ(LJJIIZ, "blockPermissions[i]");
                String LJJIFFI = LJJIIZ.LJJIFFI();
                Object[] objArr3 = (Object[]) obj;
                int length = objArr3.length;
                int i2 = 0;
                int i3 = 0;
                while (i2 < length) {
                    int i4 = i3 + 1;
                    if (o.LJ(objArr3[i2], LJJIFFI)) {
                        objArr2[i3] = "";
                        z = true;
                    }
                    i2++;
                    i3 = i4;
                }
            }
        }
        return z;
    }
}

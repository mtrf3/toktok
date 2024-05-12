package X;

import com.google.gson.j;
import com.google.gson.m;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.Pzi, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66274Pzi implements J1T {
    public static final C66274Pzi LJLIL = new C66274Pzi();

    @Override // X.J1T
    public final boolean LIZ(InterfaceC66286Pzu store, String storeKey, int i, String str, String str2, String str3, C65300Pk0 c65300Pk0) {
        m LJIIZILJ;
        j LJJIJ;
        o.LJIIIZ(store, "store");
        o.LJIIIZ(storeKey, "storeKey");
        java.util.Map<String, ?> LJJLIIIIJ = C113554cx.LJJLIIIIJ(new OSZ(EnumC66276Pzk.SOURCE.getValue(), "guard"), new OSZ(EnumC66276Pzk.API_ID.getValue(), Integer.valueOf(i)), new OSZ(EnumC66276Pzk.IS_REFLECTION.getValue(), Boolean.valueOf(c65300Pk0.LIZ)), new OSZ(EnumC66276Pzk.CLASS_NAME.getValue(), str), new OSZ(EnumC66276Pzk.MEMBER_NAME.getValue(), str2), new OSZ(EnumC66276Pzk.RETURN_TYPE.getValue(), str3));
        InterfaceC66073PwT interfaceC66073PwT = C66273Pzh.LIZIZ;
        if (interfaceC66073PwT == null) {
            return false;
        }
        Q11 LIZ = interfaceC66073PwT.LIZ(LJJLIIIIJ);
        if (LIZ.LIZ == 0) {
            Iterator<C39522FfC> it = LIZ.LJI.iterator();
            while (it.hasNext()) {
                C39522FfC next = it.next();
                j jVar = next.LJ;
                String str4 = null;
                if (jVar != null && (LJIIZILJ = jVar.LJIIZILJ()) != null && (LJJIJ = LJIIZILJ.LJJIJ(EnumC66278Pzm.ACTION.getValue())) != null) {
                    str4 = LJJIJ.LJJIFFI();
                }
                if (next.LIZ == 0 && next.LIZJ != null && o.LJ(str4, "update_cache")) {
                    return true;
                }
            }
        }
        return false;
    }
}

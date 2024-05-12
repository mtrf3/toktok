package X;

import java.util.Comparator;
import java.util.HashMap;

/* renamed from: X.Oen, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62429Oen implements Comparator<InterfaceC62486Ofi> {
    public final HashMap<String, Integer> LJLIL;

    public C62429Oen(HashMap<String, Integer> hashMap) {
        this.LJLIL = hashMap;
    }

    @Override // java.util.Comparator
    public final int compare(InterfaceC62486Ofi interfaceC62486Ofi, InterfaceC62486Ofi interfaceC62486Ofi2) {
        Integer num;
        String key;
        Integer num2;
        String key2;
        InterfaceC62486Ofi interfaceC62486Ofi3 = interfaceC62486Ofi;
        InterfaceC62486Ofi interfaceC62486Ofi4 = interfaceC62486Ofi2;
        Integer num3 = 0;
        if (interfaceC62486Ofi3 == null || (key2 = interfaceC62486Ofi3.key()) == null || (num = this.LJLIL.get(key2)) == null) {
            num = num3;
        }
        int intValue = num.intValue();
        if (interfaceC62486Ofi4 != null && (key = interfaceC62486Ofi4.key()) != null && (num2 = this.LJLIL.get(key)) != null) {
            num3 = num2;
        }
        return intValue - num3.intValue();
    }
}

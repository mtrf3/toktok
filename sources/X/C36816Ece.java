package X;

import java.util.HashMap;
import java.util.HashSet;

/* renamed from: X.Ece, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36816Ece extends AbstractC36814Ecc {
    @Override // X.AbstractC36814Ecc
    public final boolean LIZIZ(String str) {
        return !this.LIZ.contains(str);
    }

    public C36816Ece(HashSet<String> hashSet, HashMap<String, HashSet<String>> hashMap) {
        super(hashSet, hashMap);
    }

    @Override // X.AbstractC36814Ecc
    public final boolean LIZJ(HashSet<String> hashSet, String str) {
        return !hashSet.contains(str);
    }
}

package X;

import java.util.HashMap;
import java.util.HashSet;

/* renamed from: X.QHe, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66738QHe extends AbstractC66736QHc {
    @Override // X.AbstractC66736QHc
    public final boolean LIZIZ(String str) {
        return this.LIZ.contains(str);
    }

    @Override // X.AbstractC66736QHc
    public final boolean LIZJ(HashSet<String> hashSet, String str) {
        return hashSet.contains(str);
    }

    public C66738QHe(QI3 qi3, HashSet<String> hashSet, HashMap<String, HashSet<String>> hashMap) {
        super(qi3, hashSet, hashMap);
    }
}

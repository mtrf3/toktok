package X;

import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.DvT, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35435DvT implements InterfaceC35436DvU {
    public final /* synthetic */ HashMap<String, Integer> LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ int LIZJ;
    public final /* synthetic */ InterfaceC34890Dmg LIZLLL;

    @Override // X.InterfaceC35436DvU
    public final void LIZ(int i, String path) {
        o.LJIIIZ(path, "path");
        this.LIZ.put(this.LIZIZ, Integer.valueOf(i));
        if (this.LIZ.size() == this.LIZJ) {
            this.LIZLLL.LIZ(this.LIZ);
        }
    }

    public C35435DvT(HashMap hashMap, String str, int i, C36086EEg c36086EEg) {
        this.LIZ = hashMap;
        this.LIZIZ = str;
        this.LIZJ = i;
        this.LIZLLL = c36086EEg;
    }
}

package X;

import java.util.HashMap;

/* renamed from: X.XVo, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84948XVo extends HashMap<String, HashMap<String, String>> {
    public final /* synthetic */ C84942XVi LJLIL;

    public C84948XVo(C84942XVi c84942XVi) {
        this.LJLIL = c84942XVi;
        if (c84942XVi.LJIILIIL == "friends_effect") {
            put("friends_effect", new C84949XVp(this));
        }
    }
}

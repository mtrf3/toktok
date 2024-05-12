package X;

import android.content.Context;
import java.io.File;

/* renamed from: X.Cll, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32285Cll implements InterfaceC32418Cnu {
    public final String LIZ;

    @Override // X.InterfaceC32418Cnu
    public final String LIZ() {
        return this.LIZ;
    }

    public C32285Cll(Context context) {
        this.LIZ = context.getDir("gift_resource", 0).getAbsolutePath();
    }

    @Override // X.InterfaceC32418Cnu
    public final String LIZIZ(C32420Cnw c32420Cnw) {
        StringBuilder sb = new StringBuilder(this.LIZ);
        String str = File.separator;
        sb.append(str);
        sb.append(c32420Cnw.LIZIZ);
        sb.append(str);
        return AnonymousClass073.LIZIZ(sb, c32420Cnw.LJ, str);
    }
}

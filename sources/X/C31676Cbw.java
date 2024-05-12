package X;

import android.graphics.BitmapFactory;
import kotlin.jvm.internal.o;

/* renamed from: X.Cbw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31676Cbw<T, R> implements InterfaceC48038ItG {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    public C31676Cbw(String str, String str2) {
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
    }

    @Override // X.InterfaceC48038ItG
    public final Object apply(Object it) {
        o.LJIIIZ(it, "it");
        try {
            String str = this.LJLIL;
            String str2 = "";
            if (str == null) {
                str = "";
            }
            String str3 = this.LJLILLLLZI;
            if (str3 != null) {
                str2 = str3;
            }
            return BitmapFactory.decodeStream(C15510jD.LIZJ(str, str2));
        } catch (Exception e) {
            C0NB.LJIIJ(6, "NinePatchUtil", e.getStackTrace());
            C0NB.LJ("NinePatchUtil", e.getMessage());
            return null;
        }
    }
}

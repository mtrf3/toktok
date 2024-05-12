package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.F0e, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38268F0e implements C10I<C38270F0g, Object> {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ C38269F0f LIZJ;

    @Override // X.C10I
    public final Object then(C10K<C38270F0g> c10k) {
        C38270F0g LJIIJJI = c10k.LJIIJJI();
        C38269F0f c38269F0f = this.LIZJ;
        String str = this.LIZ;
        String str2 = this.LIZIZ;
        c38269F0f.getClass();
        if (str == null) {
            return null;
        }
        if (LJIIJJI != null) {
            LJIIJJI.LIZ = System.currentTimeMillis();
            c38269F0f.LIZ.put(str, LJIIJJI);
        }
        List<InterfaceC38275F0l> list = c38269F0f.LIZJ;
        if (list == null || ((ArrayList) list).isEmpty()) {
            return null;
        }
        for (int i = 0; i < ((ArrayList) c38269F0f.LIZJ).size(); i++) {
            InterfaceC38275F0l interfaceC38275F0l = (InterfaceC38275F0l) ListProtector.get(c38269F0f.LIZJ, i);
            if (interfaceC38275F0l != null) {
                interfaceC38275F0l.onJsConfigLoaded(str, LJIIJJI, str2);
            }
        }
        return null;
    }

    public C38268F0e(C38269F0f c38269F0f, String str, String str2) {
        this.LIZJ = c38269F0f;
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}

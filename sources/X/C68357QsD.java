package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: X.QsD, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68357QsD extends AbstractC68364QsK {
    public final C68331Qrn LJLJI;
    public final java.util.Map LJLJJI;

    public C68357QsD(C68331Qrn c68331Qrn) {
        super("require");
        this.LJLJJI = new HashMap();
        this.LJLJI = c68331Qrn;
    }

    @Override // X.AbstractC68364QsK
    public final InterfaceC68379QsZ LIZ(C68377QsX c68377QsX, List list) {
        InterfaceC68379QsZ interfaceC68379QsZ;
        C68368QsO.LJII(1, "require", list);
        String LJII = c68377QsX.LIZIZ((InterfaceC68379QsZ) ListProtector.get(list, 0)).LJII();
        if (((HashMap) this.LJLJJI).containsKey(LJII)) {
            return (InterfaceC68379QsZ) ((HashMap) this.LJLJJI).get(LJII);
        }
        C68331Qrn c68331Qrn = this.LJLJI;
        if (((HashMap) c68331Qrn.LIZ).containsKey(LJII)) {
            try {
                interfaceC68379QsZ = (InterfaceC68379QsZ) ((Callable) ((HashMap) c68331Qrn.LIZ).get(LJII)).call();
            } catch (Exception unused) {
                throw new IllegalStateException("Failed to create API implementation: ".concat(String.valueOf(LJII)));
            }
        } else {
            interfaceC68379QsZ = InterfaceC68379QsZ.LJIIJ;
        }
        if (interfaceC68379QsZ instanceof AbstractC68364QsK) {
            ((HashMap) this.LJLJJI).put(LJII, interfaceC68379QsZ);
        }
        return interfaceC68379QsZ;
    }
}

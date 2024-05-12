package X;

import com.bytedance.android.livesdkapi.host.IHostResource;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.1FC, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1FC implements InterfaceC68405Qsz {
    public static C1FC LJLJJI;
    public final /* synthetic */ int LJLIL;
    public final Object LJLILLLLZI;
    public final Object LJLJI;

    public C1FC() {
        this.LJLIL = 4;
        this.LJLILLLLZI = new C78847Ux1();
        this.LJLJI = new C17J();
    }

    public static C1FC LIZIZ() {
        if (LJLJJI == null) {
            LJLJJI = new C1FC();
        }
        return LJLJJI;
    }

    public final List LJ() {
        this.LJLILLLLZI.getClass();
        return ((IHostResource) CN1.LIZ(IHostResource.class)).vm();
    }

    public final String toString() {
        switch (this.LJLIL) {
            case 2:
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("CommonEventConfig{sampledService=");
                LIZ.append(this.LJLILLLLZI);
                LIZ.append(", sampledLogType=");
                LIZ.append(this.LJLJI);
                LIZ.append('}');
                return X1D.LIZIZ(LIZ);
            default:
                return super.toString();
        }
    }

    @Override // X.InterfaceC68405Qsz
    public final C68377QsX LIZ(InterfaceC68379QsZ interfaceC68379QsZ) {
        C68377QsX LIZ = ((C68377QsX) this.LJLJI).LIZ();
        String str = (String) this.LJLILLLLZI;
        LIZ.LJ(str, interfaceC68379QsZ);
        ((HashMap) LIZ.LIZLLL).put(str, Boolean.TRUE);
        return LIZ;
    }

    public final boolean LIZJ(String str) {
        Object obj = this.LJLJI;
        if (obj != null && ((java.util.Set) obj).contains(str)) {
            return true;
        }
        return false;
    }

    public final boolean LIZLLL(String str) {
        Object obj = this.LJLILLLLZI;
        if (obj != null && ((java.util.Set) obj).contains(str)) {
            return true;
        }
        return false;
    }

    public C1FC(C68377QsX c68377QsX, String str) {
        this.LJLIL = 3;
        this.LJLJI = c68377QsX;
        this.LJLILLLLZI = str;
    }

    public C1FC(String str, List list) {
        this.LJLIL = 1;
        this.LJLILLLLZI = str;
        this.LJLJI = list;
    }

    public /* synthetic */ C1FC(int i, Object obj, Object obj2) {
        this.LJLIL = i;
        this.LJLILLLLZI = obj;
        this.LJLJI = obj2;
    }
}

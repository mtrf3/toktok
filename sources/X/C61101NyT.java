package X;

import android.content.Context;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.NyT, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61101NyT {
    public final Cert LIZ;
    public final ArrayList<String> LIZIZ = new ArrayList<>();
    public final List<AbstractC61106NyY> LIZJ = new ArrayList();
    public WeakReference<InterfaceC61105NyX> LIZLLL;
    public WeakReference<Context> LJ;
    public InterfaceC61107NyZ LJFF;

    public final void LIZ() {
        InterfaceC61105NyX interfaceC61105NyX;
        WeakReference<InterfaceC61105NyX> weakReference = this.LIZLLL;
        if (weakReference != null && (interfaceC61105NyX = weakReference.get()) != null) {
            interfaceC61105NyX.i0();
        }
        InterfaceC61107NyZ interfaceC61107NyZ = this.LJFF;
        if (interfaceC61107NyZ != null) {
            interfaceC61107NyZ.LIZ();
        }
        ((ArrayList) this.LIZJ).clear();
    }

    public final void LIZIZ() {
        InterfaceC61105NyX interfaceC61105NyX;
        String[] strArr;
        if (!((ArrayList) this.LIZJ).isEmpty()) {
            AbstractC61106NyY abstractC61106NyY = (AbstractC61106NyY) ListProtector.remove(this.LIZJ, 0);
            C61101NyT c61101NyT = abstractC61106NyY.LIZ;
            if (c61101NyT == null || (strArr = (String[]) new ArrayList(c61101NyT.LIZIZ).toArray(new String[0])) == null) {
                strArr = new String[0];
            }
            abstractC61106NyY.LIZ(c61101NyT, (String[]) Arrays.copyOf(strArr, strArr.length));
            return;
        }
        WeakReference<InterfaceC61105NyX> weakReference = this.LIZLLL;
        if (weakReference == null || (interfaceC61105NyX = weakReference.get()) == null) {
            return;
        }
        interfaceC61105NyX.c4();
    }

    public C61101NyT(Cert cert) {
        this.LIZ = cert;
    }
}

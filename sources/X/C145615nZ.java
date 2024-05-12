package X;

import Y.AObserverS70S0100000_2;
import androidx.lifecycle.LiveData;
import dmt.av.video.VEEditorAutoStartStopArbiter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.5nZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C145615nZ extends AbstractC29891Fh<C5LK> implements C5LK, InterfaceC145625na, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJJI;
    public final C82622Wbi LJLIL;
    public final InterfaceC115514g7 LJLILLLLZI;
    public final ArrayList<InterfaceC145625na> LJLJI;

    static {
        TBT tbt = new TBT(C145615nZ.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0);
        C65352Pkq.LIZ.getClass();
        LJLJJI = new InterfaceC74236TBo[]{tbt};
    }

    public C5LK LJJLI() {
        return this;
    }

    private final InterfaceC143655kP LJJLIIIIJ() {
        return (InterfaceC143655kP) this.LJLILLLLZI.LIZ(this, LJLJJI[0]);
    }

    @Override // X.InterfaceC145625na
    public boolean LIZJ() {
        ArrayList<InterfaceC145625na> arrayList = this.LJLJI;
        if ((arrayList instanceof Collection) && arrayList.isEmpty()) {
            return false;
        }
        Iterator<InterfaceC145625na> it = arrayList.iterator();
        while (it.hasNext()) {
            if (it.next().LIZJ()) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC145625na
    public boolean LJJIJ() {
        ArrayList<InterfaceC145625na> arrayList = this.LJLJI;
        if ((arrayList instanceof Collection) && arrayList.isEmpty()) {
            return false;
        }
        Iterator<InterfaceC145625na> it = arrayList.iterator();
        while (it.hasNext()) {
            if (it.next().LJJIJ()) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC145625na
    public boolean LJJJIL() {
        ArrayList<InterfaceC145625na> arrayList = this.LJLJI;
        if ((arrayList instanceof Collection) && arrayList.isEmpty()) {
            return false;
        }
        Iterator<InterfaceC145625na> it = arrayList.iterator();
        while (it.hasNext()) {
            if (it.next().LJJJIL()) {
                return true;
            }
        }
        return false;
    }

    @Override // X.AbstractC29891Fh
    public void onCreate() {
        LiveData<VEEditorAutoStartStopArbiter> wz;
        super.onCreate();
        InterfaceC143655kP LJJLIIIIJ = LJJLIIIIJ();
        if (LJJLIIIIJ != null && (wz = LJJLIIIIJ.wz()) != null) {
            wz.observe(this, new AObserverS70S0100000_2(this, 91));
        }
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ C5LK getApiComponent() {
        LJJLI();
        return this;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    public C145615nZ(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = UCI.LJII(getDiContainer(), InterfaceC143655kP.class, null);
        this.LJLJI = new ArrayList<>();
    }

    @Override // X.C5LK
    public void IJ(InterfaceC145625na interceptor) {
        o.LJIIIZ(interceptor, "interceptor");
        if (this.LJLJI.contains(interceptor)) {
            return;
        }
        this.LJLJI.add(interceptor);
    }

    @Override // X.C5LK
    public void ne(InterfaceC145625na interceptor) {
        o.LJIIIZ(interceptor, "interceptor");
        this.LJLJI.remove(interceptor);
    }
}

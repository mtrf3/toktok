package X;

import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS145S0200000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.5Xg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C136485Xg extends AbstractC42021ks<InterfaceC136505Xi> implements InterfaceC136505Xi {
    public static final C136495Xh LJLLILLLL = new Object() { // from class: X.5Xh
    };
    public final WMH LJLLI;

    @Override // X.AbstractC42021ks
    public int LJJLJLI() {
        return R.layout.blv;
    }

    @Override // X.AbstractC42021ks, X.AbstractC29891Fh
    public void onCreate() {
        super.onCreate();
        H78.LJI("RecordMinorUIGroupComponent onCreate");
    }

    @Override // X.AbstractC42021ks, X.AbstractC29891Fh
    public void onDestroy() {
        super.onDestroy();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RecordMinorUIGroupComponent onDestroy\n ");
        LIZ.append(android.util.Log.getStackTraceString(new Exception()));
        H78.LJI(X1D.LIZIZ(LIZ));
    }

    @Override // X.AbstractC29891Fh
    public void onResume() {
        super.onResume();
        H78.LJI("RecordMinorUIGroupComponent onResume");
    }

    @Override // X.AbstractC29891Fh
    public void onStart() {
        super.onStart();
        H78.LJI("RecordMinorUIGroupComponent onStart");
    }

    @Override // X.AbstractC42021ks
    public void LJJLIIIIJ(WMH childComponentsContainer) {
        o.LJIIIZ(childComponentsContainer, "childComponentsContainer");
        H78.LJI("RecordMinorUIGroupComponent before buildChildComponents");
        LJJLI(new AqS145S0200000_14(this, childComponentsContainer, 56));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C136485Xg(WMH parentScene, C82622Wbi diContainer) {
        super(parentScene, diContainer);
        o.LJIIIZ(parentScene, "parentScene");
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLLI = parentScene;
    }
}

package X;

import android.view.MotionEvent;
import androidx.lifecycle.Lifecycle;
import kotlin.jvm.internal.o;

/* renamed from: X.5yo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C152585yo extends AbstractC29891Fh<C0I6> implements InterfaceC135635Tz, C0I6 {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJJL;
    public final C82622Wbi LJLIL;
    public final C0I6 LJLILLLLZI;
    public final C5H3 LJLJI;
    public final InterfaceC115514g7 LJLJJI;

    static {
        TBT tbt = new TBT(C152585yo.class, "gestureService", "getGestureService()Lcom/bytedance/createx/editor/gesture/IGestureService;", 0);
        C65352Pkq.LIZ.getClass();
        LJLJJL = new InterfaceC74236TBo[]{tbt};
    }

    private final InterfaceC152085y0 LJJLIIIIJ() {
        return (InterfaceC152085y0) this.LJLJJI.LIZ(this, LJLJJL[0]);
    }

    public final InterfaceC153275zv LJJLI() {
        return (InterfaceC153275zv) this.LJLJI.getValue();
    }

    @Override // X.AbstractC29891Fh
    public void onCreate() {
        super.onCreate();
        LJJLIIIIJ().LIZIZ(new C6V4(0, new WXC() { // from class: X.5yp
            @Override // X.C6P6, X.C6V2
            public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                if (C152585yo.this.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
                    return false;
                }
                C152585yo.this.LJJLI().A7(3);
                return false;
            }
        }));
    }

    @Override // X.AbstractC29891Fh
    public C0I6 getApiComponent() {
        return this.LJLILLLLZI;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    public C152585yo(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = this;
        this.LJLJI = C269113v.LIZ(this, InterfaceC153275zv.class);
        this.LJLJJI = UCI.LJI(getDiContainer(), InterfaceC152085y0.class, null);
    }
}

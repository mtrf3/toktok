package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterDelayLoadSetting;

/* renamed from: X.Nqr, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC60629Nqr<T> implements InterfaceC37737ErV {
    public static final /* synthetic */ int LJLJJLL = 0;
    public C60624Nqm LJLIL;
    public String LJLJI;
    public boolean LJLJJL;
    public boolean LJLILLLLZI = true;
    public boolean LJLJJI = true;

    public abstract void LIZJ();

    static {
        new C60631Nqt();
    }

    public final InterfaceC37737ErV LIZ() {
        return (InterfaceC37737ErV) this.LJLIL.LIZIZ;
    }

    public boolean LIZIZ() {
        return this.LJLJJI;
    }

    public final void LIZLLL(String str, AbstractC60536NpM abstractC60536NpM) {
        C60627Nqp.LIZJ(this.LJLIL, str, abstractC60536NpM, LiveCenterDelayLoadSetting.DEFAULT);
    }

    public final void LJ(String str, AbstractC60536NpM abstractC60536NpM, int i) {
        C60627Nqp.LIZJ(this.LJLIL, str, abstractC60536NpM, i);
    }
}

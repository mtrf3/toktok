package X;

import com.bytedance.push.sync.SyncPushAdapter;

/* renamed from: X.QSj, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67029QSj implements InterfaceC67072QUa {
    public final /* synthetic */ C67028QSi LJLIL;

    public C67029QSj(C67028QSi c67028QSi) {
        this.LJLIL = c67028QSi;
    }

    @Override // X.InterfaceC67072QUa
    public final void LIZ(C67074QUc c67074QUc) {
        C67028QSi.LIZIZ(this.LJLIL.LJLILLLLZI).getClass();
        try {
            InterfaceC39118FWw LJI = QRM.LJI();
            QRC qrc = (QRC) LJI;
            qrc.LJ(SyncPushAdapter.getSyncPush(), new String(c67074QUc.LIZ));
        } catch (Throwable unused) {
        }
    }
}

package X;

import com.bytedance.forest.Forest;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.app.host.AwemeHostApplication;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.o;

/* renamed from: X.FlV, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39913FlV extends AbstractC65781Prl implements InterfaceC65784Pro<Forest> {
    public static final C39913FlV LJLIL = new C39913FlV();

    public C39913FlV() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Forest invoke() {
        AwemeHostApplication LIZ = FKM.LIZ();
        o.LJI(LIZ);
        String LIZIZ = C38943FQd.LIZIZ();
        o.LJIIIIZZ(LIZIZ, "getInstance().geckoHost");
        String LIZ2 = C38943FQd.LIZ();
        long j = EF7.LJIIIZ;
        String LIZLLL = EF7.LIZLLL();
        String serverDeviceId = AppLog.getServerDeviceId();
        if (serverDeviceId == null) {
            serverDeviceId = CardStruct.IStatusCode.DEFAULT;
        }
        C61156NzM c61156NzM = new C61156NzM(LIZIZ, new C61157NzN(LIZ2, "offlineX", j, LIZLLL, serverDeviceId, C85990Xow.LIZ()));
        c61156NzM.LIZIZ = true;
        c61156NzM.LJII.add("tt/webview/js_manage/");
        return new Forest(LIZ, c61156NzM);
    }
}

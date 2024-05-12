package X;

import android.os.Handler;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.commercialize.engagement.trace.EngagementTrace;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.MyH, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58541MyH extends AbstractC65781Prl implements InterfaceC65784Pro<InterfaceC58547MyN<OSI<Aweme, JSONObject, String, String>>> {
    public static final C58541MyH LJLIL = new C58541MyH();

    public C58541MyH() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final InterfaceC58547MyN<OSI<Aweme, JSONObject, String, String>> invoke() {
        InterfaceC58538MyE interfaceC58538MyE = (InterfaceC58538MyE) C58530My6.LIZ.getValue();
        Gson gson = (Gson) C58530My6.LIZIZ.getValue();
        o.LJIIIIZZ(gson, "gson");
        C58545MyL c58545MyL = new C58545MyL(new C58553MyT(interfaceC58538MyE, gson));
        Handler mainHandler = (Handler) C58530My6.LIZLLL.getValue();
        o.LJIIIIZZ(mainHandler, "mainHandler");
        return new C58545MyL(new C58546MyM(new C58545MyL(new C58546MyM(c58545MyL, new C58560Mya(mainHandler))), new C58554MyU((EngagementTrace) C58530My6.LIZJ.getValue())));
    }
}

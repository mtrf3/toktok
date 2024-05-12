package X;

import android.app.Application;
import android.content.Context;
import com.google.gson.Gson;
import com.google.gson.e;
import com.ss.android.ugc.tools.type_adapter.BooleanAsIntTypeAdapter;
import kotlin.jvm.internal.o;

/* renamed from: X.6YI, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6YI extends AbstractC65781Prl implements InterfaceC65784Pro<C6YN> {
    public static final C6YI LJLIL = new C6YI();

    public C6YI() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [X.6YN] */
    @Override // X.InterfaceC65784Pro
    public final C6YN invoke() {
        final C156506Cg c156506Cg = new C156506Cg(C60903NvH.LJIIJJI().LJJIJIIJIL().getVideoWidth(), C60903NvH.LJIIJJI().LJJIJIIJIL().getVideoHeight(), new C48693J9d(), new C32151Nz(), 36);
        ?? r6 = new C6YO(c156506Cg) { // from class: X.6YN
        };
        Application application = C60903NvH.LJ;
        o.LJIIIIZZ(application, "getApplication()");
        Gson LIZ = C60903NvH.LJIIJJI().LIZ();
        C6YL c6yl = new InterfaceC1554368d() { // from class: X.6YL
            @Override // X.InterfaceC1554368d
            public final void LIZ(String str) {
                H78.LIZJ(str);
            }

            @Override // X.InterfaceC1554368d
            public final void LIZIZ(Throwable th) {
                H78.LJ(th);
            }

            @Override // X.InterfaceC1554368d
            public final void d(String str) {
                H78.LIZ(str);
            }

            @Override // X.InterfaceC1554368d
            public final void i(String str) {
                H78.LJI(str);
            }
        };
        C6I5 c6i5 = new InterfaceC1546265a() { // from class: X.6I5
            @Override // X.InterfaceC1546265a
            public final void LIZ(Context context, String content) {
                o.LJIIIZ(context, "context");
                o.LJIIIZ(content, "content");
                C5S1 c5s1 = new C5S1(context);
                c5s1.LIZLLL(content);
                c5s1.LJ();
            }

            @Override // X.InterfaceC1546265a
            public final void LIZIZ(int i, Context context) {
                o.LJIIIZ(context, "context");
                C5S1 c5s1 = new C5S1(context);
                c5s1.LIZJ(i);
                c5s1.LJ();
            }
        };
        if (!C6PB.LJFF) {
            C6PB.LIZ = application;
            if (LIZ == null) {
                e eVar = new e();
                eVar.LJIIJ = true;
                eVar.LIZIZ(new BooleanAsIntTypeAdapter(), Integer.TYPE);
                C6PB.LIZIZ = eVar.LIZ();
            } else {
                C6PB.LIZIZ = LIZ;
            }
            C6PB.LIZJ = c156506Cg;
            C6PB.LIZLLL = c6yl;
            C6PB.LJ = c6i5;
            C6PB.LJFF = true;
        }
        return r6;
    }
}

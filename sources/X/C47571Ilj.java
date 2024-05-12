package X;

import android.content.Context;
import com.ss.ttvideoengine.TTVideoEngine;
import com.ss.ttvideoengine.TTVideoEngineImpl;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* renamed from: X.Ilj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47571Ilj implements InterfaceC47822Ipm {
    public final WeakReference<TTVideoEngine> LIZ;

    @Override // X.InterfaceC47822Ipm
    public final String LIZJ() {
        TTVideoEngine tTVideoEngine = this.LIZ.get();
        if (tTVideoEngine == null) {
            return null;
        }
        return C77117UOj.LIZ(tTVideoEngine.LJIILIIL());
    }

    @Override // X.InterfaceC47822Ipm
    public final C47164IfA LJFF() {
        TTVideoEngine tTVideoEngine = this.LIZ.get();
        if (tTVideoEngine == null) {
            return null;
        }
        return tTVideoEngine.LJJJI();
    }

    @Override // X.InterfaceC47822Ipm
    public final Context getContext() {
        TTVideoEngine tTVideoEngine = this.LIZ.get();
        if (tTVideoEngine == null) {
            return null;
        }
        return tTVideoEngine.LJIILLIIL();
    }

    @Override // X.InterfaceC47822Ipm
    public final String getId() {
        TTVideoEngine tTVideoEngine = this.LIZ.get();
        if (tTVideoEngine == null) {
            return null;
        }
        return tTVideoEngine.LJJI();
    }

    public C47571Ilj(TTVideoEngine tTVideoEngine) {
        this.LIZ = new WeakReference<>(tTVideoEngine);
    }

    @Override // X.InterfaceC47822Ipm
    public final void LIZ(C47789IpF c47789IpF) {
        TTVideoEngine tTVideoEngine = this.LIZ.get();
        if (c47789IpF == null || tTVideoEngine == null || tTVideoEngine.LIZ.e == null) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("fetcher should retry error ");
        LIZ.append(c47789IpF.toString());
        C78253UnR.LIZLLL("EngineMDLFetcherListener", X1D.LIZIZ(LIZ));
        TTVideoEngineImpl tTVideoEngineImpl = tTVideoEngine.LIZ;
        C47750Ioc c47750Ioc = tTVideoEngineImpl.e;
        int i = tTVideoEngineImpl.LLILIL;
        c47750Ioc.getClass();
        HashMap LJFF = c47789IpF.LJFF();
        LJFF.put("apiver", Integer.valueOf(i));
        c47750Ioc.LJIILJJIL.add(LJFF);
    }

    @Override // X.InterfaceC47822Ipm
    public final void LIZIZ(String str) {
        C47750Ioc c47750Ioc;
        C78253UnR.LJI("EngineMDLFetcherListener", "fetcher cancelled");
        TTVideoEngine tTVideoEngine = this.LIZ.get();
        if (tTVideoEngine == null || (c47750Ioc = tTVideoEngine.LIZ.e) == null) {
            return;
        }
        c47750Ioc.LJIJJ(str);
    }

    @Override // X.InterfaceC47822Ipm
    public final void LJ(C47789IpF c47789IpF, String str) {
        InterfaceC47731IoJ LJJIIJ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("videoEngine mdl fetch failed ");
        LIZ.append(c47789IpF.toString());
        C78253UnR.LJI("EngineMDLFetcherListener", X1D.LIZIZ(LIZ));
        TTVideoEngine tTVideoEngine = this.LIZ.get();
        if (tTVideoEngine != null && (LJJIIJ = tTVideoEngine.LJJIIJ()) != null) {
            ((C47750Ioc) LJJIIJ).LJIJJLI(0, c47789IpF, str);
        }
    }

    @Override // X.InterfaceC47822Ipm
    public final void LIZLLL(C47164IfA c47164IfA, boolean z, String str) {
        int i;
        TTVideoEngine tTVideoEngine = this.LIZ.get();
        if (tTVideoEngine == null) {
            return;
        }
        C78253UnR.LJI("EngineMDLFetcherListener", "fetch info success");
        C47750Ioc c47750Ioc = tTVideoEngine.LIZ.e;
        if (c47750Ioc != null) {
            if (z) {
                i = 1;
            } else {
                i = 2;
            }
            c47750Ioc.LJIJJLI(i, null, str);
            if (z) {
                c47750Ioc.LJIJ(c47164IfA);
            }
        }
    }
}

package X;

import X.InterfaceC63694OzC;
import com.bytedance.keva.Keva;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import kotlin.jvm.internal.o;

/* renamed from: X.KJw, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51520KJw<T extends InterfaceC63694OzC<T>> {
    public final T LIZ;
    public final String LIZIZ;
    public T LIZJ;
    public final Keva LIZLLL;
    public final Gson LJ;

    public C51520KJw(T initState) {
        o.LJIIIZ(initState, "initState");
        this.LIZ = initState;
        String c65776Prg = C65352Pkq.LIZ(initState.getClass()).toString();
        this.LIZIZ = c65776Prg;
        this.LIZJ = initState;
        Keva repo = Keva.getRepo(c65776Prg);
        o.LJIIIIZZ(repo, "getRepo(repoKey)");
        this.LIZLLL = repo;
        this.LJ = GsonHolder.LIZLLL().LIZ();
    }
}

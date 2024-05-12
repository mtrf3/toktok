package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.o;

/* renamed from: X.Jna, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50234Jna {
    public static final /* synthetic */ int LIZ = 0;

    public static Keva LIZ(String repoName) {
        o.LJIIIZ(repoName, "repoName");
        Keva repo = Keva.getRepo(repoName);
        o.LJIIIIZZ(repo, "getRepo(repoName)");
        return repo;
    }
}

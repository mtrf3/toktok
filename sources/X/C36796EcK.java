package X;

import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import java.io.File;
import kotlin.jvm.internal.o;

/* renamed from: X.EcK, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36796EcK extends AbstractC65781Prl implements InterfaceC65784Pro<String> {
    public static final C36796EcK LJLIL = new C36796EcK();

    public C36796EcK() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final String invoke() {
        String path = new File(AVExternalServiceImpl.LIZ().configService().cacheConfig().cacheDir(), "gif").getPath();
        o.LJIIIIZZ(path, "File(cacheDir, \"gif\").path");
        return path;
    }
}

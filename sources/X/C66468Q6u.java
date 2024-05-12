package X;

import com.bytedance.ies.safemode.SmartProtected.state.ExceptionManager;
import java.io.File;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.io.FileUtils;

/* renamed from: X.Q6u, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C66468Q6u extends EHG<List<String>> {
    public final /* synthetic */ ExceptionManager LIZLLL;

    @Override // X.EHG
    public final List<String> LIZIZ() {
        ExceptionManager exceptionManager = this.LIZLLL;
        File file = exceptionManager.LJIILIIL;
        if (file != null && file.exists()) {
            try {
                return (List) exceptionManager.LJIILJJIL.LJI(FileUtils.readFileToString(file, Charset.forName("UTF-8")), ArrayList.class);
            } catch (Exception e) {
                PP9.LIZJ(14, e);
                C16880lQ.LLLLIIL(e);
            }
        }
        return new ArrayList();
    }

    public C66468Q6u(ExceptionManager exceptionManager) {
        this.LIZLLL = exceptionManager;
    }
}

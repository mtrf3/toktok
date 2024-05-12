package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.o;

/* renamed from: X.0Sx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C07950Sx {
    public final Object LJLIL;

    public C07950Sx(int i) {
        if (i != 3) {
            this.LJLIL = Keva.getRepo("repo_local_cover");
        } else {
            this.LJLIL = new AtomicInteger();
        }
    }

    public final void LIZ(String msg) {
        o.LJIIIZ(msg, "msg");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append((String) this.LJLIL);
        LIZ.append(" | ");
        LIZ.append(msg);
        H7B.LIZJ(X1D.LIZIZ(LIZ));
    }

    public final UrlModel LIZIZ(String str) {
        boolean z;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        String string = ((Keva) this.LJLIL).getString(str, "");
        o.LJIIIIZZ(string, "keva.getString(aid, \"\")");
        if (!new File(string).exists()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        String uri = android.net.Uri.fromFile(new File(string)).toString();
        o.LJIIIIZZ(uri, "fromFile(File(coverPath)).toString()");
        arrayList.add(uri);
        UrlModel urlModel = new UrlModel();
        urlModel.setUrlList(arrayList);
        return urlModel;
    }

    public final void LIZJ(String msg) {
        o.LJIIIZ(msg, "msg");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append((String) this.LJLIL);
        LIZ.append(" | ");
        LIZ.append(msg);
        H7B.LJ(X1D.LIZIZ(LIZ));
    }

    public /* synthetic */ C07950Sx(String tag) {
        o.LJIIIZ(tag, "tag");
        this.LJLIL = tag;
    }
}

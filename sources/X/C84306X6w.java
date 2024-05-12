package X;

import android.content.Context;
import java.io.File;

/* renamed from: X.X6w, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public class C84306X6w extends X78 {
    public final File LJII;
    public final String LJIIIIZZ;

    public C84306X6w(Context context, String str, File file) {
        super(context, str);
        this.LJII = file;
        this.LJIIIIZZ = "^lib/([^/]+)/([^/]+\\.so)$";
    }
}

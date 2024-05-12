package X;

import android.content.Context;
import java.io.File;

/* loaded from: classes15.dex */
public class W9K {
    public W4P<File> LIZIZ;
    public WE4 LJ;
    public InterfaceC77878UhO LJFF;
    public W4P<File> LJI;
    public final Context LJII;
    public String LIZ = "image_cache";
    public long LIZJ = 41943040;
    public final AnonymousClass636 LIZLLL = new AnonymousClass636();

    public final W9L LIZ() {
        if (this.LIZIZ == null) {
            if (this.LJII != null) {
                if (this.LJII != null) {
                    this.LIZIZ = new W9N(this);
                }
            } else {
                throw new IllegalStateException("Either a non-null context or a base directory path or supplier must be provided.");
            }
        }
        if (this.LJI == null && this.LJII != null) {
            this.LJI = this.LIZIZ;
        }
        return new W9L(this);
    }

    public W9K(Context context) {
        this.LJII = context;
    }
}

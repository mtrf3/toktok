package X;

import android.net.Uri;
import java.util.Iterator;

/* renamed from: X.Fdk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39432Fdk {
    public Object LIZ;

    public abstract AbstractC59475NVv LIZIZ();

    public final Uri.Builder LIZ() {
        AbstractC59475NVv LIZIZ = LIZIZ();
        Object obj = this.LIZ;
        LIZIZ.getClass();
        Iterator<InterfaceC59479NVz<?>> it = LIZIZ.LIZ().iterator();
        while (it.hasNext()) {
            obj = it.next().LIZJ(Uri.Builder.class, obj);
        }
        return (Uri.Builder) obj;
    }

    public /* synthetic */ AbstractC39432Fdk() {
    }

    public AbstractC39432Fdk(Uri.Builder builder) {
        this.LIZ = builder;
    }
}

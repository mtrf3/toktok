package X;

import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.GMf, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41389GMf {
    public static final List<InterfaceC41390GMg> LIZ = new ArrayList();

    public static final void LIZ(CreativeModel creativeModel) {
        o.LJIIIZ(creativeModel, "creativeModel");
        Iterator<InterfaceC41390GMg> it = LIZ.iterator();
        while (it.hasNext()) {
            it.next().LIZ(creativeModel);
        }
    }
}

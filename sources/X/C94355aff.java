package X;

import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.aff, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94355aff extends F9E {
    public final LinkedHashMap<String, List<C94256ae4>> LJLIL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL};
    }

    public C94355aff() {
        this(new LinkedHashMap());
    }

    public C94355aff(LinkedHashMap<String, List<C94256ae4>> modelPictureList) {
        o.LJIIIZ(modelPictureList, "modelPictureList");
        this.LJLIL = modelPictureList;
    }
}

package X;

import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.52o, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1285052o extends F9E {
    public final List<NLETrackSlot> LJLIL;
    public final EnumC1285152p LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI};
    }

    public C1285052o() {
        this(new ArrayList(), EnumC1285152p.RELOAD_ALL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1285052o(List<? extends NLETrackSlot> trackSlots, EnumC1285152p updateType) {
        o.LJIIIZ(trackSlots, "trackSlots");
        o.LJIIIZ(updateType, "updateType");
        this.LJLIL = trackSlots;
        this.LJLILLLLZI = updateType;
    }
}

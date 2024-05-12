package X;

import com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.SkylightData;
import kotlin.jvm.internal.o;

/* renamed from: X.4h1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C116074h1 implements InterfaceC57784Mm4 {
    public final SkylightData LJLIL;

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    public C116074h1(SkylightData skylightData) {
        o.LJIIIZ(skylightData, "skylightData");
        this.LJLIL = skylightData;
    }

    @Override // X.InterfaceC57784Mm4
    public boolean areContentsTheSame(InterfaceC57784Mm4 other) {
        o.LJIIIZ(other, "other");
        return o.LJ(other, this);
    }

    @Override // X.InterfaceC57784Mm4
    public boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }
}

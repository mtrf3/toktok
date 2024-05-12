package X;

import com.ss.android.ugc.aweme.inbox.response.InboxLiveNotice;
import kotlin.jvm.internal.o;

/* renamed from: X.Ldf, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC54715Ldf implements InterfaceC57784Mm4 {
    public int LJLIL = -1;

    public abstract InboxLiveNotice LIZ();

    public abstract boolean LIZIZ();

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    @Override // X.InterfaceC57784Mm4
    public boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return interfaceC57784Mm4 instanceof AbstractC54715Ldf;
    }
}

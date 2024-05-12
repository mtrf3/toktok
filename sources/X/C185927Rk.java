package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.7Rk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public class C185927Rk implements InterfaceC57784Mm4 {
    public final Aweme LJLIL;

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    public int hashCode() {
        return getAweme().getAid().hashCode();
    }

    public Aweme getAweme() {
        return this.LJLIL;
    }

    public C185927Rk(Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        this.LJLIL = aweme;
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        if (interfaceC57784Mm4 instanceof C185927Rk) {
            return o.LJ(((C185927Rk) interfaceC57784Mm4).getAweme().getAid(), getAweme().getAid());
        }
        return o.LJ(interfaceC57784Mm4, this);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        if (interfaceC57784Mm4 instanceof C185927Rk) {
            return o.LJ(((C185927Rk) interfaceC57784Mm4).getAweme().getAid(), getAweme().getAid());
        }
        return o.LJ(interfaceC57784Mm4, this);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C185927Rk) {
            return o.LJ(((C185927Rk) obj).getAweme().getAid(), getAweme().getAid());
        }
        return super.equals(obj);
    }
}

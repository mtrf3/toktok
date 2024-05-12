package X;

import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.3Ji, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C81903Ji {
    public static final /* synthetic */ C81903Ji LIZ = new C81903Ji();

    /* JADX WARN: Type inference failed for: r0v2, types: [X.3Jh] */
    public static C81893Jh LIZ(final C81983Jq sessionPage, final boolean z, final C82373Ld comparator) {
        o.LJIIIZ(sessionPage, "sessionPage");
        o.LJIIIZ(comparator, "comparator");
        return new InterfaceC81953Jn(sessionPage, z, comparator) { // from class: X.3Jh
            public final C81983Jq LIZIZ;
            public final boolean LIZJ;
            public final Comparator<C3L4> LIZLLL;
            public volatile boolean LJ;
            public volatile long LJFF;
            public volatile boolean LJI;
            public final java.util.Map<String, C3L4> LJII;
            public final ConcurrentHashSet LJIIIIZZ;
            public volatile int LJIIIZ;
            public volatile boolean LJIIJ;
            public final C3JY LJIIJJI;
            public final int LJIIL;
            public final C81613If LJIILIIL;

            @Override // X.InterfaceC81953Jn
            public final void LJIIL() {
                this.LJIIJ = true;
            }

            public final String toString() {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append('(');
                LIZ2.append(this.LIZIZ);
                LIZ2.append("={size=");
                LIZ2.append(((ConcurrentHashMap) this.LJII).size());
                LIZ2.append(", hasMore=");
                LIZ2.append(this.LJ);
                LIZ2.append(", cursor=");
                LIZ2.append(this.LJFF);
                LIZ2.append(", isLoading=");
                LIZ2.append(this.LJI);
                LIZ2.append(", sessionDataReady=");
                return C19U.LIZ(LIZ2, this.LJIIJ, "})", LIZ2);
            }

            @Override // X.InterfaceC81953Jn
            public final C81983Jq LIZIZ() {
                return this.LIZIZ;
            }

            @Override // X.InterfaceC81953Jn
            public final int LIZJ() {
                return this.LJIIIZ;
            }

            @Override // X.InterfaceC81953Jn
            public final int LJ() {
                return this.LJIIL;
            }

            @Override // X.InterfaceC81953Jn
            public final java.util.Map<String, C3L4> LJII() {
                return this.LJII;
            }

            @Override // X.InterfaceC81953Jn
            public final C3JY LJIIJ() {
                return this.LJIIJJI;
            }

            @Override // X.InterfaceC81953Jn
            public final boolean LJIIJJI() {
                return this.LJIIJ;
            }

            @Override // X.InterfaceC81953Jn
            public final long LJIILIIL() {
                return this.LJFF;
            }

            @Override // X.InterfaceC81953Jn
            public final ConcurrentHashSet LJIILJJIL() {
                return this.LJIIIIZZ;
            }

            @Override // X.InterfaceC81953Jn
            public final boolean LJIILL() {
                return this.LJ;
            }

            @Override // X.InterfaceC81953Jn
            public final C81613If getDebugInfo() {
                return this.LJIILIIL;
            }

            @Override // X.InterfaceC81953Jn
            public final boolean isLoading() {
                return this.LJI;
            }

            @Override // X.InterfaceC81953Jn
            public final void LIZLLL(boolean z2) {
                this.LJ = z2;
            }

            @Override // X.InterfaceC81953Jn
            public final void LJFF(int i) {
                this.LJIIIZ = i;
            }

            @Override // X.InterfaceC81953Jn
            public final void LJIIIZ(long j) {
                this.LJFF = j;
            }

            @Override // X.InterfaceC81953Jn
            public final void setLoading(boolean z2) {
                this.LJI = z2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r4v2, types: [X.GuD] */
            @Override // X.InterfaceC81953Jn
            public final C3L5 LJI(C63120Opw conversation, C81563Ia c81563Ia) {
                o.LJIIIZ(conversation, "conversation");
                C81563Ia c81563Ia2 = c81563Ia;
                if (conversation.isStranger()) {
                    return null;
                }
                if (c81563Ia == null) {
                    c81563Ia2 = new C43001GuD();
                }
                return C82473Ln.LIZIZ(conversation, c81563Ia2, true, 2);
            }

            @Override // X.InterfaceC81953Jn
            public final List<C3L4> LJIIIIZZ(Collection<? extends C3L4> sessionList, Collection<? extends C3L4> noticeSessions) {
                o.LJIIIZ(sessionList, "sessionList");
                o.LJIIIZ(noticeSessions, "noticeSessions");
                if (this.LIZJ) {
                    return ORZ.LLILII(this.LIZLLL, ORZ.LLIIIZ(noticeSessions, sessionList));
                }
                return ORZ.LLILII(this.LIZLLL, sessionList);
            }

            {
                o.LJIIIZ(sessionPage, "sessionPage");
                o.LJIIIZ(comparator, "comparator");
                this.LIZIZ = sessionPage;
                this.LIZJ = z;
                this.LIZLLL = comparator;
                this.LJ = true;
                this.LJFF = Long.MAX_VALUE;
                this.LJII = new ConcurrentHashMap();
                this.LJIIIIZZ = new ConcurrentHashSet();
                this.LJIIJJI = new C3JY(sessionPage);
                this.LJIIL = C3JT.LIZ.paginationCount;
                this.LJIILIIL = new C81613If();
            }
        };
    }
}

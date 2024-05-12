package X;

import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import kotlin.jvm.internal.o;

/* renamed from: X.9cZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C240719cZ implements InterfaceC57784Mm4 {
    public final MusicModel LJLIL;
    public final C240639cR LJLILLLLZI;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MusicItem(musicModel=");
        LIZ.append(this.LJLIL);
        LIZ.append(", musicItemModel=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final int hashCode() {
        return this.LJLIL.getMusicId().hashCode();
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        if (interfaceC57784Mm4 instanceof C240719cZ) {
            C240719cZ c240719cZ = (C240719cZ) interfaceC57784Mm4;
            if (o.LJ(c240719cZ.LJLIL.getMusicId(), this.LJLIL.getMusicId()) && c240719cZ.LJLIL.getCollectionType() == this.LJLIL.getCollectionType() && c240719cZ.LJLIL.getPinnedVideoStatus() == this.LJLIL.getPinnedVideoStatus() && o.LJ(c240719cZ.LJLILLLLZI, this.LJLILLLLZI)) {
                return true;
            }
            return false;
        }
        return o.LJ(interfaceC57784Mm4, this);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        if (interfaceC57784Mm4 instanceof C240719cZ) {
            return o.LJ(((C240719cZ) interfaceC57784Mm4).LJLIL.getMusicId(), this.LJLIL.getMusicId());
        }
        return o.LJ(interfaceC57784Mm4, this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C240719cZ) {
            return o.LJ(((C240719cZ) obj).LJLIL.getMusicId(), this.LJLIL.getMusicId());
        }
        return super.equals(obj);
    }

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        final boolean z;
        final boolean z2;
        final boolean z3;
        final boolean z4;
        final boolean z5;
        final boolean z6;
        if (interfaceC57784Mm4 instanceof C240719cZ) {
            C240719cZ c240719cZ = (C240719cZ) interfaceC57784Mm4;
            if (c240719cZ.LJLIL.getCollectionType() != this.LJLIL.getCollectionType() || c240719cZ.LJLIL.getPinnedVideoStatus() != this.LJLIL.getPinnedVideoStatus() || !o.LJ(c240719cZ.LJLILLLLZI, this.LJLILLLLZI)) {
                if (c240719cZ.LJLILLLLZI.LJLIL != this.LJLILLLLZI.LJLIL) {
                    z = true;
                } else {
                    z = false;
                }
                if (c240719cZ.LJLIL.getCollectionType() != this.LJLIL.getCollectionType()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (c240719cZ.LJLIL.getPinnedVideoStatus() != this.LJLIL.getPinnedVideoStatus()) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                C240639cR c240639cR = c240719cZ.LJLILLLLZI;
                boolean z7 = c240639cR.LJLILLLLZI;
                C240639cR c240639cR2 = this.LJLILLLLZI;
                if (z7 != c240639cR2.LJLILLLLZI) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c240639cR.LJLJJL != c240639cR2.LJLJJL) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (c240639cR.LJLJLJ != c240639cR2.LJLJLJ) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                return new F9E(z, z2, z3, z4, z5, z6) { // from class: X.4uO
                    public final boolean LJLIL;
                    public final boolean LJLILLLLZI;
                    public final boolean LJLJI;
                    public final boolean LJLJJI;
                    public final boolean LJLJJL;
                    public final boolean LJLJJLL;

                    @Override // X.F9E
                    public final Object[] getObjects() {
                        return new Object[]{Boolean.valueOf(this.LJLIL), Boolean.valueOf(this.LJLILLLLZI), Boolean.valueOf(this.LJLJI), Boolean.valueOf(this.LJLJJI), Boolean.valueOf(this.LJLJJL), Boolean.valueOf(this.LJLJJLL)};
                    }

                    {
                        this.LJLIL = z;
                        this.LJLILLLLZI = z2;
                        this.LJLJI = z3;
                        this.LJLJJI = z4;
                        this.LJLJJL = z5;
                        this.LJLJJLL = z6;
                    }
                };
            }
            return null;
        }
        return null;
    }

    public C240719cZ(MusicModel musicModel, C240639cR c240639cR) {
        this.LJLIL = musicModel;
        this.LJLILLLLZI = c240639cR;
    }
}

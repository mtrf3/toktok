package X;

import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.o;

/* renamed from: X.Gju, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42362Gju extends QXX {
    public final List<String> LJLIL;

    public final int hashCode() {
        return Objects.hash(this.LJLIL);
    }

    public final String toString() {
        return C78966Uyw.LJJJLL("MVUploadFrameTaskParam:%s", this.LJLIL);
    }

    public C42362Gju(List<String> imageList) {
        o.LJIIIZ(imageList, "imageList");
        this.LJLIL = imageList;
    }

    @Override // X.QXX
    public final boolean LLJJJJLIIL(QXX last) {
        o.LJIIIZ(last, "last");
        if (o.LJ(last, this)) {
            return true;
        }
        if (!(last instanceof C42362Gju)) {
            return false;
        }
        C42362Gju c42362Gju = (C42362Gju) last;
        if (c42362Gju.LJLIL.size() != this.LJLIL.size()) {
            return false;
        }
        return o.LJ(ORZ.LLJJ(this.LJLIL), ORZ.LLJJ(c42362Gju.LJLIL));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C42362Gju)) {
            return false;
        }
        return C78966Uyw.LJIIIZ(new Object[]{((C42362Gju) obj).LJLIL}, new Object[]{this.LJLIL});
    }
}

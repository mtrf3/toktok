package X;

import android.opengl.GLES20;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: X.VFa, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79422VFa {
    public final LinkedList<VFZ> LIZ = new LinkedList<>();
    public final int LIZIZ = 4;
    public final int LIZJ;

    public C79422VFa(int i) {
        this.LIZJ = -1;
        this.LIZJ = i;
    }

    public final void LIZIZ(VFZ vfz) {
        Iterator<VFZ> it = this.LIZ.iterator();
        while (it.hasNext()) {
            VFZ next = it.next();
            if (next != null) {
                if (vfz.LIZ == next.LIZ) {
                    return;
                }
            } else {
                vfz.getClass();
            }
        }
        this.LIZ.offer(vfz);
        while (this.LIZ.size() > this.LIZIZ) {
            VFZ poll = this.LIZ.poll();
            C78966Uyw.LJIJ(poll.LIZ);
            int i = this.LIZJ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onTextureReturn delTex:");
            LIZ.append(poll);
            C48284IxE.LIZ(2, i, "TR_EffectTextureManager", X1D.LIZIZ(LIZ));
        }
    }

    public final VFZ LIZ(int i, int i2, int i3, int i4) {
        int i5;
        Iterator<VFZ> it = this.LIZ.iterator();
        while (it.hasNext()) {
            VFZ next = it.next();
            if (i == next.LIZJ && i2 == next.LIZLLL && i3 == next.LJFF && 6408 == next.LJI && i4 == next.LJII) {
                it.remove();
                return next;
            }
        }
        VFZ poll = this.LIZ.poll();
        if (poll == null) {
            i5 = C78966Uyw.LJJIFFI();
        } else {
            i5 = poll.LIZ;
        }
        GLES20.glBindTexture(3553, i5);
        GLES20.glTexImage2D(3553, 0, i3, i, i2, 0, 6408, i4, null);
        VFZ vfz = new VFZ(this, i5, i, i2, i3, i4);
        int i6 = this.LIZJ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("genTexture:");
        LIZ.append(vfz.toString());
        C48284IxE.LIZ(2, i6, "TR_EffectTextureManager", X1D.LIZIZ(LIZ));
        return vfz;
    }
}

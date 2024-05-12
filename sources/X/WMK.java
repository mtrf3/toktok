package X;

import Y.ARunnableS20S0000000_14;
import Y.ARunnableS50S0100000_14;
import com.bytedance.scene.group.GroupRecord;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes15.dex */
public abstract class WMK extends AbstractC82155WMd {
    public final int LJI;
    public final String LJII;
    public final WME LJIIIIZZ;
    public final /* synthetic */ WMJ LJIIIZ;

    public abstract void LIZIZ(boolean z);

    public void LIZJ(boolean z) {
    }

    public final void LIZ(ARunnableS20S0000000_14 aRunnableS20S0000000_14) {
        HashMap<WM7, C43356Gzw> hashMap = WMJ.LJII;
        C43356Gzw c43356Gzw = hashMap.get(this.LIZ);
        if (c43356Gzw != null) {
            c43356Gzw.LIZ();
            if (hashMap.get(this.LIZ) != null) {
                throw new WM8("CancellationSignal cancel callback should remove target Scene from CancellationSignal map");
            }
        }
        if (!this.LJIIIZ.LIZJ(this.LIZ)) {
            if (this.LIZ.mState == WME.NONE) {
                C78932UyO.LJI(this.LJII, "tag can't be null");
                WMT wmt = this.LJIIIZ.LIZJ;
                int i = this.LJI;
                WM7 wm7 = this.LIZ;
                String str = this.LJII;
                GroupRecord groupRecord = new GroupRecord();
                groupRecord.LJLIL = i;
                C78932UyO.LJI(wm7, "scene can't be null");
                groupRecord.LJLILLLLZI = wm7;
                C78932UyO.LJI(str, "tag can't be null");
                groupRecord.LJLJI = str;
                groupRecord.LJLJJL = wm7.getClass().getName();
                ((ArrayList) wmt.LIZ).add(groupRecord);
                ((HashMap) wmt.LIZIZ).put(groupRecord.LJLILLLLZI, groupRecord);
                ((HashMap) wmt.LIZJ).put(groupRecord.LJLJI, groupRecord);
            } else {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Scene state is ");
                throw new WM8(JBR.LJFF(LIZ, this.LIZ.mState.name, " but it is not added to record list", LIZ));
            }
        }
        boolean z = false;
        if (this.LIZJ) {
            this.LJIIIZ.LIZJ.LIZ(this.LIZ).isHidden = false;
        }
        if (this.LIZLLL) {
            this.LJIIIZ.LIZJ.LIZ(this.LIZ).isHidden = true;
        }
        if (this.LIZ.mState != this.LJIIIIZZ) {
            z = true;
        }
        LIZJ(z);
        this.LJIIIZ.LIZ(this.LIZ);
        WMJ wmj = this.LJIIIZ;
        wmj.LJIIIIZZ(wmj.LIZ, this.LIZ, this.LJIIIIZZ, this.LJ, new ARunnableS50S0100000_14(this, 25));
        if (this.LJ) {
            WMT wmt2 = this.LJIIIZ.LIZJ;
            GroupRecord LIZ2 = wmt2.LIZ(this.LIZ);
            ((ArrayList) wmt2.LIZ).remove(LIZ2);
            ((HashMap) wmt2.LIZIZ).remove(LIZ2.LJLILLLLZI);
            ((HashMap) wmt2.LIZJ).remove(LIZ2.LJLJI);
        }
        LIZIZ(z);
        aRunnableS20S0000000_14.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WMK(WMJ wmj, WM7 wm7, int i, String str, WME wme, boolean z, boolean z2, boolean z3) {
        super(wmj, wm7, wme, z, z2, z3);
        this.LJIIIZ = wmj;
        if (!z || !z2) {
            this.LJI = i;
            this.LJII = str;
            this.LJIIIIZZ = wme;
            return;
        }
        throw new IllegalArgumentException("cant forceShow with forceHide");
    }
}

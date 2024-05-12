package X;

import android.graphics.SurfaceTexture;
import android.media.ImageReader;
import android.os.Build;
import android.view.Surface;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ttvecamera.TEFrameSizei;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes12.dex */
public final class P7H extends P7K {
    public final java.util.Map<Integer, SurfaceTexture> LJIIJJI;
    public final java.util.Map<Integer, List<Surface>> LJIIL;
    public final java.util.Map<Integer, List<ImageReader>> LJIILIIL;
    public final java.util.Map<Integer, Integer> LJIILJJIL;
    public final java.util.Map<Integer, P7P> LJIILL;
    public final int LJIILLIIL;
    public final int LJIIZILJ;

    @Override // X.P7K
    public final SurfaceTexture LJI() {
        return null;
    }

    @Override // X.P7K
    public final int LJIIJJI() {
        return 32;
    }

    @Override // X.P7K
    public final void LJIILJJIL() {
    }

    @Override // X.P7K
    public final void LJIJJLI(SurfaceTexture surfaceTexture) {
    }

    @Override // X.P7K
    public final Surface LIZJ() {
        if (((HashMap) this.LJIIL).get(0) != null) {
            return (Surface) ListProtector.get((List) ((HashMap) this.LJIIL).get(0), 0);
        }
        return null;
    }

    @Override // X.P7K
    public final Surface[] LJIIIIZZ() {
        if (((HashMap) this.LJIIL).get(0) != null) {
            return (Surface[]) ((List) ((HashMap) this.LJIIL).get(0)).toArray(new Surface[0]);
        }
        return null;
    }

    @Override // X.P7K
    public final void LJIILL() {
        for (Map.Entry entry : ((ConcurrentHashMap) this.LJIILL).entrySet()) {
            if (entry.getValue() instanceof P7S) {
                entry.setValue(this.LJIIJ);
            } else {
                entry.setValue(this.LJIIIZ);
            }
        }
    }

    @Override // X.P7K
    public final void LJIILLIIL() {
        for (Map.Entry entry : ((HashMap) this.LJIIJJI).entrySet()) {
            if (entry.getValue() != null && Build.VERSION.SDK_INT >= 26 && !((SurfaceTexture) entry.getValue()).isReleased()) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("releaseSurfaceTexture, mSurfaceTexture = ");
                LIZ.append(entry.getValue());
                C63922P6w.LIZLLL("TEMultiSurfaceTextureProvider", X1D.LIZIZ(LIZ));
                ((SurfaceTexture) entry.getValue()).release();
            }
        }
    }

    @Override // X.P7K
    public final Surface LIZLLL(int i) {
        if (((HashMap) this.LJIIL).get(Integer.valueOf(i)) != null) {
            return (Surface) ListProtector.get((List) ((HashMap) this.LJIIL).get(Integer.valueOf(i)), 0);
        }
        return null;
    }

    @Override // X.P7K
    public final Surface[] LJIIIZ(int i) {
        if (((HashMap) this.LJIIL).get(Integer.valueOf(i)) != null) {
            return (Surface[]) ((List) ((HashMap) this.LJIIL).get(Integer.valueOf(i))).toArray(new Surface[0]);
        }
        return null;
    }

    @Override // X.P7K
    public final void LJIJI(P7P p7p) {
        if (((ConcurrentHashMap) this.LJIILL).get(Integer.valueOf(this.LJIILLIIL)) == null) {
            ((ConcurrentHashMap) this.LJIILL).put(Integer.valueOf(this.LJIILLIIL), p7p);
        } else {
            ((ConcurrentHashMap) this.LJIILL).put(Integer.valueOf(this.LJIIZILJ), p7p);
        }
    }

    public P7H(C63915P6p c63915P6p, X10 x10) {
        super(c63915P6p, x10);
        this.LJIIZILJ = 1;
        this.LJIIJJI = new HashMap();
        this.LJIIL = new HashMap();
        this.LJIILIIL = new HashMap();
        this.LJIILJJIL = new HashMap();
        this.LJIILL = new ConcurrentHashMap();
        if (x10 instanceof YQB) {
            x10.getClass();
            int i = YQB.LJIILLIIL;
            this.LJIILLIIL = i;
            this.LJIIZILJ = i != 0 ? 0 : 1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0013, code lost:
    
        if (r0 == 0) goto L7;
     */
    @Override // X.P7K
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LJIIL(android.hardware.camera2.params.StreamConfigurationMap r7, com.ss.android.ttvecamera.TEFrameSizei r8) {
        /*
            r6 = this;
            int[] r5 = r7.getOutputFormats()
            X.P6b r0 = r6.LIZIZ
            int r4 = X.P6E.LJII(r0)
            int r3 = r5.length
            r2 = 0
            r1 = 0
        Ld:
            if (r1 >= r3) goto L15
            r0 = r5[r1]
            if (r0 != r4) goto L23
            if (r0 != 0) goto L17
        L15:
            r0 = 35
        L17:
            android.util.Size[] r0 = r7.getOutputSizes(r0)
            java.util.List r0 = X.P7K.LIZ(r0)
            r6.LJIILIIL(r0, r8)
            return r2
        L23:
            int r1 = r1 + 1
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.P7H.LJIIL(android.hardware.camera2.params.StreamConfigurationMap, com.ss.android.ttvecamera.TEFrameSizei):int");
    }

    @Override // X.P7K
    public final void LJIILIIL(List list, TEFrameSizei tEFrameSizei) {
        if (list != null && ((ArrayList) list).size() > 0) {
            this.LIZJ = PDA.LIZIZ(list, this.LIZJ);
        }
        for (Map.Entry entry : ((HashMap) this.LJIIJJI).entrySet()) {
            SurfaceTexture surfaceTexture = (SurfaceTexture) entry.getValue();
            int intValue = ((Integer) entry.getKey()).intValue();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (surfaceTexture != null) {
                TEFrameSizei tEFrameSizei2 = this.LIZJ;
                surfaceTexture.setDefaultBufferSize(tEFrameSizei2.width, tEFrameSizei2.height);
                arrayList2.add(new Surface(surfaceTexture));
            }
            for (int i = 0; i < this.LJFF; i++) {
                TEFrameSizei tEFrameSizei3 = this.LIZJ;
                ImageReader newInstance = ImageReader.newInstance(tEFrameSizei3.width, tEFrameSizei3.height, P6E.LJII(this.LIZIZ), 1);
                newInstance.setOnImageAvailableListener(new P7A(this, entry), this.LIZLLL.getHandler());
                arrayList.add(newInstance);
                arrayList2.add(newInstance.getSurface());
            }
            ((HashMap) this.LJIILIIL).put(Integer.valueOf(intValue), arrayList);
            ((HashMap) this.LJIIL).put(Integer.valueOf(intValue), arrayList2);
        }
    }

    @Override // X.P7K
    public final void LJIL(SurfaceTexture surfaceTexture, int i) {
        P7D p7d;
        if (((HashMap) this.LJIIJJI).get(Integer.valueOf(this.LJIILLIIL)) == null) {
            ((HashMap) this.LJIIJJI).put(Integer.valueOf(this.LJIILLIIL), surfaceTexture);
            ((HashMap) this.LJIILJJIL).put(Integer.valueOf(this.LJIILLIIL), Integer.valueOf(i));
            p7d = new P7D(this, this.LJIILLIIL);
        } else {
            ((HashMap) this.LJIIJJI).put(Integer.valueOf(this.LJIIZILJ), surfaceTexture);
            ((HashMap) this.LJIILJJIL).put(Integer.valueOf(this.LJIIZILJ), Integer.valueOf(i));
            p7d = new P7D(this, this.LJIIZILJ);
        }
        if (surfaceTexture != null) {
            surfaceTexture.setOnFrameAvailableListener(p7d, this.LIZLLL.getHandler());
        }
    }
}

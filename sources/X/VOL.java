package X;

import Y.ARunnableS15S1100000_14;
import Y.ARunnableS50S0100000_14;
import android.os.Build;
import android.util.SparseArray;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.behavior.LayoutContext;
import com.lynx.tasm.behavior.shadow.NativeLayoutNodeRef;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes15.dex */
public final class VOL extends LayoutContext {
    public final VNU LIZJ;
    public final VDQ LIZLLL;
    public final C58667N0t LJ;
    public final VON LJI;
    public boolean LJIIIIZZ;
    public final java.util.Set<String> LJIIIZ;
    public final VOM LJFF = new VOM();
    public boolean LJII = true;

    @Override // com.lynx.tasm.behavior.LayoutContext
    public final void dispatchOnLayoutFinish() {
        if (this.LJII) {
            this.LJII = false;
            VON von = this.LJI;
            if (von != null) {
                von.LIZJ();
                return;
            }
            return;
        }
        VON von2 = this.LJI;
        if (von2 == null) {
            return;
        }
        von2.LIZ();
    }

    @Override // com.lynx.tasm.behavior.LayoutContext
    public final void scheduleLayout() {
        if (this.LIZIZ) {
            return;
        }
        this.LIZLLL.LIZ(new ARunnableS50S0100000_14(this, 194));
    }

    @Override // com.lynx.tasm.behavior.LayoutContext
    public final void updateDataWithoutChange() {
        if (!this.LJIIIIZZ) {
            this.LJIIIIZZ = true;
            return;
        }
        VON von = this.LJI;
        if (von != null) {
            von.LIZLLL();
        }
    }

    @Override // com.lynx.tasm.behavior.LayoutContext
    public final void detachNativePtr() {
        SparseArray<ShadowNode> sparseArray;
        super.detachNativePtr();
        VOM vom = this.LJFF;
        if (vom != null && (sparseArray = vom.LIZ) != null && sparseArray.size() > 0) {
            for (int i = 0; i < sparseArray.size(); i++) {
                ShadowNode valueAt = sparseArray.valueAt(i);
                valueAt.LJIILJJIL = true;
                valueAt.LIZ = 0L;
            }
        }
    }

    @Override // com.lynx.tasm.behavior.LayoutContext
    public final void destroyNodes(int[] iArr) {
        for (int i : iArr) {
            VOM vom = this.LJFF;
            ShadowNode shadowNode = vom.LIZ.get(i);
            vom.LIZ.remove(i);
            if (shadowNode != null) {
                shadowNode.LJIILJJIL = true;
                shadowNode.LIZ = 0L;
            }
        }
    }

    @Override // com.lynx.tasm.behavior.LayoutContext
    public final void dispatchOnLayoutBefore(int i) {
        this.LJFF.LIZ(i).LJIIIZ();
    }

    @Override // com.lynx.tasm.behavior.LayoutContext
    public final Object getExtraBundle(int i) {
        ShadowNode LIZ = this.LJFF.LIZ(i);
        if (LIZ == null) {
            return null;
        }
        return LIZ.LJIILLIIL();
    }

    @Override // com.lynx.tasm.behavior.LayoutContext
    public final void setFontFaces(ReadableMap readableMap) {
        VNU vnu = this.LIZJ;
        ReadableMap map = readableMap.getMap("fontfaces");
        if (map == null) {
            vnu.getClass();
            return;
        }
        synchronized (vnu.LJLJJI) {
            ReadableMapKeySetIterator keySetIterator = map.keySetIterator();
            while (keySetIterator.hasNextKey()) {
                String nextKey = keySetIterator.nextKey();
                ReadableMap map2 = map.getMap(nextKey);
                if (map2 != null) {
                    ((HashMap) vnu.LJLJJI).put(nextKey, map2);
                }
            }
        }
    }

    @Override // com.lynx.tasm.behavior.LayoutContext
    public final void insertNode(int i, int i2, int i3) {
        this.LJFF.LIZ(i).LJIIL(this.LJFF.LIZ(i2), i3);
    }

    @Override // com.lynx.tasm.behavior.LayoutContext
    public final void removeNode(int i, int i2, int i3) {
        this.LJFF.LIZ(i).LJIJJ(i3);
    }

    @Override // com.lynx.tasm.behavior.LayoutContext
    public final void updateProps(int i, ReadableMap readableMap, ReadableArray readableArray) {
        ShadowNode LIZ = this.LJFF.LIZ(i);
        if (LIZ != null) {
            if (readableMap != null) {
                LIZ.LJJII(new VPA(readableMap));
            }
            if (readableArray != null) {
                LIZ.LJIL(VNA.LIZ(readableArray));
                return;
            }
            return;
        }
        throw new RuntimeException(KMP.LJ("Trying to update non-existent view with tag ", i));
    }

    public VOL(VNU vnu, C58667N0t c58667N0t, VDQ vdq, VNY vny) {
        this.LIZJ = vnu;
        this.LJ = c58667N0t;
        this.LIZLLL = vdq;
        this.LJI = vny;
        if (Build.VERSION.SDK_INT >= 24) {
            this.LJIIIZ = ConcurrentHashMap.newKeySet();
        } else {
            this.LJIIIZ = new HashSet();
        }
    }

    @Override // com.lynx.tasm.behavior.LayoutContext
    public final void moveNode(int i, int i2, int i3, int i4) {
        ShadowNode LIZ = this.LJFF.LIZ(i);
        ShadowNode LIZ2 = this.LJFF.LIZ(i2);
        LIZ.LJIJJ(i3);
        LIZ.LJIIL(LIZ2, i4);
    }

    @Override // com.lynx.tasm.behavior.LayoutContext
    public final void dispatchOnLayout(int i, int i2, int i3, int i4, int i5) {
        this.LJFF.LIZ(i).LIZLLL = false;
    }

    @Override // com.lynx.tasm.behavior.LayoutContext
    public final int createNode(int i, String str, ReadableMap readableMap, long j, ReadableArray readableArray, boolean z) {
        int i2;
        C40197Fq5 LIZIZ = this.LJ.LIZIZ(str);
        if (Build.VERSION.SDK_INT >= 24 && LynxEnv.LIZLLL("enable_shadownode_statistic_report") && !this.LJIIIZ.contains(str)) {
            this.LJIIIZ.add(str);
            C64493PSv.LIZ().execute(new ARunnableS15S1100000_14(this, str, 17));
        }
        ShadowNode LIZJ = LIZIZ.LIZJ();
        if (LIZJ != null) {
            i2 = 4;
        } else {
            if (!z) {
                return 1;
            }
            if (str.equals("list")) {
                i2 = 16;
            } else {
                i2 = 1;
            }
            LIZJ = new NativeLayoutNodeRef();
        }
        LIZJ.LJIIIIZZ = i;
        LIZJ.LJIIIZ = str;
        LIZJ.LJIJJLI(this.LIZJ);
        LIZJ.LJIL(VNA.LIZ(readableArray));
        this.LJFF.LIZ.put(LIZJ.LJIIIIZZ, LIZJ);
        if (readableMap != null) {
            LIZJ.LJJII(new VPA(readableMap));
        }
        if (!this.LIZIZ) {
            i2 |= 64;
            LIZJ.LJ(j);
        }
        if (LIZJ.LJIIZILJ()) {
            i2 |= 2;
        }
        if (z && LIZJ.LJJI()) {
            return i2 | 32;
        }
        return i2;
    }
}

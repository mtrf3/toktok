package com.lynx.tasm.behavior.shadow;

import X.C0NY;
import X.C79686VPe;
import X.C79689VPh;
import X.EnumC79647VNr;
import X.F5B;
import X.VNA;
import X.VNU;
import X.VPA;
import X.VPD;
import X.X1D;
import com.bytedance.ies.xelement.text.inlinetruncation.LynxInlineTruncationShadowNode;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.utils.PropsUpdater;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes15.dex */
public class ShadowNode extends LayoutNode {
    public int LJIIIIZZ;
    public String LJIIIZ;
    public ArrayList<ShadowNode> LJIIJ;
    public ShadowNode LJIIJJI;
    public VNU LJIIL;
    public C79689VPh LJIILIIL;
    public boolean LJIILJJIL;
    public Map<String, VNA> LJIILL;
    public boolean LJIILLIIL;
    public EnumC79647VNr LJIIZILJ = EnumC79647VNr.Undefined;
    public boolean LJIJ = true;

    public Object LJIILLIIL() {
        return null;
    }

    public boolean LJIIZILJ() {
        return this instanceof LynxInlineTruncationShadowNode;
    }

    public void LJIJI() {
    }

    public boolean LJJI() {
        return this instanceof NativeLayoutNodeRef;
    }

    @Override // com.lynx.tasm.behavior.shadow.LayoutNode
    public final void LJIIIIZZ() {
        ShadowNode shadowNode;
        if (this.LJIILJJIL) {
            return;
        }
        if (!LJIIZILJ()) {
            super.LJIIIIZZ();
            return;
        }
        if (!LJIIZILJ()) {
            shadowNode = this;
        } else {
            shadowNode = this.LJIIJJI;
            while (shadowNode != null) {
                if (shadowNode.LJIIZILJ()) {
                    shadowNode = shadowNode.LJIIJJI;
                }
            }
            return;
        }
        shadowNode.LJIIIIZZ();
    }

    public final int LJIILJJIL() {
        ArrayList<ShadowNode> arrayList = this.LJIIJ;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final VNU LJIILL() {
        VNU vnu = this.LJIIL;
        if (vnu != null) {
            return vnu;
        }
        throw new AssertionError();
    }

    public boolean LJIJ() {
        Map<String, VNA> map = this.LJIILL;
        if ((map != null && !map.isEmpty()) || this.LJIILLIIL || this.LJIIZILJ != EnumC79647VNr.Undefined) {
            return true;
        }
        return false;
    }

    public C79686VPe LJJIFFI() {
        return new C79686VPe(this.LJIIIIZZ, this.LJIILL, this.LJIILLIIL, this.LJIJ, this.LJIIZILJ);
    }

    public String toString() {
        return this.LJIIIZ;
    }

    public final ShadowNode LJIILIIL(int i) {
        ArrayList<ShadowNode> arrayList = this.LJIIJ;
        if (arrayList != null) {
            return (ShadowNode) ListProtector.get(arrayList, i);
        }
        throw new ArrayIndexOutOfBoundsException(C0NY.LIZIZ("Index ", i, " out of bounds: node has no children"));
    }

    public final void LJIJJ(int i) {
        ArrayList<ShadowNode> arrayList = this.LJIIJ;
        if (arrayList != null) {
            ((ShadowNode) ListProtector.remove(arrayList, i)).LJIIJJI = null;
            return;
        }
        throw new ArrayIndexOutOfBoundsException(C0NY.LIZIZ("Index ", i, " out of bounds: node has no children"));
    }

    public void LJIJJLI(VNU vnu) {
        this.LJIIL = vnu;
    }

    public void LJIL(Map<String, VNA> map) {
        this.LJIILL = map;
    }

    public final void LJJ(ReadableArray readableArray) {
        if (this.LJIILIIL == null) {
            this.LJIILIIL = new C79689VPh();
        }
        if (readableArray == null || readableArray.size() < 2) {
            C79689VPh c79689VPh = this.LJIILIIL;
            c79689VPh.LIZ = 0;
            c79689VPh.LIZIZ = 0.0f;
        } else {
            this.LJIILIIL.LIZ = readableArray.getInt(0);
            this.LJIILIIL.LIZIZ = (float) readableArray.getDouble(1);
        }
        LJIIIIZZ();
    }

    public final void LJJII(VPA vpa) {
        try {
            PropsUpdater.LIZIZ(this, vpa);
            LJIJI();
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Catch exception for tag: ");
            String str = this.LJIIIZ;
            if (str != null) {
                LIZ.append(str);
                LLog.LIZLLL(4, "lynx_ShadowNode", X1D.LIZIZ(LIZ));
                LJIILL().handleException(e);
                return;
            }
            throw new AssertionError();
        }
    }

    @VPD(name = "event-through")
    public void setEventThrough(F5B f5b) {
        EnumC79647VNr enumC79647VNr;
        if (f5b == null) {
            this.LJIIZILJ = EnumC79647VNr.Undefined;
        }
        try {
            if (f5b.asBoolean()) {
                enumC79647VNr = EnumC79647VNr.Enable;
            } else {
                enumC79647VNr = EnumC79647VNr.Disable;
            }
            this.LJIIZILJ = enumC79647VNr;
        } catch (Throwable th) {
            LLog.LIZLLL(2, "lynx_ShadowNode", th.toString());
            this.LJIIZILJ = EnumC79647VNr.Undefined;
        }
    }

    @VPD(name = "enable-touch-pseudo-propagation")
    public void setEventThroughPropagation(F5B f5b) {
        if (f5b == null) {
            this.LJIJ = true;
            return;
        }
        try {
            this.LJIJ = f5b.asBoolean();
        } catch (Throwable th) {
            LLog.LIZLLL(2, "lynx_ShadowNode", th.toString());
            this.LJIJ = true;
        }
    }

    @VPD(name = "ignore-focus")
    public void setIgnoreFocus(boolean z) {
        this.LJIILLIIL = z;
    }

    @VPD(name = "vertical-align")
    public void setVerticalAlign(ReadableArray readableArray) {
        if (!this.LJIIL.LLF) {
            LJJ(readableArray);
        }
    }

    public void LJIIL(ShadowNode shadowNode, int i) {
        if (shadowNode.LJIIJJI == null) {
            if (this.LJIIJ == null) {
                this.LJIIJ = new ArrayList<>(4);
            }
            ListProtector.add(this.LJIIJ, i, shadowNode);
            shadowNode.LJIIJJI = this;
            return;
        }
        throw new RuntimeException("Tried to add child that already has a parent! Remove it from its parent first.");
    }
}

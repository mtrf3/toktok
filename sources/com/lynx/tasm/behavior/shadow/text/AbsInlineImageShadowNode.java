package com.lynx.tasm.behavior.shadow.text;

import X.AbstractC79742VRi;
import X.C49615Jdb;
import X.C79689VPh;
import X.V9Z;
import X.VNA;
import X.VPD;
import X.VPE;
import X.VQ3;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import java.util.Map;

/* loaded from: classes15.dex */
public abstract class AbsInlineImageShadowNode extends BaseTextShadowNode {
    public boolean LJJIJIIJIL;
    public boolean LJJIJIL;
    public int LJJIJL;
    public VQ3 LJJIJLIJ;

    @Override // com.lynx.tasm.behavior.shadow.ShadowNode
    public final boolean LJIIZILJ() {
        return true;
    }

    public abstract V9Z LJJIL();

    @VPD(name = "mode")
    public abstract void setMode(String str);

    @VPD(name = "src")
    public abstract void setSource(String str);

    public final VQ3 LJJIZ() {
        if (this.LJJIJLIJ == null) {
            this.LJJIJLIJ = new VQ3(LJIILL());
        }
        return this.LJJIJLIJ;
    }

    @Override // com.lynx.tasm.behavior.shadow.ShadowNode
    public final void LJIL(Map<String, VNA> map) {
        this.LJIILL = map;
        if (map != null) {
            this.LJJIJIIJIL = map.containsKey("load");
            this.LJJIJIL = map.containsKey("error");
        }
    }

    public final void LJJJ(String str) {
        if (!this.LJJIJIL) {
            return;
        }
        C49615Jdb c49615Jdb = new C49615Jdb(this.LJIIIIZZ, "error");
        c49615Jdb.LIZJ(str, "errMsg");
        LJIILL().LJLJJL.LIZIZ(c49615Jdb);
    }

    public void LJJJIL(AbstractC79742VRi abstractC79742VRi) {
        C79689VPh c79689VPh = this.LJIILIIL;
        if (c79689VPh != null) {
            int i = c79689VPh.LIZ;
            float f = c79689VPh.LIZIZ;
            abstractC79742VRi.LJLIL = i;
            abstractC79742VRi.LJLILLLLZI = f;
        }
    }

    @VPD(defaultInt = 0, name = "background-color")
    public void setBackgroundColor(int i) {
        this.LJJIJL = i;
    }

    @Override // com.lynx.tasm.behavior.shadow.ShadowNode
    @VPD(name = "vertical-align")
    public void setVerticalAlign(ReadableArray readableArray) {
        LJJ(readableArray);
    }

    public final void LJJJI(int i, int i2) {
        if (!this.LJJIJIIJIL) {
            return;
        }
        C49615Jdb c49615Jdb = new C49615Jdb(this.LJIIIIZZ, "load");
        c49615Jdb.LIZJ(Integer.valueOf(i2), "height");
        c49615Jdb.LIZJ(Integer.valueOf(i), "width");
        LJIILL().LJLJJL.LIZIZ(c49615Jdb);
    }

    @VPE(customType = "Color", names = {"border-left-color", "border-right-color", "border-top-color", "border-bottom-color"})
    public void setBorderColor(int i, Integer num) {
        LJJIZ().LJI(LynxBaseUI.SPACING_TYPES[i + 1], num);
    }

    @VPE(names = {"border-radius", "border-top-left-radius", "border-top-right-radius", "border-bottom-right-radius", "border-bottom-left-radius"})
    public void setBorderRadius(int i, ReadableArray readableArray) {
        LJJIZ().LJII(i, readableArray);
    }

    @VPE(defaultInt = -1, names = {"border-style", "border-left-style", "border-right-style", "border-top-style", "border-bottom-style"})
    public void setBorderStyle(int i, int i2) {
        LJJIZ().LJIIIZ(LynxBaseUI.SPACING_TYPES[i], i2);
    }

    @VPE(names = {"border-width", "border-left-width", "border-right-width", "border-top-width", "border-bottom-width"})
    public void setBorderWidth(int i, int i2) {
        LJJIZ().LJIIJ(i2, LynxBaseUI.SPACING_TYPES[i]);
    }
}

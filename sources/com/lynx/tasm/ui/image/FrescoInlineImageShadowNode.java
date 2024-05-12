package com.lynx.tasm.ui.image;

import X.AbstractC78707Uul;
import X.C13870gZ;
import X.C78731Uv9;
import X.C81705W4v;
import X.InterfaceC78716Uuu;
import X.V9Z;
import X.VA1;
import X.VPD;
import X.W5I;
import X.X1D;
import android.content.res.Resources;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.lynx.tasm.behavior.shadow.LayoutNode;
import com.lynx.tasm.behavior.shadow.text.AbsInlineImageShadowNode;
import o53.IDdS479S0100000_14;

/* loaded from: classes15.dex */
public class FrescoInlineImageShadowNode extends AbsInlineImageShadowNode {
    public Uri LJJIL;
    public String LJJJI;
    public boolean LJJJIL;
    public boolean LJJJJ;
    public int LJJJJIZL;
    public final C81705W4v LJJJ = W5I.LIZJ();
    public AbstractC78707Uul LJJIZ = InterfaceC78716Uuu.LJJJLZIJ;
    public final IDdS479S0100000_14 LJJJJI = new IDdS479S0100000_14(this, 0);

    @Override // com.lynx.tasm.behavior.shadow.ShadowNode
    public final void LJIJI() {
        if (this.LJJJIL) {
            Uri uri = null;
            if (this.LJJJI != null) {
                if (!this.LJJJJ) {
                    this.LJJJI = VA1.LIZ(LJIILL(), this.LJJJI, false);
                }
                Uri parse = UriProtector.parse(this.LJJJI);
                if (parse.getScheme() == null) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("Image src should not be relative url : ");
                    C13870gZ.LIZJ(LIZ, this.LJJJI, LIZ, 4, "Lynx");
                } else {
                    uri = parse;
                }
            }
            this.LJJIL = uri;
            this.LJJJIL = false;
        }
        LJIIIIZZ();
    }

    @Override // com.lynx.tasm.behavior.shadow.text.AbsInlineImageShadowNode
    public final V9Z LJJIL() {
        Resources resources = LJIILL().getResources();
        float LJII = ((LayoutNode) this.LJI.LIZ).LJII();
        float LJFF = ((LayoutNode) this.LJI.LIZ).LJFF();
        int[] LIZIZ = this.LJI.LIZIZ();
        int ceil = (int) Math.ceil(LJII);
        int ceil2 = (int) Math.ceil(LJFF);
        Uri uri = this.LJJIL;
        AbstractC78707Uul abstractC78707Uul = this.LJJIZ;
        C81705W4v c81705W4v = this.LJJJ;
        LJIILL();
        return new V9Z(resources, ceil, ceil2, LIZIZ, uri, abstractC78707Uul, c81705W4v, this.LJJJJI);
    }

    @VPD(name = "loop-count")
    public void setLoopCount(int i) {
        if (i <= 0) {
            i = 0;
        }
        this.LJJJJIZL = i;
    }

    @Override // com.lynx.tasm.behavior.shadow.text.AbsInlineImageShadowNode
    public final void setMode(String str) {
        this.LJJIZ = C78731Uv9.LIZ(str);
    }

    @VPD(defaultBoolean = false, name = "skip-redirection")
    public void setSkipRedirection(boolean z) {
        this.LJJJJ = z;
    }

    @Override // com.lynx.tasm.behavior.shadow.text.AbsInlineImageShadowNode
    public final void setSource(String str) {
        this.LJJJI = str;
        this.LJJJIL = true;
        LJIIIIZZ();
    }
}

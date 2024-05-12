package com.lynx.component.svg;

import X.C39981Fmb;
import X.C39984Fme;
import X.C64493PSv;
import X.C73336SqK;
import X.C79411VEp;
import X.C79483VHj;
import X.C87698YbO;
import X.VA1;
import X.VNU;
import X.VPD;
import X.VU0;
import X.VU2;
import X.VU5;
import X.VU6;
import Y.ARunnableS15S1100000_14;
import Y.ARunnableS50S0100000_14;
import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.mt.protector.impl.UriProtector;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.ui.LynxUI;

/* loaded from: classes15.dex */
public class UISvg extends LynxUI<C73336SqK> {
    public String LJLIL;
    public String LJLILLLLZI;
    public final C79483VHj LJLJI;
    public final VU5 LJLJJI;
    public C87698YbO LJLJJL;

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void destroy() {
        super.destroy();
        this.LJLJI.LIZ();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onDetach() {
        super.onDetach();
        this.LJLJI.LIZ();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onLayoutUpdated() {
        super.onLayoutUpdated();
        VU5 vu5 = this.LJLJJI;
        float width = getWidth();
        float height = getHeight();
        vu5.getClass();
        vu5.LIZ = new VU6(0.0f, 0.0f, width, height);
        if (this.LJLJJL != null) {
            C79411VEp.LIZJ(new ARunnableS50S0100000_14(this, 218));
        }
    }

    public UISvg(VNU vnu) {
        super(vnu);
        this.LJLJJI = new VU5(vnu.LJLJLLL.mFontSize, this.mFontSize);
        this.LJLJI = new C79483VHj(vnu, this);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final C73336SqK createView(Context context) {
        return new C73336SqK(context);
    }

    @VPD(name = "content")
    public void setContent(String str) {
        if (TextUtils.isEmpty(str)) {
            ((C73336SqK) this.mView).setImageDrawable(null);
        } else {
            if (str.equals(this.LJLILLLLZI)) {
                return;
            }
            this.LJLILLLLZI = str;
            C64493PSv.LIZ().execute(new ARunnableS15S1100000_14(this, str, 8));
        }
    }

    @VPD(name = "src")
    public void setSource(String str) {
        if (TextUtils.isEmpty(str)) {
            this.LJLIL = null;
            ((C73336SqK) this.mView).setImageDrawable(null);
            return;
        }
        if (str.equals(this.LJLIL)) {
            return;
        }
        this.LJLIL = str;
        if (str.startsWith("data:image/svg+xml;base64")) {
            setContent(new String(Base64.decode(this.LJLIL.substring(26).getBytes(), 0)));
            return;
        }
        C79483VHj c79483VHj = this.LJLJI;
        String str2 = this.LJLIL;
        VU2 vu2 = new VU2(this);
        String LIZ = VA1.LIZ(c79483VHj.LIZIZ, str2, false);
        if (TextUtils.isEmpty(LIZ)) {
            LLog.LIZLLL(4, "lynx_UISvg", "url is empty!");
            return;
        }
        if (TextUtils.isEmpty(UriProtector.parse(LIZ).getScheme())) {
            LLog.LIZLLL(4, "lynx_UISvg", "scheme is Empty!");
            return;
        }
        C39984Fme c39984Fme = new C39984Fme(LIZ);
        if (C39981Fmb.LIZIZ == null) {
            synchronized (C39981Fmb.class) {
                if (C39981Fmb.LIZIZ == null) {
                    C39981Fmb.LIZIZ = new C39981Fmb();
                }
            }
        }
        C39981Fmb.LIZIZ.LIZ(c39984Fme, new VU0(LIZ, vu2));
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void updateLayout(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, Rect rect) {
        super.updateLayout(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, rect);
        VU5 vu5 = this.LJLJJI;
        float width = getWidth();
        float height = getHeight();
        vu5.getClass();
        vu5.LIZ = new VU6(0.0f, 0.0f, width, height);
        if (this.LJLJJL != null) {
            C79411VEp.LIZJ(new ARunnableS50S0100000_14(this, 218));
        }
    }
}

package X;

import com.lynx.tasm.LynxTemplateRender;
import com.lynx.tasm.TemplateData;
import defpackage.a1;

/* loaded from: classes15.dex */
public class VNW implements InterfaceC40525FvN {
    public final TemplateData LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final java.util.Map<String, Object> LIZLLL;
    public final NC6 LJ;
    public final /* synthetic */ LynxTemplateRender LJFF;

    public static void LIZIZ(String str) {
        if (C16880lQ.LLLLIIIILLL().equals(C16880lQ.LLJJJJ().getThread())) {
        } else {
            throw new IllegalThreadStateException(a1.LJ("Callback ", str, "must be fired on main thread."));
        }
    }

    @Override // X.InterfaceC40525FvN
    public final void LIZ(byte[] bArr) {
        LIZIZ("onSuccess");
        if (bArr == null || bArr.length == 0) {
            onFailed("Source is null!");
            return;
        }
        LynxTemplateRender lynxTemplateRender = this.LJFF;
        String str = this.LIZJ;
        lynxTemplateRender.getClass();
        LynxTemplateRender.LJIILLIIL(str);
        VNX vnx = this.LJFF.LJJIIJZLJL;
        if (vnx != null) {
            TemplateData templateData = this.LIZ;
            java.util.Map<String, Object> map = this.LIZLLL;
            String str2 = this.LIZIZ;
            C79631VNb c79631VNb = vnx.LIZLLL;
            if (c79631VNb != null) {
                if (templateData != null) {
                    c79631VNb.LIZIZ.getClass();
                    c79631VNb.LIZIZ.LIZ = templateData;
                } else if (map != null) {
                    TemplateData LJ = TemplateData.LJ(map);
                    c79631VNb.LIZIZ.getClass();
                    c79631VNb.LIZIZ.LIZ = LJ;
                } else if (str2 != null) {
                    TemplateData LJFF = TemplateData.LJFF(str2);
                    c79631VNb.LIZIZ.getClass();
                    c79631VNb.LIZIZ.LIZ = LJFF;
                } else {
                    c79631VNb.LIZIZ.getClass();
                    c79631VNb.LIZIZ.LIZ = null;
                }
            }
            InterfaceC79642VNm interfaceC79642VNm = vnx.LIZJ;
            if (interfaceC79642VNm != null) {
                interfaceC79642VNm.LIZIZ();
            }
            InterfaceC79644VNo interfaceC79644VNo = vnx.LIZ;
            if (interfaceC79644VNo != null) {
                interfaceC79644VNo.LJIIJJI();
            }
        }
        C79600VLw c79600VLw = this.LJFF.LIZIZ.LJIIIIZZ;
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis != 0) {
            c79600VLw.LJIIIIZZ("prepare_template_end", currentTimeMillis, null);
        } else {
            c79600VLw.getClass();
        }
        if (this.LJ == NC6.SSR) {
            this.LJFF.LJIJ(bArr, this.LIZJ, this.LIZLLL);
            return;
        }
        TemplateData templateData2 = this.LIZ;
        if (templateData2 != null) {
            this.LJFF.LJIJJ(bArr, templateData2);
            return;
        }
        java.util.Map<String, Object> map2 = this.LIZLLL;
        if (map2 != null) {
            this.LJFF.LJIJJLI(bArr, map2);
            return;
        }
        LynxTemplateRender lynxTemplateRender2 = this.LJFF;
        String str3 = this.LIZIZ;
        if (str3 == null) {
            str3 = "";
        }
        lynxTemplateRender2.LJIJI(str3, bArr);
    }

    @Override // X.InterfaceC40525FvN
    public final void onFailed(String str) {
        LIZIZ("onFailed");
        this.LJFF.LJIILIIL(103, str);
    }

    public VNW(LynxTemplateRender lynxTemplateRender, String str, TemplateData templateData) {
        this.LJFF = lynxTemplateRender;
        this.LJ = NC6.TEMPLATE;
        this.LIZ = templateData;
        this.LIZJ = str;
    }

    public VNW(LynxTemplateRender lynxTemplateRender, String str, String str2) {
        this.LJFF = lynxTemplateRender;
        this.LJ = NC6.TEMPLATE;
        this.LIZIZ = str2;
        this.LIZJ = str;
    }

    public VNW(LynxTemplateRender lynxTemplateRender, String str, java.util.Map<String, Object> map) {
        this.LJFF = lynxTemplateRender;
        this.LJ = NC6.TEMPLATE;
        this.LIZLLL = map;
        this.LIZJ = str;
    }

    public VNW(LynxTemplateRender lynxTemplateRender, String str, java.util.Map map, int i) {
        NC6 nc6 = NC6.SSR;
        this.LJFF = lynxTemplateRender;
        this.LJ = NC6.TEMPLATE;
        this.LIZJ = str;
        this.LJ = nc6;
        this.LIZLLL = map;
    }
}

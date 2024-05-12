package X;

import com.ss.ugc.effectplatform.model.Effect;
import com.ss.ugc.effectplatform.model.UrlModel;
import defpackage.i0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ujb.o;

/* loaded from: classes16.dex */
public final class XBO extends XBW<Effect> {
    public final XCG LIZLLL;
    public final String LJ;
    public final Effect LJFF;
    public final C0FT LJI;

    public final void LJIIJ() {
        if (C10820be.LJ(this.LJFF.getTransResPath())) {
            C10820be.LJIILL(this.LJFF.getTransResPath());
        }
    }

    @Override // X.XBW
    public final void LIZIZ() {
        String str;
        Integer num;
        Integer num2;
        String str2;
        String LJII;
        List<String> url_list;
        List<String> url_prefix;
        String uri;
        String str3 = this.LJ;
        if (str3 == null || o.LJJJJJL(str3)) {
            LJIIJ();
            throw new Exception("effectDir is null");
        }
        UrlModel trans_file_url = this.LJFF.getTrans_file_url();
        Exception e = null;
        if (trans_file_url != null && (uri = trans_file_url.getUri()) != null && !o.LJJJJJL(uri) && o.LJJJJJL(this.LJFF.getTransResPath())) {
            XDM xdm = XDM.LIZ;
            String str4 = this.LJ;
            Effect effect = this.LJFF;
            xdm.getClass();
            XDM.LJIIJJI(effect, str4);
        }
        C12310e3 c12310e3 = C12310e3.LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("fetchEffect: ");
        LIZ.append(this.LJFF.getEffect_id());
        LIZ.append(" name: ");
        LIZ.append(this.LJFF.getName());
        LIZ.append(" download trans res: ");
        LIZ.append(this.LJFF.getTransResPath());
        String LIZIZ = X1D.LIZIZ(LIZ);
        c12310e3.getClass();
        C12310e3.LIZ("DownloadTransResourceTask", LIZIZ);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("Info : ");
        UrlModel trans_file_url2 = this.LJFF.getTrans_file_url();
        if (trans_file_url2 != null) {
            str = trans_file_url2.getUri();
        } else {
            str = null;
        }
        LIZ2.append(str);
        LIZ2.append(" : ");
        UrlModel trans_file_url3 = this.LJFF.getTrans_file_url();
        if (trans_file_url3 != null && (url_prefix = trans_file_url3.getUrl_prefix()) != null) {
            num = Integer.valueOf(url_prefix.size());
        } else {
            num = null;
        }
        LIZ2.append(num);
        LIZ2.append(' ');
        LIZ2.append(": ");
        UrlModel trans_file_url4 = this.LJFF.getTrans_file_url();
        if (trans_file_url4 != null && (url_list = trans_file_url4.getUrl_list()) != null) {
            num2 = Integer.valueOf(url_list.size());
        } else {
            num2 = null;
        }
        LIZ2.append(num2);
        C12310e3.LIZIZ("DownloadTransResourceTask", X1D.LIZIZ(LIZ2), null);
        if (C10820be.LJ(this.LJFF.getTransResPath())) {
            return;
        }
        C84405XAr.LIZ(this.LJFF, this.LJ);
        XDM xdm2 = XDM.LIZ;
        UrlModel trans_file_url5 = this.LJFF.getTrans_file_url();
        xdm2.getClass();
        List LJ = XDM.LJ(trans_file_url5);
        if (LJ != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : LJ) {
                if (!o.LJJJJJL((String) obj)) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                long currentTimeMillis = System.currentTimeMillis();
                String str5 = this.LJ;
                String transResPath = this.LJFF.getTransResPath();
                UrlModel trans_file_url6 = this.LJFF.getTrans_file_url();
                if (trans_file_url6 != null) {
                    str2 = trans_file_url6.getUri();
                } else {
                    str2 = null;
                }
                if (!C10820be.LJ(str5)) {
                    C10820be.LJIIJJI(str5);
                }
                C84424XBk c84424XBk = new C84424XBk(new C84425XBl(new C84420XBg((X62) this.LIZLLL.LJIJI.LIZ), new XBT(str5, i0.LJFF(transResPath, ".zip"), str2)), new XBZ(transResPath));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    try {
                        c84424XBk.LIZ(new XD6((String) it.next(), null, XD7.GET, null, null, 186));
                        InterfaceC84458XCs LIZ3 = C84395XAh.LIZ(str5);
                        if (LIZ3 != null && (LJII = C10820be.LJII(this.LJFF.getTransResPath())) != null) {
                            XBL.LJIJJ.getClass();
                            String LIZJ = XBQ.LIZJ(LJII);
                            XBL LJ2 = ((XBK) LIZ3).LJ();
                            if (LJ2 != null) {
                                LJ2.LIZ(LIZJ);
                            }
                        }
                        this.LJI.LIZ = C44847Hit.LIZ(currentTimeMillis);
                        return;
                    } catch (Exception e2) {
                        e = e2;
                    }
                }
                LJIIJ();
                if (e != null) {
                    throw e;
                }
                throw new Exception("unknown exception");
            }
        }
        LJIIJ();
        throw new XB9("trans file url not exist");
    }

    public XBO(XCG effectConfig, String str, Effect effect, C0FT translateTime) {
        kotlin.jvm.internal.o.LJIIJ(effectConfig, "effectConfig");
        kotlin.jvm.internal.o.LJIIJ(effect, "effect");
        kotlin.jvm.internal.o.LJIIJ(translateTime, "translateTime");
        this.LIZLLL = effectConfig;
        this.LJ = str;
        this.LJFF = effect;
        this.LJI = translateTime;
    }
}

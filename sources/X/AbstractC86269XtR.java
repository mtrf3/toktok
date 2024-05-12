package X;

import android.content.Context;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostMediaDepend;
import com.google.android.play.core.appupdate.u;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* renamed from: X.XtR, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public abstract class AbstractC86269XtR extends AbstractC37780EsC {
    public final EnumC38005Evp LIZIZ = EnumC38005Evp.PRIVATE;

    @Override // X.InterfaceC37774Es6
    public final String getName() {
        return "x.chooseMedia";
    }

    @Override // X.AbstractC37780EsC, X.InterfaceC37774Es6
    public final Class<C86270XtS> LIZ() {
        return C86270XtS.class;
    }

    @Override // X.AbstractC37780EsC, X.InterfaceC37774Es6
    public final Class<C86262XtK> LIZLLL() {
        return C86262XtK.class;
    }

    @Override // X.AbstractC37780EsC, X.InterfaceC37774Es6
    public final EnumC38005Evp getAccess() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC37774Es6
    public final void LIZJ(InterfaceC78280Uns params, InterfaceC31943CgF interfaceC31943CgF, EnumC37847EtH type) {
        C86291Xtn c86291Xtn;
        IHostMediaDepend iHostMediaDepend;
        o.LJIIJ(params, "params");
        o.LJIIJ(type, "type");
        C86270XtS c86270XtS = null;
        InterfaceC78502UrS LJJIIZ = u.LJJIIZ(params, "mediaTypes", null);
        if (LJJIIZ != null) {
            ArrayList arrayList = new ArrayList();
            int size = LJJIIZ.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(LJJIIZ.getString(i));
            }
            String LJJIJIL = u.LJJIJIL(params, "sourceType", "");
            if (LJJIJIL.length() != 0) {
                int LJJIJIIJI = u.LJJIJIIJI(params, "maxCount", 1);
                boolean LJJIIZI = u.LJJIIZI(params, "compressImage", false);
                boolean LJJIIZI2 = u.LJJIIZI(params, "saveToPhotoAlbum", false);
                String LJJIJIL2 = u.LJJIJIL(params, "cameraType", "");
                u.LJJIIZI(params, "needBinaryData", false);
                int LJJIJIIJI2 = u.LJJIJIIJI(params, "compressWidth", 0);
                int LJJIJIIJI3 = u.LJJIJIIJI(params, "compressHeight", 0);
                boolean LJJIIZI3 = u.LJJIIZI(params, "isNeedCut", false);
                int LJJIJIIJI4 = u.LJJIJIIJI(params, "cropRatioHeight", 0);
                int LJJIJIIJI5 = u.LJJIJIIJI(params, "cropRatioWidth", 0);
                boolean LJJIIZI4 = u.LJJIIZI(params, "needBase64Data", false);
                int LJJIJIIJI6 = u.LJJIJIIJI(params, "compressOption", 0);
                int LJJIJIIJI7 = u.LJJIJIIJI(params, "permissionDenyAction", 0);
                boolean LJJIIZI5 = u.LJJIIZI(params, "isMultiSelect", false);
                c86270XtS = new C86270XtS();
                c86270XtS.LIZ = arrayList;
                c86270XtS.LIZIZ = LJJIJIL;
                c86270XtS.LIZJ = LJJIJIIJI;
                c86270XtS.LIZLLL = LJJIIZI;
                c86270XtS.LJ = LJJIIZI2;
                o.LJIIJ(LJJIJIL2, "<set-?>");
                c86270XtS.LJFF = LJJIJIL2;
                c86270XtS.LJI = LJJIJIIJI2;
                c86270XtS.LJII = LJJIJIIJI3;
                c86270XtS.LJIIIIZZ = LJJIIZI3;
                c86270XtS.LJIIIZ = LJJIJIIJI5;
                c86270XtS.LJIIJ = LJJIJIIJI4;
                c86270XtS.LJIIJJI = LJJIIZI4;
                c86270XtS.LJIIL = LJJIJIIJI6;
                c86270XtS.LJIILIIL = LJJIJIIJI7;
                c86270XtS.LJIILJJIL = LJJIIZI5;
            }
        }
        if (c86270XtS == null) {
            AbstractC37780EsC.LJFF(this, interfaceC31943CgF, -3, null, 12);
            return;
        }
        C86261XtJ c86261XtJ = new C86261XtJ(this, interfaceC31943CgF);
        String str = c86270XtS.LIZIZ;
        if (str != null) {
            String str2 = c86270XtS.LJFF;
            Locale locale = Locale.ROOT;
            o.LJFF(locale, "Locale.ROOT");
            String lowerCase = str.toLowerCase(locale);
            o.LJFF(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            if (o.LJ(lowerCase, "camera") && str2.length() == 0) {
                c86261XtJ.onFailure(-3, "CameraType not provided with sourceType specified as camera in params");
                return;
            }
            Context context = (Context) LJII(Context.class);
            if (context != null) {
                List<String> list = c86270XtS.LIZ;
                if (list != null) {
                    String str3 = c86270XtS.LIZIZ;
                    if (str3 != null) {
                        C86236Xsu c86236Xsu = new C86236Xsu(list, str3, c86270XtS.LIZJ, c86270XtS.LIZLLL, c86270XtS.LJ, c86270XtS.LJFF, c86270XtS.LJI, c86270XtS.LJII);
                        c86236Xsu.LIZ = c86270XtS.LJIIIIZZ;
                        c86236Xsu.LIZJ = c86270XtS.LJIIJ;
                        c86236Xsu.LIZIZ = c86270XtS.LJIIIZ;
                        c86236Xsu.LIZLLL = c86270XtS.LJIIJJI;
                        c86236Xsu.LJ = c86270XtS.LJIIL;
                        c86236Xsu.LJFF = c86270XtS.LJIILIIL;
                        c86236Xsu.LJI = c86270XtS.LJIILJJIL;
                        C86243Xt1 c86243Xt1 = new C86243Xt1(c86261XtJ);
                        C86291Xtn c86291Xtn2 = (C86291Xtn) LJII(C86291Xtn.class);
                        if ((c86291Xtn2 != null && (iHostMediaDepend = c86291Xtn2.LIZJ) != null) || ((c86291Xtn = C86291Xtn.LJIIL) != null && (iHostMediaDepend = c86291Xtn.LIZJ) != null)) {
                            iHostMediaDepend.handleJsInvoke(context, c86236Xsu, c86243Xt1);
                            return;
                        } else {
                            c86261XtJ.onFailure(0, "hostMediaDepend is null");
                            return;
                        }
                    }
                    o.LJIJI("sourceType");
                    throw null;
                }
                o.LJIJI("mediaTypes");
                throw null;
            }
            c86261XtJ.onFailure(0, "Context not provided in host");
            return;
        }
        o.LJIJI("sourceType");
        throw null;
    }
}

package X;

import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.forest.model.RequestParams;
import com.bytedance.lynx.hybrid.service.IResourceService;
import com.lynx.tasm.LynxError;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.Fn6, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40012Fn6 extends AbstractC40015Fn9 {
    @Override // X.AbstractC40015Fn9
    public final Typeface LIZ(VNU vnu, EnumC40050Fni enumC40050Fni, String str) {
        boolean z;
        boolean z2;
        VNS vns;
        C61295O3v LIZ;
        C60737Nsb hybridContext;
        boolean z3 = true;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        Typeface typeface = null;
        if (z) {
            return null;
        }
        List<Pattern> list = C60905NvJ.LIZIZ;
        if (list != null && !list.isEmpty()) {
            Iterator<Pattern> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().matcher(str).find()) {
                    z2 = true;
                    break;
                }
            }
        }
        z2 = false;
        C60905NvJ.LJIIIZ(str, null, null, null, z2);
        if (z2) {
            return null;
        }
        InterfaceC61488OBg LIZIZ = C60905NvJ.LIZIZ(null, null);
        if (LIZIZ instanceof IResourceService) {
            O1M o1m = new O1M(0);
            o1m.LJIIL = "sub_source";
            O26 loadSync = ((IResourceService) LIZIZ).loadSync(str, o1m);
            if (loadSync != null) {
                String str2 = loadSync.LJII;
                if (str2 != null && str2.length() != 0) {
                    z3 = false;
                }
                if (z3) {
                    return null;
                }
                try {
                    String str3 = loadSync.LJII;
                    if (str3 != null) {
                        Typeface LJJLIIIJLJLI = C16880lQ.LJJLIIIJLJLI(new File(str3));
                        if (LJJLIIIJLJLI != null) {
                            C40013Fn7.LIZJ.put(str, LJJLIIIJLJLI);
                            C39048FUe c39048FUe = C39048FUe.LIZIZ;
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append("cache font for ");
                            LIZ2.append(str);
                            c39048FUe.LIZ(X1D.LIZIZ(LIZ2), EnumC39866Fkk.I, "Lynx");
                        }
                    } else {
                        o.LJIIZILJ();
                        throw null;
                    }
                } catch (Exception e) {
                    C39048FUe c39048FUe2 = C39048FUe.LIZIZ;
                    StringBuilder LIZIZ2 = C25620zW.LIZIZ("get font:{ ", str, " } error, msg = {");
                    LIZIZ2.append(e.getMessage());
                    LIZIZ2.append('}');
                    c39048FUe2.LIZ(X1D.LIZIZ(LIZIZ2), EnumC39866Fkk.I, "Lynx");
                }
            }
        } else if (LIZIZ instanceof C39902FlK) {
            RequestParams requestParams = new RequestParams(EnumC61028NxI.LYNX_FONT);
            if (vnu != null) {
                vns = vnu.LJI();
            } else {
                vns = null;
            }
            if (!(vns instanceof C60726NsQ)) {
                vns = null;
            }
            C60726NsQ c60726NsQ = (C60726NsQ) vns;
            if (c60726NsQ != null && (hybridContext = c60726NsQ.getHybridContext()) != null) {
                requestParams.getCustomParams().put("rl_container_uuid", hybridContext.containerId);
                C60905NvJ.LJ(requestParams, hybridContext);
            }
            String LIZLLL = C60905NvJ.LIZLLL(str, requestParams, null);
            if (!o.LJ(LIZLLL, str)) {
                requestParams.getCustomParams().put("resource_url", str);
            }
            C38515F9r LIZJ = ((C39902FlK) LIZIZ).LIZJ(LIZLLL, requestParams);
            if (LIZJ != null && (LIZ = LIZJ.LIZ()) != null) {
                String filePath = LIZ.getFilePath();
                if (filePath != null && filePath.length() != 0) {
                    z3 = false;
                }
                if (z3) {
                    return null;
                }
                try {
                    String filePath2 = LIZ.getFilePath();
                    if (filePath2 != null) {
                        Typeface LJJLIIIJLJLI2 = C16880lQ.LJJLIIIJLJLI(new File(filePath2));
                        if (LJJLIIIJLJLI2 != null) {
                            C40013Fn7.LIZJ.put(str, LJJLIIIJLJLI2);
                            C39048FUe c39048FUe3 = C39048FUe.LIZIZ;
                            StringBuilder LIZ3 = X1D.LIZ();
                            LIZ3.append("cache font for ");
                            LIZ3.append(str);
                            c39048FUe3.LIZ(X1D.LIZIZ(LIZ3), EnumC39866Fkk.I, "Lynx");
                        }
                    } else {
                        o.LJIIZILJ();
                        throw null;
                    }
                } catch (Exception e2) {
                    C39048FUe c39048FUe4 = C39048FUe.LIZIZ;
                    StringBuilder LIZIZ3 = C25620zW.LIZIZ("get font:{ ", str, " } error, msg = {");
                    LIZIZ3.append(e2.getMessage());
                    LIZIZ3.append('}');
                    c39048FUe4.LIZ(X1D.LIZIZ(LIZIZ3), EnumC39866Fkk.I, "Lynx");
                }
            }
        }
        Typeface typeface2 = C40013Fn7.LIZJ.get(str);
        if (typeface2 != null) {
            return typeface2;
        }
        if (!TextUtils.isEmpty(str) && enumC40050Fni != EnumC40050Fni.LOCAL) {
            int LJJLIIIJL = s.LJJLIIIJL(str, "base64,", 0, false, 6);
            if (ujb.o.LJJJLIIL(str, "data:", false) && LJJLIIIJL != -1) {
                String substring = str.substring(LJJLIIIJL + 7);
                o.LJFF(substring, "(this as java.lang.String).substring(startIndex)");
                try {
                    typeface = C78983UzD.LJIIL(vnu, Base64.decode(substring, 0));
                } catch (Exception e3) {
                    String message = e3.getMessage();
                    VNV vnv = vnu.LJLLL;
                    if (vnv != null) {
                        vnv.LJIJ(new LynxError(message, 301));
                    }
                }
            }
        }
        return typeface;
    }
}

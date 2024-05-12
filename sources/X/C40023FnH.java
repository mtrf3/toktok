package X;

import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.ies.bullet.service.base.IResourceLoaderService;
import com.lynx.tasm.LynxError;
import com.lynx.tasm.base.LLog;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.FnH, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40023FnH extends AbstractC40015Fn9 {
    @Override // X.AbstractC40015Fn9
    public final Typeface LIZ(VNU vnu, EnumC40050Fni enumC40050Fni, String str) {
        boolean z;
        Object cache;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        Typeface typeface = null;
        if (z) {
            return null;
        }
        InterfaceC60323Nlv interfaceC60323Nlv = C40020FnE.LIZLLL;
        if (interfaceC60323Nlv != null) {
            InterfaceC40025FnJ interfaceC40025FnJ = (InterfaceC40025FnJ) interfaceC60323Nlv.getService(InterfaceC40025FnJ.class);
            if (interfaceC40025FnJ != null && (cache = interfaceC40025FnJ.getCache()) != null && (cache instanceof Typeface)) {
                LLog.LIZLLL(2, "LynxKit", "get typeface from preload service");
                return (Typeface) cache;
            }
            InterfaceC60323Nlv interfaceC60323Nlv2 = C40020FnE.LIZLLL;
            if (interfaceC60323Nlv2 != null) {
                IResourceLoaderService iResourceLoaderService = (IResourceLoaderService) interfaceC60323Nlv2.getService(IResourceLoaderService.class);
                if (iResourceLoaderService != null) {
                    O1L o1l = new O1L(0);
                    InterfaceC60323Nlv interfaceC60323Nlv3 = C40020FnE.LIZLLL;
                    if (interfaceC60323Nlv3 != null) {
                        o1l.LJIIJ = interfaceC60323Nlv3;
                        o1l.LJIIJJI = "sub_source";
                        iResourceLoaderService.loadAsync(str, o1l, new C40022FnG(str), C40024FnI.LJLIL);
                    } else {
                        o.LJIJI("token");
                        throw null;
                    }
                }
                Typeface typeface2 = C40020FnE.LIZJ.get(str);
                if (typeface2 != null) {
                    return typeface2;
                }
                if (!TextUtils.isEmpty(str) && enumC40050Fni != EnumC40050Fni.LOCAL) {
                    if (str != null) {
                        int LJJLIIIJL = s.LJJLIIIJL(str, "base64,", 0, false, 6);
                        if (ujb.o.LJJJLIIL(str, "data:", false) && LJJLIIIJL != -1) {
                            String substring = str.substring(LJJLIIIJL + 7);
                            o.LJFF(substring, "(this as java.lang.String).substring(startIndex)");
                            try {
                                typeface = C78983UzD.LJIIL(vnu, Base64.decode(substring, 0));
                            } catch (Exception e) {
                                String message = e.getMessage();
                                VNV vnv = vnu.LJLLL;
                                if (vnv != null) {
                                    vnv.LJIJ(new LynxError(message, 301));
                                }
                            }
                        }
                    } else {
                        o.LJIIZILJ();
                        throw null;
                    }
                }
                return typeface;
            }
            o.LJIJI("token");
            throw null;
        }
        o.LJIJI("token");
        throw null;
    }
}

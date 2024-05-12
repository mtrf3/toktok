package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.Window;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.google.android.play.core.appupdate.u;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* renamed from: X.WiV, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC83043WiV extends AbstractC37780EsC {
    public final EnumC38005Evp LIZIZ = EnumC38005Evp.PRIVATE;

    @Override // X.InterfaceC37774Es6
    public final String getName() {
        return "x.configureStatusBar";
    }

    @Override // X.AbstractC37780EsC, X.InterfaceC37774Es6
    public final Class<C83046WiY> LIZ() {
        return C83046WiY.class;
    }

    @Override // X.AbstractC37780EsC, X.InterfaceC37774Es6
    public final Class<C61335O5j> LIZLLL() {
        return C61335O5j.class;
    }

    @Override // X.AbstractC37780EsC, X.InterfaceC37774Es6
    public final EnumC38005Evp getAccess() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC37774Es6
    public final void LIZJ(InterfaceC78280Uns params, InterfaceC31943CgF interfaceC31943CgF, EnumC37847EtH type) {
        Boolean bool;
        C83046WiY c83046WiY;
        EnumC83045WiX enumC83045WiX;
        Window window;
        boolean z;
        Window window2;
        o.LJIIJ(params, "params");
        o.LJIIJ(type, "type");
        String LJJIJIL = u.LJJIJIL(params, "style", "");
        AbstractC37843EtD.Companion.getClass();
        if (params.get("visible").getType() == EnumC78522Urm.Boolean) {
            bool = Boolean.valueOf(params.getBoolean("visible"));
        } else {
            bool = null;
        }
        String LJJIJIL2 = u.LJJIJIL(params, "backgroundColor", "");
        if (bool == null) {
            c83046WiY = null;
        } else {
            c83046WiY = new C83046WiY();
            if (LJJIJIL.length() > 0) {
                c83046WiY.LIZ = LJJIJIL;
            }
            if (LJJIJIL2.length() > 0) {
                c83046WiY.LIZIZ = LJJIJIL2;
            }
            c83046WiY.LIZJ = bool;
        }
        if (c83046WiY == null) {
            AbstractC37780EsC.LJFF(this, interfaceC31943CgF, -3, "Please check your input!", 8);
            return;
        }
        C83044WiW c83044WiW = new C83044WiW(this, interfaceC31943CgF);
        Context context = (Context) LJII(Context.class);
        if (context != null) {
            Activity LIZ = HT4.LIZ(context);
            String str = c83046WiY.LIZ;
            Boolean bool2 = c83046WiY.LIZJ;
            try {
                EnumC83045WiX.Companion.getClass();
                if (str != null) {
                    try {
                        Locale locale = Locale.US;
                        o.LJFF(locale, "Locale.US");
                        String upperCase = str.toUpperCase(locale);
                        o.LJFF(upperCase, "(this as java.lang.String).toUpperCase(locale)");
                        enumC83045WiX = EnumC83045WiX.valueOf(upperCase);
                    } catch (Throwable unused) {
                        enumC83045WiX = EnumC83045WiX.UNKNOWN;
                    }
                } else {
                    enumC83045WiX = EnumC83045WiX.UNKNOWN;
                }
            } catch (Exception unused2) {
            }
            if (enumC83045WiX == EnumC83045WiX.UNKNOWN) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("StatusBar style can only be dark or light,  style: ");
                LIZ2.append(enumC83045WiX);
                String msg = X1D.LIZIZ(LIZ2);
                o.LJIIJ(msg, "msg");
                AbstractC37780EsC.LJFF(c83044WiW.LIZ, c83044WiW.LIZIZ, -3, msg, 8);
                return;
            }
            if (LIZ == null) {
                window = null;
            } else {
                window = LIZ.getWindow();
            }
            if (enumC83045WiX == EnumC83045WiX.DARK) {
                z = true;
            } else {
                z = false;
            }
            if (LIZ != null && window != null) {
                try {
                    if (Build.VERSION.SDK_INT >= 23) {
                        View decorView = window.getDecorView();
                        o.LJFF(decorView, "window.decorView");
                        int systemUiVisibility = decorView.getSystemUiVisibility();
                        if (!z) {
                            decorView.setSystemUiVisibility(systemUiVisibility & (-8193));
                        } else {
                            decorView.setSystemUiVisibility(systemUiVisibility | FileUtils.BUFFER_SIZE);
                        }
                        window.clearFlags(67108864);
                        window.addFlags(LiveLayoutPreloadThreadPriority.DEFAULT);
                    }
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
            if (bool2 != null) {
                if (bool2.booleanValue()) {
                    if (LIZ != null && (window2 = LIZ.getWindow()) != null) {
                        window2.clearFlags(1024);
                    }
                } else {
                    CZ3.LIZ(LIZ);
                }
                String str2 = c83046WiY.LIZIZ;
                if (LIZ != null && str2 != null && str2.length() != 0 && str2.length() == 9) {
                    String substring = str2.substring(7, 9);
                    o.LJFF(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    String upperCase2 = substring.toUpperCase();
                    o.LJFF(upperCase2, "(this as java.lang.String).toUpperCase()");
                    StringBuilder sb = new StringBuilder();
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append(String.valueOf('#'));
                    LIZ3.append(upperCase2);
                    sb.append(X1D.LIZIZ(LIZ3));
                    String charSequence = str2.subSequence(1, 7).toString();
                    if (charSequence != null) {
                        String upperCase3 = charSequence.toUpperCase();
                        o.LJFF(upperCase3, "(this as java.lang.String).toUpperCase()");
                        sb.append(upperCase3);
                        CZ3.LIZIZ(LIZ, Color.parseColor(sb.toString()));
                    } else {
                        throw new C37692Eqm("null cannot be cast to non-null type java.lang.String");
                    }
                }
                c83044WiW.LIZ(new C61335O5j(), "");
                return;
            }
            o.LJIIZILJ();
            throw null;
        }
        AbstractC37780EsC.LJFF(this, interfaceC31943CgF, 0, "Context not provided in host", 8);
    }
}

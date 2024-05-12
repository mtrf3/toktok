package X;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.6oL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C171576oL {
    public volatile boolean LIZ;
    public C5KU LIZIZ;

    public static String LIZ(String str, String str2) {
        boolean z;
        String substring;
        boolean z2 = false;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return str2;
        }
        if (str != null) {
            String separator = File.separator;
            o.LJIIIIZZ(separator, "separator");
            z2 = s.LJJJLZIJ(str, separator, false);
        }
        if (z2) {
            if (str == null) {
                substring = null;
            } else {
                try {
                    String separator2 = File.separator;
                    o.LJIIIIZZ(separator2, "separator");
                    substring = str.substring(s.LJJLIIJ(str, separator2, 6) + 1);
                    o.LJIIIIZZ(substring, "(this as java.lang.String).substring(startIndex)");
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
            String LJIILLIIL = o.LJIILLIIL(substring, ".");
            if (LJIILLIIL.equals(".jpeg")) {
                return ".jpg";
            }
            return LJIILLIIL;
        }
        return str2;
    }

    public final void LIZIZ(final int i, final Context context, final List list, final InterfaceC65784Pro interfaceC65784Pro, final InterfaceC88472Yns interfaceC88472Yns, final InterfaceC88472Yns interfaceC88472Yns2) {
        String str;
        String LJIILLIIL;
        String str2;
        final C171726oa c171726oa = (C171726oa) ListProtector.get(list, i);
        String str3 = c171726oa.LIZ;
        String separator = File.separator;
        o.LJIIIIZZ(separator, "separator");
        if (s.LJJLIIJ(str3, separator, 6) > 0) {
            C152275yJ.LIZ.getClass();
            if (C152275yJ.LJI(str3)) {
                android.net.Uri parse = UriProtector.parse(str3);
                if (s.LJJJLZIJ(str3, "image", false)) {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    android.net.Uri parse2 = UriProtector.parse(str3);
                    o.LJIIIIZZ(parse2, "parse(inputPath)");
                    C152275yJ.LIZLLL(context, parse2, new AqS168S0100000_2(options, 655));
                    LJIILLIIL = o.LJIILLIIL(LIZ(options.outMimeType, ".png"), C76857UEj.LIZLLL(context, parse));
                } else {
                    MediaMetadataRetriever LJ = C152275yJ.LJ(context, str3);
                    try {
                        try {
                            str2 = LJ.extractMetadata(12);
                        } finally {
                            try {
                                LJ.release();
                            } catch (Exception e) {
                                C16880lQ.LLLLIIL(e);
                            }
                        }
                    } catch (Exception e2) {
                        C16880lQ.LLLLIIL(e2);
                        str2 = null;
                    }
                    LJIILLIIL = o.LJIILLIIL(LIZ(str2, ".mp4"), C76857UEj.LIZLLL(context, parse));
                }
            } else {
                String LJ2 = C76857UEj.LJ(str3);
                String substring = str3.substring(s.LJJLIIIJLLLLLLLZ(str3, '.', 0, 6));
                o.LJIIIIZZ(substring, "(this as java.lang.String).substring(startIndex)");
                LJIILLIIL = o.LJIILLIIL(substring, LJ2);
            }
            str = C152285yK.LIZ + ((Object) File.separator) + LJIILLIIL;
        } else {
            str = "";
        }
        if (this.LIZ) {
            return;
        }
        if (C171596oN.LIZ.LIZJ(str)) {
            c171726oa.LIZJ = true;
            c171726oa.LIZ = str;
            if (interfaceC65784Pro != null) {
                interfaceC65784Pro.invoke();
            }
            int i2 = 1 + i;
            if (i2 < list.size()) {
                LIZIZ(i2, context, list, interfaceC65784Pro, interfaceC88472Yns, interfaceC88472Yns2);
                return;
            } else {
                interfaceC88472Yns2.invoke(Boolean.TRUE);
                return;
            }
        }
        C145765no.LIZIZ(1920, 1920, context, new C5KT() { // from class: X.6oM
            @Override // X.C5KT
            public final void LJI(C5KU c5ku) {
                C171576oL c171576oL = C171576oL.this;
                c171576oL.LIZIZ = c5ku;
                if (c171576oL.LIZ) {
                    c5ku.LIZ();
                }
            }

            @Override // X.C5KT
            public final void onProgress(float f) {
                InterfaceC88472Yns<Float, C76800UCe> interfaceC88472Yns3 = interfaceC88472Yns;
                if (interfaceC88472Yns3 == null) {
                    return;
                }
                interfaceC88472Yns3.invoke(Float.valueOf(f));
            }

            @Override // X.C5KT
            public final void LJ(String inputPath, String outputPath) {
                o.LJIIIZ(inputPath, "inputPath");
                o.LJIIIZ(outputPath, "outputPath");
                C152275yJ c152275yJ = C152275yJ.LIZ;
                File file = new File(outputPath);
                c152275yJ.getClass();
                C152275yJ.LJIIIIZZ(file);
            }

            @Override // X.C5KT
            public final void LJFF(String inputPath, String outputPath) {
                o.LJIIIZ(inputPath, "inputPath");
                o.LJIIIZ(outputPath, "outputPath");
                C171726oa c171726oa2 = c171726oa;
                c171726oa2.getClass();
                c171726oa2.LIZJ = true;
                c171726oa2.LIZ = outputPath;
                C171596oN.LIZ.LIZ(outputPath);
                InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2 = interfaceC65784Pro;
                if (interfaceC65784Pro2 != null) {
                    interfaceC65784Pro2.invoke();
                }
                int i3 = i + 1;
                if (i3 < list.size()) {
                    C171576oL.this.LIZIZ(i3, context, list, interfaceC65784Pro, interfaceC88472Yns, interfaceC88472Yns2);
                    return;
                }
                interfaceC88472Yns2.invoke(Boolean.TRUE);
            }

            @Override // X.C5KT
            public final void LIZ(String str4, String str5, String str6) {
                HH1.LIZ(str4, "inputPath", str5, "outputPath", str6, "errorInfo");
                C152275yJ c152275yJ = C152275yJ.LIZ;
                File file = new File(str5);
                c152275yJ.getClass();
                C152275yJ.LJIIIIZZ(file);
                interfaceC88472Yns2.invoke(Boolean.FALSE);
            }
        }, str3, str, C152285yK.LIZ, null, null);
    }
}

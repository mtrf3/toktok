package X;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import com.ss.android.ugc.aweme.editSticker.text.font.TextFontStyleData;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextFontModel;
import java.util.List;
import kotlin.jvm.internal.AqS149S0200000_2;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5zI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C152885zI implements C6O5 {
    public final C62822Ol8 LIZ;
    public InterfaceC139605ds LIZIZ;

    public final C1554968j LJII() {
        Object value = this.LIZ.getValue();
        o.LJIIIIZZ(value, "<get-fontSelectLayout>(...)");
        return (C1554968j) value;
    }

    @Override // X.C6O5
    public final View LJ() {
        LJII().LIZIZ(C68M.LJIIJ().LJIIIZ());
        C68M.LJIIJ().LJ = new InterfaceC1549866k() { // from class: X.5zK
            @Override // X.InterfaceC1549866k
            public final void accept(Object obj) {
                C2VQ.LIZIZ(new AqS149S0200000_2(C152885zI.this, (C152885zI) obj, (List<TextFontStyleData>) 38), 0L);
            }
        };
        return LJII();
    }

    @Override // X.C6O5
    public final void LJFF() {
        C68M.LJIIJ().LJIL(2);
        TextFontStyleData LJFF = C68M.LJIIJ().LJFF(2);
        if (LJFF != null) {
            LJIIIIZZ(LJFF, false);
        }
        LJII().LIZJ();
    }

    @Override // X.C6O5
    public final void LJI() {
        LJII().LIZIZ(C68M.LJIIJ().LJIIIZ());
    }

    public C152885zI(Context context) {
        o.LJIIIZ(context, "context");
        this.LIZ = C221108m2.LIZIZ(new AqS152S0100000_2(context, 483));
    }

    @Override // X.C6O5
    public final Typeface LIZ(String fileName) {
        o.LJIIIZ(fileName, "fileName");
        Typeface typeface = C68M.LJIIJ().LJIIL(fileName);
        if (typeface == null) {
            typeface = C68M.LJIIJ().LJ(2);
        }
        o.LJIIIIZZ(typeface, "typeface");
        return typeface;
    }

    @Override // X.C6O5
    public final void LIZIZ(String fileName) {
        o.LJIIIZ(fileName, "fileName");
        C68M.LJIIJ().LJIJJLI(2, fileName);
        LJII().LIZJ();
    }

    @Override // X.C6O5
    public final void LIZJ(C139595dr c139595dr) {
        this.LIZIZ = c139595dr;
        LJII().setClickFontStyleListener(new InterfaceC1555668q() { // from class: X.5zJ
            @Override // X.InterfaceC1555668q
            public final void LIZ(TextFontStyleData textFontStyleData) {
                if (textFontStyleData == null) {
                    return;
                }
                C68M.LJIIJ().LJIJJLI(2, textFontStyleData.fileName);
                C152885zI.this.LJIIIIZZ(textFontStyleData, true);
            }
        });
    }

    @Override // X.C6O5
    public final void LIZLLL(String fileName) {
        o.LJIIIZ(fileName, "fileName");
        C68M.LJIIJ().LJIJJLI(2, fileName);
        TextFontStyleData LJFF = C68M.LJIIJ().LJFF(2);
        if (LJFF != null) {
            LJIIIIZZ(LJFF, false);
        }
        LJII().LIZJ();
    }

    public final void LJIIIIZZ(TextFontStyleData textFontStyleData, boolean z) {
        boolean z2;
        String effectId = textFontStyleData.LIZJ.getEffectId();
        String resource_id = textFontStyleData.LIZJ.getResource_id();
        String str = textFontStyleData.fontName;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String str3 = textFontStyleData.title;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = textFontStyleData.fileName;
        if (str4 == null) {
            str4 = "";
        }
        String str5 = textFontStyleData.LIZ;
        if (str5 != null) {
            str2 = str5;
        }
        boolean z3 = true;
        if (textFontStyleData.enableBgColor == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (textFontStyleData.enableMaskBlurLightColor != 1) {
            z3 = false;
        }
        TextFontModel textFontModel = new TextFontModel(effectId, resource_id, str, str3, 28, str4, str2, z2, z3);
        InterfaceC139605ds interfaceC139605ds = this.LIZIZ;
        if (interfaceC139605ds != null) {
            interfaceC139605ds.LIZ(textFontModel, z);
        }
    }
}

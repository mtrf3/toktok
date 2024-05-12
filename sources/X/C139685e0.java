package X;

import com.ss.android.ugc.aweme.editSticker.text.font.TextFontStyleData;

/* renamed from: X.5e0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C139685e0 {
    public static /* synthetic */ void LIZIZ(InterfaceC139695e1 interfaceC139695e1, TextFontStyleData textFontStyleData, int i, String str, String str2, boolean z, int i2) {
        boolean z2 = z;
        int i3 = i;
        String str3 = str;
        if ((i2 & 2) != 0) {
            i3 = 0;
        }
        String str4 = null;
        if ((i2 & 4) != 0) {
            str3 = null;
        }
        if ((i2 & 8) == 0) {
            str4 = str2;
        }
        if ((i2 & 16) != 0) {
            z2 = false;
        }
        interfaceC139695e1.LIZJ(textFontStyleData, i3, str3, str4, z2);
    }
}

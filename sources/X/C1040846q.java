package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;

/* renamed from: X.46q, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1040846q {
    public static /* synthetic */ void LIZIZ(InterfaceC1040946r interfaceC1040946r, String str, UrlModel urlModel, int i, int i2) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        interfaceC1040946r.LIZLLL(i, 0, urlModel, str);
    }

    public static /* synthetic */ void LIZ(InterfaceC1040946r interfaceC1040946r, String str, String str2, UrlModel urlModel, int i, int i2, int i3) {
        int i4 = i2;
        String str3 = str2;
        int i5 = i;
        UrlModel urlModel2 = null;
        if ((i3 & 2) != 0) {
            str3 = null;
        }
        if ((i3 & 4) == 0) {
            urlModel2 = urlModel;
        }
        if ((i3 & 8) != 0) {
            i5 = 0;
        }
        if ((i3 & 16) != 0) {
            i4 = 0;
        }
        interfaceC1040946r.LIZJ(str, str3, urlModel2, i5, i4);
    }
}

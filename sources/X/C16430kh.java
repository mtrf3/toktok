package X;

import android.view.ContentInfo;
import android.view.OnReceiveContentListener;
import android.view.View;
import java.util.Objects;

/* renamed from: X.0kh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16430kh {
    public static String[] LIZ(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static C16190kJ LIZIZ(View view, C16190kJ c16190kJ) {
        ContentInfo LIZIZ = c16190kJ.LIZ.LIZIZ();
        Objects.requireNonNull(LIZIZ);
        ContentInfo performReceiveContent = view.performReceiveContent(LIZIZ);
        if (performReceiveContent == null) {
            return null;
        }
        if (performReceiveContent == LIZIZ) {
            return c16190kJ;
        }
        return new C16190kJ(new C33891Ur(performReceiveContent));
    }

    public static void LIZJ(View view, String[] strArr, final InterfaceC16730lB interfaceC16730lB) {
        if (interfaceC16730lB == null) {
            view.setOnReceiveContentListener(strArr, null);
        } else {
            view.setOnReceiveContentListener(strArr, new OnReceiveContentListener(interfaceC16730lB) { // from class: X.0ki
                public final InterfaceC16730lB LIZ;

                {
                    this.LIZ = interfaceC16730lB;
                }

                @Override // android.view.OnReceiveContentListener
                public final ContentInfo onReceiveContent(View view2, ContentInfo contentInfo) {
                    C16190kJ c16190kJ = new C16190kJ(new C33891Ur(contentInfo));
                    C16190kJ LIZ = this.LIZ.LIZ(view2, c16190kJ);
                    if (LIZ == null) {
                        return null;
                    }
                    if (LIZ == c16190kJ) {
                        return contentInfo;
                    }
                    ContentInfo LIZIZ = LIZ.LIZ.LIZIZ();
                    Objects.requireNonNull(LIZIZ);
                    return LIZIZ;
                }
            });
        }
    }
}

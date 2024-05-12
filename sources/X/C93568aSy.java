package X;

import com.bytedance.effectcreatormobile.ckeapi.api.text.TextAlign;
import com.bytedance.effectcreatormobile.ckeapi.api.text.TextStyle;

/* renamed from: X.aSy, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public /* synthetic */ class C93568aSy {
    public static final /* synthetic */ int[] LIZ;
    public static final /* synthetic */ int[] LIZIZ;

    static {
        int[] iArr = new int[TextStyle.values().length];
        try {
            iArr[TextStyle.TextColor.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TextStyle.TextBgColor.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TextStyle.TextAlphaBgColor.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[TextStyle.TextStrokeColor.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        LIZ = iArr;
        int[] iArr2 = new int[TextAlign.values().length];
        try {
            iArr2[TextAlign.Center.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[TextAlign.Left.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[TextAlign.Right.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        LIZIZ = iArr2;
    }
}

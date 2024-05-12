package X;

import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;

/* renamed from: X.4rZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C122614rZ extends AbstractC65781Prl implements InterfaceC88472Yns<NLESegment, CharSequence> {
    public static final C122614rZ LJLIL = new C122614rZ();

    public C122614rZ() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final CharSequence invoke(NLESegment nLESegment) {
        EnumC123874tb enumC123874tb;
        String str;
        NLEResourceNode LIZIZ;
        NLEResourceNode LIZIZ2;
        NLEResourceNode LIZIZ3;
        NLESegment nLESegment2 = nLESegment;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("resType = ");
        String str2 = null;
        if (nLESegment2 != null && (LIZIZ3 = nLESegment2.LIZIZ()) != null) {
            enumC123874tb = LIZIZ3.LJFF();
        } else {
            enumC123874tb = null;
        }
        LIZ.append(enumC123874tb);
        LIZ.append(", resFile = ");
        if (nLESegment2 != null && (LIZIZ2 = nLESegment2.LIZIZ()) != null) {
            str = LIZIZ2.LIZJ();
        } else {
            str = null;
        }
        LIZ.append(str);
        LIZ.append(", exists? ");
        if (nLESegment2 != null && (LIZIZ = nLESegment2.LIZIZ()) != null) {
            str2 = LIZIZ.LIZJ();
        }
        LIZ.append(C44687HgJ.LIZIZ(str2));
        LIZ.append('\n');
        return X1D.LIZIZ(LIZ);
    }
}

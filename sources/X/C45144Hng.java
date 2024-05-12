package X;

import com.bytedance.ies.nle.editor_jni.NLETemplateJNI;
import com.bytedance.ies.nle.editor_jni.SetString;

/* renamed from: X.Hng, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45144Hng extends AbstractC65781Prl implements InterfaceC65784Pro<SetString> {
    public static final C45144Hng LJLIL = new C45144Hng();

    public C45144Hng() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final SetString invoke() {
        SetString setString = new SetString();
        if (!((Boolean) C45151Hnn.LIZ.getValue()).booleanValue()) {
            NLETemplateJNI.SetString_add(setString.LJLIL, setString, "CMP");
        }
        return setString;
    }
}

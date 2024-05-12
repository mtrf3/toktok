package X;

import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import com.bytedance.ies.nle.editor_jni.VecUInt32;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.6rA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C173326rA extends AbstractC65781Prl implements InterfaceC65784Pro<String> {
    public static final C173326rA LJLIL = new C173326rA();

    public C173326rA() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final String invoke() {
        VecUInt32 supportFeatureBits = NLETemplateModel.getSupportFeatureBits();
        o.LJIIIIZZ(supportFeatureBits, "getSupportFeatureBits()");
        List LLJI = ORZ.LLJI(supportFeatureBits);
        ArrayList arrayList = new ArrayList(C32I.LJJL(LLJI, 10));
        Iterator it = LLJI.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(it.next()));
        }
        return GsonProtectorUtils.toJson(C60903NvH.LJIIJJI().LIZ(), arrayList);
    }
}

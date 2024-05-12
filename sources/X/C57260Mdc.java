package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Mdc, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57260Mdc extends AbstractC65781Prl implements InterfaceC88473Ynt<Object, String, String, C76800UCe> {
    public static final C57260Mdc LJLIL = new C57260Mdc();

    public C57260Mdc() {
        super(3);
    }

    @Override // X.InterfaceC88473Ynt
    public final C76800UCe invoke(Object obj, String str, String str2) {
        JHM appendParamIntoAwemeByEventName = (JHM) obj;
        String key = str;
        o.LJIIIZ(appendParamIntoAwemeByEventName, "$this$appendParamIntoAwemeByEventName");
        o.LJIIIZ(key, "key");
        appendParamIntoAwemeByEventName.LIZLLL(key, str2);
        return C76800UCe.LIZ;
    }
}

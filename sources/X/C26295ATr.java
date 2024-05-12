package X;

import com.bytedance.keva.Keva;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.ATr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26295ATr implements Keva.OnChangeListener {
    public static final C26295ATr LIZ = new C26295ATr();

    @Override // com.bytedance.keva.Keva.OnChangeListener
    public final void onChanged(Keva keva, String str) {
        HashSet hashSet;
        String[] strArr;
        if (o.LJ(str, "key_selected_do_not_translate_language_codes")) {
            String[] stringArray = C26296ATs.LIZIZ.getStringArray("key_selected_do_not_translate_language_codes", null);
            java.util.Set<InterfaceC88472Yns<String[], C76800UCe>> doNotTranCodesChangeListeners = C26296ATs.LIZ;
            o.LJIIIIZZ(doNotTranCodesChangeListeners, "doNotTranCodesChangeListeners");
            synchronized (doNotTranCodesChangeListeners) {
                hashSet = new HashSet(doNotTranCodesChangeListeners);
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) it.next();
                if (stringArray == null) {
                    strArr = new String[0];
                } else {
                    strArr = stringArray;
                }
                interfaceC88472Yns.invoke(strArr);
            }
        }
    }
}

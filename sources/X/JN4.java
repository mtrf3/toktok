package X;

import X.JN4;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public class JN4<T extends JN4<T>> extends JHM<T> {
    public final HashMap<String, String> LJIILJJIL;

    @Override // X.JHM
    public final void LJII() {
    }

    public void LJIILL() {
    }

    @Override // X.JHM
    public final void LJIIL() {
        super.LJIIL();
        ((HashMap) this.LIZIZ).putAll(this.LJIILJJIL);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JN4(String eventName) {
        super(eventName);
        o.LJIIIZ(eventName, "eventName");
        this.LJIILJJIL = new HashMap<>();
    }

    public final void LJIILLIIL(java.util.Map params) {
        o.LJIIIZ(params, "params");
        this.LJIILJJIL.putAll(params);
    }

    public final void LJIJI(String str) {
        this.LIZLLL = str;
        LJIILL();
        LJIIZILJ("enter_from", str);
    }

    public final void LJIJJ(String str) {
        LJIIZILJ("enter_method", str);
    }

    public final void LJIJJLI(Boolean bool) {
        String str;
        if (o.LJ(bool, Boolean.TRUE)) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        LJIIZILJ("is_fullscreen", str);
    }

    public final void LJIIZILJ(String str, String str2) {
        if (str2 == null || str2.length() == 0) {
            return;
        }
        this.LJIILJJIL.put(str, str2);
    }

    public final void LJIJ(String str, String str2) {
        HashMap<String, String> hashMap = this.LJIILJJIL;
        if (str2 == null) {
            str2 = "";
        }
        hashMap.put(str, str2);
    }
}

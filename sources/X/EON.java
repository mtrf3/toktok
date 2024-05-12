package X;

import com.ss.android.ugc.aweme.friendstab.tab.StateOwner;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EON<T> implements InterfaceC64592gB {
    public static final EON<T> LJLIL = new EON<>();

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        Boolean isBackground = (Boolean) obj;
        o.LJIIIIZZ(isBackground, "isBackground");
        if (isBackground.booleanValue()) {
            StateOwner.LJLIL.getClass();
            StateOwner.LJLJLLL.postValue(Boolean.TRUE);
        } else {
            if (StateOwner.LJLJI) {
                StateOwner.LJLJI = false;
                return;
            }
            StateOwner.LJLIL.getClass();
            StateOwner.LJLJLJ.postValue(Boolean.TRUE);
            Iterator<InterfaceC88472Yns<Boolean, C76800UCe>> it = StateOwner.LJLL.iterator();
            while (it.hasNext()) {
                it.next().invoke(Boolean.TRUE);
            }
        }
    }
}

package X;

import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public class JU8 extends JU9 {
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(JUB.LJLIL);

    public final ArrayList<InterfaceC49148JQq> LIZLLL() {
        return (ArrayList) this.LJLILLLLZI.getValue();
    }

    public void LIZJ(InterfaceC49148JQq playData) {
        o.LJIIIZ(playData, "playData");
        LIZLLL().clear();
        LIZLLL().add(playData);
        LIZIZ(new JU6(LIZLLL(), false));
    }
}

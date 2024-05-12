package X;

import Y.ARunnableS42S0100000_6;
import com.ss.android.ugc.aweme.friendstab.model.NewContentResponse;
import com.ss.android.ugc.aweme.friendstab.model.UserNewContent;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.o;

/* renamed from: X.EIt, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36203EIt {
    public static String LIZ;
    public static NewContentResponse LIZJ;
    public static boolean LJ;
    public static ArrayList<UserNewContent> LJI;
    public static EnumC36206EIw LIZIZ = EnumC36206EIw.UNKNOWN;
    public static final C73318Sq2 LIZLLL = new C73318Sq2();
    public static final C62822Ol8 LJFF = C221108m2.LIZIZ(C36204EIu.LJLIL);
    public static final java.util.Set<String> LJII = new LinkedHashSet();
    public static final java.util.Set<String> LJIIIIZZ = new LinkedHashSet();

    public static void LIZ(EnumC36206EIw source, InterfaceC65784Pro interfaceC65784Pro) {
        o.LJIIIZ(source, "source");
        if (LJ) {
            C36205EIv.LIZ("is_requesting", source);
            return;
        }
        OSZ<Boolean, String> D20 = C36207EIx.LIZ().D20();
        boolean booleanValue = D20.getFirst().booleanValue();
        String second = D20.getSecond();
        if (booleanValue) {
            C36205EIv.LIZ(second, source);
            return;
        }
        LJ = true;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
        C38995FSd.LIZLLL().execute(new ARunnableS42S0100000_6(source, 147));
    }
}

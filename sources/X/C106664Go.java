package X;

import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.4Go, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C106664Go extends AbstractC65781Prl implements InterfaceC65784Pro<List<? extends String>> {
    public static final C106664Go LJLIL = new C106664Go();

    public C106664Go() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final List<? extends String> invoke() {
        String[] stringArray = EF7.LIZIZ().getResources().getStringArray(R.array.a_);
        o.LJIIIIZZ(stringArray, "AppContextManager.getApp…ay.mini_emoji_panel_list)");
        return ORY.LJJZZIII(stringArray);
    }
}

package X;

import com.ss.android.ugc.aweme.music.assem.list.MusicListAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.9IC, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9IC extends AbstractC65781Prl implements InterfaceC88472Yns<C8V4, C76800UCe> {
    public static final C9IC LJLIL = new C9IC();

    public C9IC() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C8V4 c8v4) {
        C8V4 uiContentAssem = c8v4;
        o.LJIIIZ(uiContentAssem, "$this$uiContentAssem");
        uiContentAssem.LIZ = C65352Pkq.LIZ(MusicListAssem.class);
        uiContentAssem.LJIIIIZZ = new MusicListAssem();
        uiContentAssem.LJI = R.id.gts;
        return C76800UCe.LIZ;
    }
}

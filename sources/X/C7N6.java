package X;

import com.ss.android.ugc.aweme.story.archive.StoryArchListAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.7N6, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7N6 extends AbstractC65781Prl implements InterfaceC88472Yns<C8V4, C76800UCe> {
    public static final C7N6 LJLIL = new C7N6();

    public C7N6() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C8V4 c8v4) {
        C8V4 uiContentAssem = c8v4;
        o.LJIIIZ(uiContentAssem, "$this$uiContentAssem");
        uiContentAssem.LIZ = C65352Pkq.LIZ(StoryArchListAssem.class);
        uiContentAssem.LJIIIIZZ = new StoryArchListAssem();
        uiContentAssem.LJI = R.id.a95;
        return C76800UCe.LIZ;
    }
}

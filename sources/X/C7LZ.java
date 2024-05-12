package X;

import com.ss.android.ugc.feed.platform.panel.downloadbar.DownloadBarComponent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.7LZ, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7LZ extends AbstractC65781Prl implements InterfaceC88472Yns<C8V4, C76800UCe> {
    public static final C7LZ LJLIL = new C7LZ();

    public C7LZ() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C8V4 c8v4) {
        C8V4 uiContentAssem = c8v4;
        o.LJIIIZ(uiContentAssem, "$this$uiContentAssem");
        uiContentAssem.LJI = R.id.itq;
        uiContentAssem.LIZ = C65352Pkq.LIZ(DownloadBarComponent.class);
        uiContentAssem.LJIIIIZZ = new DownloadBarComponent();
        return C76800UCe.LIZ;
    }
}

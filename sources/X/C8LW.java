package X;

import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicTitleAssem;
import com.ss.android.ugc.aweme.feed.assem.music.refactor.VideoMusicTitleRefactorAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.8LW, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8LW extends AbstractC65781Prl implements InterfaceC88472Yns<C8NH, C76800UCe> {
    public static final C8LW LJLIL = new C8LW();

    public C8LW() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C8NH c8nh) {
        Class cls;
        C8NH reusedUiSlotAssem = c8nh;
        o.LJIIIZ(reusedUiSlotAssem, "$this$reusedUiSlotAssem");
        reusedUiSlotAssem.LIZLLL = R.id.df7;
        if (((Number) C8LX.LIZ.getValue()).intValue() == 1) {
            cls = VideoMusicTitleRefactorAssem.class;
        } else {
            cls = VideoMusicTitleAssem.class;
        }
        reusedUiSlotAssem.LIZ = C65352Pkq.LIZ(cls);
        return C76800UCe.LIZ;
    }
}

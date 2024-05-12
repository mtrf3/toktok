package X;

import com.ss.android.ugc.aweme.feed.assem.music.addtodsp.AddToMusicDspButtonAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.8UQ, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8UQ extends AbstractC65781Prl implements InterfaceC88471Ynr<AddToMusicDspButtonAssem, C8UI, C76800UCe> {
    public static final C8UQ LJLIL = new C8UQ();

    public C8UQ() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(AddToMusicDspButtonAssem addToMusicDspButtonAssem, C8UI c8ui) {
        AddToMusicDspButtonAssem selectSubscribe = addToMusicDspButtonAssem;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c8ui != null) {
            selectSubscribe.getContainerView().setVisibility(8);
        }
        return C76800UCe.LIZ;
    }
}

package X;

import com.ss.android.ugc.aweme.feed.assem.music.addtodsp.AddToMusicDspButtonAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.8US, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8US extends AbstractC65781Prl implements InterfaceC88471Ynr<AddToMusicDspButtonAssem, C8UR, C76800UCe> {
    public static final C8US LJLIL = new C8US();

    public C8US() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(AddToMusicDspButtonAssem addToMusicDspButtonAssem, C8UR c8ur) {
        AddToMusicDspButtonAssem selectSubscribe = addToMusicDspButtonAssem;
        C8UR c8ur2 = c8ur;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c8ur2 != null && c8ur2.LJLIL) {
            selectSubscribe.getContainerView().setVisibility(8);
        }
        return C76800UCe.LIZ;
    }
}

package X;

import com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.7wX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C202137wX extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoDiggAssem, C43I<? extends Integer>, C76800UCe> {
    public static final C202137wX LJLIL = new C202137wX();

    public C202137wX() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoDiggAssem videoDiggAssem, C43I<? extends Integer> c43i) {
        VideoDiggAssem selectSubscribeOnAsync = videoDiggAssem;
        o.LJIIIZ(selectSubscribeOnAsync, "$this$selectSubscribeOnAsync");
        if (c43i != null) {
            selectSubscribeOnAsync.LLIIJI = true;
        }
        return C76800UCe.LIZ;
    }
}

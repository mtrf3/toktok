package X;

import com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggAssem;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.7tp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C200457tp extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoDiggAssem, Double, C76800UCe> {
    public static final C200457tp LJLIL = new C200457tp();

    public C200457tp() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoDiggAssem videoDiggAssem, Double d) {
        VideoDiggAssem selectSubscribe = videoDiggAssem;
        Double d2 = d;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        try {
            selectSubscribe.r4().wv0(d2, selectSubscribe.a1(), new AqS153S0100000_3(selectSubscribe, 7));
        } catch (IllegalArgumentException unused) {
        }
        return C76800UCe.LIZ;
    }
}

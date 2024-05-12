package X;

import com.ss.android.ugc.aweme.feed.assem.desc.VideoDescAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.83p, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2052183p extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoDescAssem, AnonymousClass860, C76800UCe> {
    public static final C2052183p LJLIL = new C2052183p();

    public C2052183p() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoDescAssem videoDescAssem, AnonymousClass860 anonymousClass860) {
        VideoDescAssem selectSubscribe = videoDescAssem;
        AnonymousClass860 anonymousClass8602 = anonymousClass860;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        selectSubscribe.r4().LLIIIILZ = anonymousClass8602;
        if (anonymousClass8602 != null) {
            C2054084i c2054084i = selectSubscribe.LLIL;
            if (c2054084i != null) {
                c2054084i.LJI(anonymousClass8602);
            } else {
                o.LJIJI("videoDescDelegate");
                throw null;
            }
        }
        return C76800UCe.LIZ;
    }
}

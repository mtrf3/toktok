package X;

import Y.ARunnableS39S0100000_3;
import com.ss.android.ugc.aweme.feed.assem.sharer.VideoExposeSharerInformationAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.8mA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C221188mA extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoExposeSharerInformationAssem, C43I<? extends String>, C76800UCe> {
    public static final C221188mA LJLIL = new C221188mA();

    public C221188mA() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoExposeSharerInformationAssem videoExposeSharerInformationAssem, C43I<? extends String> c43i) {
        VideoExposeSharerInformationAssem selectSubscribe = videoExposeSharerInformationAssem;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (!((C221298mL) selectSubscribe.q4().getState()).LJLJLLL) {
            selectSubscribe.Y3().post(new ARunnableS39S0100000_3(selectSubscribe, 74));
        }
        return C76800UCe.LIZ;
    }
}

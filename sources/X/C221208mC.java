package X;

import com.ss.android.ugc.aweme.feed.assem.sharer.VideoExposeSharerInformationAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.8mC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C221208mC extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoExposeSharerInformationAssem, Integer, C76800UCe> {
    public static final C221208mC LJLIL = new C221208mC();

    public C221208mC() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoExposeSharerInformationAssem videoExposeSharerInformationAssem, Integer num) {
        VideoExposeSharerInformationAssem selectSubscribe = videoExposeSharerInformationAssem;
        int intValue = num.intValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VideoExposeSharerState::followBtnColor = ");
        LIZ.append(intValue);
        C221018lt.LJFF("@LinkRelation_Video_Assem", X1D.LIZIZ(LIZ));
        ((SY4) selectSubscribe.Y3().findViewById(R.id.m71)).setButtonVariant(intValue);
        return C76800UCe.LIZ;
    }
}

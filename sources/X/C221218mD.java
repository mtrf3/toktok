package X;

import com.ss.android.ugc.aweme.feed.assem.sharer.VideoExposeSharerInformationAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.8mD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C221218mD extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoExposeSharerInformationAssem, Integer, C76800UCe> {
    public static final C221218mD LJLIL = new C221218mD();

    public C221218mD() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoExposeSharerInformationAssem selectSubscribe, Integer num) {
        int intValue = num.intValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VideoExposeSharerState::followTextColor = ");
        LIZ.append(intValue);
        C221018lt.LJFF("@LinkRelation_Video_Assem", X1D.LIZIZ(LIZ));
        return C76800UCe.LIZ;
    }
}

package X;

import android.widget.TextView;
import com.ss.android.ugc.aweme.feed.assem.sharer.VideoExposeSharerInformationAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.8mE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C221228mE extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoExposeSharerInformationAssem, String, C76800UCe> {
    public static final C221228mE LJLIL = new C221228mE();

    public C221228mE() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoExposeSharerInformationAssem videoExposeSharerInformationAssem, String str) {
        VideoExposeSharerInformationAssem selectSubscribe = videoExposeSharerInformationAssem;
        String followText = str;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(followText, "followText");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VideoExposeSharerState::followText = ");
        LIZ.append(followText);
        C221018lt.LJFF("@LinkRelation_Video_Assem", X1D.LIZIZ(LIZ));
        ((TextView) selectSubscribe.Y3().findViewById(R.id.m71)).setText(followText);
        return C76800UCe.LIZ;
    }
}

package X;

import android.view.View;
import com.ss.android.ugc.aweme.feed.assem.sharer.VideoExposeSharerInformationAssem;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.8mX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C221418mX extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoExposeSharerInformationAssem, Boolean, C76800UCe> {
    public static final C221418mX LJLIL = new C221418mX();

    public C221418mX() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoExposeSharerInformationAssem videoExposeSharerInformationAssem, Boolean bool) {
        boolean z;
        int i;
        VideoExposeSharerInformationAssem selectSubscribe = videoExposeSharerInformationAssem;
        boolean booleanValue = bool.booleanValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        User nv0 = selectSubscribe.q4().nv0();
        int i2 = 0;
        if (nv0 != null && 2 == nv0.getFollowStatus()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (!((C221298mL) selectSubscribe.q4().getState()).LJLLI) {
                View findViewById = selectSubscribe.Y3().findViewById(R.id.d25);
                o.LJIIIIZZ(findViewById, "this");
                VideoExposeSharerInformationAssem.r4(findViewById);
                if (booleanValue) {
                    i = 8;
                } else {
                    i = 0;
                }
                findViewById.setVisibility(i);
                View findViewById2 = selectSubscribe.Y3().findViewById(R.id.il5);
                o.LJIIIIZZ(findViewById2, "this");
                VideoExposeSharerInformationAssem.r4(findViewById2);
                if (booleanValue) {
                    if (selectSubscribe.Y3().findViewById(R.id.il5).getVisibility() != 0) {
                        InterfaceC221448ma quickReplyAnalytics = selectSubscribe.q4().mv0().getQuickReplyAnalytics();
                        String str = selectSubscribe.q4().LJLJI;
                        if (str == null) {
                            str = "";
                        }
                        quickReplyAnalytics.LIZIZ(str, selectSubscribe.q4().ov0());
                    }
                } else {
                    i2 = 8;
                }
                findViewById2.setVisibility(i2);
            }
        } else {
            View findViewById3 = selectSubscribe.Y3().findViewById(R.id.d25);
            if (findViewById3 != null) {
                findViewById3.setVisibility(0);
                VideoExposeSharerInformationAssem.r4(findViewById3);
            }
            selectSubscribe.Y3().findViewById(R.id.il5).setVisibility(8);
        }
        return C76800UCe.LIZ;
    }
}

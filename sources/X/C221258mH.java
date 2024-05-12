package X;

import android.content.Context;
import android.widget.TextView;
import com.ss.android.ugc.aweme.feed.assem.sharer.VideoExposeSharerInformationAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.8mH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C221258mH extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoExposeSharerInformationAssem, String, C76800UCe> {
    public static final C221258mH LJLIL = new C221258mH();

    public C221258mH() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoExposeSharerInformationAssem videoExposeSharerInformationAssem, String str) {
        String str2;
        VideoExposeSharerInformationAssem selectSubscribe = videoExposeSharerInformationAssem;
        String str3 = str;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        ((TextView) selectSubscribe.Y3().findViewById(R.id.mjx)).setText(str3);
        if (C221518mh.LIZ()) {
            TextView textView = (TextView) selectSubscribe.Y3().findViewById(R.id.il7);
            Context context = selectSubscribe.getContext();
            if (context != null) {
                str2 = context.getString(R.string.gzj, str3);
            } else {
                str2 = null;
            }
            textView.setText(str2);
        }
        return C76800UCe.LIZ;
    }
}

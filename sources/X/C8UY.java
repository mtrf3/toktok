package X;

import android.text.SpannableString;
import android.widget.TextView;
import com.ss.android.ugc.aweme.feed.assem.caution.VideoTopCautionAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.8UY, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8UY extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoTopCautionAssem, SpannableString, C76800UCe> {
    public static final C8UY LJLIL = new C8UY();

    public C8UY() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoTopCautionAssem videoTopCautionAssem, SpannableString spannableString) {
        VideoTopCautionAssem selectSubscribe = videoTopCautionAssem;
        SpannableString spannableString2 = spannableString;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        TextView textView = (TextView) selectSubscribe.Y3().findViewById(R.id.b72);
        if (textView != null) {
            textView.setText(spannableString2);
        }
        return C76800UCe.LIZ;
    }
}

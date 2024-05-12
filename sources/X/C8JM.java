package X;

import android.widget.TextView;
import com.ss.android.ugc.aweme.feed.assem.photosensitivevideomask.PhotosensitiveVideoMaskAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.8JM, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8JM extends AbstractC65781Prl implements InterfaceC88475Ynv<PhotosensitiveVideoMaskAssem, String, String, Integer, Integer, C76800UCe> {
    public static final C8JM LJLIL = new C8JM();

    public C8JM() {
        super(5);
    }

    @Override // X.InterfaceC88475Ynv
    public final C76800UCe invoke(PhotosensitiveVideoMaskAssem photosensitiveVideoMaskAssem, String str, String str2, Integer num, Integer num2) {
        PhotosensitiveVideoMaskAssem selectSubscribe = photosensitiveVideoMaskAssem;
        String str3 = str;
        String str4 = str2;
        int intValue = num.intValue();
        int intValue2 = num2.intValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        TextView textView = selectSubscribe.LLI;
        if (textView != null) {
            textView.setText(str3);
            TextView textView2 = selectSubscribe.LLIFFJFJJ;
            if (textView2 != null) {
                textView2.setText(str4);
                SY4 sy4 = selectSubscribe.LLII;
                if (sy4 != null) {
                    sy4.setVisibility(intValue);
                    SY4 sy42 = selectSubscribe.LLIIII;
                    if (sy42 != null) {
                        sy42.setVisibility(intValue2);
                        return C76800UCe.LIZ;
                    }
                    o.LJIJI("negativeBtn");
                    throw null;
                }
                o.LJIJI("positiveBtn");
                throw null;
            }
            o.LJIJI("titleTextView");
            throw null;
        }
        o.LJIJI("contentTextView");
        throw null;
    }
}

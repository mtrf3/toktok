package X;

import com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.7nS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C196507nS extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoDiggAssem, Boolean, C76800UCe> {
    public static final C196507nS LJLIL = new C196507nS();

    public C196507nS() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoDiggAssem videoDiggAssem, Boolean bool) {
        VideoDiggAssem selectSubscribe = videoDiggAssem;
        boolean booleanValue = bool.booleanValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (booleanValue) {
            selectSubscribe.Y3().findViewById(R.id.c_r).setTag(R.id.jzn, Boolean.FALSE);
            ((C29701Eo) selectSubscribe.Y3().findViewById(R.id.c_r)).setImageDrawable(selectSubscribe.LLIIIL);
        } else {
            ((C29701Eo) selectSubscribe.Y3().findViewById(R.id.c_r)).setImageDrawable(selectSubscribe.LLIIIL);
        }
        return C76800UCe.LIZ;
    }
}

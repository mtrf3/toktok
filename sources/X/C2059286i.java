package X;

import android.content.Context;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.VideoAuthorInfoRelationAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.86i, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2059286i extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoAuthorInfoRelationAssem, OSZ<? extends String, ? extends String>, C76800UCe> {
    public static final C2059286i LJLIL = new C2059286i();

    public C2059286i() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoAuthorInfoRelationAssem videoAuthorInfoRelationAssem, OSZ<? extends String, ? extends String> osz) {
        VideoAuthorInfoRelationAssem selectSubscribe = videoAuthorInfoRelationAssem;
        OSZ<? extends String, ? extends String> osz2 = osz;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (osz2 != null) {
            Context context = selectSubscribe.getContext();
            o.LJI(context);
            String first = osz2.getFirst();
            String second = osz2.getSecond();
            TuxTextView tuxTextView = selectSubscribe.LLFII;
            if (tuxTextView != null) {
                AJ9.LJ(context, first, second, tuxTextView);
            } else {
                o.LJIJI("titleView");
                throw null;
            }
        }
        return C76800UCe.LIZ;
    }
}

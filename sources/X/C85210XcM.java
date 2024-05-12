package X;

import android.content.Context;
import com.ss.android.ugc.aweme.ui.DubbingStatusAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.XcM, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85210XcM extends AbstractC65781Prl implements InterfaceC88471Ynr<DubbingStatusAssem, Boolean, C76800UCe> {
    public static final C85210XcM LJLIL = new C85210XcM();

    public C85210XcM() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(DubbingStatusAssem dubbingStatusAssem, Boolean bool) {
        Context context;
        ActivityC45651qj LJJIFFI;
        DubbingStatusAssem selectSubscribe = dubbingStatusAssem;
        boolean booleanValue = bool.booleanValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (booleanValue && (context = selectSubscribe.getContext()) != null && (LJJIFFI = C45804HyK.LJJIFFI(context)) != null) {
            C40328FsC.LIZLLL(LJJIFFI, R.string.dba);
        }
        return C76800UCe.LIZ;
    }
}

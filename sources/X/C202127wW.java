package X;

import com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.7wW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C202127wW extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoDiggAssem, C43I<? extends Boolean>, C76800UCe> {
    public static final C202127wW LJLIL = new C202127wW();

    public C202127wW() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoDiggAssem videoDiggAssem, C43I<? extends Boolean> c43i) {
        VideoDiggAssem selectSubscribe = videoDiggAssem;
        C43I<? extends Boolean> c43i2 = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i2 != null) {
            if (((Boolean) c43i2.LIZ).booleanValue()) {
                C202297wn.LIZ(selectSubscribe.Y3().findViewById(R.id.c_r));
            } else if (C204147zm.LIZLLL) {
                C202297wn.LIZ(selectSubscribe.Y3().findViewById(R.id.c_r));
            } else {
                ((C202467x4) selectSubscribe.Y3().findViewById(R.id.c_r)).LJII();
            }
            selectSubscribe.r4().setState(C200607u4.LJLIL);
        }
        return C76800UCe.LIZ;
    }
}

package X;

import Y.ARunnableS40S0100000_4;
import com.ss.android.ugc.aweme.feed.assem.progressbar.VideoProgressBarAssem;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility;
import kotlin.jvm.internal.o;

/* renamed from: X.Xy6, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86558Xy6 extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoProgressBarAssem, C43I<? extends Boolean>, C76800UCe> {
    public static final C86558Xy6 LJLIL = new C86558Xy6();

    public C86558Xy6() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoProgressBarAssem videoProgressBarAssem, C43I<? extends Boolean> c43i) {
        VideoProgressBarAssem selectSubscribe = videoProgressBarAssem;
        C43I<? extends Boolean> c43i2 = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i2 != null) {
            if (Boolean.valueOf(((Boolean) c43i2.LIZ).booleanValue()).booleanValue()) {
                InteractAreaCommonAbility interactAreaCommonAbility = (InteractAreaCommonAbility) selectSubscribe.LLFII.getValue();
                if (interactAreaCommonAbility != null) {
                    interactAreaCommonAbility.U00(selectSubscribe, null, null);
                }
                C35570Dxe.LIZ(new ARunnableS40S0100000_4(selectSubscribe, 160), selectSubscribe.LLII);
            } else {
                selectSubscribe.B4();
            }
        }
        return C76800UCe.LIZ;
    }
}

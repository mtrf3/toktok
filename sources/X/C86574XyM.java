package X;

import com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.ReplaceMusicBottomBarAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.XyM, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86574XyM extends AbstractC65781Prl implements InterfaceC88471Ynr<ReplaceMusicBottomBarAssem, C43I<? extends Integer>, C76800UCe> {
    public static final C86574XyM LJLIL = new C86574XyM();

    public C86574XyM() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(ReplaceMusicBottomBarAssem replaceMusicBottomBarAssem, C43I<? extends Integer> c43i) {
        ReplaceMusicBottomBarAssem selectSubscribe = replaceMusicBottomBarAssem;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i != null) {
            selectSubscribe.LLIIII = true;
            selectSubscribe.LLIIIJ.invoke();
        }
        return C76800UCe.LIZ;
    }
}

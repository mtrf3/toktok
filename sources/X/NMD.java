package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NMD extends AbstractC65781Prl implements InterfaceC88472Yns<M95, String> {
    public static final NMD LJLIL = new NMD();

    public NMD() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final String invoke(M95 m95) {
        M95 $receiver = m95;
        o.LJIIIZ($receiver, "$this$$receiver");
        Object LIZ = $receiver.LIZ(Aweme.class);
        if (LIZ != null) {
            return String.valueOf(C55511LqV.LJ((Aweme) LIZ));
        }
        throw new C58623Mzb(Aweme.class);
    }
}

package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Arrays;
import kotlin.jvm.internal.o;

/* renamed from: X.7zI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C203847zI extends AbstractC65781Prl implements InterfaceC65784Pro<C203827zG> {
    public static final C203847zI LJLIL = new C203847zI();

    public C203847zI() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.7zG] */
    @Override // X.InterfaceC65784Pro
    public final C203827zG invoke() {
        return new InterfaceC214228aw<InterfaceC203837zH>() { // from class: X.7zG
            @Override // X.InterfaceC214228aw
            public final void release() {
            }

            @Override // X.InterfaceC214228aw
            public final InterfaceC203837zH getOperator() {
                return new InterfaceC203837zH() { // from class: X.7zE
                    @Override // X.InterfaceC203837zH
                    public final C65482hc LJJLIL(Aweme aweme, String str, String str2, boolean z, long j) {
                        o.LJIIIZ(aweme, "aweme");
                        int i = !z ? 1 : 0;
                        String LLLZ = C16880lQ.LLLZ("start request api %s", Arrays.copyOf(new Object[]{"/aweme/v1/aweme/collect/"}, 1));
                        o.LJIIIIZZ(LLLZ, "format(this, *args)");
                        M8L.LIZ(LLLZ);
                        XGR LIZ = XGJ.LIZ().LIZ(new C203797zD(aweme.getAid(), i));
                        String aid = aweme.getAid();
                        o.LJIIIIZZ(aid, "aweme.aid");
                        LIZ.LIZ(new XH4(new XHY(aid)));
                        LIZ.LIZ(new C84568XGy(new C203787zC(new BaseResponse())));
                        return new C65482hc(LIZ.LIZIZ(), C203827zG.this, aweme, str, i, str2, z, j);
                    }
                };
            }
        };
    }
}

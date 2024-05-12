package X;

import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.o;

/* renamed from: X.Edt, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36893Edt extends AbstractC65781Prl implements InterfaceC65784Pro<Long> {
    public static final C36893Edt LJLIL = new C36893Edt();

    public C36893Edt() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Long invoke() {
        String LIZIZ = C39532FfM.LIZJ(FKM.LIZ()).LIZIZ("build_timestamp", CardStruct.IStatusCode.DEFAULT);
        o.LJIIIIZZ(LIZIZ, "inst(ApplicationHolder.a…g(\"build_timestamp\", \"0\")");
        return Long.valueOf(CastLongProtector.parseLong(LIZIZ));
    }
}

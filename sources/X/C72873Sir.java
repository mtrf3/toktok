package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Sir, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72873Sir extends AbstractC65781Prl implements InterfaceC88473Ynt<Float, C72877Siv, Long, Float> {
    public static final C72873Sir LJLIL = new C72873Sir();

    public C72873Sir() {
        super(3);
    }

    @Override // X.InterfaceC88473Ynt
    public final Float invoke(Float f, C72877Siv c72877Siv, Long l) {
        f.floatValue();
        C72877Siv handleConfig = c72877Siv;
        long longValue = l.longValue();
        o.LJIIIZ(handleConfig, "handleConfig");
        return Float.valueOf(handleConfig.LJLJLLL * ((float) (longValue / 1000)));
    }
}

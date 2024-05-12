package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Sis, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72874Sis extends AbstractC65781Prl implements InterfaceC88473Ynt<Integer, C72877Siv, Long, Integer> {
    public static final C72874Sis LJLIL = new C72874Sis();

    public C72874Sis() {
        super(3);
    }

    @Override // X.InterfaceC88473Ynt
    public final Integer invoke(Integer num, C72877Siv c72877Siv, Long l) {
        num.intValue();
        C72877Siv handleConfig = c72877Siv;
        long longValue = l.longValue();
        o.LJIIIZ(handleConfig, "handleConfig");
        int i = (int) (((handleConfig.LJLJLLL * ((float) (longValue / 1000))) + (handleConfig.LJLJJL + handleConfig.LJLJJLL)) - handleConfig.LJLIL);
        if (i < 0) {
            i = 0;
        }
        return Integer.valueOf(i);
    }
}

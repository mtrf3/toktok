package X;

import kotlin.jvm.internal.o;

/* renamed from: X.9ck, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C240829ck extends AbstractC65781Prl implements InterfaceC88472Yns<C240839cl, C240839cl> {
    public static final C240829ck LJLIL = new C240829ck();

    public C240829ck() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C240839cl invoke(C240839cl setState) {
        o.LJIIIZ(setState, "$this$setState");
        EnumC241749eE playingStatus = EnumC241749eE.DEFAULT;
        o.LJIIIZ(playingStatus, "playingStatus");
        return new C240839cl(null, playingStatus);
    }
}

package X;

import kotlin.jvm.internal.o;

/* renamed from: X.28a, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C534828a extends AbstractC65781Prl implements InterfaceC88472Yns<C29688Bky, C76800UCe> {
    public final /* synthetic */ long LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C534828a(long j) {
        super(1);
        this.LJLIL = j;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C29688Bky c29688Bky) {
        C29688Bky it = c29688Bky;
        o.LJIIIZ(it, "it");
        String msg = String.valueOf(this.LJLIL);
        o.LJIIIZ(msg, "msg");
        it.LIZJ.put("error_msg", msg);
        it.LJIIIZ("system_event_stream_bitrate_error", "");
        return C76800UCe.LIZ;
    }
}

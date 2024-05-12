package X;

import com.ss.android.ugc.aweme.player.ab.abs.buffer.PlayeAbBufferConfigData;

/* renamed from: X.EKt, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36255EKt extends AbstractC65781Prl implements InterfaceC65784Pro<PlayeAbBufferConfigData> {
    public static final C36255EKt LJLIL = new C36255EKt();

    public C36255EKt() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, com.ss.android.ugc.aweme.player.ab.abs.buffer.PlayeAbBufferConfigData] */
    @Override // X.InterfaceC65784Pro
    public final PlayeAbBufferConfigData invoke() {
        FFL.LJIIIZ().getClass();
        ?? LJIJ = FFL.LJIJ(true, "player_buffer_config_data", 31744, PlayeAbBufferConfigData.class, null);
        if (LJIJ == 0) {
            return new PlayeAbBufferConfigData();
        }
        return LJIJ;
    }
}

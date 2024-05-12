package X;

import com.ss.android.ugc.aweme.ecommerce.core.ab.ChunkConfig;
import kotlin.jvm.internal.o;

/* renamed from: X.Rii, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70316Rii extends AbstractC65781Prl implements InterfaceC65784Pro<ChunkConfig> {
    public static final C70316Rii LJLIL = new C70316Rii();

    public C70316Rii() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final ChunkConfig invoke() {
        FFL LJIIIZ = FFL.LJIIIZ();
        ChunkConfig chunkConfig = C70315Rih.LIZIZ;
        LJIIIZ.getClass();
        Object LJIJ = FFL.LJIJ(true, "ec_osp_enable_chunk_android", 31744, ChunkConfig.class, chunkConfig);
        if (LJIJ == 0) {
            C70315Rih.LIZ.getClass();
        } else {
            chunkConfig = LJIJ;
        }
        o.LJIIIIZZ(chunkConfig, "ABManager.getInstance()\n…a)\n            ?: DEFAULT");
        return chunkConfig;
    }
}

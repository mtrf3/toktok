package X;

import com.bytedance.android.livesdk.rank.list.model.RankListV2Response;
import kotlin.jvm.internal.o;

/* renamed from: X.UjG, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77994UjG extends AbstractC65781Prl implements InterfaceC88472Yns<RankListV2Response.Bulletin, Boolean> {
    public static final C77994UjG LJLIL = new C77994UjG();

    public C77994UjG() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(RankListV2Response.Bulletin bulletin) {
        RankListV2Response.Bulletin it = bulletin;
        o.LJIIIZ(it, "it");
        return Boolean.valueOf(!it.enable);
    }
}

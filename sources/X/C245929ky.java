package X;

import com.ss.android.ugc.aweme.profile.api.BlockApi;
import com.ss.android.ugc.aweme.profile.model.BlockStruct;

/* renamed from: X.9ky, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C245929ky extends AbstractC65781Prl implements InterfaceC65784Pro<InterfaceC214228aw<InterfaceC245959l1>> {
    public static final C245929ky LJLIL = new C245929ky();

    public C245929ky() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final InterfaceC214228aw<InterfaceC245959l1> invoke() {
        return new InterfaceC214228aw<InterfaceC245959l1>() { // from class: X.9kz
            public final C246819mP LIZ = new InterfaceC245959l1() { // from class: X.9mP
                @Override // X.InterfaceC245959l1
                public final BlockStruct LJJIJIIJI(int i, String str, String str2) {
                    return BlockApi.LIZ.block(str, str2, i, 0).execute().LIZIZ;
                }
            };

            @Override // X.InterfaceC214228aw
            public final void release() {
            }

            @Override // X.InterfaceC214228aw
            public final /* bridge */ /* synthetic */ InterfaceC245959l1 getOperator() {
                return this.LIZ;
            }
        };
    }
}

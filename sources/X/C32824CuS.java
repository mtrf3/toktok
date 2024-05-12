package X;

import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.CuS, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32824CuS extends C32804Cu8 implements InterfaceC76842UDu, ZBU, ZBV, InterfaceC35372DuS, InterfaceC76844UDw {
    public final List<Long> LJJIII;
    public final int LJJIIJ;
    public final String LJJIIJZLJL;
    public final int LJJIIZ;
    public final long LJJIIZI;
    public final int LJJIJ;
    public final C76854UEg LJJIJIIJI;

    @Override // X.InterfaceC76844UDw
    public final C76854UEg LIZ() {
        return this.LJJIJIIJI;
    }

    @Override // X.InterfaceC35372DuS
    public final List<Long> LIZIZ() {
        return this.LJJIII;
    }

    @Override // X.InterfaceC76842UDu
    public final int LIZJ() {
        return this.LJJIIZ;
    }

    @Override // X.ZBV
    public final int LJ() {
        return this.LJJIJ;
    }

    @Override // X.InterfaceC76842UDu
    public final String LJFF() {
        return this.LJJIIJZLJL;
    }

    @Override // X.InterfaceC76842UDu
    public final int LJI() {
        return this.LJJIIJ;
    }

    @Override // X.ZBU
    public final long LJIIIIZZ() {
        return this.LJJIIZI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32824CuS(C73026SlK c73026SlK, Gift gift, Room room, C32822CuQ c32822CuQ, String source, HashMap<String, String> hashMap, boolean z, long j, int i, String str, long j2, List<Long> frequentlyUsedGiftIds, int i2, String str2, int i3, long j3, int i4, C76854UEg c76854UEg) {
        super(c73026SlK, gift, room, c32822CuQ, source, hashMap, z, 0, j2, j, null, null, i, null, str, 11392);
        o.LJIIIZ(source, "source");
        o.LJIIIZ(frequentlyUsedGiftIds, "frequentlyUsedGiftIds");
        this.LJJIII = frequentlyUsedGiftIds;
        this.LJJIIJ = i2;
        this.LJJIIJZLJL = str2;
        this.LJJIIZ = i3;
        this.LJJIIZI = j3;
        this.LJJIJ = i4;
        this.LJJIJIIJI = c76854UEg;
    }
}

package X;

import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.UDt, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76841UDt extends C32804Cu8 implements InterfaceC76842UDu {
    public final int LJJIII;
    public final String LJJIIJ;
    public final int LJJIIJZLJL;

    @Override // X.InterfaceC76842UDu
    public final int LIZJ() {
        return this.LJJIIJZLJL;
    }

    @Override // X.InterfaceC76842UDu
    public final String LJFF() {
        return this.LJJIIJ;
    }

    @Override // X.InterfaceC76842UDu
    public final int LJI() {
        return this.LJJIII;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C76841UDt(C73026SlK c73026SlK, Gift gift, Room room, C32822CuQ c32822CuQ, String source, HashMap<String, String> hashMap, boolean z, String str, int i, String str2, int i2, String str3, int i3) {
        super(c73026SlK, gift, room, c32822CuQ, source, hashMap, z, 0, 0L, 0L, null, null, i, str, str2, 3968);
        o.LJIIIZ(gift, "gift");
        o.LJIIIZ(source, "source");
        this.LJJIII = i2;
        this.LJJIIJ = str3;
        this.LJJIIJZLJL = i3;
    }
}

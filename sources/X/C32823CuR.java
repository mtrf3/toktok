package X;

import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.GiftsBoxInfoForSend;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.CuR, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32823CuR extends C32804Cu8 implements ZBT, ZBU {
    public final InterfaceC32497CpB LJJIII;
    public final int LJJIIJ;
    public final String LJJIIJZLJL;
    public final String LJJIIZ;
    public final GiftsBoxInfoForSend LJJIIZI;
    public final C15900jq LJJIJ;
    public final int LJJIJIIJI;
    public final int LJJIJIIJIL;
    public final int LJJIJIL;
    public final long LJJIJL;
    public final int LJJIJLIJ;
    public final int LJJIL;

    @Override // X.ZBT
    public final int LIZLLL() {
        return this.LJJIL;
    }

    @Override // X.ZBT
    public final int LJII() {
        return this.LJJIJLIJ;
    }

    @Override // X.ZBU
    public final long LJIIIIZZ() {
        return this.LJJIJL;
    }

    @Override // X.C32804Cu8
    public final int LJIIJ() {
        return this.LJJIJIL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32823CuR(C73026SlK c73026SlK, Gift gift, Room room, C32822CuQ c32822CuQ, String str, int i, boolean z, int i2, String str2, HashMap<String, String> hashMap, InterfaceC32497CpB interfaceC32497CpB, int i3, String str3, String str4, GiftsBoxInfoForSend giftsBoxInfoForSend, String str5, C15900jq c15900jq, int i4, int i5, int i6, long j, int i7, int i8) {
        super(c73026SlK, gift, room, c32822CuQ, str, hashMap, z, i, 0L, 0L, str5, str2, i2, null, null, 25344);
        o.LJIIIZ(room, "room");
        this.LJJIII = interfaceC32497CpB;
        this.LJJIIJ = i3;
        this.LJJIIJZLJL = str3;
        this.LJJIIZ = str4;
        this.LJJIIZI = giftsBoxInfoForSend;
        this.LJJIJ = c15900jq;
        this.LJJIJIIJI = i4;
        this.LJJIJIIJIL = i5;
        this.LJJIJIL = i6;
        this.LJJIJL = j;
        this.LJJIJLIJ = i7;
        this.LJJIL = i8;
    }
}

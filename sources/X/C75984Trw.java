package X;

import com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalsListsData;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import kotlin.jvm.internal.o;

/* renamed from: X.Trw, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75984Trw extends C75981Trt {
    public final boolean LJLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C75984Trw(Room room, RivalsListsData.TopHostInfo topHostInfo, EnumC75614Tly enumC75614Tly, RivalExtraInfo rivalExtraInfo, String str, EnumC76024Tsa highLightBackground, boolean z, boolean z2) {
        super(room, topHostInfo, enumC75614Tly, rivalExtraInfo, str, highLightBackground, z2);
        o.LJIIIZ(highLightBackground, "highLightBackground");
        this.LJLLL = z;
    }
}

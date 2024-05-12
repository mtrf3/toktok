package X;

import com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalsListsData;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import kotlin.jvm.internal.o;

/* renamed from: X.Trt, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C75981Trt implements InterfaceC28306B9a {
    public final Room LJLIL;
    public final RivalsListsData.TopHostInfo LJLILLLLZI;
    public final EnumC75614Tly LJLJI;
    public final RivalExtraInfo LJLJJI;
    public final String LJLJJL;
    public EnumC76024Tsa LJLJJLL;
    public final boolean LJLJL;
    public boolean LJLJLJ;
    public boolean LJLJLLL;
    public boolean LJLL;
    public boolean LJLLI;
    public EnumC75958TrW LJLLILLLL;
    public boolean LJLLJ;

    public final String LIZ() {
        String str;
        Hashtag hashtag = this.LJLIL.hashtag;
        if (hashtag == null || (str = hashtag.title) == null) {
            return "";
        }
        return str;
    }

    public /* synthetic */ C75981Trt(Room room, RivalsListsData.TopHostInfo topHostInfo, EnumC75614Tly enumC75614Tly, RivalExtraInfo rivalExtraInfo, String str, EnumC76024Tsa enumC76024Tsa) {
        this(room, topHostInfo, enumC75614Tly, rivalExtraInfo, str, enumC76024Tsa, false);
    }

    public C75981Trt(Room room, RivalsListsData.TopHostInfo topHostInfo, EnumC75614Tly enumC75614Tly, RivalExtraInfo rivalExtraInfo, String str, EnumC76024Tsa highLightBackground, boolean z) {
        o.LJIIIZ(highLightBackground, "highLightBackground");
        this.LJLIL = room;
        this.LJLILLLLZI = topHostInfo;
        this.LJLJI = enumC75614Tly;
        this.LJLJJI = rivalExtraInfo;
        this.LJLJJL = str;
        this.LJLJJLL = highLightBackground;
        this.LJLJL = z;
        this.LJLLILLLL = EnumC75958TrW.NORMAL;
    }
}

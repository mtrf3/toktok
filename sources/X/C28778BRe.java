package X;

import com.bytedance.android.live.broadcast.api.blockword.BlockWordApi;
import com.bytedance.android.live.broadcast.api.blockword.model.BlockWordRecommend;
import com.bytedance.android.livesdk.adminsetting.fastaddblockwords.LiveFastAddBlockKeywordsFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.BRe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28778BRe {
    public final InterfaceC28779BRf LIZ;
    public final DataChannel LIZIZ;
    public final BlockWordApi LIZJ;
    public List<BlockWordRecommend> LIZLLL;
    public String LJ;
    public long LJFF;

    public C28778BRe(LiveFastAddBlockKeywordsFragment mCallBack, DataChannel dataChannel) {
        o.LJIIIZ(mCallBack, "mCallBack");
        this.LIZ = mCallBack;
        this.LIZIZ = dataChannel;
        this.LIZJ = (BlockWordApi) C1A.LIZJ(BlockWordApi.class);
        this.LJ = "";
    }
}

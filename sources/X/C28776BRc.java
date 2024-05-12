package X;

import com.bytedance.android.live.broadcast.api.blockword.model.BlockWordRecommend;
import com.bytedance.android.livesdk.adminsetting.fastaddblockwords.LiveFastAddBlockKeywordsFragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.BRc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28776BRc implements InterfaceC28781BRh {
    public final /* synthetic */ LiveFastAddBlockKeywordsFragment LIZ;

    public C28776BRc(LiveFastAddBlockKeywordsFragment liveFastAddBlockKeywordsFragment) {
        this.LIZ = liveFastAddBlockKeywordsFragment;
    }

    @Override // X.InterfaceC28781BRh
    public final void LIZ(int i, BlockWordRecommend word) {
        String str;
        o.LJIIIZ(word, "word");
        C28778BRe c28778BRe = (C28778BRe) this.LIZ.LJLL.getValue();
        List<BlockWordRecommend> list = c28778BRe.LIZLLL;
        if (list != null) {
            ((BlockWordRecommend) ListProtector.get(list, i)).selected = !((BlockWordRecommend) ListProtector.get(list, i)).selected;
            c28778BRe.LIZLLL = list;
            c28778BRe.LIZ.ih(list);
            BlockWordRecommend blockWordRecommend = (BlockWordRecommend) ListProtector.get(list, i);
            if (blockWordRecommend != null) {
                BZI LIZ = C28787BRn.LIZ("quick_add_select_keyword");
                LIZ.LJIILLIIL(c28778BRe.LIZIZ);
                LIZ.LJIJJ(blockWordRecommend.content, "word");
                if (blockWordRecommend.selected) {
                    str = "select";
                } else {
                    str = "deselect";
                }
                LIZ.LJIJJ(str, "action");
                LIZ.LJJIIJZLJL();
            }
        }
    }
}

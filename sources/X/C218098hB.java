package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.ies.powerlist.page.config.PowerPageSource;
import com.ss.android.ugc.aweme.mention.ui.cell.MentionStickerRecommendCell;
import com.ss.android.ugc.aweme.mention.ui.cell.MentionStickerSearchCell;
import com.ss.android.ugc.aweme.mention.viewmodel.MentionStickerRecommendViewModel;
import com.ss.android.ugc.aweme.mention.viewmodel.MentionStickerSearchViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.8hB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C218098hB extends FrameLayout {
    public final SYL LJLIL;
    public final SYL LJLILLLLZI;
    public final MentionStickerSearchViewModel LJLJI;
    public final MentionStickerRecommendViewModel LJLJJI;

    public final MentionStickerRecommendViewModel getRecommendViewModel$mention_tag_release() {
        return this.LJLJJI;
    }

    public final MentionStickerSearchViewModel getSearchViewModel$mention_tag_release() {
        return this.LJLJI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C218098hB(Context context) {
        super(context, null, 0);
        new LinkedHashMap();
        MentionStickerSearchViewModel mentionStickerSearchViewModel = new MentionStickerSearchViewModel();
        this.LJLJI = mentionStickerSearchViewModel;
        MentionStickerRecommendViewModel mentionStickerRecommendViewModel = new MentionStickerRecommendViewModel();
        this.LJLJJI = mentionStickerRecommendViewModel;
        View.inflate(context, R.layout.bsh, this);
        View findViewById = findViewById(R.id.gh_);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.mention_sticker_search_list)");
        SYL syl = (SYL) findViewById;
        this.LJLIL = syl;
        View findViewById2 = findViewById(R.id.gh9);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.mention_sticker_recommend_list)");
        SYL syl2 = (SYL) findViewById2;
        this.LJLILLLLZI = syl2;
        syl.LLLF.LJZL(MentionStickerSearchCell.class);
        syl.setItemAnimator(null);
        syl.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        linearLayoutManager.LLJJIII(0);
        syl.setLayoutManager(linearLayoutManager);
        syl.LJLJLJ(new C72300SZc() { // from class: X.8hF
            @Override // X.C72300SZc
            public final void LJII() {
                C218098hB.this.LJLIL.getState().LJFF();
            }
        });
        syl.LJLJLLL((AbstractC72278SYg) mentionStickerSearchViewModel.LJLJJI.getValue());
        syl2.LLLF.LJZL(MentionStickerRecommendCell.class);
        syl2.setItemAnimator(null);
        syl2.getContext();
        LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager();
        linearLayoutManager2.LLJJIII(0);
        syl2.setLayoutManager(linearLayoutManager2);
        syl2.LJLJLLL((AbstractC72278SYg) mentionStickerRecommendViewModel.LJLILLLLZI.getValue());
        syl2.setVisibility(0);
        syl.setVisibility(8);
        ((PowerPageSource) mentionStickerRecommendViewModel.LJLILLLLZI.getValue()).getOperator().refresh();
    }
}

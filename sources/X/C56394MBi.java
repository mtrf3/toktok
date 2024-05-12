package X;

import android.text.TextUtils;
import android.view.View;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.search.TrendingEventModel;
import com.ss.android.ugc.aweme.trending.ui.detailpage.ContentAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.MBi, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56394MBi extends AbstractC65781Prl implements InterfaceC88473Ynt<UIAssem, TrendingEventModel, Boolean, C76800UCe> {
    public final /* synthetic */ View LJLIL;
    public final /* synthetic */ ContentAssem LJLILLLLZI;
    public final /* synthetic */ TuxTextView LJLJI;
    public final /* synthetic */ TuxTextView LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C56394MBi(View view, ContentAssem contentAssem, TuxTextView tuxTextView, TuxTextView tuxTextView2) {
        super(3);
        this.LJLIL = view;
        this.LJLILLLLZI = contentAssem;
        this.LJLJI = tuxTextView;
        this.LJLJJI = tuxTextView2;
    }

    @Override // X.InterfaceC88473Ynt
    public final C76800UCe invoke(UIAssem selectSubscribe, TrendingEventModel trendingEventModel, Boolean bool) {
        TrendingEventModel it = trendingEventModel;
        boolean booleanValue = bool.booleanValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(it, "it");
        if (!booleanValue) {
            this.LJLIL.setVisibility(8);
            C57191McV c57191McV = this.LJLILLLLZI.LJLJI;
            if (c57191McV != null) {
                c57191McV.setVisibility(8);
            }
        } else {
            C57191McV c57191McV2 = this.LJLILLLLZI.LJLJI;
            if (c57191McV2 != null) {
                c57191McV2.setVisibility(0);
            }
            this.LJLIL.setVisibility(0);
            String trendingName = it.getTrendingName();
            if (trendingName == null || trendingName.length() == 0) {
                this.LJLJI.setVisibility(8);
            } else {
                this.LJLJI.setVisibility(0);
                this.LJLJI.setText(it.getTrendingName());
            }
            if (TextUtils.isEmpty(it.getRankText()) || C56424MCm.LIZ()) {
                this.LJLJJI.setVisibility(8);
            } else {
                this.LJLJJI.setVisibility(0);
                this.LJLJJI.setText(it.getRankText());
            }
        }
        return C76800UCe.LIZ;
    }
}

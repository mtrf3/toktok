package X;

import android.content.Context;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.search.pages.result.core.repo.ClickSearchWord;
import kotlin.jvm.internal.o;

/* renamed from: X.JTc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewOnLongClickListenerC49212JTc implements View.OnLongClickListener {
    public final /* synthetic */ TuxTextView LJLIL;
    public final /* synthetic */ JQO LJLILLLLZI;
    public final /* synthetic */ ClickSearchWord LJLJI;

    public ViewOnLongClickListenerC49212JTc(TuxTextView tuxTextView, ClickSearchWord clickSearchWord, JQO jqo) {
        this.LJLIL = tuxTextView;
        this.LJLILLLLZI = jqo;
        this.LJLJI = clickSearchWord;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        Context context = this.LJLIL.getContext();
        o.LJIIIIZZ(context, "context");
        C49604JdQ.LJI(context, this.LJLILLLLZI.LJLJLJ, this.LJLJI.wordRecord, "click_recom");
        return true;
    }
}

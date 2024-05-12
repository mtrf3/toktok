package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.rs.core.model.RelatedWord;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.JXt, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewOnAttachStateChangeListenerC49333JXt extends RecyclerView.ViewHolder implements View.OnAttachStateChangeListener {
    public static final int LJLJJLL = O6R.LJJIIZ(C32151Nz.LJIIZILJ(8));
    public static final float LJLJL = C7MY.LIZIZ(2);
    public static final int LJLJLJ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(12));
    public static final int LJLJLLL = O6R.LJJIIZ(C32151Nz.LJIIZILJ(12));
    public static final int LJLL = C7MY.LIZIZ(48);
    public final TuxTextView LJLIL;
    public ISearchContextAbility LJLILLLLZI;
    public int LJLJI;
    public int LJLJJI;
    public RelatedWord LJLJJL;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View v) {
        o.LJIIIZ(v, "v");
    }

    public ViewOnAttachStateChangeListenerC49333JXt(TuxTextView tuxTextView) {
        super(tuxTextView);
        C48956JJg.LIZ(tuxTextView, LJLJL);
        tuxTextView.addOnAttachStateChangeListener(this);
        this.LJLIL = (TuxTextView) tuxTextView.findViewById(R.id.jfs);
        this.LJLJI = -1;
        this.LJLJJI = -1;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View v) {
        Word word;
        String str;
        String str2;
        AbstractC50059Jkl<C50322Jp0> If;
        C50322Jp0 LIZJ;
        AbstractC50059Jkl<C49587Jd9> ut0;
        C49587Jd9 LIZJ2;
        AbstractC50059Jkl<C50322Jp0> If2;
        C50322Jp0 LIZJ3;
        o.LJIIIZ(v, "v");
        RelatedWord relatedWord = this.LJLJJL;
        if (relatedWord != null && (word = relatedWord.wordRecord) != null) {
            ISearchContextAbility iSearchContextAbility = this.LJLILLLLZI;
            Integer valueOf = Integer.valueOf(this.LJLJI);
            int i = this.LJLJJI;
            C50648JuG c50648JuG = new C50648JuG();
            c50648JuG.LJIIZILJ("words_source", word.getWordSource());
            String str3 = null;
            if (iSearchContextAbility != null && (If2 = iSearchContextAbility.If()) != null && (LIZJ3 = If2.LIZJ()) != null) {
                str = LIZJ3.LJLJI;
            } else {
                str = null;
            }
            c50648JuG.LJIIZILJ("search_id", str);
            if (iSearchContextAbility != null && (ut0 = iSearchContextAbility.ut0()) != null && (LIZJ2 = ut0.LIZJ()) != null) {
                str2 = LIZJ2.LJLIL;
            } else {
                str2 = null;
            }
            c50648JuG.LJIIZILJ("impr_id", str2);
            if (iSearchContextAbility != null && (If = iSearchContextAbility.If()) != null && (LIZJ = If.LIZJ()) != null) {
                str3 = LIZJ.LJLJJI;
            }
            c50648JuG.LJIIZILJ("raw_query", str3);
            c50648JuG.LJJIIJZLJL(Integer.valueOf(word.getWordPosition()));
            c50648JuG.LJIIZILJ("words_content", word.getWord());
            c50648JuG.LJIIZILJ("search_position", "general");
            c50648JuG.LJIIZILJ("words_content", word.getWord());
            c50648JuG.LJJIII(Integer.valueOf(i));
            c50648JuG.LJIIZILJ("group_id", word.getId());
            c50648JuG.LJIIZILJ("group_position", String.valueOf(valueOf));
            if (o.LJ("2", word.getWordType())) {
                c50648JuG.LJJIIZ("hot");
            }
            c50648JuG.LJIILIIL();
        }
    }
}

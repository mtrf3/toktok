package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.search.pages.result.core.repo.ClickSearchWord;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.JXp, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewOnAttachStateChangeListenerC49329JXp extends RecyclerView.ViewHolder implements View.OnAttachStateChangeListener {
    public static final int LJLJJL = O6R.LJJIIZ(C32151Nz.LJIIZILJ(8));
    public static final float LJLJJLL = C7MY.LIZIZ(2);
    public static final int LJLJL = C7MY.LIZIZ(48);
    public final TuxTextView LJLIL;
    public ISearchContextAbility LJLILLLLZI;
    public JQA LJLJI;
    public ClickSearchWord LJLJJI;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View v) {
        o.LJIIIZ(v, "v");
    }

    public ViewOnAttachStateChangeListenerC49329JXp(TuxTextView tuxTextView) {
        super(tuxTextView);
        C48956JJg.LIZ(tuxTextView, LJLJJLL);
        tuxTextView.addOnAttachStateChangeListener(this);
        this.LJLIL = (TuxTextView) tuxTextView.findViewById(R.id.jfr);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View v) {
        Word word;
        String str;
        String str2;
        String str3;
        AbstractC50059Jkl<C50322Jp0> If;
        C50322Jp0 LIZJ;
        AbstractC50059Jkl<C50322Jp0> If2;
        C50322Jp0 LIZJ2;
        o.LJIIIZ(v, "v");
        ClickSearchWord clickSearchWord = this.LJLJJI;
        if (clickSearchWord != null && (word = clickSearchWord.wordRecord) != null) {
            ISearchContextAbility iSearchContextAbility = this.LJLILLLLZI;
            JQA jqa = this.LJLJI;
            C50648JuG c50648JuG = new C50648JuG();
            c50648JuG.LJIIZILJ("words_source", word.getWordSource());
            Integer num = null;
            if (iSearchContextAbility != null && (If2 = iSearchContextAbility.If()) != null && (LIZJ2 = If2.LIZJ()) != null) {
                str = LIZJ2.LJLJI;
            } else {
                str = null;
            }
            c50648JuG.LJIIZILJ("search_id", str);
            if (jqa != null) {
                str2 = jqa.LJIIIZ;
            } else {
                str2 = null;
            }
            c50648JuG.LJIIZILJ("impr_id", str2);
            if (iSearchContextAbility != null && (If = iSearchContextAbility.If()) != null && (LIZJ = If.LIZJ()) != null) {
                str3 = LIZJ.LJLJJI;
            } else {
                str3 = null;
            }
            c50648JuG.LJIIZILJ("raw_query", str3);
            c50648JuG.LJJIIJZLJL(Integer.valueOf(word.getWordPosition()));
            c50648JuG.LJIIZILJ("words_content", word.getWord());
            c50648JuG.LJIIZILJ("search_position", "general");
            c50648JuG.LJIIZILJ("words_content", word.getWord());
            if (jqa != null) {
                num = Integer.valueOf(jqa.LJIIL);
            }
            c50648JuG.LJJIII(num);
            c50648JuG.LJIIZILJ("group_id", word.getId());
            if (o.LJ("2", word.getWordType())) {
                c50648JuG.LJJIIZ("hot");
            }
            c50648JuG.LJIILIIL();
        }
    }
}

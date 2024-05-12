package X;

import android.content.Context;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.search.pages.result.core.repo.ClickSearchWord;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import kotlin.jvm.internal.o;

/* renamed from: X.JXn, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49327JXn implements InterfaceC49337JXx {
    public final /* synthetic */ ViewOnAttachStateChangeListenerC49329JXp LIZ;
    public final /* synthetic */ ClickSearchWord LIZIZ;

    @Override // X.InterfaceC49337JXx
    public final void LIZ() {
        String str;
        String str2;
        String wordSource;
        AbstractC50059Jkl<C49587Jd9> ut0;
        C49587Jd9 LIZJ;
        AbstractC50059Jkl<C50322Jp0> If;
        C50322Jp0 LIZJ2;
        ViewOnAttachStateChangeListenerC49329JXp viewOnAttachStateChangeListenerC49329JXp = this.LIZ;
        ClickSearchWord clickSearchWord = this.LIZIZ;
        viewOnAttachStateChangeListenerC49329JXp.getClass();
        JQA jqa = new JQA();
        ISearchContextAbility iSearchContextAbility = viewOnAttachStateChangeListenerC49329JXp.LJLILLLLZI;
        String str3 = "";
        if (iSearchContextAbility == null || (If = iSearchContextAbility.If()) == null || (LIZJ2 = If.LIZJ()) == null || (str = LIZJ2.LJLJJI) == null) {
            str = "";
        }
        jqa.LJ = str;
        ISearchContextAbility iSearchContextAbility2 = viewOnAttachStateChangeListenerC49329JXp.LJLILLLLZI;
        if (iSearchContextAbility2 == null || (ut0 = iSearchContextAbility2.ut0()) == null || (LIZJ = ut0.LIZJ()) == null || (str2 = LIZJ.LJLIL) == null) {
            str2 = "";
        }
        jqa.LJIIIIZZ = str2;
        Context context = viewOnAttachStateChangeListenerC49329JXp.itemView.getContext();
        o.LJIIIIZZ(context, "itemView.context");
        Word word = clickSearchWord.wordRecord;
        if (word != null && (wordSource = word.getWordSource()) != null) {
            str3 = wordSource;
        }
        C49604JdQ.LJI(context, jqa, word, str3);
    }

    public C49327JXn(ViewOnAttachStateChangeListenerC49329JXp viewOnAttachStateChangeListenerC49329JXp, ClickSearchWord clickSearchWord) {
        this.LIZ = viewOnAttachStateChangeListenerC49329JXp;
        this.LIZIZ = clickSearchWord;
    }
}

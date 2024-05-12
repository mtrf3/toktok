package X;

import Y.ACListenerS1S4201000_8;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LiveData;
import com.bytedance.tux.sheet.actionsheet.TuxActionSheet;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.ecommerce.search.sug.ISearchSugContextAbility;
import com.ss.android.ugc.aweme.ecomsearch.middle.viewmodel.EcSearchIntermediateViewModelNew;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.K9y, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51262K9y implements KDD {
    public final /* synthetic */ KBP LIZ;

    @Override // X.KDD
    public final void LJIJI() {
        ISearchSugContextAbility iSearchSugContextAbility;
        C51261K9x c51261K9x = this.LIZ.LJLILLLLZI;
        if (c51261K9x != null && (iSearchSugContextAbility = c51261K9x.LIZ) != null) {
            iSearchSugContextAbility.LLLFFI(true);
        }
    }

    public C51262K9y(KBP kbp) {
        this.LIZ = kbp;
    }

    @Override // X.KDD
    public final void LJIJJ(boolean z) {
        LiveData liveData;
        EcSearchIntermediateViewModelNew ecSearchIntermediateViewModelNew = this.LIZ.LJLJLJ;
        if (ecSearchIntermediateViewModelNew == null || (liveData = (LiveData) ecSearchIntermediateViewModelNew.LJLJJL.getValue()) == null) {
            return;
        }
        liveData.setValue(Boolean.valueOf(z));
    }

    @Override // X.KDD
    public final void LJIJJLI(int i, SearchSugEntity searchSugEntity, String str) {
        o.LJIIIZ(searchSugEntity, "searchSugEntity");
        KBP kbp = this.LIZ;
        ActivityC45651qj activityC45651qj = kbp.LJLIL;
        String str2 = kbp.LJLJJL;
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        String str4 = kbp.LJLJJI;
        if (str4 != null) {
            str3 = str4;
        }
        if (activityC45651qj != null) {
            String valueOf = String.valueOf(System.currentTimeMillis());
            Word word = searchSugEntity.mWord;
            if (word != null) {
                KCB kcb = new KCB();
                kcb.LJIILL("raw_query", str2);
                kcb.LJIILL("words_content", word.getWord());
                kcb.LJIIZILJ(Integer.valueOf(i));
                kcb.LJIILL("impr_id", str3);
                kcb.LJIILL("group_id", word.getId());
                kcb.LJIILL("words_source", "sug");
                kcb.LJIILL("sug_type", str);
                kcb.LJ("feedback_id", valueOf, InterfaceC1798974f.LIZ);
                kcb.LJIILIIL();
            }
            C245319jz c245319jz = new C245319jz();
            C252659vp LIZIZ = C49606JdS.LIZIZ(R.raw.icon_flag, R.string.rwy);
            LIZIZ.LJ = new ACListenerS1S4201000_8(i, activityC45651qj, searchSugEntity, str, valueOf, str2, str3, 0);
            C252659vp LIZIZ2 = C49606JdS.LIZIZ(R.raw.icon_heart_broken, R.string.rx1);
            LIZIZ2.LJ = new ACListenerS1S4201000_8(i, activityC45651qj, searchSugEntity, str, valueOf, str2, str3, 1);
            c245319jz.LIZ(LIZIZ, LIZIZ2);
            c245319jz.LIZ.LJLIL = new K7A(searchSugEntity, i, str, valueOf, str2, str3);
            TuxActionSheet LIZJ = c245319jz.LIZJ();
            FragmentManager supportFragmentManager = activityC45651qj.getSupportFragmentManager();
            o.LJIIIIZZ(supportFragmentManager, "activity.supportFragmentManager");
            LIZJ.show(supportFragmentManager, "SugFeedBackInBottom");
        }
        this.LIZ.notifyDataSetChanged();
    }
}

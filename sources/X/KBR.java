package X;

import Y.ACListenerS1S2201000_8;
import android.content.DialogInterface;
import androidx.lifecycle.LiveData;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.ecomsearch.middle.viewmodel.EcSearchIntermediateViewModelNew;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import com.zhiliaoapp.musically.R;

/* loaded from: classes9.dex */
public final class KBR implements KDD {
    public final /* synthetic */ KBQ LIZ;

    @Override // X.KDD
    public final void LJIJI() {
        K75 k75 = this.LIZ.LJLJJLL;
        if (k75 != null && k75.LJII() != null) {
            this.LIZ.LJLJJLL.LJII().LIZ();
        }
    }

    public KBR(KBQ kbq) {
        this.LIZ = kbq;
    }

    @Override // X.KDD
    public final void LJIJJ(boolean z) {
        EcSearchIntermediateViewModelNew ecSearchIntermediateViewModelNew = this.LIZ.LJLJJL;
        if (ecSearchIntermediateViewModelNew != null) {
            ((LiveData) ecSearchIntermediateViewModelNew.LJLJJL.getValue()).setValue(Boolean.valueOf(z));
        }
    }

    @Override // X.KDD
    public final void LJIJJLI(final int i, final SearchSugEntity searchSugEntity, final String str) {
        final KBQ kbq = this.LIZ;
        if (kbq.LJLJLJ != null) {
            final String l = Long.toString(System.currentTimeMillis());
            Word word = searchSugEntity.mWord;
            if (word != null) {
                KCB kcb = new KCB();
                kcb.LJIILL("raw_query", kbq.LJLJLLL);
                kcb.LJIILL("words_content", word.getWord());
                kcb.LJIIZILJ(Integer.valueOf(i));
                kcb.LJIILL("impr_id", kbq.LJLILLLLZI);
                kcb.LJIILL("group_id", word.getId());
                kcb.LJIILL("words_source", "sug");
                kcb.LJIILL("sug_type", str);
                kcb.LJ("feedback_id", l, InterfaceC1798974f.LIZ);
                kcb.LJIILIIL();
            }
            C245319jz c245319jz = new C245319jz();
            C252659vp LIZIZ = C49606JdS.LIZIZ(R.raw.icon_flag, R.string.rwy);
            LIZIZ.LJ = new ACListenerS1S2201000_8(kbq, searchSugEntity, i, str, l, 0);
            C252659vp LIZIZ2 = C49606JdS.LIZIZ(R.raw.icon_heart_broken, R.string.rx1);
            LIZIZ2.LJ = new ACListenerS1S2201000_8(kbq, searchSugEntity, i, str, l, 1);
            c245319jz.LIZ(LIZIZ, LIZIZ2);
            c245319jz.LIZ.LJLIL = new DialogInterface.OnCancelListener() { // from class: X.KBq
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    KBQ.this.LJLLLLLL(searchSugEntity, i, "cancel", str, l);
                }
            };
            c245319jz.LIZJ().show(kbq.LJLJLJ.getSupportFragmentManager(), "SugFeedBackInBottom");
        }
        this.LIZ.notifyDataSetChanged();
    }
}

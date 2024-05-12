package X;

import Y.ACListenerS1S2201000_8;
import Y.IDDListenerS147S0100000_8;
import android.content.DialogInterface;
import com.bytedance.tux.sheet.actionsheet.TuxActionSheet;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import com.zhiliaoapp.musically.R;

/* loaded from: classes9.dex */
public final class K5C implements KDY {
    public final /* synthetic */ C51323KCh LIZ;

    public K5C(C51323KCh c51323KCh) {
        this.LIZ = c51323KCh;
    }

    public final void LIZ(final int i, final SearchSugEntity searchSugEntity, final String str) {
        final C51323KCh c51323KCh = this.LIZ;
        if (c51323KCh.LJLJLLL != null) {
            final String l = Long.toString(System.currentTimeMillis());
            Word word = searchSugEntity.mWord;
            if (word != null) {
                C49702Jf0 c49702Jf0 = new C49702Jf0();
                c49702Jf0.LJIIZILJ("raw_query", c51323KCh.LJLL);
                c49702Jf0.LJIIZILJ("words_content", word.getWord());
                c49702Jf0.LJJIIJZLJL(Integer.valueOf(i));
                c49702Jf0.LJIIZILJ("impr_id", c51323KCh.LJLILLLLZI);
                c49702Jf0.LJIIZILJ("group_id", word.getId());
                c49702Jf0.LJIIZILJ("words_source", "sug");
                c49702Jf0.LJIIZILJ("sug_type", str);
                c49702Jf0.LJ("feedback_id", l, InterfaceC1798974f.LIZ);
                c49702Jf0.LJIILIIL();
            }
            C245319jz c245319jz = new C245319jz();
            C252659vp LIZIZ = C49606JdS.LIZIZ(R.raw.icon_flag, R.string.rwy);
            LIZIZ.LJ = new ACListenerS1S2201000_8(c51323KCh, searchSugEntity, i, str, l, 2);
            C252659vp LIZIZ2 = C49606JdS.LIZIZ(R.raw.icon_heart_broken, R.string.rx1);
            LIZIZ2.LJ = new ACListenerS1S2201000_8(c51323KCh, searchSugEntity, i, str, l, 3);
            c245319jz.LIZ(LIZIZ, LIZIZ2);
            DialogInterface.OnCancelListener onCancelListener = new DialogInterface.OnCancelListener() { // from class: X.K5D
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    C51323KCh.this.LJLLLLLL(searchSugEntity, i, "cancel", str, l);
                }
            };
            TuxActionSheet tuxActionSheet = c245319jz.LIZ;
            tuxActionSheet.LJLIL = onCancelListener;
            tuxActionSheet.LJLILLLLZI = new IDDListenerS147S0100000_8(c51323KCh, 0);
            c245319jz.LIZJ().show(c51323KCh.LJLJLLL.getSupportFragmentManager(), "SugFeedBackInBottom");
        }
        this.LIZ.notifyDataSetChanged();
    }
}

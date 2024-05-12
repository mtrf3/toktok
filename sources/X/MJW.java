package X;

import Y.ACListenerS29S0100000_9;
import android.widget.LinearLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.discover.model.suggest.TypeWords;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MJW extends MJU implements InterfaceC56594MJa {
    public final C62822Ol8 LIZLLL;
    public final C62822Ol8 LJ;
    public final C62822Ol8 LJFF;
    public final C62822Ol8 LJI;
    public TypeWords LJII;
    public boolean LJIIIIZZ;

    @Override // X.MJU
    public final void LIZJ() {
        this.LIZIZ = false;
        MJX LJIIIIZZ = LJIIIIZZ();
        if (LJIIIIZZ != null) {
            LJIIIIZZ.LIZ().removeCallbacks((Runnable) LJIIIIZZ.LJIIIIZZ.getValue());
        }
    }

    @Override // X.MJU
    public final void LIZLLL() {
        MJX LJIIIIZZ;
        this.LIZIZ = true;
        LinearLayout LJIIIZ = LJIIIZ();
        if (LJIIIZ != null && LJIIIZ.getVisibility() == 0 && (LJIIIIZZ = LJIIIIZZ()) != null) {
            MJX.LIZIZ(LJIIIIZZ);
        }
    }

    @Override // X.MJU
    public final void LJ() {
        LinearLayout LJIIIZ;
        this.LIZIZ = true;
        if (!this.LJIIIIZZ && (LJIIIZ = LJIIIZ()) != null && LJIIIZ.getVisibility() == 0) {
            MJX LJIIIIZZ = LJIIIIZZ();
            if (LJIIIIZZ != null) {
                MJX.LIZIZ(LJIIIIZZ);
                return;
            }
            return;
        }
        this.LJIIIIZZ = false;
    }

    @Override // X.MJU
    public final void LJFF() {
        this.LIZIZ = false;
        MJX LJIIIIZZ = LJIIIIZZ();
        if (LJIIIIZZ != null) {
            LJIIIIZZ.LIZ().removeCallbacks((Runnable) LJIIIIZZ.LJIIIIZZ.getValue());
        }
        this.LJIIIIZZ = true;
    }

    @Override // X.MJU
    public final void LJI() {
        this.LIZIZ = false;
        MJX LJIIIIZZ = LJIIIIZZ();
        if (LJIIIIZZ != null) {
            LJIIIIZZ.LIZ().removeCallbacks((Runnable) LJIIIIZZ.LJIIIIZZ.getValue());
        }
    }

    public final MJX LJIIIIZZ() {
        return (MJX) this.LJI.getValue();
    }

    public final LinearLayout LJIIIZ() {
        return (LinearLayout) this.LIZLLL.getValue();
    }

    public final void LJIIJ() {
        MJX LJIIIIZZ;
        if (this.LIZIZ && (LJIIIIZZ = LJIIIIZZ()) != null) {
            MJX.LIZIZ(LJIIIIZZ);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MJW(MJO param) {
        super(param);
        o.LJIIIZ(param, "param");
        this.LIZLLL = C221108m2.LIZIZ(new AqS159S0100000_9(param, 9));
        this.LJ = C221108m2.LIZIZ(new AqS159S0100000_9(this, 11));
        this.LJFF = C221108m2.LIZIZ(new AqS159S0100000_9(this, 10));
        this.LJI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 8));
        LinearLayout LJIIIZ = LJIIIZ();
        if (LJIIIZ != null) {
            C16880lQ.LJIIZILJ(LJIIIZ, new ACListenerS29S0100000_9(param, 3));
        }
        MJX LJIIIIZZ = LJIIIIZZ();
        if (LJIIIIZZ != null) {
            LJIIIIZZ.LIZJ = 3000L;
            ((ArrayList) LJIIIIZZ.LJII).add(this);
        }
    }

    @Override // X.InterfaceC56594MJa
    public final void LIZ(int i) {
        List<Word> list;
        String str;
        TypeWords typeWords = this.LJII;
        if (typeWords != null && (list = typeWords.words) != null) {
            String str2 = null;
            if (!list.isEmpty()) {
                int size = list.size();
                if (i < 0 || i >= size) {
                    i = 0;
                }
                MJY mjy = this.LIZ.LIZIZ;
                String id = ((Word) ListProtector.get(list, i)).getId();
                MJX LJIIIIZZ = LJIIIIZZ();
                if (LJIIIIZZ != null) {
                    str = LJIIIIZZ.LIZIZ;
                    if (str == null) {
                        str = "";
                    }
                } else {
                    str = null;
                }
                mjy.LIZJ(new Word(id, str));
                OSZ[] oszArr = new OSZ[6];
                oszArr[0] = new OSZ("search_bar_outer", "words_source");
                oszArr[1] = new OSZ("discovery", "search_position");
                oszArr[2] = new OSZ(Integer.valueOf(i), "words_position");
                oszArr[3] = new OSZ(((Word) ListProtector.get(list, i)).getWord(), "words_content");
                oszArr[4] = new OSZ(((Word) ListProtector.get(list, i)).getId(), "group_id");
                TypeWords typeWords2 = this.LJII;
                if (typeWords2 != null) {
                    str2 = typeWords2.logId;
                }
                oszArr[5] = new OSZ(str2, "impr_id");
                FMX.LJIILL("trending_words_show", oszArr);
            }
        }
    }

    @Override // X.MJU
    public final void LIZIZ(C50764Jw8<TypeWords> c50764Jw8) {
        List<Word> list;
        List<Word> list2;
        String str;
        TypeWords typeWords;
        if (c50764Jw8 != null && (typeWords = c50764Jw8.LIZIZ) != null) {
            list = typeWords.words;
        } else {
            list = null;
        }
        if (list == null || list.isEmpty()) {
            this.LIZJ = false;
            LJIIJ();
            return;
        }
        TypeWords typeWords2 = this.LJII;
        if (typeWords2 != null) {
            list2 = typeWords2.words;
        } else {
            list2 = null;
        }
        if (o.LJ(list, list2)) {
            this.LIZJ = false;
            this.LJII = c50764Jw8.LIZIZ;
            LJIIJ();
            return;
        }
        this.LIZJ = true;
        this.LJII = c50764Jw8.LIZIZ;
        ArrayList arrayList = new ArrayList();
        for (Word word : list) {
            TypeWords typeWords3 = c50764Jw8.LIZIZ;
            if (typeWords3 != null) {
                str = typeWords3.logId;
            } else {
                str = null;
            }
            word.setImplId(str);
            arrayList.add(word.getShowWord());
        }
        MJX LJIIIIZZ = LJIIIIZZ();
        if (LJIIIIZZ != null) {
            LJIIIIZZ.LIZLLL = arrayList;
            LJIIIIZZ.LJ = -1;
            if (this.LIZJ) {
                this.LIZ.LIZIZ.LIZ();
                LinearLayout LJIIIZ = LJIIIZ();
                if (LJIIIZ != null) {
                    LJIIIZ.setVisibility(0);
                }
            }
            if (this.LIZIZ) {
                MJX LJIIIIZZ2 = LJIIIIZZ();
                if (LJIIIIZZ2 != null) {
                    LJIIIIZZ2.LIZJ(0, false);
                    MJX.LIZIZ(LJIIIIZZ2);
                    return;
                }
                return;
            }
            MJX LJIIIIZZ3 = LJIIIIZZ();
            if (LJIIIIZZ3 == null || LJIIIIZZ3.LIZIZ != null) {
                return;
            }
            LJIIIIZZ3.LIZJ(0, false);
        }
    }

    @Override // X.MJU
    public final void LJII(boolean z) {
        LinearLayout LJIIIZ;
        this.LIZIZ = z;
        if (z && (LJIIIZ = LJIIIZ()) != null && LJIIIZ.getVisibility() == 0) {
            MJX LJIIIIZZ = LJIIIIZZ();
            if (LJIIIIZZ != null) {
                MJX.LIZIZ(LJIIIIZZ);
                return;
            }
            return;
        }
        MJX LJIIIIZZ2 = LJIIIIZZ();
        if (LJIIIIZZ2 == null) {
            return;
        }
        LJIIIIZZ2.LIZ().removeCallbacks((Runnable) LJIIIIZZ2.LJIIIIZZ.getValue());
    }
}

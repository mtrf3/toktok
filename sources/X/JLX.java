package X;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public abstract class JLX extends AbstractC029409q<RecyclerView.ViewHolder> implements InterfaceC49115JPj {
    public final RecyclerView LJLIL;
    public final List<? extends Aweme> LJLILLLLZI;
    public String LJLJI;

    @Override // X.JGU
    public void LJJJLZIJ() {
    }

    @Override // X.JR0
    public boolean LJLILLLLZI() {
        return true;
    }

    @Override // X.InterfaceC49115JPj
    public void contextPause() {
        int childCount;
        if (this.LJLIL.getLayoutManager() == null || (childCount = this.LJLIL.getChildCount()) <= 0) {
            return;
        }
        int i = 0;
        do {
            RecyclerView recyclerView = this.LJLIL;
            Object LJJJJJL = recyclerView.LJJJJJL(recyclerView.getChildAt(i));
            if (LJJJJJL instanceof InterfaceC48908JHk) {
                ((InterfaceC48908JHk) LJJJJJL).contextPause();
            }
            i++;
        } while (i < childCount);
    }

    @Override // X.InterfaceC49115JPj
    public final boolean isPlaying() {
        int childCount;
        if (this.LJLIL.getLayoutManager() == null || (childCount = this.LJLIL.getChildCount()) <= 0) {
            return false;
        }
        int i = 0;
        do {
            RecyclerView recyclerView = this.LJLIL;
            Object LJJJJJL = recyclerView.LJJJJJL(recyclerView.getChildAt(i));
            if ((LJJJJJL instanceof InterfaceC48908JHk) && ((InterfaceC49148JQq) LJJJJJL).isPlaying()) {
                return true;
            }
            i++;
        } while (i < childCount);
        return false;
    }

    @Override // X.InterfaceC49115JPj
    public void pauseAll() {
        int childCount;
        if (this.LJLIL.getLayoutManager() == null || (childCount = this.LJLIL.getChildCount()) <= 0) {
            return;
        }
        int i = 0;
        do {
            RecyclerView recyclerView = this.LJLIL;
            Object LJJJJJL = recyclerView.LJJJJJL(recyclerView.getChildAt(i));
            if (LJJJJJL instanceof InterfaceC48908JHk) {
                ((InterfaceC48908JHk) LJJJJJL).LLLLLJLJLL();
            }
            i++;
        } while (i < childCount);
    }

    public List<Aweme> LJLLLLLL() {
        return this.LJLILLLLZI;
    }

    public JLX(RecyclerView mRecyclerView) {
        o.LJIIIZ(mRecyclerView, "mRecyclerView");
        this.LJLIL = mRecyclerView;
        this.LJLILLLLZI = new ArrayList();
    }

    @Override // X.JGU
    public void LJLLL(Aweme aweme) {
        C15070iV<Integer, Integer> LIZJ;
        Integer num;
        String str;
        if (this.LJLIL.getLayoutManager() == null || (num = (LIZJ = C8DP.LIZJ(this.LJLIL)).LIZ) == null || LIZJ.LIZIZ == null) {
            return;
        }
        o.LJI(num);
        int intValue = num.intValue();
        Integer num2 = LIZJ.LIZIZ;
        o.LJI(num2);
        int intValue2 = num2.intValue();
        if (intValue > intValue2) {
            return;
        }
        while (true) {
            if (intValue >= 0 && intValue < LJLLLLLL().size()) {
                Aweme aweme2 = (Aweme) ListProtector.get(LJLLLLLL(), intValue);
                String str2 = null;
                if (aweme2.getAid() != null) {
                    String aid = aweme2.getAid();
                    if (aweme != null) {
                        str = aweme.getAid();
                    } else {
                        str = null;
                    }
                    if (!o.LJ(aid, str)) {
                        Object LJJIZ = this.LJLIL.LJJIZ(intValue);
                        if ((LJJIZ instanceof InterfaceC48908JHk) && !C46447IKt.LJLJLJ) {
                            ((InterfaceC48908JHk) LJJIZ).LLLLLJLJLL();
                        }
                    }
                }
                String aid2 = aweme2.getAid();
                if (aweme != null) {
                    str2 = aweme.getAid();
                }
                if (o.LJ(aid2, str2)) {
                    RecyclerView.ViewHolder LJJIZ2 = this.LJLIL.LJJIZ(intValue);
                    if (LJJIZ2 instanceof JKB) {
                        ((JKB) LJJIZ2).LJZ.setVisibility(8);
                    }
                }
            }
            if (intValue == intValue2) {
                return;
            } else {
                intValue++;
            }
        }
    }
}

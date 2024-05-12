package X;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.model.message.ChatMessage;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class CW5<T> implements InterfaceC64592gB {
    public final /* synthetic */ CW4 LJLIL;

    public CW5(CW4 cw4) {
        this.LJLIL = cw4;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        boolean z;
        List<? extends CQO<? extends CR6>> list;
        CRD crd;
        int size;
        List<? extends CQO<? extends CR6>> list2 = (List) obj;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        this.LJLIL.getCallback().LIZJ(list2);
        if (!this.LJLIL.LJLLILLLL.LJ.isEmpty()) {
            if (list2 instanceof ArrayList) {
                Iterator<OSZ<ChatMessage, ChatMessage>> it = this.LJLIL.LJLLILLLL.LJ.iterator();
                while (it.hasNext()) {
                    OSZ<ChatMessage, ChatMessage> next = it.next();
                    CW4 cw4 = this.LJLIL;
                    ChatMessage first = next.getFirst();
                    ChatMessage second = next.getSecond();
                    cw4.getClass();
                    CW4.LJJIFFI((ArrayList) list2, first, second);
                }
            }
            this.LJLIL.LJLLILLLL.LJ.clear();
        }
        this.LJLIL.LJLLILLLL.LIZ.addAll(list2);
        int size2 = this.LJLIL.LJLLILLLL.LIZ.size() - this.LJLIL.getMaxListSize();
        if (size2 > 0) {
            ArrayList<CQO<? extends CR6>> arrayList = this.LJLIL.LJLLILLLL.LIZ;
            arrayList.subList(0, size2).clear();
            z = true;
            list = arrayList;
        } else {
            z = false;
            list = list2;
        }
        CW4 cw42 = this.LJLIL;
        cw42.getClass();
        if (z) {
            try {
                cw42.LJLLILLLL.LIZIZ.clear();
            } catch (Throwable th) {
                C0NB.LIZLLL(th.getMessage());
                ((RecyclerView) cw42.LJIIZILJ(R.id.isn)).getRecycledViewPool().clear();
                try {
                    cw42.LJJII();
                    return;
                } catch (Throwable unused) {
                    return;
                }
            }
        }
        cw42.LJLLILLLL.LIZIZ.addAll(list);
        CW7 cw7 = cw42.LJLLILLLL;
        if (cw7.LIZIZ.isEmpty()) {
            crd = null;
        } else {
            crd = (CRD) ORZ.LLFF(cw42.LJLLILLLL.LIZIZ);
        }
        cw7.LIZJ = crd;
        try {
            cw42.LJJII();
            C31435CVj c31435CVj = cw42.LJLJLLL;
            if (c31435CVj != null) {
                c31435CVj.notifyDataSetChanged();
            }
        } catch (Exception unused2) {
            ((CW0) cw42.LJIIZILJ(R.id.isn)).getRecycledViewPool().clear();
            try {
                C31435CVj c31435CVj2 = cw42.LJLJLLL;
                if (c31435CVj2 != null) {
                    c31435CVj2.notifyDataSetChanged();
                }
            } catch (Throwable unused3) {
            }
        }
        CW7 cw72 = cw42.LJLLILLLL;
        int i = cw72.LIZLLL;
        cw72.LIZLLL = cw72.LIZIZ.size();
        if (cw42.getState() == 1 && i < cw42.LJLLILLLL.LIZLLL && ((CW0) cw42.LJIIZILJ(R.id.isn)).getMeasuredHeight() < C87277YNd.LJIIJJI(154)) {
            cw42.LJLJJL.LJFF();
        }
        cw42.LJJI(false);
        if (C79004UzY.LJJIFFI(cw42.LJLLILLLL.LIZIZ) || (size = cw42.LJLLILLLL.LIZIZ.size()) <= 0 || ((CW0) cw42.LJIIZILJ(R.id.isn)).canScrollVertically(1)) {
            return;
        }
        ((CW0) cw42.LJIIZILJ(R.id.isn)).LJLI(size - 1);
    }
}

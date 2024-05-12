package X;

import Y.IDCListenerS245S0100000_8;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS155S0200000_8;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;

/* renamed from: X.JPi, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC49114JPi extends AbstractC49120JPo implements InterfaceC49117JPl, JW1 {
    public final JGU LJLJJI;
    public Aweme LJLJJL;
    public String LJLJJLL;
    public String LJLJL;
    public List<? extends Aweme> LJLJLJ;
    public final C62822Ol8 LJLJLLL;
    public final C62822Ol8 LJLL;
    public final C62822Ol8 LJLLI;

    public boolean LJIILIIL() {
        return true;
    }

    @Override // X.InterfaceC48907JHj
    public final void LJIILL() {
    }

    @Override // X.InterfaceC49148JQq
    public final Boolean LLFFF() {
        return null;
    }

    @Override // X.InterfaceC49148JQq
    public final boolean LLIIII() {
        return true;
    }

    @Override // X.InterfaceC49148JQq
    public final View getDetectView() {
        return null;
    }

    @Override // X.InterfaceC49148JQq
    public final InterfaceC46334IGk getPreload() {
        return null;
    }

    @Override // X.InterfaceC49148JQq
    public final InterfaceC49137JQf getPriority() {
        return null;
    }

    @Override // X.InterfaceC48907JHj
    public final void pause() {
    }

    @Override // X.InterfaceC48907JHj
    public final void play() {
    }

    public final View LJIIIZ() {
        View view = this.LJLIL.itemView;
        o.LJIIIIZZ(view, "viewHolder.itemView");
        return view;
    }

    public final LinearLayoutManager LJIIJ() {
        return (LinearLayoutManager) this.LJLL.getValue();
    }

    public RecyclerView LJIIJJI() {
        return (RecyclerView) this.LJLJLLL.getValue();
    }

    public C49113JPh LJIIL() {
        return (C49113JPh) this.LJLLI.getValue();
    }

    @Override // X.InterfaceC48907JHj
    public final View LJJIJIL() {
        return LJIIL().LJLIL;
    }

    @Override // X.JR0
    public final boolean LJLILLLLZI() {
        return LJIIL().LJLILLLLZI();
    }

    @Override // X.InterfaceC48907JHj
    public final void LLLJIL() {
        LJIIL().LLLJIL();
    }

    @Override // X.InterfaceC48907JHj
    public final void LLLLLJLJLL() {
        LJIIL().LLLLLJLJLL();
    }

    @Override // X.InterfaceC49148JQq
    public final View LLLLZLLIL() {
        return C48905JHh.LIZ(this);
    }

    @Override // X.InterfaceC48907JHj
    public final void contextPause() {
        LJIIL().contextPause();
    }

    @Override // X.InterfaceC48907JHj
    public final void g9() {
        LJIIL().g9();
    }

    @Override // X.InterfaceC49148JQq
    public final boolean isPlaying() {
        return LJIIL().isPlaying();
    }

    @Override // X.InterfaceC49148JQq
    public final void LLLLLIL() {
        C48905JHh.LIZIZ(this);
    }

    public final void LJIILJJIL(List<? extends Aweme> list) {
        if (list != null && (!list.isEmpty())) {
            LJIIL().LJLL = (Aweme) ListProtector.get(list, 0);
        }
        this.LJLJLJ = list;
    }

    @Override // X.JW1
    public final void LJZ(String str) {
        this.LJLJL = str;
    }

    @QD3
    public void onVideoEvent(C50420Jqa event) {
        JPT jpt;
        Aweme aweme;
        int i;
        o.LJIIIZ(event, "event");
        if (C16330kX.LIZIZ(this.LJLIL.itemView) && (jpt = LJIIL().LJLLI) != null && jpt.L4() && event.LJLIL == 21) {
            LJIIIZ();
            C49621Jdh.LIZ(null);
            Object obj = event.LJLILLLLZI;
            if (!(obj instanceof Aweme) || (aweme = (Aweme) obj) == null || TextUtils.equals(JJG.LJLJLLL, aweme.getAid())) {
                return;
            }
            List<? extends Aweme> list = this.LJLJLJ;
            o.LJI(list);
            Iterator<? extends Aweme> it = list.iterator();
            int i2 = 0;
            while (true) {
                i = -1;
                if (!it.hasNext()) {
                    break;
                }
                Aweme awemeInList = it.next();
                o.LJIIIZ(awemeInList, "awemeInList");
                if (TextUtils.equals(awemeInList.getAid(), aweme.getAid())) {
                    if (i2 != -1) {
                        LJIIJ().LJFF(i2, 0);
                        return;
                    }
                } else {
                    i2++;
                }
            }
            if (this.LJLJJL == null) {
                return;
            }
            List<? extends Aweme> list2 = this.LJLJLJ;
            if (list2 != null) {
                Iterator<? extends Aweme> it2 = list2.iterator();
                int i3 = 0;
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Aweme awemeInList2 = it2.next();
                    Aweme aweme2 = this.LJLJJL;
                    o.LJI(aweme2);
                    o.LJIIIZ(awemeInList2, "awemeInList");
                    if (TextUtils.equals(awemeInList2.getAid(), aweme2.getAid())) {
                        i = i3;
                        break;
                    }
                    i3++;
                }
            } else {
                i = 0;
            }
            LJIIJ().LJFF(i, 0);
        }
    }

    @Override // X.InterfaceC49148JQq
    public final void x4(C49187JSd listener) {
        o.LJIIIZ(listener, "listener");
    }

    @Override // X.InterfaceC49148JQq
    public final void y(long j) {
        C48905JHh.LIZJ(this, j);
    }

    @Override // X.InterfaceC49148JQq
    public final void z8(C49187JSd listener) {
        o.LJIIIZ(listener, "listener");
    }

    public AbstractC49114JPi(JTI jti, JIB jib, JGU jgu) {
        super(jti);
        this.LJLJJI = jgu;
        this.LJLJLLL = C221108m2.LIZIZ(new AqS155S0200000_8(this, jti, 28));
        this.LJLL = C221108m2.LIZIZ(new AqS158S0100000_8(jti, 525));
        this.LJLLI = C221108m2.LIZIZ(new AqS155S0200000_8(this, jib, 29));
        jti.itemView.addOnAttachStateChangeListener(new IDCListenerS245S0100000_8(this, 15));
    }
}

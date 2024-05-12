package Y;

import X.ARI;
import X.C174046sK;
import X.C175436uZ;
import X.C175976vR;
import X.C26045AKb;
import X.C26227ARb;
import X.C2U8;
import X.C73W;
import X.EnumC177716yF;
import X.InterfaceC174316sl;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.comment.commentlist.CommentListFragment;
import com.ss.android.ugc.aweme.comment.event.PinNotice;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.zhiliaoapp.musically.R;

/* loaded from: classes4.dex */
public class AObserverS64S0300000_3 implements Observer {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                return;
            case 1:
                onChanged$1(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void onChanged$0(AObserverS64S0300000_3 aObserverS64S0300000_3, Object obj) {
        EnumC177716yF enumC177716yF = ((C175436uZ) obj).LIZ;
        if (enumC177716yF == EnumC177716yF.SUCCESS) {
            Comment LIZIZ = ((C175976vR) ((InterfaceC174316sl) aObserverS64S0300000_3.l0)).LIZIZ();
            LIZIZ.setAuthorPin(false);
            C73W c73w = (C73W) ((CommentListFragment) aObserverS64S0300000_3.l2).LLILZLL.LIZ();
            c73w.notifyItemChanged(c73w.LLD(1, LIZIZ.getCid()), 2);
            CommentListFragment commentListFragment = (CommentListFragment) aObserverS64S0300000_3.l2;
            commentListFragment.LLILZLL.LJLJLJ = null;
            C174046sK c174046sK = new C174046sK(10, commentListFragment.Am());
            c174046sK.LIZ(((CommentListFragment) aObserverS64S0300000_3.l2).hashCode());
            C2U8.LIZ(c174046sK);
            ((C175976vR) ((InterfaceC174316sl) aObserverS64S0300000_3.l0)).LJ(false);
            C26045AKb c26045AKb = new C26045AKb(((CommentListFragment) aObserverS64S0300000_3.l2).mo49getActivity());
            c26045AKb.LJIIIIZZ(R.string.dmf);
            c26045AKb.LJIIJ();
        } else if (enumC177716yF == EnumC177716yF.FAIL) {
            C26045AKb c26045AKb2 = new C26045AKb(((CommentListFragment) aObserverS64S0300000_3.l2).mo49getActivity());
            c26045AKb2.LJIIIIZZ(R.string.dmd);
            c26045AKb2.LJIIJ();
        }
        C175976vR c175976vR = (C175976vR) ((InterfaceC174316sl) aObserverS64S0300000_3.l0);
        c175976vR.LIZLLL().setDefaultLoadingText("");
        c175976vR.LIZLLL().setLoading(false);
        ((LiveData) aObserverS64S0300000_3.l1).removeObserver(aObserverS64S0300000_3);
    }

    public static final void onChanged$1(AObserverS64S0300000_3 aObserverS64S0300000_3, Object obj) {
        PinNotice pinNotice;
        C175436uZ c175436uZ = (C175436uZ) obj;
        EnumC177716yF enumC177716yF = c175436uZ.LIZ;
        if (enumC177716yF == EnumC177716yF.SUCCESS) {
            Comment comment = ((CommentListFragment) aObserverS64S0300000_3.l2).LLILZLL.LJLJLJ;
            if (comment != null) {
                comment.setAuthorPin(false);
                C73W c73w = (C73W) ((CommentListFragment) aObserverS64S0300000_3.l2).LLILZLL.LIZ();
                c73w.notifyItemChanged(c73w.LLD(1, comment.getCid()), 2);
            }
            Comment LIZIZ = ((C175976vR) ((InterfaceC174316sl) aObserverS64S0300000_3.l0)).LIZIZ();
            LIZIZ.setAuthorPin(true);
            CommentListFragment commentListFragment = (CommentListFragment) aObserverS64S0300000_3.l2;
            commentListFragment.LLILZLL.LJLJLJ = LIZIZ;
            C174046sK c174046sK = new C174046sK(10, commentListFragment.Am());
            c174046sK.LIZ(((CommentListFragment) aObserverS64S0300000_3.l2).hashCode());
            C2U8.LIZ(c174046sK);
            ((C175976vR) ((InterfaceC174316sl) aObserverS64S0300000_3.l0)).LJ(true);
            C26045AKb c26045AKb = new C26045AKb(((CommentListFragment) aObserverS64S0300000_3.l2).mo49getActivity());
            c26045AKb.LJIIIIZZ(R.string.dl1);
            c26045AKb.LJIIJ();
        } else if (enumC177716yF == EnumC177716yF.FAIL) {
            C26045AKb c26045AKb2 = new C26045AKb(((CommentListFragment) aObserverS64S0300000_3.l2).mo49getActivity());
            c26045AKb2.LJIIIIZZ(R.string.dku);
            c26045AKb2.LJIIJ();
        } else if (enumC177716yF == EnumC177716yF.LIMIT && (pinNotice = c175436uZ.LIZIZ) != null) {
            int i = pinNotice.type;
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        ARI ari = new ARI(((CommentListFragment) aObserverS64S0300000_3.l2).mo49getActivity());
                        ari.LJII(c175436uZ.LIZIZ.unpin, new AObjectS39S0201000_5(1, aObserverS64S0300000_3, (InterfaceC174316sl) aObserverS64S0300000_3.l0, 2));
                        ari.LJIIIZ(c175436uZ.LIZIZ.pin, new AObjectS121S0200000_3(aObserverS64S0300000_3, (InterfaceC174316sl) aObserverS64S0300000_3.l0, 5));
                        C26227ARb c26227ARb = new C26227ARb(((CommentListFragment) aObserverS64S0300000_3.l2).mo49getActivity());
                        c26227ARb.LIZIZ(c175436uZ.LIZIZ.body);
                        c26227ARb.LJIIL = ari;
                        c26227ARb.LJI().LIZLLL();
                        CommentListFragment commentListFragment2 = (CommentListFragment) aObserverS64S0300000_3.l2;
                        Comment LIZIZ2 = ((C175976vR) ((InterfaceC174316sl) aObserverS64S0300000_3.l0)).LIZIZ();
                        commentListFragment2.getClass();
                        CommentListFragment.Nn(LIZIZ2, "comment_restr_pin_opt_popup_show");
                    }
                } else {
                    C26045AKb c26045AKb3 = new C26045AKb(((CommentListFragment) aObserverS64S0300000_3.l2).mo49getActivity());
                    c26045AKb3.LJIIIZ(c175436uZ.LIZIZ.body);
                    c26045AKb3.LJIIJ();
                    CommentListFragment commentListFragment3 = (CommentListFragment) aObserverS64S0300000_3.l2;
                    Comment LIZIZ3 = ((C175976vR) ((InterfaceC174316sl) aObserverS64S0300000_3.l0)).LIZIZ();
                    commentListFragment3.getClass();
                    CommentListFragment.Nn(LIZIZ3, "comment_restr_pin_toast_show");
                }
            } else {
                ARI ari2 = new ARI(((CommentListFragment) aObserverS64S0300000_3.l2).mo49getActivity());
                ari2.LJI(R.string.p2, new AObjectS42S0201000_13(1, aObserverS64S0300000_3, (InterfaceC174316sl) aObserverS64S0300000_3.l0, 1));
                C26227ARb c26227ARb2 = new C26227ARb(((CommentListFragment) aObserverS64S0300000_3.l2).mo49getActivity());
                c26227ARb2.LIZIZ(c175436uZ.LIZIZ.body);
                c26227ARb2.LJIIL = ari2;
                c26227ARb2.LJI().LIZLLL();
                CommentListFragment commentListFragment4 = (CommentListFragment) aObserverS64S0300000_3.l2;
                Comment LIZIZ4 = ((C175976vR) ((InterfaceC174316sl) aObserverS64S0300000_3.l0)).LIZIZ();
                commentListFragment4.getClass();
                CommentListFragment.Nn(LIZIZ4, "comment_restr_pin_popup_show");
            }
        }
        C175976vR c175976vR = (C175976vR) ((InterfaceC174316sl) aObserverS64S0300000_3.l0);
        c175976vR.LIZLLL().setDefaultLoadingText("");
        c175976vR.LIZLLL().setLoading(false);
        ((LiveData) aObserverS64S0300000_3.l1).removeObserver(aObserverS64S0300000_3);
    }

    public AObserverS64S0300000_3(CommentListFragment commentListFragment, InterfaceC174316sl interfaceC174316sl, MutableLiveData mutableLiveData, int i) {
        this.$t = i;
        this.l2 = commentListFragment;
        this.l0 = interfaceC174316sl;
        this.l1 = mutableLiveData;
    }
}

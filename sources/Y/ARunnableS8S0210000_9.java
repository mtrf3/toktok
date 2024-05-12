package Y;

import X.C221018lt;
import X.C3L4;
import X.C3ML;
import X.C46728IVo;
import X.C47261Igj;
import X.C56204M4a;
import X.C56627MKh;
import X.C76800UCe;
import X.C82093Kb;
import X.EnumC94693nd;
import X.InterfaceC65784Pro;
import X.MH7;
import X.X1D;
import android.graphics.drawable.TransitionDrawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel;
import com.ss.android.ugc.aweme.inbox.InboxFragmentVM;
import com.ss.android.ugc.aweme.inbox.widget.multi.NoticeAndDMCombineWidget;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS156S0200000_9;

/* loaded from: classes10.dex */
public class ARunnableS8S0210000_9 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            case 5:
                run$5(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        RecyclerView recyclerView;
        C56204M4a.LJ("submitList-callback");
        int i = 0;
        if (this.z2 && ((NoticeAndDMCombineWidget) this.l0).LLD.getAndSet(false) && (recyclerView = ((NoticeAndDMCombineWidget) this.l0).LJIILLIIL().LJLJLJ) != null) {
            recyclerView.LJLI(0);
        }
        List list = (List) this.l1;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((C3ML) next).LJLJJL instanceof C3L4) {
                    if (next != null) {
                        ((NoticeAndDMCombineWidget) this.l0).LJIJ().onSubmitDMData();
                    }
                }
            }
        }
        NoticeAndDMCombineWidget noticeAndDMCombineWidget = (NoticeAndDMCombineWidget) this.l0;
        if (noticeAndDMCombineWidget.LJLLJ || noticeAndDMCombineWidget.LJLJLJ != EnumC94693nd.LOADING) {
            List list2 = (List) this.l1;
            if (list2 != null) {
                NoticeAndDMCombineWidget noticeAndDMCombineWidget2 = (NoticeAndDMCombineWidget) this.l0;
                int size = list2.size();
                if (!list2.isEmpty()) {
                    Iterator it2 = list2.iterator();
                    i = 0;
                    while (it2.hasNext()) {
                        if (((C3ML) it2.next()).LJLIL > 50 && (i = i + 1) < 0) {
                            C47261Igj.LJJJJIZL();
                            throw null;
                        }
                    }
                }
                noticeAndDMCombineWidget2.LLII = size - i;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("countExceptFixedPosition = ");
            LIZ.append(((NoticeAndDMCombineWidget) this.l0).LLII);
            C221018lt.LJFF("NoticeAndDMCombineWidget", X1D.LIZIZ(LIZ));
            if (((C82093Kb) ((NoticeAndDMCombineWidget) this.l0).LJLZ.getValue()).LJLILLLLZI) {
                NoticeAndDMCombineWidget noticeAndDMCombineWidget3 = (NoticeAndDMCombineWidget) this.l0;
                if (!noticeAndDMCombineWidget3.LL) {
                    noticeAndDMCombineWidget3.LL = true;
                    noticeAndDMCombineWidget3.LJIJI().post(new ARunnableS45S0100000_9((NoticeAndDMCombineWidget) this.l0, 66));
                    return;
                }
            }
            NoticeAndDMCombineWidget noticeAndDMCombineWidget4 = (NoticeAndDMCombineWidget) this.l0;
            noticeAndDMCombineWidget4.LJLLL.LJLJI.postValue(Integer.valueOf(noticeAndDMCombineWidget4.LLII));
            NoticeAndDMCombineWidget noticeAndDMCombineWidget5 = (NoticeAndDMCombineWidget) this.l0;
            InboxFragmentVM inboxFragmentVM = noticeAndDMCombineWidget5.LJLLL;
            C56627MKh c56627MKh = new C56627MKh(noticeAndDMCombineWidget5.LLII, null, 2);
            inboxFragmentVM.getClass();
            C56204M4a.LIZJ(new AqS156S0200000_9(inboxFragmentVM, c56627MKh, 76));
        }
    }

    public final void LIZ$1() {
        if (!((MH7) this.l0).LLFII) {
            return;
        }
        if (this.z2) {
            ((TransitionDrawable) this.l1).resetTransition();
            ((TransitionDrawable) this.l1).reverseTransition(1000);
        } else {
            ((TransitionDrawable) this.l1).resetTransition();
            ((TransitionDrawable) this.l1).startTransition(1000);
        }
        MH7 mh7 = (MH7) this.l0;
        mh7.LJLILLLLZI.postDelayed(new ARunnableS8S0210000_9((Object) mh7, (View) (!this.z2), (boolean) ((TransitionDrawable) this.l1), (InterfaceC65784Pro<C76800UCe>) 3), 1200L);
    }

    public static final void run$0(ARunnableS8S0210000_9 aRunnableS8S0210000_9) {
        FullFeedFragmentPanel fullFeedFragmentPanel = (FullFeedFragmentPanel) aRunnableS8S0210000_9.l0;
        List list = (List) aRunnableS8S0210000_9.l1;
        boolean z = !aRunnableS8S0210000_9.z2;
        C46728IVo.LIZ(list, z, z, fullFeedFragmentPanel.getSimKitSceneID(), fullFeedFragmentPanel.getEventType());
    }

    public static final void run$1(ARunnableS8S0210000_9 aRunnableS8S0210000_9) {
        FullFeedFragmentPanel fullFeedFragmentPanel = (FullFeedFragmentPanel) aRunnableS8S0210000_9.l0;
        List list = (List) aRunnableS8S0210000_9.l1;
        boolean z = !aRunnableS8S0210000_9.z2;
        C46728IVo.LIZ(list, z, z, fullFeedFragmentPanel.getSimKitSceneID(), fullFeedFragmentPanel.getEventType());
    }

    public static final void run$2(ARunnableS8S0210000_9 aRunnableS8S0210000_9) {
        boolean LIZ;
        try {
            aRunnableS8S0210000_9.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS8S0210000_9 aRunnableS8S0210000_9) {
        boolean LIZ;
        try {
            aRunnableS8S0210000_9.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS8S0210000_9 aRunnableS8S0210000_9) {
        boolean LIZ;
        try {
            ((NoticeAndDMCombineWidget) aRunnableS8S0210000_9.l0).LJJI((List) aRunnableS8S0210000_9.l1, aRunnableS8S0210000_9.z2);
            ((NoticeAndDMCombineWidget) aRunnableS8S0210000_9.l0).LLIIIL = null;
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$5(ARunnableS8S0210000_9 aRunnableS8S0210000_9) {
        boolean LIZ;
        int i;
        try {
            View view = (View) aRunnableS8S0210000_9.l0;
            if (aRunnableS8S0210000_9.z2) {
                i = 0;
            } else {
                i = 8;
            }
            view.setVisibility(i);
            InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) aRunnableS8S0210000_9.l1;
            if (interfaceC65784Pro != null) {
                interfaceC65784Pro.invoke();
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ARunnableS8S0210000_9(com.ss.android.ugc.aweme.inbox.widget.multi.NoticeAndDMCombineWidget r2, java.util.List r3, boolean r4, int r5) {
        /*
            r1 = this;
            r1.$t = r5
            switch(r5) {
                case 2: goto L10;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l0 = r2
            r0.l1 = r3
            r0.z2 = r4
        Lc:
            r0.<init>()
            return
        L10:
            r0 = r1
            r0.z2 = r4
            r0.l0 = r2
            r0.l1 = r3
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS8S0210000_9.<init>(com.ss.android.ugc.aweme.inbox.widget.multi.NoticeAndDMCombineWidget, java.util.List, boolean, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ARunnableS8S0210000_9(Object obj, View view, boolean z, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        this.$t = interfaceC65784Pro;
        this.l0 = obj;
        this.z2 = view;
        this.l1 = z;
    }
}

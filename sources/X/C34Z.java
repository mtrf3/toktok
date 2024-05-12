package X;

import Y.ARunnableS37S0100000_1;
import android.os.Handler;
import com.byted.cast.common.api.IResultListener;
import com.byted.cast.common.api.PlayerInfo;
import com.byted.cast.common.bean.DramaBean;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import kotlin.jvm.internal.o;

/* renamed from: X.34Z, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C34Z implements C34M, IResultListener {
    public long LJLIL;
    public final int LJLILLLLZI = 5000;
    public final Queue<C779234a> LJLJI = new LinkedList();
    public final String LJLJJI = "CastingPlayListSender";
    public final int LJLJJL = 2;
    public final int LJLJJLL = 3;
    public Aweme LJLJL;
    public List<? extends Aweme> LJLJLJ;
    public boolean LJLJLLL;
    public C779234a LJLL;
    public int LJLLI;
    public boolean LJLLILLLL;

    public final void LJ() {
        synchronized (this) {
            C71082qe c71082qe = C71042qa.LIZIZ;
            if (c71082qe == null) {
                return;
            }
            C70922qO.LIZ(this.LJLJJI, "maybeSendNextChunk");
            this.LJLIL = System.currentTimeMillis();
            if (!this.LJLJI.isEmpty()) {
                C779234a c779234a = (C779234a) ((LinkedList) this.LJLJI).poll();
                if (c779234a != null) {
                    if (this.LJLL != null) {
                        String str = this.LJLJJI;
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("Current Batch is not null! ");
                        LIZ.append(this.LJLL);
                        C70922qO.LIZ(str, X1D.LIZIZ(LIZ));
                    }
                    this.LJLL = c779234a;
                    DramaBean[] LIZ2 = C51558KLi.LIZ(c779234a.LJLIL);
                    if (LIZ2 != null && LIZ2.length != 0) {
                        c71082qe.LIZ.LIZJ(LIZ2, c779234a.LJLILLLLZI, this);
                    }
                }
            } else {
                C70922qO.LIZ(this.LJLJJI, "Queue is empty: Sending finished!");
                LIZJ();
            }
        }
    }

    public final void LIZJ() {
        ((LinkedList) this.LJLJI).clear();
        this.LJLLILLLL = false;
        this.LJLJLLL = false;
        this.LJLL = null;
        this.LJLLI = 0;
        this.LJLIL = 0L;
    }

    @Override // X.C34M
    public final void o5() {
        C70922qO.LIZ(this.LJLJJI, "onVideoPause");
    }

    @Override // com.byted.cast.common.api.IResultListener
    public final void onSuccess() {
        C71082qe c71082qe = C71042qa.LIZIZ;
        if (c71082qe == null) {
            return;
        }
        String str = this.LJLJJI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onSuccess: queue.size: ");
        LIZ.append(((LinkedList) this.LJLJI).size());
        C70922qO.LIZ(str, X1D.LIZIZ(LIZ));
        c71082qe.LIZJ.LJI(this);
        this.LJLL = null;
        this.LJLLI = 0;
        LJ();
    }

    @Override // X.C34M
    public final void s5() {
        C70922qO.LIZ(this.LJLJJI, "onVideoPlay");
        if (System.currentTimeMillis() - this.LJLIL > this.LJLILLLLZI) {
            LJ();
        }
    }

    public final List<C779234a> LIZIZ(List<? extends Aweme> list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = ORZ.LJLILLLLZI(list, this.LJLJJL).iterator();
        while (it.hasNext()) {
            arrayList.add(new C779234a((List) it.next(), ""));
        }
        return arrayList;
    }

    @Override // X.C34M
    public final void LJIL(String aid) {
        o.LJIIIZ(aid, "aid");
        synchronized (this) {
            C71082qe c71082qe = C71042qa.LIZIZ;
            if (c71082qe == null) {
                return;
            }
            String str = this.LJLJJI;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onChangeFeed: aid: ");
            LIZ.append(aid);
            C70922qO.LIZ(str, X1D.LIZIZ(LIZ));
            if (this.LJLJLLL) {
                return;
            }
            this.LJLJLLL = true;
            c71082qe.LIZJ.LJI(this);
            String str2 = this.LJLJJI;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onChangeFeed: aid: ");
            LIZ2.append(aid);
            LIZ2.append(", firstAweme: ");
            Aweme aweme = this.LJLJL;
            String str3 = null;
            if (aweme != null) {
                str3 = aweme.getAid();
            }
            LIZ2.append(str3);
            C70922qO.LIZ(str2, X1D.LIZIZ(LIZ2));
            List<? extends Aweme> list = this.LJLJLJ;
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (Aweme aweme2 : list) {
                    if (aweme2.getAid().equals(aid)) {
                        arrayList.add(aweme2);
                    }
                }
                if (!arrayList.isEmpty()) {
                    LJ();
                }
            }
        }
    }

    @Override // X.C34M
    public final void q5(boolean z) {
        String str = this.LJLJJI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onRepeat isRepeat: ");
        LIZ.append(z);
        C70922qO.LIZ(str, X1D.LIZIZ(LIZ));
    }

    @Override // X.C34M
    public final void v5(Aweme aweme) {
        String str;
        synchronized (this) {
            C71082qe c71082qe = C71042qa.LIZIZ;
            if (c71082qe == null) {
                return;
            }
            if (this.LJLJLLL) {
                return;
            }
            this.LJLJLLL = true;
            c71082qe.LIZJ.LJI(this);
            String str2 = this.LJLJJI;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onInitPlay: aid: ");
            String str3 = null;
            if (aweme == null) {
                str = null;
            } else {
                str = aweme.getAid();
            }
            LIZ.append(str);
            LIZ.append(", firstAweme: ");
            Aweme aweme2 = this.LJLJL;
            if (aweme2 != null) {
                str3 = aweme2.getAid();
            }
            LIZ.append(str3);
            C70922qO.LIZ(str2, X1D.LIZIZ(LIZ));
            Aweme aweme3 = this.LJLJL;
            if (aweme3 != null && aweme3.equals(aweme)) {
                new Handler().postDelayed(new ARunnableS37S0100000_1(this, 18), 500L);
            }
        }
    }

    public static OSZ LIZLLL(int i, List list) {
        boolean z;
        int i2 = 0;
        if (i >= 0 && i < list.size()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                Aweme aweme = (Aweme) obj;
                if (!C78688UuS.LJJJJJ(aweme)) {
                    if (i == i2) {
                        i = arrayList.size();
                    }
                } else {
                    arrayList.add(aweme);
                }
                i2 = i3;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        if (i >= arrayList.size()) {
            i = arrayList.size() - 1;
        }
        return new OSZ(arrayList, Integer.valueOf(i));
    }

    public final void LIZ(String str, List list) {
        List<C779234a> LJI;
        if (str.length() == 0) {
            LJI = LIZIZ(list);
        } else {
            LJI = LJI(str, list);
        }
        String str2 = this.LJLJJI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Appending list size: ");
        LIZ.append(list.size());
        LIZ.append(" starting beforeAwemeId: ");
        LIZ.append(str);
        C70922qO.LIZ(str2, X1D.LIZIZ(LIZ));
        Iterator<C779234a> it = LJI.iterator();
        while (it.hasNext()) {
            ((LinkedList) this.LJLJI).add(it.next());
        }
        if (!this.LJLLILLLL && (!this.LJLJI.isEmpty())) {
            this.LJLLILLLL = true;
            LJ();
        }
    }

    public final void LJFF(int i, List list) {
        List list2;
        PlayerInfo LIZIZ;
        C71082qe c71082qe = C71042qa.LIZIZ;
        if (c71082qe == null) {
            return;
        }
        LIZJ();
        this.LJLLILLLL = true;
        if (list.isEmpty()) {
            C70922qO.LIZ(this.LJLJJI, "Empty playlist");
            return;
        }
        if (i < 0 || i > list.size() - 1) {
            String str = this.LJLJJI;
            StringBuilder LJ = C7MY.LJ("Index: ", i, " is not within the bounds of the list size: ");
            LJ.append(list.size());
            C70922qO.LIZ(str, X1D.LIZIZ(LJ));
            return;
        }
        this.LJLJL = (Aweme) ListProtector.get(list, i);
        this.LJLJLJ = list;
        if (i > 0) {
            list2 = list.subList(0, i);
        } else {
            list2 = null;
        }
        String str2 = this.LJLJJI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("playing list size: ");
        LIZ.append(list.size());
        LIZ.append(" starting index: ");
        LIZ.append(i);
        C70922qO.LIZ(str2, X1D.LIZIZ(LIZ));
        List<C779234a> LIZIZ2 = LIZIZ(list.subList(i, list.size()));
        String aid = ((Aweme) ListProtector.get(list, i)).getAid();
        o.LJIIIIZZ(aid, "list[index].aid");
        ArrayList arrayList = (ArrayList) LJI(aid, list2);
        Iterator it = arrayList.iterator();
        ArrayList arrayList2 = (ArrayList) LIZIZ2;
        Iterator it2 = arrayList2.iterator();
        while (((LinkedList) this.LJLJI).size() < arrayList2.size() + arrayList.size()) {
            if (it2.hasNext()) {
                ((LinkedList) this.LJLJI).add(it2.next());
            }
            if (it.hasNext()) {
                ((LinkedList) this.LJLJI).add(it.next());
            }
        }
        C779234a c779234a = (C779234a) ((LinkedList) this.LJLJI).poll();
        if (c779234a != null && (LIZIZ = C51558KLi.LIZIZ(c779234a.LJLIL)) != null) {
            c71082qe.LIZJ.LIZ(this);
            c71082qe.LIZ.LJIIIZ(LIZIZ);
        }
    }

    public final List LJI(String str, List list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (List list2 : ORZ.LJLILLLLZI(ORZ.LLIILII(list), this.LJLJJL)) {
                arrayList.add(new C779234a(list2, str));
                str = ((Aweme) ListProtector.get(list2, 0)).getAid();
                o.LJIIIIZZ(str, "it[0].aid");
            }
        }
        return arrayList;
    }

    @Override // com.byted.cast.common.api.IResultListener
    public final void onFail(int i, String str) {
        C71082qe c71082qe = C71042qa.LIZIZ;
        if (c71082qe == null) {
            return;
        }
        String str2 = this.LJLJJI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onFail errCode: ");
        LIZ.append(i);
        LIZ.append(", errMsg: ");
        LIZ.append(str);
        C70922qO.LIZ(str2, X1D.LIZIZ(LIZ));
        c71082qe.LIZJ.LJI(this);
        String str3 = this.LJLJJI;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("retrying last batch. number of retries: ");
        int i2 = this.LJLLI + 1;
        this.LJLLI = i2;
        LIZ2.append(i2);
        C70922qO.LIZ(str3, X1D.LIZIZ(LIZ2));
        if (this.LJLLI > this.LJLJJLL) {
            this.LJLL = null;
            this.LJLLI = 0;
            LJ();
            return;
        }
        new Handler().postDelayed(new ARunnableS37S0100000_1(this, 17), 100L);
    }
}

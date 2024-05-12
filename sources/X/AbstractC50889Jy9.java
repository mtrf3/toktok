package X;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.music.model.MusicSearchHistory;
import com.ss.android.ugc.aweme.profile.model.User;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Jy9, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC50889Jy9 implements LEA {
    public int LJLIL = -1;
    public final Gson LJLILLLLZI = new Gson();
    public final IAccountService LJLJI;
    public List<Pair<String, List<MusicSearchHistory>>> LJLJJI;
    public List<MusicSearchHistory> LJLJJL;
    public List<WeakReference<InterfaceC50894JyE>> LJLJJLL;

    public abstract String LIZIZ();

    public abstract List<MusicSearchHistory> LIZJ();

    public abstract void LJI(String str);

    public final void LIZ() {
        String str;
        RBY LJFF = this.LJLJI.LJFF();
        if (LJFF.isLogin()) {
            str = LJFF.getCurUserId();
        } else {
            str = "FAKE_USER";
        }
        Iterator<Pair<String, List<MusicSearchHistory>>> it = this.LJLJJI.iterator();
        this.LJLJJL = new ArrayList();
        while (it.hasNext()) {
            Pair<String, List<MusicSearchHistory>> next = it.next();
            if (TextUtils.equals((CharSequence) next.first, str)) {
                ((ArrayList) this.LJLJJL).addAll((Collection) next.second);
                it.remove();
            }
        }
        ListProtector.add(this.LJLJJI, 0, new Pair(str, this.LJLJJL));
        if (this.LJLJJI.size() > 10) {
            ListProtector.remove(this.LJLJJI, r1.size() - 1);
        }
        LJII();
    }

    public final List<MusicSearchHistory> LIZLLL() {
        ArrayList arrayList = new ArrayList();
        List<MusicSearchHistory> list = this.LJLJJL;
        if (list != null && ((ArrayList) list).size() > 0) {
            arrayList.addAll(this.LJLJJL);
        }
        return arrayList;
    }

    public final void LJFF() {
        List<MusicSearchHistory> list = this.LJLJJL;
        List<WeakReference<InterfaceC50894JyE>> list2 = this.LJLJJLL;
        if (list2 != null) {
            Iterator it = ((ArrayList) list2).iterator();
            while (it.hasNext()) {
                Reference reference = (Reference) it.next();
                if (reference.get() != null) {
                    ((InterfaceC50894JyE) reference.get()).P5(list);
                }
            }
        }
    }

    public final void LJII() {
        try {
            LJI(this.LJLILLLLZI.LJIILLIIL(this.LJLJJI, new C50892JyC().getType()));
        } catch (Exception unused) {
        }
    }

    public AbstractC50889Jy9() {
        IAccountService LJIJ = AccountService.LJIJ();
        this.LJLJI = LJIJ;
        LJIJ.LJIILJJIL(this);
        this.LJLJJI = LJ();
        LIZ();
    }

    public final List<Pair<String, List<MusicSearchHistory>>> LJ() {
        try {
            String LIZIZ = LIZIZ();
            if (TextUtils.isEmpty(LIZIZ)) {
                List<MusicSearchHistory> LIZJ = LIZJ();
                C50890JyA.LJIIIIZZ();
                ArrayList arrayList = new ArrayList();
                this.LJLJJI = arrayList;
                arrayList.add(new Pair("FAKE_USER", LIZJ));
            } else {
                this.LJLJJI = (List) this.LJLILLLLZI.LJII(LIZIZ, new C50893JyD().getType());
            }
        } catch (Exception unused) {
        }
        if (this.LJLJJI == null) {
            this.LJLJJI = new ArrayList();
        }
        return this.LJLJJI;
    }

    @Override // X.LEA
    public final void onAccountResult(int i, boolean z, int i2, User user) {
        if (i != 2) {
            if (i == 1 || i == 3) {
                Iterator<Pair<String, List<MusicSearchHistory>>> it = this.LJLJJI.iterator();
                while (it.hasNext()) {
                    if (TextUtils.equals((CharSequence) it.next().first, "FAKE_USER")) {
                        it.remove();
                    }
                }
                LJII();
            } else {
                return;
            }
        }
        this.LJLJJI.clear();
        this.LJLJJI = LJ();
        LIZ();
    }
}

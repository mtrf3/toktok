package X;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.challenge.data.LocalHashTag;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.KLs, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51568KLs implements LEA {
    public static C51568KLs LJLJL;
    public final int LJLIL = 20;
    public final int LJLILLLLZI = 10;
    public final Gson LJLJI = new Gson();
    public final IAccountService LJLJJI;
    public List<Pair<String, List<LocalHashTag>>> LJLJJL;
    public List<LocalHashTag> LJLJJLL;

    public static C51568KLs LIZJ() {
        if (LJLJL == null) {
            synchronized (C51568KLs.class) {
                if (LJLJL == null) {
                    LJLJL = new C51568KLs();
                }
            }
        }
        return LJLJL;
    }

    public final void LIZ() {
        String str;
        Object obj;
        RBY LJFF = this.LJLJJI.LJFF();
        if (LJFF.isLogin()) {
            str = LJFF.getCurUserId();
        } else {
            str = "FAKE_USER";
        }
        Iterator<Pair<String, List<LocalHashTag>>> it = this.LJLJJL.iterator();
        this.LJLJJLL = new ArrayList();
        while (it.hasNext()) {
            Pair<String, List<LocalHashTag>> next = it.next();
            if (next != null && TextUtils.equals((CharSequence) next.first, str) && (obj = next.second) != null && ((List) obj).size() > 0) {
                ((ArrayList) this.LJLJJLL).addAll((Collection) next.second);
                it.remove();
            }
        }
        ListProtector.add(this.LJLJJL, 0, new Pair(str, this.LJLJJLL));
        if (this.LJLILLLLZI > 0 && this.LJLJJL.size() > this.LJLILLLLZI) {
            ListProtector.remove(this.LJLJJL, r1.size() - 1);
        }
        LIZLLL();
    }

    public final void LIZLLL() {
        try {
            C1A7.LJIIZILJ().LJFF("hash_tag_history", this.LJLJI.LJIILLIIL(this.LJLJJL, new C51570KLu().getType()));
        } catch (Exception unused) {
        }
    }

    public C51568KLs() {
        IAccountService LJIJ = AccountService.LJIJ();
        this.LJLJJI = LJIJ;
        LJIJ.LJIILJJIL(this);
        this.LJLJJL = LIZIZ();
        LIZ();
    }

    public final List<Pair<String, List<LocalHashTag>>> LIZIZ() {
        try {
            this.LJLJJL = (List) this.LJLJI.LJII(C1A7.LJIIZILJ().LIZIZ("hash_tag_history", ""), new C51571KLv().getType());
        } catch (Exception unused) {
        }
        if (this.LJLJJL == null) {
            this.LJLJJL = new ArrayList();
        }
        return this.LJLJJL;
    }

    @Override // X.LEA
    public final void onAccountResult(int i, boolean z, int i2, User user) {
        if (i != 2) {
            if (i == 1 || i == 3) {
                Iterator<Pair<String, List<LocalHashTag>>> it = this.LJLJJL.iterator();
                while (it.hasNext()) {
                    Pair<String, List<LocalHashTag>> next = it.next();
                    if (next != null && TextUtils.equals((CharSequence) next.first, "FAKE_USER")) {
                        it.remove();
                    }
                }
                LIZLLL();
            } else {
                return;
            }
        }
        this.LJLJJL.clear();
        this.LJLJJL = LIZIZ();
        LIZ();
    }
}

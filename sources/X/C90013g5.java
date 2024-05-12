package X;

import Y.AfS53S0100000_1;
import Y.IDuS313S0100000_1;
import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.qainvitation.service.IQAInvitationService;
import com.ss.android.ugc.aweme.qainvitation.service.QAInvitationService;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS132S0200000_1;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.3g5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C90013g5 extends ConstraintLayout {
    public String LJLIL;
    public String LJLILLLLZI;
    public long LJLJI;
    public long LJLJJI;
    public List<? extends User> LJLJJL;
    public final C73318Sq2 LJLJJLL;
    public final C89793fj LJLJL;
    public final IQAInvitationService LJLJLJ;
    public final C85513Xf LJLJLLL;
    public InterfaceC88472Yns<? super List<? extends IMUser>, C76800UCe> LJLL;
    public final C73306Spq LJLLI;
    public final java.util.Map<Integer, View> LJLLILLLL;

    public final View _$_findCachedViewById(int i) {
        java.util.Map<Integer, View> map = this.LJLLILLLL;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getParent().getParent() == null) {
            return;
        }
        Object parent = getParent().getParent();
        o.LJII(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        View findViewById = ((View) parent).findViewById(R.id.jw1);
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
    }

    public final C85513Xf getAdapter() {
        return this.LJLJLLL;
    }

    public final C73318Sq2 getCompositeDisposable() {
        return this.LJLJJLL;
    }

    public final String getEnterFrom() {
        return this.LJLILLLLZI;
    }

    public final String getEnterMethod() {
        return this.LJLIL;
    }

    public final InterfaceC88472Yns<List<? extends IMUser>, C76800UCe> getInvitedUsersObserver() {
        return this.LJLL;
    }

    public final IQAInvitationService getQaInviteService() {
        return this.LJLJLJ;
    }

    public final long getQuestionId() {
        return this.LJLJI;
    }

    public final long getQuestionUserId() {
        return this.LJLJJI;
    }

    public final List<User> getUsers() {
        return this.LJLJJL;
    }

    public final void LJJLJLI(boolean z) {
        if (z) {
            LJJLL(0);
        }
        C89793fj c89793fj = this.LJLJL;
        c89793fj.getClass();
        this.LJLJJLL.LIZ(AbstractC73672Svk.LJIIJ(new IDuS313S0100000_1(c89793fj, 2)).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new AfS53S0100000_1(this, 74)));
    }

    public final void LJJLL(int i) {
        C73305Spp c73305Spp;
        if (i != 0) {
            if (i == 2 && (c73305Spp = (C73305Spp) _$_findCachedViewById(R.id.keh)) != null) {
                c73305Spp.setStatus(this.LJLLI);
            }
        } else {
            C73305Spp c73305Spp2 = (C73305Spp) _$_findCachedViewById(R.id.keh);
            if (c73305Spp2 != null) {
                c73305Spp2.LJFF();
            }
        }
        View _$_findCachedViewById = _$_findCachedViewById(R.id.isf);
        if (_$_findCachedViewById != null) {
            _$_findCachedViewById.setVisibility(8);
        }
        C73305Spp c73305Spp3 = (C73305Spp) _$_findCachedViewById(R.id.keh);
        if (c73305Spp3 == null) {
            return;
        }
        c73305Spp3.setVisibility(0);
    }

    public final void setEnterFrom(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.LJLILLLLZI = str;
    }

    public final void setEnterMethod(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.LJLIL = str;
    }

    public final void setInvitedUsersObserver(InterfaceC88472Yns<? super List<? extends IMUser>, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(interfaceC88472Yns, "<set-?>");
        this.LJLL = interfaceC88472Yns;
    }

    public final void setQuestionId(long j) {
        this.LJLJI = j;
    }

    public final void setQuestionUserId(long j) {
        this.LJLJJI = j;
    }

    public final void setUsers(List<? extends User> list) {
        o.LJIIIZ(list, "<set-?>");
        this.LJLJJL = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C90013g5(String str, String str2, long j, long j2, List users, Context context) {
        super(context, null, 0);
        o.LJIIIZ(users, "users");
        o.LJIIIZ(context, "context");
        this.LJLLILLLL = new LinkedHashMap();
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = j;
        this.LJLJJI = j2;
        this.LJLJJL = users;
        C73318Sq2 c73318Sq2 = new C73318Sq2();
        this.LJLJJLL = c73318Sq2;
        C89793fj c89793fj = new C89793fj(c73318Sq2);
        this.LJLJL = c89793fj;
        IQAInvitationService LJI = QAInvitationService.LJI();
        o.LJIIIIZZ(LJI, "get().getService(IQAInvitationService::class.java)");
        this.LJLJLJ = LJI;
        C85513Xf c85513Xf = new C85513Xf(C61878OQg.INSTANCE);
        this.LJLJLLL = c85513Xf;
        this.LJLL = new AqS167S0100000_1(this, 374);
        C73306Spq c73306Spq = new C73306Spq();
        String string = context.getString(R.string.rf3);
        o.LJIIIIZZ(string, "context.getString(R.string.something_wrong)");
        c73306Spq.LJI = string;
        c73306Spq.LJII = new AqS132S0200000_1(context, this, 84);
        this.LJLLI = c73306Spq;
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.c_p, C16880lQ.LLZIL(context), this);
        o.LJIIIIZZ(LLLZIIL, "from(context)\n          …d_you_users_dialog, this)");
        List<IMUser> LJ = LJI.LJ(this.LJLJJL);
        getContext();
        ((RecyclerView) LLLZIIL.findViewById(R.id.isf)).setLayoutManager(new LinearLayoutManager());
        ((RecyclerView) LLLZIIL.findViewById(R.id.isf)).setHasFixedSize(true);
        ((RecyclerView) LLLZIIL.findViewById(R.id.isf)).setAdapter(c85513Xf);
        o.LJIIIZ(LJ, "<set-?>");
        c85513Xf.LJLIL = LJ;
        c85513Xf.notifyDataSetChanged();
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", this.LJLILLLLZI);
        c188727au.LJIIIZ("enter_method", this.LJLIL);
        c188727au.LJ(this.LJLJI, "question_id");
        c188727au.LJ(this.LJLJJI, "question_user_id");
        c188727au.LIZLLL(LJ.size(), "invitee_count");
        FMX.LJIIL("enter_qa_invited_you_users_panel", c188727au.LIZ);
        String enterMethod = this.LJLIL;
        String enterFrom = this.LJLILLLLZI;
        long j3 = this.LJLJI;
        long j4 = this.LJLJJI;
        o.LJIIIZ(enterMethod, "enterMethod");
        o.LJIIIZ(enterFrom, "enterFrom");
        c89793fj.LIZIZ = j3;
        c89793fj.LIZJ = j4;
        c89793fj.LIZLLL = LJ;
        LJJLJLI(true);
        c85513Xf.setLoadMoreListener(new AqS151S0100000_1(this, 951));
    }
}

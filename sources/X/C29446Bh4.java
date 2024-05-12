package X;

import android.content.Context;
import android.view.View;
import com.bytedance.android.live.base.model.user.User;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Bh4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29446Bh4 extends AbstractC29447Bh5 implements InterfaceC29493Bhp {
    public C47121t6 LJLJJL;
    public View LJLJJLL;
    public User LJLJL;
    public final boolean LJLJLJ;

    @Override // X.InterfaceC29493Bhp
    public final void LIZIZ(boolean z) {
    }

    @Override // X.AbstractC29482Bhe
    public final boolean LJFF() {
        return this.LJLJLJ;
    }

    public C29446Bh4(C29484Bhg c29484Bhg) {
        super(c29484Bhg);
        this.LJLJLJ = !c29484Bhg.LJ;
    }

    @Override // X.AbstractC29482Bhe
    public final View LIZLLL(Context context) {
        o.LJIIIZ(context, "context");
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.cyh, null, false);
        o.LJIIIIZZ(LLLLIILL, "from(context).inflate(R.…header_cell, null, false)");
        this.LJLJJLL = LLLLIILL;
        this.LJLJJL = (C47121t6) LLLLIILL.findViewById(R.id.mzt);
        View view = this.LJLJJLL;
        if (view != null) {
            return view;
        }
        o.LJIJI("contentView");
        throw null;
    }

    @Override // X.AbstractC29482Bhe
    public final C29463BhL LJIIIIZZ(User user) {
        C29463BhL c29463BhL;
        String LIZLLL = C05170If.LIZLLL(user);
        User user2 = this.LJLJL;
        if (user2 != null) {
            if (!o.LJ(LIZLLL, C05170If.LIZLLL(user2))) {
                C47121t6 c47121t6 = this.LJLJJL;
                if (c47121t6 != null) {
                    c47121t6.setText(LIZLLL);
                }
                c29463BhL = new C29463BhL(true, EnumC29515BiB.COVER_HEAD);
            } else {
                c29463BhL = new C29463BhL(false, EnumC29515BiB.COVER_HEAD);
            }
            this.LJLJL = user;
            return c29463BhL;
        }
        o.LJIJI("targetUser");
        throw null;
    }

    @Override // X.InterfaceC29493Bhp
    public final void LIZ(C45631qh scrollView, int i) {
        int i2;
        o.LJIIIZ(scrollView, "scrollView");
        View view = this.LJLJJLL;
        if (view != null) {
            Integer num = (Integer) this.LJLILLLLZI.kv0(C28416BDg.class);
            if (num != null) {
                i2 = num.intValue();
            } else {
                i2 = 0;
            }
            view.setAlpha(C15380j0.LJIJ(i - i2) / 36);
            if (view.getAlpha() > 0.0f) {
                C29306Beo.LJJLJLI(view);
                return;
            } else {
                C29306Beo.LJI(view);
                return;
            }
        }
        o.LJIJI("contentView");
        throw null;
    }

    @Override // X.AbstractC29447Bh5
    public final void LJIIJ(User user, boolean z) {
        o.LJIIIZ(user, "user");
        this.LJLJL = user;
        C47121t6 c47121t6 = this.LJLJJL;
        if (c47121t6 == null) {
            return;
        }
        c47121t6.setText(C05170If.LIZLLL(user));
    }
}

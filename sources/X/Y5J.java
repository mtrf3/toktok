package X;

import android.content.Context;
import android.view.View;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.message.proto.EcommerceEntrance;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class Y5J extends AbstractC29447Bh5 {
    public View LJLJJL;
    public User LJLJJLL;
    public final int LJLJL;

    @Override // X.AbstractC29482Bhe
    public final boolean LJFF() {
        if (this.LJLIL.LIZJ.LIZJ() || this.LJLIL.LIZJ.LJ() || this.LJLIL.LIZJ.LIZ.coHostEnable) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC29482Bhe
    public final int LJI() {
        return this.LJLJL;
    }

    public Y5J(C29484Bhg c29484Bhg) {
        super(c29484Bhg);
        this.LJLJL = C7MY.LIZIZ(20);
    }

    @Override // X.AbstractC29482Bhe
    public final View LIZLLL(Context context) {
        o.LJIIIZ(context, "context");
        View it = C16880lQ.LLLZIIL(R.layout.aqn, C16880lQ.LLZIL(context), null);
        o.LJIIIIZZ(it, "it");
        this.LJLJJL = it;
        return it;
    }

    @Override // X.AbstractC29482Bhe
    public final C29463BhL LJIIIIZZ(User user) {
        User user2 = this.LJLJJLL;
        if (user2 != null) {
            EcommerceEntrance ecommerceEntrance = user2.ecommerceEntrance;
            EcommerceEntrance ecommerceEntrance2 = user.ecommerceEntrance;
            C29463BhL c29463BhL = new C29463BhL(false, EnumC29515BiB.LIVE_SHOP);
            if (ecommerceEntrance != null) {
                if (ecommerceEntrance2 != null) {
                    if (ecommerceEntrance.entranceType == ecommerceEntrance2.entranceType) {
                        if (!o.LJ(ecommerceEntrance.schema, ecommerceEntrance2.schema)) {
                            View view = this.LJLJJL;
                            if (view != null) {
                                LJIIJJI(ecommerceEntrance2, view, user, false);
                                c29463BhL.LIZ = true;
                            } else {
                                o.LJIJI("view");
                                throw null;
                            }
                        }
                    } else {
                        View view2 = this.LJLJJL;
                        if (view2 != null) {
                            LJIIJJI(ecommerceEntrance2, view2, user, true);
                            c29463BhL.LIZ = true;
                        } else {
                            o.LJIJI("view");
                            throw null;
                        }
                    }
                } else {
                    View view3 = this.LJLJJL;
                    if (view3 != null) {
                        view3.setVisibility(8);
                        c29463BhL.LIZ = true;
                    } else {
                        o.LJIJI("view");
                        throw null;
                    }
                }
            } else if (ecommerceEntrance2 != null) {
                View view4 = this.LJLJJL;
                if (view4 != null) {
                    LJIIJJI(ecommerceEntrance2, view4, user, true);
                    c29463BhL.LIZ = true;
                } else {
                    o.LJIJI("view");
                    throw null;
                }
            }
            this.LJLJJLL = user;
            return c29463BhL;
        }
        o.LJIJI("targetUser");
        throw null;
    }

    @Override // X.AbstractC29447Bh5
    public final void LJIIJ(User user, boolean z) {
        o.LJIIIZ(user, "user");
        View view = this.LJLJJL;
        if (view != null) {
            view.setVisibility(8);
            this.LJLJJLL = user;
            EcommerceEntrance ecommerceEntrance = user.ecommerceEntrance;
            if (ecommerceEntrance == null) {
                return;
            }
            View view2 = this.LJLJJL;
            if (view2 != null) {
                LJIIJJI(ecommerceEntrance, view2, user, true);
                return;
            } else {
                o.LJIJI("view");
                throw null;
            }
        }
        o.LJIJI("view");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x02e9, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0146, code lost:
    
        if (r13 != null) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJJI(com.bytedance.android.livesdk.message.proto.EcommerceEntrance r37, android.view.View r38, com.bytedance.android.live.base.model.user.User r39, boolean r40) {
        /*
            Method dump skipped, instructions count: 1169
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Y5J.LJIIJJI(com.bytedance.android.livesdk.message.proto.EcommerceEntrance, android.view.View, com.bytedance.android.live.base.model.user.User, boolean):void");
    }
}

package X;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.livesetting.level.FansClubBadgeShowEnableSetting;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.BiN, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29527BiN extends AbstractC29447Bh5 {
    public RecyclerView LJLJJL;
    public C29525BiL LJLJJLL;
    public View LJLJL;
    public User LJLJLJ;
    public C29518BiE LJLJLLL;
    public boolean LJLL;
    public final int LJLLI;
    public final boolean LJLLILLLL;

    public final void LJIIJJI() {
        ArrayList arrayList;
        RecyclerView recyclerView = this.LJLJJL;
        if (recyclerView != null) {
            User user = this.LJLJLJ;
            if (user != null) {
                List<BadgeStruct> badgeList = user.getBadgeList();
                boolean z = true;
                if (badgeList != null) {
                    arrayList = new ArrayList();
                    for (BadgeStruct badgeStruct : badgeList) {
                        BadgeStruct badgeStruct2 = badgeStruct;
                        if (badgeStruct2.exhibitionType == 0 && badgeStruct2.combineBadgeStruct != null && (FansClubBadgeShowEnableSetting.INSTANCE.getValue() || badgeStruct2.badgeScene != 10)) {
                            arrayList.add(badgeStruct);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        z = false;
                    }
                } else {
                    arrayList = null;
                }
                if (!z) {
                    View view = this.LJLJL;
                    if (view != null) {
                        C29306Beo.LJJLJLI(view);
                        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
                        C29525BiL c29525BiL = new C29525BiL(arrayList, this.LJLJLLL);
                        this.LJLJJLL = c29525BiL;
                        recyclerView.setAdapter(c29525BiL);
                        recyclerView.LJII(new C29539BiZ(this), -1);
                        return;
                    }
                    o.LJIJI("contentView");
                    throw null;
                }
                View view2 = this.LJLJL;
                if (view2 != null) {
                    C29306Beo.LJI(view2);
                    return;
                } else {
                    o.LJIJI("contentView");
                    throw null;
                }
            }
            o.LJIJI("targetUser");
            throw null;
        }
    }

    @Override // X.AbstractC29482Bhe
    public final boolean LJFF() {
        return this.LJLLILLLL;
    }

    @Override // X.AbstractC29482Bhe
    public final int LJI() {
        return this.LJLLI;
    }

    public C29527BiN(C29484Bhg c29484Bhg) {
        super(c29484Bhg);
        this.LJLLI = C15380j0.LIZ(12.0f);
        this.LJLLILLLL = true;
    }

    @Override // X.AbstractC29482Bhe
    public final View LIZLLL(Context context) {
        o.LJIIIZ(context, "context");
        View LIZLLL = AnonymousClass030.LIZLLL(this.LJLIL.LIZ, R.layout.cye, null, false, "from(config.context).inf…_honor_cell, null, false)");
        this.LJLJL = LIZLLL;
        this.LJLJJL = (RecyclerView) LIZLLL.findViewById(R.id.isn);
        View view = this.LJLJL;
        if (view != null) {
            return view;
        }
        o.LJIJI("contentView");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x00b5, code lost:
    
        if (r7 != null) goto L41;
     */
    @Override // X.AbstractC29482Bhe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C29463BhL LJIIIIZZ(com.bytedance.android.live.base.model.user.User r13) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29527BiN.LJIIIIZZ(com.bytedance.android.live.base.model.user.User):X.BhL");
    }

    @Override // X.AbstractC29447Bh5
    public final void LJIIJ(User user, boolean z) {
        o.LJIIIZ(user, "user");
        this.LJLJLJ = user;
        if (!z) {
            C29484Bhg c29484Bhg = this.LJLIL;
            User user2 = this.LJLJLJ;
            if (user2 != null) {
                this.LJLJLLL = new C29518BiE(c29484Bhg, user2);
                LJIIJJI();
                this.LJLL = true;
                return;
            }
            o.LJIJI("targetUser");
            throw null;
        }
        View view = this.LJLJL;
        if (view != null) {
            C29306Beo.LJJLJLI(view);
        } else {
            o.LJIJI("contentView");
            throw null;
        }
    }
}

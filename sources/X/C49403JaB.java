package X;

import android.view.View;
import com.ss.android.ugc.aweme.search.pages.result.common.usercard.core.ui.SearchUserViewHolder;

/* renamed from: X.JaB, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49403JaB implements InterfaceC49431Jad {
    public final /* synthetic */ SearchUserViewHolder LIZ;

    @Override // X.InterfaceC49431Jad
    public final String LIZ() {
        C50469JrN searchVideoModel;
        C50651JuJ c50651JuJ = C50652JuK.Companion;
        View view = this.LIZ.itemView;
        c50651JuJ.getClass();
        C50650JuI LJI = C50651JuJ.LJI(view);
        if (LJI != null && (searchVideoModel = LJI.getSearchVideoModel()) != null) {
            return searchVideoModel.getGroupId();
        }
        return null;
    }

    @Override // X.InterfaceC49431Jad
    public final String LIZJ() {
        String searchId;
        C50651JuJ c50651JuJ = C50652JuK.Companion;
        View view = this.LIZ.itemView;
        c50651JuJ.getClass();
        C50321Joz LIZLLL = C50651JuJ.LIZLLL(view);
        if (LIZLLL == null || (searchId = LIZLLL.getSearchId()) == null) {
            return "";
        }
        return searchId;
    }

    @Override // X.InterfaceC49431Jad
    public final String LIZLLL() {
        return this.LIZ.g0();
    }

    public C49403JaB(SearchUserViewHolder searchUserViewHolder) {
        this.LIZ = searchUserViewHolder;
    }

    @Override // X.InterfaceC49431Jad
    public final void LIZIZ(java.util.Map map) {
        this.LIZ.V("8", "showcase_entrance", map, false, true);
    }

    @Override // X.InterfaceC49431Jad
    public final void LJ(java.util.Map map) {
        this.LIZ.p0("showcase_entrance", map, false);
    }
}

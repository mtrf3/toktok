package X;

import com.ss.android.ugc.aweme.relation.model.RecUser;
import kotlin.jvm.internal.o;

/* renamed from: X.Mmk, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57826Mmk extends AbstractC57829Mmn<RecUser> {
    public final RecUser LJLIL;
    public final C57846Mn4 LJLILLLLZI;
    public final RecUser LJLJI;
    public boolean LJLJJI;

    @Override // X.AbstractC57829Mmn
    public final int hashCode() {
        return this.LJLJI.getUid().hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RecUserItem(nickName: ");
        LIZ.append(this.LJLJI.getNickname());
        LIZ.append(", uid: ");
        LIZ.append(this.LJLJI.getUid());
        LIZ.append(",isRelated: ");
        LIZ.append(this.LJLJI.isRelatedRec());
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.AbstractC57829Mmn
    public final /* bridge */ /* synthetic */ RecUser LIZ() {
        return this.LJLIL;
    }

    @Override // X.AbstractC57829Mmn, X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        C57826Mmk c57826Mmk;
        RecUser recUser;
        if (!(interfaceC57784Mm4 instanceof C57826Mmk) || (c57826Mmk = (C57826Mmk) interfaceC57784Mm4) == null || (recUser = c57826Mmk.LJLJI) == null || !o.LJ(recUser.getUid(), this.LJLJI.getUid()) || recUser.getFollowStatus() != this.LJLJI.getFollowStatus() || !o.LJ(recUser.getMatchedFriendStruct(), this.LJLJI.getMatchedFriendStruct())) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC57829Mmn
    public final boolean equals(Object obj) {
        if (!(obj instanceof C57826Mmk)) {
            return false;
        }
        return areItemTheSame((InterfaceC57784Mm4) obj);
    }

    public C57826Mmk(RecUser recUser, C57846Mn4 uiConfig) {
        o.LJIIIZ(uiConfig, "uiConfig");
        this.LJLIL = recUser;
        this.LJLILLLLZI = uiConfig;
        this.LJLJI = recUser;
    }
}

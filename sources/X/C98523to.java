package X;

import com.ss.android.ugc.aweme.im.service.model.IMUser;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* renamed from: X.3to, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C98523to extends C99033ud {
    public String LLIIIL;
    public IMUser LLIIIZ;
    public Serializable LLIIJI;
    public AnonymousClass446 LLIIJLIL;
    public boolean LLIIL;
    public boolean LLIILII;
    public boolean LLIILZL;
    public String LLIIZ;

    @Override // X.C99033ud
    public String getSingleChatFromUserId() {
        IMUser iMUser = this.LLIIIZ;
        if (iMUser != null) {
            return iMUser.getUid();
        }
        return null;
    }

    public final Serializable getChatExt() {
        return this.LLIIJI;
    }

    public final IMUser getFromUser() {
        return this.LLIIIZ;
    }

    public final AnonymousClass446 getImAdLog() {
        return this.LLIIJLIL;
    }

    public final String getMobEnterFromForActivityStatusAccuracy() {
        return this.LLIIZ;
    }

    public final String getShareUserId() {
        return this.LLIIIL;
    }

    @Override // X.C99033ud
    public IMUser getSingleChatFromUser() {
        return this.LLIIIZ;
    }

    public final boolean isFiltered() {
        return this.LLIILZL;
    }

    public final boolean isRecommendedChat() {
        return this.LLIILII;
    }

    public final boolean isTCM() {
        return this.LLIIL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C98523to(String uuid) {
        super(uuid);
        o.LJIIIZ(uuid, "uuid");
        this.LLIIZ = "";
    }

    public final void setChatExt(Serializable serializable) {
        this.LLIIJI = serializable;
    }

    public final void setFiltered(boolean z) {
        this.LLIILZL = z;
    }

    public final void setFromUser(IMUser iMUser) {
        this.LLIIIZ = iMUser;
    }

    public final void setImAdLog(AnonymousClass446 anonymousClass446) {
        this.LLIIJLIL = anonymousClass446;
    }

    public final void setMobEnterFromForActivityStatusAccuracy(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.LLIIZ = str;
    }

    public final void setRecommendedChat(boolean z) {
        this.LLIILII = z;
    }

    public final void setShareUserId(String str) {
        this.LLIIIL = str;
    }

    public final void setTCM(boolean z) {
        this.LLIIL = z;
    }
}

package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import defpackage.q;
import java.util.Objects;
import kotlin.jvm.internal.o;

/* renamed from: X.MUa, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56880MUa extends MusNotice {
    public static final /* synthetic */ int LJI = 0;
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;

    @Override // com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.type), this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ, this.LJFF);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TutorialVideoNotice(msgId=");
        LIZ.append(this.LIZ);
        LIZ.append(", icon=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", title=");
        LIZ.append(this.LIZJ);
        LIZ.append(", desc=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", button=");
        LIZ.append(this.LJ);
        LIZ.append(", deepLink=");
        return q.LIZIZ(LIZ, this.LJFF, ')', LIZ);
    }

    @Override // com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C56880MUa)) {
            return false;
        }
        C56880MUa c56880MUa = (C56880MUa) obj;
        if (this.type == c56880MUa.type && o.LJ(this.LIZ, c56880MUa.LIZ) && o.LJ(this.LIZIZ, c56880MUa.LIZIZ) && o.LJ(this.LIZJ, c56880MUa.LIZJ) && o.LJ(this.LIZLLL, c56880MUa.LIZLLL) && o.LJ(this.LJ, c56880MUa.LJ) && o.LJ(this.LJFF, c56880MUa.LJFF)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C56880MUa(String msgId, String icon, String title, String desc, String button, String deepLink) {
        super(true);
        o.LJIIIZ(msgId, "msgId");
        o.LJIIIZ(icon, "icon");
        o.LJIIIZ(title, "title");
        o.LJIIIZ(desc, "desc");
        o.LJIIIZ(button, "button");
        o.LJIIIZ(deepLink, "deepLink");
        this.LIZ = msgId;
        this.LIZIZ = icon;
        this.LIZJ = title;
        this.LIZLLL = desc;
        this.LJ = button;
        this.LJFF = deepLink;
        this.type = 1000;
        this.nid = String.valueOf(hashCode());
    }
}

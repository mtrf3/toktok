package X;

import com.bytedance.android.live.base.model.ImageModel;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.17z, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C279917z extends AnonymousClass011 {
    public static final /* synthetic */ int LJIILLIIL = 0;
    public final AnonymousClass013 LJII;
    public final AnonymousClass013 LJIIIIZZ;
    public final AnonymousClass180 LJIIIZ;
    public final boolean LJIIJ;
    public final AnonymousClass010 LJIIJJI;
    public final boolean LJIIL;
    public final AnonymousClass017 LJIILIIL;
    public int LJIILJJIL;
    public final C62822Ol8 LJIILL;

    public final String LJFF() {
        String string = this.LJI.getString("panel", "normal");
        o.LJIIIIZZ(string, "extra.getString(FIELD_REPORT_PANEL, \"normal\")");
        return string;
    }

    public final List<ImageModel> LJI() {
        return (List) this.LJIILL.getValue();
    }

    public final boolean LJII() {
        if (this.LIZ == -1) {
            return true;
        }
        return false;
    }

    public final boolean LJIIIIZZ() {
        if (this.LIZ == -2) {
            return true;
        }
        return false;
    }

    @Override // X.AnonymousClass011
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LIZJ);
        LIZ.append(' ');
        LIZ.append(this.LJIIJJI);
        return X1D.LIZIZ(LIZ);
    }

    public final C279917z LIZIZ(AnonymousClass010 addStatus) {
        o.LJIIIZ(addStatus, "addStatus");
        AnonymousClass010 anonymousClass010 = this.LJIIJJI;
        if (addStatus == anonymousClass010) {
            return this;
        }
        if (addStatus == AnonymousClass010.ADDING && anonymousClass010 == AnonymousClass010.ADDED) {
            return this;
        }
        C279917z c279917z = new C279917z(this.LIZ, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LIZJ, this.LIZLLL, this.LJ, this.LJFF, this.LJIIJ, addStatus, this.LJIIL, this.LJIILIIL);
        c279917z.LJIILJJIL = this.LJIILJJIL;
        c279917z.LJI().addAll(LJI());
        return c279917z;
    }

    public final C279917z LIZJ(boolean z) {
        C279917z c279917z = new C279917z(this.LIZ, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LIZJ, this.LIZLLL, this.LJ, this.LJFF, z, this.LJIIJJI, this.LJIIL, this.LJIILIIL);
        c279917z.LJIILJJIL = this.LJIILJJIL;
        c279917z.LJI().addAll(LJI());
        return c279917z;
    }

    public final C279917z LIZLLL(AnonymousClass017 playStatus) {
        o.LJIIIZ(playStatus, "playStatus");
        C279917z c279917z = new C279917z(this.LIZ, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LIZJ, this.LIZLLL, this.LJ, this.LJFF, this.LJIIJ, this.LJIIJJI, this.LJIIL, playStatus);
        c279917z.LJIILJJIL = this.LJIILJJIL;
        c279917z.LJI().addAll(LJI());
        return c279917z;
    }

    public final C279917z LJ(boolean z) {
        C279917z c279917z = new C279917z(this.LIZ, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LIZJ, this.LIZLLL, this.LJ, this.LJFF, this.LJIIJ, this.LJIIJJI, z, this.LJIILIIL);
        c279917z.LJIILJJIL = this.LJIILJJIL;
        c279917z.LJI().addAll(LJI());
        return c279917z;
    }

    public final boolean equals(Object obj) {
        AnonymousClass011 anonymousClass011;
        if (obj instanceof C279917z) {
            anonymousClass011 = (AnonymousClass011) obj;
        } else {
            anonymousClass011 = null;
        }
        if (anonymousClass011 == null || this.LIZ != anonymousClass011.LIZ) {
            return false;
        }
        return true;
    }

    public /* synthetic */ C279917z(long j, AnonymousClass013 anonymousClass013, AnonymousClass013 anonymousClass0132, AnonymousClass180 anonymousClass180, String str, String str2, long j2, List list, boolean z, AnonymousClass010 anonymousClass010, boolean z2) {
        this(j, anonymousClass013, anonymousClass0132, anonymousClass180, str, str2, j2, list, z, anonymousClass010, z2, AnonymousClass017.IDLE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C279917z(long j, AnonymousClass013 originSongUrl, AnonymousClass013 instSongUrl, AnonymousClass180 lyricUrl, String songName, String singerStr, long j2, List<String> cover, boolean z, AnonymousClass010 addStatus, boolean z2, AnonymousClass017 playStatus) {
        super(j, originSongUrl, songName, singerStr, j2, cover);
        o.LJIIIZ(originSongUrl, "originSongUrl");
        o.LJIIIZ(instSongUrl, "instSongUrl");
        o.LJIIIZ(lyricUrl, "lyricUrl");
        o.LJIIIZ(songName, "songName");
        o.LJIIIZ(singerStr, "singerStr");
        o.LJIIIZ(cover, "cover");
        o.LJIIIZ(addStatus, "addStatus");
        o.LJIIIZ(playStatus, "playStatus");
        this.LJII = originSongUrl;
        this.LJIIIIZZ = instSongUrl;
        this.LJIIIZ = lyricUrl;
        this.LJIIJ = z;
        this.LJIIJJI = addStatus;
        this.LJIIL = z2;
        this.LJIILIIL = playStatus;
        this.LJIILL = C221108m2.LIZIZ(C45111pr.LJLIL);
    }
}

package X;

import android.content.Context;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import kotlin.jvm.internal.o;

/* renamed from: X.XSg, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84862XSg implements InterfaceC47084Ids {
    public final /* synthetic */ long LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ C84860XSe LJLJI;
    public final /* synthetic */ MusicModel LJLJJI;
    public final /* synthetic */ XTH LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ long LJLJL;
    public final /* synthetic */ boolean LJLJLJ;
    public final /* synthetic */ InterfaceC84870XSo LJLJLLL;

    @Override // X.InterfaceC47084Ids
    public final /* synthetic */ void LJIIJ(long j, long j2) {
    }

    @Override // X.InterfaceC47084Ids
    public final void LJIILJJIL(int i) {
        Context appContext = this.LJLJI.LJI;
        o.LJIIIIZZ(appContext, "appContext");
        C84860XSe c84860XSe = this.LJLJI;
        Integer valueOf = Integer.valueOf(i);
        String musicId = this.LJLJJI.getMusicId();
        o.LJIIIIZZ(musicId, "musicModel.musicId");
        C84860XSe c84860XSe2 = this.LJLJI;
        MusicModel musicModel = this.LJLJJI;
        c84860XSe2.getClass();
        c84860XSe.LJFF(valueOf, "simPlayerMusicFetcher onCopyError", "", 0, 0L, "", musicId, C84860XSe.LJ(musicModel), this.LJLJJI.isNeedSetCookie(), this.LJLJLJ);
        this.LJLJJL.LIZ(new XSX(-13, "reuse simplayer audition cache failed"));
    }

    @Override // X.InterfaceC47084Ids
    public final void LJIILIIL(boolean z, String str) {
        long j;
        long currentTimeMillis = System.currentTimeMillis();
        long j2 = this.LJLIL;
        if (j2 < 0) {
            j = -1;
        } else {
            j = currentTimeMillis - j2;
        }
        if (!C39579Fg7.LIZIZ(this.LJLILLLLZI)) {
            Context appContext = this.LJLJI.LJI;
            o.LJIIIIZZ(appContext, "appContext");
            C84860XSe c84860XSe = this.LJLJI;
            String musicId = this.LJLJJI.getMusicId();
            o.LJIIIIZZ(musicId, "musicModel.musicId");
            C84860XSe c84860XSe2 = this.LJLJI;
            MusicModel musicModel = this.LJLJJI;
            c84860XSe2.getClass();
            c84860XSe.LJFF(1063, "file not exist", "", 0, 0L, "", musicId, C84860XSe.LJ(musicModel), this.LJLJJI.isNeedSetCookie(), false);
            this.LJLJJL.LIZ(new XSX(-13, "reuse simplayer audition cache failed"));
            return;
        }
        C84860XSe c84860XSe3 = this.LJLJI;
        MusicModel musicModel2 = this.LJLJJI;
        String destPath = this.LJLILLLLZI;
        o.LJIIIIZZ(destPath, "destPath");
        c84860XSe3.LIZLLL(musicModel2, destPath, this.LJLJJLL, this.LJLJL, j, this.LJLJLJ, this.LJLJLLL, this.LJLJJL);
    }

    public C84862XSg(long j, long j2, XTH xth, C84860XSe c84860XSe, XTC xtc, MusicModel musicModel, String str, String str2, boolean z) {
        this.LJLIL = j;
        this.LJLILLLLZI = str;
        this.LJLJI = c84860XSe;
        this.LJLJJI = musicModel;
        this.LJLJJL = xth;
        this.LJLJJLL = str2;
        this.LJLJL = j2;
        this.LJLJLJ = z;
        this.LJLJLLL = xtc;
    }
}

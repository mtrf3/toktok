package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.download.component_api.DownloadServiceManager;
import com.ss.android.ugc.aweme.music.model.Music;
import kotlin.jvm.internal.o;

/* renamed from: X.ZvC, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91474ZvC<T> implements InterfaceC86003Zc {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ Music LJLJI;

    public C91474ZvC(int i, Music music, String str) {
        this.LJLIL = str;
        this.LJLILLLLZI = i;
        this.LJLJI = music;
    }

    @Override // X.InterfaceC86003Zc
    public final void subscribe(InterfaceC73573Su9<C91316Zse> interfaceC73573Su9) {
        String LIZIZ;
        String musicId = this.LJLIL;
        o.LJIIIIZZ(musicId, "musicId");
        int i = this.LJLILLLLZI;
        String lrcUrl = this.LJLJI.getLrcUrl();
        C91515Zvr c91515Zvr = new C91515Zvr(this.LJLILLLLZI, (C73433Srt) interfaceC73573Su9, this.LJLIL, this.LJLJI);
        if (TextUtils.isEmpty(musicId) || TextUtils.isEmpty(lrcUrl)) {
            c91515Zvr.onFailed(null, null);
        }
        String LIZ = C91318Zsg.LIZ();
        C37247Ejb.LIZIZ.getClass();
        C37246Eja.LIZIZ(LIZ);
        X5R with = DownloadServiceManager.INSTANCE.getDownloadService().with(lrcUrl);
        if (i != 2) {
            if (i != 3) {
                if (i != 10) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(musicId);
                    LIZ2.append(".txt");
                    LIZIZ = X1D.LIZIZ(LIZ2);
                } else {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append(musicId);
                    LIZ3.append(".json");
                    LIZIZ = X1D.LIZIZ(LIZ3);
                }
            } else {
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append(musicId);
                LIZ4.append(".krc");
                LIZIZ = X1D.LIZIZ(LIZ4);
            }
        } else {
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ5.append(musicId);
            LIZ5.append(".irc");
            LIZIZ = X1D.LIZIZ(LIZ5);
        }
        with.LIZJ = LIZIZ;
        with.LJ = LIZ;
        with.LJIIJ = "";
        with.LJIIL = c91515Zvr;
        with.LIZJ();
    }
}

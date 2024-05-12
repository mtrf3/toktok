package X;

import com.bytedance.ies.nle.editor_jni.LogLevel;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.HoX, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45197HoX implements InterfaceC84897XTp {
    public final /* synthetic */ AbstractC45196HoW LIZ;
    public final /* synthetic */ List<InterfaceC45209Hoj> LIZIZ;
    public final /* synthetic */ AVMusic LIZJ;

    @Override // X.InterfaceC84897XTp
    public final void onProgress(int i) {
    }

    @Override // X.InterfaceC84897XTp
    public final void onStart() {
    }

    @Override // X.InterfaceC84897XTp
    public final void LIZ(String musicFile, MusicWaveBean musicWaveBean) {
        o.LJIIIZ(musicFile, "musicFile");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LIZ.LJIIIZ());
        LIZ.append(" download music onSuccess: musicPath: ");
        LIZ.append(musicFile);
        C45049Hm9.LIZ(LogLevel.LEVEL_INFO, X1D.LIZIZ(LIZ));
        AbstractC45196HoW abstractC45196HoW = this.LIZ;
        C44716Hgm c44716Hgm = abstractC45196HoW.LJI;
        if (c44716Hgm != null) {
            c44716Hgm.LJFF = musicFile;
        }
        abstractC45196HoW.LJIIJJI = 1.0f;
        if (c44716Hgm != null && c44716Hgm.LIZJ()) {
            List<InterfaceC45209Hoj> list = this.LIZIZ;
            AbstractC45196HoW abstractC45196HoW2 = this.LIZ;
            Iterator<InterfaceC45209Hoj> it = list.iterator();
            while (it.hasNext()) {
                it.next().onProgress(abstractC45196HoW2.LIZLLL());
            }
        }
        List<InterfaceC45209Hoj> list2 = this.LIZIZ;
        AVMusic aVMusic = this.LIZJ;
        Iterator<InterfaceC45209Hoj> it2 = list2.iterator();
        while (it2.hasNext()) {
            it2.next().LIZLLL(aVMusic.getMusicId());
        }
        this.LIZ.LJIIL(this.LIZIZ);
    }

    @Override // X.InterfaceC84897XTp
    public final void LIZIZ(Integer num, String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LIZ.LJIIIZ());
        LIZ.append(" download music onFailed: code = ");
        LIZ.append(num);
        LIZ.append(", msg = ");
        C45243HpH.LIZIZ(LIZ, str, LIZ);
        AbstractC45196HoW.LJIIJ(this.LIZ, 1007, num, str, null, 8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C45197HoX(AbstractC45196HoW abstractC45196HoW, List<? extends InterfaceC45209Hoj> list, AVMusic aVMusic) {
        this.LIZ = abstractC45196HoW;
        this.LIZIZ = list;
        this.LIZJ = aVMusic;
    }
}

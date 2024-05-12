package X;

import android.provider.MediaStore;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Hy3, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45787Hy3<TTaskResult, TContinuationResult> implements C10I {
    public final /* synthetic */ InterfaceC45793Hy9 LIZ;
    public final /* synthetic */ C45774Hxq LIZIZ;
    public final /* synthetic */ int LIZJ;
    public final /* synthetic */ InterfaceC149485to LIZLLL;

    public C45787Hy3(C45789Hy5 c45789Hy5, C45774Hxq c45774Hxq, int i, InterfaceC149485to interfaceC149485to) {
        this.LIZ = c45789Hy5;
        this.LIZIZ = c45774Hxq;
        this.LIZJ = i;
        this.LIZLLL = interfaceC149485to;
    }

    @Override // X.C10I
    public final Object then(C10K<List<AVMusic>> c10k) {
        MusicBuzModel musicBuzModel;
        List<? extends AVMusic> LLJILJILJ;
        if (c10k == null || c10k.LJIIJJI() == null) {
            InterfaceC45793Hy9 interfaceC45793Hy9 = this.LIZ;
            if (interfaceC45793Hy9 != null) {
                interfaceC45793Hy9.onFailed(new Exception());
            }
        } else if (C77413UZt.LJIILL(c10k.LJIIJJI())) {
            InterfaceC45793Hy9 interfaceC45793Hy92 = this.LIZ;
            if (interfaceC45793Hy92 != null) {
                interfaceC45793Hy92.onFailed(new Exception());
            }
        } else {
            List<AVMusic> LJIIJJI = c10k.LJIIJJI();
            o.LJIIIIZZ(LJIIJJI, "task.result");
            List LLJILJILJ2 = ORZ.LLJILJILJ(LJIIJJI);
            ArrayList arrayList = (ArrayList) LLJILJILJ2;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C45771Hxn.LJII((AVMusic) it.next());
            }
            InterfaceC45793Hy9 interfaceC45793Hy93 = this.LIZ;
            if (interfaceC45793Hy93 != null) {
                C45774Hxq c45774Hxq = this.LIZIZ;
                int i = this.LIZJ;
                InterfaceC149485to interfaceC149485to = this.LIZLLL;
                c45774Hxq.getClass();
                if (interfaceC149485to != null) {
                    musicBuzModel = interfaceC149485to.LIZIZ();
                } else {
                    musicBuzModel = null;
                }
                AVMusic extractAVMusic = MusicBeanUtilKt.extractAVMusic(musicBuzModel);
                if (extractAVMusic == null) {
                    if (C77413UZt.LJIILL(LLJILJILJ2)) {
                        LLJILJILJ = null;
                    } else {
                        LLJILJILJ = ORZ.LLJILJILJ(C45774Hxq.LIZ(i, LLJILJILJ2));
                    }
                } else {
                    C45771Hxn.LJII(extractAVMusic);
                    if (C77413UZt.LJIILL(LLJILJILJ2)) {
                        LLJILJILJ = new ArrayList<>();
                    } else {
                        Iterator it2 = arrayList.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            AVMusic aVMusic = (AVMusic) it2.next();
                            if (aVMusic.getId() == extractAVMusic.getId()) {
                                arrayList.remove(aVMusic);
                                break;
                            }
                        }
                        LLJILJILJ = ORZ.LLJILJILJ(C45774Hxq.LIZ(i, LLJILJILJ2));
                    }
                    String str = extractAVMusic.path;
                    if (str != null && !str.startsWith(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI.toString()) && !str.startsWith(MediaStore.Images.Media.EXTERNAL_CONTENT_URI.toString()) && !str.startsWith(MediaStore.Video.Media.EXTERNAL_CONTENT_URI.toString())) {
                        ListProtector.add(LLJILJILJ, 0, extractAVMusic);
                    }
                }
                interfaceC45793Hy93.LIZ(LLJILJILJ);
            }
            C6BJ.LIZLLL(null, true);
        }
        return null;
    }
}

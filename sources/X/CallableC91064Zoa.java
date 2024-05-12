package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.dsp.playpage.pageitem.audioview.lyric.BaseLyricsViewModel;
import com.ss.android.ugc.aweme.music.model.Music;
import java.util.concurrent.Callable;

/* renamed from: X.Zoa, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class CallableC91064Zoa<V> implements Callable {
    public final /* synthetic */ BaseLyricsViewModel LJLIL;
    public final /* synthetic */ Music LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ int LJLJJI;

    public CallableC91064Zoa(int i, BaseLyricsViewModel baseLyricsViewModel, Music music, String str) {
        this.LJLIL = baseLyricsViewModel;
        this.LJLILLLLZI = music;
        this.LJLJI = str;
        this.LJLJJI = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        C91316Zse c91316Zse;
        Long l;
        String str;
        AbstractC73672Svk LJJIJIL;
        BaseLyricsViewModel baseLyricsViewModel = this.LJLIL;
        Music music = this.LJLILLLLZI;
        String str2 = this.LJLJI;
        int i = this.LJLJJI;
        baseLyricsViewModel.getClass();
        if (music == null || TextUtils.isEmpty(music.getMid()) || TextUtils.isEmpty(music.getLrcUrl())) {
            c91316Zse = new C91316Zse(0);
        } else {
            c91316Zse = C91318Zsg.LIZ.LIZIZ(music.getMid());
        }
        if (c91316Zse == null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("request  ->  mediaStructId is: ");
            LIZ.append(str2);
            LIZ.append(",  musicId is: ");
            Integer num = null;
            if (music != null) {
                l = Long.valueOf(music.getId());
            } else {
                l = null;
            }
            LIZ.append(l);
            LIZ.append(",  Lyric_url is: ");
            if (music != null) {
                str = music.getLrcUrl();
            } else {
                str = null;
            }
            LIZ.append(str);
            LIZ.append(",  Lyric_type is: ");
            if (music != null) {
                num = Integer.valueOf(music.getLrcType());
            }
            LIZ.append(num);
            LIZ.append(",  no lyrics in cache !!  to get from server");
            X1D.LIZIZ(LIZ);
            if (music == null || TextUtils.isEmpty(music.getMid()) || TextUtils.isEmpty(music.getLrcUrl())) {
                LJJIJIL = AbstractC73672Svk.LJJIJIL(new C91316Zse(0));
            } else {
                try {
                    String mid = music.getMid();
                    int lrcType = music.getLrcType();
                    java.util.Map<String, T0J<C91316Zse>> map = C91318Zsg.LIZIZ;
                    LJJIJIL = (T0J) map.get(mid);
                    if (LJJIJIL == null) {
                        LJJIJIL = T0J.LJJZZI();
                        map.put(mid, LJJIJIL);
                        AbstractC73672Svk.LJIIJ(new C91474ZvC(lrcType, music, mid)).LJJL(T16.LIZ()).LJIILLIIL(new C91475ZvD(mid)).LIZ(LJJIJIL);
                    }
                } catch (Throwable unused) {
                    LJJIJIL = AbstractC73672Svk.LJJIJIL(new C91316Zse(0));
                }
            }
            baseLyricsViewModel.LJLIL.LIZ(LJJIJIL.LJJJLIIL(new C91345Zt7(i, baseLyricsViewModel, music, str2), new C91346Zt8(i, baseLyricsViewModel, music, str2)));
        } else {
            baseLyricsViewModel.hv0(new C91075Zol(i, str2, baseLyricsViewModel.gv0(c91316Zse)), music);
        }
        return C76800UCe.LIZ;
    }
}

package X;

import com.zhiliaoapp.musically.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.jvm.internal.IDqS172S0200000;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.o;
import webcast.data.MusicSong;

/* renamed from: X.0hP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14390hP {
    public final InterfaceC14430hT LIZ;
    public final java.util.Set<MusicSong> LIZIZ;
    public final IV1 LIZJ;
    public final IDqS416S0100000 LIZLLL;

    public C14390hP(C1H7 downloadListener) {
        o.LJIIIZ(downloadListener, "downloadListener");
        this.LIZ = downloadListener;
        this.LIZIZ = new LinkedHashSet();
        IV1 LIZJ = InterfaceC30442Bx8.LLLFF.LIZJ();
        o.LJIIIIZZ(LIZJ, "LIVE_BGM_FILE_CACHE.value");
        IV1 iv1 = LIZJ;
        this.LIZJ = iv1;
        Iterator<Map.Entry<Long, String>> it = iv1.entrySet().iterator();
        while (it.hasNext()) {
            if (!new File(it.next().getValue()).exists()) {
                it.remove();
            }
        }
        InterfaceC30442Bx8.LLLFF.LIZ(this.LIZJ);
        this.LIZLLL = new IDqS416S0100000(this, 230);
    }

    public static C31824CeK LIZIZ(MusicSong musicSong) {
        Long l;
        String str;
        EnumC31874Cf8 enumC31874Cf8 = EnumC31874Cf8.MUSIC_BGM;
        if (musicSong != null) {
            l = Long.valueOf(musicSong.id);
        } else {
            l = null;
        }
        String valueOf = String.valueOf(l);
        if (musicSong == null || (str = musicSong.previewUrl) == null) {
            str = "";
        }
        return new C31824CeK(valueOf, enumC31874Cf8, null, null, str, null, true, 0, false, 876);
    }

    public final void LIZ(final MusicSong musicSong) {
        if (musicSong == null) {
            return;
        }
        String str = (String) this.LIZJ.get((Object) Long.valueOf(musicSong.id));
        if (str != null && C1B6.LIZIZ(str)) {
            this.LIZ.LIZIZ(musicSong, this.LIZLLL);
            return;
        }
        java.util.Set<MusicSong> set = this.LIZIZ;
        ArrayList arrayList = new ArrayList(C32I.LJJL(set, 10));
        Iterator<MusicSong> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(it.next().id));
        }
        if (arrayList.contains(Long.valueOf(musicSong.id))) {
            this.LIZ.LIZJ(musicSong);
            return;
        }
        final C31824CeK LIZIZ = LIZIZ(musicSong);
        if (LIZIZ.LJIIIZ.length() == 0) {
            C30868C9o.LIZJ(R.string.oug);
            this.LIZ.LIZ(musicSong);
        }
        AbstractC73672Svk.LJIIJ(new InterfaceC86003Zc() { // from class: X.1Tj
            @Override // X.InterfaceC86003Zc
            public final void subscribe(InterfaceC73573Su9<C76800UCe> interfaceC73573Su9) {
                C79258V8s.LIZ.LIZIZ(C31824CeK.this, new IDqS172S0200000(musicSong, this, 54));
            }
        }).LJJL(T16.LIZ()).LIZ(new C29355Bfb());
    }
}

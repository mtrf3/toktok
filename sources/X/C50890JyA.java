package X;

import android.text.TextUtils;
import com.bytedance.keva.KevaImpl;
import com.ss.android.ugc.aweme.music.model.MusicSearchHistory;
import com.ss.android.ugc.aweme.utils.JsonParseUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.JyA, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50890JyA extends AbstractC50889Jy9 {
    public static volatile C50890JyA LJLJL;

    public static C50890JyA LJIIIZ() {
        if (LJLJL == null) {
            synchronized (C50890JyA.class) {
                if (LJLJL == null) {
                    LJLJL = new C50890JyA();
                }
            }
        }
        return LJLJL;
    }

    public C50890JyA() {
        this.LJLIL = 10;
    }

    public static final void LJIIIIZZ() {
        long currentTimeMillis = System.currentTimeMillis();
        KevaImpl.getRepoFromSp(EF7.LIZIZ(), "music_sp", 0).erase("music_search_history");
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        C50840JxM c50840JxM = new C50840JxM();
        c50840JxM.LJIIZILJ("key", "music_search_history");
        c50840JxM.LJIIZILJ("operation", "delete");
        c50840JxM.LJIIZILJ("type", "keva");
        c50840JxM.LJJIII(currentTimeMillis2);
        c50840JxM.LJIILIIL();
    }

    @Override // X.AbstractC50889Jy9
    public final String LIZIZ() {
        long currentTimeMillis = System.currentTimeMillis();
        String LIZIZ = C50891JyB.LIZIZ("music_search_history_v2", "");
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        C50840JxM c50840JxM = new C50840JxM();
        c50840JxM.LJIIZILJ("key", "music_search_history_v2");
        c50840JxM.LJIIZILJ("operation", "get");
        c50840JxM.LJIIZILJ("type", "keva");
        c50840JxM.LJJIII(currentTimeMillis2);
        c50840JxM.LJIILIIL();
        return LIZIZ;
    }

    @Override // X.AbstractC50889Jy9
    public final List<MusicSearchHistory> LIZJ() {
        List<MusicSearchHistory> arrayList;
        long currentTimeMillis = System.currentTimeMillis();
        String string = KevaImpl.getRepoFromSp(EF7.LIZIZ(), "music_sp", 0).getString("music_search_history", "");
        if (!TextUtils.isEmpty(string)) {
            arrayList = JsonParseUtils.LIZIZ(MusicSearchHistory.class, string);
            o.LJIIIIZZ(arrayList, "parseArray(json, clazz)");
        } else {
            arrayList = new ArrayList<>();
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        C50840JxM c50840JxM = new C50840JxM();
        c50840JxM.LJIIZILJ("key", "music_search_history");
        c50840JxM.LJIIZILJ("operation", "get");
        c50840JxM.LJIIZILJ("type", "keva");
        c50840JxM.LJJIII(currentTimeMillis2);
        c50840JxM.LJIILIIL();
        return arrayList;
    }

    @Override // X.AbstractC50889Jy9
    public final void LJI(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        C50891JyB.LIZJ("music_search_history_v2", str);
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        C50840JxM c50840JxM = new C50840JxM();
        c50840JxM.LJIIZILJ("key", "music_search_history_v2");
        c50840JxM.LJIIZILJ("operation", "update");
        c50840JxM.LJIIZILJ("type", "keva");
        c50840JxM.LJJIII(currentTimeMillis2);
        c50840JxM.LJIILIIL();
    }
}

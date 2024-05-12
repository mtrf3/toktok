package X;

import com.ss.android.ugc.aweme.creative.model.SoundEffect;
import com.ss.android.ugc.gamora.editorpro.soundeffect.data.SoundEffectListApiResponse;
import com.ss.android.ugc.gamora.editorpro.soundeffect.model.SoundEffectTabModel;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.5gS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C141205gS {
    public final List<SoundEffectTabModel> LIZ = FII.LIZ();
    public final ConcurrentHashMap<String, SoundEffectListApiResponse> LIZIZ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, Boolean> LIZJ = new ConcurrentHashMap<>();
    public final HashSet<String> LIZLLL = new HashSet<>();
    public boolean LJ;

    public final void LIZ(int i, int i2, String pageId, ArrayList arrayList) {
        o.LJIIIZ(pageId, "pageId");
        if (this.LIZIZ.containsKey(pageId)) {
            SoundEffectListApiResponse soundEffectListApiResponse = this.LIZIZ.get(pageId);
            if (soundEffectListApiResponse != null) {
                ArrayList<SoundEffect> arrayList2 = soundEffectListApiResponse.list;
                if (arrayList2 != null) {
                    arrayList2.addAll(arrayList);
                }
                soundEffectListApiResponse.LJLIL = Integer.valueOf(i);
                soundEffectListApiResponse.hasMore = Integer.valueOf(i2);
                return;
            }
            return;
        }
        SoundEffectListApiResponse soundEffectListApiResponse2 = new SoundEffectListApiResponse();
        soundEffectListApiResponse2.LJLIL = Integer.valueOf(i);
        soundEffectListApiResponse2.list = arrayList;
        soundEffectListApiResponse2.hasMore = Integer.valueOf(i2);
        this.LIZIZ.put(pageId, soundEffectListApiResponse2);
    }
}

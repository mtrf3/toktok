package X;

import com.ss.android.ugc.gamora.editorpro.soundeffect.data.SoundEffectTabApi;
import com.ss.android.ugc.gamora.editorpro.soundeffect.data.SoundEffectTabApiResponse;
import kotlin.jvm.internal.o;

/* renamed from: X.5gX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C141255gX {
    public static SoundEffectTabApiResponse LIZ(boolean z) {
        int i;
        SoundEffectTabApi.Api api = (SoundEffectTabApi.Api) C169696lJ.LIZ(C60903NvH.LJIIJJI().getNetworkService(), true, SoundEffectTabApi.Api.class);
        if (z) {
            i = 14;
        } else {
            i = 13;
        }
        C48153Iv7 c48153Iv7 = new C48153Iv7();
        c48153Iv7.LIZLLL = 30000L;
        c48153Iv7.LIZJ = 30000L;
        c48153Iv7.LJ = 30000L;
        SoundEffectTabApiResponse soundEffectTabApiResponse = api.get(i, c48153Iv7).execute().LIZIZ;
        o.LJIIIIZZ(soundEffectTabApiResponse, "api.get(if (isCommerce) …      }).execute().body()");
        return soundEffectTabApiResponse;
    }
}

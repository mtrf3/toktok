package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.effectmanager.common.model.BaseNetResponse;
import com.ss.android.ugc.gamora.editorpro.soundeffect.data.SoundEffectCollectionApi;
import kotlin.jvm.internal.o;

/* renamed from: X.5gZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C141275gZ {
    public static BaseNetResponse LIZ(String str, boolean z) {
        String str2;
        SoundEffectCollectionApi.Api api = (SoundEffectCollectionApi.Api) C169696lJ.LIZ(C60903NvH.LJIIJJI().getNetworkService(), true, SoundEffectCollectionApi.Api.class);
        if (z) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        } else {
            str2 = "1";
        }
        C48153Iv7 c48153Iv7 = new C48153Iv7();
        c48153Iv7.LIZLLL = 30000L;
        c48153Iv7.LIZJ = 30000L;
        c48153Iv7.LJ = 30000L;
        BaseNetResponse baseNetResponse = api.get(str, str2, c48153Iv7).execute().LIZIZ;
        o.LJIIIIZZ(baseNetResponse, "api.get(soundId, if (isC…      }).execute().body()");
        return baseNetResponse;
    }
}

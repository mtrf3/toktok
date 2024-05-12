package com.ss.android.ugc.aweme.search.pages.choosemusic.result.core.communicate;

import X.C16880lQ;
import X.C2U8;
import X.C50345JpN;
import X.C50537JsT;
import X.C50538JsU;
import X.C78685UuP;
import X.F3T;
import X.InterfaceC37146Ehy;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.s;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class OpenMusicTrimMethod extends BaseBridgeMethod {
    public final String LJLIL;
    public final C50345JpN LJLILLLLZI;

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.InterfaceC38217EzF
    public final String getName() {
        return this.LJLIL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenMusicTrimMethod(F3T contextProviderFactory) {
        super(contextProviderFactory);
        o.LJIIIZ(contextProviderFactory, "contextProviderFactory");
        this.LJLIL = "searchMusicTrim";
        this.LJLILLLLZI = new C50345JpN(contextProviderFactory, "searchMusicTrim");
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void handle(JSONObject params, InterfaceC37146Ehy iReturn) {
        String str = "music";
        o.LJIIIZ(params, "params");
        o.LJIIIZ(iReturn, "iReturn");
        if (this.LJLILLLLZI.LIZ(params, iReturn)) {
            return;
        }
        try {
            String musicStr = params.optString("music");
            String rank = params.optString("rank");
            String type = params.optString("type");
            o.LJIIIIZZ(type, "type");
            if (!o.LJ(type, "music")) {
                if (o.LJ(type, "video")) {
                    str = "music_with_video";
                } else {
                    str = "";
                }
            }
            if (C78685UuP.LJJJZ(musicStr)) {
                o.LJIIIIZZ(musicStr, "musicStr");
                try {
                    Music music = (Music) GsonProtectorUtils.fromJson(GsonHolder.LIZLLL().LIZ(), musicStr, new C50538JsU().getType());
                    if (music != null) {
                        MusicModel musicModel = music.convertToMusicModel();
                        if (o.LJ(str, "music_with_video")) {
                            musicModel.setCardType(MusicModel.CardType.AWESearchMusicCardMusicWithVideo);
                        }
                        o.LJIIIIZZ(musicModel, "musicModel");
                        o.LJIIIIZZ(rank, "rank");
                        C2U8.LIZ(new C50537JsT(musicModel, rank, str));
                    }
                } catch (s e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
            iReturn.LIZJ(1, "", new JSONArray());
        } catch (Exception e2) {
            iReturn.LIZ(0, e2.getMessage());
            C16880lQ.LLLLIIL(e2);
        }
    }
}

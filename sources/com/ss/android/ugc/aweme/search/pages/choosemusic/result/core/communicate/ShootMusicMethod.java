package com.ss.android.ugc.aweme.search.pages.choosemusic.result.core.communicate;

import X.C16880lQ;
import X.C2U8;
import X.C50345JpN;
import X.C50466JrK;
import X.C50490Jri;
import X.EnumC50341JpJ;
import X.F3T;
import X.InterfaceC37146Ehy;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.s;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class ShootMusicMethod extends BaseBridgeMethod {
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
    public ShootMusicMethod(F3T contextProviderFactory) {
        super(contextProviderFactory);
        o.LJIIIZ(contextProviderFactory, "contextProviderFactory");
        this.LJLIL = "shootMusic";
        this.LJLILLLLZI = new C50345JpN(contextProviderFactory, "shootMusic", EnumC50341JpJ.STABLE);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void handle(JSONObject params, InterfaceC37146Ehy iReturn) {
        o.LJIIIZ(params, "params");
        o.LJIIIZ(iReturn, "iReturn");
        if (this.LJLILLLLZI.LIZ(params, iReturn)) {
            return;
        }
        try {
            String musicStr = params.optString("music", "");
            if (!TextUtils.isEmpty(musicStr)) {
                o.LJIIIIZZ(musicStr, "musicStr");
                try {
                    Music music = (Music) GsonProtectorUtils.fromJson(GsonHolder.LIZLLL().LIZ(), musicStr, new C50490Jri().getType());
                    if (music != null) {
                        C2U8.LIZ(new C50466JrK(music));
                    }
                } catch (s e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
            iReturn.onSuccess(new JSONArray());
        } catch (Exception e2) {
            iReturn.LIZ(0, e2.getMessage());
            C16880lQ.LLLLIIL(e2);
        }
    }
}

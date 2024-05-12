package com.ss.android.ugc.aweme.utils;

import X.C52535Kjb;
import X.C58096Mr6;
import X.Z9N;
import com.google.gson.Gson;
import com.google.gson.e;
import com.ss.android.ugc.aweme.favorites.agents.AwemeCollectionTypeAdapterFactory;
import com.ss.android.ugc.aweme.net.BaseResponseObjectTypeAdapterFactory;
import com.ss.android.ugc.aweme.net.CollectionTypeAdapterFactory;
import com.ss.android.ugc.aweme.net.ModelCheckerTypeAdapterFactory;
import com.ss.android.ugc.aweme.net.MusicTypeAdapterFactory;
import com.ss.android.ugc.aweme.net.UserTypeAdapterFactory;
import com.ss.android.ugc.aweme.sticker.model.BackgroundVideo;
import com.ss.android.ugc.aweme.typeadapter.BackgroundVideoDeserializer;

/* loaded from: classes12.dex */
public class GsonHolder implements GsonProvider {
    public final Gson LIZ;
    public final Gson LIZIZ;

    public static GsonProvider LIZLLL() {
        Object LIZ = C58096Mr6.LIZ(GsonProvider.class, false);
        if (LIZ != null) {
            return (GsonProvider) LIZ;
        }
        if (C58096Mr6.T7 == null) {
            synchronized (GsonProvider.class) {
                if (C58096Mr6.T7 == null) {
                    C58096Mr6.T7 = new GsonHolder();
                }
            }
        }
        return C58096Mr6.T7;
    }

    public GsonHolder() {
        e LIZJ = LIZJ();
        Z9N.LIZIZ.LJJLIIIJJIZ(LIZJ);
        Gson LIZ = LIZJ.LIZ();
        this.LIZ = LIZ;
        this.LIZIZ = LIZ;
    }

    public static e LIZJ() {
        e LIZ = JsonParseUtils.LIZ();
        LIZ.LIZJ(new ModelCheckerTypeAdapterFactory());
        LIZ.LIZJ(new CollectionTypeAdapterFactory());
        LIZ.LIZJ(new MusicTypeAdapterFactory());
        LIZ.LIZJ(new UserTypeAdapterFactory());
        LIZ.LIZIZ(new BackgroundVideoDeserializer(), BackgroundVideo.class);
        LIZ.LIZJ(new BaseResponseObjectTypeAdapterFactory());
        if (C52535Kjb.LIZ()) {
            LIZ.LIZJ(new AwemeCollectionTypeAdapterFactory());
        }
        return LIZ;
    }

    @Override // com.ss.android.ugc.aweme.utils.GsonProvider
    public final Gson LIZ() {
        return this.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.utils.GsonProvider
    public final Gson LIZIZ() {
        return this.LIZIZ;
    }
}

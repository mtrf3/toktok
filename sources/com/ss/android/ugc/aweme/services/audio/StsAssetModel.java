package com.ss.android.ugc.aweme.services.audio;

import X.F9E;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class StsAssetModel extends F9E {
    public final Effect effect;
    public final String songPath;
    public final List<List<Float>> warp;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StsAssetModel copy$default(StsAssetModel stsAssetModel, Effect effect, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            effect = stsAssetModel.effect;
        }
        if ((i & 2) != 0) {
            str = stsAssetModel.songPath;
        }
        if ((i & 4) != 0) {
            list = stsAssetModel.warp;
        }
        return stsAssetModel.copy(effect, str, list);
    }

    public final StsAssetModel copy(Effect effect, String songPath, List<? extends List<Float>> warp) {
        o.LJIIIZ(effect, "effect");
        o.LJIIIZ(songPath, "songPath");
        o.LJIIIZ(warp, "warp");
        return new StsAssetModel(effect, songPath, warp);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.effect, this.songPath, this.warp};
    }

    public final Effect getEffect() {
        return this.effect;
    }

    public final String getSongPath() {
        return this.songPath;
    }

    public final List<List<Float>> getWarp() {
        return this.warp;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StsAssetModel(Effect effect, String songPath, List<? extends List<Float>> warp) {
        o.LJIIIZ(effect, "effect");
        o.LJIIIZ(songPath, "songPath");
        o.LJIIIZ(warp, "warp");
        this.effect = effect;
        this.songPath = songPath;
        this.warp = warp;
    }
}

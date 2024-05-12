package com.ss.android.ugc.aweme.composer;

import X.C76800UCe;
import X.HIH;
import X.HIJ;
import X.InterfaceC88472Yns;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.composer.model.CreationConfigModelCompat;
import com.ss.android.ugc.aweme.composer.model.MusicShareStoryInputData;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class CreationComposerDsl extends CreationConfigModelCompat {
    public static final Parcelable.Creator<CreationComposerDsl> CREATOR = new HIH();

    @Override // com.ss.ugc.aweme.CreationConfigModel, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.composer.model.CreationConfigModelCompat, com.ss.ugc.aweme.CreationConfigModel, android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(1);
    }

    public final BasicModelDsl basic(InterfaceC88472Yns<? super BasicModelDsl, C76800UCe> init) {
        o.LJIIIZ(init, "init");
        BasicModelDsl basicModelDsl = new BasicModelDsl();
        init.invoke(basicModelDsl);
        setBasic(basicModelDsl);
        return basicModelDsl;
    }

    public final HIJ callback(InterfaceC88472Yns<? super HIJ, C76800UCe> init) {
        o.LJIIIZ(init, "init");
        HIJ hij = new HIJ(null, null, 3, null);
        init.invoke(hij);
        setCallback(hij);
        return hij;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final MusicShareStoryInputData musicShareStory(InterfaceC88472Yns<? super MusicShareStoryInputData, C76800UCe> init) {
        o.LJIIIZ(init, "init");
        MusicShareStoryInputData musicShareStoryInputData = new MusicShareStoryInputData(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
        init.invoke(musicShareStoryInputData);
        setMusicShareStoryData(musicShareStoryInputData);
        return musicShareStoryInputData;
    }
}

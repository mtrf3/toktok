package com.ss.android.ugc.aweme.composer;

import X.C76800UCe;
import X.HIE;
import X.InterfaceC88472Yns;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.ugc.aweme.creation.base.BasicModel;
import com.ss.ugc.aweme.creation.base.TrackModel;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class BasicModelDsl extends BasicModel {
    public static final Parcelable.Creator<BasicModelDsl> CREATOR = new HIE();

    /* JADX WARN: Multi-variable type inference failed */
    public BasicModelDsl() {
        super(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 2047, 0 == true ? 1 : 0);
    }

    @Override // com.ss.ugc.aweme.creation.base.BasicModel, android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(1);
    }

    public final TrackModel track(InterfaceC88472Yns<? super TrackModel, C76800UCe> init) {
        o.LJIIIZ(init, "init");
        TrackModel trackModel = new TrackModel(null, null, null, 7, null);
        init.invoke(trackModel);
        setTrack(trackModel);
        return trackModel;
    }
}

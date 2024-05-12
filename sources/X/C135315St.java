package X;

import Y.AObserverS63S0300000_2;
import Y.AObserverS66S0200000_2;
import Y.AObserverS70S0100000_2;
import android.content.Context;
import android.view.SurfaceView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.ugc.aweme.creative.model.stickers.StickerNewEngineModel;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.o;

/* renamed from: X.5St, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C135315St extends C138635cJ {
    public NLEModel LJIIZILJ;
    public String LJIJ;

    public C135315St(int i) {
        super(i);
    }

    @Override // X.C138635cJ
    public final void LIZ(Context context, LifecycleOwner owner, SurfaceView surfaceView, VideoPublishEditModel model) {
        o.LJIIIZ(owner, "owner");
        o.LJIIIZ(model, "model");
        this.LIZ = context;
        this.LIZIZ = owner;
        this.LIZJ = surfaceView;
        this.LIZLLL.observe(owner, new AObserverS63S0300000_2(this, owner, model, 0));
        MutableLiveData mutableLiveData = this.LJ;
        if (mutableLiveData != null) {
            mutableLiveData.observe(this.LIZIZ, new AObserverS70S0100000_2(this, 0));
        }
        MutableLiveData<InfoStickerModel> mutableLiveData2 = this.LJFF;
        if (mutableLiveData2 != null) {
            mutableLiveData2.observe(this.LIZIZ, new AObserverS70S0100000_2(this, 1));
        }
        MutableLiveData<InfoStickerModel> mutableLiveData3 = this.LJI;
        if (mutableLiveData3 != null) {
            mutableLiveData3.observe(this.LIZIZ, new AObserverS66S0200000_2(this, model, 3));
        }
        MutableLiveData<StickerNewEngineModel> mutableLiveData4 = this.LJII;
        if (mutableLiveData4 != null) {
            mutableLiveData4.observe(this.LIZIZ, new AObserverS66S0200000_2(this, model, 1));
        }
    }
}

package com.ss.android.ugc.aweme.shortvideo.audio.copyright;

import X.AbstractC156986Ec;
import X.AbstractC157016Ef;
import X.AbstractC42152GgW;
import X.C156976Eb;
import X.C42150GgU;
import X.C6EG;
import X.C76800UCe;
import X.InterfaceC117164im;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.ugc.aweme.audio.copyrightdetect.PreCheckResult;
import com.ss.android.ugc.aweme.shortvideo.audio.copyright.AudioCopyrightProcessObserver;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS149S0200000_2;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS34S0301000_2;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class AudioCopyrightProcessObserver extends AbstractC42152GgW<C76800UCe> implements GenericLifecycleObserver {
    public final VideoPublishEditModel LJLJJI;
    public final LifecycleOwner LJLJJL;
    public final AbstractC156986Ec LJLJJLL;
    public C156976Eb LJLJL;

    @Override // X.AbstractC42152GgW
    public final String LIZJ() {
        return "Audio Copyright Check";
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_CREATE) {
            onCreate();
            return;
        }
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        } else if (event == Lifecycle.Event.ON_RESUME) {
            onResume();
        } else if (event == Lifecycle.Event.ON_PAUSE) {
            onPause();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.6Eb] */
    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public final void onCreate() {
        if (this.LJLJL == null) {
            this.LJLJL = new InterfaceC117164im() { // from class: X.6Eb
                @Override // X.InterfaceC117164im
                public final void LIZ(int i, int i2, int i3, java.util.Map map) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("audioCopyrightDetectInPublish -> AudioCopyrightDetect result: result = ");
                    LIZ.append(i);
                    LIZ.append(", code = ");
                    LIZ.append(i2);
                    H7B.LIZ(X1D.LIZIZ(LIZ));
                    AbstractC156986Ec abstractC156986Ec = AudioCopyrightProcessObserver.this.LJLJJLL;
                    int LJJIIZ = C78555UsJ.LJJIIZ(null, abstractC156986Ec.LIZIZ());
                    StringBuilder LIZ2 = X1D.LIZ();
                    C0EH.LIZLLL(LIZ2, abstractC156986Ec.LIZ, " -> AudioCopyrightDetect -> materialHash = ", i3, ", model.materialHash() = ");
                    LIZ2.append(LJJIIZ);
                    H78.LIZ(X1D.LIZIZ(LIZ2));
                    AbstractC157016Ef LIZ3 = abstractC156986Ec.LIZ();
                    if (LIZ3 == null || i3 != LJJIIZ) {
                        return;
                    }
                    int LIZ4 = LIZ3.LIZ();
                    if (i == 1) {
                        C6QQ.LIZ(new AqS152S0100000_2(abstractC156986Ec, 760));
                    }
                    if (i2 != 102) {
                        if (i2 != 103) {
                            return;
                        }
                        StringBuilder LIZ5 = X1D.LIZ();
                        LIZ5.append(abstractC156986Ec.LIZ);
                        LIZ5.append(" -> AudioCopyrightDetect -> CODE_DETECT_COMPLETE");
                        H78.LIZ(X1D.LIZIZ(LIZ5));
                        C6QQ.LIZ(new AqS34S0301000_2(abstractC156986Ec, (AbstractC156986Ec) map, (java.util.Map<Integer, PreCheckResult>) LIZ4, (int) LIZ3, (AbstractC157016Ef) 2));
                        return;
                    }
                    C6QQ.LIZ(new AqS149S0200000_2(LIZ3, abstractC156986Ec, 80));
                }
            };
            String creationId = this.LJLJJI.getCreationId();
            o.LJIIIIZZ(creationId, "mModel.creationId");
            C156976Eb c156976Eb = this.LJLJL;
            o.LJI(c156976Eb);
            C6EG.LIZLLL(creationId, c156976Eb);
        }
        this.LJLJJLL.LJFF(this.LJLJJI.creativeModel.audioCopyrightDetectModel.getDetectResults());
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        if (this.LJLJL == null) {
            return;
        }
        String creationId = this.LJLJJI.getCreationId();
        o.LJIIIIZZ(creationId, "mModel.creationId");
        C156976Eb c156976Eb = this.LJLJL;
        o.LJI(c156976Eb);
        List list = (List) ((LinkedHashMap) C6EG.LIZIZ).get(creationId);
        if (list != null) {
            list.remove(c156976Eb);
        }
        this.LJLJL = null;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void onPause() {
        Iterator it = this.LJLJJLL.LIZJ().iterator();
        while (it.hasNext()) {
            ((AbstractC157016Ef) it.next()).LJFF = false;
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        Iterator it = this.LJLJJLL.LIZJ().iterator();
        while (it.hasNext()) {
            ((AbstractC157016Ef) it.next()).LJFF = true;
        }
        AbstractC157016Ef LIZ = this.LJLJJLL.LIZ();
        if (LIZ != null) {
            LIZ.LJI();
        }
    }

    @Override // X.AbstractC42152GgW
    public final void LIZ(C42150GgU nextStep) {
        MutableLiveData<Integer> mutableLiveData;
        Integer value;
        o.LJIIIZ(nextStep, "nextStep");
        AbstractC157016Ef LIZ = this.LJLJJLL.LIZ();
        if (LIZ == null || (mutableLiveData = LIZ.LJ) == null || (value = mutableLiveData.getValue()) == null || value.intValue() != 102) {
            nextStep.LIZIZ(this);
            return;
        }
        AbstractC156986Ec abstractC156986Ec = this.LJLJJLL;
        abstractC156986Ec.getClass();
        AbstractC157016Ef LIZ2 = abstractC156986Ec.LIZ();
        if (LIZ2 != null) {
            LIZ2.LIZLLL(nextStep, this);
        }
    }

    public AudioCopyrightProcessObserver(VideoPublishEditModel mModel, LifecycleOwner lifecycleOwner, AbstractC156986Ec publishAudioCopyrightHandler) {
        o.LJIIIZ(mModel, "mModel");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(publishAudioCopyrightHandler, "publishAudioCopyrightHandler");
        this.LJLJJI = mModel;
        this.LJLJJL = lifecycleOwner;
        this.LJLJJLL = publishAudioCopyrightHandler;
        lifecycleOwner.getLifecycle().addObserver(this);
    }
}

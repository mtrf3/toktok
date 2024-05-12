package X;

import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import kotlin.jvm.internal.o;

/* renamed from: X.TbR, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74961TbR {
    public final MutableLiveData<Boolean> LIZ;
    public final MutableLiveData<Boolean> LIZIZ;
    public boolean LIZJ;
    public int LIZLLL;
    public LiveEffect LJ;
    public C0TV LJFF;

    public C74961TbR() {
        this(null, null, false, 0, null, 63);
    }

    public C74961TbR(MutableLiveData isVideoSwitchOn, MutableLiveData isAudioSwitchOn, boolean z, int i, LiveEffect liveEffect, int i2) {
        isVideoSwitchOn = (i2 & 1) != 0 ? new MutableLiveData(Boolean.FALSE) : isVideoSwitchOn;
        isAudioSwitchOn = (i2 & 2) != 0 ? new MutableLiveData(Boolean.TRUE) : isAudioSwitchOn;
        z = (i2 & 4) != 0 ? false : z;
        i = (i2 & 8) != 0 ? 2 : i;
        liveEffect = (i2 & 16) != 0 ? null : liveEffect;
        o.LJIIIZ(isVideoSwitchOn, "isVideoSwitchOn");
        o.LJIIIZ(isAudioSwitchOn, "isAudioSwitchOn");
        this.LIZ = isVideoSwitchOn;
        this.LIZIZ = isAudioSwitchOn;
        this.LIZJ = z;
        this.LIZLLL = i;
        this.LJ = liveEffect;
        this.LJFF = null;
    }
}

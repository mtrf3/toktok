package X;

import android.graphics.Bitmap;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.services.video.VEVolumeChangeOp;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import dmt.av.video.ReplayLiveData;
import dmt.av.video.StoredLiveData;
import java.util.ArrayList;

/* renamed from: X.6lZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC169856lZ {
    MutableLiveData<Bitmap> C0();

    ArrayList<EffectPointModel> J7();

    LiveData<Boolean> LIZ();

    LiveData<InterfaceC153045zY> LIZIZ();

    MutableLiveData<C140335f3> LIZJ();

    AbstractC42651GoZ LIZLLL();

    void LJ();

    StoredLiveData<C5RV> LJFF();

    ReplayLiveData<C5RT> LJI();

    void LJII(VEVolumeChangeOp vEVolumeChangeOp);

    MutableLiveData<C5MM> LJIIIIZZ();

    MutableLiveData<Boolean> LJIIIZ();

    VideoPublishEditModel LLLLIL();

    LiveData<C5RV> i3();

    MutableLiveData<Boolean> x7();
}

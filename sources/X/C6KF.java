package X;

import android.view.View;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.EditAudioRecordScene;
import kotlin.jvm.internal.o;

/* renamed from: X.6KF, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6KF implements C6KR {
    public final /* synthetic */ EditAudioRecordScene LIZ;

    public C6KF(EditAudioRecordScene editAudioRecordScene) {
        this.LIZ = editAudioRecordScene;
    }

    @Override // X.C6KR
    public final void LIZ(float f, boolean z) {
        int i;
        long j;
        long j2 = r1.duration * f;
        InterfaceC153045zY interfaceC153045zY = this.LIZ.mVEEditor;
        if (interfaceC153045zY != null) {
            i = interfaceC153045zY.LLIZLLLIL();
        } else {
            i = 0;
        }
        int i2 = (int) (i * f);
        InterfaceC153045zY interfaceC153045zY2 = this.LIZ.mVEEditor;
        if (interfaceC153045zY2 != null) {
            j = interfaceC153045zY2.LLFZ(i2);
        } else {
            j = 0;
        }
        EditAudioRecordScene editAudioRecordScene = this.LIZ;
        editAudioRecordScene.mProcess = f;
        if (z) {
            editAudioRecordScene.curPoint = null;
            MutableLiveData<C5MM> mutableLiveData = editAudioRecordScene.mPreviewControlOpLiveData;
            if (mutableLiveData != null) {
                mutableLiveData.setValue(C5MM.LIZLLL(j));
                MutableLiveData<C5MM> mutableLiveData2 = this.LIZ.mPreviewControlOpLiveData;
                if (mutableLiveData2 != null) {
                    mutableLiveData2.setValue(C5MM.LIZJ());
                    View view = this.LIZ.mPlayView;
                    if (view != null) {
                        view.setVisibility(0);
                    } else {
                        o.LJIJI("mPlayView");
                        throw null;
                    }
                } else {
                    o.LJIJI("mPreviewControlOpLiveData");
                    throw null;
                }
            } else {
                o.LJIJI("mPreviewControlOpLiveData");
                throw null;
            }
        } else {
            MutableLiveData<C5MM> mutableLiveData3 = editAudioRecordScene.mPreviewControlOpLiveData;
            if (mutableLiveData3 != null) {
                mutableLiveData3.setValue(C5MM.LIZIZ(j));
                MutableLiveData<C5MM> mutableLiveData4 = this.LIZ.mPreviewControlOpLiveData;
                if (mutableLiveData4 != null) {
                    mutableLiveData4.setValue(C5MM.LIZJ());
                    View view2 = this.LIZ.mPlayView;
                    if (view2 != null) {
                        view2.setVisibility(4);
                    } else {
                        o.LJIJI("mPlayView");
                        throw null;
                    }
                } else {
                    o.LJIJI("mPreviewControlOpLiveData");
                    throw null;
                }
            } else {
                o.LJIJI("mPreviewControlOpLiveData");
                throw null;
            }
        }
        this.LIZ.getProcessTimeLiveData().setValue(Long.valueOf(j2));
    }
}

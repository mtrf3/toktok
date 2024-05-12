package com.ss.android.ugc.gamora.editorpro.audio;

import X.AnonymousClass513;
import X.C124844vA;
import X.C221108m2;
import X.C56L;
import X.C56P;
import X.C56R;
import X.C62822Ol8;
import X.C6KH;
import X.C76800UCe;
import X.H7C;
import X.InterfaceC63875P5b;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.bpea.basics.Cert;
import com.ss.android.ugc.gamora.editorpro.audio.AudioRecordFragmentViewModel;
import com.ss.android.vesdk.VEAudioRecorder;
import com.ss.android.vesdk.VERTAudioWaveformMgr;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class AudioRecordFragmentViewModel extends ViewModel {
    public final MutableLiveData<List<Float>> LJLIL;
    public final MutableLiveData LJLILLLLZI;
    public final MutableLiveData<AnonymousClass513> LJLJI;
    public final MutableLiveData LJLJJI;
    public final MutableLiveData<C124844vA> LJLJJL;
    public final MutableLiveData LJLJJLL;
    public final MutableLiveData<C76800UCe> LJLJL;
    public final MutableLiveData<C76800UCe> LJLJLJ;
    public final List<Float> LJLJLLL;
    public final C62822Ol8 LJLL;
    public C56R LJLLI;
    public final C62822Ol8 LJLLILLLL;
    public long LJLLJ;
    public long LJLLL;
    public long LJLLLL;
    public boolean LJLLLLLL;
    public final C56L LJLZ;

    public final VEAudioRecorder gv0() {
        return (VEAudioRecorder) this.LJLL.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [X.56L] */
    public AudioRecordFragmentViewModel() {
        MutableLiveData<List<Float>> mutableLiveData = new MutableLiveData<>();
        this.LJLIL = mutableLiveData;
        this.LJLILLLLZI = mutableLiveData;
        MutableLiveData<AnonymousClass513> mutableLiveData2 = new MutableLiveData<>();
        this.LJLJI = mutableLiveData2;
        this.LJLJJI = mutableLiveData2;
        MutableLiveData<C124844vA> mutableLiveData3 = new MutableLiveData<>();
        this.LJLJJL = mutableLiveData3;
        this.LJLJJLL = mutableLiveData3;
        MutableLiveData<C76800UCe> mutableLiveData4 = new MutableLiveData<>();
        this.LJLJL = mutableLiveData4;
        this.LJLJLJ = mutableLiveData4;
        this.LJLJLLL = new ArrayList();
        this.LJLL = C221108m2.LIZIZ(C56P.LJLIL);
        this.LJLLILLLL = C221108m2.LIZIZ(C6KH.LJLIL);
        this.LJLZ = new InterfaceC63875P5b() { // from class: X.56L
            @Override // X.InterfaceC63875P5b
            public final void LIZ(int i) {
            }

            @Override // X.InterfaceC63875P5b
            public final void onError(int i, int i2, String str) {
            }

            @Override // X.InterfaceC63875P5b
            public final void LIZIZ(int i, byte[] bArr) {
                int length = bArr.length / 2;
                short[] sArr = new short[length];
                ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asShortBuffer().get(sArr);
                C62822Ol8 c62822Ol8 = C56M.LIZ;
                Object value = c62822Ol8.getValue();
                o.LJIIIIZZ(value, "<get-waveManager>(...)");
                int process = ((VERTAudioWaveformMgr) value).process(sArr, 0, length / 2);
                float[] fArr = new float[process];
                Object value2 = c62822Ol8.getValue();
                o.LJIIIIZZ(value2, "<get-waveManager>(...)");
                ((VERTAudioWaveformMgr) value2).getRemainedPoints(fArr, 0, process);
                ((ArrayList) AudioRecordFragmentViewModel.this.LJLJLLL).addAll(ORY.LJJLL(fArr));
                int size = ((ArrayList) AudioRecordFragmentViewModel.this.LJLJLLL).size() * 30;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("record time: ");
                LIZ.append(size);
                H7C.LJI(3, "music", null, X1D.LIZIZ(LIZ));
                AudioRecordFragmentViewModel audioRecordFragmentViewModel = AudioRecordFragmentViewModel.this;
                if (audioRecordFragmentViewModel.LJLLJ + size >= audioRecordFragmentViewModel.LJLLLL) {
                    H7C.LJI(3, "music", null, "record to the video end,auto stop audio recording");
                    AudioRecordFragmentViewModel.this.LJLJL.postValue(C76800UCe.LIZ);
                } else {
                    audioRecordFragmentViewModel.LJLIL.postValue(ORZ.LLJI(audioRecordFragmentViewModel.LJLJLLL));
                }
            }
        };
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        gv0().destory((Cert) this.LJLLILLLL.getValue());
        H7C.LJI(4, "music", null, "on AudioRecordViewModelV2 cleared,destory VEAudioRecord");
    }
}

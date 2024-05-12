package com.ss.android.ugc.aweme.shortvideo.cut.videoedit;

import X.C15070iV;
import X.C46048I5k;
import X.EnumC82528WaC;
import X.I5B;
import X.I5U;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.shortvideo.cut.model.CutVideoContext;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public class VideoEditViewModel extends ViewModel {
    public final MutableLiveData<Integer> LJLIL = new MutableLiveData<>();
    public final MutableLiveData<Boolean> LJLILLLLZI = new MutableLiveData<>();
    public final MutableLiveData<Float> LJLJI = new MutableLiveData<>();
    public final MutableLiveData<Long> LJLJJI = new MutableLiveData<>();
    public final MutableLiveData<Void> LJLJJL = new MutableLiveData<>();
    public final MutableLiveData<Void> LJLJJLL = new MutableLiveData<>();
    public final MutableLiveData<Void> LJLJL = new MutableLiveData<>();
    public final MutableLiveData<Void> LJLJLJ = new MutableLiveData<>();
    public final MutableLiveData<Void> LJLJLLL = new MutableLiveData<>();
    public final MutableLiveData<Void> LJLL = new MutableLiveData<>();
    public final MutableLiveData<Void> LJLLI = new MutableLiveData<>();
    public final MutableLiveData<Void> LJLLILLLL = new MutableLiveData<>();
    public final MutableLiveData<Float> LJLLJ = new MutableLiveData<>();
    public final MutableLiveData<C15070iV<Integer, Integer>> LJLLL = new MutableLiveData<>();
    public final MutableLiveData<Void> LJLLLL = new MutableLiveData<>();
    public final MutableLiveData<Void> LJLLLLLL = new MutableLiveData<>();
    public final MutableLiveData<VideoSegment> LJLZ = new MutableLiveData<>();
    public final MutableLiveData<Boolean> LJZ = new MutableLiveData<>();
    public final MutableLiveData<Void> LJZI = new MutableLiveData<>();
    public final MutableLiveData<Void> LJZL = new MutableLiveData<>();
    public final MutableLiveData<Void> LL = new MutableLiveData<>();
    public final MutableLiveData<CutVideoContext> LLD = new MutableLiveData<>();
    public final HashMap<String, Integer> LLF = new HashMap<>();
    public final HashMap<String, Integer> LLFF = new HashMap<>();
    public I5U LLFFF;

    public final boolean hv0() {
        if (this.LLD.getValue() == null || this.LLD.getValue().getVideoSegmentList() == null || this.LLD.getValue().getVideoSegmentList().isEmpty()) {
            return false;
        }
        VideoSegment videoSegment = (VideoSegment) ListProtector.get(this.LLD.getValue().getVideoSegmentList(), 0);
        if (videoSegment.width <= 0 || videoSegment.height <= 0) {
            return false;
        }
        return true;
    }

    public final List<VideoSegment> kv0() {
        return this.LLD.getValue().getVideoSegmentList();
    }

    public final float nv0() {
        return this.LLD.getValue().totalSpeed;
    }

    public final List<VideoSegment> ov0() {
        return this.LLD.getValue().getVideoSegmentList();
    }

    public final void gv0(List<VideoSegment> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        CutVideoContext value = this.LLD.getValue();
        if (value != null) {
            value.getVideoSegmentList().addAll(list);
        }
        MutableLiveData<CutVideoContext> mutableLiveData = this.LLD;
        mutableLiveData.postValue(mutableLiveData.getValue());
    }

    public final void iv0(String str) {
        CutVideoContext value = this.LLD.getValue();
        if (value != null) {
            for (VideoSegment videoSegment : value.getVideoSegmentList()) {
                if (videoSegment.LJII(true).equals(str)) {
                    videoSegment.isDeleted = true;
                    return;
                }
            }
        }
    }

    public final int jv0(String str) {
        Iterator<VideoSegment> it = this.LLD.getValue().getVideoSegmentList().iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next().LJII(true).equals(str)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final int lv0(int i) {
        CutVideoContext value = this.LLD.getValue();
        if (value != null) {
            VideoSegment videoSegment = (VideoSegment) ListProtector.get(value.getVideoSegmentList(), i);
            if (this.LLF.containsKey(videoSegment.LJII(true))) {
                return this.LLF.get(videoSegment.LJII(true)).intValue();
            }
            return 0;
        }
        return 0;
    }

    public final VideoSegment mv0(int i) {
        CutVideoContext value = this.LLD.getValue();
        if (value == null) {
            return null;
        }
        return (VideoSegment) ListProtector.get(value.getVideoSegmentList(), i);
    }

    public final void pv0(float f) {
        this.LJLJI.setValue(Float.valueOf(f));
    }

    public final void qv0(boolean z) {
        this.LJLILLLLZI.setValue(Boolean.valueOf(z));
    }

    public final void tv0(List<VideoSegment> list) {
        CutVideoContext cutVideoContext = new CutVideoContext();
        cutVideoContext.setVideoSegmentList(list);
        cutVideoContext.totalSpeed = EnumC82528WaC.NORMAL.value();
        this.LLD.setValue(cutVideoContext);
    }

    public final void uv0(int i) {
        this.LJLIL.setValue(Integer.valueOf(i));
    }

    public final void rv0(I5B i5b, int i) {
        C46048I5k c46048I5k;
        CutVideoContext value = this.LLD.getValue();
        if (value != null) {
            VideoSegment videoSegment = (VideoSegment) ListProtector.get(value.getVideoSegmentList(), i);
            videoSegment.LJIILIIL(i5b.LIZLLL);
            long j = i5b.LIZ;
            if (videoSegment.LJIIJ()) {
                videoSegment.stickPointVideoSegment.setVideoStart(j);
            } else {
                videoSegment.start = j;
            }
            videoSegment.LJIIJJI(i5b.LIZIZ);
            videoSegment.rotate = i5b.LIZJ;
            I5U i5u = this.LLFFF;
            if (i5u != null && (c46048I5k = i5u.LIZ.LJLIL) != null) {
                c46048I5k.LLFF(videoSegment);
            }
        }
    }

    public final void sv0(int i, int i2) {
        CutVideoContext value = this.LLD.getValue();
        if (value != null) {
            this.LLF.put(((VideoSegment) ListProtector.get(value.getVideoSegmentList(), i)).LJII(true), Integer.valueOf(i2));
        }
    }
}

package com.ss.android.ugc.aweme.qna.vm;

import X.C52900KpU;
import X.C57116MbI;
import X.C69603RTj;
import X.C71830SHa;
import X.C74100T6i;
import X.T84;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public abstract class QnaViewModel extends ViewModel implements T84 {
    public final MutableLiveData<C74100T6i<C69603RTj>> LJLIL;
    public final MutableLiveData LJLILLLLZI;
    public final MutableLiveData<C74100T6i<C57116MbI>> LJLJI;
    public final MutableLiveData LJLJJI;
    public final MutableLiveData<C74100T6i<C57116MbI>> LJLJJL;
    public final MutableLiveData LJLJJLL;

    public void HO(String str, List list, boolean z) {
    }

    public void LLLL() {
    }

    public void RO(String str) {
    }

    public void jI(int i, String str) {
    }

    @Override // X.T84
    public final void vg0(String questionId, String str) {
        o.LJIIIZ(questionId, "questionId");
    }

    public QnaViewModel() {
        MutableLiveData<C74100T6i<C69603RTj>> mutableLiveData = new MutableLiveData<>();
        this.LJLIL = mutableLiveData;
        this.LJLILLLLZI = mutableLiveData;
        MutableLiveData<C74100T6i<C57116MbI>> mutableLiveData2 = new MutableLiveData<>();
        this.LJLJI = mutableLiveData2;
        this.LJLJJI = mutableLiveData2;
        MutableLiveData<C74100T6i<C57116MbI>> mutableLiveData3 = new MutableLiveData<>();
        this.LJLJJL = mutableLiveData3;
        this.LJLJJLL = mutableLiveData3;
    }

    @Override // X.T84
    public final void mQ(C69603RTj c69603RTj) {
        if (c69603RTj != null) {
            this.LJLIL.setValue(new C74100T6i<>(c69603RTj));
        }
    }

    @Override // X.T84
    public final void wA(C71830SHa videoThumbnailData, String str) {
        String str2;
        o.LJIIIZ(videoThumbnailData, "videoThumbnailData");
        String str3 = videoThumbnailData.LIZIZ;
        if (str3 == null || (str2 = videoThumbnailData.LIZ) == null) {
            return;
        }
        if (C52900KpU.LIZ) {
            this.LJLJJL.setValue(new C74100T6i<>(new C57116MbI(str3, str2, str)));
        } else {
            this.LJLJI.setValue(new C74100T6i<>(new C57116MbI(str3, str2, str)));
        }
    }
}

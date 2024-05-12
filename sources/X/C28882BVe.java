package X;

import Y.ARunnableS16S0300000_5;
import Y.AfS57S0100000_5;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverMinSizeSetting;
import com.bytedance.android.livesdk.qa.QuestionEx;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.List;
import kotlin.jvm.internal.AqS109S0300000_5;
import kotlin.jvm.internal.AqS136S0200000_5;
import kotlin.jvm.internal.o;

/* renamed from: X.BVe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28882BVe extends AbstractC43471nD<Long, QuestionEx> implements InterfaceC18990op {
    public final DataChannel LIZJ;
    public final boolean LIZLLL;
    public final C73318Sq2 LJ;
    public final MutableLiveData<C06900Ow> LJFF;
    public final MutableLiveData<C06900Ow> LJI;
    public final MutableLiveData<Boolean> LJII;
    public final MutableLiveData<Boolean> LJIIIIZZ;
    public ARunnableS16S0300000_5 LJIIIZ;
    public boolean LJIIJ;
    public boolean LJIIJJI;
    public boolean LJIIL;

    @Override // X.AbstractC43471nD
    public final void LJIIL(C19040ou c19040ou, C34561Xg c34561Xg) {
    }

    @Override // X.InterfaceC18990op
    public final void LIZ() {
        this.LJ.LIZLLL();
        C28874BUw.LIZ();
    }

    @Override // X.AbstractC43471nD
    public final Long LJIIJ(QuestionEx questionEx) {
        QuestionEx item = questionEx;
        o.LJIIIZ(item, "item");
        return Long.valueOf(item.question.createTime);
    }

    @Override // X.AbstractC43471nD
    public final void LJIIJJI(C19040ou c19040ou, C34561Xg c34561Xg) {
        if (C28874BUw.LIZIZ) {
            this.LJFF.postValue(C06900Ow.LIZIZ);
            C28874BUw.LIZJ(false, 1, new AqS136S0200000_5(this, c34561Xg, 32), null);
        }
    }

    @Override // X.AbstractC43471nD
    public final void LJIILIIL(C19030ot<Long> params, AbstractC34571Xh<QuestionEx> callback) {
        o.LJIIIZ(params, "params");
        o.LJIIIZ(callback, "callback");
        if (this.LJIIL) {
            List<QuestionEx> list = C28874BUw.LJ;
            if (C79004UzY.LJJIFFI(list)) {
                this.LJII.postValue(Boolean.TRUE);
            } else {
                this.LJII.postValue(Boolean.FALSE);
            }
            callback.LIZ(list);
            this.LJIIL = false;
            return;
        }
        MutableLiveData<C06900Ow> mutableLiveData = this.LJI;
        C06900Ow c06900Ow = C06900Ow.LIZIZ;
        mutableLiveData.postValue(c06900Ow);
        this.LJFF.postValue(c06900Ow);
        this.LJIIIIZZ.postValue(Boolean.TRUE);
        this.LJIIIZ = null;
        C28874BUw.LIZJ(true, 1, new AqS136S0200000_5(this, (C28882BVe) callback, (AbstractC34571Xh<QuestionEx>) 33), new AqS109S0300000_5(this, (C28882BVe) params, (C19030ot<Long>) callback, (AbstractC34571Xh<QuestionEx>) 2));
    }

    public C28882BVe(DataChannel dataChannel, MutableLiveData mutableLiveData, MutableLiveData mutableLiveData2, MutableLiveData mutableLiveData3, MutableLiveData mutableLiveData4, C73893SzJ retry, boolean z) {
        o.LJIIIZ(dataChannel, "dataChannel");
        o.LJIIIZ(retry, "retry");
        this.LIZJ = dataChannel;
        this.LIZLLL = z;
        C73318Sq2 c73318Sq2 = new C73318Sq2();
        this.LJ = c73318Sq2;
        this.LJFF = mutableLiveData4;
        this.LJI = mutableLiveData2;
        this.LJII = mutableLiveData3;
        this.LJIIIIZZ = mutableLiveData;
        this.LJIIIIZZ = mutableLiveData;
        this.LJI = mutableLiveData2;
        this.LJII = mutableLiveData3;
        this.LJFF = mutableLiveData4;
        c73318Sq2.LIZ(retry.LJJJLIIL(new AfS57S0100000_5(this, LiveCoverMinSizeSetting.DEFAULT), C28883BVf.LJLIL));
        LIZIZ(new C28886BVi(this));
    }
}

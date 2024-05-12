package X;

import Y.ARunnableS16S0300000_5;
import Y.AfS44S0300000_5;
import Y.AfS54S0200000_5;
import Y.AfS57S0100000_5;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.livesdk.qa.QAApi;
import com.bytedance.android.livesdk.qa.QuestionEx;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.BVd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28881BVd extends AbstractC43471nD<Long, QuestionEx> implements InterfaceC18990op {
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final C73318Sq2 LJ;
    public final MutableLiveData<C06900Ow> LJFF;
    public final MutableLiveData<C06900Ow> LJI;
    public final MutableLiveData<Boolean> LJII;
    public final MutableLiveData<Boolean> LJIIIIZZ;
    public ARunnableS16S0300000_5 LJIIIZ;
    public Room LJIIJ;
    public boolean LJIIJJI;
    public boolean LJIIL;
    public long LJIILIIL;
    public long LJIILJJIL;
    public long LJIILL;
    public final List<QuestionEx> LJIILLIIL;
    public final List<QuestionEx> LJIIZILJ;
    public final List<QuestionEx> LJIJ;
    public final List<QuestionEx> LJIJI;
    public boolean LJIJJ;
    public boolean LJIJJLI;
    public boolean LJIL;
    public boolean LJJ;
    public boolean LJJI;
    public boolean LJJIFFI;

    @Override // X.AbstractC43471nD
    public final void LJIIL(C19040ou c19040ou, C34561Xg c34561Xg) {
    }

    @Override // X.InterfaceC18990op
    public final void LIZ() {
        this.LJ.LIZLLL();
        ((ArrayList) this.LJIILLIIL).clear();
    }

    @Override // X.AbstractC43471nD
    public final Long LJIIJ(QuestionEx questionEx) {
        QuestionEx item = questionEx;
        o.LJIIIZ(item, "item");
        return Long.valueOf(item.question.createTime);
    }

    @Override // X.AbstractC43471nD
    public final void LJIIJJI(C19040ou c19040ou, C34561Xg c34561Xg) {
        if (this.LJJ || this.LJJI || this.LJJIFFI) {
            this.LJFF.postValue(C06900Ow.LIZIZ);
            QAApi qAApi = (QAApi) C1A.LIZJ(QAApi.class);
            Room room = this.LJIIJ;
            if (room != null) {
                C1EW.LIZ(qAApi.queryQuestion(room.getId(), this.LJIILIIL, this.LJIILJJIL, this.LJIILL, 2)).LJJJLIIL(new AfS54S0200000_5(this, c34561Xg, 47), new AfS57S0100000_5(this, 246));
            } else {
                o.LJIJI("room");
                throw null;
            }
        }
    }

    @Override // X.AbstractC43471nD
    public final void LJIILIIL(C19030ot<Long> params, AbstractC34571Xh<QuestionEx> callback) {
        o.LJIIIZ(params, "params");
        o.LJIIIZ(callback, "callback");
        if (!this.LJIIJJI || !this.LIZJ) {
            this.LJIILL = 0L;
            this.LJJIFFI = false;
        }
        if (this.LJIL) {
            if (C79004UzY.LJJIFFI(this.LJIILLIIL)) {
                this.LJII.postValue(Boolean.TRUE);
            } else {
                this.LJII.postValue(Boolean.FALSE);
            }
            callback.LIZ(this.LJIILLIIL);
            this.LJIL = false;
            return;
        }
        MutableLiveData<C06900Ow> mutableLiveData = this.LJI;
        C06900Ow c06900Ow = C06900Ow.LIZIZ;
        mutableLiveData.postValue(c06900Ow);
        this.LJFF.postValue(c06900Ow);
        this.LJIIIIZZ.postValue(Boolean.TRUE);
        this.LJIIIZ = null;
        QAApi qAApi = (QAApi) C1A.LIZJ(QAApi.class);
        Room room = this.LJIIJ;
        if (room != null) {
            C1EW.LIZ(qAApi.queryQuestion(room.getId(), this.LJIILIIL, this.LJIILJJIL, this.LJIILL, 2)).LJJJLIIL(new AfS44S0300000_5((AbstractC34571Xh) callback, (C19030ot) params, this, 11), new AfS44S0300000_5((AbstractC34571Xh) callback, (C19030ot) params, this, 12));
        } else {
            o.LJIJI("room");
            throw null;
        }
    }

    public final void LJIILJJIL(Throwable throwable, C19030ot<Long> params, AbstractC34571Xh<QuestionEx> callback) {
        o.LJIIIZ(throwable, "throwable");
        o.LJIIIZ(params, "params");
        o.LJIIIZ(callback, "callback");
        this.LJIIIZ = new ARunnableS16S0300000_5(this, params, callback, 10);
        this.LJI.postValue(C06900Ow.LIZ());
        this.LJFF.postValue(C06900Ow.LIZ());
    }

    public C28881BVd(MutableLiveData hasMore, MutableLiveData refreshStat, MutableLiveData dataEmpty, MutableLiveData networkStat, C73893SzJ retry, boolean z, boolean z2) {
        o.LJIIIZ(hasMore, "hasMore");
        o.LJIIIZ(refreshStat, "refreshStat");
        o.LJIIIZ(dataEmpty, "dataEmpty");
        o.LJIIIZ(networkStat, "networkStat");
        o.LJIIIZ(retry, "retry");
        this.LIZJ = z;
        this.LIZLLL = z2;
        C73318Sq2 c73318Sq2 = new C73318Sq2();
        this.LJ = c73318Sq2;
        this.LJFF = networkStat;
        this.LJI = refreshStat;
        this.LJII = dataEmpty;
        this.LJIIIIZZ = hasMore;
        this.LJIILIIL = 1L;
        this.LJIILJJIL = 1L;
        this.LJIILL = 1L;
        this.LJIILLIIL = new ArrayList();
        this.LJIIZILJ = new ArrayList();
        this.LJIJ = new ArrayList();
        this.LJIJI = new ArrayList();
        this.LJIIIIZZ = hasMore;
        this.LJI = refreshStat;
        this.LJII = dataEmpty;
        this.LJFF = networkStat;
        c73318Sq2.LIZ(retry.LJJJLIIL(new AfS57S0100000_5(this, 253), C28884BVg.LJLIL));
        LIZIZ(new C28885BVh(this));
    }
}

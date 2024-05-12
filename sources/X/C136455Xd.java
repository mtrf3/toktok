package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS133S0200000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5Xd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C136455Xd extends AbstractC42021ks<InterfaceC136475Xf> implements InterfaceC136475Xf {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLLJ;
    public final InterfaceC115514g7 LJLLI;
    public final int LJLLILLLL;

    static {
        TBT tbt = new TBT(C136455Xd.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C65352Pkq.LIZ.getClass();
        LJLLJ = new InterfaceC74236TBo[]{tbt};
    }

    public final VideoPublishEditModel LJJZZIII() {
        return (VideoPublishEditModel) this.LJLLI.LIZ(this, LJLLJ[0]);
    }

    @Override // X.AbstractC42021ks
    public int LJJLJLI() {
        return this.LJLLILLLL;
    }

    @Override // X.AbstractC42021ks, X.AbstractC29891Fh
    public void onCreate() {
        super.onCreate();
    }

    @Override // X.AbstractC42021ks
    public void LJJLIIIIJ(WMH childComponentsContainer) {
        o.LJIIIZ(childComponentsContainer, "childComponentsContainer");
        LJJLIIIJJIZ(C136465Xe.LJLIL);
        LJJLI(new AqS133S0200000_2(this, childComponentsContainer, 73));
        if (C44384HbQ.LJJJ(childComponentsContainer).LJLLL != null) {
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C136455Xd(WMH parentGroupScene, C82622Wbi diContainer) {
        super(parentGroupScene, diContainer);
        o.LJIIIZ(parentGroupScene, "parentGroupScene");
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLLI = UCI.LJI(getDiContainer(), VideoPublishEditModel.class, null);
        this.LJLLILLLL = R.layout.ahz;
    }
}

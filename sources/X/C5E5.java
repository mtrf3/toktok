package X;

import android.graphics.Bitmap;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.ugc.android.editor.track.viewmodels.FrameCacheViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AqS14S0000100_2;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5E5, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5E5 extends AbstractC48231ut<C5PZ, C5EQ, C5EA, C5E8> implements InterfaceC135635Tz, C5PZ {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLLJ;
    public final C82622Wbi LJLL;
    public final InterfaceC115514g7 LJLLI;
    public ArrayList<InterfaceC131385Dq> LJLLILLLL;

    static {
        TBT tbt = new TBT(C5E5.class, "nleApi", "getNleApi()Lcom/ss/android/ugc/gamora/editorpro/crop/nle/NLECropApiComponent;", 0);
        C65352Pkq.LIZ.getClass();
        LJLLJ = new InterfaceC74236TBo[]{tbt};
    }

    @Override // X.AbstractC41331jl
    public InterfaceC65784Pro<C5E8> LJJLIIIJJIZ() {
        return new AqS152S0100000_2(this, 590);
    }

    public final FrameCacheViewModel LJZI() {
        return (FrameCacheViewModel) C5G0.LIZ(FrameCacheViewModel.class);
    }

    public final C5JU LLF() {
        return (C5JU) this.LJLLI.LIZ(this, LJLLJ[0]);
    }

    @Override // X.C5PZ
    public void Xv() {
        if (!(C78688UuS.LJIJJ(this) instanceof ActivityC45651qj)) {
            return;
        }
        Iterator<InterfaceC131385Dq> it = this.LJLLILLLL.iterator();
        while (it.hasNext()) {
            InterfaceC131385Dq request = it.next();
            FrameCacheViewModel LJZI = LJZI();
            LJZI.getClass();
            o.LJIIIZ(request, "request");
            C131235Db hv0 = LJZI.hv0();
            hv0.getClass();
            XKX.LIZLLL(hv0, C78613UtF.LIZ, null, new C131175Cv(hv0, request, null), 2);
        }
        this.LJLLILLLL.clear();
    }

    @Override // X.AbstractC41331jl
    public InterfaceC65784Pro<C5EA> LJJLIIIJJI() {
        return C5E9.LJLIL;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLL;
    }

    @Override // X.C5PZ
    public void LLIZLLLIL(long j) {
        LJJZZI(new AqS14S0000100_2(j, 3));
    }

    @Override // X.C5PZ
    public void LLLLLLLLL(long j) {
        LJJZZI(new AqS14S0000100_2(j, 2));
    }

    @Override // X.C5PZ
    public void yd0(NLETrackSlot nLETrackSlot) {
        LJJZZI(new AqS168S0100000_2(nLETrackSlot, 342));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5E5(WMH parentScene, C82622Wbi diContainer) {
        super(parentScene);
        o.LJIIIZ(parentScene, "parentScene");
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLL = diContainer;
        this.LJLLI = UCI.LJII(getDiContainer(), C5JU.class, null);
        this.LJLLILLLL = new ArrayList<>();
    }

    public final Bitmap LJLZ(String str, int i) {
        if (!(C78688UuS.LJIJJ(this) instanceof ActivityC45651qj)) {
            return null;
        }
        return LJZI().gv0(i, str);
    }

    public final void LLFFF(NLETrackSlot nLETrackSlot, final float f, final int i) {
        EnumC123874tb enumC123874tb;
        NLESegmentVideo LJJ = NLESegmentVideo.LJJ(nLETrackSlot.LJI());
        if (LJJ == null) {
            return;
        }
        NLEResourceNode LIZIZ = LJJ.LIZIZ();
        if (LIZIZ != null) {
            enumC123874tb = LIZIZ.LJFF();
        } else {
            enumC123874tb = null;
        }
        if (enumC123874tb == EnumC123874tb.IMAGE || !(C78688UuS.LJIJJ(this) instanceof ActivityC45651qj)) {
            return;
        }
        final long LJIILIIL = LJJ.LJIILIIL();
        final String LIZJ = C5DZ.LIZJ(nLETrackSlot);
        InterfaceC131385Dq interfaceC131385Dq = new InterfaceC131385Dq() { // from class: X.5E3
            @Override // X.InterfaceC131385Dq
            public final C5E1 LIZ() {
                ArrayList arrayList = new ArrayList();
                for (int i2 = 0; i2 < i; i2++) {
                    int LJJIIZ = O6R.LJJIIZ((((i2 * f) + ((float) LJIILIIL)) / 1000.0f) / 1000.0f) * 1000;
                    if (this.LJZI().gv0(LJJIIZ, LIZJ) == null) {
                        arrayList.add(Integer.valueOf(LJJIIZ));
                    }
                }
                if (arrayList.isEmpty()) {
                    C61878OQg c61878OQg = C61878OQg.INSTANCE;
                    return new C5E1(c61878OQg, c61878OQg, c61878OQg);
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Integer pts = (Integer) it.next();
                    String str = LIZJ;
                    o.LJIIIIZZ(pts, "pts");
                    arrayList2.add(new C1290754t(str, pts.intValue(), 3, false));
                }
                return new C5E1(C61878OQg.INSTANCE, arrayList2, arrayList2);
            }

            @Override // X.InterfaceC131385Dq
            public final void LIZIZ(C5DY key) {
                o.LJIIIZ(key, "key");
                this.LJJZZI(C5E6.LJLIL);
            }
        };
        this.LJLLILLLL.add(interfaceC131385Dq);
        LJZI().hv0().LIZIZ(interfaceC131385Dq);
        FrameCacheViewModel.jv0(LJZI());
    }
}

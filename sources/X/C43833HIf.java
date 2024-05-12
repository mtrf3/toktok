package X;

import androidx.lifecycle.ViewModelProvider;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.RecordPageOptionalConfig;
import com.ss.android.ugc.aweme.shortvideo.ui.EmbaddedWindowInfo;
import com.ss.android.vesdk.runtime.VEMem;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.HIf, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43833HIf implements IA5 {
    public final C45946I1m LJLIL;
    public final ActivityC45651qj LJLILLLLZI;
    public final WRQ LJLJI;
    public final I9X<?> LJLJJI;
    public final InterfaceC83624Wrs LJLJJL;
    public final ShortVideoContextViewModel LJLJJLL;
    public long LJLJL;
    public final ShortVideoContext LJLJLJ;
    public final H9R LJLJLLL;
    public final List<InterfaceC43847HIt> LJLL;
    public final long LJLLI;
    public final InterfaceC45999I3n LJLLILLLL;
    public final HDA LJLLJ;

    @Override // X.IA5
    public final void LIZ(C46156I9o event) {
        Long l;
        o.LJIIIZ(event, "event");
        this.LJLLILLLL.jS();
        List<EmbaddedWindowInfo> list = null;
        Boolean bool = (Boolean) this.LJLJJLL.LJLILLLLZI.getOrDefault("has_go_next", null);
        if (bool != null && bool.booleanValue()) {
            H78.LJI("VideoRecordActivity hasGoNext true return");
            return;
        }
        this.LJLJJLL.hv0(true);
        ShortVideoContext shortVideoContext = this.LJLJLJ;
        long j = shortVideoContext.cameraComponentModel.mTotalRecordingTime;
        RecordPageOptionalConfig recordPageOptionalConfig = shortVideoContext.creativeModel.initialModel.recordPageOptionalConfig;
        if (recordPageOptionalConfig != null && (l = recordPageOptionalConfig.recordBottomTabConfig.minVideoDuration) != null && j < l.longValue()) {
            this.LJLJJLL.hv0(false);
            this.LJLJJI.Ec0(new I9L("record end"));
            this.LJLLILLLL.c6();
            this.LJLJI.zZ().mWorkspace.LJLIL.LLLFZ();
            return;
        }
        if (j < this.LJLLI && !this.LJLJLJ.LJJIJIIJIL()) {
            this.LJLLJ.LIZ(C43852HIy.LJLIL, new AqS173S0100000_7(this, 379), null);
            this.LJLJI.GK(false);
            return;
        }
        int size = ((ArrayList) this.LJLL).size();
        for (int i = 0; i < size; i++) {
            if (((InterfaceC43847HIt) ListProtector.get(this.LJLL, i)).LIZ(event)) {
                H78.LJI("VideoRecordActivity interceptor handle return");
                this.LJLJJI.LLLFZ(false);
                return;
            }
        }
        H78.LJI("VideoRecordActivity setHasGoNext true");
        this.LJLJJLL.hv0(true);
        C44298Ha2 c44298Ha2 = G8G.LIZ;
        c44298Ha2.start("av_video_edit", "showProgressDialog");
        this.LJLJL = System.currentTimeMillis();
        if (C43846HIs.LIZ(this.LJLJLJ)) {
            this.LJLJJL.LLZL(this.LJLJLJ.cameraComponentModel.isMuted);
        }
        if (MusicBeanUtilKt.extractAVMusic(this.LJLJLJ.creativeModel.musicBuzModel) == null) {
            ShortVideoContext shortVideoContext2 = this.LJLJLJ;
            if (shortVideoContext2.mIsFromDraft && shortVideoContext2.creativeModel.musicBuzModel.isDraftMusicIllegal) {
                this.LJLJJL.LLZL(true);
            }
        }
        c44298Ha2.step("av_video_edit", "startConcat");
        this.LJLJI.e20().LIZIZ.getClass();
        C43870HJq c43870HJq = new C43870HJq();
        c43870HJq.LIZ = this.LJLJLJ.cameraComponentModel.mWorkspace.E().getPath();
        c43870HJq.LIZIZ = this.LJLJLJ.cameraComponentModel.mWorkspace.LJJJJLI().getPath();
        c43870HJq.LJ = this.LJLJJL.getMediaController();
        c43870HJq.LIZLLL = this.LJLJLJ.enableSingleSegmentConcatUseCopy;
        c43870HJq.LJI = !r1.LJJIJIIJI();
        c43870HJq.LJII = VEMem.getInstance().inLowMemMode();
        c43870HJq.LJFF = C19N.LJ("pre_release_gpu_resource", false);
        String path = this.LJLJLJ.cameraComponentModel.mWorkspace.E().getPath();
        Integer valueOf = Integer.valueOf((int) this.LJLJLJ.cameraComponentModel.mTotalRecordingTime);
        Integer valueOf2 = Integer.valueOf(this.LJLJLJ.cameraComponentModel.mVideoWidth);
        Integer valueOf3 = Integer.valueOf(this.LJLJLJ.cameraComponentModel.mVideoHeight);
        if (this.LJLJLJ.LJJJI()) {
            list = this.LJLJLJ.cameraComponentModel.duetContext.windowInfoList;
        }
        c43870HJq.LIZJ = HMI.LIZIZ(path, valueOf, valueOf2, valueOf3, list);
        c43870HJq.LIZ(new C43834HIg(this));
    }

    @Override // X.IA5
    public final void LIZIZ(InterfaceC43847HIt interceptor) {
        o.LJIIIZ(interceptor, "interceptor");
        ((ArrayList) this.LJLL).add(interceptor);
    }

    public C43833HIf(C45946I1m c45946I1m, ActivityC45651qj activityC45651qj, WRQ wrq, I9X i9x, ShortVideoContext shortVideoContext, H9R h9r, I0N i0n, InterfaceC45999I3n interfaceC45999I3n, WRP wrp, I37 i37, C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = c45946I1m;
        this.LJLILLLLZI = activityC45651qj;
        this.LJLJI = wrq;
        this.LJLJJI = i9x;
        this.LJLL = new ArrayList();
        this.LJLLI = 1000L;
        this.LJLJJL = wrq.e8();
        this.LJLLILLLL = interfaceC45999I3n;
        this.LJLJLJ = shortVideoContext;
        this.LJLJLLL = h9r;
        this.LJLJJLL = (ShortVideoContextViewModel) ((ViewModelProvider) diContainer.LJ(ViewModelProvider.class, null)).get(ShortVideoContextViewModel.class);
        this.LJLLJ = new HD5(activityC45651qj, new AqS157S0100000_7(this, 684), new AqS157S0100000_7(i0n, 686), new AqS157S0100000_7(this, 687), new AqS157S0100000_7(shortVideoContext, 689), new AqS157S0100000_7(wrp, 691), new AqS157S0100000_7(i37, 693)).LIZ();
    }
}

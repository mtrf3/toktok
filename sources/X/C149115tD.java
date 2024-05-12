package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.o;

/* renamed from: X.5tD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C149115tD extends AbstractC29891Fh<InterfaceC146385oo> implements InterfaceC146385oo, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJJI;
    public final C82622Wbi LJLIL;
    public final InterfaceC146385oo LJLILLLLZI;
    public final InterfaceC115514g7 LJLJI;

    static {
        TBT tbt = new TBT(C149115tD.class, "editMode", "getEditMode()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C65352Pkq.LIZ.getClass();
        LJLJJI = new InterfaceC74236TBo[]{tbt};
    }

    private final VideoPublishEditModel LJJLI() {
        return (VideoPublishEditModel) this.LJLJI.LIZ(this, LJLJJI[0]);
    }

    @Override // X.AbstractC29891Fh
    public void onCreate() {
        super.onCreate();
        if (LJJLI().creativeModel.onThisDayData.isFromOnThisDay() && !TextUtils.isEmpty(LJJLI().creativeModel.onThisDayData.getPastMemoryKey())) {
            LJJLI().isPrivate = C42000Ge4.LJI(LJJLI());
            if (LJJLI().creativeModel.onThisDayData.getViewedVideo() == 0) {
                InterfaceC147495qb storyService = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false).getStoryService();
                String pastMemoryKey = LJJLI().creativeModel.onThisDayData.getPastMemoryKey();
                storyService.getClass();
                C55723Ltv.LIZIZ.LIZ().sendViewedMemorableView(pastMemoryKey);
                LJJLI().creativeModel.onThisDayData.setViewedVideo(1);
            }
        }
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ InterfaceC146385oo getApiComponent() {
        return this.LJLILLLLZI;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    public C149115tD(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = this;
        this.LJLJI = UCI.LJI(getDiContainer(), VideoPublishEditModel.class, null);
    }
}

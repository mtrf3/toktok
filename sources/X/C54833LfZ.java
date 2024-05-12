package X;

import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.story.api.StoryApi;
import com.ss.android.ugc.aweme.story.inbox.IStoryInboxService;
import com.ss.android.ugc.aweme.story.inbox.OnThisDayResponse;
import com.ss.android.ugc.aweme.story.inbox.StoryGetFeedByPageResponse;
import com.ss.android.ugc.aweme.story.inbox.view.StoryInboxCell;
import com.ss.android.ugc.aweme.story.inbox.view.StoryOnThisDayInboxCell;
import com.ss.android.ugc.aweme.story.onthisday.OnThisDayRequestApi;
import kotlin.jvm.internal.o;

/* renamed from: X.LfZ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54833LfZ implements IStoryInboxService {
    public static final C54833LfZ LIZ = new C54833LfZ();
    public static C73318Sq2 LIZIZ = new C73318Sq2();
    public static volatile StoryGetFeedByPageResponse LIZJ;

    @Override // com.ss.android.ugc.aweme.story.inbox.IStoryInboxService
    public final Class<? extends PowerCell<? extends InterfaceC57784Mm4>>[] getOnThisDayCell() {
        return new Class[]{StoryOnThisDayInboxCell.class};
    }

    @Override // com.ss.android.ugc.aweme.story.inbox.IStoryInboxService
    public final Class<? extends PowerCell<? extends InterfaceC57784Mm4>>[] getStoryCell() {
        return new Class[]{StoryInboxCell.class};
    }

    @Override // com.ss.android.ugc.aweme.story.inbox.IStoryInboxService
    public final AbstractC73672Svk<OnThisDayResponse> requestOnThisDayData() {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = EFJ.LIZJ;
        return ((OnThisDayRequestApi) C77800Ug8.LIZIZ(str, "API_URL_PREFIX_SI", LIZLLL, str, OnThisDayRequestApi.class)).requestOnThisDayAweme();
    }

    @Override // com.ss.android.ugc.aweme.story.inbox.IStoryInboxService
    public final StoryGetFeedByPageResponse getPreloadGetFeedByPageResponse() {
        StoryGetFeedByPageResponse storyGetFeedByPageResponse = LIZJ;
        LIZJ = null;
        C73318Sq2 c73318Sq2 = LIZIZ;
        if (c73318Sq2 != null) {
            c73318Sq2.dispose();
        }
        LIZIZ = null;
        return storyGetFeedByPageResponse;
    }

    @Override // com.ss.android.ugc.aweme.story.inbox.IStoryInboxService
    public final void preloadOnBoot() {
        C73318Sq2 c73318Sq2 = LIZIZ;
        if (c73318Sq2 == null) {
            return;
        }
        C78999UzT.LJFF(LYE.LIZ(this, null, null, 12).LJJL(T16.LIZ()).LJJJLIIL(C54836Lfc.LJLIL, C54837Lfd.LJLIL), c73318Sq2);
    }

    @Override // com.ss.android.ugc.aweme.story.inbox.IStoryInboxService
    public final boolean canShowStoryCell() {
        return L1Y.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.story.inbox.IStoryInboxService
    public final C48710J9u convertDayResponseToItem(OnThisDayResponse onThisDayResponse) {
        if (onThisDayResponse != null) {
            try {
                if (C55351Lnv.LIZIZ(onThisDayResponse)) {
                    return new C48710J9u(onThisDayResponse.getAweme(), onThisDayResponse.getViewCount(), onThisDayResponse.isPosted(), onThisDayResponse.getPastMemoryKey(), onThisDayResponse.getPriority());
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.story.inbox.IStoryInboxService
    public final void sendViewedMemorableView(String pastMemoryKey) {
        o.LJIIIZ(pastMemoryKey, "pastMemoryKey");
        XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ.plus(C55351Lnv.LIZ)), null, null, new C74632wN(pastMemoryKey, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.story.inbox.IStoryInboxService
    public final boolean shouldShowShootingEntrance(boolean z, boolean z2) {
        return L1Y.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.story.inbox.IStoryInboxService
    public final AbstractC73672Svk<StoryGetFeedByPageResponse> fetchStoryItems(long j, long j2, String str, EnumC54603Lbr scene) {
        o.LJIIIZ(scene, "scene");
        return StoryApi.LIZIZ.getFeedByPage(j, j2, str, scene.getValue()).LJIJJLI(C54793Lev.LJLIL);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    @Override // com.ss.android.ugc.aweme.story.inbox.IStoryInboxService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchStoryItemsByCont(long r13, long r15, java.lang.String r17, X.EnumC54603Lbr r18, X.InterfaceC67352kd<? super com.ss.android.ugc.aweme.story.inbox.StoryGetFeedByPageResponse> r19) {
        /*
            r12 = this;
            r3 = r19
            boolean r0 = r3 instanceof X.C54834Lfa
            if (r0 == 0) goto L61
            r11 = r3
            X.Lfa r11 = (X.C54834Lfa) r11
            int r2 = r11.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L61
            int r2 = r2 - r1
            r11.LJLJI = r2
        L14:
            java.lang.Object r5 = r11.LJLIL
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r1 = r11.LJLJI
            r0 = 1
            if (r1 == 0) goto L4b
            if (r1 != r0) goto L67
            X.C141335gf.LIZJ(r5)
        L22:
            com.ss.android.ugc.aweme.story.inbox.StoryGetFeedByPageResponse r5 = (com.ss.android.ugc.aweme.story.inbox.StoryGetFeedByPageResponse) r5
            r5.checkValid()
            X.Lew r2 = X.C54794Lew.LIZ
            java.util.List r1 = r5.getAwemes()
            if (r1 != 0) goto L31
            X.OQg r1 = X.C61878OQg.INSTANCE
        L31:
            com.ss.android.ugc.aweme.base.api.BaseResponse$ServerTimeExtra r0 = r5.extra
            r4 = 0
            if (r0 == 0) goto L49
            java.lang.String r0 = r0.logid
        L38:
            r2.LIZ(r0, r1)
            X.L6F r3 = X.L6F.LIZIZ
            X.L61 r2 = X.L61.STORY
            java.util.List r1 = r5.getAwemes()
            X.Lfb r0 = X.C54835Lfb.LJLIL
            r3.LIZLLL(r2, r4, r1, r0)
            return r5
        L49:
            r0 = r4
            goto L38
        L4b:
            X.C141335gf.LIZJ(r5)
            com.ss.android.ugc.aweme.story.api.StoryApi r3 = com.ss.android.ugc.aweme.story.api.StoryApi.LIZIZ
            long r9 = r18.getValue()
            r11.LJLJI = r0
            r6 = r15
            r4 = r13
            r8 = r17
            java.lang.Object r5 = r3.getFeedByPageByCont(r4, r6, r8, r9, r11)
            if (r5 != r2) goto L22
            return r2
        L61:
            X.Lfa r11 = new X.Lfa
            r11.<init>(r12, r3)
            goto L14
        L67:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54833LfZ.fetchStoryItemsByCont(long, long, java.lang.String, X.Lbr, X.2kd):java.lang.Object");
    }
}

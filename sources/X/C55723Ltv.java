package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.services.story.EnterStoryParam;
import com.ss.android.ugc.aweme.story.IStoryService;
import com.ss.android.ugc.aweme.story.inbox.IStoryInboxService;
import com.ss.android.ugc.aweme.story.model.SwitchToStoryResponse;
import com.ss.android.ugc.aweme.story.service.StoryServiceImpl;
import kotlin.jvm.internal.o;

/* renamed from: X.Ltv, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55723Ltv implements IStoryService {
    public static final C55723Ltv LIZIZ = new C55723Ltv();
    public final /* synthetic */ IStoryService LIZ = StoryServiceImpl.LJJI();

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final IStoryInboxService LIZ() {
        return this.LIZ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final Video LIZIZ(String creationId) {
        o.LJIIIZ(creationId, "creationId");
        return this.LIZ.LIZIZ(creationId);
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final void LIZJ() {
        this.LIZ.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final void LIZLLL(Context context, EnterStoryParam enterStoryParam) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(enterStoryParam, "enterStoryParam");
        this.LIZ.LIZLLL(context, enterStoryParam);
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final L24 LJ() {
        return this.LIZ.LJ();
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final void LJFF(int i) {
        this.LIZ.LJFF(i);
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final boolean LJI(Fragment fragment, Aweme aweme) {
        return this.LIZ.LJI(fragment, aweme);
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final GZP LJII() {
        return this.LIZ.LJII();
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final InterfaceC184277Lb LJIIIIZZ() {
        return this.LIZ.LJIIIIZZ();
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final InterfaceC54804Lf6 LJIIIZ(Context context) {
        return this.LIZ.LJIIIZ(context);
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final boolean LJIIJ() {
        return this.LIZ.LJIIJ();
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final boolean LJIIJJI() {
        return this.LIZ.LJIIJJI();
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final void LJIIL(ActivityC45651qj activityC45651qj, String enterFrom, Aweme aweme) {
        o.LJIIIZ(enterFrom, "enterFrom");
        this.LIZ.LJIIL(activityC45651qj, enterFrom, aweme);
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final InterfaceC55036Liq LJIILIIL() {
        return this.LIZ.LJIILIIL();
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final InterfaceC54401LWr LJIILJJIL() {
        return this.LIZ.LJIILJJIL();
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final MFL LJIILL() {
        return this.LIZ.LJIILL();
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final void LJIILLIIL(Video video, String str) {
        this.LIZ.LJIILLIIL(video, str);
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final InterfaceC182707Fa LJIIZILJ() {
        return this.LIZ.LJIIZILJ();
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final InterfaceC222068na LJIJ() {
        return this.LIZ.LJIJ();
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final boolean LJIJI() {
        return this.LIZ.LJIJI();
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final InterfaceC54392LWi LJIJJ() {
        return this.LIZ.LJIJJ();
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final void LJIJJLI(Aweme aweme, String aid) {
        o.LJIIIZ(aid, "aid");
        o.LJIIIZ(aweme, "aweme");
        this.LIZ.LJIJJLI(aweme, aid);
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final InterfaceC54795Lex LJIL() {
        return this.LIZ.LJIL();
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final void LJJ(String key) {
        o.LJIIIZ(key, "key");
        this.LIZ.LJJ(key);
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final void clear() {
        this.LIZ.clear();
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final int getTag() {
        return this.LIZ.getTag();
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final AbstractC73672Svk<SwitchToStoryResponse> switchStoryToNormal(String str) {
        return this.LIZ.switchStoryToNormal(str);
    }
}

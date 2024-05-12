package com.ss.android.ugc.aweme.story;

import X.AbstractC73672Svk;
import X.ActivityC45651qj;
import X.C215278cd;
import X.C221108m2;
import X.C54443LYh;
import X.C54796Ley;
import X.C54797Lez;
import X.C54798Lf0;
import X.C54799Lf1;
import X.C54800Lf2;
import X.C54801Lf3;
import X.C54802Lf4;
import X.C54803Lf5;
import X.C54832LfY;
import X.C62822Ol8;
import X.C7FY;
import X.GZP;
import X.InterfaceC182707Fa;
import X.InterfaceC184277Lb;
import X.InterfaceC222068na;
import X.InterfaceC54392LWi;
import X.InterfaceC54401LWr;
import X.InterfaceC54795Lex;
import X.InterfaceC54804Lf6;
import X.InterfaceC55036Liq;
import X.L24;
import X.LXX;
import X.MFL;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.services.story.EnterStoryParam;
import com.ss.android.ugc.aweme.story.inbox.IStoryInboxService;
import com.ss.android.ugc.aweme.story.model.SwitchToStoryResponse;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class StoryServiceDowngradeImpl implements IStoryService {
    public int LIZJ;
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(C54801Lf3.LJLIL);
    public final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C54802Lf4.LJLIL);
    public final C62822Ol8 LIZLLL = C221108m2.LIZIZ(C54803Lf5.LJLIL);

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final void LIZJ() {
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final void LIZLLL(Context context, EnterStoryParam enterStoryParam) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(enterStoryParam, "enterStoryParam");
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final boolean LJI(Fragment fragment, Aweme aweme) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final boolean LJIIJ() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final boolean LJIIJJI() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final void LJIIL(ActivityC45651qj activityC45651qj, String enterFrom, Aweme aweme) {
        o.LJIIIZ(enterFrom, "enterFrom");
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final InterfaceC55036Liq LJIILIIL() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final void LJIILLIIL(Video video, String str) {
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final boolean LJIJI() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final void LJIJJLI(Aweme aweme, String aid) {
        o.LJIIIZ(aid, "aid");
        o.LJIIIZ(aweme, "aweme");
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final void clear() {
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final IStoryInboxService LIZ() {
        return new C54832LfY();
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final L24 LJ() {
        return new C54798Lf0();
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final GZP LJII() {
        return (GZP) this.LIZLLL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final InterfaceC184277Lb LJIIIIZZ() {
        return new C54797Lez();
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final InterfaceC54401LWr LJIILJJIL() {
        return new LXX();
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final MFL LJIILL() {
        return new C54800Lf2();
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final InterfaceC182707Fa LJIIZILJ() {
        return (C7FY) this.LIZIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final InterfaceC222068na LJIJ() {
        return (C215278cd) this.LIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final InterfaceC54392LWi LJIJJ() {
        return new C54443LYh();
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final InterfaceC54795Lex LJIL() {
        return new C54796Ley();
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final int getTag() {
        return this.LIZJ;
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final Video LIZIZ(String creationId) {
        o.LJIIIZ(creationId, "creationId");
        return null;
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final void LJFF(int i) {
        this.LIZJ = i;
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final InterfaceC54804Lf6 LJIIIZ(Context context) {
        return new C54799Lf1();
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final void LJJ(String key) {
        o.LJIIIZ(key, "key");
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final AbstractC73672Svk<SwitchToStoryResponse> switchStoryToNormal(String str) {
        return AbstractC73672Svk.LJJIJIL(new SwitchToStoryResponse(null, null, 3, null));
    }
}

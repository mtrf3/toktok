package X;

import com.ss.android.ugc.aweme.story.IStoryService;
import com.ss.android.ugc.aweme.story.service.StoryServiceImpl;

/* renamed from: X.Gw8, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C43120Gw8 implements InterfaceC139745e6<IStoryService> {
    public IStoryService LJLIL;

    @Override // X.InterfaceC139745e6
    public final IStoryService get() {
        if (this.LJLIL == null) {
            this.LJLIL = StoryServiceImpl.LJJI();
        }
        return this.LJLIL;
    }
}

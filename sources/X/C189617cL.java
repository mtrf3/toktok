package X;

import com.ss.android.ugc.aweme.feed.api.FeedActionApi;
import com.ss.android.ugc.aweme.story.feed.common.StoryFeedViewModel;
import com.ss.android.ugc.aweme.story.feed.immersive.gallery.StoryGalleryListViewModel;
import fjb.a;
import kotlin.jvm.internal.AqS169S0100000_3;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.story.feed.immersive.gallery.StoryGalleryListViewModel$deleteSelectedStory$1", f = "StoryGalleryCoverListViewModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.7cL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C189617cL extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ StoryGalleryListViewModel LJLJI;
    public final /* synthetic */ String LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C189617cL(String str, StoryGalleryListViewModel storyGalleryListViewModel, String str2, InterfaceC67352kd<? super C189617cL> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = str;
        this.LJLJI = storyGalleryListViewModel;
        this.LJLJJI = str2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C189617cL c189617cL = new C189617cL(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
        c189617cL.LJLIL = obj;
        return c189617cL;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Object LIZ;
        C141335gf.LIZJ(obj);
        String str = this.LJLILLLLZI;
        StoryGalleryListViewModel storyGalleryListViewModel = this.LJLJI;
        String str2 = this.LJLJJI;
        try {
            FeedActionApi.LIZ(str);
            StoryFeedViewModel storyFeedViewModel = storyGalleryListViewModel.LJLJI;
            if (storyFeedViewModel != null) {
                C78857UxB.LJIIL(storyFeedViewModel.mv0(str2, str));
            }
            storyGalleryListViewModel.setState(new AqS169S0100000_3(storyGalleryListViewModel, 25));
            LIZ = C76800UCe.LIZ;
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        String str3 = this.LJLILLLLZI;
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
        if (m10exceptionOrNullimpl != null) {
            C189837ch.LIZIZ("StoryGalleryCoverListVM", "delete " + str3 + " fail", m10exceptionOrNullimpl);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

package X;

import android.view.SurfaceView;
import android.view.ViewGroup;
import com.bytedance.scene.navigation.NavigationScene;
import com.ss.android.ugc.gamora.editorpro.crop.VideoCropService;
import com.ss.ugc.android.editor.core.EditorProContext;

/* renamed from: X.55A, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C55A extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ EditorProContext LJLIL;
    public final /* synthetic */ SurfaceView LJLILLLLZI;
    public final /* synthetic */ ViewGroup LJLJI;
    public final /* synthetic */ VideoCropService LJLJJI;
    public final /* synthetic */ ActivityC45651qj LJLJJL;
    public final /* synthetic */ NavigationScene LJLJJLL;
    public final /* synthetic */ int LJLJL;
    public final /* synthetic */ ViewGroup.LayoutParams LJLJLJ;
    public final /* synthetic */ InterfaceC88472Yns<C50J, C76800UCe> LJLJLLL;
    public final /* synthetic */ long LJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C55A(EditorProContext editorProContext, SurfaceView surfaceView, ViewGroup viewGroup, VideoCropService videoCropService, ActivityC45651qj activityC45651qj, NavigationScene navigationScene, int i, ViewGroup.LayoutParams layoutParams, InterfaceC88472Yns<? super C50J, C76800UCe> interfaceC88472Yns, long j) {
        super(0);
        this.LJLIL = editorProContext;
        this.LJLILLLLZI = surfaceView;
        this.LJLJI = viewGroup;
        this.LJLJJI = videoCropService;
        this.LJLJJL = activityC45651qj;
        this.LJLJJLL = navigationScene;
        this.LJLJL = i;
        this.LJLJLJ = layoutParams;
        this.LJLJLLL = interfaceC88472Yns;
        this.LJLL = j;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.LJLIL.getNleSession().V8().LJJI();
        this.LJLILLLLZI.setVisibility(8);
        C16880lQ.LJLLL(this.LJLILLLLZI, this.LJLJI);
        this.LJLIL.getNleSession().V8().LJFF(this.LJLILLLLZI);
        VideoCropService videoCropService = this.LJLJJI;
        ActivityC45651qj activityC45651qj = this.LJLJJL;
        NavigationScene navigationScene = this.LJLJJLL;
        EditorProContext editorProContext = this.LJLIL;
        videoCropService.pushCropScene(activityC45651qj, navigationScene, editorProContext, new C55B(this.LJLILLLLZI, this.LJLJI, this.LJLJL, this.LJLJLJ, editorProContext, this.LJLJLLL, videoCropService, this.LJLL));
    }

    @Override // X.InterfaceC65784Pro
    public /* bridge */ /* synthetic */ C76800UCe invoke() {
        invoke2();
        return C76800UCe.LIZ;
    }
}

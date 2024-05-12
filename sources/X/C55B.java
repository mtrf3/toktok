package X;

import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.ss.android.ugc.gamora.editorpro.crop.VideoCropService;
import com.ss.ugc.android.editor.core.EditorProContext;
import defpackage.e1;
import kotlin.jvm.internal.AqS149S0200000_2;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.55B, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C55B extends AbstractC65781Prl implements InterfaceC88472Yns<C50J, C76800UCe> {
    public final /* synthetic */ SurfaceView LJLIL;
    public final /* synthetic */ ViewGroup LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ ViewGroup.LayoutParams LJLJJI;
    public final /* synthetic */ EditorProContext LJLJJL;
    public final /* synthetic */ InterfaceC88472Yns<C50J, C76800UCe> LJLJJLL;
    public final /* synthetic */ VideoCropService LJLJL;
    public final /* synthetic */ long LJLJLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C55B(SurfaceView surfaceView, ViewGroup viewGroup, int i, ViewGroup.LayoutParams layoutParams, EditorProContext editorProContext, InterfaceC88472Yns<? super C50J, C76800UCe> interfaceC88472Yns, VideoCropService videoCropService, long j) {
        super(1);
        this.LJLIL = surfaceView;
        this.LJLILLLLZI = viewGroup;
        this.LJLJI = i;
        this.LJLJJI = layoutParams;
        this.LJLJJL = editorProContext;
        this.LJLJJLL = interfaceC88472Yns;
        this.LJLJL = videoCropService;
        this.LJLJLJ = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.51A] */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C50J c50j) {
        ViewGroup viewGroup;
        ViewParent parent = this.LJLIL.getParent();
        if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
            C16880lQ.LJLLL(this.LJLIL, viewGroup);
        }
        this.LJLIL.setVisibility(0);
        this.LJLILLLLZI.addView(this.LJLIL, this.LJLJI, this.LJLJJI);
        InterfaceC127784zu player = this.LJLJJL.getPlayer();
        final EditorProContext editorProContext = this.LJLJJL;
        final VideoCropService videoCropService = this.LJLJL;
        player.ea(new InterfaceC132775Iz() { // from class: X.51A
            @Override // X.InterfaceC132775Iz
            public final void LIZ() {
                editorProContext.getPlayer().U9(this);
                videoCropService.isCropPanelShowing = false;
                int[] t5 = editorProContext.getPlayer().t5();
                if (t5 != null) {
                    EditorProContext editorProContext2 = editorProContext;
                    if (e1.LIZ(31744, "studio_nle_public_enable_hot_update", true, false)) {
                        C79012Uzg.LJFF(new AqS149S0200000_2(editorProContext2, t5, 56));
                    } else {
                        editorProContext2.getPlayer().LIZ(t5[0], t5[1], t5[2], t5[3]);
                    }
                }
                C79057V0z.LJJJJL(editorProContext, "show_preview_placeholder", Boolean.FALSE);
            }
        });
        final SurfaceView surfaceView = this.LJLIL;
        final AnonymousClass517 anonymousClass517 = new AnonymousClass517(this.LJLJJL, this.LJLJL, this.LJLJLJ);
        o.LJIIIZ(surfaceView, "<this>");
        surfaceView.getHolder().addCallback(new SurfaceHolder.Callback() { // from class: X.5JA
            @Override // android.view.SurfaceHolder.Callback
            public final void surfaceCreated(SurfaceHolder holder) {
                o.LJIIIZ(holder, "holder");
            }

            @Override // android.view.SurfaceHolder.Callback
            public final void surfaceDestroyed(SurfaceHolder holder) {
                o.LJIIIZ(holder, "holder");
            }

            @Override // android.view.SurfaceHolder.Callback
            public final void surfaceChanged(SurfaceHolder holder, int i, int i2, int i3) {
                o.LJIIIZ(holder, "holder");
                surfaceView.getHolder().removeCallback(this);
                C2VQ.LIZ(new AqS152S0100000_2(anonymousClass517, (InterfaceC65784Pro<C76800UCe>) 762));
            }
        });
        InterfaceC88472Yns<C50J, C76800UCe> interfaceC88472Yns = this.LJLJJLL;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(c50j);
        }
    }

    @Override // X.InterfaceC88472Yns
    public /* bridge */ /* synthetic */ C76800UCe invoke(C50J c50j) {
        invoke2(c50j);
        return C76800UCe.LIZ;
    }
}
